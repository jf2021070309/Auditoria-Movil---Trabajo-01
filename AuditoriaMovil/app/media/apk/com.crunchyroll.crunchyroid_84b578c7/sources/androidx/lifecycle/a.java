package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.u;
import com.amazon.aps.iva.i5.f0;
/* compiled from: AbstractSavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public abstract class a extends u.d implements u.b {
    public final androidx.savedstate.a a;
    public final g b;
    public final Bundle c;

    public a(com.amazon.aps.iva.s8.c cVar, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(cVar, "owner");
        this.a = cVar.getSavedStateRegistry();
        this.b = cVar.getLifecycle();
        this.c = bundle;
    }

    @Override // androidx.lifecycle.u.b
    public final f0 a(Class cls, com.amazon.aps.iva.k5.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
        String str = (String) cVar.a.get(v.a);
        if (str != null) {
            androidx.savedstate.a aVar = this.a;
            if (aVar != null) {
                com.amazon.aps.iva.yb0.j.c(aVar);
                g gVar = this.b;
                com.amazon.aps.iva.yb0.j.c(gVar);
                SavedStateHandleController b = f.b(aVar, gVar, str, this.c);
                f0 d = d(str, cls, b.c);
                d.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b);
                return d;
            }
            return d(str, cls, q.a(cVar));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.u.b
    public final <T extends f0> T b(Class<T> cls) {
        com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            g gVar = this.b;
            if (gVar != null) {
                androidx.savedstate.a aVar = this.a;
                com.amazon.aps.iva.yb0.j.c(aVar);
                com.amazon.aps.iva.yb0.j.c(gVar);
                SavedStateHandleController b = f.b(aVar, gVar, canonicalName, this.c);
                T t = (T) d(canonicalName, cls, b.c);
                t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b);
                return t;
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.u.d
    public final void c(f0 f0Var) {
        androidx.savedstate.a aVar = this.a;
        if (aVar != null) {
            g gVar = this.b;
            com.amazon.aps.iva.yb0.j.c(gVar);
            f.a(f0Var, aVar, gVar);
        }
    }

    public abstract <T extends f0> T d(String str, Class<T> cls, p pVar);
}
