package com.dtweb.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dtweb.dto.CartDTO;
import com.dtweb.model.CommentProduct;
import com.dtweb.model.Menu;
import com.dtweb.model.Product;
import com.dtweb.services.ConfigSysService;
import com.dtweb.services.MenuService;
import com.dtweb.services.ProductService;


@Controller
@SessionAttributes("mapSession")
public class HomeController {
	
	public static final String MAP_SESSION="mapSession";
	public static final String MENU="menu";
	public static final String OWNER="owner";
	public static final String ADDRESS="address";
	public static final String HOTLINE="hotline";
	
	@Autowired
	ProductService productService;
	
	@Autowired
	MenuService menuService;
	
	@Autowired
	ConfigSysService configService;
	
	
	
	@RequestMapping(value="/")
	public String index(Model model){
		Map<String,Object> mapSession=new HashMap<String, Object>();		
		model.addAttribute("listProduct", productService.getAllProductDTO());		
		mapSession.put(MENU, menuService.getMenu());
		
		Map<String,String> mapConfig=configService.getConfig();
		
		mapSession.put(OWNER, mapConfig.get(OWNER));
		mapSession.put(ADDRESS, mapConfig.get(ADDRESS));
		mapSession.put(HOTLINE, mapConfig.get(HOTLINE));
		
		
		model.addAttribute(MAP_SESSION, mapSession);
		return "index";
	}
//	
//	@RequestMapping(value="/show")
//	public String show(Model map){
//		map.addAttribute("list", personService.list());
//		return "showList";
//	}
//	
//	@RequestMapping(value="/add", method=RequestMethod.POST)
//	public String add(@ModelAttribute("person") Person person){
//		personService.save(person);
//		return "redirect:/show";
//	}
//	
//	@RequestMapping(value="/remove/{id}")
//	public String remove(@PathVariable("id") int id){
//		personService.remove(id);
//		return "redirect:/show";
//	}
//	
	@RequestMapping(value="/product/detail/{id}")
	public String showEdit(@PathVariable("id") int id,Model model){
		
		model.addAttribute("product", productService.getProductById(id));
		
		return "detail";
	}
	
	@RequestMapping(value="/product/like/{id}", method=RequestMethod.GET)
	public @ResponseBody String likeProduct(@PathVariable("id") int id,Model model){
		String data=null;
		List<Menu> listM=(List<Menu>)menuService.getMenu();
		Menu m=listM.get(1);
		Product p=productService.likeProduct(id);				
		data=p.getAmountLike()+"";		
		return data;
	}
	
	@RequestMapping(value="/product/comment/{id}", method=RequestMethod.GET)
	public @ResponseBody List<CommentProduct> commentProduct(@PathVariable("id") int id,@RequestParam("name") String name,
			@RequestParam("email") String email,@RequestParam("content") String content,Model model){
		
		List<CommentProduct> data=new ArrayList<CommentProduct>();
		
		data=productService.commentProduct(id, name, email, content);
		for(CommentProduct cp:data){
			cp.setProduct(null);
		}
		return data;
	}
//	@RequestMapping(value="/edit", method=RequestMethod.POST)
//	public String edit(@ModelAttribute("person") Person person){
//		personService.update(person);
//		return "redirect:/show";
//	}
//	
//	public void setPersonService(PersonService personService) {
//		this.personService = personService;
//	}

	@RequestMapping(value="product/search", method=RequestMethod.GET)
	public String searchProduct(@RequestParam("key")String key, Model model){
		String url="search";
		model.addAttribute("listProduct", productService.searchProduct(key));
		return url;
	}
	@RequestMapping(value="product/showCategory", method=RequestMethod.GET)
	public String showProductCategory(@RequestParam("cateId")String cateId, Model model){
		String url="showCate";
		
		try{
			
			model.addAttribute("listProduct", productService.getProductByCate(Integer.parseInt(cateId)));
		}catch(NumberFormatException ex){
			System.out.println("Loi category");
		}
		
		return url;
	}
	
	
	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
}
