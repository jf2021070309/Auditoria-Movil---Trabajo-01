package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
/* loaded from: assets/audience_network.dex */
public final class VQ implements InterfaceC0643Hr {
    public static String[] A0C = {"nBGgOhUJr5w54zk2FcSY", "YYZuUd", "gwBohD1o6c6DfEcFdJm47xfjaEoVukk3", "3TNnSL", "hJWvKqQqk09hkKqv49F3L8Ilz7Jhye22", "G8FOHrMAxxSNQBngbaVWxtAhYQnldn5N", "v6FRbmkBAKb4FwdIpHjrHHJWg4k1tULi", "7hirQzfzNIRD79h7knAyc8"};
    public long A00;
    public long A02;
    public C0636Hi A03;
    public final Uri A05;
    public final FU A07;
    public final InterfaceC0632He A08;
    public final IP A09;
    public volatile boolean A0A;
    public final /* synthetic */ C0513Bx A0B;
    public final C0521Cj A06 = new C0521Cj();
    public boolean A04 = true;
    public long A01 = -1;

    public VQ(C0513Bx c0513Bx, Uri uri, InterfaceC0632He interfaceC0632He, FU fu, IP ip) {
        this.A0B = c0513Bx;
        this.A05 = (Uri) IJ.A01(uri);
        this.A08 = (InterfaceC0632He) IJ.A01(interfaceC0632He);
        this.A07 = (FU) IJ.A01(fu);
        this.A09 = ip;
    }

    public final void A04(long j2, long j3) {
        this.A06.A00 = j2;
        this.A02 = j3;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0643Hr
    public final void A3x() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0643Hr
    public final void A8m() throws IOException, InterruptedException {
        int i2 = 0;
        while (i2 == 0) {
            boolean z = this.A0A;
            if (A0C[0].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "6lKOSY";
            strArr[1] = "aO7eUD";
            if (!z) {
                InterfaceC0518Cd interfaceC0518Cd = null;
                try {
                    long j2 = this.A06.A00;
                    this.A03 = new C0636Hi(this.A05, j2, -1L, C0513Bx.A08(this.A0B));
                    this.A01 = this.A08.ACt(this.A03);
                    if (this.A01 != -1) {
                        this.A01 += j2;
                    }
                    C1016Wk c1016Wk = new C1016Wk(this.A08, j2, this.A01);
                    InterfaceC0517Cc A02 = this.A07.A02(c1016Wk, this.A08.A7j());
                    if (this.A04) {
                        A02.AEQ(j2, this.A02);
                        this.A04 = false;
                    }
                    while (i2 == 0 && !this.A0A) {
                        this.A09.A00();
                        i2 = A02.ADU(c1016Wk, this.A06);
                        if (c1016Wk.A7E() > C0513Bx.A03(this.A0B) + j2) {
                            j2 = c1016Wk.A7E();
                            this.A09.A01();
                            C0513Bx.A04(this.A0B).post(C0513Bx.A06(this.A0B));
                        }
                    }
                    if (i2 == 1) {
                        i2 = 0;
                    } else {
                        this.A06.A00 = c1016Wk.A7E();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    C0676Iy.A0W(this.A08);
                } catch (Throwable th) {
                    if (i2 != 1 && 0 != 0) {
                        this.A06.A00 = interfaceC0518Cd.A7E();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    C0676Iy.A0W(this.A08);
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
