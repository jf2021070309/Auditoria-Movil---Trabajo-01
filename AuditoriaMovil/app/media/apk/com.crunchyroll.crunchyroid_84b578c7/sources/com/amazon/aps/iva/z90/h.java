package com.amazon.aps.iva.z90;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.z90.f;
/* compiled from: SntpResponseCache.kt */
/* loaded from: classes4.dex */
public final class h implements g {
    public final com.amazon.aps.iva.x90.f a;
    public final com.amazon.aps.iva.x90.a b;

    public h(com.amazon.aps.iva.y90.b bVar, x xVar) {
        this.a = bVar;
        this.b = xVar;
    }

    @Override // com.amazon.aps.iva.z90.g
    public final void a(f.b bVar) {
        synchronized (this) {
            this.a.e(bVar.a);
            this.a.a(bVar.b);
            this.a.b(bVar.c);
            q qVar = q.a;
        }
    }

    @Override // com.amazon.aps.iva.z90.g
    public final void clear() {
        synchronized (this) {
            this.a.clear();
            q qVar = q.a;
        }
    }

    @Override // com.amazon.aps.iva.z90.g
    public final f.b get() {
        com.amazon.aps.iva.x90.f fVar = this.a;
        long currentTime = fVar.getCurrentTime();
        long c = fVar.c();
        long d = fVar.d();
        if (c == 0) {
            return null;
        }
        return new f.b(currentTime, c, d, this.b);
    }
}
