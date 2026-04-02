package com.facebook.ads.redexgen.X;

import android.graphics.Paint;
/* loaded from: assets/audience_network.dex */
public class QJ extends Paint {
    public final /* synthetic */ QK A00;
    public final /* synthetic */ boolean A01;

    public QJ(QK qk, boolean z) {
        this.A00 = qk;
        this.A01 = z;
        setStyle(Paint.Style.FILL_AND_STROKE);
        setStrokeCap(Paint.Cap.ROUND);
        setStrokeWidth(3.0f);
        setAntiAlias(true);
        setColor(this.A01 ? -1 : -10066330);
    }
}
