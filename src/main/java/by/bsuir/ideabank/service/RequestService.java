package by.bsuir.ideabank.service;

import by.bsuir.ideabank.entity.Request;

import java.util.List;

public interface RequestService {
    List<Request> getAllRequests();
    List<Request> getRequestsByUserId(Long userId);
    Request getRequestById(Long id);
    Request createRequest(Request request);
    Request updateRequest(Request request);
}
