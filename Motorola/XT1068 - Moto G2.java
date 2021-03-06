Manufacturer = motorola; Model = XT1068; Version = 21
void answerRingingCall()
void call(java.lang.String,java.lang.String)
int checkCarrierPrivilegesForPackage(java.lang.String)
void dial(java.lang.String)
boolean disableDataConnectivity()
void disableLocationUpdates()
void disableLocationUpdates(long)
boolean enableDataConnectivity()
void enableLocationUpdates()
void enableLocationUpdates(long)
void enableSimplifiedNetworkSettings(boolean)
void enableSimplifiedNetworkSettingsForSubscriber(long,boolean)
boolean endCall()
java.lang.String getAIDByAppFamily(long,int)
int getActiveSubscriptionsCount()
java.util.List getAllCellInfo()
int getCallState()
int getCallState(long)
java.util.List getCarrierPackageNamesForIntent(android.content.Intent)
int getCdmaEriIconIndex()
int getCdmaEriIconIndex(long)
int getCdmaEriIconMode()
int getCdmaEriIconMode(long)
java.lang.String getCdmaEriText()
java.lang.String getCdmaEriText(long)
java.lang.String getCdmaMdn()
java.lang.String getCdmaMdn(long)
java.lang.String getCdmaMin()
java.lang.String getCdmaMin(long)
android.telephony.CellLocation getCellLocation()
java.lang.String getCompleteVoiceMailNumber()
java.lang.String getCompleteVoiceMailNumber(long)
int getCurrentPhoneType()
int getCurrentPhoneType(long)
int getCurrentSubscriptionStatusValue(long)
int getDataActivity()
boolean getDataEnabled()
int getDataNetworkType()
int getDataNetworkType(long)
int getDataState()
java.lang.String getDeviceId()
java.lang.String getDeviceId(int)
java.lang.String getDeviceIdUsingType(int)
java.lang.String getDeviceSoftwareVersion()
java.lang.String getGroupIdLevel1()
java.lang.String getGroupIdLevel1(long)
java.lang.String getIccSimChallengeResponse(int,java.lang.String)
java.lang.String getIccSimChallengeResponse(long,int,java.lang.String)
java.lang.String getImei()
java.lang.String getImei(int)
boolean getImsRegistrationState()
java.lang.String getIsimChallengeResponse(java.lang.String)
java.lang.String getIsimDomain()
java.lang.String getIsimImpi()
[Ljava.lang.String; getIsimImpu()
java.lang.String getIsimIst()
[Ljava.lang.String; getIsimPcscf()
java.lang.String getLine1AlphaTag()
java.lang.String getLine1AlphaTagForSubscriber(long)
java.lang.String getLine1Number()
java.lang.String getLine1NumberForSubscriber(long)
int getLteOnCdmaMode()
int getLteOnCdmaMode(long)
java.lang.String getMmsUAProfUrl()
java.lang.String getMmsUAProfUrl(long)
java.lang.String getMmsUserAgent()
java.lang.String getMmsUserAgent(long)
java.lang.String getMsisdn()
java.lang.String getMsisdn(long)
android.telephony.TelephonyManager$MultiSimVariants getMultiSimConfiguration()
java.util.List getNeighboringCellInfo()
java.lang.String getNetworkCountryIso()
java.lang.String getNetworkCountryIso(long)
java.lang.String getNetworkOperator()
java.lang.String getNetworkOperator(long)
java.lang.String getNetworkOperatorName()
java.lang.String getNetworkOperatorName(long)
int getNetworkType()
int getNetworkType(long)
java.lang.String getNetworkTypeName()
long getOperatorPreferredDataSubId()
[Ljava.lang.String; getPcscfAddress(java.lang.String)
int getPhoneCount()
int getPhoneType()
int getPreferredNetworkType()
int getSimCount()
java.lang.String getSimCountryIso()
java.lang.String getSimCountryIso(long)
java.lang.String getSimOperator()
java.lang.String getSimOperator(long)
java.lang.String getSimOperatorName()
java.lang.String getSimOperatorName(long)
java.lang.String getSimSerialNumber()
java.lang.String getSimSerialNumber(long)
int getSimState()
int getSimState(int)
boolean getSimplifiedNetworkSettingsEnabled()
boolean getSimplifiedNetworkSettingsEnabledForSubscriber(long)
java.lang.String getSubscriberId()
java.lang.String getSubscriberId(long)
void getTuneAway()
java.util.List getUTCTime_MotoExt()
java.lang.String getVoiceMailAlphaTag()
java.lang.String getVoiceMailAlphaTag(long)
java.lang.String getVoiceMailNumber()
java.lang.String getVoiceMailNumber(long)
int getVoiceMessageCount()
int getVoiceMessageCount(long)
int getVoiceNetworkType()
int getVoiceNetworkType(long)
boolean handlePinMmi(java.lang.String)
int hasCarrierPrivileges()
boolean hasIccCard()
boolean hasIccCard(int)
boolean iccCloseLogicalChannel(int)
[B iccExchangeSimIO(int,int,int,int,int,java.lang.String)
[B iccExchangeSimIOData(long,int,int,int,int,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String)
android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(java.lang.String)
java.lang.String iccTransmitApduBasicChannel(int,int,int,int,int,java.lang.String)
java.lang.String iccTransmitApduLogicalChannel(int,int,int,int,int,int,java.lang.String)
int invokeOemRilRequestRaw([B,[B)
boolean isDataConnectivityPossible()
boolean isIdle()
boolean isMultiSimEnabled()
boolean isNetworkRoaming()
boolean isNetworkRoaming(long)
boolean isOffhook()
boolean isRadioOn()
boolean isRinging()
boolean isSimPinEnabled()
boolean isSmsCapable()
boolean isSubActive(long)
boolean isVoiceCapable()
void listen(android.telephony.PhoneStateListener,int)
boolean needsOtaServiceProvisioning()
java.lang.String nvReadItem(int)
boolean nvResetConfig(int)
boolean nvWriteCdmaPrl([B)
boolean nvWriteItem(int,java.lang.String)
java.lang.String sendEnvelopeWithStatus(java.lang.String)
void setCellInfoListRate(int)
void setDataEnabled(boolean)
boolean setGlobalPreferredNetworkType()
void setImsRegistrationState(boolean)
void setLine1NumberForDisplay(java.lang.String,java.lang.String)
void setLine1NumberForDisplayForSubscriber(long,java.lang.String,java.lang.String)
boolean setNetworkTypeAutoSwitch(long)
boolean setOperatorBrandOverride(java.lang.String)
boolean setPreferredNetworkType(int)
boolean setRadio(boolean)
boolean setRadioPower(boolean)
boolean setSubscriptionStatus(long,boolean)
void setTuneAway(boolean)
void silenceRinger()
boolean supplyPin(java.lang.String)
[I supplyPinReportResult(java.lang.String)
boolean supplyPuk(java.lang.String,java.lang.String)
[I supplyPukReportResult(java.lang.String,java.lang.String)
void toggleRadioOnOff()
void updateServiceLocation()
android.telephony.TelephonyManager from(android.content.Context)
android.telephony.TelephonyManager getDefault()
int getDefaultSim()
long getDefaultSubscription()
com.android.internal.telephony.ITelephony getITelephony()
int getIntAtIndex(android.content.ContentResolver,java.lang.String,int)
int getLteOnCdmaModeStatic()
int getLteOnCdmaModeStatic(int)
int getNetworkClass(int)
java.lang.String getNetworkTypeName(int)
int getPhoneType(int)
int getPhoneTypeFromNetworkType()
int getPhoneTypeFromNetworkType(long)
int getPhoneTypeFromProperty()
int getPhoneTypeFromProperty(long)
java.lang.String getProcCmdLine()
android.content.res.Resources getSimResources(long)
com.android.internal.telephony.IPhoneSubInfo getSubscriberInfo()
com.android.internal.telecom.ITelecomService getTelecomService()
int getTelephonyProperty(java.lang.String,int,int)
java.lang.String getTelephonyProperty(java.lang.String,long,java.lang.String)
boolean putIntAtIndex(android.content.ContentResolver,java.lang.String,int,int)
void setTelephonyProperty(java.lang.String,long,java.lang.String)