package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import ch.qos.logback.core.net.SyslogConstants;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: com.facebook.ads.redexgen.X.Dh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0535Dh implements X7 {
    public static byte[] A0M;
    public static String[] A0N = {"FdQu0fmyjo2y", "53g7H5tUmq98heWq", "c", "OWB4F6Jbct6Ly4JY", "NHyc4CVBcI41", "VuRuzyUBfoaB1KqcrIY9ro", "m", "Ea4pNsdJDJP"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    @Nullable
    public AM A05;
    public C0471Ag A06;
    public C0472Ah A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final C0534Dg A0E;
    public final C0489Az A0F;
    public final B0 A0G;
    public final HT A0H;
    public final HU A0I;
    public final ArrayDeque<AQ> A0J;
    public final CopyOnWriteArraySet<InterfaceC0475Ak> A0K;
    public final X6[] A0L;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0N[7].length() == 1) {
                throw new RuntimeException();
            }
            A0N[7] = "NVWBbKH";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 75);
            i5++;
        }
    }

    public static void A03() {
        A0M = new byte[]{108, 23, 126, 67, 84, 107, 87, 90, 66, 94, 73, 114, 86, 75, 87, 64, 125, 106, 85, 105, 100, 124, 96, 119, 73, 108, 103, 42, 55, 43, 61, 43, 49, 54, 17, 22, 11, 95, 27, 44, 37, 44, 40, 58, 44, 105, 64, 72, 53, 78, 50, 36, 36, 42, 21, 46, 97, 40, 38, 47, 46, 51, 36, 37, 97, 35, 36, 34, 32, 52, 50, 36, 97, 32, 47, 97, 32, 37, 97, 40, 50, 97, 49, 45, 32, 56, 40, 47, 38};
    }

    static {
        A03();
    }

    @SuppressLint({"HandlerLeak"})
    public C0535Dh(X6[] x6Arr, HT ht, InterfaceC0466Ab interfaceC0466Ab, IM im) {
        Log.i(A02(2, 13, SyslogConstants.LOG_ALERT), A02(33, 5, 52) + Integer.toHexString(System.identityHashCode(this)) + A02(0, 2, 7) + A02(15, 18, 78) + A02(47, 3, 94) + C0676Iy.A04 + A02(46, 1, 86));
        IJ.A04(x6Arr.length > 0);
        this.A0L = (X6[]) IJ.A01(x6Arr);
        this.A0H = (HT) IJ.A01(ht);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0I = new HU(new C0486Av[x6Arr.length], new HQ[x6Arr.length], null);
        this.A0G = new B0();
        this.A0F = new C0489Az();
        this.A07 = C0472Ah.A04;
        this.A0C = new AP(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.A06 = new C0471Ag(B1.A01, 0L, TrackGroupArray.A04, this.A0I);
        this.A0J = new ArrayDeque<>();
        this.A0E = new C0534Dg(x6Arr, ht, this.A0I, interfaceC0466Ab, this.A0A, this.A03, this.A0B, this.A0C, this, im);
        this.A0D = new Handler(this.A0E.A0w());
    }

    private long A00(long j2) {
        long A01 = AG.A01(j2);
        if (!this.A06.A04.A01()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            return A01 + this.A0F.A08();
        }
        return A01;
    }

    private C0471Ag A01(boolean z, boolean z2, int i2) {
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A6H();
            this.A00 = A07();
            this.A04 = A6E();
        }
        C0471Ag c0471Ag = new C0471Ag(z2 ? B1.A01 : this.A06.A03, z2 ? null : this.A06.A07, this.A06.A04, this.A06.A02, this.A06.A01, i2, false, z2 ? TrackGroupArray.A04 : this.A06.A05, z2 ? this.A0I : this.A06.A06);
        String[] strArr = A0N;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A0N[7] = "Xqr2ExcYOBi8j1Q";
        return c0471Ag;
    }

    private void A04(C0471Ag c0471Ag, int i2, boolean z, int timelineChangeReason) {
        int i3;
        C0471Ag c0471Ag2 = c0471Ag;
        this.A02 -= i2;
        if (this.A02 == 0) {
            if (c0471Ag2.A02 == -9223372036854775807L) {
                c0471Ag2 = c0471Ag2.A04(c0471Ag2.A04, 0L, c0471Ag2.A01);
            }
            if (!this.A06.A03.A0E() || this.A08) {
                B1 b1 = c0471Ag2.A03;
                String[] strArr = A0N;
                if (strArr[1].length() == strArr[3].length()) {
                    A0N[7] = "oGDG41JiAsT7PCq0";
                    if (b1.A0E()) {
                        this.A00 = 0;
                        this.A01 = 0;
                        String[] strArr2 = A0N;
                        if (strArr2[6].length() == strArr2[2].length()) {
                            String[] strArr3 = A0N;
                            strArr3[1] = "vrOcQin3pszluGLq";
                            strArr3[3] = "REI4M31lEJcbEC2a";
                            this.A04 = 0L;
                        }
                    }
                }
                throw new RuntimeException();
            }
            if (this.A08) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            boolean z2 = this.A09;
            this.A08 = false;
            this.A09 = false;
            A05(c0471Ag2, z, timelineChangeReason, i3, z2, false);
        }
    }

    private void A05(C0471Ag c0471Ag, boolean z, int i2, int i3, boolean z2, boolean z3) {
        boolean z4 = !this.A0J.isEmpty();
        this.A0J.addLast(new AQ(c0471Ag, this.A06, this.A0K, this.A0H, z, i2, i3, z2, this.A0A, z3));
        this.A06 = c0471Ag;
        if (z4) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A00();
            this.A0J.removeFirst();
        }
    }

    private boolean A06() {
        return this.A06.A03.A0E() || this.A02 > 0;
    }

    public final int A07() {
        if (A06()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A08(int i2) {
        A09(i2, -9223372036854775807L);
    }

    public final void A09(int i2, long j2) {
        long A00;
        B1 b1 = this.A06.A03;
        if (i2 >= 0) {
            boolean A0E = b1.A0E();
            if (A0N[5].length() == 22) {
                String[] strArr = A0N;
                strArr[6] = "k";
                strArr[2] = "F";
                if (A0E || i2 < b1.A01()) {
                    this.A09 = true;
                    this.A02++;
                    boolean A0B = A0B();
                    if (A0N[7].length() != 1) {
                        String[] strArr2 = A0N;
                        strArr2[1] = "iOLxdGxzjtj8VTTv";
                        strArr2[3] = "k2rTYfByBhCiNj1b";
                        if (A0B) {
                            String A02 = A02(2, 13, SyslogConstants.LOG_ALERT);
                            String[] strArr3 = A0N;
                            if (strArr3[4].length() == strArr3[0].length()) {
                                A0N[7] = "fs0FIhTd6T569fWM98lB5KOUS";
                                Log.w(A02, A02(50, 39, 10));
                                this.A0C.obtainMessage(0, 1, -1, this.A06).sendToTarget();
                                return;
                            }
                        } else {
                            this.A01 = i2;
                            if (b1.A0E()) {
                                int i3 = (j2 > (-9223372036854775807L) ? 1 : (j2 == (-9223372036854775807L) ? 0 : -1));
                                if (A0N[7].length() == 1) {
                                    throw new RuntimeException();
                                }
                                A0N[5] = "dOqGbPzaS7jKfyvdUFqkQf";
                                this.A04 = i3 == 0 ? 0L : j2;
                                this.A00 = 0;
                            } else {
                                if (j2 == -9223372036854775807L) {
                                    A00 = b1.A0B(i2, this.A0G).A01();
                                } else {
                                    A00 = AG.A00(j2);
                                }
                                Pair<Integer, Long> A07 = b1.A07(this.A0G, this.A0F, i2, A00);
                                this.A04 = AG.A01(A00);
                                this.A00 = ((Integer) A07.first).intValue();
                            }
                            this.A0E.A0y(b1, i2, AG.A00(j2));
                            Iterator<InterfaceC0475Ak> it = this.A0K.iterator();
                            while (it.hasNext()) {
                                InterfaceC0475Ak next = it.next();
                                String[] strArr4 = A0N;
                                if (strArr4[4].length() != strArr4[0].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr5 = A0N;
                                strArr5[1] = "l5NWk5x9vooO50uu";
                                strArr5[3] = "FcAzQ8glamB386Jq";
                                next.ABr(1);
                            }
                            return;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        throw new C0465Aa(b1, i2, j2);
    }

    public final void A0A(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            A04((C0471Ag) message.obj, message.arg1, message.arg2 != -1, message.arg2);
            return;
        }
        if (i2 != 1) {
            String[] strArr = A0N;
            if (strArr[4].length() == strArr[0].length()) {
                A0N[5] = "7KT5lT3IIkvardi0cOE285";
                if (i2 == 2) {
                    AM am = (AM) message.obj;
                    this.A05 = am;
                    Iterator<InterfaceC0475Ak> it = this.A0K.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        String[] strArr2 = A0N;
                        if (strArr2[4].length() != strArr2[0].length()) {
                            throw new RuntimeException();
                        }
                        A0N[7] = "lr70Wm3MPuK1";
                        if (hasNext) {
                            it.next().ABn(am);
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } else {
            C0472Ah c0472Ah = (C0472Ah) message.obj;
            if (!this.A07.equals(c0472Ah)) {
                this.A07 = c0472Ah;
                CopyOnWriteArraySet<InterfaceC0475Ak> copyOnWriteArraySet = this.A0K;
                String[] strArr3 = A0N;
                if (strArr3[6].length() == strArr3[2].length()) {
                    String[] strArr4 = A0N;
                    strArr4[1] = "XPkhdR3hZ8JGZkbg";
                    strArr4[3] = "HitM1md97HqEAHyx";
                    Iterator<InterfaceC0475Ak> it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        it2.next().ABl(c0472Ah);
                    }
                    return;
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public final boolean A0B() {
        return !A06() && this.A06.A04.A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final void A3D(InterfaceC0475Ak interfaceC0475Ak) {
        this.A0K.add(interfaceC0475Ak);
    }

    @Override // com.facebook.ads.redexgen.X.X7
    public final C0483As A4K(InterfaceC0482Ar interfaceC0482Ar) {
        return new C0483As(this.A0E, interfaceC0482Ar, this.A06.A03, A6H(), this.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final int A5q() {
        long A5r = A5r();
        long A6Q = A6Q();
        if (A5r != -9223372036854775807L) {
            int i2 = (A6Q > (-9223372036854775807L) ? 1 : (A6Q == (-9223372036854775807L) ? 0 : -1));
            String[] strArr = A0N;
            if (strArr[6].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0N;
            strArr2[6] = "7";
            strArr2[2] = GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION;
            if (i2 != 0) {
                String[] strArr3 = A0N;
                if (strArr3[4].length() != strArr3[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0N;
                strArr4[6] = "w";
                strArr4[2] = "D";
                if (A6Q == 0) {
                    return 100;
                }
                return C0676Iy.A06((int) ((100 * A5r) / A6Q), 0, 100);
            }
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final long A5r() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final long A69() {
        if (A0B()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            return this.A0F.A08() + AG.A01(this.A06.A01);
        }
        return A6E();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final int A6B() {
        if (A0B()) {
            return this.A06.A04.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final int A6C() {
        if (A0B()) {
            return this.A06.A04.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final long A6E() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final B1 A6G() {
        return this.A06.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final int A6H() {
        if (A06()) {
            return this.A01;
        }
        return this.A06.A03.A09(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final long A6Q() {
        B1 b1 = this.A06.A03;
        if (b1.A0E()) {
            return -9223372036854775807L;
        }
        if (A0B()) {
            FY fy = this.A06.A04;
            b1.A09(fy.A02, this.A0F);
            return AG.A01(this.A0F.A0A(fy.A00, fy.A01));
        }
        return b1.A0B(A6H(), this.A0G).A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final boolean A7C() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.X7
    public final void ADE(InterfaceC0576Fa interfaceC0576Fa, boolean z, boolean z2) {
        this.A05 = null;
        C0471Ag A01 = A01(z, z2, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A0z(interfaceC0576Fa, z, z2);
        A05(A01, false, 4, 1, false, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final void ADj() {
        StringBuilder sb = new StringBuilder();
        sb.append(A02(38, 8, 2));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(A02(0, 2, 7));
        sb.append(A02(15, 18, 78));
        String A02 = A02(47, 3, 94);
        sb.append(A02);
        sb.append(C0676Iy.A04);
        sb.append(A02);
        sb.append(AW.A00());
        sb.append(A02(46, 1, 86));
        Log.i(A02(2, 13, SyslogConstants.LOG_ALERT), sb.toString());
        this.A0E.A0x();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final void AES(long j2) {
        A09(A6H(), j2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final void AET() {
        A08(A6H());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final void AEj(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            this.A0E.A10(z);
            A05(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Ap
    public final void AF9(boolean z) {
        if (z) {
            this.A05 = null;
        }
        C0471Ag A01 = A01(z, z, 1);
        this.A02++;
        this.A0E.A11(z);
        A05(A01, false, 4, 1, false, false);
    }
}
