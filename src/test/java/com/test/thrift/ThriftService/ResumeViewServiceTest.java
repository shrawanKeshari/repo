package com.test.thrift.ThriftService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransportException;
import org.testng.annotations.Test;

import com.naukri.services.data.dropdown.thrift.TDropDownDataService;
import com.naukri.services.resume.thrift9.ResumeNotFoundException;
import com.naukri.services.resume.thrift9.ResumeServiceException;
import com.naukri.services.resume.thrift9.TResumeService;
import com.naukri.services.resume.thrift9.UserNotFoundException;
import com.naukri.services.staticdata.thrift9.Data;

public class ResumeViewServiceTest {

	static ThriftExecutor thriftExecutor = new ThriftExecutor();

	@Test
	public void TC_001_verify_GetContract() throws TTransportException {

		Map<String, String> ids = new HashMap<String, String>();
		ids.put("requestId", "shrawan-20");

		// stating/production
//		TProtocol protocol = thriftExecutor.execute("10.10.115.110", 6791);
		TProtocol protocol = thriftExecutor.execute("10.10.130.60", 7971);
//		TProtocol protocol = thriftExecutor.execute("10.10.130.60", 6771);
//		TProtocol protocol = thriftExecutor.execute("10.10.115.111", 6791);

		// test
//		TProtocol protocol = thriftExecutor.execute("192.168.40.161", 9311);
//		TProtocol protocol = thriftExecutor.execute("resume-thrift-services-v4-service.naukri-services-test2", 80);
//		TProtocol protocol = thriftExecutor.execute("192.168.40.61", 3031);
//		TProtocol protocol = thriftExecutor.execute("192.168.40.61", 9311);
//		TDropDownDataService.Client test = new TDropDownDataService.Client(protocol);
		TResumeService.Client resumeServiceClient = new TResumeService.Client(protocol);
		List<Integer> resumeIds = new ArrayList<Integer>();
		resumeIds.add(234748472);

		List<String> arrayProfileFlags = Arrays.asList("y", "a", "x", "f", "z", "t", "m", "b", "r", "l", "s", "c", "p");
		try {
//			System.out.println(resumeServiceClient.getPartialActiveProfileFromUserId(ids, 105, 272255194, 3, "resman5_1"));
			System.out.println(System.currentTimeMillis());
			System.out.println(resumeServiceClient.getProfileCompletionWithCvFromUsername(ids, 105,
					"serviceTest@yopmail.com", "resman5_1"));
//			System.out.println(resumeServiceClient.getPartialActiveProfileFromUsername(ids, 105,
//					"dogsarebarkingonmyphone@gmail.com", 10, "resman5_slave"));
			System.out.println(System.currentTimeMillis());
//			System.out.println(resumeServiceClient.getAllProfilesFromUsernameBasedOnProfileFlag(ids, 105, "apply-testing-21@yopmail.com", 1, arrayProfileFlags , "resman5_1"));
//			System.out.println(resumeServiceClient.getProfileCompletionWithCvFromResumeId(ids, 105, 151090375, "resman5_1"));
//			System.out.println(resumeServiceClient.getNoticePeriod(ids, 105, 175733680, "resman5_1"));
//			System.out.println(resumeServiceClient.getCriticalActionsFromUsername(ids, 106, "testKrati1@yopmail.com", "resman5_1"));
//			System.out.println(resumeServiceClient.getFullActiveProfileFromUserId(ids, 105, 155071311, "resman5_1"));
//			System.out.println(resumeServiceClient.getAllPermanentProfilesFromUsername(ids, 105, "apply-testing-21@yopmail.com", 1, "resman5_1"));
//			System.out.println(resumeServiceClient.authenticateUserByEmail(ids, 105, "testkrati1@yopmail.com", "aaaaaa", "resman5_1"));
//			System.out.println(System.currentTimeMillis());
//			String[] labelArray = {"Blindness", "Low Vision", "Hearing Impairment", "Speech and Language disability", "Locomotor Disability", "Leprosy Cured Person", "Cerebral Palsy", "Dwarfism", "Muscular Dystrophy", "Acid Attack Victims", "Specific Learning Disabilities", "Autism Spectrum Disorder", "Mental Illness", "Haemophilia", "Sickle Cell Disease", "Thalassemia", "Parkinson's Disease", "Intellectual disability", "Chronic neurological conditions", "Multiple Sclerosis", "Multiple Disabilities including Deaf Blindness", "Others"};
//			String[] idArray = {"11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "9999"};
//			String[] labelTypeArray = {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L"};
//			List<String> labelList = new LinkedList<String>(Arrays.asList(labelArray));
//			List<String> idList = new LinkedList<String>(Arrays.asList(idArray));
//			List<String> labelTypeList = new LinkedList<String>(Arrays.asList(labelTypeArray));
//			System.out.println(test.getList(ids, 8, "SUBDISABILITY", 1));
//			List<Data> list1 = test.getList(ids, 8, "SUBDISABILITY", 1);
//			int size = list1.size();
//			for(int i = 0; i < size; i++) {
//				Data data = list1.get(i);
//				String label = data.getLabel();
//				String id = String.valueOf(data.getId());
//				String labelType = data.getLabelType();
//				labelList.remove(label);
//				idList.remove(id);
//				labelTypeList.remove(labelType);
//			}
//			System.out.println(labelList.size() + " , " + idList.size() + " , " + labelTypeList.size());
//			System.out.println(resumeServiceClient.getUserFromMobileNumber(ids, 105, "9911220005", 10, "resman5_1"));
			System.out.println(System.currentTimeMillis());
//			System.out.println(resumeServiceClient.getFullActiveProfileFromUsername(ids, 112, "aj555@yopmail.com", "resman5_1"));
//			System.out.println(resumeServiceClient.getUserFromEmail(ids, 105, "swati123@yopmail.com", 1, "resman5_1"));

			System.out.println(System.currentTimeMillis());
//			System.out.println(resumeServiceClient.getPartialProfileFromResumeId(ids, 105, 234786624, 2, "resman5_1"));
			System.out.println(System.currentTimeMillis());
//			System.out.println(resumeServiceClient.getPartialActiveProfileFromUserId(ids, 105, 272138958, 258, "resman5_2"));
//			System.out.println(updateResumeClient.deleteAccount(ids, 105, "rishabh.madhesiya@gmail.com", "now", "resman5_1"));
//			System.out.println(resumeServiceClient.getFullProfileFromResumeId(ids, 105, 234673133, "resman5_1"));
//			System.out.println(resumeServiceClient.authenticateUserByUsername(ids, 105, "testporting1@yopmail.com", "naukri123", "resman5_1"));
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] agrs) throws TTransportException {
		Map<String, String> ids = new HashMap<String, String>();
		ids.put("requestId", "shrawan-20");

		TProtocol protocol = thriftExecutor.execute(agrs[0], Integer.parseInt(agrs[1]));
		TResumeService.Client resumeServiceClient = new TResumeService.Client(protocol);
		
		try {
			System.out.println(
					resumeServiceClient.getPartialProfileFromResumeId(ids, 105, 234748472, 262144, "resman5_1"));
		} catch (TException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		int getVal = Integer.parseInt(agrs[2]);
		int appId = Integer.parseInt(agrs[3]);
		int resId = 234748472;
		String username = "testKrati1@yopmail.com";
		int userId = 272171182;
		try {
			switch (getVal) {
			case 1:
				System.out.println(
						resumeServiceClient.getProfileCompletionWithCvFromResumeId(ids, appId, resId, "resman5_1"));
				break;

			case 2:
				System.out.println(resumeServiceClient.getProfileCompletionWithCvFromUsername(ids, appId,
						username, "resman5_1"));
				break;

			case 3:
				System.out.println(resumeServiceClient.getProfileCompletionFromUsername(ids, appId,
						username, "resman5_1"));
				break;

			case 4:
				System.out.println(resumeServiceClient.getFullActiveProfileFromUserId(ids, appId, userId, "resman5_1"));
				break;

			case 5:
				System.out.println(resumeServiceClient.getFullActiveProfileFromUsername(ids, appId,
						username, "resman5_1"));
				break;

			case 6:
				List<Integer> list = new ArrayList<Integer>();
				list.add(resId);
				System.out.println(resumeServiceClient.getProfilesFromResumeIds(ids, appId, list, "resman5_slave"));
				break;

			case 7:
				System.out.println(
						resumeServiceClient.getPartialActiveProfileFromUserId(ids, appId, userId, 1026, "resman5_1"));
				break;

			case 8:
				System.out.println(resumeServiceClient.getAllProfilesFromUsername(ids, appId, username, 1026,
						"resman5_1"));
				break;

			case 9:
				System.out.println(resumeServiceClient.getAllPermanentProfilesFromUsername(ids, appId,
						username, 1026, "resman5_1"));
				break;

			case 10:
				System.out.println(resumeServiceClient.getPartialActiveProfileFromUsername(ids, appId,
						username, 1026, "resman5_1"));
				break;

			case 11:
				System.out.println(
						resumeServiceClient.getPartialProfileFromResumeId(ids, appId, resId, 1026, "resman5_1"));
				break;

			case 12:
				System.out.println(resumeServiceClient.getNoticePeriod(ids, appId, resId, "resman5_1"));
				break;
				
			case 13:
				int project = Integer.parseInt(agrs[4]);
				System.out.println(resumeServiceClient.getProject(ids, appId, project, resId, "resman5_1"));
				break;
				
			case 14:
				int expId = Integer.parseInt(agrs[4]);
				System.out.println(resumeServiceClient.getExperience(ids, appId, expId, resId, "resman5_1"));
				break;

			case 15:
				List<String> arrayProfileFlags = Arrays.asList("y", "a", "x", "f", "z", "t", "m", "b", "r", "l", "s",
						"c", "p");
				System.out.println(resumeServiceClient.getAllProfilesFromUsernameBasedOnProfileFlag(ids, appId,
						username, 1026, arrayProfileFlags, "resman5_1"));
				break;

			case 16:
				System.out.println(resumeServiceClient.getUserFromUserId(ids, appId, userId, "resman5_1"));
				break;
				
			case 17:
				System.out.println(resumeServiceClient.getUserFromUsername(ids, appId, username, "resman5_1"));
				break;
				
			case 18:
				System.out.println(resumeServiceClient.getUserFromEmail(ids, appId, username, 34, "resman5_1"));
				break;
			}
		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public static void main(String[] args) {
//		String[] one = {"Blindness","Low-vision","Leprosy Cured persons","Hearing Impairment","Locomotor Disability","Dwarfism","Intellectual Disability","Mental Illness","Autism Spectrum Disorder","Cerebral Palsy","Muscular Dystrophy","Chronic Neurological conditions","Specific Learning Disabilities","Multiple Sclerosis","Speech and Language disability","Thalassemia","Hemophilia","Sickle Cell disease","Multiple Disabilities including deafblindness","Acid Attack victim","Parkinson's disease"};
//		String[] two = {"Acid Attack Victims","Autism Spectrum Disorder","Blindness","Cerebral Palsy","Chronic neurological conditions","Dwarfism","Haemophilia","Hearing Impairment","Intellectual disability","Leprosy Cured Person","Locomotor Disability","Low Vision","Mental Illness","Multiple Disabilities including Deaf Blindness","Multiple Sclerosis","Muscular Dystrophy","Parkinson's Disease","Sickle Cell Disease","Specific Learning Disabilities","Speech and Language disability","Thalassemia"};
//		
//		List<String> list1 = Arrays.asList(one);
//		List<String> list2 = Arrays.asList(two);
//		
//		Collections.sort(list1);
//		Collections.sort(list2);
//		
//		System.out.println(list1.size()==list2.size());
//		System.out.println(list1.containsAll(list2));
//	}
}
