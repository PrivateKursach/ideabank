package by.bsuir.ideabank.converter;

import by.bsuir.ideabank.dto.RequestDTO;
import by.bsuir.ideabank.entity.Request;

import java.util.List;

public interface RequestConverter {
    RequestDTO convertToDTO(Request request);
    Request convertToEntity(RequestDTO requestDTO);
    List<RequestDTO> convertToDTOList(List<Request> requests);
}
