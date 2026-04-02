package com.amazon.aps.iva.rd;

import androidx.lifecycle.g;
import com.amazon.aps.iva.i5.n;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.yb0.j;
/* compiled from: WidgetsUpdateAgent.kt */
/* loaded from: classes.dex */
public final class c implements o {

    /* compiled from: WidgetsUpdateAgent.kt */
    /* loaded from: classes.dex */
    public static final class a extends androidx.lifecycle.g {
        @Override // androidx.lifecycle.g
        public final void addObserver(n nVar) {
            j.f(nVar, "observer");
        }

        @Override // androidx.lifecycle.g
        public final g.b getCurrentState() {
            return g.b.RESUMED;
        }

        @Override // androidx.lifecycle.g
        public final void removeObserver(n nVar) {
            j.f(nVar, "observer");
        }
    }

    @Override // com.amazon.aps.iva.i5.o
    public final androidx.lifecycle.g getLifecycle() {
        return new a();
    }
}
