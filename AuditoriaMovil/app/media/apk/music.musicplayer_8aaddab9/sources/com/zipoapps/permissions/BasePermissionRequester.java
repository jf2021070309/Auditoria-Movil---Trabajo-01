package com.zipoapps.permissions;

import c.a.h.b;
import c.b.c.l;
import c.p.c;
import c.p.d;
import c.p.p;
import c.p.r;
import h.o.c.j;
/* loaded from: classes2.dex */
public abstract class BasePermissionRequester implements d {
    public final l a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4888b;

    public BasePermissionRequester(l lVar) {
        j.e(lVar, "activity");
        this.a = lVar;
        lVar.getLifecycle().a(this);
    }

    @Override // c.p.h
    public /* synthetic */ void a(p pVar) {
        c.d(this, pVar);
    }

    @Override // c.p.h
    public /* synthetic */ void b(p pVar) {
        c.a(this, pVar);
    }

    @Override // c.p.h
    public /* synthetic */ void d(p pVar) {
        c.c(this, pVar);
    }

    @Override // c.p.h
    public /* synthetic */ void e(p pVar) {
        c.f(this, pVar);
    }

    @Override // c.p.h
    public void f(p pVar) {
        j.e(pVar, "owner");
        g().b();
        r rVar = (r) pVar.getLifecycle();
        rVar.d("removeObserver");
        rVar.f2466b.e(this);
    }

    public abstract b<?> g();

    @Override // c.p.h
    public /* synthetic */ void h(p pVar) {
        c.e(this, pVar);
    }

    public abstract void i();
}
