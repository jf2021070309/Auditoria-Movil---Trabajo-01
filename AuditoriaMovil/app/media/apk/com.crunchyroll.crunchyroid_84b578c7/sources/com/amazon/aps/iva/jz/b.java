package com.amazon.aps.iva.jz;

import com.amazon.aps.iva.wy.j;
/* compiled from: DisposableDataSource.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final j[] b;

    public b(j... jVarArr) {
        this.b = jVarArr;
    }

    @Override // com.amazon.aps.iva.jz.a
    public final void destroy() {
        for (j jVar : this.b) {
            jVar.cancelRunningApiCalls();
        }
    }
}
