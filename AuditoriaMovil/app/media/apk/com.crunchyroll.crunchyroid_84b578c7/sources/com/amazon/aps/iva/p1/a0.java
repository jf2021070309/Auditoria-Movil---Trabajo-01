package com.amazon.aps.iva.p1;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PointerInputEvent.android.kt */
/* loaded from: classes.dex */
public final class a0 {
    public final List<b0> a;
    public final MotionEvent b;

    public a0(ArrayList arrayList, MotionEvent motionEvent) {
        com.amazon.aps.iva.yb0.j.f(arrayList, "pointers");
        com.amazon.aps.iva.yb0.j.f(motionEvent, "motionEvent");
        this.a = arrayList;
        this.b = motionEvent;
    }
}
