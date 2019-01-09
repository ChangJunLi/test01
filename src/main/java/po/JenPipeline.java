package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "jen_pipeline")
public class JenPipeline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 流水线名字
     */
    @Column(name = "pipeline_name")
    private String pipelineName;

    /**
     * 所属项目id
     */
    @Column(name = "project_id")
    private Long projectId;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后修改人
     */
    @Column(name = "last_modified_by")
    private String lastModifiedBy;

    /**
     * 最后修改时间
     */
    @Column(name = "last_modified_time")
    private Date lastModifiedTime;

    /**
     * 最进一次执行时间
     */
    @Column(name = "last_start_time")
    private Date lastStartTime;

    /**
     * 最近一次执行状态码:0未执行(默认),1执行中,2执行完成
     */
    @Column(name = "last_status")
    private String lastStatus;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 流水线json格式数据
     */
    @Column(name = "pipeline_list")
    private String pipelineList;

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
     * 获取流水线名字
     *
     * @return pipeline_name - 流水线名字
     */
    public String getPipelineName() {
        return pipelineName;
    }

    /**
     * 设置流水线名字
     *
     * @param pipelineName 流水线名字
     */
    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * 获取所属项目id
     *
     * @return project_id - 所属项目id
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * 设置所属项目id
     *
     * @param projectId 所属项目id
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取创建人
     *
     * @return created_by - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
     * 获取最后修改人
     *
     * @return last_modified_by - 最后修改人
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * 设置最后修改人
     *
     * @param lastModifiedBy 最后修改人
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * 获取最后修改时间
     *
     * @return last_modified_time - 最后修改时间
     */
    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param lastModifiedTime 最后修改时间
     */
    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * 获取最进一次执行时间
     *
     * @return last_start_time - 最进一次执行时间
     */
    public Date getLastStartTime() {
        return lastStartTime;
    }

    /**
     * 设置最进一次执行时间
     *
     * @param lastStartTime 最进一次执行时间
     */
    public void setLastStartTime(Date lastStartTime) {
        this.lastStartTime = lastStartTime;
    }

    /**
     * 获取最近一次执行状态码:0未执行(默认),1执行中,2执行完成
     *
     * @return last_status - 最近一次执行状态码:0未执行(默认),1执行中,2执行完成
     */
    public String getLastStatus() {
        return lastStatus;
    }

    /**
     * 设置最近一次执行状态码:0未执行(默认),1执行中,2执行完成
     *
     * @param lastStatus 最近一次执行状态码:0未执行(默认),1执行中,2执行完成
     */
    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * 获取操作人
     *
     * @return operator - 操作人
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作人
     *
     * @param operator 操作人
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 获取流水线json格式数据
     *
     * @return pipeline_list - 流水线json格式数据
     */
    public String getPipelineList() {
        return pipelineList;
    }

    /**
     * 设置流水线json格式数据
     *
     * @param pipelineList 流水线json格式数据
     */
    public void setPipelineList(String pipelineList) {
        this.pipelineList = pipelineList;
    }
}