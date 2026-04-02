package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
/* loaded from: assets/audience_network.dex */
public class T5 implements InterfaceC0798Nv {
    public final /* synthetic */ C0789Nm A00;

    public T5(C0789Nm c0789Nm) {
        this.A00 = c0789Nm;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0798Nv
    public final void AA8(boolean z) {
        boolean z2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z2 = this.A00.A07;
        if (z2) {
            imageView = this.A00.A00;
            if (imageView != null) {
                imageView2 = this.A00.A00;
                imageView2.setEnabled(z);
                imageView3 = this.A00.A00;
                imageView3.setAlpha(z ? 1.0f : 0.3f);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0798Nv
    public final void AAn(boolean z) {
        boolean z2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z2 = this.A00.A07;
        if (z2) {
            imageView = this.A00.A02;
            if (imageView != null) {
                imageView2 = this.A00.A02;
                imageView2.setEnabled(z);
                imageView3 = this.A00.A02;
                imageView3.setAlpha(z ? 1.0f : 0.3f);
            }
        }
    }
}
