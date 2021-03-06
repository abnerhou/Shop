package test.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import test.entity.User;

@Component
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    public List<User> getAllUser() {
        String hsql="from USER";
        Session session = getSessionFactory().getCurrentSession();
        Query query = session.createQuery(hsql);
        
        return query.list();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
