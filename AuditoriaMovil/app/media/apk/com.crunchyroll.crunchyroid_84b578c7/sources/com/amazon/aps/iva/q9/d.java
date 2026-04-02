package com.amazon.aps.iva.q9;

import android.content.Context;
import com.amazon.aps.iva.k9.n;
import com.amazon.aps.iva.t9.p;
/* compiled from: NetworkConnectedController.java */
/* loaded from: classes.dex */
public final class d extends c<com.amazon.aps.iva.p9.b> {
    public d(Context context, com.amazon.aps.iva.w9.a aVar) {
        super(com.amazon.aps.iva.r9.g.a(context, aVar).c);
    }

    @Override // com.amazon.aps.iva.q9.c
    public final boolean b(p pVar) {
        if (pVar.j.a == n.CONNECTED) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.q9.c
    public final boolean c(com.amazon.aps.iva.p9.b bVar) {
        com.amazon.aps.iva.p9.b bVar2 = bVar;
        if (bVar2.a && bVar2.b) {
            return false;
        }
        return true;
    }
}
