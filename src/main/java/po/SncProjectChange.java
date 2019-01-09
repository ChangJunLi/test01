package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "snc_project_change")
public class SncProjectChange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "project_id")
    private Long projectId;

    /**
     * 回复申请的ID
     */
    @Column(name = "parent_id")
    private Long parentId;

    private String title;

    /**
     * 审批人
     */
    private String approver;

    @Column(name = "approval_time")
    private Date approvalTime;

    /**
     * 申请人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最新回复时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 0待审批1审批通过2
     */
    private Integer status;

    private String content;

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
     * 获取回复申请的ID
     *
     * @return parent_id - 回复申请的ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置回复申请的ID
     *
     * @param parentId 回复申请的ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取审批人
     *
     * @return approver - 审批人
     */
    public String getApprover() {
        return approver;
    }

    /**
     * 设置审批人
     *
     * @param approver 审批人
     */
    public void setApprover(String approver) {
        this.approver = approver;
    }

    /**
     * @return approval_time
     */
    public Date getApprovalTime() {
        return approvalTime;
    }

    /**
     * @param approvalTime
     */
    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    /**
     * 获取申请人
     *
     * @return creator - 申请人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置申请人
     *
     * @param creator 申请人
     */
    public void setCreator(String creator) {
        this.creator = creator;
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
     * 获取最新回复时间
     *
     * @return update_time - 最新回复时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置最新回复时间
     *
     * @param updateTime 最新回复时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取0待审批1审批通过2
     *
     * @return status - 0待审批1审批通过2
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0待审批1审批通过2
     *
     * @param status 0待审批1审批通过2
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}