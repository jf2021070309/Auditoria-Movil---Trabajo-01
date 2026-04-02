package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.g;
import androidx.lifecycle.u;
import com.amazon.aps.iva.i5.g0;
import com.amazon.aps.iva.i5.h0;
import com.amazon.aps.iva.q.e1;
import java.util.LinkedHashMap;
/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
public final class s implements androidx.lifecycle.e, com.amazon.aps.iva.s8.c, h0 {
    public final Fragment b;
    public final g0 c;
    public final Runnable d;
    public u.b e;
    public androidx.lifecycle.k f = null;
    public com.amazon.aps.iva.s8.b g = null;

    public s(Fragment fragment, g0 g0Var, e1 e1Var) {
        this.b = fragment;
        this.c = g0Var;
        this.d = e1Var;
    }

    public final void g(g.a aVar) {
        this.f.c(aVar);
    }

    @Override // androidx.lifecycle.e
    public final com.amazon.aps.iva.k5.a getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.b;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        com.amazon.aps.iva.k5.c cVar = new com.amazon.aps.iva.k5.c(0);
        LinkedHashMap linkedHashMap = cVar.a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.t.a, application);
        }
        linkedHashMap.put(androidx.lifecycle.q.a, fragment);
        linkedHashMap.put(androidx.lifecycle.q.b, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.q.c, fragment.getArguments());
        }
        return cVar;
    }

    @Override // androidx.lifecycle.e
    public final u.b getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.b;
        u.b defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.e = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.e == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.e = new androidx.lifecycle.r(application, fragment, fragment.getArguments());
        }
        return this.e;
    }

    @Override // com.amazon.aps.iva.i5.o
    public final androidx.lifecycle.g getLifecycle() {
        r();
        return this.f;
    }

    @Override // com.amazon.aps.iva.s8.c
    public final androidx.savedstate.a getSavedStateRegistry() {
        r();
        return this.g.b;
    }

    @Override // com.amazon.aps.iva.i5.h0
    public final g0 getViewModelStore() {
        r();
        return this.c;
    }

    public final void r() {
        if (this.f == null) {
            this.f = new androidx.lifecycle.k(this);
            com.amazon.aps.iva.s8.b bVar = new com.amazon.aps.iva.s8.b(this);
            this.g = bVar;
            bVar.a();
            this.d.run();
        }
    }
}
