package com.amazon.aps.iva.i70;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: DataInputButtonPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<f> implements d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(fVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(fVar, "view");
    }

    @Override // com.amazon.aps.iva.i70.d
    public final void R0() {
        boolean z;
        List<k> inputStates = getView().getInputStates();
        boolean z2 = true;
        if (!(inputStates instanceof Collection) || !inputStates.isEmpty()) {
            Iterator<T> it = inputStates.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((k) it.next()) == k.VALID) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2) {
            getView().Nf();
        } else {
            getView().Vb();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onDestroy() {
        getView().Ef();
    }
}
