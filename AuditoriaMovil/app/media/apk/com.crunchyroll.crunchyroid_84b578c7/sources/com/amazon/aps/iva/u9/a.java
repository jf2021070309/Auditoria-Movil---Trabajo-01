package com.amazon.aps.iva.u9;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public final class a extends d {
    public final /* synthetic */ com.amazon.aps.iva.l9.k c;
    public final /* synthetic */ UUID d;

    public a(com.amazon.aps.iva.l9.k kVar, UUID uuid) {
        this.c = kVar;
        this.d = uuid;
    }

    @Override // com.amazon.aps.iva.u9.d
    public final void b() {
        com.amazon.aps.iva.l9.k kVar = this.c;
        WorkDatabase workDatabase = kVar.c;
        workDatabase.c();
        try {
            d.a(kVar, this.d.toString());
            workDatabase.h();
            workDatabase.f();
            com.amazon.aps.iva.l9.f.a(kVar.b, kVar.c, kVar.e);
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
