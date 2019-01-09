package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ind_gitlab_projects_copy1")
public class IndGitlabProjectsCopy1 {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * gitlab的项目id
     */
    @Column(name = "project_id")
    private Long projectId;

    /**
     * 项目名
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 项目描述
     */
    private String description;

    /**
     * 默认分支
     */
    @Column(name = "default_branch")
    private String defaultBranch;

    /**
     * 命名空间id
     */
    @Column(name = "namespace_id")
    private Long namespaceId;

    /**
     * 命名空间名称
     */
    @Column(name = "namespace_name")
    private String namespaceName;

    /**
     * 项目路径
     */
    private String path;

    /**
     * ssh的url
     */
    @Column(name = "ssh_url")
    private String sshUrl;

    /**
     * web的url
     */
    @Column(name = "web_url")
    private String webUrl;

    /**
     * http的url
     */
    @Column(name = "http_url")
    private String httpUrl;

    /**
     * 可见性
     */
    private String visibility;

    /**
     * gitlab项目创建者id
     */
    @Column(name = "creator_id")
    private Long creatorId;

    /**
     * gitlab项目创建时间
     */
    @Column(name = "created_at")
    private Date createdAt;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取gitlab的项目id
     *
     * @return project_id - gitlab的项目id
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * 设置gitlab的项目id
     *
     * @param projectId gitlab的项目id
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取项目名
     *
     * @return project_name - 项目名
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置项目名
     *
     * @param projectName 项目名
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取项目描述
     *
     * @return description - 项目描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置项目描述
     *
     * @param description 项目描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取默认分支
     *
     * @return default_branch - 默认分支
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    /**
     * 设置默认分支
     *
     * @param defaultBranch 默认分支
     */
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    /**
     * 获取命名空间id
     *
     * @return namespace_id - 命名空间id
     */
    public Long getNamespaceId() {
        return namespaceId;
    }

    /**
     * 设置命名空间id
     *
     * @param namespaceId 命名空间id
     */
    public void setNamespaceId(Long namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * 获取命名空间名称
     *
     * @return namespace_name - 命名空间名称
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /**
     * 设置命名空间名称
     *
     * @param namespaceName 命名空间名称
     */
    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * 获取项目路径
     *
     * @return path - 项目路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置项目路径
     *
     * @param path 项目路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取ssh的url
     *
     * @return ssh_url - ssh的url
     */
    public String getSshUrl() {
        return sshUrl;
    }

    /**
     * 设置ssh的url
     *
     * @param sshUrl ssh的url
     */
    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    /**
     * 获取web的url
     *
     * @return web_url - web的url
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * 设置web的url
     *
     * @param webUrl web的url
     */
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    /**
     * 获取http的url
     *
     * @return http_url - http的url
     */
    public String getHttpUrl() {
        return httpUrl;
    }

    /**
     * 设置http的url
     *
     * @param httpUrl http的url
     */
    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

    /**
     * 获取可见性
     *
     * @return visibility - 可见性
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * 设置可见性
     *
     * @param visibility 可见性
     */
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * 获取gitlab项目创建者id
     *
     * @return creator_id - gitlab项目创建者id
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * 设置gitlab项目创建者id
     *
     * @param creatorId gitlab项目创建者id
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取gitlab项目创建时间
     *
     * @return created_at - gitlab项目创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置gitlab项目创建时间
     *
     * @param createdAt gitlab项目创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}