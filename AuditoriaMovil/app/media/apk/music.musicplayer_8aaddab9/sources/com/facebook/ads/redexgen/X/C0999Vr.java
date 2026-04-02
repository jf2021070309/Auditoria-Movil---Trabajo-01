package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Vr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0999Vr implements InterfaceC0517Cc {
    public static String[] A08 = {"", "mExdGVP0maPlz", "mtU4GW9lJGPRgwi7WTtJ47xTDMOD9Jvz", "mnVK2jaR5CYO63Y95SEKprVffrLm5k0s", "WHnhbYArFQVibafDHBFVvoYN0aOa9WUH", "bzekXst0bt0AdcZvIiwJXkkJcIHRgIjU", "gyTL2jV1VgKAzlNybmW", "q"};
    public static final InterfaceC0519Cf A09 = new C1000Vs();
    public long A00;
    public Ce A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<C0543Dp> A05;
    public final C0660Ii A06;
    public final C0672Iu A07;

    public C0999Vr() {
        this(new C0672Iu(0L));
    }

    public C0999Vr(C0672Iu c0672Iu) {
        this.A07 = c0672Iu;
        this.A06 = new C0660Ii(4096);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void A8I(Ce ce) {
        this.A01 = ce;
        ce.AER(new C1012Wg(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0133, code lost:
        if (r4 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
        r10.AEy(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0139, code lost:
        if (r4 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013c, code lost:
        r9.A06.A0W(r5);
        r10.readFully(r9.A06.A00, 0, r5);
        r9.A06.A0Y(6);
        r4.A03(r9.A06);
        r1 = r9.A06;
        r1.A0X(r1.A05());
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ADU(com.facebook.ads.redexgen.X.InterfaceC0518Cd r10, com.facebook.ads.redexgen.X.C0521Cj r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0999Vr.ADU(com.facebook.ads.redexgen.X.Cd, com.facebook.ads.redexgen.X.Cj):int");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void AEQ(long j2, long j3) {
        this.A07.A08();
        for (int i2 = 0; i2 < this.A05.size(); i2++) {
            this.A05.valueAt(i2).A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final boolean AF0(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        interfaceC0518Cd.AD4(bArr, 0, 14);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            if (A08[7].length() != 3) {
                A08[4] = "dWjhqjXulz1hd3AtKzuGBSPNQhOMyT1H";
                interfaceC0518Cd.A3J(bArr[13] & 7);
                interfaceC0518Cd.AD4(bArr, 0, 3);
                return 1 == ((bArr[2] & 255) | (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)));
            }
            throw new RuntimeException();
        }
        return false;
    }
}
