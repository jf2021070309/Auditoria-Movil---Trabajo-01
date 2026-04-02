package com.vungle.publisher;

import com.vungle.publisher.wc;
import javax.inject.Singleton;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class wj extends wc {
    private String m;

    public String n() {
        return this.m;
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends wc.a<wj> {
        @Override // com.vungle.publisher.wc.a, com.vungle.publisher.vy
        /* renamed from: d */
        public wj c(JSONObject jSONObject) {
            wj wjVar = (wj) super.c(jSONObject);
            if (wjVar != null) {
                wjVar.m = ra.f(jSONObject, "mraidContent");
            }
            return wjVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public wj[] b(int i) {
            return new wj[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: c */
        public wj b() {
            return new wj();
        }
    }
}
