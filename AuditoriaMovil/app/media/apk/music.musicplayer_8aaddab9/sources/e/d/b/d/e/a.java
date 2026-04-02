package e.d.b.d.e;

import android.view.View;
import c.i.k.d0;
import c.i.k.k0.d;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class a implements d {
    public final /* synthetic */ SwipeDismissBehavior a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // c.i.k.k0.d
    public boolean a(View view, d.a aVar) {
        boolean z = false;
        if (this.a.B(view)) {
            AtomicInteger atomicInteger = d0.a;
            boolean z2 = d0.d.d(view) == 1;
            int i2 = this.a.f4539c;
            if ((i2 == 0 && z2) || (i2 == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            d0.r(view, width);
            view.setAlpha(0.0f);
            Objects.requireNonNull(this.a);
            return true;
        }
        return false;
    }
}
