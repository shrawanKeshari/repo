package com.test.thrift.ThriftService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TTransportException;

import com.naukri.services.resume.thrift9.TProfile;
import com.naukri.services.resume.update.thrift9.TUpdateResult;
import com.naukri.services.resume.update.thrift9.TUpdateResume;

public class ResumeViewServiceJarCodeTest {

	public static void main(String[] args) throws NumberFormatException, TTransportException {
		ThriftExecutor thriftExecutor = new ThriftExecutor();

		Map<String, String> ids = new HashMap<String, String>();
		ids.put("requestId", "shrawan-20");

		String serverIp = args[0].trim();
		int serverPort = Integer.parseInt(args[1].trim());
		String modDateUpdateType = args[2].trim();

		TProtocol protocol = thriftExecutor.execute(serverIp, serverPort);
		TUpdateResume.Client updateResumeClient = new TUpdateResume.Client(protocol);

		try {
			TProfile profile = new TProfile();
			profile.setResumeId(234677576);
			profile.setGender("T");

			List<String> dirtyField = new ArrayList<String>();
			dirtyField.add("resumeId");
			dirtyField.add("gender");

			TUpdateResult updateResult = updateResumeClient.saveProfile(ids, 105, profile, modDateUpdateType,
					"resman5_1", dirtyField);
			System.out.println(updateResult);

		} catch (TException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
