package stcManager.model.services;

import java.util.List;


public interface DaoService <T>{

	
	public void saveOrUpdate(T obj);

	public void delete(Long id);	
	
	public T findById(Long id); 
	
	public List<T> getAll();
	
}
