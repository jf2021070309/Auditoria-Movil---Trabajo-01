package com.amazon.aps.iva.qv;

import com.amazon.aps.iva.gv.i;
/* compiled from: ModifyCrunchylistsAnalytics.kt */
/* loaded from: classes2.dex */
public final class c0 extends com.amazon.aps.iva.us.b implements b0 {
    public final com.amazon.aps.iva.gv.i e;
    public final com.amazon.aps.iva.ds.a f;

    public c0(com.amazon.aps.iva.gv.i iVar, com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.fs.c> aVar2) {
        super(aVar2);
        this.e = iVar;
        this.f = aVar;
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        com.amazon.aps.iva.gv.i iVar = this.e;
        boolean z = iVar instanceof i.b;
        com.amazon.aps.iva.ds.a aVar = this.f;
        if (z) {
            aVar.c(defpackage.i.s(com.amazon.aps.iva.ls.a.CREATE_CRUNCHYLIST_MODAL, f, null, null, null, new com.amazon.aps.iva.is.a[0], 28));
        } else if (iVar instanceof i.a) {
            com.amazon.aps.iva.ls.a aVar2 = com.amazon.aps.iva.ls.a.CREATE_CRUNCHYLIST_MODAL;
            com.amazon.aps.iva.bv.d dVar = ((i.a) iVar).b;
            aVar.c(defpackage.i.s(aVar2, f, com.amazon.aps.iva.e.w.v(dVar.e, dVar.b, dVar.d, dVar.c), null, null, new com.amazon.aps.iva.is.a[0], 24));
        }
    }
}
