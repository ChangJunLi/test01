package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ind_env_info")
public class IndEnvInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 环境变更时长
     */
    @Column(name = "env_change_time")
    private String envChangeTime;

    @Column(name = "env_change_frequency")
    private String envChangeFrequency;

    /**
     * 容器进行最新更新时间
     */
    @Column(name = "container_image_upatetime")
    private Date containerImageUpatetime;

    @Column(name = "container_active_num")
    private Integer containerActiveNum;

    /**
     * 资源使用情况:cpu/mem/disk
     */
    @Column(name = "resouces_info")
    private String resoucesInfo;

    private Date createtime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取环境变更时长
     *
     * @return env_change_time - 环境变更时长
     */
    public String getEnvChangeTime() {
        return envChangeTime;
    }

    /**
     * 设置环境变更时长
     *
     * @param envChangeTime 环境变更时长
     */
    public void setEnvChangeTime(String envChangeTime) {
        this.envChangeTime = envChangeTime;
    }

    /**
     * @return env_change_frequency
     */
    public String getEnvChangeFrequency() {
        return envChangeFrequency;
    }

    /**
     * @param envChangeFrequency
     */
    public void setEnvChangeFrequency(String envChangeFrequency) {
        this.envChangeFrequency = envChangeFrequency;
    }

    /**
     * 获取容器进行最新更新时间
     *
     * @return container_image_upatetime - 容器进行最新更新时间
     */
    public Date getContainerImageUpatetime() {
        return containerImageUpatetime;
    }

    /**
     * 设置容器进行最新更新时间
     *
     * @param containerImageUpatetime 容器进行最新更新时间
     */
    public void setContainerImageUpatetime(Date containerImageUpatetime) {
        this.containerImageUpatetime = containerImageUpatetime;
    }

    /**
     * @return container_active_num
     */
    public Integer getContainerActiveNum() {
        return containerActiveNum;
    }

    /**
     * @param containerActiveNum
     */
    public void setContainerActiveNum(Integer containerActiveNum) {
        this.containerActiveNum = containerActiveNum;
    }

    /**
     * 获取资源使用情况:cpu/mem/disk
     *
     * @return resouces_info - 资源使用情况:cpu/mem/disk
     */
    public String getResoucesInfo() {
        return resoucesInfo;
    }

    /**
     * 设置资源使用情况:cpu/mem/disk
     *
     * @param resoucesInfo 资源使用情况:cpu/mem/disk
     */
    public void setResoucesInfo(String resoucesInfo) {
        this.resoucesInfo = resoucesInfo;
    }

    /**
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}