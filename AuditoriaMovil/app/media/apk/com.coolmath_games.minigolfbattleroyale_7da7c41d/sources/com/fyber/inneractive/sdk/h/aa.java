package com.fyber.inneractive.sdk.h;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class aa {
    final InneractiveAdRequest a;
    final com.fyber.inneractive.sdk.l.c b;
    Map<String, String> c;

    public aa(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.l.c cVar) {
        this.a = inneractiveAdRequest;
        this.b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> a() {
        this.c = new HashMap();
        a("fromSDK", Boolean.toString(true));
        a("po", com.fyber.inneractive.sdk.config.f.c());
        a("secure", (com.fyber.inneractive.sdk.util.p.a() ^ true) || IAConfigManager.l() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        a("spotid", this.a.getSpotId());
        String k = com.fyber.inneractive.sdk.config.f.k();
        if (k == null) {
            k = this.a.getSelectedUnitConfig() == null ? null : this.a.getSelectedUnitConfig().a();
        }
        a("uid", k);
        if (TextUtils.isEmpty(this.a.getMediationVersion())) {
            a("med", this.a.getMediationName());
        } else {
            a("med", String.format("%s_%s", this.a.getMediationName(), this.a.getMediationVersion()));
        }
        a(InneractiveMediationDefs.GENDER_FEMALE, Integer.toString(372));
        List<Integer> b = this.b.b();
        if (!b.isEmpty()) {
            a("protocols", com.fyber.inneractive.sdk.util.l.b(",", b));
        }
        List<String> c = this.b.c();
        if (!c.isEmpty()) {
            a("mimes", com.fyber.inneractive.sdk.util.l.a(",", c));
        }
        List<Integer> a = this.b.a();
        if (!a.isEmpty()) {
            a("api", com.fyber.inneractive.sdk.util.l.b(",", a));
        }
        a("a", Integer.toString(this.a.getUserParams().getAge()));
        InneractiveUserConfig.Gender gender = this.a.getUserParams().getGender();
        if (InneractiveUserConfig.Gender.MALE.equals(gender)) {
            a("g", InneractiveMediationDefs.GENDER_MALE);
        } else if (InneractiveUserConfig.Gender.FEMALE.equals(gender)) {
            a("g", InneractiveMediationDefs.GENDER_FEMALE);
        }
        a("zip", this.a.getUserParams().getZipCode());
        a("k", this.a.getKeywords());
        a("t", Long.toString(System.currentTimeMillis()));
        a("v", this.b.a("2.2.0"));
        Boolean h = this.b.h();
        if (h != null) {
            a("gdpr_privacy_consent", h.booleanValue() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
        String d = com.fyber.inneractive.sdk.config.f.d();
        String str = com.fyber.inneractive.sdk.config.l.b() ? "amazonId" : "aaid";
        if (TextUtils.isEmpty(d)) {
            d = com.fyber.inneractive.sdk.config.l.a();
        }
        a(str, d);
        a("dnt", Boolean.toString(com.fyber.inneractive.sdk.config.l.c()));
        a("dml", this.b.s());
        int y = this.b.y();
        int z = this.b.z();
        if (y > 0 && z > 0) {
            a("w", Integer.toString(y));
            a("h", Integer.toString(z));
        }
        int A = this.b.A();
        a("o", A == 1 ? "p" : A == 2 ? "l" : "u");
        if (this.b.k() && IAConfigManager.q()) {
            a("lg", this.b.l() + "," + this.b.m());
            a("hacc", this.b.n());
            a("vacc", this.b.o());
            a("tacc", this.b.p());
        }
        a("ciso", this.b.q());
        a("os", "Android");
        a("mcc", this.b.u());
        a("mnc", this.b.t());
        a("nt", this.b.r());
        a("crn", this.b.v());
        a("lng", this.b.w());
        List<String> x = this.b.x();
        if (x != null && !x.isEmpty()) {
            a("in_lng", com.fyber.inneractive.sdk.util.l.a(",", x));
        }
        a("bid", this.b.d());
        a("appv", this.b.e());
        a("gdpr_consent_data", com.fyber.inneractive.sdk.util.l.p() == null ? null : IAConfigManager.g().b);
        a("us_privacy", com.fyber.inneractive.sdk.util.l.p() != null ? IAConfigManager.g().e : null);
        a("mute_video", Boolean.toString(this.a.getMuteVideo()));
        a("osv", Build.VERSION.RELEASE);
        HashMap hashMap = new HashMap();
        this.b.a(hashMap, this.a.getSpotId());
        for (Map.Entry entry : hashMap.entrySet()) {
            a((String) entry.getKey(), (String) entry.getValue());
        }
        return this.c;
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.c.put(str, str2);
    }
}
