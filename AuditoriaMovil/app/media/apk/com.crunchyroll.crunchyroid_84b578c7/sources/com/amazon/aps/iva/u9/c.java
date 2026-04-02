package com.amazon.aps.iva.u9;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public final class c extends d {
    public final /* synthetic */ com.amazon.aps.iva.l9.k c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public c(com.amazon.aps.iva.l9.k kVar, String str, boolean z) {
        this.c = kVar;
        this.d = str;
        this.e = z;
    }

    @Override // com.amazon.aps.iva.u9.d
    public final void b() {
        com.amazon.aps.iva.l9.k kVar = this.c;
        WorkDatabase workDatabase = kVar.c;
        workDatabase.c();
        try {
            Iterator it = ((com.amazon.aps.iva.t9.r) workDatabase.n()).g(this.d).iterator();
            while (it.hasNext()) {
                d.a(kVar, (String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            if (this.e) {
                com.amazon.aps.iva.l9.f.a(kVar.b, kVar.c, kVar.e);
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
