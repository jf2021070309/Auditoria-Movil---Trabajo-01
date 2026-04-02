package com.amazon.aps.iva.w0;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.o0.q1;
/* compiled from: LiveDataAdapter.kt */
/* loaded from: classes.dex */
public final class b implements w<Object> {
    public final /* synthetic */ q1<Object> a;

    public b(q1<Object> q1Var) {
        this.a = q1Var;
    }

    @Override // com.amazon.aps.iva.i5.w
    public final void onChanged(Object obj) {
        this.a.setValue(obj);
    }
}
