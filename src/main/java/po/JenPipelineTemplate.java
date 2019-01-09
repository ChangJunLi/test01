package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "jen_pipeline_template")
public class JenPipelineTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 流水线名字
     */
    @Column(name = "template_name")
    private String templateName;

    /**
     * 所属项目id
     */
    @Column(name = "template_flow")
    private String templateFlow;

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
    @Column(name = "modified_by")
    private String modifiedBy;

    /**
     * 最后修改时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;

    private String operator;

    /**
     * 流水线json格式数据
     */
    @Column(name = "template_list")
    private String templateList;

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
     * @return template_name - 流水线名字
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * 设置流水线名字
     *
     * @param templateName 流水线名字
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * 获取所属项目id
     *
     * @return template_flow - 所属项目id
     */
    public String getTemplateFlow() {
        return templateFlow;
    }

    /**
     * 设置所属项目id
     *
     * @param templateFlow 所属项目id
     */
    public void setTemplateFlow(String templateFlow) {
        this.templateFlow = templateFlow;
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
     * @return modified_by - 最后修改人
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * 设置最后修改人
     *
     * @param modifiedBy 最后修改人
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * 获取最后修改时间
     *
     * @return modified_time - 最后修改时间
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param modifiedTime 最后修改时间
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 获取流水线json格式数据
     *
     * @return template_list - 流水线json格式数据
     */
    public String getTemplateList() {
        return templateList;
    }

    /**
     * 设置流水线json格式数据
     *
     * @param templateList 流水线json格式数据
     */
    public void setTemplateList(String templateList) {
        this.templateList = templateList;
    }
}