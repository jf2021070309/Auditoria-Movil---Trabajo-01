package com.amazon.aps.iva.a80;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.amazon.aps.iva.kb0.q;
/* compiled from: TabTouchListener.kt */
/* loaded from: classes2.dex */
public final class b implements View.OnTouchListener {
    public final com.amazon.aps.iva.xb0.a<q> b;

    public b(e eVar) {
        this.b = eVar;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        com.amazon.aps.iva.yb0.j.f(view, "v");
        com.amazon.aps.iva.yb0.j.f(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 3) {
                    return false;
                }
                view.setPressed(false);
                return true;
            }
            this.b.invoke();
            view.setPressed(false);
            return true;
        }
        view.setPressed(true);
        return true;
    }
}
