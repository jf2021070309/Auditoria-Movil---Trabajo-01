package com.amazon.aps.iva.ia0;

import com.amazon.aps.iva.ka0.a0;
import com.amazon.aps.iva.ka0.d;
import com.amazon.aps.iva.ka0.g;
/* loaded from: classes4.dex */
public final class b {
    public static Boolean a = Boolean.FALSE;

    public static void a(String str, String str2) {
        d dVar = a0.r;
        if (a.booleanValue() && dVar != null) {
            dVar.m(g.DEBUG, str, str2);
        }
    }

    public static void b(String str, String str2) {
        d dVar = a0.r;
        if (a.booleanValue() && dVar != null) {
            dVar.m(g.WARN, str, str2);
        }
    }
}
