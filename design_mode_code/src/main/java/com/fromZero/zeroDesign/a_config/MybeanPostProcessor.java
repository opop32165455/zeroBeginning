package com.fromZero.zeroDesign.a_config;

import com.fromZero.zeroDesign.design_mode1.a1_strategy_demo_ordinary.Handler;
import com.fromZero.zeroDesign.design_mode1.a2_strategy_demo_annotation.StrategyAnno;
import com.fromZero.zeroDesign.design_mode1.b_factory_mode.Factory1;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * @Desciption: bean初始化 通过注解 把对应业务逻辑的策略 根据value 注册到工厂里去
 * @Auther: ZhangXueCheng4441
 * @Date:2020/12/13/013 10:27
 */
@Configuration
public class MybeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
    //初始化的时候 搜索脑袋上带StrategyAnno注解的 把注解里面的值作为key 内容作为value 注册进去
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        StrategyAnno annotation = bean.getClass().getAnnotation(StrategyAnno.class);
        if (annotation != null && bean instanceof Handler){
            Factory1.register(annotation.value(), (Handler) bean);
        }
        return bean;
    }
}
