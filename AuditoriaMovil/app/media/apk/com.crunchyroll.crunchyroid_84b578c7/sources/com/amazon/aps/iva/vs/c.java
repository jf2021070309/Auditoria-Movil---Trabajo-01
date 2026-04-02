package com.amazon.aps.iva.vs;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.fz.j;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.ys.g;
import com.google.android.gms.common.Scopes;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: IdentifyPropertyFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public static final c a = new c();
    public static g b;
    @SuppressLint({"StaticFieldLeak"})
    public static com.amazon.aps.iva.hz.a c;
    public static j d;
    public static com.amazon.aps.iva.ct.j e;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d0  */
    @Override // com.amazon.aps.iva.vs.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap a() {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.vs.c.a():java.util.LinkedHashMap");
    }

    @Override // com.amazon.aps.iva.vs.b
    public final Map<String, Object> b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        return k.x(new com.amazon.aps.iva.kb0.j(Scopes.EMAIL, str));
    }

    @Override // com.amazon.aps.iva.vs.b
    public final Map<String, Object> c(String str) {
        String str2;
        com.amazon.aps.iva.kb0.j[] jVarArr = new com.amazon.aps.iva.kb0.j[2];
        com.amazon.aps.iva.hz.a aVar = c;
        if (aVar != null) {
            if (aVar.a()) {
                str2 = "enabled";
            } else {
                str2 = "disabled";
            }
            jVarArr[0] = new com.amazon.aps.iva.kb0.j("pushNotificationAndroid", str2);
            jVarArr[1] = new com.amazon.aps.iva.kb0.j("pushNotificationOptOut", str);
            return i0.U(jVarArr);
        }
        com.amazon.aps.iva.yb0.j.m("systemNotificationSettings");
        throw null;
    }

    @Override // com.amazon.aps.iva.vs.b
    public final LinkedHashMap d() {
        return i0.W(k.x(new com.amazon.aps.iva.kb0.j("userId", null)), c(com.amazon.aps.iva.fz.a.a));
    }
}
