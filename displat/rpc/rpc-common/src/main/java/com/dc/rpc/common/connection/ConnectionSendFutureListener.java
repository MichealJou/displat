package com.dc.rpc.common.connection;


import org.apache.log4j.Logger;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;

/**
 * 发送过程添加监听
 * 
 * @author gavin
 *
 */
public class ConnectionSendFutureListener implements ChannelFutureListener {
	private Logger log = Logger.getLogger(this.getClass());

	public void operationComplete(ChannelFuture future) throws Exception {
		if (future.isSuccess()) {
			log.info("send success " + System.currentTimeMillis());
		} else {
			log.error("connection send msg error", future.cause());
		}
	}
}
