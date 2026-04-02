package com.amazon.aps.iva.o30;

import com.amazon.aps.iva.d20.i;
import com.amazon.aps.iva.l40.b1;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ScreenRefreshManager.kt */
/* loaded from: classes2.dex */
public abstract class a implements c {
    public b a;

    @Override // com.amazon.aps.iva.o30.c
    public final void a(i iVar) {
        j.f(iVar, "locker");
        if (j.a(this.a, iVar)) {
            this.a = null;
        }
    }

    @Override // com.amazon.aps.iva.o30.c
    public final void b(b bVar) {
        j.f(bVar, "locker");
        if (j.a(this.a, bVar)) {
            this.a = null;
            d();
        }
    }

    @Override // com.amazon.aps.iva.o30.c
    public final void d() {
        if (this.a == null) {
            b1 b1Var = (b1) this;
            b1Var.b.invoke();
            com.amazon.aps.iva.u70.i iVar = b1Var.d;
            if (iVar != null) {
                b1Var.c.invoke(iVar);
                b1Var.d = null;
            }
        }
    }

    @Override // com.amazon.aps.iva.o30.c
    public final void f(i iVar) {
        this.a = iVar;
    }
}
