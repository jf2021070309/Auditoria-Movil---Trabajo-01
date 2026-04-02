package com.amazon.aps.iva.i5;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.Map;
/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class y implements a.b {
    public final androidx.savedstate.a a;
    public boolean b;
    public Bundle c;
    public final com.amazon.aps.iva.kb0.m d;

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<z> {
        public final /* synthetic */ h0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0 h0Var) {
            super(0);
            this.h = h0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final z invoke() {
            return androidx.lifecycle.q.c(this.h);
        }
    }

    public y(androidx.savedstate.a aVar, h0 h0Var) {
        com.amazon.aps.iva.yb0.j.f(aVar, "savedStateRegistry");
        com.amazon.aps.iva.yb0.j.f(h0Var, "viewModelStoreOwner");
        this.a = aVar;
        this.d = com.amazon.aps.iva.kb0.f.b(new a(h0Var));
    }

    @Override // androidx.savedstate.a.b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((z) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((androidx.lifecycle.p) entry.getValue()).e.a();
            if (!com.amazon.aps.iva.yb0.j.a(a2, Bundle.EMPTY)) {
                bundle.putBundle(str, a2);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (!this.b) {
            Bundle a2 = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (a2 != null) {
                bundle.putAll(a2);
            }
            this.c = bundle;
            this.b = true;
            z zVar = (z) this.d.getValue();
        }
    }
}
