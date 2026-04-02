package com.amazon.aps.iva.s8;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.savedstate.Recreator;
import androidx.savedstate.a;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.s.b;
import java.util.Map;
/* compiled from: SavedStateRegistryController.kt */
/* loaded from: classes.dex */
public final class b {
    public final c a;
    public final androidx.savedstate.a b = new androidx.savedstate.a();
    public boolean c;

    public b(c cVar) {
        this.a = cVar;
    }

    public final void a() {
        boolean z;
        c cVar = this.a;
        g lifecycle = cVar.getLifecycle();
        if (lifecycle.getCurrentState() == g.b.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lifecycle.addObserver(new Recreator(cVar));
            final androidx.savedstate.a aVar = this.b;
            aVar.getClass();
            if (!aVar.b) {
                lifecycle.addObserver(new j() { // from class: com.amazon.aps.iva.s8.a
                    @Override // androidx.lifecycle.j
                    public final void U2(o oVar, g.a aVar2) {
                        androidx.savedstate.a aVar3 = androidx.savedstate.a.this;
                        com.amazon.aps.iva.yb0.j.f(aVar3, "this$0");
                        if (aVar2 == g.a.ON_START) {
                            aVar3.f = true;
                        } else if (aVar2 == g.a.ON_STOP) {
                            aVar3.f = false;
                        }
                    }
                });
                aVar.b = true;
                this.c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.c) {
            a();
        }
        g lifecycle = this.a.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(g.b.STARTED)) {
            androidx.savedstate.a aVar = this.b;
            if (aVar.b) {
                if (!aVar.d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    aVar.c = bundle2;
                    aVar.d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getCurrentState()).toString());
    }

    public final void c(Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(bundle, "outBundle");
        androidx.savedstate.a aVar = this.b;
        aVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        com.amazon.aps.iva.s.b<String, a.b> bVar = aVar.a;
        bVar.getClass();
        b.d dVar = new b.d();
        bVar.d.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
