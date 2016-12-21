/**
 * 
 */
package com.produce.utils;

/**
 * @author wuqing
 *
 */
@SuppressWarnings("serial")
public class JSONResultException extends Exception {

	private int errorCode;
	
	public JSONResultException(int code,String message) {
		super(message);
		this.errorCode=code;
	}

	public JSONResultException(String message)
	{
		this(-1,message);
	}

	public JSONResultException(Throwable cause) {
		super(cause);
		this.errorCode=-1;
	}

	public int getErrorCode() {
		return errorCode;
	}
}
