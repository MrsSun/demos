package net.ijiangtao.tech.ispringboot.alipay.core.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 *
 * @Desctiption:
 * @Date: 2019/01/24 23:03
 */
@Data
public class PagePayQueryDTO {

    @JSONField(name = "out_trade_no")
    private String outTradeNo;

    @JSONField(name = "trade_no")
    private String tradeNo;


}
