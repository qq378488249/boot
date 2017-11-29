package com.blue.boot.util;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程池
 * 限制:如果是发送优惠券那么200万会员数量的发放就会让队列满负荷，可能导致阻塞
 *
 * @author guoyu
 */
public class ThreadPoolUtil {
	private final static ThreadPoolTaskExecutor springThreadPool;

	static {
		synchronized (ThreadPoolUtil.class){
			springThreadPool = new ThreadPoolTaskExecutor();//线程池对象
			springThreadPool.setCorePoolSize(8);//核心线程大小
			springThreadPool.setQueueCapacity(1000);//缓存队列
			springThreadPool.setMaxPoolSize((Runtime.getRuntime().availableProcessors()*2<24) ? 24:Runtime.getRuntime().availableProcessors()*2);//最大线程数
			springThreadPool.setDaemon(true);//设置为后台线程
			springThreadPool.setAllowCoreThreadTimeOut(true);//启用核心线程超时
			springThreadPool.setKeepAliveSeconds(120);//闲置超时时间,超时后自动销毁
			springThreadPool.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());//如果线程池已满,调用者的线程会执行该任务,如果执行器已关闭,则丢弃
			springThreadPool.initialize();//初始化
		}
	}

    /**
     * new 一个线程池对象
     * CorePoolSize: 线程大小
     * QueueCapacity: 缓存队列,如果不传则是无限队列
     * execute执行线程目标时会抛出异常, 说明任务添加不进去了,请调用者自行处理
     * @author guoyu
     */
    public static ThreadPoolTaskExecutor getThreadPool(int poolSize){
        //线程池对象
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(poolSize);//核心线程大小
        executor.setQueueCapacity(poolSize * 10);//缓存队列
        executor.setMaxPoolSize(poolSize);//最大线程数
        //this.setDaemon(false);//设置为后台线程
        executor.setAllowCoreThreadTimeOut(true);//启用核心线程超时
        executor.setKeepAliveSeconds(60);//闲置超时时间,超时后自动销毁
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());//如果线程池已满,调用者的线程会执行该任务,如果执行器已关闭,则丢弃
        executor.initialize();//初始化
        return executor;
    }

	/**
	 * 执行线程目标
	 * @author guoyu
	 */
	public static void execute(Runnable runnable){
		springThreadPool.execute(runnable);
	}

}
