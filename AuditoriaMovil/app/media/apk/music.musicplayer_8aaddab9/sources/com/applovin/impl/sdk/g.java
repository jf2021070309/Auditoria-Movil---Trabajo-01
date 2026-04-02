package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinUserSegment;
/* loaded from: classes.dex */
public class g implements AppLovinUserSegment {
    private String a;

    @Override // com.applovin.sdk.AppLovinUserSegment
    public String getName() {
        return this.a;
    }

    @Override // com.applovin.sdk.AppLovinUserSegment
    public void setName(String str) {
        if (str != null) {
            if (str.length() > 32) {
                v.i("AppLovinUserSegment", "Setting name greater than 32 characters: " + str);
            }
            if (!StringUtils.isAlphaNumeric(str)) {
                v.i("AppLovinUserSegment", "Setting name that is not alphanumeric: " + str);
            }
        }
        this.a = str;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("AppLovinUserSegment{name=");
        y.append(getName());
        y.append('}');
        return y.toString();
    }
}
