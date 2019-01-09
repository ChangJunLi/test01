package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "snc_project_apply")
public class SncProjectApply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 合作商项目：【地域拼音】-【项目域英文拼音】-【项目名英文拼音】-【厂家英文拼音】 限英文
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * 合作商项目：【地域】-【项目域】-【项目名】-【厂家】
     */
    @Column(name = "project_desc")
    private String projectDesc;

    @Column(name = "group_name")
    private String groupName;

    /**
     * 所属厂商
     */
    @Column(name = "group_desc")
    private String groupDesc;

    /**
     * JSON格式：abc@abc.com:master;cde@abc.com:developer;fgh@abc.com:developer;
     */
    private String members;

    private String applicant;

    @Column(name = "applicant_email")
    private String applicantEmail;

    @Column(name = "applicant_mobile")
    private String applicantMobile;

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
     * 0待审核；1不通过； 2审核通过，项目创建中；3审核通过，项目创建失败；4审核通过并创建项目成功；
     */
    private Integer status;

    private String remark;

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
     * 获取合作商项目：【地域拼音】-【项目域英文拼音】-【项目名英文拼音】-【厂家英文拼音】 限英文
     *
     * @return project_name - 合作商项目：【地域拼音】-【项目域英文拼音】-【项目名英文拼音】-【厂家英文拼音】 限英文
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置合作商项目：【地域拼音】-【项目域英文拼音】-【项目名英文拼音】-【厂家英文拼音】 限英文
     *
     * @param projectName 合作商项目：【地域拼音】-【项目域英文拼音】-【项目名英文拼音】-【厂家英文拼音】 限英文
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取合作商项目：【地域】-【项目域】-【项目名】-【厂家】
     *
     * @return project_desc - 合作商项目：【地域】-【项目域】-【项目名】-【厂家】
     */
    public String getProjectDesc() {
        return projectDesc;
    }

    /**
     * 设置合作商项目：【地域】-【项目域】-【项目名】-【厂家】
     *
     * @param projectDesc 合作商项目：【地域】-【项目域】-【项目名】-【厂家】
     */
    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    /**
     * @return group_name
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 获取所属厂商
     *
     * @return group_desc - 所属厂商
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    /**
     * 设置所属厂商
     *
     * @param groupDesc 所属厂商
     */
    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    /**
     * 获取JSON格式：abc@abc.com:master;cde@abc.com:developer;fgh@abc.com:developer;
     *
     * @return members - JSON格式：abc@abc.com:master;cde@abc.com:developer;fgh@abc.com:developer;
     */
    public String getMembers() {
        return members;
    }

    /**
     * 设置JSON格式：abc@abc.com:master;cde@abc.com:developer;fgh@abc.com:developer;
     *
     * @param members JSON格式：abc@abc.com:master;cde@abc.com:developer;fgh@abc.com:developer;
     */
    public void setMembers(String members) {
        this.members = members;
    }

    /**
     * @return applicant
     */
    public String getApplicant() {
        return applicant;
    }

    /**
     * @param applicant
     */
    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    /**
     * @return applicant_email
     */
    public String getApplicantEmail() {
        return applicantEmail;
    }

    /**
     * @param applicantEmail
     */
    public void setApplicantEmail(String applicantEmail) {
        this.applicantEmail = applicantEmail;
    }

    /**
     * @return applicant_mobile
     */
    public String getApplicantMobile() {
        return applicantMobile;
    }

    /**
     * @param applicantMobile
     */
    public void setApplicantMobile(String applicantMobile) {
        this.applicantMobile = applicantMobile;
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
     * 获取0待审核；1不通过； 2审核通过，项目创建中；3审核通过，项目创建失败；4审核通过并创建项目成功；
     *
     * @return status - 0待审核；1不通过； 2审核通过，项目创建中；3审核通过，项目创建失败；4审核通过并创建项目成功；
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0待审核；1不通过； 2审核通过，项目创建中；3审核通过，项目创建失败；4审核通过并创建项目成功；
     *
     * @param status 0待审核；1不通过； 2审核通过，项目创建中；3审核通过，项目创建失败；4审核通过并创建项目成功；
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}