package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Ds  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0546Ds implements X6, InterfaceC0485Au {
    public int A00;
    public int A01;
    public long A02;
    public C0486Av A03;
    public InterfaceC0597Fv A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public AbstractC0546Ds(int i2) {
        this.A08 = i2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CM != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<?> */
    public static boolean A0x(@Nullable CM<?> cm, @Nullable DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (cm == null) {
            return false;
        }
        return cm.A3w(drmInitData);
    }

    public final int A0y() {
        return this.A00;
    }

    public final int A0z(long j2) {
        return this.A04.AEx(j2 - this.A02);
    }

    public final int A10(AZ az, C1024Ws c1024Ws, boolean z) {
        int ADX = this.A04.ADX(az, c1024Ws, z);
        if (ADX == -4) {
            if (c1024Ws.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            c1024Ws.A00 += this.A02;
        } else if (ADX == -5) {
            Format format = az.A00;
            if (format.A0G != Long.MAX_VALUE) {
                az.A00 = format.A0H(format.A0G + this.A02);
            }
        }
        return ADX;
    }

    public final C0486Av A11() {
        return this.A03;
    }

    public void A12() {
    }

    public void A13() throws AM {
    }

    public void A14() throws AM {
    }

    public void A15(long j2, boolean z) throws AM {
    }

    public void A16(boolean z) throws AM {
    }

    public void A17(Format[] formatArr, long j2) throws AM {
    }

    public final boolean A18() {
        return this.A05 ? this.A06 : this.A04.A8c();
    }

    public final Format[] A19() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final void A4m() {
        IJ.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A12();
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final void A59(C0486Av c0486Av, Format[] formatArr, InterfaceC0597Fv interfaceC0597Fv, long j2, boolean z, long j3) throws AM {
        IJ.A04(this.A01 == 0);
        this.A03 = c0486Av;
        this.A01 = 1;
        A16(z);
        ADy(formatArr, interfaceC0597Fv, j3);
        A15(j2, z);
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final InterfaceC0485Au A5x() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public IZ A6v() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final int A7V() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final InterfaceC0597Fv A7a() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.X6, com.facebook.ads.redexgen.X.InterfaceC0485Au
    public final int A7h() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0482Ar
    public void A7y(int i2, Object obj) throws AM {
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final boolean A84() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final boolean A8O() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final void A9Y() throws IOException {
        this.A04.A9V();
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final void ADy(Format[] formatArr, InterfaceC0597Fv interfaceC0597Fv, long j2) throws AM {
        IJ.A04(!this.A06);
        this.A04 = interfaceC0597Fv;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j2;
        A17(formatArr, j2);
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final void AE9(long j2) throws AM {
        this.A06 = false;
        this.A05 = false;
        A15(j2, false);
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final void AEc() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final void AEe(int i2) {
        this.A00 = i2;
    }

    public int AFE() throws AM {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final void start() throws AM {
        IJ.A04(this.A01 == 1);
        this.A01 = 2;
        A13();
    }

    @Override // com.facebook.ads.redexgen.X.X6
    public final void stop() throws AM {
        IJ.A04(this.A01 == 2);
        this.A01 = 1;
        A14();
    }
}
