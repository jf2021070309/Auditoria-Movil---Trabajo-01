package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.u;
import com.amazon.aps.iva.i5.a0;
import com.amazon.aps.iva.i5.f0;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class r extends u.d implements u.b {
    public final Application a;
    public final u.a b;
    public final Bundle c;
    public final g d;
    public final androidx.savedstate.a e;

    public r() {
        this.b = new u.a(null);
    }

    @Override // androidx.lifecycle.u.b
    public final f0 a(Class cls, com.amazon.aps.iva.k5.c cVar) {
        Constructor a;
        com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
        v vVar = v.a;
        LinkedHashMap linkedHashMap = cVar.a;
        String str = (String) linkedHashMap.get(vVar);
        if (str != null) {
            if (linkedHashMap.get(q.a) != null && linkedHashMap.get(q.b) != null) {
                Application application = (Application) linkedHashMap.get(t.a);
                boolean isAssignableFrom = com.amazon.aps.iva.i5.a.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a = a0.a(a0.a, cls);
                } else {
                    a = a0.a(a0.b, cls);
                }
                if (a == null) {
                    return this.b.a(cls, cVar);
                }
                if (isAssignableFrom && application != null) {
                    return a0.b(cls, a, application, q.a(cVar));
                }
                return a0.b(cls, a, q.a(cVar));
            } else if (this.d != null) {
                return d(cls, str);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.u.b
    public final <T extends f0> T b(Class<T> cls) {
        com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.u.d
    public final void c(f0 f0Var) {
        g gVar = this.d;
        if (gVar != null) {
            androidx.savedstate.a aVar = this.e;
            com.amazon.aps.iva.yb0.j.c(aVar);
            f.a(f0Var, aVar, gVar);
        }
    }

    public final f0 d(Class cls, String str) {
        Constructor a;
        f0 b;
        com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
        g gVar = this.d;
        if (gVar != null) {
            boolean isAssignableFrom = com.amazon.aps.iva.i5.a.class.isAssignableFrom(cls);
            Application application = this.a;
            if (isAssignableFrom && application != null) {
                a = a0.a(a0.a, cls);
            } else {
                a = a0.a(a0.b, cls);
            }
            if (a == null) {
                if (application != null) {
                    return this.b.b(cls);
                }
                if (u.c.a == null) {
                    u.c.a = new u.c();
                }
                u.c cVar = u.c.a;
                com.amazon.aps.iva.yb0.j.c(cVar);
                return cVar.b(cls);
            }
            androidx.savedstate.a aVar = this.e;
            com.amazon.aps.iva.yb0.j.c(aVar);
            SavedStateHandleController b2 = f.b(aVar, gVar, str, this.c);
            p pVar = b2.c;
            if (isAssignableFrom && application != null) {
                b = a0.b(cls, a, application, pVar);
            } else {
                b = a0.b(cls, a, pVar);
            }
            b.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b2);
            return b;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @SuppressLint({"LambdaLast"})
    public r(Application application, com.amazon.aps.iva.s8.c cVar, Bundle bundle) {
        u.a aVar;
        com.amazon.aps.iva.yb0.j.f(cVar, "owner");
        this.e = cVar.getSavedStateRegistry();
        this.d = cVar.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (u.a.c == null) {
                u.a.c = new u.a(application);
            }
            aVar = u.a.c;
            com.amazon.aps.iva.yb0.j.c(aVar);
        } else {
            aVar = new u.a(null);
        }
        this.b = aVar;
    }
}
