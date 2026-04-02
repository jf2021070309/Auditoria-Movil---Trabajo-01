package com.amazon.aps.iva.k2;

import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.c2.q;
import com.amazon.aps.iva.c2.s;
/* compiled from: AndroidParagraphIntrinsics.android.kt */
/* loaded from: classes.dex */
public final class e {
    public static final boolean a(a0 a0Var) {
        com.amazon.aps.iva.c2.e eVar;
        boolean z;
        q qVar;
        s sVar = a0Var.c;
        if (sVar != null && (qVar = sVar.b) != null) {
            eVar = new com.amazon.aps.iva.c2.e(qVar.b);
        } else {
            eVar = null;
        }
        if (eVar != null && eVar.a == 1) {
            z = true;
        } else {
            z = false;
        }
        return true ^ z;
    }
}
