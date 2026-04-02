package com.vungle.publisher;

import com.vungle.publisher.wc;
import javax.inject.Singleton;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class wd extends wc {
    boolean m;
    JSONObject n;

    protected wd() {
    }

    public boolean n() {
        return this.m;
    }

    public JSONObject o() {
        return this.n;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends wc.a<wd> {
        @Override // com.vungle.publisher.wc.a, com.vungle.publisher.vy
        /* renamed from: d */
        public wd c(JSONObject jSONObject) {
            wd wdVar = (wd) super.c(jSONObject);
            wdVar.n = jSONObject;
            wdVar.m = wdVar.j() == null;
            return wdVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public wd[] b(int i) {
            return new wd[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: c */
        public wd b() {
            return new wd();
        }
    }
}
