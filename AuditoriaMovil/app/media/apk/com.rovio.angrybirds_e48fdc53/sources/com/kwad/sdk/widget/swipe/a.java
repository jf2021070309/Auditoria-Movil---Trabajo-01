package com.kwad.sdk.widget.swipe;

import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes3.dex */
public abstract class a {
    private boolean aMD;

    protected abstract boolean KI();

    protected abstract boolean KJ();

    public final boolean b(View view, MotionEvent motionEvent) {
        return !this.aMD && KI();
    }

    public final boolean c(View view, MotionEvent motionEvent) {
        return !this.aMD && KJ();
    }
}
