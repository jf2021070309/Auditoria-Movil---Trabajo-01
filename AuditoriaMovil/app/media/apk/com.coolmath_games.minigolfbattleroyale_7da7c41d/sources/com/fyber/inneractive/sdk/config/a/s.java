package com.fyber.inneractive.sdk.config.a;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* loaded from: classes.dex */
public final class s {
    private static String d = "SupportedFeaturesProvider";
    Map<Class, com.fyber.inneractive.sdk.config.a.a.d> b;
    JSONArray c;
    String a = "";
    private final r e = new r();

    private s() {
        HashMap hashMap = new HashMap();
        hashMap.put(com.fyber.inneractive.sdk.config.a.a.f.class, new com.fyber.inneractive.sdk.config.a.a.f());
        hashMap.put(com.fyber.inneractive.sdk.config.a.a.a.class, new com.fyber.inneractive.sdk.config.a.a.a());
        hashMap.put(com.fyber.inneractive.sdk.config.a.a.b.class, new com.fyber.inneractive.sdk.config.a.a.b());
        hashMap.put(com.fyber.inneractive.sdk.config.a.a.c.class, new com.fyber.inneractive.sdk.config.a.a.c());
        hashMap.put(com.fyber.inneractive.sdk.config.a.a.e.class, new com.fyber.inneractive.sdk.config.a.a.e());
        this.b = hashMap;
        this.c = null;
        Map<Class, com.fyber.inneractive.sdk.config.a.a.d> d2 = d();
        this.b = d2;
        IAlog.b("%s: created. Supported features: %s", d, d2);
    }

    private Map<Class, com.fyber.inneractive.sdk.config.a.a.d> d() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Class, com.fyber.inneractive.sdk.config.a.a.d> entry : this.b.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().c());
        }
        return hashMap;
    }

    public static s a() {
        return new s();
    }

    public final void a(e eVar) {
        for (com.fyber.inneractive.sdk.config.a.a.d dVar : this.b.values()) {
            List<b> list = dVar.b;
            for (int size = list.size() - 1; size >= 0; size--) {
                b bVar = list.get(size);
                List<d> list2 = bVar.d;
                if (list2 != null) {
                    Iterator<d> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        d next = it.next();
                        if (next.a(eVar)) {
                            dVar.b.remove(bVar);
                            dVar.d.remove(bVar.a);
                            IAlog.b("%s: Experiment %s filtered! after response %s", d, bVar.a, next);
                            break;
                        }
                    }
                }
            }
        }
    }

    public final <T extends com.fyber.inneractive.sdk.config.a.a.d> T a(Class<T> cls) {
        if (this.b.containsKey(cls)) {
            return (T) this.b.get(cls);
        }
        return null;
    }

    public final JSONArray b() {
        if (this.c == null) {
            JSONArray a = g.a(this.b, false);
            this.c = a;
            IAlog.b("%s: active experiments json set = %s", d, a);
        }
        return this.c;
    }

    public final JSONArray c() {
        JSONArray a = g.a(this.b, true);
        IAlog.b("%s: active experiments json set = %s", d, a);
        return a;
    }

    public final void a(String str) {
        this.a = str;
        IAConfigManager.e().a(this);
    }

    public static JSONArray a(com.fyber.inneractive.sdk.d.c cVar, com.fyber.inneractive.sdk.d.g<?> gVar) {
        if (cVar != null && cVar.e != null) {
            return cVar.e.b();
        }
        if (gVar == null || gVar.i() == null) {
            return null;
        }
        return gVar.i().b();
    }
}
