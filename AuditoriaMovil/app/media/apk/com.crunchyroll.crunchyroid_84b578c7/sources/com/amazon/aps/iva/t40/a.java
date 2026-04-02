package com.amazon.aps.iva.t40;

import com.amazon.aps.iva.h70.f;
import com.amazon.aps.iva.t40.e;
import com.amazon.aps.iva.wy.j;
import java.util.Arrays;
/* compiled from: EmailAndPasswordPresenter.kt */
/* loaded from: classes2.dex */
public abstract class a<V extends e> extends com.amazon.aps.iva.wy.b<V> {
    public final com.amazon.aps.iva.h70.c b;
    public final com.amazon.aps.iva.h70.e c;

    public a(c cVar, com.amazon.aps.iva.h70.d dVar, f fVar, j... jVarArr) {
        super(cVar, (j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        this.b = dVar;
        this.c = fVar;
    }

    public final void q6(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        e eVar = (e) getView();
        eVar.b();
        eVar.G6();
        eVar.U1();
        eVar.showSnackbar(new com.amazon.aps.iva.bt.b(0, this.b.a(th), new String[0], 1));
    }

    public final void r6(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        e eVar = (e) getView();
        eVar.b();
        eVar.T8();
        eVar.U1();
        eVar.showSnackbar(new com.amazon.aps.iva.bt.b(0, this.c.a(th), new String[0], 1));
    }
}
