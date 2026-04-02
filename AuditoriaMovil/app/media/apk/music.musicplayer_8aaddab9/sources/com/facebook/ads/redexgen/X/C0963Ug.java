package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Ug  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0963Ug implements InterfaceC0632He {
    public static byte[] A0L;
    public static String[] A0M = {"xvXnimfZlroovEtMoHYEYdvHQmTptcRb", "VShQwZMBIZykoEi", "P7iiojcQSdjMkPZizdNAiKDH8422CMpJ", "OxKv", "P8zJvNho1beYtiBqU3s9pOljEd8sbOL5", "Bz35mpVTEU3xTv8hVu6cT493QseTsu6A", "YnRJs9xpv2Ig79N4M2dWIXRLqnd73xG0", "iIjgXD4YmMEy6XOGrZ4fgbIBHD"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public InterfaceC0632He A07;
    public I7 A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC0632He A0D;
    public final InterfaceC0632He A0E;
    public final InterfaceC0632He A0F;
    public final I3 A0G;
    @Nullable
    public final I5 A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0M[1].length() != 15) {
                throw new RuntimeException();
            }
            A0M[1] = "0DeGlGnSrcDo9YH";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 36);
            i5++;
        }
    }

    public static void A06() {
        A0L = new byte[]{28, 29, 48, 18, 16, 27, 22, 23, 49, 10, 7, 22, 0, 33, 22, 18, 23};
    }

    static {
        A06();
    }

    public C0963Ug(I3 i3, InterfaceC0632He interfaceC0632He, InterfaceC0632He interfaceC0632He2, @Nullable InterfaceC0630Hc interfaceC0630Hc, int i2, @Nullable I5 i5) {
        this.A0G = i3;
        this.A0D = interfaceC0632He2;
        this.A0I = (i2 & 1) != 0;
        this.A0K = (i2 & 2) != 0;
        this.A0J = (i2 & 4) != 0;
        this.A0F = interfaceC0632He;
        if (interfaceC0630Hc != null) {
            this.A0E = new C0966Uj(interfaceC0632He, interfaceC0630Hc);
        } else {
            this.A0E = null;
        }
        this.A0H = i5;
    }

    private int A00(C0636Hi c0636Hi) {
        if (this.A0K && this.A0C) {
            return 0;
        }
        if (this.A0J && c0636Hi.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(I3 i3, String str, Uri uri) {
        ID contentMetadata = i3.A68(str);
        Uri A01 = IE.A01(contentMetadata);
        return A01 == null ? uri : A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.ads.redexgen.X.He, com.facebook.ads.redexgen.X.I7] */
    private void A03() throws IOException {
        InterfaceC0632He interfaceC0632He = this.A07;
        if (interfaceC0632He == null) {
            return;
        }
        try {
            interfaceC0632He.close();
        } finally {
            this.A07 = null;
            this.A0A = false;
            I7 i7 = this.A08;
            if (i7 != null) {
                this.A0G.ADn(i7);
                this.A08 = null;
            }
        }
    }

    private void A04() {
        if (this.A0H != null && this.A04 > 0) {
            this.A0G.A5u();
            throw new NullPointerException(A02(0, 17, 87));
        }
    }

    private void A05() throws IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AEb(this.A09, this.A03);
        }
    }

    private void A07(IOException iOException) {
        if (A0A() || (iOException instanceof I1)) {
            this.A0C = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b9, code lost:
        if (r4 != (-1)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01bb, code lost:
        r2 = java.lang.Math.min(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d0, code lost:
        if (r4 != (-1)) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(boolean r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0963Ug.A08(boolean):void");
    }

    private boolean A09() {
        return this.A07 == this.A0F;
    }

    private boolean A0A() {
        return this.A07 == this.A0D;
    }

    private boolean A0B() {
        return !A0A();
    }

    private boolean A0C() {
        return this.A07 == this.A0E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0D(java.io.IOException r3) {
        /*
        L0:
            if (r3 == 0) goto L14
            boolean r0 = r3 instanceof com.facebook.ads.redexgen.X.C0633Hf
            if (r0 == 0) goto Lf
            r0 = r3
            com.facebook.ads.redexgen.X.Hf r0 = (com.facebook.ads.redexgen.X.C0633Hf) r0
            int r0 = r0.A00
            if (r0 != 0) goto Lf
            r0 = 1
            return r0
        Lf:
            java.lang.Throwable r3 = r3.getCause()
            goto L0
        L14:
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0963Ug.A0M
            r0 = 5
            r1 = r1[r0]
            r0 = 13
            char r1 = r1.charAt(r0)
            r0 = 118(0x76, float:1.65E-43)
            if (r1 == r0) goto L2a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0963Ug.A0M
            java.lang.String r1 = "Fi50x9pU4R4a4ch"
            r0 = 1
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0963Ug.A0D(java.io.IOException):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    public final Uri A7j() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    public final long ACt(C0636Hi c0636Hi) throws IOException {
        try {
            this.A09 = I9.A02(c0636Hi);
            this.A06 = c0636Hi.A04;
            this.A05 = A01(this.A0G, this.A09, this.A06);
            this.A00 = c0636Hi.A00;
            this.A03 = c0636Hi.A03;
            this.A0B = A00(c0636Hi) != -1;
            boolean z = this.A0B;
            if (c0636Hi.A02 != -1 || this.A0B) {
                this.A01 = c0636Hi.A02;
            } else {
                this.A01 = this.A0G.A67(this.A09);
                if (this.A01 != -1) {
                    this.A01 -= c0636Hi.A03;
                    if (this.A01 <= 0) {
                        throw new C0633Hf(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (IOException e2) {
            A07(e2);
            throw e2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (IOException e2) {
            A07(e2);
            throw e2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0632He
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            int i4 = (this.A03 > this.A02 ? 1 : (this.A03 == this.A02 ? 0 : -1));
            String[] strArr = A0M;
            if (strArr[4].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[7] = "DFL6VfCjI9oAtZuqjooU4v3Ar2";
            strArr2[3] = "hOjd";
            if (i4 >= 0) {
                A08(true);
            }
            int read = this.A07.read(bArr, i2, i3);
            if (read != -1) {
                if (A0A()) {
                    this.A04 += read;
                }
                this.A03 += read;
                if (this.A01 != -1) {
                    this.A01 -= read;
                }
            } else if (this.A0A) {
                A05();
            } else if (this.A01 > 0 || this.A01 == -1) {
                A03();
                A08(false);
                return read(bArr, i2, i3);
            }
            return read;
        } catch (IOException e2) {
            if (this.A0A && A0D(e2)) {
                A05();
                return -1;
            }
            A07(e2);
            throw e2;
        }
    }
}
