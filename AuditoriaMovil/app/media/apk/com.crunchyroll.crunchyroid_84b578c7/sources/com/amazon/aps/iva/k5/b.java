package com.amazon.aps.iva.k5;

import androidx.lifecycle.u;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: InitializerViewModelFactory.kt */
/* loaded from: classes.dex */
public final class b implements u.b {
    public final d<?>[] a;

    public b(d<?>... dVarArr) {
        j.f(dVarArr, "initializers");
        this.a = dVarArr;
    }

    @Override // androidx.lifecycle.u.b
    public final f0 a(Class cls, c cVar) {
        d<?>[] dVarArr;
        j.f(cls, "modelClass");
        f0 f0Var = null;
        for (d<?> dVar : this.a) {
            if (j.a(dVar.a, cls)) {
                Object invoke = dVar.b.invoke(cVar);
                if (invoke instanceof f0) {
                    f0Var = (f0) invoke;
                } else {
                    f0Var = null;
                }
            }
        }
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
