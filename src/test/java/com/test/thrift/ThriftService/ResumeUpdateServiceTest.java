package com.test.thrift.ThriftService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransportException;
import org.testng.annotations.Test;

import com.naukri.services.resume.thrift9.ProfileModHistory;
import com.naukri.services.resume.thrift9.TCertification;
import com.naukri.services.resume.thrift9.TDisability;
import com.naukri.services.resume.thrift9.TEducation;
import com.naukri.services.resume.thrift9.TExperience;
import com.naukri.services.resume.thrift9.TITProject;
import com.naukri.services.resume.thrift9.TITSkill;
import com.naukri.services.resume.thrift9.TLanguage;
import com.naukri.services.resume.thrift9.TNoticePeriod;
import com.naukri.services.resume.thrift9.TOnlineProfileLinks;
import com.naukri.services.resume.thrift9.TPatentLinks;
import com.naukri.services.resume.thrift9.TPresentationLinks;
import com.naukri.services.resume.thrift9.TProfile;
import com.naukri.services.resume.thrift9.TProperties;
import com.naukri.services.resume.thrift9.TPublicationLinks;
import com.naukri.services.resume.thrift9.TResponse;
import com.naukri.services.resume.thrift9.TResumeService;
import com.naukri.services.resume.thrift9.TSchoolDetails;
import com.naukri.services.resume.thrift9.TTextCV;
import com.naukri.services.resume.thrift9.TUser;
import com.naukri.services.resume.thrift9.TWorksampleLinks;
import com.naukri.services.resume.update.thrift9.TUpdateResult;
import com.naukri.services.resume.update.thrift9.TUpdateResume;
import com.naukri.services.staticdata.thrift9.Data;

public class ResumeUpdateServiceTest {

	static ThriftExecutor thriftExecutor = new ThriftExecutor();

	@Test
	public void TC_001_verify_UpdateContract() throws TTransportException {

		Map<String, String> ids = new HashMap<String, String>();
		ids.put("requestId", "shrawan-20");

		// staging/production
//		TProtocol protocol = thriftExecutor.execute("10.10.115.103", 9142);

		// test
		// resId : 234634007
		// userId : 9505311
//		TProtocol protocol = thriftExecutor.execute("192.168.40.161", 9321);
//		TProtocol protocol = thriftExecutor.execute("192.168.40.61", 3030);
//		TProtocol protocol = thriftExecutor.execute("10.10.130.60", 9190);
		TProtocol protocol = thriftExecutor.execute("10.10.130.60", 9182);
//		TProtocol protocol = thriftExecutor.execute("10.10.130.60", 9190);
//		TProtocol protocol = thriftExecutor.execute("10.10.115.111", 9142);
		TUpdateResume.Client updateResumeClient = new TUpdateResume.Client(protocol);
		// 1 -UG
		// 2 -PG
//		List<TEducation> educations = new ArrayList<TEducation>();
//		TEducation education = new TEducation();
//		education.setEducationId(-1);
//		education.setResumeId(234634007);
//		education.setEducationTypeId(2);
//		education.setCourseId(13);
//		education.setSpecId(9999);
//		education.setYearOfCompletion(2015);
//		Data institute = new Data();
//		institute.setId(-1);
//		institute.setLabel("Jawaharlal Nehru Technological University (JNTU)");
//		institute.setValue("Jawaharlal Nehru Technological University (JNTU)");
//		education.setInstitute(institute);
//		education.setInstituteId(1043);
//		education.setCourseType("F");
//		education.setIsPremium("0");
//		education.setGradeId(1);
//		education.setMarks("9");
//		education.setDurationId(13);
//		educations.add(education);
//		TProfile profile = new TProfile();
//		profile.setResumeId(92249995);
//		List<Integer> jobRecoPrefId = new ArrayList<Integer>();
//		jobRecoPrefId.add(24);
//		jobRecoPrefId.add(9393);
//		jobRecoPrefId.add(5679);
//		jobRecoPrefId.add(6399);
//		jobRecoPrefId.add(1);
//		jobRecoPrefId.add(1);
//		profile.setJobRecoPrefId(jobRecoPrefId);

//		TUser user = new TUser();
//		user.setUserId(272091225);
//		user.setUsername("f157407472.1614");
//		user.setPassword("sefaf12e12e32");

//		List<TExperience> experienceList = new ArrayList<TExperience>();
//		TExperience experience = new TExperience();
//		experience.setExperienceId(-1);
//		experience.setResumeId(234634007);
//		experience.setOrganization("InfoEdge");
//		experience.setDesignation("Testing Engineer");
//		experience.setStartDate("2018-01-01");
//		experience.setEndDate("0000-00-00");
//		experience.setEmpType("C");
//		experience.setProfile("QA");
//		experience.setTeamManagedId(1);
//		experience.setKeywords("Testing");
//		experienceList.add(experience);
//
//		List<TLanguage> languages = new ArrayList<TLanguage>();
//		TLanguage language = new TLanguage();
//		language.setLanguageId(-1);
//		language.setResumeId(234672263);
//		language.set
//		List<List<String>> dirtyFields = new ArrayList<List<String>>();
//		List<String> dirtyField = new ArrayList<String>();
//		dirtyField.add("sid");
//		dirtyField.add("resumeId");
//		dirtyField.add("skillId");
//		dirtyField.add("version");
////		dirtyField.add("proflevel");
//		dirtyField.add("lastUsed");
//		dirtyField.add("experienceTime");
//		dirtyField.add("experienceId");
//		dirtyField.add("resumeId");
//		dirtyField.add("organization");
//		dirtyField.add("designation");
//		dirtyField.add("startDate");
//		dirtyField.add("endDate");
//		dirtyField.add("empType");
//		dirtyField.add("profile");
//		dirtyField.add("teamManagedId");
//		dirtyField.add("keywords");
//		dirtyField.add("userId");
//		dirtyField.add("username");
//		dirtyField.add("password");
//		dirtyField.add("resumeId");
//		dirtyField.add("jobRecoPrefId");
//		dirtyField.add("resumeId");
//		dirtyField.add("educationtypeId");
//		dirtyField.add("courseId");
//		dirtyField.add("specId");
//		dirtyField.add("yearOfCompletion");
//		dirtyField.add("institueId");
//		dirtyField.add("courseType");
//		dirtyField.add("isPremium");
//		dirtyField.add("gradeId");	
//		dirtyField.add("marks");
//		dirtyField.add("durationId");
//		dirtyFields.add(dirtyField);

//		TNoticePeriod noticePeriod = new TNoticePeriod();
//		noticePeriod.setNoticePeriodId(-1);
//		noticePeriod.setResumeId(234634007);
//		noticePeriod.setNotice_endDate("2020-04-3");
//		noticePeriod.setNextEmployer("InfoEdge");
//		noticePeriod.setOfferedDesig("SDET");
//		noticePeriod.setCurrency("I");
//		noticePeriod.setCtc("10.00");
//		
//		List<String> dirtyFields = new ArrayList<String>();
//		dirtyFields.add("noticePeriodId");
//		dirtyFields.add("resumeId");
//		dirtyFields.add("notice_endDate");
//		dirtyFields.add("nextEmployer");
//		dirtyFields.add("offeredDesig");
//		dirtyFields.add("ctc");
//		dirtyFields.add("currency");
		Integer appId = 105;

		// KIOSK-serviceTesting1@yopmail.com

//		TUser user = new TUser(); 
//		user.setUserId(272159598);
//		user.setUsername("mailerver14@yopmail.com");
//		user.setEmailVerification("B");
//		TProfile profile = new TProfile();
//		profile.setResumeId(234697815);
////		profile.setResumeId(234748472);
//		
////		profile.setUsername("testporting1@yopmail.com");
////		profile.setGender("M");
//		profile.setCityId(463);
//		Data city = new Data();
//		city.setId(463);
//		city.setValue("Chitradurga");
//		city.setLabel("Chitradurga");
////		city.setParentId(null);
//		profile.setCity(city);

//		Data disabilityType = new Data();
//		disabilityType.setId(-1);
//		disabilityType.setValue("");
//		disabilityType.setLabel("disability %testttttttt1");
//		disabilityType.setParentId(9999);
//		disabilityType.setLabelType("");
//		
//		TDisability disability = new TDisability();
//		disability.setResumeId(234677576);
//		disability.setDisabilityId(16851);
//		disability.setDisabilityTypeId(9999);
//		disability.setDisabilityType(disabilityType);
//		disability.setSubDisabilityTypeId(0);
//		disability.setRawSubDisabilityId("9999.0");
////		
//		List<String> dirtyField = new ArrayList<String>();
//		dirtyField.add("resumeId");
////		dirtyField.add("username");
////		dirtyField.add("gender");
//		dirtyField.add("city");
//		dirtyField.add("cityId");
//		dirtyField.add("disabilityId");
//		dirtyField.add("disabilityTypeId");
//		dirtyField.add("subDisabilityTypeId");
//		dirtyField.add("rawSubDisabilityId");
//		dirtyField.add("disabilityType");
//		dirtyField.add("city");

//		Data city = new Data();
//		city.setId(-1);
//		city.setValue("ajfbasdjhfbgasdjhkfbgh");
//		city.setLabel("ajfbasdjhfbgasdjhkfbgh");
//		city.setParentId(9999);
//		profile.setMailCity(city);

//		TProfile profile = new TProfile();
//		profile.setResumeId(92249995);
//		profile.setMailCityId(4521901);
//		profile.setCityId(207);
//		profile.setCityId(40);
//		Data Mcity = new Data();
//		Mcity.setId(0);
//		Mcity.setValue("");
//		Mcity.setLabel("");
//		Mcity.setParentId(9999);
//		profile.setMailCity(Mcity);
//		
//		List<String> dirtyField = new ArrayList<String>();	
////		dirtyField.add("userId");
//		dirtyField.add("resumeId");
//		dirtyField.add("mailCityId");
//		dirtyField.add("cityId");
////		dirtyField.add("city");	
//		dirtyField.add("emailVerification");

//		List<TITSkill> skills = new ArrayList<TITSkill>();
//		TITSkill skill = new TITSkill();
//		skill.setSid(-1);
//		skill.setResumeId(234677576);
//		skill.setVersion("1.0");
//		skill.setLastUsed(2009);
//		skill.setExperienceTime("3");
//		
//		List<List<String>> dirtyFields = new ArrayList<List<String>>();
		
//		List<TExperience> experiences = new ArrayList<TExperience>();
//		TExperience experience = new TExperience();
//		experience.setExperienceId(-1);
//		experience.setResumeId(234748472);
//		experience.setOrganization("InfoEdge");
//		experience.setDesignation("Testing Engineer");
//		experience.setStartDate("2019-01-01");
//		experience.setEndDate("0000-00-00");
//		experience.setEmpType("C");
//		experience.setProfile("QA");
//		experience.setTeamManagedId(1);
//		experience.setKeywords("Testing");
////		experience.setOrganizationId("12345678909876543234567890987654321wertyuioplkjh2");
//		experiences.add(experience);
//		
//		List<List<String>> dirtyFields = new ArrayList<List<String>>();
//		List<String> dirtyField = new ArrayList<String>();
//		dirtyField.add("experienceId");
//		dirtyField.add("resumeId");
//		dirtyField.add("organization");
//		dirtyField.add("designation");
//		dirtyField.add("startDate");
//		dirtyField.add("endDate");
//		dirtyField.add("empType");
//		dirtyField.add("profile");
//		dirtyField.add("teamManagedId");
//		dirtyField.add("keywords");
////		dirtyField.add("organizationId");
//		dirtyFields.add(dirtyField);
//		
//		TUser user = new TUser();
//		user.setUserId(-1);
//		user.setUsername("testcompany2@yopmail.com");
//		user.setMobile("919898989218");
//		user.setEmail("testcompany2@yopmail.com");
//		user.setResdexVisibility("a");
//		user.setMailer("0010110111");
//		user.setMailer2("0000001111");
//		user.setEmailVerification("A");
//		user.setAccountCreationSource("r3");
//		user.setServiceType("N");
//		user.setSourceTemp("r3");
//		user.setPassword("aaaaaa");
//		
//		List<String> df = new ArrayList<String>();
//		df.add("userId");
//		df.add("username");
//		df.add("mobile");
//		df.add("email");
//		df.add("password");
//		df.add("emailVerification");
//		df.add("resdexVisibility");
//		df.add("accountCreationSource");
//		df.add("sourceTemp");
//		df.add("serviceType");
//		df.add("mailer");
//		df.add("mailer2");
		
//		TProfile profile = new TProfile();
//		profile.setResumeId(175733680);
//		profile.setFuncAreaId(41);
//		Data funcArea = new Data();
//		funcArea.setId(-1);
//		funcArea.setValue("Otjhfher");
//		funcArea.setLabel("Otjhfher");
//		funcArea.setParentId(9999);
//		profile.setFuncArea(funcArea);
//		profile.setCountry(11);
//		Data city = new Data();
//		city.setId(-1);
//		city.setValue("Gaya");
//		city.setLabel("Gaya");
//		city.setParentId(9999);
//		profile.setMailCity(city);
//		
//		List<String> dirtyField = new ArrayList<String>();
//		dirtyField.add("resumeId");
//////		dirtyField.add("cityId");
//		dirtyField.add("funcAreaId");
//		dirtyField.add("country");
//		dirtyField.add("funcArea");
//		dirtyField.add("mailCityId");
//		dirtyField.add("city");
//		dirtyField.add("mailCity");
		
//		List<TEducation> educations = new ArrayList<TEducation>();
//		TEducation education = new TEducation();
//		education.setResumeId(175733680);
//		education.setEducationTypeId(2);
//		education.setCourseId(18);
//		education.setSpecId(1);
//		education.setYearOfCompletion(0);
//		education.setInstituteId(9999);
//		education.setCourseType("F");
//		Data data = new Data();
//		data.setId(2);
//		data.setValue("Masters/Post-Graduation");
//		data.setLabel("Masters/Post-Graduation");
//		data.setParentId(0);
//		education.setEducationType(data);
//		Data inData = new Data();
//		inData.setId(-1);
//		inData.setValue("24323432");
//		inData.setLabel("24323432");
//		inData.setParentId(9999);
//		education.setInstitute(inData);
//		education.setEducationId(-1);
//		education.setRawSpecId("18.1");
//		educations.add(education);
//		
//		List<List<String>>	dirtyFields = new ArrayList<List<String>>();
//		List<String> dirtyField = new ArrayList<String>();
//		dirtyField.add("resumeId");
//		dirtyField.add("educationTypeId");
//		dirtyField.add("courseId");
//		dirtyField.add("specId");
//		dirtyField.add("instituteId");
//		dirtyField.add("courseType");
//		dirtyField.add("educationType");
//		dirtyField.add("institute");
//		dirtyField.add("rawSpecId");
//		dirtyField.add("educationId");
//		dirtyFields.add(dirtyField);
		
//		List<TITProject> projects = new ArrayList<TITProject>();
//		TITProject project = new TITProject();
//		project.setResumeId(175733680);
//		project.setProjectId(-1);
//		project.setDetails("Test details");
//		project.setClient("#%<>{}=;");
////		project.setClientId("510");
//		projects.add(project);
//		
//		List<List<String>> dirtyFields = new ArrayList<List<String>>();
//		List<String> dirtyField = new ArrayList<String>();
//		dirtyField.add("resumeId");
//		dirtyField.add("projectId");
//		dirtyField.add("details");
//		dirtyField.add("client");
////		dirtyField.add("clientId");
//		dirtyFields.add(dirtyField);
		
		List<TExperience> experiences = new ArrayList<TExperience>();
		TExperience experience = new TExperience();
		experience.setExperienceId(-1);
		experience.setResumeId(175733680);
		experience.setOrganization("Edista Testing Institute");
		experience.setOrganizationId("151456");
//		experience.setDesignation("Edista Testing Institute");
		experience.setStartDate("2019-07-01");
		experience.setEndDate("0000-00-00");
		experience.setEmpType("C");
//		experience.setProfile("QA");
//		experience.setTeamManagedId(1);
//		experience.setKeywords("Testing");
		experiences.add(experience);

		List<List<String>> dirtyFields = new ArrayList<List<String>>();
		List<String> dirtyField = new ArrayList<String>();
		dirtyField.add("experienceId");
		dirtyField.add("resumeId");
		dirtyField.add("organization");
		dirtyField.add("organizationId");
//		dirtyField.add("designation");
		dirtyField.add("startDate");
		dirtyField.add("endDate");
//		dirtyField.add("empType");
//		dirtyField.add("profile");
//		dirtyField.add("teamManagedId");
//		dirtyField.add("keywords");
		dirtyFields.add(dirtyField);
		
//		TNoticePeriod noticePeriod = new TNoticePeriod();
//		noticePeriod.setResumeId(175733680);
//		noticePeriod.setNoticePeriodId(-1);
//		noticePeriod.setNextEmployer("#%<>{}=;");
////		noticePeriod.setNextEmployerId("510");
//		noticePeriod.setNotice_endDate("2020-09-01");
//		noticePeriod.setOfferedDesig("Software Developer");
//		noticePeriod.setCurrency("I");
//		noticePeriod.setCtc("11.0");
//		
//		List<String> dirtyFields = new ArrayList<String>();
//		dirtyFields.add("resumeId");
//		dirtyFields.add("noticePeriodId");
//		dirtyFields.add("nextEmployer");
////		dirtyFields.add("nextEmployerId");
//		dirtyFields.add("notice_endDate");
//		dirtyFields.add("offeredDesig");
//		dirtyFields.add("currency");
//		dirtyFields.add("ctc");
		
//		TProfile profile = new TProfile();
//		profile.setResumeId(175733680);
//		profile.setCityId(600);
////		profile.setCountry(11);
////		Data city = new Data();
////		city.setId(-1);
////		city.setValue("Hukumpeta");
////		city.setLabel("Hukumpeta");
////		city.setParentId(9999);
////		profile.setMailCity(city);
//		
//		List<String> dirtyField = new ArrayList<String>();
//		dirtyField.add("resumeId");
////		dirtyField.add("mailCity");
//		dirtyField.add("cityId");
		
		try {
			System.out.println(System.currentTimeMillis());
//			TUpdateResult updateResult = updateResumeClient.saveUser(ids, 105, user, "now", "resman5_1", df);
//			List<TUpdateResult> updateResult = updateResumeClient.saveExperiences(ids, 105, experiences, "now", "resman5_1", dirtyFields);
//			System.out.println(updateResult);
//			TUpdateResult updateResult = updateResumeClient.saveProfile(ids, 105, profile, "now", "resman5_1",
//					dirtyField);
//			List<TUpdateResult> updateResult = updateResumeClient.saveEducations(ids, appId, educations, "now", "resman5_1", dirtyFields);
//			TUpdateResult updateResult = updateResumeClient.deleteEducation(ids, appId, 175733680, 210203250, "now", "resman5_1");
//			TUpdateResult updateResult = updateResumeClient.saveDisability(ids, 105, disability, "Y", "now", "resman5_1", dirtyField);
//			List<TUpdateResult> updateResult = updateResumeClient.saveITProjects(ids, 107, projects, "now", "resman5_1", dirtyFields);
			
			List<TUpdateResult> updateResult = updateResumeClient.saveExperiences(ids, 107, experiences, "now", "resman5_1", dirtyFields);
			
//			TUpdateResult updateResult = updateResumeClient.saveNoticePeriod(ids, 107, noticePeriod, "now", "resman5_1", dirtyFields);
			
			System.out.println(System.currentTimeMillis());
//			List<TUpdateResult> updateResult = updateResumeClient.saveITSkills(ids, 105, skills, "now", "resman5_1", dirtyFields);
//			updateResumeClient.updateProfileFlagFromResumeId(ids, 105, -1, "now", "resman5_1");
//			TUpdateResult updateResult = updateResumeClient.saveUser(ids, 105, user, "now", "resman5_1", dirtyField);
//			Map<String, TUpdateResult> updateResult = updateResumeClient.deleteProfile(ids, 104, 234668591, "test-servces@yopmail.com", "now", "resman5_1");
////			System.out.println(updateResumeClient.updatePassword(ids, 105, 272091226, "123456", "aefgase2342", "now", "resman5_1"));
////			System.out.println(updateResumeClient.resetPassword(ids, 105, "f157407480.1325", "234567dfghvb", "now", "resman5_1"));
//			List<TUpdateResult> updateResult = updateResumeClient.saveEducations(ids, appId, educations, "now", "resman5_1",
//					dirtyFields);
//			System.out.println(updateResumeClient.deleteEducation(ids, 105, 92249995, 147574173, "now", "resman5_1"));

//			List<TUpdateResult> updateResult = updateResumeClient.saveExperiences(ids, appId, experienceList, "now",
//					"resman5_1", dirtyFields);
//			TUpdateResult updateResult = updateResumeClient.updateUserProperties(ids, appId, userProperties,
//					"KIOSK-serviceTesting@yopmail.com", "now", "resman5_1");
//			TResponse updateResult = updateResumeClient.resetPassword(ids, appId, "KIOSK-serviceTesting@yopmail.com", "a34562344", "now", "resman5_1");
//			updateResumeClient.updateModDate(ids, 105, null, "now", "resman5_1");
//			updateResumeClient.updateResdexFlagFromUserId(ids, appId, "now", "resman5_1", 272106219, "A");
//			updateResumeClient.updateProfileFlagFromResumeId(ids, appId, 234677576, "now", "resman5_1");
			System.out.println(updateResult);
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] agrs) throws TTransportException{
//		Map<String, String> ids = new HashMap<String, String>();
//		ids.put("requestId", "shrawan-20");
//		
//		TProtocol protocol = thriftExecutor.execute(agrs[0].trim(), Integer.parseInt(agrs[1].trim()));
//		TUpdateResume.Client updateResumeClient = new TUpdateResume.Client(protocol);
//		int appId = Integer.parseInt(agrs[2].trim());
//		int projectId = Integer.parseInt(agrs[3].trim());
//		
//		Scanner sc = new Scanner(System.in);
//		String org = sc.nextLine();
//		List<TITProject> projects = new ArrayList<TITProject>();
//		TITProject project = new TITProject();
//		project.setResumeId(234748472);
//		project.setProjectId(projectId);
//		project.setDetails("Test details");
//		project.setClient(org);
////		project.setClientId(agrs[3].trim());
//		projects.add(project);
//		
////		TITProject project1 = new TITProject();
////		project1.setResumeId(234697815);
////		project1.setProjectId(11037683);
////		project1.setDetails("Test details1");
//////		project1.setClient("Test cleint6");
////		project1.setClientId("12345678909876543234567890987654321wertyuioplkjh2");
////		projects.add(project1);
//		
//		List<List<String>> dirtyFields = new ArrayList<List<String>>();
//		List<String> dirtyField = new ArrayList<String>();
//		dirtyField.add("resumeId");
//		dirtyField.add("projectId");
//		dirtyField.add("details");
//		dirtyField.add("client");
////		dirtyField.add("clientId");
//		dirtyFields.add(dirtyField);
//		
////		List<String> dirtyField1 = new ArrayList<String>();
////		dirtyField1.add("resumeId");
////		dirtyField1.add("projectId");
////		dirtyField1.add("details");
//////		dirtyField1.add("client");
////		dirtyField1.add("clientId");
////		dirtyFields.add(dirtyField1);
//		try {
//			System.out.println(System.currentTimeMillis());
//			List<TUpdateResult> updateResult = updateResumeClient.saveITProjects(ids, appId, projects, "now", "resman5_1", dirtyFields);
//			System.out.println(System.currentTimeMillis());
//			System.out.println(updateResult);
//		} catch (TException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
//	public static void main(String[] agrs) throws TTransportException {
//		Map<String, String> ids = new HashMap<String, String>();
//		ids.put("requestId", "shrawan-20");
//
////		TProtocol protocol = thriftExecutor.execute("192.168.40.161", 9311);
//		TProtocol protocol = thriftExecutor.execute(agrs[0].trim(), Integer.parseInt(agrs[1].trim()));
//		TUpdateResume.Client updateResumeClient = new TUpdateResume.Client(protocol);
//		
//		int choose = Integer.parseInt(agrs[2].trim());
//		
//		Scanner sc = new Scanner(System.in);
//		String data = sc.nextLine();
//		
//		TProfile profile = new TProfile();
//		profile.setResumeId(234748472);
////		profile.setCountry(11);
//		Data city = new Data();
//		city.setId(-1);
//		city.setValue(data);
//		city.setLabel(data);
//		city.setParentId(9999);
//		if(choose == 1) {
//			profile.setCity(city);
//		}else if(choose == 2){
//			profile.setMailCity(city);
//		}else if(choose == 3){
//			profile.setCityId(Integer.parseInt(data));
//		}else {
//			profile.setMailCityId(Integer.parseInt(data));
//		}
////		Data funcArea = new Data();
////		funcArea.setId(-1);
////		funcArea.setValue("Other");
////		funcArea.setLabel("Other");
////		funcArea.setParentId(9999);
////		profile.setFuncArea(funcArea);
//		
//		List<String> dirtyField = new ArrayList<String>();
//		dirtyField.add("resumeId");
////		dirtyField.add("cityId");
////		dirtyField.add("mailCityId");
//		if(choose == 1) {
//			dirtyField.add("city");
//		}else if(choose == 2){
//			dirtyField.add("mailCity");
//		}else if(choose == 3){
//			dirtyField.add("cityId");
//		}else {
//			dirtyField.add("mailCityId");
//		}
////		dirtyField.add("funcArea");
//		
//		try {
////			List<TUpdateResult> updateResult = updateResumeClient.saveEducations(ids, 105, educations, "now",
////					"resman5_1", dirtyFields);
//			System.out.println(System.currentTimeMillis());
//			TUpdateResult updateResult = updateResumeClient.saveProfile(ids, 105, profile, "now", "resman5_1",
//					dirtyField);
//			System.out.println(System.currentTimeMillis());
//			System.out.println(updateResult);
//		} catch (TException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		sc.close();
//	}
	
	public static void main(String[] agrs) throws TTransportException {
		Map<String, String> ids = new HashMap<String, String>();
		ids.put("requestId", "shrawan-20");

//		TProtocol protocol = thriftExecutor.execute("192.168.40.161", 9311);
		TProtocol protocol = thriftExecutor.execute(agrs[0].trim(), Integer.parseInt(agrs[1].trim()));
		TUpdateResume.Client updateResumeClient = new TUpdateResume.Client(protocol);
		
		try {
			System.out.println(System.currentTimeMillis());
			TUpdateResult updateResult = updateResumeClient.markPending(ids, 105, 234748472, "video_profile", "now", "resman5_1");
			System.out.println(System.currentTimeMillis());
			System.out.println(updateResult);
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public static void main(String[] args) throws NumberFormatException, TTransportException {
//		ThriftExecutor thriftExecutor = new ThriftExecutor();
//
//		Map<String, String> ids = new HashMap<String, String>();
//		ids.put("requestId", "shrawan-20");
//
//		String serverIp = args[0].trim();
//		int serverPort = Integer.parseInt(args[1].trim());
//		int appId = Integer.parseInt(args[2].trim());
//		int expId = Integer.parseInt(args[3].trim());
//		TProtocol protocol = thriftExecutor.execute(serverIp, serverPort);
//		TUpdateResume.Client updateResumeClient = new TUpdateResume.Client(protocol);
//		Scanner sc = new Scanner(System.in);
//		String orgName = sc.nextLine();
//		
//		try {
//			List<TExperience> experiences = new ArrayList<TExperience>();
//			TExperience experience = new TExperience();
//			experience.setExperienceId(expId);
//			experience.setResumeId(234748472);
//			experience.setOrganization(orgName);
////			experience.setOrganizationId(args[3].trim());
//			experience.setDesignation("Testing Engineer");
//			experience.setStartDate("2019-01-01");
//			experience.setEndDate("0000-00-00");
//			experience.setEmpType("C");
//			experience.setProfile("QA");
//			experience.setTeamManagedId(1);
//			experience.setKeywords("Testing");
//			experiences.add(experience);
//
////			TExperience experience1 = new TExperience();
////			experience1.setExperienceId(-1);
////			experience1.setResumeId(resId);
////			experience1.setOrganization("Paytm");
////			experience1.setDesignation("QA Engineer");
////			experience1.setStartDate("2018-01-01");
////			experience1.setEndDate("2018-12-31");
////			experience1.setEmpType("P");
////			experience1.setProfile("QA");
////			experience1.setTeamManagedId(1);
////			experience1.setKeywords("Testing");
////			experiences.add(experience1);
////
////			TExperience experience2 = new TExperience();
////			experience2.setExperienceId(-1);
////			experience2.setResumeId(resId);
////			experience2.setOrganization("TCS");
////			experience2.setDesignation("QA Engineer");
////			experience2.setStartDate("2016-01-01");
////			experience2.setEndDate("2017-12-31");
////			experience2.setEmpType("O");
////			experience2.setProfile("QA");
////			experience2.setTeamManagedId(1);
////			experience2.setKeywords("Testing");
////			experiences.add(experience2);
//
//			List<List<String>> dirtyFields = new ArrayList<List<String>>();
//			List<String> dirtyField = new ArrayList<String>();
//			dirtyField.add("experienceId");
//			dirtyField.add("resumeId");
//			dirtyField.add("organization");
////			dirtyField.add("organizationId");
//			dirtyField.add("designation");
//			dirtyField.add("startDate");
//			dirtyField.add("endDate");
//			dirtyField.add("empType");
//			dirtyField.add("profile");
//			dirtyField.add("teamManagedId");
//			dirtyField.add("keywords");
//			dirtyFields.add(dirtyField);
//			
////			List<String> dirtyField1 = new ArrayList<String>();
////			dirtyField1.add("experienceId");
////			dirtyField1.add("resumeId");
////			dirtyField1.add("organization");
////			dirtyField1.add("designation");
////			dirtyField1.add("startDate");
////			dirtyField1.add("endDate");
////			dirtyField1.add("empType");
////			dirtyField1.add("profile");
////			dirtyField1.add("teamManagedId");
////			dirtyField1.add("keywords");
////			dirtyFields.add(dirtyField1);
////			
////			List<String> dirtyField2 = new ArrayList<String>();
////			dirtyField2.add("experienceId");
////			dirtyField2.add("resumeId");
////			dirtyField2.add("organization");
////			dirtyField2.add("designation");
////			dirtyField2.add("startDate");
////			dirtyField2.add("endDate");
////			dirtyField2.add("empType");
////			dirtyField2.add("profile");
////			dirtyField2.add("teamManagedId");
////			dirtyField2.add("keywords");
////			dirtyFields.add(dirtyField2);
//			
//			List<TUpdateResult> updateResult = updateResumeClient.saveExperiences(ids, appId, experiences, "now", "resman5_1", dirtyFields);
//			System.out.println(updateResult);
//
//		} catch (TException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
