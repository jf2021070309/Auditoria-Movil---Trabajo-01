package com.flurry.sdk;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class kq {
    private static final String a = kq.class.getSimpleName();
    private static final Map<Class<? extends kr>, kp> b = new LinkedHashMap();
    private final Map<Class<? extends kr>, kr> c = new LinkedHashMap();

    public static void a(Class<? extends kr> cls) {
        if (cls != null) {
            synchronized (b) {
                b.put(cls, new kp(cls));
            }
        }
    }

    public final synchronized void a(Context context) {
        ArrayList<kp> arrayList;
        if (context == null) {
            ko.a(5, a, "Null context.");
        } else {
            synchronized (b) {
                arrayList = new ArrayList(b.values());
            }
            for (kp kpVar : arrayList) {
                try {
                    if (kpVar.a != null && Build.VERSION.SDK_INT >= kpVar.b) {
                        kr newInstance = kpVar.a.newInstance();
                        newInstance.a(context);
                        this.c.put(kpVar.a, newInstance);
                    }
                } catch (Exception e) {
                    ko.a(5, a, "Flurry Module for class " + kpVar.a + " is not available:", e);
                }
            }
            lo.a().a(context);
            ke.a();
        }
    }

    public final kr b(Class<? extends kr> cls) {
        kr krVar;
        if (cls == null) {
            return null;
        }
        synchronized (this.c) {
            krVar = this.c.get(cls);
        }
        if (krVar == null) {
            throw new IllegalStateException("Module was not registered/initialized. " + cls);
        }
        return krVar;
    }
}
