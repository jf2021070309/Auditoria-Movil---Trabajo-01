package e.d.b.d.a0;

import android.view.ViewTreeObserver;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;
/* loaded from: classes2.dex */
public class a implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    public a(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        if (this.a.isShown()) {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView clockFaceView = this.a;
            int height = ((this.a.getHeight() / 2) - clockFaceView.x.f4699h) - clockFaceView.E;
            if (height != clockFaceView.v) {
                clockFaceView.v = height;
                clockFaceView.s();
                ClockHandView clockHandView = clockFaceView.x;
                clockHandView.p = clockFaceView.v;
                clockHandView.invalidate();
            }
            return true;
        }
        return true;
    }
}
