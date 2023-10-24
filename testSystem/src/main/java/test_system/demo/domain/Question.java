package test_system.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author 邰子昊
 * @version 1.0
 */
public class Question {
    String title;
    String type;
    String analysis;
    String answer;
    @JsonFormat(shape =JsonFormat.Shape.STRING )
    Long id;
    String option;

    @Override
    public String toString() {
        return "Question{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", analysis='" + analysis + '\'' +
                ", answer='" + answer + '\'' +
                ", id=" + id +
                ", option='" + option + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public Question() {
    }
}
