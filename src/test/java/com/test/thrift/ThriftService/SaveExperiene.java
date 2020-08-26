package com.test.thrift.ThriftService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransportException;
import org.testng.annotations.Test;

import com.naukri.services.resume.thrift9.TExperience;
import com.naukri.services.resume.update.thrift9.TUpdateResult;
import com.naukri.services.resume.update.thrift9.TUpdateResume;

public class SaveExperiene {

	ThriftExecutor thriftExecutor = new ThriftExecutor();

	@Test
	public void TC_001_verify_SaveExperience() throws TTransportException {

		TProtocol protocol = thriftExecutor.execute("192.168.40.161", 9321);
		
		Map<String, String> ids = new HashMap<String, String>();
		ids.put("requestId", String.valueOf(System.currentTimeMillis()));
		
		TUpdateResume.Client updateResumeClient = new TUpdateResume.Client(protocol);

		List<TExperience> experienceList = new ArrayList<TExperience>();
		TExperience experience = new TExperience();
		experience.setResumeId(234545213);
		experience.setExperienceId(-1);
		experience.setStartDate("2018-07-10");
		experience.setEndDate("0000-00-00");
		experience.setEmpType("C");
		experience.setOrganization("Info Edge");
		experience.setDesignation("Chief Project Manager");
		experience.setKeywords("a,b,c,d,e,f,exp");
		
//		TExperience experience1 = new TExperience();
//		experience1.setResumeId(166128679);
//		experience1.setExperienceId(-1);
//		experience1.setStartDate("2017-05-10");
//		experience1.setEndDate("2018-05-09");
//		experience1.setEmpType("P");
//		experience1.setOrganization("Info Edge");
//		experience1.setDesignation("Chief Project Manager");
//		experience1.setKeywords("a,b,c,d,e,f,exp");
//		
//		TExperience experience2 = new TExperience();
//		experience2.setResumeId(166128679);
//		experience2.setExperienceId(-1);
//		experience2.setStartDate("2015-05-10");
//		experience2.setEndDate("2016-05-09");
//		experience2.setEmpType("O");
//		experience2.setOrganization("Info Edge");
//		experience2.setDesignation("Chief Project Manager");
//		experience2.setKeywords("a,b,c,d,e,f,exp");
		
		experienceList.add(experience);
//		experienceList.add(experience1);
//		experienceList.add(experience2);
		
		
		
		List<List<String>> dirtFieldsList = new ArrayList<>();
		List<String> df = new ArrayList<>();
		df.add("resumeId");
		df.add("startDate");
		df.add("endDate");
		df.add("experienceId");
		df.add("empType");
		df.add("organization");
		df.add("designation");
		df.add("keywords");
		
//		List<String> df1 = new ArrayList<>();
//		df1.add("resumeId");
//		df1.add("startDate");
//		df1.add("endDate");
//		df1.add("experienceId");
//		df1.add("empType");
//		df1.add("organization");
//		df1.add("designation");
//		df1.add("keywords");
//		
//		List<String> df2 = new ArrayList<>();
//		df2.add("resumeId");
//		df2.add("startDate");
//		df2.add("endDate");
//		df2.add("experienceId");
//		df2.add("empType");
//		df2.add("organization");
//		df2.add("designation");
//		df2.add("keywords");
		
		dirtFieldsList.add(df);
//		dirtFieldsList.add(df1);
//		dirtFieldsList.add(df2);
		
		
		
		try {
			List<TUpdateResult> list = updateResumeClient.saveExperiences(ids, 105, experienceList, "now", "resman5_1",
					dirtFieldsList);
			System.out.println(list.toString());
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
