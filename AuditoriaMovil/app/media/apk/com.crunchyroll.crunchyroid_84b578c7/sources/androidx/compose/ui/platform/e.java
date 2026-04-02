package androidx.compose.ui.platform;

import androidx.lifecycle.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.v1.u2;
/* compiled from: ViewCompositionStrategy.android.kt */
/* loaded from: classes.dex */
public final class e {
    public static final u2 a(final com.amazon.aps.iva.v1.a aVar, androidx.lifecycle.g gVar) {
        boolean z;
        if (gVar.getCurrentState().compareTo(g.b.DESTROYED) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            androidx.lifecycle.j jVar = new androidx.lifecycle.j() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$observer$1
                @Override // androidx.lifecycle.j
                public final void U2(o oVar, g.a aVar2) {
                    if (aVar2 == g.a.ON_DESTROY) {
                        com.amazon.aps.iva.v1.a.this.d();
                    }
                }
            };
            gVar.addObserver(jVar);
            return new u2(gVar, jVar);
        }
        throw new IllegalStateException(("Cannot configure " + aVar + " to disposeComposition at Lifecycle ON_DESTROY: " + gVar + "is already destroyed").toString());
    }
}
