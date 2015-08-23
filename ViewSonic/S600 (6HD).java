Manufacturer = alps; Model = S600; Version = 17
boolean adjustModemRadioPower(int,int)
boolean adjustModemRadioPowerByBand(int,int)
int btSimapApduRequest(int,java.lang.String,android.telephony.BtSimapOperResponse)
int btSimapConnectSIM(int,android.telephony.BtSimapOperResponse)
int btSimapDisconnectSIM()
int btSimapPowerOffSIM()
int btSimapPowerOnSIM(int,android.telephony.BtSimapOperResponse)
int btSimapResetSIM(int,android.telephony.BtSimapOperResponse)
void disableLocationUpdates()
void disableLocationUpdatesGemini(int)
void enableLocationUpdates()
void enableLocationUpdatesGemini(int)
java.util.List getAllCellInfo()
int getCallState()
int getCallStateGemini(int)
int getCdmaEriIconIndex()
int getCdmaEriIconMode()
java.lang.String getCdmaEriText()
android.telephony.CellLocation getCellLocation()
android.telephony.CellLocation getCellLocationGemini(int)
java.lang.String getCompleteVoiceMailNumber()
int getCurrentPhoneType()
int getDataActivity()
int getDataState()
int getDataStateGemini(int)
java.lang.String getDeviceId()
java.lang.String getDeviceIdGemini(int)
java.lang.String getDeviceSoftwareVersion()
java.lang.String getIccCardType()
java.lang.String getIccCardTypeGemini(int)
java.lang.String getIsimDomain()
java.lang.String getIsimImpi()
[Ljava.lang.String; getIsimImpu()
java.lang.String getLine1AlphaTag()
java.lang.String getLine1AlphaTagGemini(int)
java.lang.String getLine1Number()
java.lang.String getLine1NumberGemini(int)
int getLteOnCdmaMode()
int getMissedCallCount()
void getMobileRevisionAndIMEI(int,android.os.Message)
java.lang.String getMsisdn()
java.util.List getNeighboringCellInfo()
java.util.List getNeighboringCellInfoGemini(int)
java.lang.String getNetworkCountryIso()
java.lang.String getNetworkCountryIsoGemini(int)
java.lang.String getNetworkOperator()
java.lang.String getNetworkOperatorGemini(int)
java.lang.String getNetworkOperatorName()
java.lang.String getNetworkOperatorNameGemini(int)
int getNetworkType()
int getNetworkTypeGemini(int)
java.lang.String getNetworkTypeName()
java.lang.String getNetworkTypeNameGemini(int)
int getPhoneType()
int getPhoneTypeGemini(int)
java.lang.String getSN()
java.lang.String getSimCountryIso()
java.lang.String getSimCountryIsoGemini(int)
java.lang.String getSimOperator()
java.lang.String getSimOperatorGemini(int)
java.lang.String getSimOperatorName()
java.lang.String getSimOperatorNameGemini(int)
java.lang.String getSimSerialNumber()
java.lang.String getSimSerialNumberGemini(int)
int getSimState()
int getSimStateGemini(int)
int getSmsDefaultSim()
java.lang.String getSpNameInEfSpn()
java.lang.String getSpNameInEfSpnGemini(int)
java.lang.String getSubscriberId()
java.lang.String getSubscriberIdGemini(int)
java.lang.String getVoiceMailAlphaTag()
java.lang.String getVoiceMailAlphaTagGemini(int)
java.lang.String getVoiceMailNumber()
java.lang.String getVoiceMailNumberGemini(int)
int getVoiceMessageCount()
int getVoiceMessageCountGemini(int)
boolean hasIccCard()
boolean hasIccCardGemini(int)
boolean isIccCardProviderAsMvno()
boolean isIccCardProviderAsMvnoGemini(int)
boolean isNetworkRoaming()
boolean isNetworkRoamingGemini(int)
java.lang.String isOperatorMvnoForEfPnn()
java.lang.String isOperatorMvnoForEfPnnGemini(int)
java.lang.String isOperatorMvnoForImsi()
java.lang.String isOperatorMvnoForImsiGemini(int)
boolean isSmsCapable()
boolean isVoiceCapable()
void listen(android.telephony.PhoneStateListener,int)
void listenGemini(android.telephony.PhoneStateListener,int,int)
java.lang.String simAuth(java.lang.String)
java.lang.String simAuthGemini(java.lang.String,int)
java.lang.String uSimAuth(java.lang.String,java.lang.String)
java.lang.String uSimAuthGemini(java.lang.String,java.lang.String,int)
android.telephony.TelephonyManager from(android.content.Context)
android.telephony.TelephonyManager getDefault()
int getDefaultSim()
com.android.internal.telephony.ITelephony getITelephony()
int getLteOnCdmaModeStatic()
int getMaxPdpNum(int)
int getNetworkClass(int)
java.lang.String getNetworkTypeName(int)
int getPhoneType(int)
int getPhoneTypeFromNetworkType()
int getPhoneTypeFromProperty()
java.lang.String getProcCmdLine()
int getRadioType(int)
com.android.internal.telephony.IPhoneSubInfo getSubscriberInfo()
com.android.internal.telephony.IPhoneSubInfo getSubscriberInfo(int)
