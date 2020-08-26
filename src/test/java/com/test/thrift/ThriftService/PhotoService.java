package com.test.thrift.ThriftService;

import com.ie.naukri.PhotoDetails;
import com.ie.naukri.PhotoHashGeneration;
import com.ie.naukri.PhotoServiceException;

public class PhotoService {

	public static void main(String[] args) {
		try {
			PhotoHashGeneration photoHashGeneration = new PhotoHashGeneration("NaukriGulfJobSeeker", "1");
			PhotoDetails photoDetails = new PhotoDetails();
			photoDetails.setUserId("2664676");
			photoDetails.setGender("F");
//			photoDetails.setUploadDate("2020-05-11 13:49:03");
			photoDetails.setCategory("NGJS");
			String hash = photoHashGeneration.getPhotoHashIdFromDetails(photoDetails);
			System.out.println(hash);
			System.out.println(photoHashGeneration.getPhotoDetailsFromHashId(hash));
		} catch (PhotoServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
