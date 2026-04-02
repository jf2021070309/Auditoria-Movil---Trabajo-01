package com.amazon.aps.iva.a0;

import android.content.Context;
import android.widget.EdgeEffect;
/* compiled from: EdgeEffectCompat.kt */
/* loaded from: classes.dex */
public final class n0 extends EdgeEffect {
    public final float a;
    public float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Context context) {
        super(context);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = com.amazon.aps.iva.gr.n.i(context).b * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.b = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.b = 0.0f;
        super.onPull(f);
    }
}
