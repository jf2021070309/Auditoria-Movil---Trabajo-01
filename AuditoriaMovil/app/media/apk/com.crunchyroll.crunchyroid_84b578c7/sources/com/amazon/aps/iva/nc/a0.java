package com.amazon.aps.iva.nc;

import com.amazon.aps.iva.lc.d;
import com.amazon.aps.iva.nc.h;
import com.amazon.aps.iva.rc.o;
/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
public final class a0 implements d.a<Object> {
    public final /* synthetic */ o.a b;
    public final /* synthetic */ b0 c;

    public a0(b0 b0Var, o.a aVar) {
        this.c = b0Var;
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.lc.d.a
    public final void c(Exception exc) {
        boolean z;
        b0 b0Var = this.c;
        o.a<?> aVar = this.b;
        o.a<?> aVar2 = b0Var.g;
        if (aVar2 != null && aVar2 == aVar) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            b0 b0Var2 = this.c;
            o.a aVar3 = this.b;
            h.a aVar4 = b0Var2.c;
            com.amazon.aps.iva.kc.f fVar = b0Var2.h;
            com.amazon.aps.iva.lc.d<Data> dVar = aVar3.c;
            aVar4.b(fVar, exc, dVar, dVar.e());
        }
    }

    @Override // com.amazon.aps.iva.lc.d.a
    public final void f(Object obj) {
        boolean z;
        b0 b0Var = this.c;
        o.a<?> aVar = this.b;
        o.a<?> aVar2 = b0Var.g;
        if (aVar2 != null && aVar2 == aVar) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            b0 b0Var2 = this.c;
            o.a aVar3 = this.b;
            l lVar = b0Var2.b.p;
            if (obj != null && lVar.c(aVar3.c.e())) {
                b0Var2.f = obj;
                b0Var2.c.f();
                return;
            }
            h.a aVar4 = b0Var2.c;
            com.amazon.aps.iva.kc.f fVar = aVar3.a;
            com.amazon.aps.iva.lc.d<Data> dVar = aVar3.c;
            aVar4.a(fVar, obj, dVar, dVar.e(), b0Var2.h);
        }
    }
}
