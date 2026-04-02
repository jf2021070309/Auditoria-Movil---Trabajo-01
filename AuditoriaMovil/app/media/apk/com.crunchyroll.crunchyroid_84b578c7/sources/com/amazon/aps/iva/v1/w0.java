package com.amazon.aps.iva.v1;

import android.view.ViewConfiguration;
/* compiled from: AndroidViewConfiguration.android.kt */
/* loaded from: classes.dex */
public final class w0 implements v2 {
    public final ViewConfiguration a;

    public w0(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // com.amazon.aps.iva.v1.v2
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // com.amazon.aps.iva.v1.v2
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // com.amazon.aps.iva.v1.v2
    public final float e() {
        return this.a.getScaledTouchSlop();
    }

    @Override // com.amazon.aps.iva.v1.v2
    public final void b() {
    }
}
