package cn.felord.payment.wechat.v3.model;


import cn.felord.payment.wechat.enumeration.CouponBgColor;
import lombok.Data;

/**
 * 优惠券样式
 *
 *
 * @author felord.cn
 * @since 1.0.0.RELEASE
 */
@Data
public class PatternInfo {
    /**
     * 背景色
     */
    private CouponBgColor backgroundColor;
    /**
     * 券详情图片
     */
    private String couponImage;
    /**
     * 使用说明
     */
    private String description;
    /**
     * 商户logo
     */
    private String merchantLogo;
    /**
     * 商户名称
     */
    private String merchantName;

}
