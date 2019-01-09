package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ind_deploy_info")
public class IndDeployInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 部署版本数量
     */
    @Column(name = "deploy_version_num")
    private Integer deployVersionNum;

    @Column(name = "deploy_lastest_ime")
    private Date deployLastestIme;

    /**
     * 成功率
     */
    @Column(name = "deploy_success")
    private Double deploySuccess;

    /**
     * 回滚率或失败率
     */
    @Column(name = "deploy_rollback")
    private Double deployRollback;

    /**
     * 变更lead time（代码提交到部署）
     */
    @Column(name = "change_lead_time")
    private Date changeLeadTime;

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
     * 获取部署版本数量
     *
     * @return deploy_version_num - 部署版本数量
     */
    public Integer getDeployVersionNum() {
        return deployVersionNum;
    }

    /**
     * 设置部署版本数量
     *
     * @param deployVersionNum 部署版本数量
     */
    public void setDeployVersionNum(Integer deployVersionNum) {
        this.deployVersionNum = deployVersionNum;
    }

    /**
     * @return deploy_lastest_ime
     */
    public Date getDeployLastestIme() {
        return deployLastestIme;
    }

    /**
     * @param deployLastestIme
     */
    public void setDeployLastestIme(Date deployLastestIme) {
        this.deployLastestIme = deployLastestIme;
    }

    /**
     * 获取成功率
     *
     * @return deploy_success - 成功率
     */
    public Double getDeploySuccess() {
        return deploySuccess;
    }

    /**
     * 设置成功率
     *
     * @param deploySuccess 成功率
     */
    public void setDeploySuccess(Double deploySuccess) {
        this.deploySuccess = deploySuccess;
    }

    /**
     * 获取回滚率或失败率
     *
     * @return deploy_rollback - 回滚率或失败率
     */
    public Double getDeployRollback() {
        return deployRollback;
    }

    /**
     * 设置回滚率或失败率
     *
     * @param deployRollback 回滚率或失败率
     */
    public void setDeployRollback(Double deployRollback) {
        this.deployRollback = deployRollback;
    }

    /**
     * 获取变更lead time（代码提交到部署）
     *
     * @return change_lead_time - 变更lead time（代码提交到部署）
     */
    public Date getChangeLeadTime() {
        return changeLeadTime;
    }

    /**
     * 设置变更lead time（代码提交到部署）
     *
     * @param changeLeadTime 变更lead time（代码提交到部署）
     */
    public void setChangeLeadTime(Date changeLeadTime) {
        this.changeLeadTime = changeLeadTime;
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