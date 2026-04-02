package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.dC  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1302dC extends C4H<TS> {
    public static final int A05 = (int) (C0739Lm.A00 * 4.0f);
    @Nullable
    public AnonymousClass17 A00;
    public final List<U1> A01;
    public final int A02;
    public final C1046Xo A03;
    @DoNotStrip
    public final AbstractC0868Qo A04 = new C1304dE(this);

    public AbstractC1302dC(C1A c1a, List<U1> list, C1046Xo c1046Xo) {
        this.A03 = c1046Xo;
        this.A02 = c1a.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i3 = this.A02;
        if (i2 == 0) {
            i3 *= 2;
        }
        marginLayoutParams.setMargins(i3, 0, i2 >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i2) {
        U1 u1 = this.A01.get(i2);
        K4 adCoverImage = u1.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC0925St A04 = new AsyncTaskC0925St(imageView, this.A03).A04();
            A04.A06(new C1303dD(this, i2, u1));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(AnonymousClass17 anonymousClass17) {
        this.A00 = anonymousClass17;
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A0H */
    public void A0E(TS ts, int i2) {
        ts.A0l().setLayoutParams(A02(i2));
    }
}
