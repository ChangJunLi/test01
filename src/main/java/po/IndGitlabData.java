package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ind_gitlab_data")
public class IndGitlabData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "project_id")
    private String projectId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "require_total_count")
    private Integer requireTotalCount;

    @Column(name = "code_commint_count")
    private Integer codeCommintCount;

    @Column(name = "build_time")
    private Integer buildTime;

    @Column(name = "build_num")
    private Integer buildNum;

    @Column(name = "build_fail")
    private Integer buildFail;

    @Column(name = "code_line_num")
    private Integer codeLineNum;

    @Column(name = "code_problem_num")
    private Integer codeProblemNum;

    @Column(name = "environment_time")
    private Integer environmentTime;

    @Column(name = "deploySuccess")
    private Integer deploysuccess;

    @Column(name = "deployTime")
    private Integer deploytime;

    @Column(name = "create_time")
    private Date createTime;

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
    public String getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @return project_name
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @return require_total_count
     */
    public Integer getRequireTotalCount() {
        return requireTotalCount;
    }

    /**
     * @param requireTotalCount
     */
    public void setRequireTotalCount(Integer requireTotalCount) {
        this.requireTotalCount = requireTotalCount;
    }

    /**
     * @return code_commint_count
     */
    public Integer getCodeCommintCount() {
        return codeCommintCount;
    }

    /**
     * @param codeCommintCount
     */
    public void setCodeCommintCount(Integer codeCommintCount) {
        this.codeCommintCount = codeCommintCount;
    }

    /**
     * @return build_time
     */
    public Integer getBuildTime() {
        return buildTime;
    }

    /**
     * @param buildTime
     */
    public void setBuildTime(Integer buildTime) {
        this.buildTime = buildTime;
    }

    /**
     * @return build_num
     */
    public Integer getBuildNum() {
        return buildNum;
    }

    /**
     * @param buildNum
     */
    public void setBuildNum(Integer buildNum) {
        this.buildNum = buildNum;
    }

    /**
     * @return build_fail
     */
    public Integer getBuildFail() {
        return buildFail;
    }

    /**
     * @param buildFail
     */
    public void setBuildFail(Integer buildFail) {
        this.buildFail = buildFail;
    }

    /**
     * @return code_line_num
     */
    public Integer getCodeLineNum() {
        return codeLineNum;
    }

    /**
     * @param codeLineNum
     */
    public void setCodeLineNum(Integer codeLineNum) {
        this.codeLineNum = codeLineNum;
    }

    /**
     * @return code_problem_num
     */
    public Integer getCodeProblemNum() {
        return codeProblemNum;
    }

    /**
     * @param codeProblemNum
     */
    public void setCodeProblemNum(Integer codeProblemNum) {
        this.codeProblemNum = codeProblemNum;
    }

    /**
     * @return environment_time
     */
    public Integer getEnvironmentTime() {
        return environmentTime;
    }

    /**
     * @param environmentTime
     */
    public void setEnvironmentTime(Integer environmentTime) {
        this.environmentTime = environmentTime;
    }

    /**
     * @return deploySuccess
     */
    public Integer getDeploysuccess() {
        return deploysuccess;
    }

    /**
     * @param deploysuccess
     */
    public void setDeploysuccess(Integer deploysuccess) {
        this.deploysuccess = deploysuccess;
    }

    /**
     * @return deployTime
     */
    public Integer getDeploytime() {
        return deploytime;
    }

    /**
     * @param deploytime
     */
    public void setDeploytime(Integer deploytime) {
        this.deploytime = deploytime;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}