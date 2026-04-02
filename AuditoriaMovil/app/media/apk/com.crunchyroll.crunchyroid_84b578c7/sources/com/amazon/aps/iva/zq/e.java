package com.amazon.aps.iva.zq;

import android.view.MotionEvent;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: WindowCallbackWrapper.kt */
/* loaded from: classes2.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.l<MotionEvent, MotionEvent> {
    public static final e h = new e();

    public e() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final MotionEvent invoke(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        j.f(motionEvent2, "it");
        MotionEvent obtain = MotionEvent.obtain(motionEvent2);
        j.e(obtain, "obtain(it)");
        return obtain;
    }
}
