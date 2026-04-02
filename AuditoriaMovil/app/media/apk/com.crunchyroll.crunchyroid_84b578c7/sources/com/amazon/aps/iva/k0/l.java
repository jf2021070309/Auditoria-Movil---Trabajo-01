package com.amazon.aps.iva.k0;

import com.amazon.aps.iva.c2.y;
/* compiled from: SelectionController.kt */
/* loaded from: classes.dex */
public final class l {
    public static final boolean a(y yVar, long j, long j2) {
        if (yVar == null) {
            return false;
        }
        int length = yVar.a.a.b.length();
        int m = yVar.m(j);
        int m2 = yVar.m(j2);
        int i = length - 1;
        if ((m < i || m2 < i) && (m >= 0 || m2 >= 0)) {
            return false;
        }
        return true;
    }
}
