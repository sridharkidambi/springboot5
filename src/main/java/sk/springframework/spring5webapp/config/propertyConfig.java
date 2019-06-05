package sk.springframework.spring5webapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

@Configuration
@PropertySource("classpath:dataSource.properties")
public class propertyConfig {

    @Value("${family.name}")
    private String familyName;


    @Autowired
    public Environment env;


    @Bean
    public String getFmName(){

        System.out.println("familyName is "+ env.getProperty("family.name"));
        return familyName;
    }

//    @Bean
//    public  static PropertySourcesPlaceholderConfigurer properties(){
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer=new PropertySourcesPlaceholderConfigurer();
//
//        return propertySourcesPlaceholderConfigurer;
//    }
}
