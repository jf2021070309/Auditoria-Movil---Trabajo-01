package androidx.lifecycle;

import androidx.lifecycle.g;
import com.amazon.aps.iva.i5.y;
import kotlin.Metadata;
/* compiled from: SavedStateHandleSupport.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/j;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements j {
    public final y b;

    public SavedStateHandleAttacher(y yVar) {
        this.b = yVar;
    }

    @Override // androidx.lifecycle.j
    public final void U2(com.amazon.aps.iva.i5.o oVar, g.a aVar) {
        boolean z;
        if (aVar == g.a.ON_CREATE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            oVar.getLifecycle().removeObserver(this);
            this.b.b();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
