package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import ch.qos.logback.core.net.SyslogConstants;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* loaded from: assets/audience_network.dex */
public final class WK implements InterfaceC0517Cc {
    public static byte[] A0X;
    public static String[] A0Y = {"bw2Pz5UYSLOOesGIJaWlA3GOzVLZPAg", "gG3", "yjdYoV9UEi8qMqqcqGKRK6SXbov0CwAj", "4kzePG", "OMn6r0AgRGwk9BJzU", "o", "aMFqcwP4FMZJ2yTkvuTBoGT2vGZy4ax", "h66GloOgbywQ1e6PB204dGM9vAJrPucq"};
    public static final InterfaceC0519Cf A0Z;
    public static final int A0a;
    public static final Format A0b;
    public static final byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Ce A0C;
    public DF A0D;
    public C0660Ii A0E;
    public boolean A0F;
    public boolean A0G;
    public InterfaceC0525Co[] A0H;
    public InterfaceC0525Co[] A0I;
    public final int A0J;
    public final SparseArray<DF> A0K;
    @Nullable
    public final DrmInitData A0L;
    @Nullable
    public final InterfaceC0525Co A0M;
    @Nullable
    public final DO A0N;
    public final C0660Ii A0O;
    public final C0660Ii A0P;
    public final C0660Ii A0Q;
    public final C0660Ii A0R;
    @Nullable
    public final C0672Iu A0S;
    public final ArrayDeque<WQ> A0T;
    public final ArrayDeque<DE> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C1017Wl> A04(C0660Ii c0660Ii, long j2) throws C0470Af {
        long A0N;
        long A0N2;
        c0660Ii.A0Y(8);
        int A01 = D3.A01(c0660Ii.A08());
        c0660Ii.A0Z(4);
        long A0M = c0660Ii.A0M();
        if (A01 == 0) {
            A0N = c0660Ii.A0M();
            A0N2 = j2 + c0660Ii.A0M();
        } else {
            A0N = c0660Ii.A0N();
            A0N2 = j2 + c0660Ii.A0N();
        }
        long A0F = C0676Iy.A0F(A0N, 1000000L, A0M);
        c0660Ii.A0Z(2);
        int A0I = c0660Ii.A0I();
        int[] iArr = new int[A0I];
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        long[] jArr3 = new long[A0I];
        if (A0Y[2].charAt(18) != 'K') {
            throw new RuntimeException();
        }
        A0Y[5] = "s";
        int i2 = 0;
        long j3 = A0F;
        while (i2 < A0I) {
            int A08 = c0660Ii.A08();
            if ((Integer.MIN_VALUE & A08) != 0) {
                throw new C0470Af(A0A(581, 28, 75));
            }
            long A0M2 = c0660Ii.A0M();
            iArr[i2] = Integer.MAX_VALUE & A08;
            jArr[i2] = A0N2;
            jArr3[i2] = j3;
            A0N += A0M2;
            j3 = C0676Iy.A0F(A0N, 1000000L, A0M);
            jArr2[i2] = j3 - jArr3[i2];
            c0660Ii.A0Z(4);
            int i3 = iArr[i2];
            if (A0Y[3].length() != 6) {
                A0Y[1] = "dhc";
                A0N2 += i3;
                i2 += 0;
            } else {
                A0Y[5] = "h";
                A0N2 += i3;
                i2++;
            }
        }
        return Pair.create(Long.valueOf(A0F), new C1017Wl(iArr, jArr, jArr2, jArr3));
    }

    public static String A0A(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0X, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 85);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{76, 64, 11, 62, 37, 39, 106, 57, 35, 48, 47, 106, 38, 47, 57, 57, 106, 62, 34, 43, 36, 106, 34, 47, 43, 46, 47, 56, 106, 38, 47, 36, 45, 62, 34, 106, 98, 63, 36, 57, 63, 58, 58, 37, 56, 62, 47, 46, 99, 100, 104, 67, 89, 95, 84, 13, 78, 66, 88, 67, 89, 13, 68, 67, 13, 94, 79, 74, 93, 13, 12, 16, 13, 28, 13, 5, 88, 67, 94, 88, 93, 93, 66, 95, 89, 72, 73, 4, 3, 5, 46, 52, 50, 57, 96, 35, 47, 53, 46, 52, 96, 41, 46, 96, 51, 39, 48, 36, 96, 97, 125, 96, 113, 96, 104, 53, 46, 51, 53, 48, 48, 47, 50, 52, 37, 36, 105, 110, 29, 41, 58, 60, 54, 62, 53, 47, 62, 63, 22, 43, 111, 30, 35, 47, 41, 58, 56, 47, 52, 41, 4, 42, 35, 34, 63, 36, 35, 42, 109, 35, 40, 42, 44, 57, 36, 59, 40, 109, 34, 43, 43, 62, 40, 57, 109, 57, 34, 109, 62, 44, 32, 61, 33, 40, 109, 41, 44, 57, 44, 99, 110, 71, 67, 68, 2, 67, 86, 77, 79, 2, 70, 71, 68, 75, 76, 71, 81, 2, 71, 90, 86, 71, 76, 70, 71, 70, 2, 67, 86, 77, 79, 2, 81, 75, 88, 71, 2, 10, 87, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, 11, 12, 38, 15, 11, 12, 74, 11, 30, 5, 7, 74, 29, 3, 30, 2, 74, 6, 15, 4, 13, 30, 2, 74, 84, 74, 88, 91, 94, 93, 94, 82, 89, 92, 94, 93, 74, 66, 31, 4, 25, 31, 26, 26, 5, 24, 30, 15, 14, 67, 68, 97, 72, 67, 74, 89, 69, 13, 64, 68, 94, 64, 76, 89, 78, 69, 23, 13, 88, 113, 113, 100, 114, 99, 55, 99, 120, 55, 114, 121, 116, 101, 110, 103, 99, 126, 120, 121, 55, 115, 118, 99, 118, 55, 96, 118, 100, 55, 121, 114, 112, 118, 99, 126, 97, 114, 57, 22, 63, 63, 42, 60, 45, 121, 45, 54, 121, 60, 55, 61, 121, 54, 63, 121, 52, 61, 56, 45, 121, 46, 56, 42, 121, 55, 60, 62, 56, 45, 48, 47, 60, 119, 84, 109, 126, 105, 105, 114, Byte.MAX_VALUE, 114, 117, 124, 59, 79, 105, 122, 120, 112, 94, 117, 120, 105, 98, 107, 111, 114, 116, 117, 89, 116, 99, 59, 107, 122, 105, 122, 118, 126, 111, 126, 105, 104, 59, 114, 104, 59, 110, 117, 104, 110, 107, 107, 116, 105, 111, 126, Byte.MAX_VALUE, 53, 107, 83, 81, 72, 72, 93, 92, 24, 72, 75, 75, 80, 24, 89, 76, 87, 85, 24, 16, 94, 89, 81, 84, 93, 92, 24, 76, 87, 24, 93, 64, 76, 74, 89, 91, 76, 24, 77, 77, 81, 92, 17, 105, 81, 83, 74, 74, 83, 84, 93, 26, 91, 78, 85, 87, 26, 77, 83, 78, 82, 26, 86, 95, 84, 93, 78, 82, 26, 4, 26, 8, 11, 14, 13, 14, 2, 9, 12, 14, 13, 26, 18, 79, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, 19, 20, 11, 48, 59, 38, 46, 59, 61, 42, 59, 58, 126, 51, 49, 49, 40, 126, 60, 49, 38, 112, 95, 100, 111, 114, 122, 111, 105, 126, 111, 110, 42, 121, 107, 99, 101, 42, 111, 100, 126, 120, 115, 42, 105, 101, Byte.MAX_VALUE, 100, 126, 48, 42, 75, 112, 118, Byte.MAX_VALUE, 112, 122, 114, 123, 122, 62, 119, 112, 122, 119, 108, 123, 125, 106, 62, 108, 123, 120, 123, 108, 123, 112, 125, 123, 41, 30, 13, 22, 30, 29, 19, 26, 95, 19, 26, 17, 24, 11, 23, 95, 27, 26, 12, 28, 13, 22, 15, 11, 22, 16, 17, 95, 22, 17, 95, 12, 24, 15, 27, 95, 25, 16, 10, 17, 27, 95, 87, 10, 17, 12, 10, 15, 15, 16, 13, 11, 26, 27, 86, 3, 18, 18, 14, 11, 1, 3, 22, 11, 13, 12, 77, 26, 79, 7, 15, 17, 5, 62, 40, 36, 42, 46, 49, 60, 61, 55, 119, 48, 61, 46, 59, 61, 34, 47, 46, 36, 100, 38, 59, Byte.MAX_VALUE};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0M(WQ wq, SparseArray<DF> sparseArray, int i2, byte[] bArr) throws C0470Af {
        DF A09 = A09(wq.A07(D3.A1I).A00, sparseArray);
        if (A09 == null) {
            return;
        }
        DQ dq = A09.A07;
        long j2 = dq.A06;
        A09.A04();
        if (wq.A07(D3.A1H) != null && (i2 & 2) == 0) {
            j2 = A02(wq.A07(D3.A1H).A00);
        }
        A0N(wq, A09, j2, i2);
        DP A00 = A09.A05.A00(dq.A07.A02);
        WP A07 = wq.A07(D3.A0u);
        if (A07 != null) {
            A0P(A00, A07.A00, dq);
        }
        WP A072 = wq.A07(D3.A0t);
        if (A072 != null) {
            A0S(A072.A00, dq);
        }
        WP A073 = wq.A07(D3.A10);
        if (A073 != null) {
            A0T(A073.A00, dq);
        }
        WP A074 = wq.A07(D3.A0x);
        WP A075 = wq.A07(D3.A11);
        if (A074 != null && A075 != null) {
            A0V(A074.A00, A075.A00, A00 != null ? A00.A02 : null, dq);
        }
        int size = wq.A02.size();
        for (int i3 = 0; i3 < size; i3++) {
            WP wp = wq.A02.get(i3);
            int i4 = ((D3) wp).A00;
            int i5 = D3.A1Q;
            if (A0Y[7].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[6] = "tWuQt3qCpORkhzaHtCNFkUwj420xxTd";
            strArr[4] = "yKRRCTery0iDoE3P4";
            if (i4 == i5) {
                A0U(wp.A00, dq, bArr);
            }
        }
    }

    static {
        A0D();
        A0Z = new WL();
        A0a = C0676Iy.A08(A0A(682, 4, 24));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, 55), Long.MAX_VALUE);
    }

    public WK() {
        this(0);
    }

    public WK(int i2) {
        this(i2, null);
    }

    public WK(int i2, @Nullable C0672Iu c0672Iu) {
        this(i2, c0672Iu, null, null);
    }

    public WK(int i2, @Nullable C0672Iu c0672Iu, @Nullable DO r9, @Nullable DrmInitData drmInitData) {
        this(i2, c0672Iu, r9, drmInitData, Collections.emptyList());
    }

    public WK(int i2, @Nullable C0672Iu c0672Iu, @Nullable DO r10, @Nullable DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i2, c0672Iu, r10, drmInitData, closedCaptionFormats, null);
    }

    public WK(int i2, @Nullable C0672Iu c0672Iu, @Nullable DO r6, @Nullable DrmInitData drmInitData, List<Format> list, @Nullable InterfaceC0525Co interfaceC0525Co) {
        this.A0J = (r6 != null ? 8 : 0) | i2;
        this.A0S = c0672Iu;
        this.A0N = r6;
        this.A0L = drmInitData;
        List<Format> closedCaptionFormats = Collections.unmodifiableList(list);
        this.A0V = closedCaptionFormats;
        this.A0M = interfaceC0525Co;
        this.A0O = new C0660Ii(16);
        this.A0R = new C0660Ii(C0656Ie.A03);
        this.A0Q = new C0660Ii(5);
        this.A0P = new C0660Ii();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        A0B();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
        if (r10 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0110, code lost:
        if (r10 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0113, code lost:
        r22 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(com.facebook.ads.redexgen.X.DF r28, int r29, long r30, int r32, com.facebook.ads.redexgen.X.C0660Ii r33, int r34) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WK.A00(com.facebook.ads.redexgen.X.DF, int, long, int, com.facebook.ads.redexgen.X.Ii, int):int");
    }

    public static long A01(C0660Ii c0660Ii) {
        c0660Ii.A0Y(8);
        int version = D3.A01(c0660Ii.A08());
        return version == 0 ? c0660Ii.A0M() : c0660Ii.A0N();
    }

    public static long A02(C0660Ii c0660Ii) {
        c0660Ii.A0Y(8);
        return D3.A01(c0660Ii.A08()) == 1 ? c0660Ii.A0N() : c0660Ii.A0M();
    }

    public static Pair<Integer, D9> A03(C0660Ii c0660Ii) {
        c0660Ii.A0Y(12);
        int defaultSampleDuration = c0660Ii.A08();
        int defaultSampleFlags = c0660Ii.A0H() - 1;
        return Pair.create(Integer.valueOf(defaultSampleDuration), new D9(defaultSampleFlags, c0660Ii.A0H(), c0660Ii.A0H(), c0660Ii.A08()));
    }

    public static DrmInitData A05(List<WP> list) {
        ArrayList arrayList = null;
        int i2 = list.size();
        for (int i3 = 0; i3 < i2; i3++) {
            WP wp = list.get(i3);
            if (((D3) wp).A00 == D3.A0r) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = wp.A00.A00;
                UUID A03 = DL.A03(bArr);
                if (A03 == null) {
                    Log.w(A0A(128, 22, 14), A0A(437, 42, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A03, A0A(696, 9, 30), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private D9 A06(SparseArray<D9> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            if (A0Y[7].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            A0Y[3] = "nw8rk4";
            return sparseArray.valueAt(0);
        }
        return (D9) IJ.A01(sparseArray.get(i2));
    }

    public static DF A07(SparseArray<DF> sparseArray) {
        DF df = null;
        long j2 = Long.MAX_VALUE;
        int i2 = sparseArray.size();
        for (int i3 = 0; i3 < i2; i3++) {
            DF valueAt = sparseArray.valueAt(i3);
            if (valueAt.A02 != valueAt.A07.A02) {
                long j3 = valueAt.A07.A0G[valueAt.A02];
                if (j3 < j2) {
                    df = valueAt;
                    j2 = j3;
                }
            }
        }
        return df;
    }

    @Nullable
    public static DF A08(SparseArray<DF> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        DF df = sparseArray.get(i2);
        if (A0Y[0].length() != 21) {
            A0Y[1] = "fYJ";
            return df;
        }
        throw new RuntimeException();
    }

    public static DF A09(C0660Ii c0660Ii, SparseArray<DF> sparseArray) {
        int i2;
        int i3;
        int i4;
        int i5;
        c0660Ii.A0Y(8);
        int A00 = D3.A00(c0660Ii.A08());
        int trackId = c0660Ii.A08();
        DF A08 = A08(sparseArray, trackId);
        if (A08 == null) {
            return null;
        }
        if ((A00 & 1) != 0) {
            long A0N = c0660Ii.A0N();
            A08.A07.A05 = A0N;
            A08.A07.A04 = A0N;
        }
        D9 d9 = A08.A04;
        if ((A00 & 2) != 0) {
            i2 = c0660Ii.A0H() - 1;
        } else {
            i2 = d9.A02;
        }
        int defaultSampleDescriptionIndex = A00 & 8;
        if (defaultSampleDescriptionIndex != 0) {
            i3 = c0660Ii.A0H();
        } else {
            i3 = d9.A00;
        }
        int defaultSampleDescriptionIndex2 = A00 & 16;
        if (defaultSampleDescriptionIndex2 != 0) {
            i4 = c0660Ii.A0H();
        } else {
            i4 = d9.A03;
        }
        int defaultSampleSize = A00 & 32;
        if (defaultSampleSize != 0) {
            i5 = c0660Ii.A0H();
        } else {
            i5 = d9.A01;
        }
        A08.A07.A07 = new D9(i2, i3, i4, i5);
        return A08;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0C() {
        if (this.A0I == null) {
            this.A0I = new InterfaceC0525Co[2];
            int i2 = 0;
            InterfaceC0525Co interfaceC0525Co = this.A0M;
            if (interfaceC0525Co != null) {
                int emsgTrackOutputCount = 0 + 1;
                this.A0I[0] = interfaceC0525Co;
                i2 = emsgTrackOutputCount;
            }
            int emsgTrackOutputCount2 = this.A0J;
            if ((emsgTrackOutputCount2 & 4) != 0) {
                InterfaceC0525Co[] interfaceC0525CoArr = this.A0I;
                Ce ce = this.A0C;
                int emsgTrackOutputCount3 = this.A0K.size();
                interfaceC0525CoArr[i2] = ce.AFI(emsgTrackOutputCount3, 4);
                i2++;
            }
            this.A0I = (InterfaceC0525Co[]) Arrays.copyOf(this.A0I, i2);
            for (InterfaceC0525Co interfaceC0525Co2 : this.A0I) {
                interfaceC0525Co2.A5U(A0b);
            }
        }
        if (this.A0H == null) {
            this.A0H = new InterfaceC0525Co[this.A0V.size()];
            for (int i3 = 0; i3 < this.A0H.length; i3++) {
                InterfaceC0525Co AFI = this.A0C.AFI(this.A0K.size() + 1 + i3, 3);
                AFI.A5U(this.A0V.get(i3));
                this.A0H[i3] = AFI;
                String[] strArr = A0Y;
                if (strArr[6].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                A0Y[7] = "E0z9VN5IoStoNoHPwfepvpkncforV8p8";
            }
        }
    }

    private void A0E(long j2) {
        while (!this.A0U.isEmpty()) {
            DE removeFirst = this.A0U.removeFirst();
            this.A03 -= removeFirst.A00;
            long j3 = j2 + removeFirst.A01;
            C0672Iu c0672Iu = this.A0S;
            if (c0672Iu != null) {
                j3 = c0672Iu.A06(j3);
            }
            for (InterfaceC0525Co interfaceC0525Co : this.A0I) {
                interfaceC0525Co.AEM(j3, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j2) throws C0470Af {
        while (!this.A0T.isEmpty() && this.A0T.peek().A00 == j2) {
            A0I(this.A0T.pop());
        }
        A0B();
    }

    private void A0G(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        int i2 = ((int) this.A07) - this.A00;
        C0660Ii c0660Ii = this.A0E;
        if (c0660Ii != null) {
            interfaceC0518Cd.readFully(c0660Ii.A00, 8, i2);
            A0O(new WP(this.A01, this.A0E), interfaceC0518Cd.A7E());
        } else {
            interfaceC0518Cd.AEy(i2);
        }
        A0F(interfaceC0518Cd.A7E());
    }

    private void A0H(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        DF df = null;
        long j2 = Long.MAX_VALUE;
        int size = this.A0K.size();
        for (int i2 = 0; i2 < size; i2++) {
            DQ dq = this.A0K.valueAt(i2).A07;
            if (dq.A0B) {
                int i3 = (dq.A04 > j2 ? 1 : (dq.A04 == j2 ? 0 : -1));
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                A0Y[3] = "TcDom5";
                if (i3 < 0) {
                    j2 = dq.A04;
                    df = this.A0K.valueAt(i2);
                }
            }
        }
        if (df == null) {
            if (A0Y[3].length() != 6) {
                throw new RuntimeException();
            }
            A0Y[2] = "BU1FqSGZUKIp3lmSYzKBGxc2Z86jKcpe";
            this.A02 = 3;
            return;
        }
        long A7E = j2 - interfaceC0518Cd.A7E();
        if (A0Y[3].length() != 6) {
            throw new RuntimeException();
        }
        A0Y[0] = "Cvsa72edMITB5GhT";
        int bytesToSkip = (int) A7E;
        if (bytesToSkip >= 0) {
            interfaceC0518Cd.AEy(bytesToSkip);
            df.A07.A04(interfaceC0518Cd);
            return;
        }
        throw new C0470Af(A0A(307, 39, 66));
    }

    private void A0I(WQ wq) throws C0470Af {
        if (((D3) wq).A00 == D3.A0j) {
            A0K(wq);
        } else if (((D3) wq).A00 == D3.A0i) {
            A0J(wq);
        } else if (this.A0T.isEmpty()) {
        } else {
            ArrayDeque<WQ> arrayDeque = this.A0T;
            if (A0Y[1].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "6RjYlEZz613sKxZIpZ2APlvoVeArWnyB";
            arrayDeque.peek().A08(wq);
        }
    }

    private void A0J(WQ wq) throws C0470Af {
        A0L(wq, this.A0K, this.A0J, this.A0W);
        DrmInitData A05 = this.A0L != null ? null : A05(wq.A02);
        if (A05 != null) {
            int i2 = this.A0K.size();
            for (int i3 = 0; i3 < i2; i3++) {
                this.A0K.valueAt(i3).A06(A05);
            }
        }
        if (this.A0A != -9223372036854775807L) {
            int size = this.A0K.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.A0K.valueAt(i4).A05(this.A0A);
            }
            this.A0A = -9223372036854775807L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0K(WQ wq) throws C0470Af {
        IJ.A06(this.A0N == null, A0A(532, 20, 11));
        DrmInitData drmInitData = this.A0L;
        if (drmInitData == null) {
            drmInitData = A05(wq.A02);
        }
        WQ A06 = wq.A06(D3.A0m);
        SparseArray sparseArray = new SparseArray();
        long j2 = -9223372036854775807L;
        int size = A06.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            WP wp = A06.A02.get(i2);
            int i3 = ((D3) wp).A00;
            if (i3 == D3.A1M) {
                Pair<Integer, D9> A03 = A03(wp.A00);
                int i4 = ((Integer) A03.first).intValue();
                sparseArray.put(i4, A03.second);
            } else {
                int i5 = ((D3) wp).A00;
                if (i5 == D3.A0f) {
                    j2 = A01(wp.A00);
                }
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = wq.A01.size();
        for (int i6 = 0; i6 < size2; i6++) {
            WQ wq2 = wq.A01.get(i6);
            int i7 = ((D3) wq2).A00;
            if (i7 == D3.A1L) {
                DO A0C = D8.A0C(wq2, wq.A07(D3.A0n), j2, drmInitData, (this.A0J & 16) != 0, false);
                if (A0C != null) {
                    int i8 = A0C.A00;
                    sparseArray2.put(i8, A0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() == 0) {
            for (int i9 = 0; i9 < size3; i9++) {
                DO r10 = (DO) sparseArray2.valueAt(i9);
                Ce ce = this.A0C;
                int i10 = r10.A03;
                DF df = new DF(ce.AFI(i9, i10));
                int i11 = r10.A00;
                df.A07(r10, A06(sparseArray, i11));
                SparseArray<DF> sparseArray3 = this.A0K;
                int i12 = r10.A00;
                sparseArray3.put(i12, df);
                this.A08 = Math.max(this.A08, r10.A04);
            }
            A0C();
            if (A0Y[5].length() != 1) {
                throw new RuntimeException();
            }
            A0Y[5] = "d";
            this.A0C.A5C();
            return;
        }
        IJ.A04(this.A0K.size() == size3);
        for (int i13 = 0; i13 < size3; i13++) {
            DO r2 = (DO) sparseArray2.valueAt(i13);
            this.A0K.get(r2.A00).A07(r2, A06(sparseArray, r2.A00));
        }
    }

    public static void A0L(WQ wq, SparseArray<DF> sparseArray, int i2, byte[] bArr) throws C0470Af {
        int size = wq.A01.size();
        for (int i3 = 0; i3 < size; i3++) {
            WQ wq2 = wq.A01.get(i3);
            if (((D3) wq2).A00 == D3.A1K) {
                A0M(wq2, sparseArray, i2, bArr);
            }
        }
    }

    public static void A0N(WQ wq, DF df, long j2, int i2) {
        int totalSampleCount = 0;
        int trunSampleCount = 0;
        List<WP> list = wq.A02;
        int leafChildrenSize = list.size();
        for (int totalSampleCount2 = 0; totalSampleCount2 < leafChildrenSize; totalSampleCount2++) {
            WP wp = list.get(totalSampleCount2);
            int i3 = ((D3) wp).A00;
            int i4 = D3.A1N;
            if (A0Y[2].charAt(18) != 'K') {
                throw new RuntimeException();
            }
            A0Y[0] = "HX3CrwnoNkNpp8Diq6RFqVXtJKh";
            if (i3 == i4) {
                C0660Ii c0660Ii = wp.A00;
                c0660Ii.A0Y(12);
                int A0H = c0660Ii.A0H();
                if (A0H > 0) {
                    trunSampleCount += A0H;
                    totalSampleCount++;
                }
            }
        }
        df.A02 = 0;
        df.A00 = 0;
        df.A01 = 0;
        df.A07.A03(totalSampleCount, trunSampleCount);
        int i5 = 0;
        int i6 = 0;
        if (A0Y[7].charAt(27) == 'r') {
            A0Y[1] = "K2a";
        }
        for (int i7 = 0; i7 < leafChildrenSize; i7++) {
            WP wp2 = list.get(i7);
            if (((D3) wp2).A00 == D3.A1N) {
                i6 = A00(df, i5, j2, i2, wp2.A00, i6);
                i5++;
            }
        }
    }

    private void A0O(WP wp, long j2) throws C0470Af {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(wp);
        } else if (((D3) wp).A00 == D3.A12) {
            Pair<Long, C1017Wl> A04 = A04(wp.A00, j2);
            this.A0B = ((Long) A04.first).longValue();
            this.A0C.AER((InterfaceC0522Cl) A04.second);
            this.A0F = true;
        } else if (((D3) wp).A00 != D3.A0P) {
        } else {
            A0Q(wp.A00);
        }
    }

    public static void A0P(DP dp, C0660Ii c0660Ii, DQ dq) throws C0470Af {
        int flags = dp.A00;
        c0660Ii.A0Y(8);
        if ((D3.A00(c0660Ii.A08()) & 1) == 1) {
            c0660Ii.A0Z(8);
        }
        int vectorSize = c0660Ii.A0E();
        int A0H = c0660Ii.A0H();
        String[] strArr = A0Y;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[3] = "qY4fk5";
        if (A0H == dq.A00) {
            int i2 = 0;
            if (vectorSize == 0) {
                boolean[] zArr = dq.A0H;
                for (int sampleCount = 0; sampleCount < A0H; sampleCount++) {
                    int totalSize = c0660Ii.A0E();
                    i2 += totalSize;
                    zArr[sampleCount] = totalSize > flags;
                }
            } else {
                boolean z = vectorSize > flags;
                int i3 = vectorSize * A0H;
                i2 = 0 + i3;
                Arrays.fill(dq.A0H, 0, A0H, z);
            }
            dq.A02(i2);
            return;
        }
        throw new C0470Af(A0A(290, 17, SyslogConstants.LOG_CLOCK) + A0H + A0A(0, 2, 53) + dq.A00);
    }

    private void A0Q(C0660Ii c0660Ii) {
        InterfaceC0525Co[] interfaceC0525CoArr;
        InterfaceC0525Co[] interfaceC0525CoArr2 = this.A0I;
        if (interfaceC0525CoArr2 == null || interfaceC0525CoArr2.length == 0) {
            return;
        }
        c0660Ii.A0Y(12);
        int A04 = c0660Ii.A04();
        c0660Ii.A0Q();
        c0660Ii.A0Q();
        long A0M = c0660Ii.A0M();
        long timescale = c0660Ii.A0M();
        long A0F = C0676Iy.A0F(timescale, 1000000L, A0M);
        for (InterfaceC0525Co interfaceC0525Co : this.A0I) {
            c0660Ii.A0Y(12);
            interfaceC0525Co.AEL(c0660Ii, A04);
        }
        long j2 = this.A0B;
        if (j2 != -9223372036854775807L) {
            long j3 = j2 + A0F;
            C0672Iu c0672Iu = this.A0S;
            if (c0672Iu != null) {
                j3 = c0672Iu.A06(j3);
            }
            for (InterfaceC0525Co interfaceC0525Co2 : this.A0I) {
                interfaceC0525Co2.AEM(j3, 1, A04, 0, null);
            }
            return;
        }
        this.A0U.addLast(new DE(A0F, A04));
        this.A03 += A04;
    }

    public static void A0R(C0660Ii c0660Ii, int i2, DQ dq) throws C0470Af {
        c0660Ii.A0Y(i2 + 8);
        int A00 = D3.A00(c0660Ii.A08());
        if ((A00 & 1) == 0) {
            boolean z = (A00 & 2) != 0;
            int A0H = c0660Ii.A0H();
            int i3 = dq.A00;
            if (A0Y[2].charAt(18) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[6] = "UNCiZzJs5PDRpvixsYfSSk1mhxuZgiq";
            strArr[4] = "wrSUtL8XPGusZqeHm";
            if (A0H == i3) {
                Arrays.fill(dq.A0H, 0, A0H, z);
                int sampleCount = c0660Ii.A04();
                dq.A02(sampleCount);
                dq.A05(c0660Ii);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(A0A(290, 17, SyslogConstants.LOG_CLOCK));
            sb.append(A0H);
            sb.append(A0A(0, 2, 53));
            int sampleCount2 = dq.A00;
            sb.append(sampleCount2);
            throw new C0470Af(sb.toString());
        }
        throw new C0470Af(A0A(381, 56, 78));
    }

    public static void A0S(C0660Ii c0660Ii, DQ dq) throws C0470Af {
        c0660Ii.A0Y(8);
        int A08 = c0660Ii.A08();
        if ((D3.A00(A08) & 1) == 1) {
            c0660Ii.A0Z(8);
        }
        int A0H = c0660Ii.A0H();
        int flags = A0Y[3].length();
        if (flags != 6) {
            throw new RuntimeException();
        }
        A0Y[3] = "xMtqR0";
        if (A0H == 1) {
            long A0M = dq.A04 + (D3.A01(A08) == 0 ? c0660Ii.A0M() : c0660Ii.A0N());
            String[] strArr = A0Y;
            String str = strArr[6];
            String str2 = strArr[4];
            int flags2 = str.length();
            if (flags2 != str2.length()) {
                String[] strArr2 = A0Y;
                strArr2[6] = "QBYjlSuWWzNHcmXjWc7avhw4MqaHk82";
                strArr2[4] = "P5zbNSbq1MUS3wdHf";
                dq.A04 = A0M;
                return;
            }
            A0Y[7] = "vg5EJJPWiTbIFzTVTJFrvfHkMClrP8RJ";
            dq.A04 = A0M;
            return;
        }
        throw new C0470Af(A0A(552, 29, 95) + A0H);
    }

    public static void A0T(C0660Ii c0660Ii, DQ dq) throws C0470Af {
        A0R(c0660Ii, 0, dq);
    }

    public static void A0U(C0660Ii c0660Ii, DQ dq, byte[] bArr) throws C0470Af {
        c0660Ii.A0Y(8);
        c0660Ii.A0c(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0R(c0660Ii, 16, dq);
    }

    public static void A0V(C0660Ii c0660Ii, C0660Ii c0660Ii2, String str, DQ dq) throws C0470Af {
        c0660Ii.A0Y(8);
        int A08 = c0660Ii.A08();
        if (c0660Ii.A08() != A0a) {
            return;
        }
        if (D3.A01(A08) == 1) {
            c0660Ii.A0Z(4);
        }
        int A082 = c0660Ii.A08();
        String[] strArr = A0Y;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[3] = "cve2FA";
        if (A082 == 1) {
            c0660Ii2.A0Y(8);
            int A083 = c0660Ii2.A08();
            if (c0660Ii2.A08() != A0a) {
                return;
            }
            int A01 = D3.A01(A083);
            if (A0Y[1].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "iX8BjoZjE8Q6Igd9BCVMMRG15zWrcCbA";
            if (A01 == 1) {
                if (c0660Ii2.A0M() == 0) {
                    throw new C0470Af(A0A(609, 55, 42));
                }
            } else if (A01 >= 2) {
                c0660Ii2.A0Z(4);
            }
            if (c0660Ii2.A0M() == 1) {
                c0660Ii2.A0Z(1);
                int A0E = c0660Ii2.A0E();
                int i2 = (A0E & 240) >> 4;
                int i3 = A0E & 15;
                boolean z = c0660Ii2.A0E() == 1;
                if (!z) {
                    return;
                }
                int A0E2 = c0660Ii2.A0E();
                byte[] bArr = new byte[16];
                int perSampleIvSize = bArr.length;
                c0660Ii2.A0c(bArr, 0, perSampleIvSize);
                int skipByteBlock = A0Y[7].charAt(27);
                if (skipByteBlock != 114) {
                    throw new RuntimeException();
                }
                A0Y[0] = "v2evuoi5ipUorqJI1yS0NRy";
                byte[] bArr2 = null;
                if (z && A0E2 == 0) {
                    int A0E3 = c0660Ii2.A0E();
                    bArr2 = new byte[A0E3];
                    c0660Ii2.A0c(bArr2, 0, A0E3);
                }
                dq.A0A = true;
                dq.A08 = new DP(z, str, A0E2, bArr, i2, i3, bArr2);
                return;
            }
            throw new C0470Af(A0A(89, 39, 21));
        }
        throw new C0470Af(A0A(50, 39, SyslogConstants.LOG_CLOCK));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r4 != r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4 == com.facebook.ads.redexgen.X.D3.A0h) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r4 == com.facebook.ads.redexgen.X.D3.A16) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r4 == com.facebook.ads.redexgen.X.D3.A0i) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r4 == com.facebook.ads.redexgen.X.D3.A1K) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        r3 = com.facebook.ads.redexgen.X.D3.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (com.facebook.ads.redexgen.X.WK.A0Y[5].length() == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r4 != r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
        com.facebook.ads.redexgen.X.WK.A0Y[5] = "P";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (r4 == r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r4 != com.facebook.ads.redexgen.X.D3.A0N) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0W(int r4) {
        /*
            int r0 = com.facebook.ads.redexgen.X.D3.A0j
            if (r4 == r0) goto L6a
            int r3 = com.facebook.ads.redexgen.X.D3.A1L
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.WK.A0Y
            r0 = 2
            r1 = r1[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            r0 = 75
            if (r1 == r0) goto L1b
        L15:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WK.A0Y
            java.lang.String r1 = "T3RhZdPh4OhUklIpt3KHsdu4Qu4SXFxX"
            r0 = 2
            r2[r0] = r1
            if (r4 == r3) goto L6a
            int r3 = com.facebook.ads.redexgen.X.D3.A0d
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.WK.A0Y
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L53
            if (r4 == r3) goto L6a
        L34:
            int r0 = com.facebook.ads.redexgen.X.D3.A0h
            if (r4 == r0) goto L6a
            int r0 = com.facebook.ads.redexgen.X.D3.A16
            if (r4 == r0) goto L6a
            int r0 = com.facebook.ads.redexgen.X.D3.A0i
            if (r4 == r0) goto L6a
            int r0 = com.facebook.ads.redexgen.X.D3.A1K
            if (r4 == r0) goto L6a
            int r3 = com.facebook.ads.redexgen.X.D3.A0m
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.WK.A0Y
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L5d
            goto L15
        L53:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WK.A0Y
            java.lang.String r1 = "W"
            r0 = 0
            r2[r0] = r1
            if (r4 == r3) goto L6a
            goto L34
        L5d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WK.A0Y
            java.lang.String r1 = "P"
            r0 = 5
            r2[r0] = r1
            if (r4 == r3) goto L6a
            int r0 = com.facebook.ads.redexgen.X.D3.A0N
            if (r4 != r0) goto L6c
        L6a:
            r0 = 1
        L6b:
            return r0
        L6c:
            r0 = 0
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WK.A0W(int):boolean");
    }

    public static boolean A0X(int i2) {
        return i2 == D3.A0V || i2 == D3.A0c || i2 == D3.A0n || i2 == D3.A12 || i2 == D3.A1A || i2 == D3.A1H || i2 == D3.A1I || i2 == D3.A1J || i2 == D3.A1M || i2 == D3.A1N || i2 == D3.A0r || i2 == D3.A0u || i2 == D3.A0t || i2 == D3.A10 || i2 == D3.A1Q || i2 == D3.A0x || i2 == D3.A11 || i2 == D3.A0O || i2 == D3.A0f || i2 == D3.A0P;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
        if (r10.A0F == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e7, code lost:
        r10.A0C.AER(new com.facebook.ads.redexgen.X.C1012Wg(r10.A08, r2));
        r10.A0F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0100, code lost:
        if (com.facebook.ads.redexgen.X.WK.A0Y[3].length() == 6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0102, code lost:
        r10.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0104, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0110, code lost:
        if (r10.A0F == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0113, code lost:
        com.facebook.ads.redexgen.X.WK.A0Y[2] = "kMQb8Kdhh0k2oCY1DKK8Lkjm8envfnKE";
        r10.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011c, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0Y(com.facebook.ads.redexgen.X.InterfaceC0518Cd r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WK.A0Y(com.facebook.ads.redexgen.X.Cd):boolean");
    }

    /* JADX WARN: Incorrect condition in loop: B:40:0x010d */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0Z(com.facebook.ads.redexgen.X.InterfaceC0518Cd r19) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WK.A0Z(com.facebook.ads.redexgen.X.Cd):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void A8I(Ce ce) {
        this.A0C = ce;
        DO r0 = this.A0N;
        if (r0 != null) {
            DF df = new DF(ce.AFI(0, r0.A03));
            df.A07(this.A0N, new D9(0, 0, 0, 0));
            this.A0K.put(0, df);
            A0C();
            this.A0C.A5C();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final int ADU(InterfaceC0518Cd interfaceC0518Cd, C0521Cj c0521Cj) throws IOException, InterruptedException {
        while (true) {
            int i2 = this.A02;
            if (i2 != 0) {
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                A0Y[2] = "Ub8SUYMnE0bQG8CZo0KwdlTNogw2mbM0";
                if (i2 == 1) {
                    A0G(interfaceC0518Cd);
                } else if (i2 != 2) {
                    boolean A0Z2 = A0Z(interfaceC0518Cd);
                    if (A0Y[7].charAt(27) == 'r') {
                        A0Y[5] = "b";
                        if (A0Z2) {
                            return 0;
                        }
                    } else if (A0Z2) {
                        return 0;
                    }
                } else {
                    A0H(interfaceC0518Cd);
                }
            } else if (!A0Y(interfaceC0518Cd)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final void AEQ(long j2, long j3) {
        int size = this.A0K.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A0K.valueAt(i2).A04();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j3;
        this.A0T.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0517Cc
    public final boolean AF0(InterfaceC0518Cd interfaceC0518Cd) throws IOException, InterruptedException {
        return DM.A03(interfaceC0518Cd);
    }
}
