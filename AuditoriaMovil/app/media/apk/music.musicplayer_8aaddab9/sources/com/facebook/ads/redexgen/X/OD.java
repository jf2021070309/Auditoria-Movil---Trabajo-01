package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
/* loaded from: assets/audience_network.dex */
public abstract class OD extends LinearLayout {
    public static final LinearLayout.LayoutParams A05 = new LinearLayout.LayoutParams(-2, -2);
    public final int A00;
    public final RelativeLayout A01;
    public final C1046Xo A02;
    public final View$OnClickListenerC0923Sr A03;
    public final OQ A04;

    public abstract void A0A(int i2);

    public OD(C1046Xo c1046Xo, int i2, C1K c1k, boolean z, String str, InterfaceC0684Jg interfaceC0684Jg, InterfaceC0761Mk interfaceC0761Mk, C0869Qp c0869Qp, MD md) {
        super(c1046Xo);
        ML.A0K(this);
        this.A02 = c1046Xo;
        this.A00 = i2;
        this.A04 = new OQ(c1046Xo);
        ML.A0M(this.A04, 0);
        ML.A0K(this.A04);
        this.A03 = new View$OnClickListenerC0923Sr(c1046Xo, str, c1k, z, interfaceC0684Jg, interfaceC0761Mk, c0869Qp, md);
        ML.A0G(1001, this.A03);
        this.A01 = new RelativeLayout(c1046Xo);
        this.A01.setLayoutParams(A05);
        ML.A0K(this.A01);
    }

    public void A08() {
    }

    public void A09() {
    }

    public final View$OnClickListenerC0923Sr getCTAButton() {
        return this.A03;
    }

    public View getExpandableLayout() {
        return null;
    }

    @VisibleForTesting
    public final ImageView getIconView() {
        return this.A04;
    }

    public void setInfo(C1I c1i, C1L c1l, String str, String str2, @Nullable OG og) {
        this.A03.setCta(c1l, str, new HashMap(), og);
        AsyncTaskC0925St asyncTaskC0925St = new AsyncTaskC0925St(this.A04, this.A02);
        int i2 = this.A00;
        asyncTaskC0925St.A05(i2, i2).A07(str2);
    }

    public void setTitleMaxLines(int i2) {
    }
}
