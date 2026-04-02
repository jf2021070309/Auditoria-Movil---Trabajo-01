package com.amazon.aps.iva.d70;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.xb0.p;
/* compiled from: CharacterLimitPresenter.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.b<c> {
    public final int b;
    public final int c;
    public p<? super Boolean, ? super d, q> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i, int i2) {
        super(cVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(cVar, "view");
        this.b = i;
        this.c = i2;
    }

    public final void q6(d dVar) {
        boolean z;
        int i = dVar.b;
        if (i == 0) {
            p<? super Boolean, ? super d, q> pVar = this.d;
            if (pVar != null) {
                pVar.invoke(Boolean.FALSE, dVar);
                getView().I6();
                return;
            }
            com.amazon.aps.iva.yb0.j.m("onTextChanged");
            throw null;
        }
        int i2 = this.c;
        boolean z2 = true;
        if (1 <= i && i < i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            p<? super Boolean, ? super d, q> pVar2 = this.d;
            if (pVar2 != null) {
                pVar2.invoke(Boolean.TRUE, dVar);
                getView().I6();
                return;
            }
            com.amazon.aps.iva.yb0.j.m("onTextChanged");
            throw null;
        }
        int i3 = this.b;
        if (i > i3 || i2 > i) {
            z2 = false;
        }
        if (z2) {
            p<? super Boolean, ? super d, q> pVar3 = this.d;
            if (pVar3 != null) {
                pVar3.invoke(Boolean.TRUE, dVar);
                getView().b5(i3 - i);
                return;
            }
            com.amazon.aps.iva.yb0.j.m("onTextChanged");
            throw null;
        }
        p<? super Boolean, ? super d, q> pVar4 = this.d;
        if (pVar4 != null) {
            pVar4.invoke(Boolean.FALSE, dVar);
            getView().Pf(i3 - i);
            return;
        }
        com.amazon.aps.iva.yb0.j.m("onTextChanged");
        throw null;
    }
}
