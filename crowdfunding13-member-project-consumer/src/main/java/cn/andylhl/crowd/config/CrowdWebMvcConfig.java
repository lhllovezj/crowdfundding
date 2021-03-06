package cn.andylhl.crowd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/***
 * @Title: CrowdWebMvcConfigure
 * @Description: project mvc配置
 * @author: lhl
 * @date: 2021/1/18 14:26
 */

@Configuration
public class CrowdWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 同意协议页面
        registry.addViewController("/agree/protocol/page").setViewName("project-agree");
        // 项目基本信息
        registry.addViewController("/launch/project/page").setViewName("project-launch");
        // 项目回报
        registry.addViewController("/return/info/page").setViewName("project-return");
        // 确认信息页面
        registry.addViewController("/create/confirm/page").setViewName("project-confirm");
        // 成功页面
        registry.addViewController("/create/sucess").setViewName("project-success");
    }
}
