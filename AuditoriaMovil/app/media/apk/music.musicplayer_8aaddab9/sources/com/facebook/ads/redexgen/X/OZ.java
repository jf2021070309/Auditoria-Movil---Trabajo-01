package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.HashMap;
/* loaded from: assets/audience_network.dex */
public abstract class OZ extends RelativeLayout {
    public static final int A08 = (int) (C0739Lm.A00 * 16.0f);
    public static final int A09 = (int) (C0739Lm.A00 * 28.0f);
    public C1K A00;
    public boolean A01;
    public boolean A02;
    public final C1046Xo A03;
    public final InterfaceC0684Jg A04;
    public final View$OnClickListenerC0923Sr A05;
    public final OW A06;
    public final C0806Od A07;

    public abstract boolean A0c();

    public OZ(C0806Od c0806Od, boolean z) {
        super(c0806Od.A05());
        C1K A00;
        this.A01 = false;
        this.A07 = c0806Od;
        this.A03 = c0806Od.A05();
        this.A04 = c0806Od.A06();
        if (c0806Od.A00() == 1) {
            A00 = c0806Od.A04().A0M().A01();
        } else {
            A00 = c0806Od.A04().A0M().A00();
        }
        this.A00 = A00;
        this.A02 = z;
        this.A05 = new View$OnClickListenerC0923Sr(c0806Od.A05(), c0806Od.A04().A0S(), this.A00, c0806Od.A04().A0N().A0F().A06(), c0806Od.A06(), c0806Od.A09(), c0806Od.A0B(), c0806Od.A07());
        this.A05.setRoundedCornersEnabled(A00());
        this.A05.setViewShowsOverMedia(A0B());
        ML.A0G(1001, this.A05);
        this.A06 = new OW(this.A03, this.A00, this.A02, A01(), A02());
        ML.A0K(this.A06);
    }

    public boolean A00() {
        return true;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public void A09(AnonymousClass86 anonymousClass86) {
        this.A01 = true;
    }

    public void A0A(AnonymousClass84 anonymousClass84) {
    }

    public boolean A0B() {
        return true;
    }

    public void A0W() {
    }

    public void A0X() {
    }

    public void A0Y() {
    }

    public void A0Z() {
    }

    public void A0a() {
    }

    public void A0b(C1B c1b, String str, double d2, @Nullable Bundle bundle) {
        this.A06.A01(c1b.A0E().A05(), c1b.A0E().A01(), null, false, !A0c() && d2 > 0.0d && d2 < 1.0d);
        this.A05.setCta(c1b.A0F(), str, new HashMap());
    }

    public boolean A0d(boolean z) {
        return false;
    }

    public C1046Xo getAdContextWrapper() {
        return this.A03;
    }

    public InterfaceC0684Jg getAdEventManager() {
        return this.A04;
    }

    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    public C1K getColors() {
        return this.A00;
    }

    public View$OnClickListenerC0923Sr getCtaButton() {
        return this.A05;
    }

    public OW getTitleDescContainer() {
        return this.A06;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C1K A00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            A00 = this.A07.A04().A0M().A01();
        } else {
            A00 = this.A07.A04().A0M().A00();
        }
        this.A00 = A00;
        this.A05.setViewShowsOverMedia(A0B());
        this.A05.setUpButtonColors(this.A00);
        this.A06.A00(this.A00, this.A02);
    }
}
