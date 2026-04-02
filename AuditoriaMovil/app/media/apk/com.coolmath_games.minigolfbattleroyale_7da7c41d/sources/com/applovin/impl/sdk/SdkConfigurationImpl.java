package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdkConfiguration;
/* loaded from: classes.dex */
public class SdkConfigurationImpl implements AppLovinSdkConfiguration {
    private final k a;

    public SdkConfigurationImpl(k kVar) {
        this.a = kVar;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = (String) this.a.a(com.applovin.impl.sdk.c.b.eQ);
        return "applies".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.APPLIES : "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY : AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public String getCountryCode() {
        return (String) this.a.a(com.applovin.impl.sdk.c.b.eR);
    }

    public String toString() {
        return "AppLovinSdkConfiguration{consentDialogState=" + getConsentDialogState() + ", countryCode=" + getCountryCode() + '}';
    }
}
