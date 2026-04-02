package com.amazon.aps.iva.u1;
/* compiled from: UiApplier.android.kt */
/* loaded from: classes.dex */
public final class m1 extends com.amazon.aps.iva.o0.a<androidx.compose.ui.node.e> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(androidx.compose.ui.node.e eVar) {
        super(eVar);
        com.amazon.aps.iva.yb0.j.f(eVar, "root");
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void a(int i, int i2, int i3) {
        ((androidx.compose.ui.node.e) this.c).J(i, i2, i3);
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void b(int i, int i2) {
        ((androidx.compose.ui.node.e) this.c).P(i, i2);
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void c(int i, Object obj) {
        com.amazon.aps.iva.yb0.j.f((androidx.compose.ui.node.e) obj, "instance");
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void d() {
        androidx.compose.ui.node.p pVar = ((androidx.compose.ui.node.e) this.a).j;
        if (pVar != null) {
            pVar.q();
        }
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void f(int i, Object obj) {
        androidx.compose.ui.node.e eVar = (androidx.compose.ui.node.e) obj;
        com.amazon.aps.iva.yb0.j.f(eVar, "instance");
        ((androidx.compose.ui.node.e) this.c).A(i, eVar);
    }

    @Override // com.amazon.aps.iva.o0.a
    public final void i() {
        ((androidx.compose.ui.node.e) this.a).O();
    }
}
