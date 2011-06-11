/**
 * 
 */
package net.sf.ssi.mapper;

import java.util.List;

/**
 * 
 * @author zhangyj
 * @version 0.1, 2011-5-25 上午10:06:09
 * @param <T>
 *
 */
public interface SqlMapper<T> {
	/**
	 * 根据主键获取实体信息
	 */
	public T getInfoByKey(String key);
	/**
	 * 持久化实体 
	 */
	public void saveEntity(T entity);
	/**
	 * 获取全部实体
	 */
	public List<T> findAll();
	/**
	 * 删除实体
	 */
	public void removeEntity(String key);
	/**
	 * 更新实体
	 */
	public void updateEntity(T entity);
}
