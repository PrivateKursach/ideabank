package by.bsuir.ideabank.converter.impl;

import by.bsuir.ideabank.converter.RequestConverter;
import by.bsuir.ideabank.converter.UserConverter;
import by.bsuir.ideabank.dto.RequestDTO;
import by.bsuir.ideabank.entity.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class RequestConverterImpl implements RequestConverter {

    @Autowired
    private UserConverter userConverter;

    @Override
    public RequestDTO convertToDTO(Request request) {
        RequestDTO requestDTO = new RequestDTO();
        requestDTO.setId(request.getId());
        requestDTO.setUser(userConverter.convertToDTO(request.getUser()));
        requestDTO.setStatus(request.getStatus());
        requestDTO.setDateCreated(request.getDateCreated());
        requestDTO.setQuestionFio(request.getQuestionFio());
        requestDTO.setQuestionAge(request.getQuestionAge());
        requestDTO.setQuestionAddress(request.getQuestionAddress());
        requestDTO.setQuestionPhone(request.getQuestionPhone());
        requestDTO.setQuestionEmail(request.getQuestionEmail());
        requestDTO.setQuestionReason(request.getQuestionReason());
        requestDTO.setQuestionArea(request.getQuestionArea());
        requestDTO.setQuestionUnique(request.getQuestionUnique());
        requestDTO.setQuestionTerm(request.getQuestionTerm());
        requestDTO.setQuestionMoney(request.getQuestionMoney());
        requestDTO.setQuestionSupport(request.getQuestionSupport());
        return requestDTO;
    }

    @Override
    public Request convertToEntity(RequestDTO requestDTO) {
        Request request = new Request();
        request.setId(requestDTO.getId());
        request.setUser(userConverter.convertToEntity(requestDTO.getUser()));
        request.setStatus(requestDTO.getStatus());
        request.setDateCreated(requestDTO.getDateCreated());
        request.setQuestionFio(requestDTO.getQuestionFio());
        request.setQuestionAge(requestDTO.getQuestionAge());
        request.setQuestionAddress(requestDTO.getQuestionAddress());
        request.setQuestionPhone(requestDTO.getQuestionPhone());
        request.setQuestionEmail(requestDTO.getQuestionEmail());
        request.setQuestionReason(requestDTO.getQuestionReason());
        request.setQuestionArea(requestDTO.getQuestionArea());
        request.setQuestionUnique(requestDTO.getQuestionUnique());
        request.setQuestionTerm(requestDTO.getQuestionTerm());
        request.setQuestionMoney(requestDTO.getQuestionMoney());
        request.setQuestionSupport(requestDTO.getQuestionSupport());
        return request;
    }

    @Override
    public List<RequestDTO> convertToDTOList(List<Request> requests) {
        List<RequestDTO> requestDTOList = new ArrayList<>(requests.size());
        requestDTOList.addAll(requests.stream().map(this::convertToDTO).collect(Collectors.toList()));
        return requestDTOList;
    }
}
