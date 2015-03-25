package ca.rhythmtech.lab09.jpa.data;

import ca.rhythmtech.lab09.jpa.entity.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 * Facade EJB for the Employees from the database
 */
@Stateless
public class EmployeeFacade {
//   @PersistenceContext(name = "EmployeePU")
    private static final String PERSISTENCE_UNIT = "EmployeePU";
    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;

    /**
     * Default ctor
     */
    public EmployeeFacade() {
        entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        entityManager = entityManagerFactory.createEntityManager();
    }

    public Employee getEmployeeById( String id ) {
        Employee emp = entityManager.createNamedQuery("Employee.getEmployeeById", Employee.class)
                .setParameter("id", id).getSingleResult();

        return emp;
    }


}
