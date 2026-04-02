package com.vungle.publisher;

import com.vungle.publisher.wp;
import com.vungle.publisher.wv;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class wg extends wp {
    String m;
    Integer n;
    String o;

    public String n() {
        return this.m;
    }

    public Integer o() {
        return this.n;
    }

    public String p() {
        return this.o;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends wp.b<wg, wv.a> {
        @Inject
        wv.a b;

        @Override // com.vungle.publisher.wp.b
        /* renamed from: d */
        public wg e(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            wg wgVar = (wg) super.c(jSONObject);
            JSONObject a = a();
            wgVar.m = ra.f(a, "postBundle");
            wgVar.n = ra.d(a, "size");
            wgVar.o = a.optString("md5");
            a(a, "md5", wgVar.o);
            return wgVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public wg[] b(int i) {
            return new wg[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: c */
        public wg b() {
            return new wg();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.wp.b
        /* renamed from: d */
        public wv.a e() {
            return this.b;
        }
    }
}
