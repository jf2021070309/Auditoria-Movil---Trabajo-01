package com.amazon.aps.iva.jo;

import com.amazon.aps.iva.ks.a;
/* compiled from: CrOwnershipVerificationAnalytics.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.us.b implements c {
    public final com.amazon.aps.iva.ds.a e;

    public d(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.fs.c> aVar2) {
        super(aVar2);
        this.e = aVar;
    }

    @Override // com.amazon.aps.iva.jo.c
    public final void K() {
        this.e.e(new com.amazon.aps.iva.es.d(com.amazon.aps.iva.js.i.CR_VOD_FUNIMATION_MIGRATION));
    }

    @Override // com.amazon.aps.iva.jo.c
    public final void M(com.amazon.aps.iva.fs.b bVar) {
        this.e.e(new com.amazon.aps.iva.es.c(a.C0456a.c(com.amazon.aps.iva.ls.a.ACCOUNT_OWNERSHIP_VERIFICATION, bVar), com.amazon.aps.iva.js.i.CR_VOD_FUNIMATION_MIGRATION));
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        this.e.c(defpackage.i.s(com.amazon.aps.iva.ls.a.ACCOUNT_OWNERSHIP_VERIFICATION, f, null, null, com.amazon.aps.iva.js.i.CR_VOD_FUNIMATION_MIGRATION, new com.amazon.aps.iva.is.a[0], 12));
    }

    @Override // com.amazon.aps.iva.jo.c
    public final void g(String str) {
        this.e.e(new com.amazon.aps.iva.es.b(str, com.amazon.aps.iva.js.i.CR_VOD_FUNIMATION_MIGRATION));
    }
}
