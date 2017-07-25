package org.com.cay.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.StrutsTypeConverter;

public class DateConverter extends StrutsTypeConverter {

	private DateFormat dateFormat;
	
	public DateConverter() {
		// TODO Auto-generated constructor stub
		System.out.println("DateConverter...");
	}
	
	public DateFormat getDateFormat(){
		if(dateFormat == null){
			//获取当前web应用的初始化参数datePattern
			String datePattern = ServletActionContext.getServletContext().getInitParameter("datePattern");
			
			dateFormat = new SimpleDateFormat(datePattern);
		}
		return dateFormat;
	}
	
	//从字符串转换
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		// TODO Auto-generated method stub
		System.out.println("convertFromString...");
		if(arg2 == Date.class){
			if(arg1 != null && arg1.length > 0){
				String value = arg1[0];
				try {
					return getDateFormat().parse(value);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		//若没有转换成功,则返回arg1
		return arg1;
	}

	//转换成字符串类型
	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO Auto-generated method stub
		System.out.println("convertToString...");
		if(arg1 instanceof Date){
			Date date = (Date)arg1;
			return getDateFormat().format(date);
		}
		//若转换失败，则返回null
		return null;
	}

}
