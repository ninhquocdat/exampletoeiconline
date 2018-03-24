package vn.myclass.core.persistence.entity;

import javax.persistence.*;

/**
 * Created by Admin on 4/6/2017.
 */
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @Column(name = "content")
    private String content;

    @Column(name = "createddate")
    private String createdDate;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User userEntity;

    @ManyToOne
    @JoinColumn(name = "listenguidelineid")
    private ListenGuideline listenGuidelineEntity;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(User userEntity) {
        this.userEntity = userEntity;
    }

    public ListenGuideline getListenGuidelineEntity() {
        return listenGuidelineEntity;
    }

    public void setListenGuidelineEntity(ListenGuideline listenGuidelineEntity) {
        this.listenGuidelineEntity = listenGuidelineEntity;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
