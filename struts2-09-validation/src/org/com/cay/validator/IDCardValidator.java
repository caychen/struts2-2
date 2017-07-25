package org.com.cay.validator;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class IDCardValidator extends FieldValidatorSupport {

	@Override
	public void validate(Object object) throws ValidationException {
		// TODO Auto-generated method stub
		//1. ��ȡ�ֶε����ֺ�ֵ
		String fieldName = getFieldName();
		String value = (String) this.getFieldValue(fieldName, object);
		
		//2. ��֤
		boolean result = IDCardUtils.validateCard(value);
		
		//3. ����֤ʧ�ܣ���...
		if(!result){
			addFieldError(fieldName, object);
		}
	}

}
