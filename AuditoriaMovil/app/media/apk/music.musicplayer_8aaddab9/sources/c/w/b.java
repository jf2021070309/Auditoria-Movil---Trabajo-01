package c.w;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import c.p.j;
import c.p.n;
import c.p.p;
import c.p.r;
import c.w.a;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class b {
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2831b = new a();

    public b(c cVar) {
        this.a = cVar;
    }

    public void a(Bundle bundle) {
        j lifecycle = this.a.getLifecycle();
        if (((r) lifecycle).f2467c != j.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(this.a));
        final a aVar = this.f2831b;
        if (aVar.f2828c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            aVar.f2827b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        lifecycle.a(new n() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // c.p.n
            public void c(p pVar, j.a aVar2) {
                if (aVar2 == j.a.ON_START) {
                    a.this.f2830e = true;
                } else if (aVar2 == j.a.ON_STOP) {
                    a.this.f2830e = false;
                }
            }
        });
        aVar.f2828c = true;
    }

    public void b(Bundle bundle) {
        a aVar = this.f2831b;
        Objects.requireNonNull(aVar);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f2827b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        c.c.a.b.b<String, a.b>.d b2 = aVar.a.b();
        while (b2.hasNext()) {
            Map.Entry entry = (Map.Entry) b2.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
