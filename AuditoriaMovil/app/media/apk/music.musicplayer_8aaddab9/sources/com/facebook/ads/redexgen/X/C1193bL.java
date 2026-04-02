package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.bL  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1193bL implements C5S {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C5U A01;
    public final /* synthetic */ U1 A02;

    public C1193bL(C5U c5u, ImageView imageView, U1 u1) {
        this.A01 = c5u;
        this.A00 = imageView;
        this.A02 = u1;
    }

    @Override // com.facebook.ads.redexgen.X.C5S
    public final void AAv(@Nullable Drawable drawable) {
        U1.A0e(drawable, this.A00);
        this.A02.A1L(drawable);
    }
}
