package com.vungle.publisher;

import com.vungle.publisher.wu;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class vu extends wu {
    protected Map<String, List<String>> a;

    public Collection<String> c() {
        if (this.a == null) {
            return null;
        }
        return this.a.keySet();
    }

    public List<String> a(String str) {
        if (this.a == null) {
            return null;
        }
        return this.a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Singleton
    /* loaded from: classes4.dex */
    public static class a extends wu.a<vu> {
        @Inject
        Provider<vu> a;

        @Override // com.vungle.publisher.wu.a, com.vungle.publisher.vy
        /* renamed from: a */
        public vu c(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            vu b = b();
            b.a = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                List<String> h = ra.h(jSONObject, next);
                if (next != null && h != null) {
                    b.a.put(next, h);
                }
            }
            return b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public vu[] b(int i) {
            return new vu[i];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.vungle.publisher.vz
        /* renamed from: a */
        public vu b() {
            return this.a.get();
        }
    }
}
