package com.yyy.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * ClassDescribe
 *
 * @author WangShiLin
 * @date 2021/6/29
 */
@Slf4j
@Component
public class DemoJob {
    /**
     * 执行任务
     *
     * @return ReturnT
     * @author wangshilin
     */
    @XxlJob(value = "demoJob")
    public ReturnT<String> demoJob(String param) {
        XxlJobHelper.log("成功了");
        return ReturnT.SUCCESS;
    }
}
