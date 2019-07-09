package webscanner.models;

import javax.persistence.*;

@Entity
@Table(name = "ServerOrders", schema = "public", catalog = "webscanner")
public class ServerOrder {
    private int id;
    private int frequency;
    private String targetAddress;
    private String question;

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
    @Column(name = "Question", nullable = true, length = -1)
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServerOrder that = (ServerOrder) o;

        if (id != that.id) return false;
        if (frequency != that.frequency) return false;
        if (targetAddress != null ? !targetAddress.equals(that.targetAddress) : that.targetAddress != null)
            return false;
        if (question != null ? !question.equals(that.question) : that.question != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + frequency;
        result = 31 * result + (targetAddress != null ? targetAddress.hashCode() : 0);
        result = 31 * result + (question != null ? question.hashCode() : 0);
        return result;
    }
}
