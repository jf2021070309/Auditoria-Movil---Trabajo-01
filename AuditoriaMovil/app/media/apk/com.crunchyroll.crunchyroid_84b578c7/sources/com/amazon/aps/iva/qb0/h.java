package com.amazon.aps.iva.qb0;

import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ContinuationImpl.kt */
/* loaded from: classes4.dex */
public abstract class h extends g implements com.amazon.aps.iva.yb0.g<Object> {
    public final int h;

    public h(com.amazon.aps.iva.ob0.d dVar) {
        super(dVar);
        this.h = 2;
    }

    @Override // com.amazon.aps.iva.yb0.g
    public final int getArity() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final String toString() {
        if (getCompletion() == null) {
            String i = e0.a.i(this);
            j.e(i, "renderLambdaToString(this)");
            return i;
        }
        return super.toString();
    }
}
