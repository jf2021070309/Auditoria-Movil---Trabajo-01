package com.amazon.aps.iva.sv;

import android.content.Context;
/* compiled from: StorageInteractor.kt */
/* loaded from: classes2.dex */
public final class u2 implements t2 {
    public final Context a;
    public final b b;
    public final long c;

    public u2(Context context) {
        com.amazon.aps.iva.zv.b bVar = e.e;
        if (bVar != null) {
            o2 h = bVar.h();
            com.amazon.aps.iva.ff0.b bVar2 = new com.amazon.aps.iva.ff0.b();
            com.amazon.aps.iva.yb0.j.f(h, "configuration");
            this.a = context;
            this.b = bVar2;
            long j = 1024;
            this.c = h.e() * j * j;
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.sv.t2
    public final boolean a() {
        if (this.c < this.b.c(this.a).a) {
            return true;
        }
        return false;
    }
}
