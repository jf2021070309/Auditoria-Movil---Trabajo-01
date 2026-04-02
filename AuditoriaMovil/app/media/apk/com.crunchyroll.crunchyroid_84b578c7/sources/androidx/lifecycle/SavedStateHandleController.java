package androidx.lifecycle;

import androidx.lifecycle.g;
import kotlin.Metadata;
/* compiled from: SavedStateHandleController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/j;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SavedStateHandleController implements j {
    public final String b;
    public final p c;
    public boolean d;

    public SavedStateHandleController(p pVar, String str) {
        this.b = str;
        this.c = pVar;
    }

    @Override // androidx.lifecycle.j
    public final void U2(com.amazon.aps.iva.i5.o oVar, g.a aVar) {
        if (aVar == g.a.ON_DESTROY) {
            this.d = false;
            oVar.getLifecycle().removeObserver(this);
        }
    }

    public final void a(g gVar, androidx.savedstate.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "registry");
        com.amazon.aps.iva.yb0.j.f(gVar, "lifecycle");
        if (!this.d) {
            this.d = true;
            gVar.addObserver(this);
            aVar.c(this.b, this.c.e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }
}
