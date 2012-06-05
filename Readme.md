## Set up your environment

This section explains how to prepare your development environment to start working with the Bluevia Android SDK. First check out the system requirements that your computer must meet, and then follow the installation steps. Once you have finished you will be able to develop your first Android application using the functionality provided by Bluevia APIs.

### System requeriments

The Bluevia library for Android is prepared and has been tested to develop applications under Android SDK 1.5 to 4.0 versions. 

Android SDK is the only system requirement for the Bluevia library. The following system requirements are the ones your computer needs to meet to be able to work with the Android SDK:

Supported Operating Systems
  - Windows XP (32-bit) or Vista (32- or 64-bit)
  - Mac OS X 10.5.8 or later (x86 only)
  - Linux (tested on Linux Ubuntu Hardy Heron)

Developing environment
  - Eclipse 3.4 or greater
  - Eclipse JDT plugin (included in most Eclipse IDE packages)
  - JDK 5 or JDK 6 (JRE alone is not sufficient)
  - Android Development Tools plugin (optional)

For complete information visit the system requirements described in Android Developers.

### Step 1: Preparing the Android environment
The first step to start developing applications is setting up your Android environment. You have to download the Android SDK and the ADT plugin, in case you choose to use Eclipse as your IDE. After installing the starter package you may use the SDK tools to add the Android platforms you consider. If you have already prepared your computer to develop Android applications you can skip to step 2; otherwise follow the next instructions:
  - Prepare your development computer and ensure it meets the system requirements.
  - Install the SDK starter package from the table above. (If you're on Windows, download the installer for help with the initial setup).
  - Install the ADT Plugin for Eclipse (if you'll be developing in Eclipse).
  - Add Android platforms and other components to your SDK.

Visit Android Developers for complete instructions: [downloading and installing Android SDK](http://developer.android.com/sdk/installing.html).

### Step 2: Add BlueVia Android SDK in your project
There are two ways include the Bluevia library in your Android application: as an external jar or including the source of the library itself. Both the jar and the source are included in the SDK zip file. Follow the next steps to set up your Android project:
  - Create your Android Project in Eclipse: select File > New > Android Project.
  - Include the Bluevia Library into the Java build path:
      - As a JAR file:
           - Select Project > Properties.
           - In Java Build Path section, click on Libraries tab.
           - Finally, click on Add External JARs and select the path where you put the Bluevia Library JAR.
      - As Android library project:
           - Import the Android library project in Eclipse: 
             File  > Import... > Existing projects into workspace... and search the BlueviaSDK project where you downloaded it.
           - Select your application project and click on Project > Properties.
           - In Android section, under Library options, click on Add button.
           - Select BlueviaSDK project and accept.

	
## Code samples 
You can find a set of complete sample apps on this repository:

- [OAuth](https://github.com/BlueVia/Official-Library-Android/blob/master/samples/src/com/bluevia/android/samples/oauth/OauthActivity.java) : Demostrates OAuth process negotiation
- [SMS send](https://github.com/BlueVia/Official-Library-Android/blob/master/samples/src/com/bluevia/android/samples/sms/SmsMTActivity.java) : Sends SMS and a Check Delivery Status
- [SMS receive](https://github.com/BlueVia/Official-Library-Android/blob/master/samples/src/com/bluevia/android/samples/sms/SmsMOActivity.java) : Receive SMS.
- [MMS send](https://github.com/BlueVia/Official-Library-Android/blob/master/samples/src/com/bluevia/android/samples/mms/MmsMTActivity.java) : Sends MMS and a Check Delivery Status
- [MMS receive](https://github.com/BlueVia/Official-Library-Android/blob/master/samples/src/com/bluevia/android/samples/mms/MmsMOActivity.java) : Receive SMS.
- [Payment](https://github.com/BlueVia/Official-Library-Android/blob/master/samples/src/com/bluevia/android/samples/payment/PaymentActivity.java) : Performs a Payment 
- [Location](https://github.com/BlueVia/Official-Library-Android/blob/master/samples/src/com/bluevia/android/samples/location/LocationActivity.java) : Gets the location of a user
- [User Context](https://github.com/BlueVia/Official-Library-Android/blob/master/samples/src/com/bluevia/android/samples/directory/DirectoryActivity.java) : Gets user and user equipement information
- [Advertising](https://github.com/BlueVia/Official-Library-Android/blob/master/samples/src/com/bluevia/android/samples/ad/AdActivity.java) : Gets advertising

Please find below also some quick snippets on how to use the library.


### OAuth proccess negotiation
Most of the APIs need have passed a complete OAuth process once before starting to use them because they will act on behalf a customer (OAuth 3-leggded mode); others, like receiving messages ones, don't need that process (OAuth 2-legged mode). The advertising API, could be used both as 3-legged and as 2-legged.

#### Step 1: Get application keys (consumer keys).
You can get your own application keys for you app at [BlueVia](http://bluevia.com/en/api-keys/get).

#### Step 2: Init oauth process: Do a request tokens
BlueVia APIs authentication is based on [OAuth 1.0](http://bluevia.com/en/page/tech.howto.tut_APIauth)
To get the users authorization for using BlueVia API's on their behalf, you shall do as follows.
By using your API key, you have to create a request token that is required to start the OAuth process. For example:

	// Create the client (you have to choose the mode and include the Consumer credentials)
	BVOauth oauthClient = new BVOauth(Mode.LIVE, "consumer_key", "consumer_secret");
	// Retrieve the request token
	RequestToken requestToken = oauthClient.getRequestToken();

#### Step 3: User authorisation

There are two alternatives to request the user authorisation:

##### OutOfBand authorisation
To get user authorization using the oauth_token from your request token you have to take the user to BlueVia. The obtained request token contains the verification url to access to the BlueVia portal. Depending on the mode used, it will be available for final users (LIVE) or developers (TEST and SANDBOX). The application should enable the user (customer) to visit the url in any way, where he will have to introduce its credentials (user and password) to authorise the application to connect BlueVia APIs behalf him. Once permission has been granted, the user will obtain a PIN code necessary to exchange the request token for the access token:

	// Open the received url in a browser using an Intent
	Uri url = Uri.parse(requestToken.getVerificationUrl());
	Intent i = new Intent(Intent.ACTION_VIEW, url);
	startActivity(i);

Once the user confirms the authorization, you have to ask the user to enter the oauth_verifier in your app. Note that your users will need to copy and paste the oauth_verifier manually, so be clear when you request it to be sure they do not get confused.

##### SMSOauth authorisation
Bluevia supports a variation of OAuth process where the user is not using the browser to authorize the application. Instead he will receive an SMS containing he PIN code (oauth_verifier). To use this SMS handshake, getRequestToken request must pass the user's MSISDN (phone number) in callback parameter. After the user had received the PIN code, the application should allow him to enter it and request the access token.

	// Retrieve the request token
	RequestToken requestToken = oauthClient.getRequestTokenSmsHandshake("34609090909");

#### Step 4: Get access tokens
With the obtained PIN code (oauth_verifier), you can now get the accessToken from the user as follows:

	//Obtain the access token
	OAuthToken accessToken = oauthClient.getAccessToken(oauth_verifier, token, secret);

Both token and token_secret must be saved in your application because OAuth process will require it later.


### Payment API
Payment API enables your application to make payments behalf the user to let him buy products or pay for services, and request the status of a previous payment.
Bluevia Payment API uses an extension of OAuth protocol to guarantee secure payment operations. For each payment the user makes he must complete the OAuth process to identify itself and get a valid acess token. These tokens will be valid for 48 hours and then will be dismissed.
First, you have to retrieve a request token to be authorised by the user. In this case you have to use the PaymentRequestToken object, which includes the digital good pricing besides the usual request tokens params:

	BVPayment paymentClient = new BVPayment(Mode.LIVE, "consumer_key", "consumer_secret");
	RequestToken requestToken = paymentClient.getPaymentRequestToken(100, "GBP", "bluevia", "service_id");

Then, take the user to BlueVia Connect to authorise the application as usual.
Once you have obtained the oauth_verifier, you can now get the accessToken as follows:
	OAuthToken accessToken = paymentClient.getAccessToken(verifier, token, secret); /* Get verifier from GUI */

	
### Send SMS and get delivery status
SMS API allows your app to send messages on behalf of the users, this means that their mobile number will be the text sender and they will pay for them.

#### Sending SMS

	BVMtSms smsClient = new BVMtSms(Mode.LIVE, "consumer_key", "consumer_secret", "access_token", "access_token_secret");
	// Send the message.
	String smsId = smsClient.send("600010101", "This is the text to be sent using Bluevia API");

Your application can send the same SMS to several users including multiple elements:

	String[] addresses = {"600010101", "600010102", "600010103"}
	String smsId = smsClient.send(addresses, "This is the text to be sent using Bluevia API");
	
Take into account that the recipients numbers are required to included the international country calling code.

#### Checking delivery status
After sending an SMS you may need to know if it has been delivered. 
You can poll to check the delivery status.This alternative is used typically for mobile applications without a backend server.
You need to keep the deliveryStatusId to ask about the delivery status of that SMS as follows:

	ArrayList<DeliveryInfo> statusObj = smsClient.getDeliveryStatus(smsId);
	for (DeliveryInfo singleStatus : statusObj) {
	    Status status = singleStatus.getStatus();
	    Log.i(TAG, "Message status: " + status); 
	}	

### Send MMS and get delivery status 
MMS API enables your application to send an MMS on behalf of the user, check the delivery status of a sent MMS and Receive an MMS on your application.

#### Sending SMS

	BVMtMms mmsClient = new BVMtMms(Mode.LIVE, "consumer_key", "consumer_secret", "access_token", "access_token_secret");
	Several attachments could be attached to the MMS message. The class that represent multipart attachment is Attachment, which specifies the path of the attachment and its Content-type:
	
	// The attachment is a file located at the sdcard.
	ArrayList<Attachment> attachments = new ArrayList<Attachment>();
	attachments.add(new Attachment("/sdcard/image.gif", ContentType.IMAGE_GIF));

	// Send the message.
	String mmsId = mmsClient.send("600010101", "This is a MMS" "This is the text of the MMS to be sent using Bluevia API", attachments);

Your application can send the same MMS to several users including multiple elements, by invoking many times the addAddress method:

	mms.addAddress(new UserId(Type.PHONE_NUMBER,"600010102"));
	
Take into account that the recipients numbers are required to included the international country calling code.

#### Checking delivery status
After sending an MMS you may need to know if it has been delivered.
You can poll polling to check the delivery status. This alternative is used typically for mobile applications without a backend server.
You need to keep the deliveryStatusId to ask about the delivery status of that MMS as follows:

	ArrayList<DeliveryInfo> statusObj = mmsClient.getDeliveryStatus(mmsId);
	for (DeliveryInfo singleStatus : statusObj) {
		Status status = singleStatus.getStatus();
	 	Log.i(TAG, "Message status: " + status); 
	}	

### Receive SMS 
You can can retrieve the SMS sent to your app using OAuth-2-legged auhtorisation so no user access token is required.

	BVMoSms smsMoClient = new BVMoSms(Mode.LIVE, "consumer_key", "consumer_secret");

Your application can receive SMS from users sent to [BlueVia shortcodes](http://bluevia.com/en/page/tech.overview.shortcodes) including your application keyword. You have to take into account that you will need to remember the SMS keyword you defined when you requested you API key.

You can grab messages sent from users to you app as follows:

	String registrationId = "553456"
	ArrayList<SmsMessage> list = smsMoClient.getAllMessages(registrationId); 
	for (SmsMessage mms : list){      
	  Log.i(TAG, "Received sms: " + sms.getMessage()); 
	}

Note that this is just an example and you should implement a more efficient polling strategy.

### Receive MMS 
You can can retrieve the MMS sent to your app using OAuth-2-legged auhtorisation so no user access token is required.

	BVMoMms mmsClient = new BVMoMms(Mode.LIVE, "consumer_key", "consumer_secret");

Your application can receive MMS from users sent to [BlueVia shortcodes](http://bluevia.com/en/page/tech.overview.shortcodes) including your application keyword. You have to take into account that you will need to remember the MMS keyword you defined when you requested you API key. 

You can grab messages sent from users to you app as follows. The ReceivedMmsInfo object contains the information of the sent MMS, but the attachments. In order to retreive attached documents in the MMS you have to use the getMessage function, which needs the messageIdentifier available in the ReceivedMmsInfo object. The returned ReceivedMms object contains the info of the Mms itself and a list of MimeContent objects with the content of the attachments:

	String registrationId = "546780"
	ArrayList<MmsMessageInfo> list = mmsMoClient.getAllMessages(registrationId, false); 
	for (MmsMessageInfo info : list){
	  MmsMessage message = mmsMoClient.getMessage(registrationId, info.getMessageId());
	  for (MimeContent attachment : message.getAttachments()){
	    // You can save on do any stuff with the attachments
	  }
	}
	
Note that this is just an example and you should implement a more efficient polling strategy


### User Context API
User Context API enables your application to get information about the user's customer profile in order to know more about your users to targetize better your product.

	BVDirectory directoryClient = new BVDirectory(Mode.LIVE, "consumer_key", "consumer_secret", "access_token", "access_token_secret");

#### Getting Profile Information

	Profile profile = directoryClient.getProfile();

#### Getting Access Information

	AccessInfo accessInfo = directoryClient.getAccessInfo();

#### Getting Personal Information

	PersonalInfo personalInfo = directoryClient.getPersonalInfo();

#### Getting Device Information

	TerminalInfo terminalInfo = directoryClient.getTerminalInfo();

#### Filters
If you want to configure a filter on the information relevant for your application you can do it for any of the requests above:

	TerminalInfo.Fields[] fields = {Fields.BRAND, Fields.MODEL, Fields.MMS, Fields.WAP, Fields.SCREEN_RESOLUTION};
	TerminalInfo terminalInfo = directoryClient.getTerminalInfo(fields);


### Location API
Location API enables your application to retrieve the geographical coordinates of user. These geographical coordinates are expressed through a latitude, longitude, altitude and accuracy.

The acceptableAccuracy (optional) parameter expresses the range in meters that the application considers useful. If the location cannot be determined within this range, then the application would prefer not to receive the information.
Once the server responds the user have to retrieve the location information from the returned LocationDataType instance. The LocationDataType includes the status of the client request and the LocationInfoType member which contains the location information.

	int acceptableAccuracy = 500;
	BVLocation locationClient = new BVLocation(Mode.LIVE, "consumer_key", "consumer_secret", "access_token", "access_token_secret");
	LocationInfo info = locationClient.getLocation(acceptableAccuracy);

### Advertising API
Adverstising API enables your application to retrieve advertisements. 

You can invoke this API using a 3-leddged client (ouath process passed) or a 2-legged client. This is selected in the client instantiating.
Once configured your client is ready to get advertisements. When retrieving a simple advertisement you can specify a set of request parameters such as banner size, protection policy, etc. Mandatory parameters are adSpace, that is the identifier you obtained when you registered your application within the Bluevia portal; and protectionPolicy. The adRequetsId is an optional parameter (if it is not supplied, the SDK will generate one). For a more detailed description please see the API Reference.

	BVAdvertising adClient = new BVAdvertising(Mode.LIVE, "consumer_key", "consumer_secret");

	SimpleResponse response = adClient.getAdvertising2l("12921", "UK", null, String adRequestId, Type.IMAGE, null, ProtectionPolicyType.SAFE, null);
	ArrayList<CreativeElement> ad = response.getAdvertisingList();

Take into account that the Protection Policy sets the rules for adult advertising, please be careful.

	ProtectionPolicyType.LOW 	Low, moderately explicit content (I am youth; you can show me moderately explicit content).
	ProtectionPolicyType.SAFE 	Safe, not rated content (I am a kid, please, show me only safe content).
	ProtectionPolicyType.HIGH 	High, explicit content (I am an adult; I am over 18 so you can show me any content including very explicit content).
