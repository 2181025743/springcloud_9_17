package yx.provider_nacos_8002.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("geocode")
public class GeoCode {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;
    private String road;
    private String number;
    private String remark;
}