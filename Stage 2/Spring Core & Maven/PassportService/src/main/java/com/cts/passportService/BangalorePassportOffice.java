package com.cts.passportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Type your code here
@Component
public class BangalorePassportOffice implements HeadPassportOffice {
	
	@Autowired
	private Document bangaloreDocument;
		
    // Type your code here
	public BangalorePassportOffice(Document bangaloreDocument) {
		super();
		this.bangaloreDocument = bangaloreDocument;
	}

	@Override
	public void doPhotoVerification() {
		// TODO Auto-generated method stub
		System.out.println("Photo verification done using " + bangaloreDocument.getIdProof());
	}

	@Override
	public void issuePassport() {
		// TODO Auto-generated method stub
		System.out.println("Passport issue is in progress for " + bangaloreDocument.getName() + " from "
				+ bangaloreDocument.getCity() + " office");
	}

	
	// Type your code here

	

}
