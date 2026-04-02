package com.amazon.aps.iva.g8;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.g8.r0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
/* compiled from: NavigatorProvider.kt */
@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes.dex */
public final class t0 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    /* compiled from: NavigatorProvider.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static String a(Class cls) {
            LinkedHashMap linkedHashMap = t0.b;
            String str = (String) linkedHashMap.get(cls);
            if (str == null) {
                r0.b bVar = (r0.b) cls.getAnnotation(r0.b.class);
                if (bVar != null) {
                    str = bVar.value();
                } else {
                    str = null;
                }
                if (b(str)) {
                    linkedHashMap.put(cls, str);
                } else {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
                }
            }
            com.amazon.aps.iva.yb0.j.c(str);
            return str;
        }

        public static boolean b(String str) {
            boolean z;
            if (str == null) {
                return false;
            }
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            return true;
        }
    }

    public final void a(r0 r0Var) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(r0Var, "navigator");
        String a2 = a.a(r0Var.getClass());
        if (a.b(a2)) {
            LinkedHashMap linkedHashMap = this.a;
            r0 r0Var2 = (r0) linkedHashMap.get(a2);
            if (!com.amazon.aps.iva.yb0.j.a(r0Var2, r0Var)) {
                if (r0Var2 != null && r0Var2.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (!r0Var.b) {
                        r0 r0Var3 = (r0) linkedHashMap.put(a2, r0Var);
                        return;
                    }
                    throw new IllegalStateException(("Navigator " + r0Var + " is already attached to another NavController").toString());
                }
                throw new IllegalStateException(("Navigator " + r0Var + " is replacing an already attached " + r0Var2).toString());
            }
            return;
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    public final <T extends r0<?>> T b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (a.b(str)) {
            T t = (T) this.a.get(str);
            if (t != null) {
                return t;
            }
            throw new IllegalStateException(defpackage.e.e("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }
}
