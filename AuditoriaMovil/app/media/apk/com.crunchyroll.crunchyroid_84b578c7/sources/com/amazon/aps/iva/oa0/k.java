package com.amazon.aps.iva.oa0;

import com.amazon.aps.iva.oa0.l;
/* compiled from: BatchManager.java */
/* loaded from: classes4.dex */
public final class k implements Runnable {
    public final /* synthetic */ i b;
    public final /* synthetic */ l c;

    public k(l lVar, h hVar) {
        this.c = lVar;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar = l.m;
        i iVar = this.b;
        iVar.j();
        l lVar2 = this.c;
        boolean z = lVar2.d;
        l.c cVar = lVar2.i;
        if (z && iVar.h()) {
            try {
                l.a(lVar2, iVar);
                return;
            } catch (com.amazon.aps.iva.if0.b e) {
                l lVar3 = l.m;
                e.getMessage();
                if (!lVar2.e) {
                    ((w0) cVar).a.b.b.a(iVar);
                    return;
                }
                return;
            }
        }
        iVar.h();
        ((w0) cVar).a.b.b.a(iVar);
    }
}
