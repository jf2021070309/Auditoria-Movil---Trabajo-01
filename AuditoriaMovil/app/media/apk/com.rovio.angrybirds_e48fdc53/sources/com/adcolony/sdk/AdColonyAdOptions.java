package com.adcolony.sdk;

import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdColonyAdOptions {
    boolean a;
    boolean b;
    AdColonyUserMetadata c;
    JSONObject d = as.a();

    public AdColonyAdOptions enableConfirmationDialog(boolean z) {
        this.a = z;
        as.a(this.d, "confirmation_enabled", true);
        return this;
    }

    public AdColonyAdOptions enableResultsDialog(boolean z) {
        this.b = z;
        as.a(this.d, "results_enabled", true);
        return this;
    }

    public AdColonyAdOptions setOption(String str, boolean z) {
        if (q.d(str)) {
            as.a(this.d, str, z);
        }
        return this;
    }

    public Object getOption(String str) {
        return as.a(this.d, str);
    }

    public AdColonyAdOptions setOption(String str, double d) {
        if (q.d(str)) {
            as.a(this.d, str, d);
        }
        return this;
    }

    public AdColonyAdOptions setOption(String str, String str2) {
        if (str != null && q.d(str) && q.d(str2)) {
            as.a(this.d, str, str2);
        }
        return this;
    }

    public AdColonyAdOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.c = adColonyUserMetadata;
        as.a(this.d, "user_metadata", adColonyUserMetadata.b);
        return this;
    }

    public AdColonyUserMetadata getUserMetadata() {
        return this.c;
    }
}
