package com.amazon.aps.iva.b8;

import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements p1.b, p1.c {
    public final /* synthetic */ p1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ i1(p1 p1Var, int i) {
        this.b = p1Var;
        this.c = i;
    }

    @Override // com.amazon.aps.iva.b8.p1.c
    public final void b(v1 v1Var, q.d dVar, List list) {
        p1 p1Var = this.b;
        p1Var.getClass();
        int size = list.size();
        int i = this.c;
        if (size == 1) {
            v1Var.T(p1Var.w0(i, dVar, v1Var), (com.amazon.aps.iva.q5.b0) list.get(0));
        } else {
            v1Var.C(p1Var.w0(i, dVar, v1Var), p1Var.w0(i + 1, dVar, v1Var), list);
        }
    }

    @Override // com.amazon.aps.iva.b8.p1.b
    public final void c(q.d dVar, v1 v1Var) {
        v1Var.B0(this.b.w0(this.c, dVar, v1Var));
    }
}
