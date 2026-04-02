package e.d.b.d.q;

import android.view.ViewTreeObserver;
/* loaded from: classes2.dex */
public class f implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ d a;

    public f(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        d dVar = this.a;
        float rotation = dVar.y.getRotation();
        if (dVar.r != rotation) {
            dVar.r = rotation;
            dVar.t();
            return true;
        }
        return true;
    }
}
