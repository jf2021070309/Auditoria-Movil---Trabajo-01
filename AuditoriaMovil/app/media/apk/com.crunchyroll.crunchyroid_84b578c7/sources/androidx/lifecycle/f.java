package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.p;
import androidx.savedstate.a;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.i5.g0;
import com.amazon.aps.iva.i5.h0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: LegacySavedStateHandleController.kt */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: LegacySavedStateHandleController.kt */
    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0059a {
        @Override // androidx.savedstate.a.InterfaceC0059a
        public final void a(com.amazon.aps.iva.s8.c cVar) {
            LinkedHashMap linkedHashMap;
            com.amazon.aps.iva.yb0.j.f(cVar, "owner");
            if (cVar instanceof h0) {
                g0 viewModelStore = ((h0) cVar).getViewModelStore();
                androidx.savedstate.a savedStateRegistry = cVar.getSavedStateRegistry();
                viewModelStore.getClass();
                Iterator it = new HashSet(viewModelStore.a.keySet()).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    linkedHashMap = viewModelStore.a;
                    if (!hasNext) {
                        break;
                    }
                    String str = (String) it.next();
                    com.amazon.aps.iva.yb0.j.f(str, "key");
                    f0 f0Var = (f0) linkedHashMap.get(str);
                    com.amazon.aps.iva.yb0.j.c(f0Var);
                    f.a(f0Var, savedStateRegistry, cVar.getLifecycle());
                }
                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                    savedStateRegistry.d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    public static final void a(f0 f0Var, androidx.savedstate.a aVar, g gVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "registry");
        com.amazon.aps.iva.yb0.j.f(gVar, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) f0Var.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.d) {
            savedStateHandleController.a(gVar, aVar);
            c(gVar, aVar);
        }
    }

    public static final SavedStateHandleController b(androidx.savedstate.a aVar, g gVar, String str, Bundle bundle) {
        Bundle a2 = aVar.a(str);
        Class<? extends Object>[] clsArr = p.f;
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(p.a.a(a2, bundle), str);
        savedStateHandleController.a(gVar, aVar);
        c(gVar, aVar);
        return savedStateHandleController;
    }

    public static void c(final g gVar, final androidx.savedstate.a aVar) {
        g.b currentState = gVar.getCurrentState();
        if (currentState != g.b.INITIALIZED && !currentState.isAtLeast(g.b.STARTED)) {
            gVar.addObserver(new j() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.j
                public final void U2(com.amazon.aps.iva.i5.o oVar, g.a aVar2) {
                    if (aVar2 == g.a.ON_START) {
                        g.this.removeObserver(this);
                        aVar.d();
                    }
                }
            });
        } else {
            aVar.d();
        }
    }
}
