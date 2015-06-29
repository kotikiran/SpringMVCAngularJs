package com.enr.springbatch;


import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.enr.springbatch.model.ExamResult;

public class ExamResultFieldSetMapper implements FieldSetMapper<ExamResult>{

	public ExamResult mapFieldSet(FieldSet fieldSet) throws BindException {
		ExamResult result = new ExamResult();
		result.setStudentName(fieldSet.readString(0));
		result.setDob(fieldSet.readDate(1,"dd/MM/yyyy"));
		result.setPercentage(fieldSet.readDouble(2));
		return result;
	}

}
