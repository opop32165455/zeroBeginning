package com.fromZero.zeroDesign.design_mode1.a2_strategy_demo_annotation.strategy_3;

import com.fromZero.zeroDesign.design_mode1.a1_strategy_demo_ordinary.Handler;

/**
 * @Desciption: 策略模式实现方式   InitializingBean（初始化bean的时候都会执行该接口的afterPropertiesSet方法）
 *              比 @Bean (initMethod = "方法")初始化方法执行更早
 * @Auther: ZhangXueCheng4441
 * @Date:2020/12/12/012 15:11
 */
public interface Strategy3Handler extends Handler {
   //可以写上你特有的方法哟
}
