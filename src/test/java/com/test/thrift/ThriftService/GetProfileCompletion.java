package com.test.thrift.ThriftService;

import java.util.HashMap;
import java.util.Map;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransportException;
import org.testng.annotations.Test;

import com.naukri.services.resume.thrift9.TResumeService;
import com.naukri.services.resume.thrift9.TTextCV;
import com.naukri.services.resume.update.thrift9.TUpdateResult;
import com.naukri.services.resume.update.thrift9.TUpdateResume;

public class GetProfileCompletion {

	ThriftExecutor thriftExecutor = new ThriftExecutor();

	@Test
	public void TC_001_verify_GetProfileCompletion() throws TTransportException {

		
		

		Map<String, String> ids = new HashMap<String, String>();
		ids.put("requestId", "shrawan-20");

////		TProtocol protocol = thriftExecutor.execute("10.10.130.60", 7971);
//		TProtocol protocol = thriftExecutor.execute("192.168.40.161", 9311);
//		TResumeService.Client resumeServiceClient = new TResumeService.Client(protocol);
//		try {
////			System.out.println(resumeServiceClient.getPartialActiveProfileFromUserId(ids, 105, 116841977, 00001100, "resman5_1"));
////			System.out.println(resumeServiceClient.getProfileCompletionWithCvFromUsername(ids, 105,
////					"aj1@yopmail.com", "resman5_1"));
//			System.out.println(resumeServiceClient.getProfileCompletionWithCvFromResumeId(ids, 105, 234634007, "resman5_1"));
////			System.out.println(updateResumeClient.deleteAccount(ids, 105, "rishabh.madhesiya@gmail.com", "now", "resman5_1"));
//		} catch (TException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		TProtocol protocol = thriftExecutor.execute("10.10.115.103", 9142);
		TProtocol protocol = thriftExecutor.execute("192.168.40.161", 9321);
		TUpdateResume.Client updateResumeClient = new TUpdateResume.Client(protocol);
//		TTextCV ttextCV = new TTextCV();
//		ttextCV.setResumeId(166128679);
//		ttextCV.setTextCV(null);

		try {
//			TUpdateResult updateResultTextCV = updateResumeClient.saveTextCV(ids, 105, ttextCV, "resman5_1");
//			System.out.println(updateResultTextCV);
//			System.out.println(updateResumeClient.resetPassword(ids,106, "space character", "123456", "default", "resman5_1"));
			updateResumeClient.updateResdexFlagFromUserId(ids, 106, "now", "resman5_1", 272072476, "1");
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		String ans="";
//		for(int i = 0; i < 1000; i++) {
//			ans += "a";
//		}
//		System.out.println(ans);
//	}

}
