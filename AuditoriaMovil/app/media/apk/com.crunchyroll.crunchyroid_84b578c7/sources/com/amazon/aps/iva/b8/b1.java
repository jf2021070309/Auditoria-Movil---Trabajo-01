package com.amazon.aps.iva.b8;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.t5.o;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements p1.c, p1.b, o.a {
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ b1(int i, int i2, Object obj) {
        this.b = obj;
        this.c = i;
        this.d = i2;
    }

    @Override // com.amazon.aps.iva.b8.p1.c
    public final void b(v1 v1Var, q.d dVar, List list) {
        p1 p1Var = (p1) this.b;
        v1Var.C(p1Var.w0(this.c, dVar, v1Var), p1Var.w0(this.d, dVar, v1Var), list);
    }

    @Override // com.amazon.aps.iva.b8.p1.b
    public final void c(q.d dVar, v1 v1Var) {
        p1 p1Var = (p1) this.b;
        v1Var.G(p1Var.w0(this.c, dVar, v1Var), p1Var.w0(this.d, dVar, v1Var));
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        ((com.amazon.aps.iva.b6.b) obj).x((b.a) this.b, this.c, this.d);
    }
}
