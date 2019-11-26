package com.example.springbootmybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//配置类注解
@Configuration
public class druidconfig {

    //将数据源更换为druid
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource myDurid(){
       return new DruidDataSource();
    }

    //配置管理后台的Servlet
    @Bean
    public ServletRegistrationBean myRegister(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        Map<String,Object> maps = new HashMap<>();
        maps.put("loginUsername","admin");
        maps.put("loginPassword","123456");
        servletRegistrationBean.setInitParameters(maps);

        return  servletRegistrationBean;
    }

    //
    @Bean
    public FilterRegistrationBean myRegisyer(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        Map<String,Object> maps = new HashMap<>();
        maps.put("exclusions","*.js,*.css,/druid/*");
        filterRegistrationBean.setInitParameters(maps);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        return filterRegistrationBean;
    }
}
