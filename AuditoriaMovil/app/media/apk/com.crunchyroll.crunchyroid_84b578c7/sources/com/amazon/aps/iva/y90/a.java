package com.amazon.aps.iva.y90;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.x90.c;
import com.amazon.aps.iva.x90.d;
import com.amazon.aps.iva.z90.i;
import com.amazon.aps.iva.z90.j;
/* compiled from: KronosClockImpl.kt */
/* loaded from: classes4.dex */
public final class a implements c {
    public final i a;
    public final com.amazon.aps.iva.x90.a b;

    public a(j jVar, x xVar) {
        this.a = jVar;
        this.b = xVar;
    }

    @Override // com.amazon.aps.iva.x90.a
    public final long a() {
        return b().a;
    }

    public final d b() {
        d a = this.a.a();
        if (a == null) {
            return new d(null, this.b.a());
        }
        return a;
    }

    @Override // com.amazon.aps.iva.x90.a
    public final long c() {
        return this.b.c();
    }

    @Override // com.amazon.aps.iva.x90.c
    public final void shutdown() {
        this.a.shutdown();
    }
}
