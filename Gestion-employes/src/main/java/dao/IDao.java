package dao;

import java.util.List;

public interface IDao<T> {
	void save(T t);
	T show(Long id);
	void delete(Long id);
	List<T> findX();

}
