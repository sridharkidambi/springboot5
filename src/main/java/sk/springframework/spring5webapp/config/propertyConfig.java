package sk.springframework.spring5webapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.annotation.Resource;

@Configuration
@PropertySource("classpath:dataSource.properties")
public class propertyConfig {

    @Value("${family.name}")
    private String familyName;


    @Bean
    public String getFmName(){

        System.out.println("familyName is "+ familyName);
        return familyName;
    }

    @Bean
    public  static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer=new PropertySourcesPlaceholderConfigurer();

        return propertySourcesPlaceholderConfigurer;
    }
}
