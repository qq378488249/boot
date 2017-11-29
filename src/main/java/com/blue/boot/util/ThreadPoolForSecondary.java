package com.blue.boot.util;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by dyandavid on 2017/11/1.
 * 次要工作线程池：发送第三方消息、写日志、推送信息等业务
 */
public class ThreadPoolForSecondary {
    
    private final static ThreadPoolTaskExecutor springThreadPool;

    static {
        synchronized (ThreadPoolUtil.class){
            springThreadPool = new ThreadPoolTaskExecutor();//线程池对象
            springThreadPool.setCorePoolSize(2);//核心线程大小
            //最大线程数，不能超过系统定义的，如果核心线程大小数量超过（当前CPU*2)
            springThreadPool.setMaxPoolSize(Runtime.getRuntime().availableProcessors()*2);//最大线程数
            //缓存队列，execute 的任务优先会插入到缓存队列中，如果工作队列满了会创建新线程池
            springThreadPool.setQueueCapacity(20000);

            springThreadPool.setDaemon(true);//设置为后台线程
            springThreadPool.setAllowCoreThreadTimeOut(true);//启用核心线程超时
            springThreadPool.setKeepAliveSeconds(120);//闲置超时时间,超时后自动销毁
            springThreadPool.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());//如果线程池已满,调用者的线程会执行该任务,如果执行器已关闭,则丢弃
            springThreadPool.initialize();//初始化
        }
    }
    

    public static Integer getActiveCount(){
        return springThreadPool.getActiveCount() ;
    }

    
    /**
     * 执行线程目标
     * @author guoyu
     */
    public static void execute(Runnable runnable) throws Exception{
        try{
            springThreadPool.execute(runnable);
        }catch( Exception e ){
            throw new Exception(e.getMessage()) ;
        }
    }

}
