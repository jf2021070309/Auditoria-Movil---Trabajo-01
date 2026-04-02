package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public final class d {
    public Boolean a = null;
    public String b = null;
    public InneractiveAdManager.GdprConsentSource c = null;
    String d = null;
    public String e = null;
    public SharedPreferences f;

    public final void a() {
        Application p = com.fyber.inneractive.sdk.util.l.p();
        if (this.f != null || p == null) {
            return;
        }
        SharedPreferences sharedPreferences = p.getSharedPreferences("IAConfigurationPreferences", 0);
        this.f = sharedPreferences;
        if (sharedPreferences != null) {
            if (sharedPreferences.contains("IAGDPRBool")) {
                this.a = Boolean.valueOf(sharedPreferences.getBoolean("IAGDPRBool", false));
            }
            if (sharedPreferences.contains("IAGdprConsentData")) {
                this.b = sharedPreferences.getString("IAGdprConsentData", null);
            }
            if (sharedPreferences.contains("IACCPAConsentData")) {
                this.e = sharedPreferences.getString("IACCPAConsentData", null);
            }
            if (sharedPreferences.contains("IAGdprSource")) {
                try {
                    this.c = InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences.getString("IAGdprSource", InneractiveAdManager.GdprConsentSource.Internal.toString()));
                } catch (Exception unused) {
                    this.c = InneractiveAdManager.GdprConsentSource.Internal;
                }
            }
            if (sharedPreferences.contains("keyUserID")) {
                this.d = sharedPreferences.getString("keyUserID", null);
            }
        }
    }

    public final Boolean b() {
        if (com.fyber.inneractive.sdk.util.l.p() == null) {
            return null;
        }
        return this.a;
    }

    public final boolean a(String str, String str2) {
        if (com.fyber.inneractive.sdk.util.l.p() != null) {
            a();
            if (this.f != null) {
                IAlog.b("Saving %s value = %s to sharedPrefs", str, str2);
                this.f.edit().putString(str, str2).apply();
                return true;
            }
            return false;
        }
        return false;
    }
}
