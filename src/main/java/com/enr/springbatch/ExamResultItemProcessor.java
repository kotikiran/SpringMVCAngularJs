package com.enr.springbatch;

import org.springframework.batch.item.ItemProcessor;

import com.enr.springbatch.model.ExamResult;

public class ExamResultItemProcessor implements ItemProcessor<ExamResult, ExamResult> {

	@Override
	public ExamResult process(ExamResult result) throws Exception {
		System.out.println("Processing result :"+result);
		
		/*
		 * Only return results which are more than 60%
		 * 
		 */
		if(result.getPercentage() < 60){
			return null;
		}
		
		return result;
	}
}
