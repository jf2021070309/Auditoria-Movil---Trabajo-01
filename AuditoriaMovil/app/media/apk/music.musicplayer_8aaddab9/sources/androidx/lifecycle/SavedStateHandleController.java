package androidx.lifecycle;

import c.p.d0;
import c.p.g0;
import c.p.j;
import c.p.m0;
import c.p.n;
import c.p.n0;
import c.p.p;
import c.p.r;
import c.w.a;
import c.w.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class SavedStateHandleController implements n {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f463b = false;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f464c;

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0057a {
        @Override // c.w.a.InterfaceC0057a
        public void a(c cVar) {
            if (!(cVar instanceof n0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            m0 viewModelStore = ((n0) cVar).getViewModelStore();
            c.w.a savedStateRegistry = cVar.getSavedStateRegistry();
            Objects.requireNonNull(viewModelStore);
            Iterator it = new HashSet(viewModelStore.a.keySet()).iterator();
            while (it.hasNext()) {
                SavedStateHandleController.g(viewModelStore.a.get((String) it.next()), savedStateRegistry, cVar.getLifecycle());
            }
            if (new HashSet(viewModelStore.a.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.c(a.class);
        }
    }

    public SavedStateHandleController(String str, d0 d0Var) {
        this.a = str;
        this.f464c = d0Var;
    }

    public static void g(g0 g0Var, c.w.a aVar, j jVar) {
        Object obj;
        Map<String, Object> map = g0Var.a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = g0Var.a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.f463b) {
            return;
        }
        savedStateHandleController.i(aVar, jVar);
        j(aVar, jVar);
    }

    public static void j(final c.w.a aVar, final j jVar) {
        j.b bVar = ((r) jVar).f2467c;
        if (bVar == j.b.INITIALIZED || bVar.isAtLeast(j.b.STARTED)) {
            aVar.c(a.class);
        } else {
            jVar.a(new n() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // c.p.n
                public void c(p pVar, j.a aVar2) {
                    if (aVar2 == j.a.ON_START) {
                        r rVar = (r) j.this;
                        rVar.d("removeObserver");
                        rVar.f2466b.e(this);
                        aVar.c(a.class);
                    }
                }
            });
        }
    }

    @Override // c.p.n
    public void c(p pVar, j.a aVar) {
        if (aVar == j.a.ON_DESTROY) {
            this.f463b = false;
            r rVar = (r) pVar.getLifecycle();
            rVar.d("removeObserver");
            rVar.f2466b.e(this);
        }
    }

    public void i(c.w.a aVar, j jVar) {
        if (this.f463b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f463b = true;
        jVar.a(this);
        aVar.b(this.a, this.f464c.f2445e);
    }
}
