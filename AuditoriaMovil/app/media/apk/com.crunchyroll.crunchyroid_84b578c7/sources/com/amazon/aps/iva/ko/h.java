package com.amazon.aps.iva.ko;

import com.amazon.aps.iva.co.c;
import com.amazon.aps.iva.es.y;
import com.amazon.aps.iva.es.z;
import com.amazon.aps.iva.js.q0;
import com.amazon.aps.iva.js.r0;
import com.amazon.aps.iva.ks.a;
/* compiled from: UserMigrationWelcomeAnalytics.kt */
/* loaded from: classes2.dex */
public final class h implements g {
    public final com.amazon.aps.iva.ds.a a;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.fs.c> b;
    public final com.amazon.aps.iva.fs.c c;
    public boolean d = true;

    /* JADX WARN: Multi-variable type inference failed */
    public h(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.fs.c> aVar2) {
        this.a = aVar;
        this.b = aVar2;
        this.c = (com.amazon.aps.iva.fs.c) aVar2.invoke();
    }

    @Override // com.amazon.aps.iva.ko.g
    public final void A(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new y(a.C0456a.c(com.amazon.aps.iva.ls.a.DATA_MIGRATION_CONFIRMATION, bVar), q0.CANCELED, com.amazon.aps.iva.js.i.CR_VOD_PARENTAL_CONTROLS));
    }

    @Override // com.amazon.aps.iva.ko.g
    public final void B(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new y(a.C0456a.c(com.amazon.aps.iva.ls.a.DATA_MIGRATION_CONFIRMATION, bVar), q0.CONFIRMED, com.amazon.aps.iva.js.i.CR_VOD_PARENTAL_CONTROLS));
    }

    @Override // com.amazon.aps.iva.ko.g
    public final void C() {
        this.a.c(defpackage.i.s(com.amazon.aps.iva.ls.a.DATA_MIGRATION_CONFIRMATION, 0.0f, null, null, com.amazon.aps.iva.js.i.CR_VOD_FUNIMATION_MIGRATION, new com.amazon.aps.iva.is.a[0], 12));
    }

    @Override // com.amazon.aps.iva.ko.g
    public final void x(com.amazon.aps.iva.co.c cVar, com.amazon.aps.iva.fs.b bVar) {
        r0 r0Var;
        com.amazon.aps.iva.ks.a c = a.C0456a.c(com.amazon.aps.iva.ls.a.MIGRATION_WELCOME, bVar);
        if (com.amazon.aps.iva.yb0.j.a(cVar, c.a.b)) {
            r0Var = r0.MERGE_FN_AND_CR;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, c.b.b)) {
            r0Var = r0.KEEP_FN;
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, c.C0182c.b)) {
            r0Var = r0.KEEP_CR;
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        this.a.e(new z(c, r0Var, com.amazon.aps.iva.js.i.CR_VOD_FUNIMATION_MIGRATION));
    }

    @Override // com.amazon.aps.iva.ko.g
    public final void y(com.amazon.aps.iva.fs.b bVar) {
        this.a.e(new com.amazon.aps.iva.es.q(a.C0456a.c(com.amazon.aps.iva.ls.a.MIGRATION_WELCOME, bVar), com.amazon.aps.iva.js.i.CR_VOD_FUNIMATION_MIGRATION));
    }

    @Override // com.amazon.aps.iva.ko.g
    public final void z(com.amazon.aps.iva.ks.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "migrationResultProperty");
        if (this.d) {
            this.d = false;
            this.a.c(defpackage.i.s(com.amazon.aps.iva.ls.a.MIGRATION_WELCOME, this.c.a(), null, null, com.amazon.aps.iva.js.i.CR_VOD_FUNIMATION_MIGRATION, new com.amazon.aps.iva.is.a[]{lVar}, 12));
        }
    }
}
