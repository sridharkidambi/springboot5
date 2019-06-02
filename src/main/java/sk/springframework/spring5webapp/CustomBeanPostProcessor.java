package sk.springframework.spring5webapp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import sk.springframework.spring5webapp.service.child2GreetingService;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean name is: "+bean.toString());
        if(bean instanceof child2GreetingService){
            ((child2GreetingService) bean).orintme();
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof beanlifecycle){
            ((beanlifecycle) bean).postInitializeProcessor();
        }
        return bean;
    }

}
