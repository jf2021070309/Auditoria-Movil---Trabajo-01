package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import com.amazon.aps.iva.i5.o;
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements j {
    public static int b;

    public ImmLeaksCleaner() {
        throw null;
    }

    @Override // androidx.lifecycle.j
    public final void U2(o oVar, g.a aVar) {
        if (aVar != g.a.ON_DESTROY) {
            return;
        }
        if (b == 0) {
            try {
                b = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (b != 1) {
            return;
        }
        throw null;
    }
}
