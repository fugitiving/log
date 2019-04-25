/*
 * 模块编号
 * 功能描述	TODO
 * 文件名		loggertest.java
 * 作者		高科
 * 编写日期	2019-04-25
 */
package com.jdsn.loggertest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * TODO
 * 
 * @version 1.0.0.0
 * @author 高科
 */

public class LoggerTest {
	Logger logger = LogManager.getLogger(LoggerTest.class);

	public void printLog(int i) {
		logger.info("loggertest:" + i);
	}
}
