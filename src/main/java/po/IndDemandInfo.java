package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ind_demand_info")
public class IndDemandInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "demand_num")
    private Integer demandNum;

    /**
     * 需求
     */
    @Column(name = "demand_open_num")
    private Integer demandOpenNum;

    /**
     * 需求关闭状态的数量
     */
    @Column(name = "demand_close_num")
    private Integer demandCloseNum;

    /**
     * 需求平均完成时长
     */
    @Column(name = "demand_finisha_time")
    private Double demandFinishaTime;

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
     * @return demand_num
     */
    public Integer getDemandNum() {
        return demandNum;
    }

    /**
     * @param demandNum
     */
    public void setDemandNum(Integer demandNum) {
        this.demandNum = demandNum;
    }

    /**
     * 获取需求
     *
     * @return demand_open_num - 需求
     */
    public Integer getDemandOpenNum() {
        return demandOpenNum;
    }

    /**
     * 设置需求
     *
     * @param demandOpenNum 需求
     */
    public void setDemandOpenNum(Integer demandOpenNum) {
        this.demandOpenNum = demandOpenNum;
    }

    /**
     * 获取需求关闭状态的数量
     *
     * @return demand_close_num - 需求关闭状态的数量
     */
    public Integer getDemandCloseNum() {
        return demandCloseNum;
    }

    /**
     * 设置需求关闭状态的数量
     *
     * @param demandCloseNum 需求关闭状态的数量
     */
    public void setDemandCloseNum(Integer demandCloseNum) {
        this.demandCloseNum = demandCloseNum;
    }

    /**
     * 获取需求平均完成时长
     *
     * @return demand_finisha_time - 需求平均完成时长
     */
    public Double getDemandFinishaTime() {
        return demandFinishaTime;
    }

    /**
     * 设置需求平均完成时长
     *
     * @param demandFinishaTime 需求平均完成时长
     */
    public void setDemandFinishaTime(Double demandFinishaTime) {
        this.demandFinishaTime = demandFinishaTime;
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