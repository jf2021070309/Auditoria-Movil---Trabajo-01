package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.savedstate.a;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.s8.c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
/* compiled from: Recreator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/j;", "a", "savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Recreator implements j {
    public final c b;

    /* compiled from: Recreator.kt */
    /* loaded from: classes.dex */
    public static final class a implements a.b {
        public final LinkedHashSet a;

        public a(androidx.savedstate.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "registry");
            this.a = new LinkedHashSet();
            aVar.c("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.a.b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "owner");
        this.b = cVar;
    }

    @Override // androidx.lifecycle.j
    public final void U2(o oVar, g.a aVar) {
        if (aVar == g.a.ON_CREATE) {
            oVar.getLifecycle().removeObserver(this);
            c cVar = this.b;
            Bundle a2 = cVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a2 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0059a.class);
                        com.amazon.aps.iva.yb0.j.e(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                com.amazon.aps.iva.yb0.j.e(newInstance, "{\n                constr…wInstance()\n            }");
                                ((a.InterfaceC0059a) newInstance).a(cVar);
                            } catch (Exception e) {
                                throw new RuntimeException(com.amazon.aps.iva.oa.a.a("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(e.e("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
