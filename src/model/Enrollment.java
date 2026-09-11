package model;

import java.time.LocalDateTime;

public class Enrollment {
    private Long id;
    private Long courseId;
    private Long userId;
    private LocalDateTime enrolledAt;
    private Status status;

    public enum Status {
        ACTIVE, DROPPED
    }

    public Enrollment() {
    }

    public Enrollment(Long id, Long courseId, Long userId, LocalDateTime enrolledAt, Status status) {
        this.id = id;
        this.courseId = courseId;
        this.userId = userId;
        this.enrolledAt = enrolledAt;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getEnrolledAt() {
        return enrolledAt;
    }

    public void setEnrolledAt(LocalDateTime enrolledAt) {
        this.enrolledAt = enrolledAt;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
