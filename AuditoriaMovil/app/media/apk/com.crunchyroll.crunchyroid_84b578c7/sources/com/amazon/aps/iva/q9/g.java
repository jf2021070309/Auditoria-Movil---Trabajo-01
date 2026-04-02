package com.amazon.aps.iva.q9;

import android.content.Context;
import android.os.Build;
import com.amazon.aps.iva.k9.n;
import com.amazon.aps.iva.t9.p;
/* compiled from: NetworkUnmeteredController.java */
/* loaded from: classes.dex */
public final class g extends c<com.amazon.aps.iva.p9.b> {
    public g(Context context, com.amazon.aps.iva.w9.a aVar) {
        super(com.amazon.aps.iva.r9.g.a(context, aVar).c);
    }

    @Override // com.amazon.aps.iva.q9.c
    public final boolean b(p pVar) {
        n nVar = pVar.j.a;
        if (nVar != n.UNMETERED && (Build.VERSION.SDK_INT < 30 || nVar != n.TEMPORARILY_UNMETERED)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.q9.c
    public final boolean c(com.amazon.aps.iva.p9.b bVar) {
        com.amazon.aps.iva.p9.b bVar2 = bVar;
        if (bVar2.a && !bVar2.c) {
            return false;
        }
        return true;
    }
}
