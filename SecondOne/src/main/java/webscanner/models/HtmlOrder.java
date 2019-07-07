package webscanner.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class HtmlOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    private int frequency;
    private String targetAddress;
    private String SubjectOfQuestion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getTargetAddress() {
        return targetAddress;
    }

    public void setTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress;
    }

    public String getSubjectOfQuestion() {
        return SubjectOfQuestion;
    }

    public void setSubjectOfQuestion(String subjectOfQuestion) {
        SubjectOfQuestion = subjectOfQuestion;
    }
}
