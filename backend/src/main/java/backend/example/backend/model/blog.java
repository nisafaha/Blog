package backend.example.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "blog")
public class blog {

    @Id
    @Column(name = "blog_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer blogId;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    @Column(name = "status")
    private boolean status;

    public Integer getBlogId() {
        return blogId;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public boolean isStatus() {
        return status;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public blog() {
    }

    public blog(Integer blogId, String title, String body, boolean status) {
        this.blogId = blogId;
        this.title = title;
        this.body = body;
        this.status = status;
    }

    public blog(String title, String body, boolean status) {
        this.title = title;
        this.body = body;
        this.status = status;
    }
}
