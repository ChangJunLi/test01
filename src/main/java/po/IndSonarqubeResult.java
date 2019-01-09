package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ind_sonarqube_result")
public class IndSonarqubeResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * bug数量
     */
    private String bugs;

    /**
     * 缺陷数量
     */
    private String vulnerabilities;

    /**
     * 坏味道数量
     */
    @Column(name = "code_smells")
    private String codeSmells;

    /**
     * 覆盖率
     */
    private String coverage;

    /**
     * 重复行占总行数的百分比
     */
    @Column(name = "duplicated_lines_density")
    private String duplicatedLinesDensity;

    /**
     * 重复块数
     */
    @Column(name = "duplicated_blocks")
    private String duplicatedBlocks;

    /**
     * 质量阀状态
     */
    @Column(name = "quality_gate_status")
    private String qualityGateStatus;

    /**
     * 代码行数
     */
    private String ncloc;

    /**
     * 复杂度
     */
    private String complexity;

    /**
     * soanrqube上项目名称
     */
    @Column(name = "project_name")
    private String projectName;

    /**
     * soanrqube上项目key
     */
    @Column(name = "project_key")
    private String projectKey;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;

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
     * 获取bug数量
     *
     * @return bugs - bug数量
     */
    public String getBugs() {
        return bugs;
    }

    /**
     * 设置bug数量
     *
     * @param bugs bug数量
     */
    public void setBugs(String bugs) {
        this.bugs = bugs;
    }

    /**
     * 获取缺陷数量
     *
     * @return vulnerabilities - 缺陷数量
     */
    public String getVulnerabilities() {
        return vulnerabilities;
    }

    /**
     * 设置缺陷数量
     *
     * @param vulnerabilities 缺陷数量
     */
    public void setVulnerabilities(String vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    /**
     * 获取坏味道数量
     *
     * @return code_smells - 坏味道数量
     */
    public String getCodeSmells() {
        return codeSmells;
    }

    /**
     * 设置坏味道数量
     *
     * @param codeSmells 坏味道数量
     */
    public void setCodeSmells(String codeSmells) {
        this.codeSmells = codeSmells;
    }

    /**
     * 获取覆盖率
     *
     * @return coverage - 覆盖率
     */
    public String getCoverage() {
        return coverage;
    }

    /**
     * 设置覆盖率
     *
     * @param coverage 覆盖率
     */
    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    /**
     * 获取重复行占总行数的百分比
     *
     * @return duplicated_lines_density - 重复行占总行数的百分比
     */
    public String getDuplicatedLinesDensity() {
        return duplicatedLinesDensity;
    }

    /**
     * 设置重复行占总行数的百分比
     *
     * @param duplicatedLinesDensity 重复行占总行数的百分比
     */
    public void setDuplicatedLinesDensity(String duplicatedLinesDensity) {
        this.duplicatedLinesDensity = duplicatedLinesDensity;
    }

    /**
     * 获取重复块数
     *
     * @return duplicated_blocks - 重复块数
     */
    public String getDuplicatedBlocks() {
        return duplicatedBlocks;
    }

    /**
     * 设置重复块数
     *
     * @param duplicatedBlocks 重复块数
     */
    public void setDuplicatedBlocks(String duplicatedBlocks) {
        this.duplicatedBlocks = duplicatedBlocks;
    }

    /**
     * 获取质量阀状态
     *
     * @return quality_gate_status - 质量阀状态
     */
    public String getQualityGateStatus() {
        return qualityGateStatus;
    }

    /**
     * 设置质量阀状态
     *
     * @param qualityGateStatus 质量阀状态
     */
    public void setQualityGateStatus(String qualityGateStatus) {
        this.qualityGateStatus = qualityGateStatus;
    }

    /**
     * 获取代码行数
     *
     * @return ncloc - 代码行数
     */
    public String getNcloc() {
        return ncloc;
    }

    /**
     * 设置代码行数
     *
     * @param ncloc 代码行数
     */
    public void setNcloc(String ncloc) {
        this.ncloc = ncloc;
    }

    /**
     * 获取复杂度
     *
     * @return complexity - 复杂度
     */
    public String getComplexity() {
        return complexity;
    }

    /**
     * 设置复杂度
     *
     * @param complexity 复杂度
     */
    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    /**
     * 获取soanrqube上项目名称
     *
     * @return project_name - soanrqube上项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置soanrqube上项目名称
     *
     * @param projectName soanrqube上项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取soanrqube上项目key
     *
     * @return project_key - soanrqube上项目key
     */
    public String getProjectKey() {
        return projectKey;
    }

    /**
     * 设置soanrqube上项目key
     *
     * @param projectKey soanrqube上项目key
     */
    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
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
     * 获取修改时间
     *
     * @return modified_time - 修改时间
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifiedTime 修改时间
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}