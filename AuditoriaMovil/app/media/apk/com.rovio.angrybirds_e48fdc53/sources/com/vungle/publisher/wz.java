package com.vungle.publisher;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Singleton;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class wz {
    Map<String, wy> a;

    public Collection<wy> a() {
        return this.a.values();
    }

    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends vy<wz> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vy
        /* renamed from: a */
        public wz c(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            wz b = b();
            b.a = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                b.a.put(next, new wy(next, jSONObject.getJSONObject(next)));
            }
            return b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public wz[] b(int i) {
            return new wz[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public wz b() {
            return new wz();
        }
    }
}
