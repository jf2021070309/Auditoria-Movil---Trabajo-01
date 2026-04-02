package com.kwad.sdk.core.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.kwad.sdk.utils.bb;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {
    public static final Map<String, Set<com.kwad.sdk.core.config.item.b>> akp = new ConcurrentHashMap();
    private static SharedPreferences akq = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, com.kwad.sdk.core.config.item.b<?> bVar) {
        SharedPreferences yT;
        if (bVar == null || (yT = yT()) == null) {
            return;
        }
        try {
            bVar.a(yT);
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
    }

    private static void a(SharedPreferences.Editor editor) {
        if (editor != null) {
            for (String str : akp.keySet()) {
                Set<com.kwad.sdk.core.config.item.b> set = akp.get(str);
                if (set != null && !set.isEmpty()) {
                    for (com.kwad.sdk.core.config.item.b bVar : set) {
                        if (bVar != null) {
                            bVar.b(editor);
                        }
                    }
                }
            }
        }
    }

    private static void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            for (String str : akp.keySet()) {
                Set<com.kwad.sdk.core.config.item.b> set = akp.get(str);
                if (set != null && !set.isEmpty()) {
                    for (com.kwad.sdk.core.config.item.b bVar : set) {
                        if (bVar != null) {
                            try {
                                bVar.a(sharedPreferences);
                            } catch (Exception e) {
                                com.kwad.sdk.core.e.c.printStackTraceOnly(e);
                            }
                        }
                    }
                }
            }
        }
    }

    public static <T> void a(com.kwad.sdk.core.config.item.b<T> bVar) {
        String key = bVar.getKey();
        if (TextUtils.isEmpty(key)) {
            return;
        }
        Set<com.kwad.sdk.core.config.item.b> cu = cu(key);
        if (cu == null) {
            cu = new CopyOnWriteArraySet<>();
            akp.put(key, cu);
        }
        cu.add(bVar);
    }

    public static synchronized boolean aQ(Context context) {
        synchronized (b.class) {
            SharedPreferences yT = yT();
            if (yT != null) {
                SharedPreferences.Editor edit = yT.edit();
                a(edit);
                return edit.commit();
            }
            return false;
        }
    }

    public static synchronized void aR(Context context) {
        synchronized (b.class) {
            SharedPreferences yT = yT();
            if (yT != null) {
                a(yT);
            }
        }
    }

    private static Set<com.kwad.sdk.core.config.item.b> cu(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return akp.get(str);
    }

    public static void g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : akp.keySet()) {
            Set<com.kwad.sdk.core.config.item.b> set = akp.get(str);
            if (set != null && !set.isEmpty() && jSONObject.has(str)) {
                for (com.kwad.sdk.core.config.item.b bVar : set) {
                    if (bVar != null) {
                        bVar.h(jSONObject);
                    }
                }
            }
        }
    }

    private static SharedPreferences yT() {
        if (akq == null) {
            akq = bb.fI("ksadsdk_config");
        }
        return akq;
    }
}
