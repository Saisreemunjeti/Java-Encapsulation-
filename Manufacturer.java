package com.manufacturer;

public class Manufacturer {

		private String manufacturerName;
		private String manufacturerAddress;
		private String registrationNumber;
		
		private Manufacturer(String manufacturerName, String manufacturerAddress, String registrationNumber) {
			
			this.manufacturerName = manufacturerName;
			this.manufacturerAddress = manufacturerAddress;
			this.registrationNumber=registrationNumber;
		}

		public String getManufacturerName() {
			return manufacturerName;
		}

		public void setManufacturerName(String manufacturerName) {
			
				this.manufacturerName = manufacturerName;
			
		}

		public String getManufacturerAddress() {
			return manufacturerAddress;
		}

		public void setManufacturerAddress(String manufacturerAddress) {
			
				this.manufacturerAddress = manufacturerAddress;
			
		}

		public String getRegistrationNumber() {
			return registrationNumber;
		}

	public void setRegistrationNumber(String registrationNumber) {
			
			if(registrationNumber.length()!=10 || registrationNumber.length()==0){
				this.registrationNumber=null;
			}
			else {
				this.registrationNumber = registrationNumber;

			}	
		}

		public String toString() {
			return "Manufacturer [manufacturerName=" + manufacturerName + ", manufacturerAddress=" + manufacturerAddress
					+ ", registrationNumber=" + registrationNumber + "]";
		}
		
		public static Manufacturer getManufacturerObject(String manufacturerName,String manufacturerAddress,String registrationNumber) {
			if(manufacturerName==null||manufacturerName.isEmpty()||manufacturerAddress==null||manufacturerAddress.isEmpty()||registrationNumber==null||registrationNumber.isEmpty()) {
				return null;
			}
			else {
				return new Manufacturer(manufacturerName,manufacturerAddress,registrationNumber);
			}	
		}
		
	}
