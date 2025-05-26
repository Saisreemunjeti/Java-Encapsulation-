package com.school1;

public class School {
	
	private String schoolName;
	private String schoolAddress;
	private String schoolMotto;
	
	private School(String schoolName, String schoolAddress, String schoolMotto) {
		this.schoolName=schoolName;
		this.schoolAddress=schoolAddress;
		this.schoolMotto=schoolMotto;
		
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		if(schoolName==null||schoolName.isEmpty()) {
			this.schoolName=null;
		}
		else {
			this.schoolName = schoolName;
		}
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		if(schoolAddress==null||schoolAddress.isEmpty()) {
			this.schoolAddress=null;
		}
		else {
			this.schoolAddress = schoolAddress;
		}
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolMotto() {
		return schoolMotto;
	}

	public void setSchoolMotto(String schoolMotto) {
		if(schoolMotto==null||schoolMotto.isEmpty()) {
			this.schoolMotto=null;
		}
		else {
			this.schoolMotto = schoolMotto;
		}
		this.schoolMotto = schoolMotto;
	}

	public String toString() {
		return "School [schoolName=" + schoolName + ", schoolAddress=" + schoolAddress + ", schoolMotto=" + schoolMotto
				+ "]";
	}
	
	public static School getSchoolObject(String schoolName, String schoolAddress, String schoolMotto) {
		if(schoolName==null||schoolName.isEmpty()||schoolAddress==null||schoolAddress.isEmpty()||schoolMotto==null||schoolMotto.isEmpty()) {
			return null;
		}
		else {
		return new School(schoolName, schoolAddress, schoolMotto);
	}
	}
}

