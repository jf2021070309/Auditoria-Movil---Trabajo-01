package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.h;
import com.applovin.impl.sdk.r;
/* loaded from: classes.dex */
public class AppLovinPrivacySettings {
    public static boolean hasUserConsent(Context context) {
        r.f("AppLovinPrivacySettings", "hasUserConsent()");
        Boolean a = h.b().a(context);
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUser(Context context) {
        r.f("AppLovinPrivacySettings", "isAgeRestrictedUser()");
        Boolean a = h.a().a(context);
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSell(Context context) {
        r.f("AppLovinPrivacySettings", "isDoNotSell()");
        Boolean a = h.c().a(context);
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    public static void setDoNotSell(boolean z, Context context) {
        r.f("AppLovinPrivacySettings", "setDoNotSell()");
        if (h.c(z, context)) {
            AppLovinSdk.reinitializeAll(null, null, Boolean.valueOf(z));
        }
    }

    public static void setHasUserConsent(boolean z, Context context) {
        r.f("AppLovinPrivacySettings", "setHasUserConsent()");
        if (h.b(z, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z), null, null);
        }
    }

    public static void setIsAgeRestrictedUser(boolean z, Context context) {
        r.f("AppLovinPrivacySettings", "setIsAgeRestrictedUser()");
        if (h.a(z, context)) {
            AppLovinSdk.reinitializeAll(null, Boolean.valueOf(z), null);
        }
    }
}
