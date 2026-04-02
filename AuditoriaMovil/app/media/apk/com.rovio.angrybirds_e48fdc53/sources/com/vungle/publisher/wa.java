package com.vungle.publisher;

import java.util.List;
import javax.inject.Singleton;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class wa extends vs {
    Float a;
    List<String> b;

    protected wa() {
    }

    public Float c() {
        return this.a;
    }

    public List<String> d() {
        return this.b;
    }

    @Override // com.vungle.publisher.vs, com.vungle.publisher.vt
    /* renamed from: a */
    public JSONObject b() {
        JSONObject b = super.b();
        b.putOpt("checkpoint", this.a);
        b.putOpt("urls", this.b);
        return b;
    }

    @Singleton
    /* loaded from: classes4.dex */
    protected static class a extends vy<wa> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vy
        /* renamed from: a */
        public wa c(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            wa b = b();
            b.a = ra.c(jSONObject, "checkpoint");
            a(jSONObject, "checkpoint", b.a);
            b.b = ra.h(jSONObject, "urls");
            a(jSONObject, "urls", b.b);
            return b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public wa[] b(int i) {
            return new wa[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public wa b() {
            return new wa();
        }
    }
}
