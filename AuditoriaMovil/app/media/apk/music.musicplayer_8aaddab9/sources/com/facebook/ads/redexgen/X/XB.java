package com.facebook.ads.redexgen.X;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* loaded from: assets/audience_network.dex */
public final class XB<T> implements InterfaceC04569r<T> {
    public static byte[] A06;
    public static String[] A07 = {"qjHjxJEnKto6KXykxGUV", "2zWwgsdc0YI2n1wuHJ0aHIsPzdmfxqsH", "nH8zlfZwPcU2YCM90OUKaCidDMv0PXY6", "9v530zo2HQQRKyJKvzn5HrUNTPRL7Myp", "K3vwlAe6bCWVMYHegp9FYHqzcyyslUPY", "TkUFKGPVf3MACXJSEel58pLd1ZQWiXgG", "k6Fq1", "q4H6OwDTyeTkPN5vSxQjqxUvCkQfNX6D"};
    public C04499j A00;
    public C04499j A01;
    public List<XB<T>.RecordFileBasedFetch> A02 = new ArrayList();
    public boolean A03;
    public final C04489i A04;
    public final C04639y A05;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-28, 2, 15, -63, 16, 15, 13, 26, -63, 5, 6, 13, 6, 21, 6, -63, 4, 22, 19, 20, 16, 19, 20, -63, 17, 16, 10, 15, 21, 10, 15, 8, -63, 2, 21, -63, 21, 9, 6, -63, 5, 2, 21, 2, 3, 2, 20, 6, -63, 20, 21, 2, 19, 21, -38, 12, 9, 10, 6, 9, -73, 7, 6, 10, 0, 11, 0, 6, 5, -73, 0, 10, -73, -8, 11, -73, -65, -68, -5, -61, -68, -5, -64, -61, -73, -8, 5, -5, -73, 9, -4, -6, 6, 9, -5, -73, -3, 0, 3, -4, -73, 10, -4, 8, 12, -4, 5, -6, -4, -73, 10, 11, -8, 9, 11, 10, -73, -8, 11, -73, -65, -68, -5, -61, -68, -5, -64, -47, -73, -5, -8, 11, -8, -73, -1, -8, 10, -73, 7, 9, 6, -7, -8, -7, 3, 16, -73, -7, -4, -4, 5, -73, 3, 6, 10, 11, -78, -28, -31, -30, -34, -31, -113, -33, -34, -30, -40, -29, -40, -34, -35, -113, -40, -30, -113, -48, -29, -113, -105, -108, -45, -101, -108, -45, -104, -101, -113, -47, -28, -29, -113, -31, -44, -46, -34, -31, -45, -113, -43, -40, -37, -44, -113, -30, -44, -32, -28, -44, -35, -46, -44, -113, -34, -35, -37, -24, -113, -41, -48, -30, -113, -43, -40, -37, -44, -113, -108, -45, -87, -113, -45, -48, -29, -48, -113, -41, -48, -30, -113, -33, -31, -34, -47, -48, -47, -37, -24, -113, -47, -44, -44, -35, -113, -37, -34, -30, -29, -27, 0, 8, 11, 4, 3, -65, 19, 14, -65, 0, 3, 3, -65, 3, 0, 19, 0, -65, 19, 14, -65, 11, 14, 6, -72, -45, -37, -34, -41, -42, -110, -26, -31, -110, -43, -34, -41, -45, -28, -110, -42, -45, -26, -45, -44, -45, -27, -41, -9, 18, 26, 29, 22, 21, -47, 37, 32, -47, 23, 22, 37, 20, 25, -47, 21, 18, 37, 18, -47, 23, 35, 32, 30, -47, 29, 32, 24, 34, 61, 69, 72, 65, 64, -4, 80, 75, -4, 67, 65, 80, -4, 78, 65, 63, 75, 78, 64, -4, 63, 75, 81, 74, 80, 5, 32, 40, 43, 36, 35, -33, 51, 46, -33, 52, 47, 35, 32, 51, 36, -33, 37, 40, 43, 36, -33, 50, 36, 48, 52, 36, 45, 34, 36, 43, 62, 60, 72, 75, 61, 31, 66, 69, 62, 27, 58, 76, 62, 61, 43, 62, 60, 72, 75, 61, 29, 58, 77, 58, 59, 58, 76, 62, -7, 60, 69, 72, 76, 62, 61, -8, 11, 9, 21, 24, 10, -20, 15, 18, 11, -24, 7, 25, 11, 10, -8, 11, 9, 21, 24, 10, -22, 7, 26, 7, 8, 7, 25, 11, -58, 15, 25, -58, 9, 18, 21, 25, 11, 10, -24, 1, -2, 1, 2, 10, 1, -77, -27, -8, -10, 2, 5, -9, -39, -4, -1, -8, -43, -12, 6, -8, -9, -27, -8, -10, 2, 5, -9, -41, -12, 7, -12, -11, -12, 6, -8, -77, -7, -8, 7, -10, -5, 11, 29, 26, 27, 23, 26, 5, 2, 21, 2};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public XB(C04539o c04539o, InterfaceC04619w interfaceC04619w) throws IOException {
        this.A05 = new C04639y(c04539o.A04(A00(515, 4, 63)), interfaceC04619w);
        this.A04 = new C04489i(new File(c04539o.A05(), A00(509, 6, 70)));
        this.A00 = this.A04.A03();
        A05(interfaceC04619w);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i2, int i3) throws IOException {
        this.A00 = new C04499j(i2, i3);
        this.A04.A04(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/XB<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(XC xc) throws A0 {
        if (!this.A03) {
            if (A06(xc)) {
                if (xc.A5M() == 0) {
                    return;
                }
                if (this.A00.A04(xc.A00().A02) == 0) {
                    try {
                        for (C04609v c04609v : xc.A00) {
                            if (c04609v.A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), xc.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e2) {
                        throw new A0(A00(361, 30, 93), e2);
                    }
                }
                throw new A0(A00(0, 54, 63));
            }
            throw new A0(A00(466, 43, 49));
        }
        throw new A0(A00(427, 39, 68));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A05(InterfaceC04619w interfaceC04619w) throws IOException {
        C04499j c04499j = new C04499j(this.A05.A06(), 0);
        if (c04499j.A04(this.A00) > 0) {
            interfaceC04619w.AE1(String.format(Locale.US, A00(54, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 53), Integer.valueOf(this.A00.A02()), Integer.valueOf(this.A00.A03()), Integer.valueOf(c04499j.A02()), Integer.valueOf(c04499j.A03())));
            this.A00 = c04499j;
            return;
        }
        while (c04499j.A02() < this.A00.A02()) {
            if (this.A05.A0D()) {
                c04499j = new C04499j(this.A05.A06(), 0);
            } else {
                interfaceC04619w.AE1(String.format(Locale.US, A00(156, 101, 13), Integer.valueOf(this.A00.A02()), Integer.valueOf(this.A00.A03()), Integer.valueOf(c04499j.A02())));
                this.A00 = new C04499j(this.A05.A06(), this.A05.A07());
                this.A04.A04(this.A00);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/XB<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(XC xc) {
        if (!this.A02.remove(xc)) {
            return false;
        }
        if (xc.A5M() > 0 && xc.A01().A02.A05(xc.A01().A01).equals(this.A01)) {
            this.A01 = xc.A00().A02;
        }
        if (A07[6].length() != 28) {
            A07[6] = "RJmBk8mp9ukvkOiT1GdeN9JCmreSI8hk";
            return true;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XC != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04569r
    public final synchronized InterfaceC04559q A5L(byte[] bArr, int[] iArr) throws A0 {
        XB<T>.RecordFileBasedFetch xc;
        if (!this.A03) {
            int i2 = 0;
            int i3 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean z = true;
                while (true) {
                    C04519m A0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, i2, iArr, i3);
                    int A00 = A0A.A01().A00() - A0A.A01().A01();
                    i2 += A0A.A01().A02();
                    i3 += A00;
                    if (A0A.A01().A03() == EnumC04509k.A02) {
                        arrayList.add(A0A);
                    }
                    if (A0A.A01().A03() == EnumC04509k.A03) {
                        break;
                    } else if (A0A.A01().A03() == EnumC04509k.A04) {
                        if (this.A05.A06() + this.A05.A08() != this.A01.A02() + 1) {
                            this.A01 = new C04499j(this.A01.A02() + 1, 0);
                        } else {
                            z = false;
                            break;
                        }
                    } else {
                        this.A01 = this.A01.A05(A00);
                    }
                }
                xc = new XC(this, arrayList, z);
                this.A02.add(xc);
                if (!arrayList.isEmpty()) {
                    this.A01 = xc.A01().A02.A05(xc.A01().A01);
                }
            } catch (IOException e2) {
                throw new A0(A00(306, 29, 79), e2);
            }
        } else {
            throw new A0(A00(391, 36, 119));
        }
        return xc;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04569r
    public final synchronized int A7H() throws A0 {
        int A09;
        if (!this.A03) {
            try {
                A09 = this.A05.A09();
                if (this.A00.A02() == this.A05.A06()) {
                    A09 -= this.A00.A03();
                }
            } catch (IOException e2) {
                throw new A0(A00(335, 26, 122), e2);
            }
        } else {
            throw new A0(A00(427, 39, 68));
        }
        return A09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04569r
    public final synchronized void AFA(byte[] bArr) throws A0 {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e2) {
                throw new A0(A00(257, 25, 61), e2);
            }
        } else {
            throw new A0(A00(427, 39, 68));
        }
        String[] strArr = A07;
        if (strArr[5].charAt(29) != strArr[7].charAt(29)) {
            throw new RuntimeException();
        }
        A07[6] = "aLWzj";
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04569r
    public final synchronized void clear() throws A0 {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e2) {
            throw new A0(A00(282, 24, 16), e2);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
