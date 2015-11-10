/**
 * 
 */
package com.dtweb.converter;

/**
 * @author Thong
 * generic converter interface.
 *
 */
public interface BaseConverter<Entity, DTO> {
	
	/**
	 * convert 
	 * @param aFromObject
	 * @return
	 */
	public Entity convertFromDTO (DTO dto );
	
	public DTO convertToDTO (Entity entity );
	

}
