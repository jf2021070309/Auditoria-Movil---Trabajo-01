package com.vungle.publisher;

import com.vungle.publisher.wp;
import com.vungle.publisher.wv;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class wm extends wp {
    Boolean m;

    public Boolean n() {
        return this.m;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends wp.b<wm, wv.a> {
        @Inject
        wv.a b;

        @Override // com.vungle.publisher.wp.b
        /* renamed from: d */
        public wm e(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject(com.umeng.analytics.pro.bg.aw);
            wm wmVar = null;
            if (optJSONObject != null) {
                Boolean a = ra.a(optJSONObject.optJSONObject("ad_markup"), "shouldStream");
                Boolean valueOf = Boolean.valueOf(optJSONObject.has("sleepCode"));
                if (Boolean.TRUE.equals(a) && !valueOf.booleanValue()) {
                    wmVar = (wm) super.c(optJSONObject);
                } else {
                    wmVar = b();
                }
                wmVar.m = a;
            }
            return wmVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public wm[] b(int i) {
            return new wm[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: c */
        public wm b() {
            return new wm();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.wp.b
        /* renamed from: d */
        public wv.a e() {
            return this.b;
        }
    }
}
