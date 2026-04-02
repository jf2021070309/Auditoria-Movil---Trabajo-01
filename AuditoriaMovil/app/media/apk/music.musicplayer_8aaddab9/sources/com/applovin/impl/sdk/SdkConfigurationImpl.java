package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdkConfiguration;
/* loaded from: classes.dex */
public class SdkConfigurationImpl implements AppLovinSdkConfiguration {
    private final m a;

    public SdkConfigurationImpl(m mVar) {
        this.a = mVar;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = (String) this.a.a(com.applovin.impl.sdk.c.b.eY);
        return "applies".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.APPLIES : "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY : AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public String getCountryCode() {
        return (String) this.a.a(com.applovin.impl.sdk.c.b.eZ);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("AppLovinSdkConfiguration{consentDialogState=");
        y.append(getConsentDialogState());
        y.append(", countryCode=");
        y.append(getCountryCode());
        y.append('}');
        return y.toString();
    }
}
