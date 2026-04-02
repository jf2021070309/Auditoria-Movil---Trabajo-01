package com.amazon.aps.iva.qb0;

import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ContinuationImpl.kt */
/* loaded from: classes4.dex */
public abstract class i extends c implements com.amazon.aps.iva.yb0.g<Object> {
    private final int arity;

    public i(int i, com.amazon.aps.iva.ob0.d<Object> dVar) {
        super(dVar);
        this.arity = i;
    }

    @Override // com.amazon.aps.iva.yb0.g
    public int getArity() {
        return this.arity;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public String toString() {
        if (getCompletion() == null) {
            String i = e0.a.i(this);
            j.e(i, "renderLambdaToString(this)");
            return i;
        }
        return super.toString();
    }

    public i(int i) {
        this(i, null);
    }
}
