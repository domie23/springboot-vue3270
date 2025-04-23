package com.entity.vo;

import com.entity.ToudiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 就业信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("toudi")
public class ToudiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 公司名称
     */

    @TableField(value = "gongshi_name")
    private String gongshiName;


    /**
     * 公司地址
     */

    @TableField(value = "gongshi_address")
    private String gongshiAddress;


    /**
     * 就业时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "toudi_time")
    private Date toudiTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：公司名称
	 */
    public String getGongshiName() {
        return gongshiName;
    }


    /**
	 * 获取：公司名称
	 */

    public void setGongshiName(String gongshiName) {
        this.gongshiName = gongshiName;
    }
    /**
	 * 设置：公司地址
	 */
    public String getGongshiAddress() {
        return gongshiAddress;
    }


    /**
	 * 获取：公司地址
	 */

    public void setGongshiAddress(String gongshiAddress) {
        this.gongshiAddress = gongshiAddress;
    }
    /**
	 * 设置：就业时间
	 */
    public Date getToudiTime() {
        return toudiTime;
    }


    /**
	 * 获取：就业时间
	 */

    public void setToudiTime(Date toudiTime) {
        this.toudiTime = toudiTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
