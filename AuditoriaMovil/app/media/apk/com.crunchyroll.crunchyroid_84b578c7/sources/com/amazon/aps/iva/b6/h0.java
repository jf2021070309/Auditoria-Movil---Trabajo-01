package com.amazon.aps.iva.b6;

import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.t5.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements o.a, o.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // com.amazon.aps.iva.t5.o.b
    public final void c(Object obj, com.amazon.aps.iva.q5.u uVar) {
        ((b) obj).t((com.amazon.aps.iva.q5.l0) this.d, new b.C0132b(uVar, ((k0) this.c).f));
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((b) obj).r((b.a) obj3, (com.amazon.aps.iva.o6.t) obj2);
                return;
            case 1:
            default:
                com.amazon.aps.iva.q5.y0 y0Var = (com.amazon.aps.iva.q5.y0) obj2;
                ((b) obj).b((b.a) obj3, y0Var);
                int i2 = y0Var.b;
                return;
            case 2:
                ((b) obj).getClass();
                return;
        }
    }
}
