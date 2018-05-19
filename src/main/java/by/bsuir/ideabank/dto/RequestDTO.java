package by.bsuir.ideabank.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestDTO {

    private Long id;
    private UserDTO user;
    private Integer status;
    private LocalDate dateCreated;
    private String questionFio;
    private String questionAge;
    private String questionAddress;
    private String questionPhone;
    private String questionEmail;
    private String questionReason;
    private String questionArea;
    private String questionUnique;
    private String questionTerm;
    private String questionMoney;
    private String questionSupport;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getQuestionFio() {
        return questionFio;
    }

    public void setQuestionFio(String questionFio) {
        this.questionFio = questionFio;
    }

    public String getQuestionAge() {
        return questionAge;
    }

    public void setQuestionAge(String questionAge) {
        this.questionAge = questionAge;
    }

    public String getQuestionAddress() {
        return questionAddress;
    }

    public void setQuestionAddress(String questionAddress) {
        this.questionAddress = questionAddress;
    }

    public String getQuestionPhone() {
        return questionPhone;
    }

    public void setQuestionPhone(String questionPhone) {
        this.questionPhone = questionPhone;
    }

    public String getQuestionEmail() {
        return questionEmail;
    }

    public void setQuestionEmail(String questionEmail) {
        this.questionEmail = questionEmail;
    }

    public String getQuestionReason() {
        return questionReason;
    }

    public void setQuestionReason(String questionReason) {
        this.questionReason = questionReason;
    }

    public String getQuestionArea() {
        return questionArea;
    }

    public void setQuestionArea(String questionArea) {
        this.questionArea = questionArea;
    }

    public String getQuestionUnique() {
        return questionUnique;
    }

    public void setQuestionUnique(String questionUnique) {
        this.questionUnique = questionUnique;
    }

    public String getQuestionTerm() {
        return questionTerm;
    }

    public void setQuestionTerm(String questionTerm) {
        this.questionTerm = questionTerm;
    }

    public String getQuestionMoney() {
        return questionMoney;
    }

    public void setQuestionMoney(String questionMoney) {
        this.questionMoney = questionMoney;
    }

    public String getQuestionSupport() {
        return questionSupport;
    }

    public void setQuestionSupport(String questionSupport) {
        this.questionSupport = questionSupport;
    }
}
