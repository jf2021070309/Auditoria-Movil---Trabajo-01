package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import ch.qos.logback.core.spi.ComponentTracker;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.cl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1275cl implements Ki {
    public static byte[] A0E;
    public static String[] A0F = {"Um", "5O6Pi5UhekEiJBNtL2", "ByBiFstlzS", "VNZICTTmM6bBZ", "I3ykA2cHAONkN", "xnUs6VMzToWHuFoC", "Qkjm3fg24P6DD7pmZ7L4neN1zLjqdukp", "LFB8Dcv49A6aPeUL"};
    @Nullable
    public InterfaceC02671t A00;
    public C9H A01;
    @Nullable
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    @Nullable
    public final AdSize A06;
    public final C02400s A07;
    public final C1046Xo A08;
    public final InterfaceC0684Jg A09;
    public final KL A0A;
    public final C0711Kj A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0F[2].length() != 10) {
                throw new RuntimeException();
            }
            A0F[1] = "uoxYJqIRleds8fPMMv";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 87);
            i5++;
        }
    }

    public static void A05() {
        byte[] bArr = {64, 65, -14, 66, 62, 51, 53, 55, 63, 55, 64, 70, -14, 59, 64, -14, 68, 55, 69, 66, 65, 64, 69, 55};
        if (A0F[0].length() != 2) {
            throw new RuntimeException();
        }
        A0F[1] = "dKV76OJFyRmVPWeRzZ";
        A0E = bArr;
    }

    static {
        A05();
        MN.A02();
    }

    public C1275cl(C1046Xo c1046Xo, String str, KL kl, @Nullable AdSize adSize, int i2) {
        this.A08 = c1046Xo;
        this.A0D = str;
        this.A0A = kl;
        this.A06 = adSize;
        this.A04 = i2;
        this.A0B = new C0711Kj(this.A08);
        this.A0B.A0P(this);
        this.A07 = new C02400s();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new FJ(this);
        this.A09 = c1046Xo.A08();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<C1315dP> A04() {
        C9H c9h = this.A01;
        ArrayList arrayList = new ArrayList(c9h.A02());
        for (C9F A04 = c9h.A04(); A04 != null; A04 = c9h.A04()) {
            InterfaceC02350n A00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (A00 != null && A00.A7A() == AdPlacementType.NATIVE) {
                C1315dP c1315dP = (C1315dP) A00;
                c1315dP.A0L(this.A08, new FK(this, arrayList, c1315dP), this.A09, new C02651r(A04.A04(), c9h.A05(), this.A0D, c9h.A05().A0C()), U1.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            KQ kq = new KQ(this.A08, null, null, null);
            C1046Xo c1046Xo = this.A08;
            String str = this.A0D;
            AdSize adSize = this.A06;
            this.A0B.A0O(new C0709Kg(c1046Xo, str, adSize != null ? new C0748Lx(adSize.getWidth(), this.A06.getHeight()) : null, this.A0A, null, this.A04, AdSettings.isTestMode(this.A08), AdSettings.isMixedAudience(), kq, M3.A01(JQ.A0H(this.A08)), this.A02, null));
        } catch (KH e2) {
            AAh(KG.A02(e2));
        }
    }

    public final void A08(InterfaceC02671t interfaceC02671t) {
        this.A00 = interfaceC02671t;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        C9H c9h = this.A01;
        return c9h == null || c9h.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.Ki
    public final void AAh(KG kg) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, ComponentTracker.DEFAULT_TIMEOUT);
        }
        InterfaceC02671t interfaceC02671t = this.A00;
        if (A0F[2].length() != 10) {
            throw new RuntimeException();
        }
        A0F[2] = "yGn7NPCZVX";
        if (interfaceC02671t != null) {
            interfaceC02671t.AAh(kg);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Ki
    public final void ACP(C0946To c0946To) {
        C9H A00 = c0946To.A00();
        if (A00 != null) {
            if (this.A03) {
                long A0A = A00.A05().A0A();
                if (A0A == 0) {
                    A0A = ComponentTracker.DEFAULT_TIMEOUT;
                }
                this.A05.postDelayed(this.A0C, A0A);
            }
            this.A01 = A00;
            List<C1315dP> A04 = A04();
            if (this.A00 != null) {
                if (A04.isEmpty()) {
                    this.A00.AAh(KG.A01(AdErrorType.NO_FILL, A03(0, 0, 68)));
                    return;
                } else {
                    this.A00.ABa(A04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 123));
    }
}
