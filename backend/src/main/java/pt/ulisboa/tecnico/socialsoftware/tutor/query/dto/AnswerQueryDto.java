package pt.ulisboa.tecnico.socialsoftware.tutor.query.dto;

import pt.ulisboa.tecnico.socialsoftware.tutor.query.domain.AnswerQuery;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;

public class AnswerQueryDto implements Serializable {
    private Integer id;
    private Integer key;
    private String content;
    private String creationDate = null;

    public AnswerQueryDto() {
    }

    public AnswerQueryDto(AnswerQuery answerQuery) {
        this.id = answerQuery.getId();
        this.key = answerQuery.getKey();
        this.content = answerQuery.getContent();

        if (answerQuery.getCreationDate() != null)
            this.creationDate = answerQuery.getCreationDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public Integer getKey() { return key; }

    public void setKey(Integer key) { this.key = key; }

    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }

    public String getCreationDate() { return creationDate; }

    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }

    @Override
    public String toString() {
        return "AnswerQueryDto{" +
                "id=" + id +
                ", key=" + key +
                ", content='" + content + '\'' +
                ", creationDate='" + creationDate + '\'' +
                '}';
    }
}