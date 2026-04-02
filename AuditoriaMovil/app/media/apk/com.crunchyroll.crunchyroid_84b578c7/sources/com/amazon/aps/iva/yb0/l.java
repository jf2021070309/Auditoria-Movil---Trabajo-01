package com.amazon.aps.iva.yb0;

import java.io.Serializable;
/* compiled from: Lambda.kt */
/* loaded from: classes4.dex */
public abstract class l<R> implements g<R>, Serializable {
    private final int arity;

    public l(int i) {
        this.arity = i;
    }

    @Override // com.amazon.aps.iva.yb0.g
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String j = e0.a.j(this);
        j.e(j, "renderLambdaToString(this)");
        return j;
    }
}
