package com.atguigu.springboot.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * 时间：  2020/2/19
 * 创建者：  Administrator 钟文
 * 描述：自定义MyBatis的配置规则；给容器中添加一个ConfigurationCustomizer；
 * 参数：
 * 返回值：
 **/
@org.springframework.context.annotation.Configuration
public class MyBatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer(){



            @Override
            public void customize(Configuration configuration) {
                //开启驼峰命名
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }

}
