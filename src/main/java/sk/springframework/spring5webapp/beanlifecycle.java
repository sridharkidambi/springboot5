package sk.springframework.spring5webapp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class beanlifecycle implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("******************");
        System.out.println("I am setBeanFactory      " + beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("******************");
        System.out.println("I am setBeanName     "+ s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("******************");
        System.out.println("I am destroy     ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("******************");
        System.out.println("I am afterPropertiesSet   ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("******************");
        System.out.println("I am setApplicationContext   "+applicationContext);
    }

    @PostConstruct
    private void checkPostConstruct(){
        System.out.println("******************");
        System.out.println("I am checkPostConstruct   ");
    }

    @PreDestroy
    private void checkPreDestroy(){
        System.out.println("******************");
        System.out.println("I am checkPreDestroy   ");
    }

    public void preInitializeProcessor(){
        System.out.println("******************");
        System.out.println("I am preInitializeProcessor   ");
    }

    public void postInitializeProcessor(){
        System.out.println("******************");
        System.out.println("I am postInitializeProcessor   ");
    }
}
