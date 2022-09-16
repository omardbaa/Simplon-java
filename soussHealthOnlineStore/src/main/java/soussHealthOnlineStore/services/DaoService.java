package soussHealthOnlineStore.services;

import java.util.List;

import soussHealthOnlineStore.entities.Users;


public interface DaoService <T>{

	
	public void save(T obj);
	
	public void update(T obj);

	public void delete(Long id);	
	
	public T findById(Long id); 
	
	public List<T> getAll();

	
}
