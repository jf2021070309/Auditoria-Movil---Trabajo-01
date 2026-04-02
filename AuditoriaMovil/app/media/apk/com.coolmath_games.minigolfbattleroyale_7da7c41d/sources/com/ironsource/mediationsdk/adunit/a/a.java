package com.ironsource.mediationsdk.adunit.a;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    private int a;
    private long b;
    private JSONObject c;

    public a(int i, long j, JSONObject jSONObject) {
        this.a = -1;
        this.b = -1L;
        this.a = i;
        this.b = j;
        this.c = jSONObject;
    }

    public a(int i, JSONObject jSONObject) {
        this.a = -1;
        this.b = -1L;
        this.a = i;
        this.b = System.currentTimeMillis();
        if (jSONObject == null) {
            this.c = new JSONObject();
        } else {
            this.c = jSONObject;
        }
    }

    public static int a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_INIT_EXCEPTION;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_INIT_EXCEPTION;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    public static int b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_LOAD_DURING_SHOW;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_LOAD_DURING_SHOW;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public void a(String str, Object obj) {
        try {
            this.c.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public long b() {
        return this.b;
    }

    public String c() {
        return this.c.toString();
    }

    public JSONObject d() {
        return this.c;
    }
}
