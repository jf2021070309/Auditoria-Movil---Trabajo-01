package com.amazon.aps.iva.ez;

import com.amazon.aps.iva.i5.f0;
/* compiled from: BaseViewModel.kt */
/* loaded from: classes2.dex */
public abstract class b extends f0 {
    public static final int $stable = 8;
    private final com.amazon.aps.iva.wy.j[] interactors;

    public b(com.amazon.aps.iva.wy.j... jVarArr) {
        com.amazon.aps.iva.yb0.j.f(jVarArr, "interactors");
        this.interactors = jVarArr;
    }

    @Override // com.amazon.aps.iva.i5.f0
    public void onCleared() {
        for (com.amazon.aps.iva.wy.j jVar : this.interactors) {
            jVar.cancelRunningApiCalls();
        }
    }
}
