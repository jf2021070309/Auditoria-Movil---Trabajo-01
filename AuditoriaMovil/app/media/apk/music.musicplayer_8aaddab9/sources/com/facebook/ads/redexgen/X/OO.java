package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.RewardData;
/* loaded from: assets/audience_network.dex */
public final class OO extends FrameLayout {
    public static String[] A07 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};
    @Nullable
    public AbstractC0760Mj A00;
    public final AnonymousClass18 A01;
    public final C1046Xo A02;
    public final InterfaceC0761Mk A03;
    public final ON A04;
    @Nullable
    public final Q8 A05;
    public final View[] A06;

    public OO(C0806Od c0806Od, AnonymousClass18 anonymousClass18, @Nullable Q8 q8, C0665In c0665In, OD od, InterfaceC0761Mk interfaceC0761Mk, ON on) {
        this(c0806Od, anonymousClass18, q8, interfaceC0761Mk, on, c0665In, od);
    }

    public OO(C0806Od c0806Od, AnonymousClass18 anonymousClass18, @Nullable Q8 q8, InterfaceC0761Mk interfaceC0761Mk, ON on, View... viewArr) {
        this(c0806Od.A05(), c0806Od.A08(), anonymousClass18, q8, interfaceC0761Mk, on, viewArr);
    }

    public OO(C1046Xo c1046Xo, @Nullable AbstractC0760Mj abstractC0760Mj, AnonymousClass18 anonymousClass18, @Nullable Q8 q8, InterfaceC0761Mk interfaceC0761Mk, ON on, View... viewArr) {
        super(c1046Xo);
        this.A02 = c1046Xo;
        this.A00 = abstractC0760Mj;
        this.A01 = anonymousClass18;
        this.A06 = viewArr;
        this.A03 = interfaceC0761Mk;
        this.A05 = q8;
        this.A04 = on;
        A03();
    }

    private void A03() {
        String title;
        RewardData A0L = this.A01.A0L();
        if (A0L == null) {
            title = this.A01.A0P().A05();
        } else {
            title = this.A01.A0P().A06(A0L.getCurrency(), A0L.getQuantity());
        }
        C0770Mt c0770Mt = new C0770Mt(this.A02, -1, -16777216, title, null, this.A01.A0P().A04(), this.A01.A0P().A03(), MU.A01(MT.REWARD_ICON));
        c0770Mt.A02.setOnClickListener(new OL(this));
        c0770Mt.A01.setOnClickListener(new OM(this));
        addView(c0770Mt, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        Q8 q8 = this.A05;
        if (q8 != null) {
            q8.A0a(EnumC0848Pu.A07);
        }
        this.A04.A9v();
        if (!this.A01.A0N().A0O()) {
            this.A01.A0f(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        View[] viewArr;
        Q8 q8 = this.A05;
        if (q8 != null && !q8.A0j()) {
            this.A05.A0f(false, false, 11);
            ML.A0N(this.A05, 4);
        }
        AbstractC0760Mj abstractC0760Mj = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (abstractC0760Mj != null) {
            ML.A0H(abstractC0760Mj);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            ML.A0N(view, 4);
        }
        viewGroup.addView(this, new RelativeLayout.LayoutParams(-1, -1));
        this.A04.ABN();
    }
}
