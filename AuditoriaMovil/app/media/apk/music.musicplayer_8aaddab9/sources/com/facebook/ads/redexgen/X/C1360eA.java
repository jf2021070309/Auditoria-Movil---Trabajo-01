package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Nullable;
import ch.qos.logback.classic.Level;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.eA  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1360eA {
    @Nullable
    public InterfaceC1366eG A00;
    @Nullable
    public InterfaceC1368eI A01;
    public C1345dv A02;
    public final InterfaceC1357e7 A03;
    @Nullable
    public final InterfaceC1367eH A04;

    public C1360eA(InterfaceC1357e7 interfaceC1357e7, @Nullable InterfaceC1367eH interfaceC1367eH) {
        this.A03 = interfaceC1357e7;
        this.A04 = interfaceC1367eH;
    }

    public static C1360eA A00() {
        return new C1360eA(new GK(), null);
    }

    private void A01(AbstractC1365eF abstractC1365eF, InterfaceC1361eB interfaceC1361eB, GI gi) {
        this.A02 = C1345dv.A00(abstractC1365eF, interfaceC1361eB, gi);
        InterfaceC1366eG interfaceC1366eG = this.A00;
        if (interfaceC1366eG != null) {
            this.A02.A03(interfaceC1366eG);
        }
        InterfaceC1368eI interfaceC1368eI = this.A01;
        if (interfaceC1368eI != null) {
            this.A02.A04(interfaceC1368eI);
        }
    }

    public final void A02(View view) {
        this.A02.A01(view);
    }

    public final void A03(View view, C1363eD c1363eD) {
        this.A02.A02(view, c1363eD);
    }

    public final void A04(AbstractC1365eF abstractC1365eF, View view) {
        GJ gj = new GJ(view, this.A03);
        final InterfaceC1367eH interfaceC1367eH = this.A04;
        A01(abstractC1365eF, gj, new GI(interfaceC1367eH) { // from class: com.facebook.ads.redexgen.X.3g
            public static byte[] A07;
            public static String[] A08 = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
            public static final String A09;
            public long A00;
            @Nullable
            public InterfaceC1366eG A01;
            @Nullable
            public final InterfaceC1367eH A02;
            public final Map<String, C1349dz> A06 = new HashMap();
            public final C1350e0 A04 = new C1350e0();
            public final C1350e0 A03 = new C1350e0();
            public final List<Rect> A05 = new ArrayList(1);

            public static String A02(int i2, int i3, int i4) {
                byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
                for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                    copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 91);
                }
                return new String(copyOfRange);
            }

            public static void A03() {
                A07 = new byte[]{41, 21, 20, 14, 93, 11, 20, 24, 10, 13, 18, 20, 19, 9, 93, 21, 28, 14, 93, 19, 18, 9, 93, 31, 24, 24, 19, 93, 16, 24, 28, 14, 8, 15, 24, 25, 93, 18, 15, 93, 20, 14, 93, 28, 93, 26, 15, 18, 8, 13, 93, 10, 21, 20, 30, 21, 93, 10, 20, 17, 17, 93, 19, 24, 11, 24, 15, 93, 15, 24, 9, 8, 15, 19, 93, 28, 93, 16, 24, 28, 14, 8, 15, 24, 16, 24, 19, 9, 93, 14, 20, 19, 30, 24, 93, 20, 9, 90, 14, 93, 16, 28, 25, 24, 93, 8, 13, 93, 18, 27, 93, 14, 8, 31, 11, 20, 24, 10, 14, 93, 9, 21, 28, 9, 93, 30, 18, 8, 17, 25, 93, 31, 24, 93, 18, 27, 27, 14, 30, 15, 24, 24, 19, 118, 125, 111, 75, 123, 121, 118, 63, 36, 61, 61, 113, 39, 56, 52, 38, 113, 33, 35, 62, 33, 52, 35, 37, 40, 113, 55, 62, 35, 113, 35, 52, 60, 62, 39, 52, 53, 113, 56, 37, 52, 60, 113, 125, 97, 104, 122, 92, 107, 126, 97, 124, 122};
            }

            static {
                A03();
                A09 = C03043g.class.getSimpleName();
            }

            {
                this.A02 = interfaceC1367eH;
            }

            public static Rect A00(@Nullable C1349dz c1349dz) {
                Rect rect;
                Rect rect2;
                Rect rect3;
                Rect rect4;
                Rect rect5;
                if (c1349dz != null) {
                    rect = c1349dz.A02;
                    if (rect.top != Integer.MIN_VALUE) {
                        rect2 = c1349dz.A02;
                        if (rect2.left != Integer.MIN_VALUE) {
                            rect3 = c1349dz.A02;
                            String[] strArr = A08;
                            if (strArr[1].length() == strArr[6].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A08;
                            strArr2[1] = "p";
                            strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                            if (rect3.right != Integer.MIN_VALUE) {
                                rect4 = c1349dz.A02;
                                if (rect4.bottom != Integer.MIN_VALUE) {
                                    rect5 = c1349dz.A02;
                                    return rect5;
                                }
                            }
                        }
                    }
                }
                throw new IllegalStateException(A02(0, 143, 38));
            }

            private C1349dz A01(C1363eD c1363eD, Rect rect, Rect rect2) {
                boolean A06;
                Rect rect3;
                List list;
                C1349dz c1349dz = this.A06.get(c1363eD.A03);
                A06 = this.A04.A06(c1363eD);
                if (A06) {
                    if (c1349dz != null) {
                        c1349dz.A01 = EnumC1353e3.A04;
                    } else {
                        c1349dz = C1349dz.A03(this.A00);
                        this.A06.put(c1363eD.A03, c1349dz);
                    }
                }
                rect3 = c1349dz.A02;
                rect3.set(rect2);
                list = c1349dz.A03;
                list.add(new Rect(rect));
                return c1349dz;
            }

            private void A04(C1350e0 c1350e0) {
                Collection<C1363eD> A01;
                List list;
                A01 = c1350e0.A01();
                for (C1363eD c1363eD : A01) {
                    C1349dz c1349dz = this.A06.get(c1363eD.A03);
                    if (c1349dz == null) {
                        InterfaceC1367eH interfaceC1367eH2 = this.A02;
                        String[] strArr = A08;
                        if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A08;
                        strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                        strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                        if (interfaceC1367eH2 != null) {
                            String str = A02(150, 36, 10) + c1363eD.A03;
                            throw new NullPointerException(A02(186, 10, 85));
                        }
                    } else {
                        c1349dz.A01 = EnumC1353e3.A03;
                        list = c1349dz.A03;
                        list.clear();
                        c1363eD.A03(this);
                    }
                }
            }

            private void A05(C1350e0 c1350e0) {
                Collection<C1363eD> A00;
                A00 = c1350e0.A00();
                for (C1363eD c1363eD : A00) {
                    c1363eD.A03(this);
                }
            }

            @Override // com.facebook.ads.redexgen.X.GI
            public final void A3I(C1363eD c1363eD, Rect rect, Rect rect2) {
                boolean A06;
                List list;
                Rect rect3;
                List list2;
                A01(c1363eD, rect, rect2);
                C1363eD c1363eD2 = c1363eD.A00;
                if (c1363eD2 == C1363eD.A06) {
                    return;
                }
                A06 = this.A03.A06(c1363eD2);
                C1349dz c1349dz = this.A06.get(c1363eD2.A03);
                if (A06) {
                    if (c1349dz == null) {
                        c1349dz = C1349dz.A03(this.A00);
                        rect3 = c1349dz.A02;
                        rect3.set(Level.ALL_INT, Level.ALL_INT, Level.ALL_INT, Level.ALL_INT);
                        this.A06.put(c1363eD2.A03, c1349dz);
                    } else {
                        list2 = c1349dz.A03;
                        list2.clear();
                        c1349dz.A01 = EnumC1353e3.A04;
                    }
                }
                list = c1349dz.A03;
                list.add(new Rect(rect));
            }

            @Override // com.facebook.ads.redexgen.X.GI
            public final void A3p(long j2, List<Rect> list) {
                Collection<C1363eD> A01;
                Collection<C1363eD> A012;
                List list2;
                this.A00 = j2;
                this.A05.clear();
                for (Rect rect : list) {
                    this.A05.add(new Rect(rect));
                }
                A01 = this.A04.A01();
                for (C1363eD c1363eD : A01) {
                    this.A06.remove(c1363eD.A03);
                }
                A012 = this.A03.A01();
                for (C1363eD c1363eD2 : A012) {
                    this.A06.remove(c1363eD2.A03);
                }
                for (C1349dz c1349dz : this.A06.values()) {
                    list2 = c1349dz.A03;
                    list2.clear();
                }
                this.A04.A04();
                this.A03.A04();
            }

            @Override // com.facebook.ads.redexgen.X.GI
            public final void A5D() {
                Collection A00;
                Collection A002;
                A05(this.A04);
                A04(this.A04);
                A05(this.A03);
                A04(this.A03);
                if (this.A01 != null) {
                    String obj = toString();
                    List<Rect> list = this.A05;
                    A00 = this.A04.A00();
                    A002 = this.A03.A00();
                    new C1348dy(obj, this, list, A00, A002);
                    throw new NullPointerException(A02(143, 7, 67));
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1352e2
            public final void A6i(C1363eD c1363eD, Rect rect) {
                List<Rect> list;
                rect.setEmpty();
                list = this.A06.get(c1363eD.A03).A03;
                for (Rect rect2 : list) {
                    rect.union(rect2);
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1352e2
            public final EnumC1353e3 A7n(C1363eD c1363eD) {
                EnumC1353e3 enumC1353e3;
                enumC1353e3 = this.A06.get(c1363eD.A03).A01;
                return enumC1353e3;
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1352e2
            public final void A7p(Rect rect) {
                rect.setEmpty();
                for (Rect rect2 : this.A05) {
                    rect.union(rect2);
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1352e2
            public final float A7q(C1363eD c1363eD) {
                List<Rect> list;
                C1349dz c1349dz = this.A06.get(c1363eD.A03);
                if (c1349dz != null) {
                    Rect A00 = A00(c1349dz);
                    int height = A00.height() * A00.width();
                    int i2 = 0;
                    list = c1349dz.A03;
                    for (Rect rect : list) {
                        int totalPossibleArea = rect.height();
                        int totalVisibleArea = rect.width();
                        i2 += totalPossibleArea * totalVisibleArea;
                    }
                    return i2 / height;
                }
                return 0.0f;
            }

            @Override // com.facebook.ads.redexgen.X.GI
            public final void AEp(@Nullable InterfaceC1366eG interfaceC1366eG) {
                this.A01 = interfaceC1366eG;
            }
        });
    }
}
