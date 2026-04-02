package com.fyber.inneractive.sdk.j;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.t;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.h.j;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.q;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class b {
    protected e a;
    String b;
    private j c;
    private boolean d = true;
    private boolean e = true;

    public abstract e a();

    public abstract void a(String str, t tVar) throws Exception;

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public final void a(j jVar) {
        this.c = jVar;
        this.a = a();
    }

    public final e a(String str) throws Exception {
        String str2;
        long j;
        this.e = str != null;
        this.a.d = System.currentTimeMillis();
        ImpressionData impressionData = new ImpressionData();
        Map<String, String> a = this.c.a();
        String a2 = a(a, com.fyber.inneractive.sdk.h.i.RETURNED_AD_TYPE);
        String a3 = a(a, com.fyber.inneractive.sdk.h.i.ERROR_CODE);
        String a4 = a(a, com.fyber.inneractive.sdk.h.i.SESSION_ID);
        String a5 = a(a, com.fyber.inneractive.sdk.h.i.CONTENT_ID);
        String a6 = a(a, com.fyber.inneractive.sdk.h.i.PUBLISHER_ID);
        String a7 = a(a, com.fyber.inneractive.sdk.h.i.WIDTH);
        String a8 = a(a, com.fyber.inneractive.sdk.h.i.HEIGHT);
        String a9 = a(a, com.fyber.inneractive.sdk.h.i.SDK_IMPRESSION_URL);
        String a10 = a(a, com.fyber.inneractive.sdk.h.i.SDK_CLICK_URL);
        String a11 = a(a, com.fyber.inneractive.sdk.h.i.AD_TIMEOUT);
        String a12 = a(a, com.fyber.inneractive.sdk.h.i.AD_COMPLETION_URL);
        this.b = a(a, com.fyber.inneractive.sdk.h.i.AD_UNIT_ID);
        String a13 = a(a, com.fyber.inneractive.sdk.h.i.AD_UNIT_TYPE);
        String a14 = a(a, com.fyber.inneractive.sdk.h.i.AD_UNIT_DISPLAY_TYPE);
        String a15 = a(a, com.fyber.inneractive.sdk.h.i.AD_NETWORK);
        String a16 = a(a, com.fyber.inneractive.sdk.h.i.AD_NETWORK_ID);
        String a17 = a(a, com.fyber.inneractive.sdk.h.i.CREATIVE_ID);
        String a18 = a(a, com.fyber.inneractive.sdk.h.i.AD_DOMAIN);
        String a19 = a(a, com.fyber.inneractive.sdk.h.i.APP_BUNDLE);
        String a20 = a(a, com.fyber.inneractive.sdk.h.i.CAMPAIGN_ID);
        String a21 = a(a, com.fyber.inneractive.sdk.h.i.CPM_VALUE);
        String a22 = a(a, com.fyber.inneractive.sdk.h.i.CPM_CURRENCY);
        impressionData.setCpmValue(a21);
        impressionData.setCurrency(a22);
        String a23 = a(a, com.fyber.inneractive.sdk.h.i.BANNER_MRC_PERCENT);
        String a24 = a(a, com.fyber.inneractive.sdk.h.i.BANNER_MRC_DURATION);
        String a25 = a(a, com.fyber.inneractive.sdk.h.i.BANNER_MRC_IMPRESSION_URL);
        String a26 = a(a, com.fyber.inneractive.sdk.h.i.INTERSTITIAL_SKIP_MODE);
        if (b()) {
            str2 = a26;
            this.a.u = a;
        } else {
            str2 = a26;
        }
        e eVar = this.a;
        try {
            j = Long.parseLong(a11);
        } catch (NumberFormatException unused) {
            j = 20;
        }
        eVar.c = j;
        eVar.b = eVar.d + TimeUnit.MINUTES.toMillis(j);
        impressionData.setImpressionId(a4);
        impressionData.setDemandSource(a15);
        this.a.e = a5;
        this.a.f = a6;
        this.a.k = a3;
        this.a.C = a19;
        if (!TextUtils.isEmpty(a16)) {
            impressionData.setDemandId(Long.valueOf(a16));
        }
        if (!TextUtils.isEmpty(a2)) {
            this.a.i = Integer.valueOf(a2).intValue();
        }
        if (!TextUtils.isEmpty(a7)) {
            this.a.g = Integer.valueOf(a7).intValue();
        }
        if (!TextUtils.isEmpty(a8)) {
            this.a.h = Integer.valueOf(a8).intValue();
        }
        this.a.n = a9;
        this.a.o = a10;
        this.a.t = a12;
        this.a.p = this.b;
        this.a.q = a13;
        try {
            this.a.r = UnitDisplayType.fromValue(a14);
        } catch (IllegalArgumentException e) {
            if (!this.d) {
                throw e;
            }
            this.a.r = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(a17)) {
            impressionData.setCreativeId(a17);
        }
        if (!TextUtils.isEmpty(a18)) {
            impressionData.setAdvertiserDomain(a18);
        }
        if (!TextUtils.isEmpty(a20)) {
            impressionData.setCampaignId(a20);
        }
        impressionData.setCountry(k.h());
        this.a.v = impressionData;
        this.a.x = q.a(a23, 0);
        this.a.y = q.a(a24);
        this.a.z = a25;
        this.a.A = q.a(str2, -1);
        String stringBuffer = this.c.b().toString();
        this.a.j = stringBuffer;
        t a27 = com.fyber.inneractive.sdk.config.a.a(this.b);
        IAlog.b("%sGot unit config for unitId: %s from config manager", IAlog.a(this), this.b);
        IAlog.b("%s%s", IAlog.a(this), a27);
        if (a27 != null || this.d) {
            if (this.e) {
                a(str, a27);
            } else if (c()) {
                h hVar = new h(stringBuffer);
                if (hVar.a) {
                    String str3 = hVar.b;
                    if (str3 == null || TextUtils.isEmpty(str3.trim())) {
                        throw new Exception("empty ad content detected. failing fast.");
                    }
                    a(str3, a27);
                }
            } else {
                a(stringBuffer, a27);
            }
        } else {
            this.a.l = "ErrorConfigurationMismatch";
        }
        return this.a;
    }

    private String a(Map<String, String> map, com.fyber.inneractive.sdk.h.i iVar) {
        String str = iVar.E;
        String str2 = map.get(str);
        IAlog.a("%s%s extracted from response header: %s", IAlog.a(this), str, str2);
        IAlog.a(IAlog.b, "%s %s : %s", "RESPONSE_HEADER", str, str2);
        return str2;
    }
}
