package office_management.dao;


import office_management.model.Office;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OfficeDaoImpl implements OfficeDao{
    private static final Logger logger = LoggerFactory.getLogger(OfficeDaoImpl.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addOffice(Office office) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(office);
        logger.info("Office successfully saved. Office details: " + office);

    }

    @Override
    public void updateOffice(Office office) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(office);
        logger.info("Office successfully update. Office details: " + office);

    }

    @Override
    public void removeOffice(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Office office = (Office) session.load(Office.class, new Integer(id));

        if (office != null){
            session.delete(office);
        }
        logger.info("Office successfully deleted. Office details: " + office);

    }

    @Override
    public Office getOfficeById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Office office = (Office) session.load(Office.class, new Integer(id));
        logger.info("Office succesfully loaded. Office details: " + office);

        return office;
    }

    @Override
    @SuppressWarnings(value = "uncheked")
    public List<Office> listOffice() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Office> officeList = session.createQuery("from Office").list();
        for (Office office : officeList){
            logger.info("Office list: " + office);
        }

        return officeList;
    }
}
