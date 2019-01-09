package po;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ind_unit_test_info")
public class IndUnitTestInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 单元测试用例数
     */
    @Column(name = "unit_test_case_num")
    private Integer unitTestCaseNum;

    /**
     * 单元测试覆盖率
     */
    @Column(name = "unit_test_coverage")
    private Double unitTestCoverage;

    /**
     * 单元测试成功率
     */
    @Column(name = "unit_test_success")
    private Double unitTestSuccess;

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
     * 获取单元测试用例数
     *
     * @return unit_test_case_num - 单元测试用例数
     */
    public Integer getUnitTestCaseNum() {
        return unitTestCaseNum;
    }

    /**
     * 设置单元测试用例数
     *
     * @param unitTestCaseNum 单元测试用例数
     */
    public void setUnitTestCaseNum(Integer unitTestCaseNum) {
        this.unitTestCaseNum = unitTestCaseNum;
    }

    /**
     * 获取单元测试覆盖率
     *
     * @return unit_test_coverage - 单元测试覆盖率
     */
    public Double getUnitTestCoverage() {
        return unitTestCoverage;
    }

    /**
     * 设置单元测试覆盖率
     *
     * @param unitTestCoverage 单元测试覆盖率
     */
    public void setUnitTestCoverage(Double unitTestCoverage) {
        this.unitTestCoverage = unitTestCoverage;
    }

    /**
     * 获取单元测试成功率
     *
     * @return unit_test_success - 单元测试成功率
     */
    public Double getUnitTestSuccess() {
        return unitTestSuccess;
    }

    /**
     * 设置单元测试成功率
     *
     * @param unitTestSuccess 单元测试成功率
     */
    public void setUnitTestSuccess(Double unitTestSuccess) {
        this.unitTestSuccess = unitTestSuccess;
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