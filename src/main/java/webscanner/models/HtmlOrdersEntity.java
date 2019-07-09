package webscanner.models;

import javax.persistence.*;

@Entity
@Table(name = "HtmlOrders", schema = "public", catalog = "webscanner")
public class HtmlOrdersEntity {
    private int id;
    private int frequency;
    private String targetAddress;
    private String subjectOfQuestion;

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Frequency", nullable = false)
    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Basic
    @Column(name = "TargetAddress", nullable = true, length = -1)
    public String getTargetAddress() {
        return targetAddress;
    }

    public void setTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress;
    }

    @Basic
    @Column(name = "SubjectOfQuestion", nullable = true, length = -1)
    public String getSubjectOfQuestion() {
        return subjectOfQuestion;
    }

    public void setSubjectOfQuestion(String subjectOfQuestion) {
        this.subjectOfQuestion = subjectOfQuestion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HtmlOrdersEntity that = (HtmlOrdersEntity) o;

        if (id != that.id) return false;
        if (frequency != that.frequency) return false;
        if (targetAddress != null ? !targetAddress.equals(that.targetAddress) : that.targetAddress != null)
            return false;
        if (subjectOfQuestion != null ? !subjectOfQuestion.equals(that.subjectOfQuestion) : that.subjectOfQuestion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + frequency;
        result = 31 * result + (targetAddress != null ? targetAddress.hashCode() : 0);
        result = 31 * result + (subjectOfQuestion != null ? subjectOfQuestion.hashCode() : 0);
        return result;
    }
}
