package org.thaoscoffee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.thaoscoffee.model.Coffee;

@Repository
public class CoffeeDAOImpl implements CoffeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(Coffee t) {
		sessionFactory.getCurrentSession().persist(t);

	}

	@Override
	public void edit(Coffee t) {
		sessionFactory.getCurrentSession().update(t);

	}

	@Override
	public void delete(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Coffee coffee = (Coffee) session.load(Coffee.class, id);
		if (coffee != null) {
			session.delete(coffee);
		}

	}

	@Override
	public Coffee findByID(Integer id) {
		return (Coffee) sessionFactory.getCurrentSession().get(Coffee.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Coffee> findAll() {
		return (List<Coffee>) sessionFactory.getCurrentSession().createQuery("from Coffee").list();
	}

}
