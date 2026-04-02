package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import c.p.j;
import c.p.n;
import c.p.p;
import c.p.r;
import c.w.a;
import c.w.c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements n {
    public final c a;

    /* loaded from: classes.dex */
    public static final class a implements a.b {
        public final Set<String> a = new HashSet();

        public a(c.w.a aVar) {
            aVar.b("androidx.savedstate.Restarter", this);
        }

        @Override // c.w.a.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        this.a = cVar;
    }

    @Override // c.p.n
    public void c(p pVar, j.a aVar) {
        Class cls;
        if (aVar != j.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        r rVar = (r) pVar.getLifecycle();
        rVar.d("removeObserver");
        rVar.f2466b.e(this);
        Bundle a2 = this.a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a2 == null) {
            return;
        }
        ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                try {
                    Constructor declaredConstructor = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0057a.class).getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        ((a.InterfaceC0057a) declaredConstructor.newInstance(new Object[0])).a(this.a);
                    } catch (Exception e2) {
                        throw new RuntimeException(e.a.d.a.a.k("Failed to instantiate ", next), e2);
                    }
                } catch (NoSuchMethodException e3) {
                    StringBuilder y = e.a.d.a.a.y("Class");
                    y.append(cls.getSimpleName());
                    y.append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalStateException(y.toString(), e3);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(e.a.d.a.a.l("Class ", next, " wasn't found"), e4);
            }
        }
    }
}
