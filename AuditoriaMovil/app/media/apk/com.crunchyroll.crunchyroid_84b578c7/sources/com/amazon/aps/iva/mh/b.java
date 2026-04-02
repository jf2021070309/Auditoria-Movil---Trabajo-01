package com.amazon.aps.iva.mh;

import com.amazon.aps.iva.cx.r;
import com.amazon.aps.iva.oe0.m;
/* compiled from: AcceptedTosMonitor.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final c a;
    public final l b;

    public b(c cVar, r rVar) {
        this.a = cVar;
        this.b = rVar;
    }

    @Override // com.amazon.aps.iva.mh.a
    public final boolean a() {
        c cVar = this.a;
        if (cVar.c()) {
            l lVar = this.b;
            if (!m.b0(lVar.a()) && !com.amazon.aps.iva.yb0.j.a(cVar.a(), lVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.mh.a
    public final void b() {
        this.a.b(this.b.a());
    }

    @Override // com.amazon.aps.iva.mh.a
    public final void onSignIn() {
        this.a.b(this.b.a());
    }
}
