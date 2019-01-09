package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ind_jenkins_execute")
public class IndJenkinsExecute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 描述
     */
    private String description;

    /**
     * job名字
     */
    @Column(name = "job_name")
    private String jobName;

    /**
     * 构建NO
     */
    @Column(name = "build_no")
    private Integer buildNo;

    /**
     * 构建状态
     */
    private String status;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 构建持续耗时（毫秒）
     */
    private Integer duration;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取job名字
     *
     * @return job_name - job名字
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 设置job名字
     *
     * @param jobName job名字
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
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
     * 获取构建状态
     *
     * @return status - 构建状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置构建状态
     *
     * @param status 构建状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取构建持续耗时（毫秒）
     *
     * @return duration - 构建持续耗时（毫秒）
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 设置构建持续耗时（毫秒）
     *
     * @param duration 构建持续耗时（毫秒）
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}