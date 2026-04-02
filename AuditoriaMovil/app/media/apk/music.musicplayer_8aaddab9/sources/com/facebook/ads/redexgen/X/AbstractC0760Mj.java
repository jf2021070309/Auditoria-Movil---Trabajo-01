package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.widget.LinearLayout;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
/* renamed from: com.facebook.ads.redexgen.X.Mj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0760Mj extends LinearLayout {
    public static int A00 = (int) (C0739Lm.A00 * 56.0f);

    public abstract void A04(C1K c1k, boolean z);

    public abstract boolean A05();

    public abstract int getToolbarHeight();

    public abstract void setAdReportingVisible(boolean z);

    public abstract void setPageDetails(C1U c1u, String str, int i2, C02491b c02491b);

    public abstract void setPageDetailsVisible(boolean z);

    public abstract void setProgress(float f2);

    public abstract void setProgressSpinnerInvisible(boolean z);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i2);

    public abstract void setToolbarListener(InterfaceC0759Mi interfaceC0759Mi);

    public AbstractC0760Mj(Context context) {
        super(context);
    }
}
