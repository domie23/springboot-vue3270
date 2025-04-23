package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 就业信息
 *
 * @author 
 * @email
 */
@TableName("toudi")
public class ToudiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ToudiEntity() {

	}

	public ToudiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Toudi{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", gongshiName=" + gongshiName +
            ", gongshiAddress=" + gongshiAddress +
            ", toudiTime=" + toudiTime +
            ", createTime=" + createTime +
        "}";
    }
}
