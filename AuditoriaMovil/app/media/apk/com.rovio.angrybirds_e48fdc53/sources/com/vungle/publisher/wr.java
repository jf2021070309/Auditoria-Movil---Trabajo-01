package com.vungle.publisher;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.vungle.publisher.vu;
import com.vungle.publisher.wc;
import com.vungle.publisher.wz;
import com.vungle.publisher.xb;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class wr extends wc {
    JSONObject m;
    wz n;
    String o;
    String p;
    private boolean q;

    public boolean n() {
        return this.q;
    }

    public JSONObject o() {
        return this.m;
    }

    public wz p() {
        return this.n;
    }

    public String q() {
        return this.o;
    }

    public String r() {
        return this.p;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends wc.a<wr> {
        @Inject
        xb.a b;
        @Inject
        wz.a c;
        @Inject
        vu.a d;

        @Override // com.vungle.publisher.wc.a, com.vungle.publisher.vy
        /* renamed from: d */
        public wr c(JSONObject jSONObject) {
            wr wrVar = (wr) super.c(jSONObject);
            if (wrVar != null) {
                JSONObject a = a();
                JSONObject optJSONObject = a.optJSONObject("templateSettings");
                if (optJSONObject != null) {
                    wrVar.m = optJSONObject.optJSONObject("normal_replacements");
                    wrVar.n = this.c.c(optJSONObject.optJSONObject("cacheable_replacements"));
                }
                wrVar.p = ra.f(a, "templateId");
                wrVar.o = ra.f(a, "templateURL");
                wrVar.k = ra.f(a, MessengerShareContentUtility.TEMPLATE_TYPE);
                if (a.has("requires_sideloading")) {
                    wrVar.q = ra.a(a, "requires_sideloading").booleanValue();
                }
                wrVar.e = this.d.c(a.optJSONObject("tpat"));
            }
            return wrVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public wr[] b(int i) {
            return new wr[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: c */
        public wr b() {
            return new wr();
        }
    }
}
