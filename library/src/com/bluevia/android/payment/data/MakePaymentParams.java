/**
 * @package com.bluevia.android.payment.data This package contains entity data types of Bluevia Payment Management Service
 */
package com.bluevia.android.payment.data;

import com.bluevia.android.commons.Entity;
import com.bluevia.android.commons.Utils;

/**
 * @class MakePaymentParams
 * Class representing the MakePaymentParams type
 *
 * This type is composed of the following fields:
 * <ul>
 * <li> timeStamp; mandatory: String</li>
 * <li> paymentInfo; mandatory: PaymentInfo</li>
 * <li> endpoint; optional: String</li>
 * <li> correlator; optional: String</li>
 * </ul>
 */
public class MakePaymentParams implements Entity {

	private String mTimeStamp;
	private PaymentInfo mPaymentInfo;
	private String mEndpoint;
	private String mCorrelator;

	public MakePaymentParams(String timeStamp, PaymentInfo paymentInfo){
		mTimeStamp = timeStamp;
		mPaymentInfo = paymentInfo;
	}
	
	public MakePaymentParams(String timeStamp, PaymentInfo paymentInfo,
			String endpoint, String correlator){
		mTimeStamp = timeStamp;
		mPaymentInfo = paymentInfo;
		mEndpoint = endpoint;
		mCorrelator = correlator;
	}
	
	/**
	 * Gets the mandatory time stamp of the make payment	
	 * 
	 * @return the time stamp of the make payment
	 */
	public String getTimeStamp(){
		return mTimeStamp;
	}

	/**
	 * Sets the mandatory time stamp of the make payment			
	 * 
	 * @param timeStamp time stamp of the make payment
	 */
	public void setTimeStamp(String timeStamp){
		mTimeStamp = timeStamp;
	}

	/**
	 * Gets the mandatory payment information of the make payment
	 * 
	 * @return the payment information of the make payment
	 */
	public PaymentInfo getPaymentInfo(){
		return mPaymentInfo;
	}

	/**
	 * Sets the mandatory payment information of the make payment	
	 * 
	 * @param paymentInfo the payment information of the make payment
	 * 
	 */
	public void setPaymentInfo(PaymentInfo paymentInfo){
		mPaymentInfo = paymentInfo;
	}

	/**
	 * @return the endpoint
	 */
	public String getEndpoint() {
		return mEndpoint;
	}

	/**
	 * @param endpoint the endpoint to set
	 */
	public void setEndpoint(String endpoint) {
		this.mEndpoint = endpoint;
	}

	/**
	 * @return the correlator
	 */
	public String getCorrelator() {
		return mCorrelator;
	}

	/**
	 * @param correlator the correlator to set
	 */
	public void setCorrelator(String correlator) {
		this.mCorrelator = correlator;
	}

	/**
	 * check if the make payment data is valid	
	 * 
	 * @return boolean result of the check
	 */	
	public boolean isValid() {
		if (Utils.isEmpty(mTimeStamp))
			return false;
		
		if (!Utils.isValid(mPaymentInfo))
			return false;
		
		//Valid endpoint, invalid correlator
		if ((mEndpoint != null && mEndpoint.trim().length() != 0)	
				&& (mCorrelator == null || mCorrelator.trim().length() == 0))
			return false;
		
		//Valid correlator, invalid endpoint
		if ((mCorrelator != null && mCorrelator.trim().length() != 0)	
				&& (mEndpoint == null || mEndpoint.trim().length() == 0))
			return false;
		
		return true;
	}

}
