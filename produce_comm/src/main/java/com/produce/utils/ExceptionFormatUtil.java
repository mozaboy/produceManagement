package com.produce.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 异常的格式化处理
 *
 */
public final class ExceptionFormatUtil {

	private static final Log log = LogFactory.getLog(ExceptionFormatUtil.class);
	
	private static String produceClassFlag = "com.produce";
	/**
	 * 将Exception的异常栈按简化输出
	 * <br/>
	 * 异常名 Caused by:(异常出处类名.方法名:行号<-..)
	 * @param e
	 * @return
	 */
	public static String getTrace(Exception e){
		return getTrace(e, false);
	}
	
	public static String getTrace(Exception e, boolean produceClass) {
		if(e == null) {
			return "";
		}
		try {
			return format(e, produceClass);
		} catch (Exception e1) {
			//如果格式化不出来，直接原文输出
			log.error("格式化异常出错："+e.getMessage());
			log.error("格式化异常出错：原文是：", e);
		}
		return "";
	}

	private static String format(Exception e, boolean produceClass) {
		StringBuilder exceptionResult = new StringBuilder(e.toString());
		getFormatString(e, produceClass, exceptionResult);
		return exceptionResult.toString();
	}

	private static void getFormatString(Throwable e, boolean produceClass, StringBuilder exceptionResult) {
		StackTraceElement[] stList = e.getStackTrace();
		if(stList == null) {
			return ;
		}
		if(exceptionResult.length() > 0) {
			exceptionResult.append(" Caused by:(");
		}
		for(StackTraceElement ste : stList) {
			if(produceClass) {
				if(!ste.getClassName().contains(produceClassFlag)) {
					continue;
				}
			}
			exceptionResult.append(ste.getFileName().replace(".java", "."));
			exceptionResult.append(ste.getMethodName());
			exceptionResult.append(":");
			exceptionResult.append(ste.getLineNumber());
			exceptionResult.append(" <- ");
		}
		if(exceptionResult.lastIndexOf(" <- ")==exceptionResult.length()-4) {
			exceptionResult.delete(exceptionResult.length()-4,exceptionResult.length());
		}
		exceptionResult.append(")");
		
		Throwable e1 = e.getCause();
		if(e1 != null){
			getFormatString(e1, produceClass, exceptionResult);
		}
	}
	
	public static void main(String[]a) {
		try {
			try{
				DateUtil.formatDate(DateUtil.getTodayDate(),"abc");
			}catch(Exception e){
				System.out.println("\n\n"+getTrace(e));
				throw new Exception(e);
			}
		} catch (Exception e) {
			System.out.println("\n\n"+getTrace(e));
		}
	}
}
