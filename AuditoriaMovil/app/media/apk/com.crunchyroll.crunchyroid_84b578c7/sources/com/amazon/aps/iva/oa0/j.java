package com.amazon.aps.iva.oa0;

import com.amazon.aps.iva.oa0.r;
/* compiled from: BatchManager.java */
/* loaded from: classes4.dex */
public final class j implements r.b {
    public final /* synthetic */ l a;

    public j(l lVar) {
        this.a = lVar;
    }

    @Override // com.amazon.aps.iva.oa0.r.b
    public final void a() {
        r rVar = r.g;
        l lVar = this.a;
        rVar.d.remove(lVar.f);
        lVar.d = r.g.a.c();
        lVar.e = r.g.a.b();
    }

    @Override // com.amazon.aps.iva.oa0.r.b
    public final void b() {
        r rVar = r.g;
        rVar.d.remove(l.m.f);
    }
}
