package by.bsuir.ideabank.dao.impl;

import by.bsuir.ideabank.dao.RequestDAO;
import by.bsuir.ideabank.entity.Request;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class RequestDAOImpl implements RequestDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Request> getAllRequests() {
        TypedQuery<Request> query = entityManager.createQuery("select r from Request r", Request.class);
        return query.getResultList();
    }

    @Override
    public List<Request> getRequestsByUserId(Long userId) {
        TypedQuery<Request> query = entityManager.createQuery(
                "select r from Request r where r.user.id = :userId", Request.class);
        return query.setParameter("userId", userId).getResultList();
    }

    @Override
    public Request getRequestById(Long requestId) {
        return entityManager.find(Request.class, requestId);
    }

    @Override
    public Request createRequest(Request request) {
        entityManager.persist(request);
        return request;
    }

    @Override
    public Request updateRequest(Request request) {
        return entityManager.merge(request);
    }
}
