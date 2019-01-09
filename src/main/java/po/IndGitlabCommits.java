package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ind_gitlab_commits")
public class IndGitlabCommits {
    /**
     * 主键id，与gitlab的commitId一致
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 所属项目表id
     */
    @Column(name = "project_id")
    private String projectId;

    /**
     * 所属项目名
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 标题
     */
    private String title;

    /**
     * 提交信息
     */
    private String message;

    /**
     * 提交人名称
     */
    @Column(name = "author_name")
    private String authorName;

    /**
     * 提交人邮箱
     */
    @Column(name = "author_email")
    private String authorEmail;

    /**
     * 信息创建时间
     */
    @Column(name = "created_at")
    private Date createdAt;

    /**
     * 提交时间
     */
    @Column(name = "committed_date")
    private Date committedDate;

    /**
     * 编写时间
     */
    @Column(name = "authored_date")
    private Date authoredDate;

    /**
     * 父id
     */
    @Column(name = "parent_ids")
    private String parentIds;

    /**
     * 获取主键id，与gitlab的commitId一致
     *
     * @return id - 主键id，与gitlab的commitId一致
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id，与gitlab的commitId一致
     *
     * @param id 主键id，与gitlab的commitId一致
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取所属项目表id
     *
     * @return project_id - 所属项目表id
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 设置所属项目表id
     *
     * @param projectId 所属项目表id
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取所属项目名
     *
     * @return project_name - 所属项目名
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置所属项目名
     *
     * @param projectName 所属项目名
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取提交信息
     *
     * @return message - 提交信息
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置提交信息
     *
     * @param message 提交信息
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 获取提交人名称
     *
     * @return author_name - 提交人名称
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * 设置提交人名称
     *
     * @param authorName 提交人名称
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * 获取提交人邮箱
     *
     * @return author_email - 提交人邮箱
     */
    public String getAuthorEmail() {
        return authorEmail;
    }

    /**
     * 设置提交人邮箱
     *
     * @param authorEmail 提交人邮箱
     */
    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    /**
     * 获取信息创建时间
     *
     * @return created_at - 信息创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置信息创建时间
     *
     * @param createdAt 信息创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取提交时间
     *
     * @return committed_date - 提交时间
     */
    public Date getCommittedDate() {
        return committedDate;
    }

    /**
     * 设置提交时间
     *
     * @param committedDate 提交时间
     */
    public void setCommittedDate(Date committedDate) {
        this.committedDate = committedDate;
    }

    /**
     * 获取编写时间
     *
     * @return authored_date - 编写时间
     */
    public Date getAuthoredDate() {
        return authoredDate;
    }

    /**
     * 设置编写时间
     *
     * @param authoredDate 编写时间
     */
    public void setAuthoredDate(Date authoredDate) {
        this.authoredDate = authoredDate;
    }

    /**
     * 获取父id
     *
     * @return parent_ids - 父id
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * 设置父id
     *
     * @param parentIds 父id
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }
}