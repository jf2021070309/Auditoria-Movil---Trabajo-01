package com.amazon.aps.iva.py;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.py.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.f;
import com.amazon.aps.iva.yb0.j;
/* compiled from: InAppUpdatesPresenter.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements w, f {
    public final /* synthetic */ l a;

    public b(a.C0627a c0627a) {
        this.a = c0627a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w) || !(obj instanceof f)) {
            return false;
        }
        return j.a(this.a, ((f) obj).getFunctionDelegate());
    }

    @Override // com.amazon.aps.iva.yb0.f
    public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.amazon.aps.iva.i5.w
    public final /* synthetic */ void onChanged(Object obj) {
        this.a.invoke(obj);
    }
}
