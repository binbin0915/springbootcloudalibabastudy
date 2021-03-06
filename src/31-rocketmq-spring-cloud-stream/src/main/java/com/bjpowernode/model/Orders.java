package com.bjpowernode.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Orders {

    private Integer id;

    private Integer uid;

    private Integer goodsid;

    private Integer buynum;

    private BigDecimal buyprice;

    private Long ordermoney;

    private Date createtime;

    private Integer status;

}