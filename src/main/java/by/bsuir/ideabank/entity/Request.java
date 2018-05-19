package by.bsuir.ideabank.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ib_request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "status")
    private Integer status;
    @Column(name = "date_created")
    private LocalDate dateCreated;
    @Column(name = "question1_fio")
    private String questionFio;
    @Column(name = "question2_age")
    private String questionAge;
    @Column(name = "question3_address")
    private String questionAddress;
    @Column(name = "question4_phone")
    private String questionPhone;
    @Column(name = "question5_email")
    private String questionEmail;
    @Column(name = "question6_reason")
    private String questionReason;
    @Column(name = "question7_area")
    private String questionArea;
    @Column(name = "question8_unique")
    private String questionUnique;
    @Column(name = "question9_term")
    private String questionTerm;
    @Column(name = "question10_money")
    private String questionMoney;
    @Column(name = "question11_support")
    private String questionSupport;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Request request = (Request) o;

        return id != null ? id.equals(request.id) : request.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
