package com.vungle.publisher;

import com.vungle.publisher.log.Logger;
import com.vungle.publisher.m;
import javax.inject.Inject;
import org.json.JSONArray;
import org.json.JSONObject;
import rx.exceptions.Exceptions;
/* loaded from: classes4.dex */
public abstract class wc {
    String a;
    Integer b;
    String c;
    Long d;
    wu e;
    m f;
    String g;
    Integer h;
    String i;
    String j;
    String k;
    protected String l;

    public String a() {
        return this.c;
    }

    public String b() {
        return yx.a(this.c, "ad_token");
    }

    public Long c() {
        return this.d;
    }

    public m d() {
        return this.f;
    }

    public wu e() {
        return this.e;
    }

    public String f() {
        return this.g;
    }

    public String g() {
        return this.l;
    }

    public String h() {
        return this.i;
    }

    public Integer i() {
        return this.h;
    }

    public Long j() {
        if (this.b == null) {
            return null;
        }
        return Long.valueOf(ze.a(this.b.intValue(), 1000L));
    }

    public boolean k() {
        return this.d.longValue() * 1000 < System.currentTimeMillis();
    }

    public String l() {
        return this.j;
    }

    public String m() {
        return this.k;
    }

    /* loaded from: classes4.dex */
    public static abstract class a<R extends wc> extends vy<R> {
        @Inject
        protected m.a a;
        private JSONObject b;

        @Override // com.vungle.publisher.vy
        /* renamed from: a */
        public R c(JSONObject jSONObject) {
            R r = null;
            if (jSONObject != null) {
                r = (R) b();
                JSONObject d = d(jSONObject);
                if (d != null) {
                    String f = ra.f(d, "placement_reference_id");
                    Logger.d(Logger.PROTOCOL_TAG, "Got AdUnit for placement: " + f);
                    JSONObject jSONObject2 = d.getJSONObject("ad_markup");
                    if (jSONObject2 != null) {
                        b(jSONObject2);
                        r.j = f;
                        r.c = ra.f(jSONObject2, "ad_token");
                        r.i = ra.f(jSONObject2, "app_id");
                        r.h = ra.d(jSONObject2, "delay");
                        r.l = ra.f(jSONObject2, "id");
                        r.f = this.a.a(ra.f(jSONObject2, VungleAdActivity.AD_TYPE_EXTRA_KEY));
                        r.g = ra.f(jSONObject2, "campaign");
                        a(jSONObject2, "id", r.l);
                        a(jSONObject2, "campaign", r.g);
                        Long e = ra.e(jSONObject2, "expiry");
                        r.d = e;
                        a(jSONObject2, "expiry", e);
                        r.b = ra.d(jSONObject2, "sleep");
                        r.a = ra.f(jSONObject2, "sleepCode");
                    } else {
                        Exceptions.propagate(new Throwable("No ad_markup in v5/api/ads response"));
                    }
                } else {
                    Exceptions.propagate(new Throwable("No AdPlacementUnit in v5/api/ads response"));
                }
            }
            return r;
        }

        private JSONObject d(JSONObject jSONObject) {
            if (jSONObject.has("ads")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("ads");
                if (optJSONArray == null) {
                    return null;
                }
                return optJSONArray.getJSONObject(0);
            } else if (jSONObject.has("ad_markup")) {
                return jSONObject;
            } else {
                return null;
            }
        }

        public JSONObject a() {
            return this.b;
        }

        public void b(JSONObject jSONObject) {
            this.b = jSONObject;
        }
    }
}
