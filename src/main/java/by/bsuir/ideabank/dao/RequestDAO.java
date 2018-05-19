package by.bsuir.ideabank.dao;

import by.bsuir.ideabank.entity.Request;

import java.util.List;

public interface RequestDAO {
    List<Request> getAllRequests();
    List<Request> getRequestsByUserId(Long userId);
    Request getRequestById(Long requestId);
    Request createRequest(Request request);
    Request updateRequest(Request request);
}
