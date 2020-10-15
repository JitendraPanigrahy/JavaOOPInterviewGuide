package com.feelandcode.java.oops.inheritance.specialization;

/**
 * This class represents IndoorPatient It extends the patient class and inherits
 * the get and set methods from. It has IS-A relationship to the Patient class.
 * Instances of this class act like Patient It overrides inherited method(s) to
 * provide special behavior
 */
public class IndoorPatient extends Patient {

	String admissionNo;
	int bedNo;

	/**
	 * @return the admissionNo
	 */
	public String getAdmissionNo() {
		return admissionNo;
	}

	/**
	 * @param admissionNo the admissionNo to set
	 */
	public void setAdmissionNo(String admissionNo) {
		this.admissionNo = admissionNo;
	}

	/**
	 * @return the bedNo
	 */
	public int getBedNo() {
		return bedNo;
	}

	/**
	 * @param bedNo the bedNo to set
	 */
	public void setBedNo(int bedNo) {
		this.bedNo = bedNo;
	}

	// overrides inherited method - provides specialized behavior
	public String getPatientDetails() {
		String patientDetail = super.getPatientDetails();
		StringBuilder indoorPatientDetail = new StringBuilder(patientDetail);
		indoorPatientDetail.append(" AdmissionNo : " + admissionNo).append(" BedNo : "+bedNo);
		return indoorPatientDetail.toString();

		// can include other details here
		// getDischarge();
		// getLabReport();
	}

	public void getDischargeDetails() {
		// TODO : add patient discharge details
	}

	public void getLabReport() {
		// TODO : add lab report details
	}

}
