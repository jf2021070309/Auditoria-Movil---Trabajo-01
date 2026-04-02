package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* renamed from: com.facebook.ads.redexgen.X.44  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass44 implements Runnable {
    public static Comparator<AnonymousClass43> A04;
    public static byte[] A05;
    public static String[] A06 = {"C", "g", "thIgEQWd9nx", "UJ", "nKFIv9xSQBz", "WKzZJ6F0j2u08DpGCnjDR9E", "2Nt4JwZoKXCf4OpJNcF1oxTto7W5gJbD", "RW"};
    public static final ThreadLocal<AnonymousClass44> A07;
    public long A00;
    public long A01;
    public ArrayList<F6> A02 = new ArrayList<>();
    public ArrayList<AnonymousClass43> A03 = new ArrayList<>();

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{97, 101, 47, 93, 116, -126, -125, 116, 115, 47, 95, -127, 116, 117, 116, -125, 114, 119, 92, 96, 42, 90, 124, 111, 112, 111, 126, 109, 114};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<AnonymousClass43>() { // from class: com.facebook.ads.redexgen.X.42
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00 */
            public final int compare(AnonymousClass43 anonymousClass43, AnonymousClass43 anonymousClass432) {
                if ((anonymousClass43.A03 == null) != (anonymousClass432.A03 == null)) {
                    return anonymousClass43.A03 == null ? 1 : -1;
                } else if (anonymousClass43.A04 != anonymousClass432.A04) {
                    return anonymousClass43.A04 ? -1 : 1;
                } else {
                    int i2 = anonymousClass432.A02 - anonymousClass43.A02;
                    if (i2 != 0) {
                        return i2;
                    }
                    int i3 = anonymousClass43.A00 - anonymousClass432.A00;
                    if (i3 != 0) {
                        return i3;
                    }
                    return 0;
                }
            }
        };
    }

    private AbstractC03344l A00(F6 f6, int i2, long j2) {
        if (A08(f6, i2)) {
            return null;
        }
        C03244b c03244b = f6.A0r;
        try {
            f6.A1L();
            AbstractC03344l A0I = c03244b.A0I(i2, false, j2);
            if (A0I != null) {
                if (A0I.A0a() && !A0I.A0b()) {
                    c03244b.A0X(A0I.A0H);
                } else {
                    c03244b.A0d(A0I, false);
                }
            }
            return A0I;
        } finally {
            f6.A1q(false);
        }
    }

    private void A02() {
        AnonymousClass43 task;
        int i2 = this.A02.size();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            F6 f6 = this.A02.get(i4);
            int totalTaskCount = f6.getWindowVisibility();
            if (totalTaskCount == 0) {
                f6.A02.A04(f6, false);
                int totalTaskCount2 = f6.A02.A00;
                i3 += totalTaskCount2;
            }
        }
        this.A03.ensureCapacity(i3);
        int i5 = 0;
        String[] strArr = A06;
        String str = strArr[3];
        String str2 = strArr[7];
        int length = str.length();
        int totalTaskCount3 = str2.length();
        if (length != totalTaskCount3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[3] = "OH";
        strArr2[7] = "7S";
        for (int i6 = 0; i6 < i2; i6++) {
            F6 f62 = this.A02.get(i6);
            int totalTaskCount4 = f62.getWindowVisibility();
            if (totalTaskCount4 == 0) {
                C1233c1 c1233c1 = f62.A02;
                int abs = Math.abs(c1233c1.A01) + Math.abs(c1233c1.A02);
                for (int i7 = 0; i7 < c1233c1.A00 * 2; i7 += 2) {
                    if (i5 >= this.A03.size()) {
                        task = new AnonymousClass43();
                        this.A03.add(task);
                    } else {
                        task = this.A03.get(i5);
                    }
                    int j2 = i7 + 1;
                    int i8 = c1233c1.A03[j2];
                    task.A04 = i8 <= abs;
                    task.A02 = abs;
                    task.A00 = i8;
                    task.A03 = f62;
                    int j3 = c1233c1.A03[i7];
                    task.A01 = j3;
                    i5++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    private void A04(long j2) {
        for (int i2 = 0; i2 < this.A03.size(); i2++) {
            AnonymousClass43 anonymousClass43 = this.A03.get(i2);
            if (anonymousClass43.A03 == null) {
                return;
            }
            A06(anonymousClass43, j2);
            anonymousClass43.A00();
        }
    }

    private final void A05(long j2) {
        A02();
        A04(j2);
    }

    private void A06(AnonymousClass43 anonymousClass43, long j2) {
        AbstractC03344l A00 = A00(anonymousClass43.A03, anonymousClass43.A01, anonymousClass43.A04 ? Long.MAX_VALUE : j2);
        if (A00 != null && A00.A09 != null && A00.A0a() && !A00.A0b()) {
            A07(A00.A09.get(), j2);
        }
    }

    private void A07(@Nullable F6 f6, long j2) {
        if (f6 == null) {
            return;
        }
        if (f6.A0C) {
            C03153r c03153r = f6.A01;
            if (A06[5].length() != 17) {
                A06[6] = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW";
                if (c03153r.A06() != 0) {
                    f6.A1O();
                }
            }
            throw new RuntimeException();
        }
        C1233c1 c1233c1 = f6.A02;
        c1233c1.A04(f6, true);
        if (c1233c1.A00 != 0) {
            try {
                C2V.A01(A01(0, 18, 7));
                f6.A0s.A05(f6.A04);
                int i2 = 0;
                while (true) {
                    int i3 = c1233c1.A00 * 2;
                    if (A06[6].charAt(8) == 'I') {
                        break;
                    }
                    String[] strArr = A06;
                    strArr[3] = "nG";
                    strArr[7] = "TD";
                    if (i2 < i3) {
                        A00(f6, c1233c1.A03[i2], j2);
                        i2 += 2;
                    } else {
                        return;
                    }
                }
                throw new RuntimeException();
            } finally {
                C2V.A00();
            }
        }
    }

    public static boolean A08(F6 f6, int i2) {
        int A062 = f6.A01.A06();
        for (int i3 = 0; i3 < A062; i3++) {
            View attachedView = f6.A01.A0A(i3);
            AbstractC03344l A0G = F6.A0G(attachedView);
            if (A0G.A03 == i2 && !A0G.A0b()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(F6 f6) {
        this.A02.add(f6);
    }

    public final void A0A(F6 f6) {
        this.A02.remove(f6);
    }

    public final void A0B(F6 f6, int i2, int i3) {
        if (f6.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = f6.getNanoTime();
            f6.post(this);
        }
        f6.A02.A03(i2, i3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C2V.A01(A01(18, 11, 2));
            if (this.A02.isEmpty()) {
                return;
            }
            int size = this.A02.size();
            long j2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                F6 f6 = this.A02.get(i2);
                int i3 = f6.getWindowVisibility();
                if (i3 == 0) {
                    j2 = Math.max(f6.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.A01 = 0L;
                if (A06[5].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "H4nD1dOrFb1";
                C2V.A00();
                return;
            }
            long latestFrameVsyncMs = TimeUnit.MILLISECONDS.toNanos(j2);
            A05(latestFrameVsyncMs + this.A00);
        } finally {
            this.A01 = 0L;
            C2V.A00();
        }
    }
}
