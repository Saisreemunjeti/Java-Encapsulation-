package com.publisher;

public class Publisher {
		
		private String publisherName;
		private String publisherLocation;
		private String licenseCode;
		private Publisher(String publisherName, String publisherLocation, String licenseCode) {
			this.publisherName = publisherName;
			this.publisherLocation = publisherLocation;
			this.licenseCode = licenseCode;
		}
		public String getPublisherName() {
			return publisherName;
		}
		public void setPublisherName(String publisherName) {
			this.publisherName = publisherName;
		}
		public String getPublisherLocation() {
			return publisherLocation;
		}
		public void setPublisherLocation(String publisherLocation) {
			this.publisherLocation = publisherLocation;
		}
		public String getLicenseCode() {
			return licenseCode;
		}
		public void setLicenseCode(String licenseCode) {
			if(licenseCode.startsWith("PUB")&& licenseCode.length()==8) {
				this.licenseCode = licenseCode;
			}
			
			else {
				this.licenseCode=null;
			}
			
		}
		
		public String toString() {
			return "Publisher [publisherName=" + publisherName + ", publisherLocation=" + publisherLocation
					+ ", licenseCode=" + licenseCode + "]";
		}
		public static Publisher getPublisherObject(String publisherName, String publisherLocation, String licenseCode) {
			if(publisherName==null||publisherName.isEmpty()||publisherLocation==null||publisherLocation.isEmpty()||licenseCode==null||licenseCode.isEmpty()) {
				return null;
			}
			
			else {
				return new Publisher(publisherName,publisherLocation,licenseCode);
			}
		}	
	}
