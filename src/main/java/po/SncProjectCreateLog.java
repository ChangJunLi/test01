package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "snc_project_create_log")
public class SncProjectCreateLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "apply_id")
    private Long applyId;

    @Column(name = "project_id")
    private Long projectId;

    /**
     * platform,git,jenkins,sonar,nexus,harbor_test,harbor_prod,k8s_test,k8s_prod
     */
    @Column(name = "tool_type")
    private String toolType;

    /**
     * 0失败1成功
     */
    private Integer created;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 记录创建的账号密码或者token
     */
    private String result;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return apply_id
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * @param applyId
     */
    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    /**
     * @return project_id
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取platform,git,jenkins,sonar,nexus,harbor_test,harbor_prod,k8s_test,k8s_prod
     *
     * @return tool_type - platform,git,jenkins,sonar,nexus,harbor_test,harbor_prod,k8s_test,k8s_prod
     */
    public String getToolType() {
        return toolType;
    }

    /**
     * 设置platform,git,jenkins,sonar,nexus,harbor_test,harbor_prod,k8s_test,k8s_prod
     *
     * @param toolType platform,git,jenkins,sonar,nexus,harbor_test,harbor_prod,k8s_test,k8s_prod
     */
    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    /**
     * 获取0失败1成功
     *
     * @return created - 0失败1成功
     */
    public Integer getCreated() {
        return created;
    }

    /**
     * 设置0失败1成功
     *
     * @param created 0失败1成功
     */
    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取记录创建的账号密码或者token
     *
     * @return result - 记录创建的账号密码或者token
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置记录创建的账号密码或者token
     *
     * @param result 记录创建的账号密码或者token
     */
    public void setResult(String result) {
        this.result = result;
    }
}