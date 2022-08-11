package dao;

import java.util.List;

public interface Dao<T>{

	public void add(T obj);
	public void update(T obj);
	public List<T> list();
	public T getById(int id);
	public void remove(int id);
}
