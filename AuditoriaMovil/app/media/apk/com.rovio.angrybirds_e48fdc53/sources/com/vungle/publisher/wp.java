package com.vungle.publisher;

import com.vungle.publisher.wc;
import com.vungle.publisher.wu;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public abstract class wp extends wc {
    protected String p;
    protected a q;
    protected String r;
    protected Integer s;
    protected Integer t;
    protected Integer u;
    protected Integer v;
    protected String w;
    protected Integer x;

    public String q() {
        return this.p;
    }

    public a r() {
        return this.q;
    }

    public String s() {
        return this.r;
    }

    public Integer t() {
        return this.s;
    }

    public Integer u() {
        return this.t;
    }

    public Integer v() {
        return this.u;
    }

    public Integer w() {
        return this.v;
    }

    public String x() {
        return this.w;
    }

    public Integer y() {
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public static abstract class b<R extends wp, T extends wu.a<?>> extends wc.a<R> {
        @Inject
        protected a.C0335a c;

        protected abstract T e();

        @Override // com.vungle.publisher.wc.a, com.vungle.publisher.vy
        /* renamed from: e */
        public R c(JSONObject jSONObject) {
            R r = (R) super.c(jSONObject);
            if (r != null) {
                JSONObject a = a();
                r.p = ra.f(a, "callToActionDest");
                r.q = this.c.c(a.optJSONObject("cta_overlay"));
                r.r = ra.f(a, "callToActionUrl");
                r.s = ra.d(a, "showCloseIncentivized");
                r.t = ra.d(a, "showClose");
                r.u = ra.d(a, "countdown");
                r.v = ra.d(a, "videoHeight");
                a(a, "videoHeight", r.v);
                r.w = ra.f(a, "url");
                a(a, "url", r.w);
                r.x = ra.d(a, "videoWidth");
                a(a, "videoWidth", r.x);
                r.e = e().c(a.optJSONObject("tpat"));
            }
            return r;
        }
    }

    /* loaded from: classes4.dex */
    public static class a extends vs {
        protected Float a;
        protected Integer b;
        protected Boolean c;
        protected Boolean d;
        protected Integer e;

        protected a() {
        }

        public Float c() {
            return this.a;
        }

        public Boolean d() {
            return this.c;
        }

        public Boolean f() {
            return this.d;
        }

        public Integer g() {
            return this.e;
        }

        public Integer h() {
            return this.b;
        }

        @Override // com.vungle.publisher.vs, com.vungle.publisher.vt
        /* renamed from: a */
        public JSONObject b() {
            JSONObject b = super.b();
            b.putOpt("click_area", this.a);
            b.putOpt("enabled", this.c);
            b.putOpt("show_onclick", this.d);
            b.putOpt("time_show", this.e);
            b.putOpt("time_enabled", this.b);
            return b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Singleton
        /* renamed from: com.vungle.publisher.wp$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0335a extends vy<a> {
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.vungle.publisher.vy
            /* renamed from: a */
            public a c(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                a b = b();
                b.a = ra.c(jSONObject, "click_area");
                b.c = ra.a(jSONObject, "enabled");
                b.d = ra.a(jSONObject, "show_onclick");
                b.e = ra.d(jSONObject, "time_show");
                b.b = ra.d(jSONObject, "time_enabled");
                return b;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.vungle.publisher.vz
            /* renamed from: a */
            public a[] b(int i) {
                return new a[i];
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.vungle.publisher.vz
            /* renamed from: a */
            public a b() {
                return new a();
            }
        }
    }
}
