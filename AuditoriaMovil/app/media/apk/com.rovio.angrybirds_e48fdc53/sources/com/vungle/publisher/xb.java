package com.vungle.publisher;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Singleton;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class xb extends vs {
    private Map<String, String> a;

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends vy<xb> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vy
        /* renamed from: a */
        public xb c(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            xb b = b();
            b.a = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                b.a.put(next, ra.f(jSONObject, next));
            }
            return b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public xb[] b(int i) {
            return new xb[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public xb b() {
            return new xb();
        }
    }
}
