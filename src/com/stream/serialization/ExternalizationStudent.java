package com.stream.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizationStudent implements Externalizable{

	private String sId;
	private String sName;
	private String sEmail;
	private String sMobile;
	
	
	public ExternalizationStudent() {
		super();
	}

	public ExternalizationStudent(String sId, String sName, String sEmail, String sMobile) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sEmail = sEmail;
		this.sMobile = sMobile;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		String[] sIdArr = sId.split("-");
		int id = Integer.parseInt(sIdArr[1]);
		String[] emailArr = sEmail.split("@");
		String email = emailArr[0];
		
		out.writeInt(id);
		out.writeUTF(sName);
		out.writeUTF(email);
		out.writeUTF(sMobile);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		this.sId = "DSS-"+in.readInt();
		this.sName = in.readUTF();
		this.sEmail = in.readUTF()+"@gmail.com";
		this.sMobile = in.readUTF();
		
	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsMobile() {
		return sMobile;
	}

	public void setsMobile(String sMobile) {
		this.sMobile = sMobile;
	}

	@Override
	public String toString() {
		return "ExternalizationStudent [sId=" + sId + ", sName=" + sName + ", sEmail=" + sEmail + ", sMobile=" + sMobile
				+ "]";
	}
	
}
