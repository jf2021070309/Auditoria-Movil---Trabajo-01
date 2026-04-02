package com.facebook.ads.redexgen.X;

import android.text.Layout;
import ch.qos.logback.classic.Level;
/* loaded from: assets/audience_network.dex */
public final class V7 extends GX {
    public final long A00;
    public final long A01;

    public V7(long j2, long j3, CharSequence charSequence) {
        this(j2, j3, charSequence, null, Float.MIN_VALUE, Level.ALL_INT, Level.ALL_INT, Float.MIN_VALUE, Level.ALL_INT, Float.MIN_VALUE);
    }

    public V7(long j2, long j3, CharSequence charSequence, Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4) {
        super(charSequence, alignment, f2, i2, i3, f3, i4, f4);
        this.A01 = j2;
        this.A00 = j3;
    }

    public V7(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    public final boolean A00() {
        return super.A01 == Float.MIN_VALUE && this.A02 == Float.MIN_VALUE;
    }
}
