/**
 * 
 */
package net.sf.ssi.service;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author zhangyj
 * @version 0.1, 2011-5-25 上午10:24:35
 *
 */
//@Transactional
public interface IUserService<T> {
	 public T getInfoByKey(String key) throws DataAccessException;
}