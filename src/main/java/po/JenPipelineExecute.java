package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "jen_pipeline_execute")
public class JenPipelineExecute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * pipelineId
     */
    @Column(name = "pipeline_id")
    private Long pipelineId;

    /**
     * projectId
     */
    @Column(name = "project_id")
    private Long projectId;

    /**
     * 构建NO
     */
    @Column(name = "build_no")
    private Integer buildNo;

    /**
     * 0执行中1成功2失败
     */
    private String status;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    /**
     * 0自动触发1手动触发
     */
    @Column(name = "start_type")
    private String startType;

    /**
     * 执行人
     */
    @Column(name = "start_by")
    private String startBy;

    /**
     * stage列表
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
     * 获取pipelineId
     *
     * @return pipeline_id - pipelineId
     */
    public Long getPipelineId() {
        return pipelineId;
    }

    /**
     * 设置pipelineId
     *
     * @param pipelineId pipelineId
     */
    public void setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * 获取projectId
     *
     * @return project_id - projectId
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * 设置projectId
     *
     * @param projectId projectId
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * 获取构建NO
     *
     * @return build_no - 构建NO
     */
    public Integer getBuildNo() {
        return buildNo;
    }

    /**
     * 设置构建NO
     *
     * @param buildNo 构建NO
     */
    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }

    /**
     * 获取0执行中1成功2失败
     *
     * @return status - 0执行中1成功2失败
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置0执行中1成功2失败
     *
     * @param status 0执行中1成功2失败
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取0自动触发1手动触发
     *
     * @return start_type - 0自动触发1手动触发
     */
    public String getStartType() {
        return startType;
    }

    /**
     * 设置0自动触发1手动触发
     *
     * @param startType 0自动触发1手动触发
     */
    public void setStartType(String startType) {
        this.startType = startType;
    }

    /**
     * 获取执行人
     *
     * @return start_by - 执行人
     */
    public String getStartBy() {
        return startBy;
    }

    /**
     * 设置执行人
     *
     * @param startBy 执行人
     */
    public void setStartBy(String startBy) {
        this.startBy = startBy;
    }

    /**
     * 获取stage列表
     *
     * @return pipeline_list - stage列表
     */
    public String getPipelineList() {
        return pipelineList;
    }

    /**
     * 设置stage列表
     *
     * @param pipelineList stage列表
     */
    public void setPipelineList(String pipelineList) {
        this.pipelineList = pipelineList;
    }
}