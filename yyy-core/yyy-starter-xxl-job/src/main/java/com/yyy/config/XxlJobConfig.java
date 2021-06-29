package com.yyy.config;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * XxlJobConfig
 *
 * @author wangshilin
 */
@Configuration
public class XxlJobConfig {

    @Value("${xxl.job.admin.addresses}")
    private String xxlJobAdminAddresses;
    @Value("${xxl.job.executor.appName}")
    private String xxlJobAppName;
    @Value("${xxl.job.executor.logPath:./log/xxljob}")
    private String xxlJobLogPaths;
    @Value("${xxl.job.executor.port:-1}")
    private Integer xxlJobPort;
    @Value("${xxl.job.executor.logRetentionDays:30}")
    private Integer xxlJobLogRetentionDays;

    /**
     * XXL JOB
     *
     * @return XxlJobSpringExecutor
     */
    @Bean
    public XxlJobSpringExecutor xxlJobExecutor() {
        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
        xxlJobSpringExecutor.setAdminAddresses(xxlJobAdminAddresses);
        xxlJobSpringExecutor.setAppname(xxlJobAppName);
        xxlJobSpringExecutor.setPort(xxlJobPort);
        xxlJobSpringExecutor.setLogPath(xxlJobLogPaths);
        xxlJobSpringExecutor.setLogRetentionDays(xxlJobLogRetentionDays);
        return xxlJobSpringExecutor;
    }
}
