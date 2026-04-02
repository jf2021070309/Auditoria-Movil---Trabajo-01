package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.dS  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1318dS<NativeViewabilityLogger> implements InterfaceC02350n {
    public static byte[] A0G;
    public static String[] A0H = {"1VlIdrj3fRAASVh0IRQbA", "AKXoeI10d8PJONEXEmQHjWIEkAB2E", "HfXt1ktTFXNYFvURT1ePpe", "VNbNAjzqH3UXN3t9RrTP5z6I5Qa6gPQJ", "DeawL9PzUIlDumNdtXISYTaSpfy6P3Cj", "KNbO6MhxkLbBAZAqlm1H7U8Ouut8mEhI", "i536pd2CEb7n0lc", "TelURl5RBqiFivFSJRRvco6RCKborqoX"};
    public static final String A0I;
    public InterfaceC02430v A00;
    public C1307dH A01;
    @Nullable
    public C1300dA A02;
    public E5 A03;
    @Nullable
    public InterfaceC0684Jg A04;
    @Nullable
    @DoNotStrip
    public O3 A06;
    @Nullable
    public C0927Sv A07;
    @Nullable
    public C04529n A08;
    @DoNotStrip
    public AbstractC0868Qo A09;
    @Nullable
    public C0869Qp A0A;
    public String A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public MD A05 = new MD();
    public Boolean A0B = false;

    public static String A09(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 19);
            if (A0H[2].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[3] = "viF0h1063r6cbXDqGfnWrC6qPBVBGzAv";
            strArr[7] = "3ywSXssJKLxMazlfVUMLvW6ymO505mlb";
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0G = new byte[]{-28, -16, -18, -81, -25, -30, -28, -26, -29, -16, -16, -20, -81, -30, -27, -12, -81, -29, -30, -17, -17, -26, -13, -81, -28, -19, -22, -28, -20, -26, -27, -24, -39, -20, -24, -93, -36, -24, -31, -32, -68, -69, -83, 116, Byte.MAX_VALUE};
    }

    static {
        A0B();
        A0I = C1318dS.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dS != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0A() {
        C1300dA c1300dA;
        if (this.A00 != null && this.A08 != null && (c1300dA = this.A02) != null && c1300dA.A0r()) {
            this.A00.AAB(this, this.A08);
        }
        if (this.A00 != null && this.A0D) {
            boolean z = this.A0E;
            if (A0H[2].length() == 29) {
                throw new RuntimeException();
            }
            A0H[2] = "DQYu3GBVfiN4Ml";
            if (z || !this.A0F) {
                this.A00.AAB(this, this.A07);
            }
        }
        this.A03.A0D().A3W(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dS != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0C(int i2, C9I c9i) {
        InterfaceC0822Ot nativeDSLListener = new C1321dV(this);
        this.A08 = new C04529n(this.A03, this.A04, nativeDSLListener, this.A02, A09(0, 31, 110), 2, this.A05);
        this.A09 = new C1320dU(this);
        this.A0A = new C0869Qp(this.A08, c9i.A04(), c9i.A09(), true, new WeakReference(this.A09), this.A03);
        this.A0A.A0W(this.A02.A0H());
        this.A0A.A0X(this.A02.A0I());
        this.A08.setVisibility(0);
        this.A03.getResources();
        this.A08.setLayoutParams(new LinearLayout.LayoutParams(-1, i2));
        this.A08.AF7();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dS != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(C9I c9i, C02651r c02651r) {
        C1309dJ A00 = C1309dJ.A00(c02651r.A03());
        this.A0C = A00.A64();
        if (C02320j.A03(this.A03, A00, this.A04)) {
            this.A03.A0D().A40();
            this.A00.AB9(this, KG.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A06 = new C0584Fi(this, A00);
        this.A07 = new C0927Sv(this.A03, new WeakReference(this.A06), c9i.A04(), A64());
        this.A07.A0G(c9i.A07(), c9i.A08());
        C1319dT c1319dT = new C1319dT(this);
        E5 e5 = this.A03;
        InterfaceC0684Jg interfaceC0684Jg = this.A04;
        C0927Sv c0927Sv = this.A07;
        this.A01 = new C1307dH(e5, interfaceC0684Jg, c0927Sv, c0927Sv.getViewabilityChecker(), c1319dT);
        this.A01.A08(A00);
        this.A07.loadDataWithBaseURL(O6.A01(AdInternalSettings.getUrlPrefix()), A00.A04(), A09(31, 9, 97), A09(40, 5, 52), null);
        this.A0D = true;
        A0A();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dS != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0G(KJ kj, C9I c9i) {
        if (this.A02 == null || this.A04 == null) {
            return;
        }
        int A02 = (int) (kj.A02() * Resources.getSystem().getDisplayMetrics().density);
        if (!(JQ.A1P(this.A03) && C03555g.A0A(this.A02.A0c()))) {
            A0C(A02, c9i);
        } else {
            new C03555g(new C7U(this.A03), this.A02.A0c(), this.A02.A0X(), this.A02.A0Y(), true, new C1322dW(this, A02, c9i, this)).A0B();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dS != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public final void A0J(E5 e5, InterfaceC0684Jg interfaceC0684Jg, KJ kj, InterfaceC02430v interfaceC02430v, C02651r c02651r) {
        e5.A0D().A3V();
        this.A03 = e5;
        this.A04 = interfaceC0684Jg;
        this.A00 = interfaceC02430v;
        this.A0F = JQ.A16(this.A03.getApplicationContext());
        C9I A01 = c02651r.A01();
        this.A02 = C1300dA.A01(c02651r.A03(), this.A03);
        if (this.A02.A0r()) {
            A0G(kj, A01);
        } else {
            A0F(A01, c02651r);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dS != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02350n
    public final String A64() {
        return this.A0C;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dS != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02350n
    public final AdPlacementType A7A() {
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dS != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02350n
    public final void onDestroy() {
        this.A03.A0D().A3T(this.A07 != null);
        C0927Sv c0927Sv = this.A07;
        if (c0927Sv != null) {
            c0927Sv.destroy();
            this.A07 = null;
            this.A06 = null;
        }
    }
}
