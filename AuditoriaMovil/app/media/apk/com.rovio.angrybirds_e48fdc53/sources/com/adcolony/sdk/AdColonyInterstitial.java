package com.adcolony.sdk;

import android.content.Intent;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdColonyInterstitial {
    public static final int ADCOLONY_IAP_ENGAGEMENT_END_CARD = 0;
    public static final int ADCOLONY_IAP_ENGAGEMENT_OVERLAY = 1;
    private AdColonyInterstitialListener a;
    private aa b;
    private AdColonyAdOptions c;
    private int d;
    private String e;
    private String f;
    private String g;
    private int h;
    private String i;
    private boolean j;
    private boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdColonyInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, String str2) {
        this.a = adColonyInterstitialListener;
        this.i = str2;
        this.e = str;
    }

    public boolean show() {
        if (a.b()) {
            af a = a.a();
            if (this.k) {
                au.e.b("This ad object has already been shown. Please request a new ad via AdColony.requestInterstitial.");
                return false;
            } else if (this.j) {
                au.e.b("This ad object has expired. Please request a new ad via AdColony.requestInterstitial.");
                return false;
            } else if (a.t()) {
                au.e.b("Can not show ad while an interstitial is already active.");
                return false;
            } else if (a(a.c().get(this.i))) {
                au.d.b("Skipping show()");
                return false;
            } else {
                JSONObject a2 = as.a();
                as.a(a2, "zone_id", this.i);
                as.b(a2, "type", 0);
                as.a(a2, "id", this.e);
                if (this.c != null) {
                    as.a(a2, "pre_popup", this.c.a);
                    as.a(a2, "post_popup", this.c.b);
                }
                AdColonyZone adColonyZone = a.c().get(this.i);
                if (adColonyZone != null && adColonyZone.isRewarded() && a.f() == null) {
                    au.e.b("Rewarded ad: show() called with no reward listener set.");
                }
                new d("AdSession.launch_ad_unit", 1, a2).a();
                return true;
            }
        }
        return false;
    }

    boolean a(AdColonyZone adColonyZone) {
        if (adColonyZone != null) {
            if (adColonyZone.getPlayFrequency() <= 1) {
                return false;
            }
            if (adColonyZone.a() == 0) {
                adColonyZone.a(adColonyZone.getPlayFrequency() - 1);
                return false;
            }
            adColonyZone.a(adColonyZone.a() - 1);
            return true;
        }
        return true;
    }

    public boolean cancel() {
        if (this.b == null || (a.d() && !(a.c() instanceof AdColonyInterstitialActivity))) {
            return false;
        }
        JSONObject a = as.a();
        as.a(a, "id", this.b.a());
        new d("AdSession.on_request_close", this.b.b(), a).a();
        return true;
    }

    public AdColonyInterstitialListener getListener() {
        return this.a;
    }

    public void setListener(AdColonyInterstitialListener adColonyInterstitialListener) {
        this.a = adColonyInterstitialListener;
    }

    public String getZoneID() {
        return this.i;
    }

    public boolean isExpired() {
        return this.j || this.k;
    }

    public boolean destroy() {
        a.a().j().c().remove(this.e);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (!a.d() || !a.b()) {
            return false;
        }
        a.a().c(true);
        a.a().a(this.b);
        a.a().a(this);
        au.b.b("Launching fullscreen Activity via AdColonyInterstitial's launch method.");
        a.c().startActivity(new Intent(a.c(), AdColonyInterstitialActivity.class));
        this.k = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(aa aaVar) {
        this.b = aaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.j = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AdColonyAdOptions adColonyAdOptions) {
        this.c = adColonyAdOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f == null ? "" : this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.g == null ? "" : this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        this.g = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aa d() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return this.e;
    }
}
