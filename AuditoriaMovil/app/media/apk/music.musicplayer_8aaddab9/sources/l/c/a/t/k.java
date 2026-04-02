package l.c.a.t;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
/* loaded from: classes2.dex */
public final class k extends a<k> implements Serializable {
    public static final int[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f9723b = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f9724c = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f9725d = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f9726e = {0, 1, 0, 1, 0, 1, 1};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f9727f = {1, 9999, 11, 51, 5, 29, 354};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f9728g = {1, 9999, 11, 52, 6, 30, 355};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f9729h = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};

    /* renamed from: i  reason: collision with root package name */
    public static final char f9730i;

    /* renamed from: j  reason: collision with root package name */
    public static final String f9731j;

    /* renamed from: k  reason: collision with root package name */
    public static final String f9732k;

    /* renamed from: l  reason: collision with root package name */
    public static final HashMap<Integer, Integer[]> f9733l;

    /* renamed from: m  reason: collision with root package name */
    public static final HashMap<Integer, Integer[]> f9734m;

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap<Integer, Integer[]> f9735n;
    public static final Long[] o;
    public static final Integer[] p;
    public static final Integer[] q;
    public static final Integer[] r;
    public static final Integer[] s;
    public static final Integer[] t;
    public static final Integer[] u;
    public static final Integer[] v;
    public static final Integer[] w;
    public final transient int A;
    public final transient int B;
    public final transient l.c.a.b C;
    public final long D;
    public final transient l x;
    public final transient int y;
    public final transient int z;

    static {
        int[] iArr = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
        a = iArr;
        char c2 = File.separatorChar;
        f9730i = c2;
        f9731j = File.pathSeparator;
        f9732k = "org" + c2 + "threeten" + c2 + "bp" + c2 + "chrono";
        f9733l = new HashMap<>();
        f9734m = new HashMap<>();
        f9735n = new HashMap<>();
        s = new Integer[iArr.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr2 = a;
            if (i3 >= iArr2.length) {
                break;
            }
            s[i3] = Integer.valueOf(iArr2[i3]);
            i3++;
        }
        t = new Integer[f9723b.length];
        int i4 = 0;
        while (true) {
            int[] iArr3 = f9723b;
            if (i4 >= iArr3.length) {
                break;
            }
            t[i4] = Integer.valueOf(iArr3[i4]);
            i4++;
        }
        u = new Integer[f9724c.length];
        int i5 = 0;
        while (true) {
            int[] iArr4 = f9724c;
            if (i5 >= iArr4.length) {
                break;
            }
            u[i5] = Integer.valueOf(iArr4[i5]);
            i5++;
        }
        v = new Integer[f9725d.length];
        int i6 = 0;
        while (true) {
            int[] iArr5 = f9725d;
            if (i6 >= iArr5.length) {
                break;
            }
            v[i6] = Integer.valueOf(iArr5[i6]);
            i6++;
        }
        w = new Integer[f9729h.length];
        int i7 = 0;
        while (true) {
            int[] iArr6 = f9729h;
            if (i7 >= iArr6.length) {
                break;
            }
            w[i7] = Integer.valueOf(iArr6[i7]);
            i7++;
        }
        o = new Long[334];
        int i8 = 0;
        while (true) {
            Long[] lArr = o;
            if (i8 >= lArr.length) {
                break;
            }
            lArr[i8] = Long.valueOf(i8 * 10631);
            i8++;
        }
        p = new Integer[f9726e.length];
        int i9 = 0;
        while (true) {
            int[] iArr7 = f9726e;
            if (i9 >= iArr7.length) {
                break;
            }
            p[i9] = Integer.valueOf(iArr7[i9]);
            i9++;
        }
        q = new Integer[f9727f.length];
        int i10 = 0;
        while (true) {
            int[] iArr8 = f9727f;
            if (i10 >= iArr8.length) {
                break;
            }
            q[i10] = Integer.valueOf(iArr8[i10]);
            i10++;
        }
        r = new Integer[f9728g.length];
        while (true) {
            int[] iArr9 = f9728g;
            if (i2 >= iArr9.length) {
                try {
                    m0();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            }
            r[i2] = Integer.valueOf(iArr9[i2]);
            i2++;
        }
    }

    public k(long j2) {
        int i2;
        int i3;
        int f0;
        int c0;
        int value;
        int i4;
        int i5;
        Long l2;
        long j3 = j2 - (-492148);
        if (j3 >= 0) {
            Long[] lArr = o;
            for (int i6 = 0; i6 < lArr.length; i6++) {
                try {
                    if (j3 < lArr[i6].longValue()) {
                        i5 = i6 - 1;
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    i4 = ((int) j3) / 10631;
                }
            }
            i4 = ((int) j3) / 10631;
            i5 = i4;
            try {
                l2 = o[i5];
            } catch (ArrayIndexOutOfBoundsException unused2) {
                l2 = null;
            }
            int longValue = (int) (j3 - (l2 == null ? Long.valueOf(i5 * 10631) : l2).longValue());
            int g0 = g0(i5, longValue);
            i3 = d0(i5, longValue, g0);
            i2 = (i5 * 30) + g0 + 1;
            f0 = f0(i3, i2);
            c0 = c0(i3, f0, i2) + 1;
            value = l.AH.getValue();
        } else {
            int i7 = (int) j3;
            int i8 = i7 / 10631;
            int i9 = i7 % 10631;
            if (i9 == 0) {
                i9 = -10631;
                i8++;
            }
            int g02 = g0(i8, i9);
            int d0 = d0(i8, i9, g02);
            i2 = 1 - ((i8 * 30) - g02);
            i3 = h0((long) i2) ? d0 + 355 : d0 + 354;
            f0 = f0(i3, i2);
            c0 = c0(i3, f0, i2) + 1;
            value = l.BEFORE_AH.getValue();
        }
        int i10 = (int) ((j3 + 5) % 7);
        int[] iArr = {value, i2, f0 + 1, c0, i3 + 1, i10 + (i10 <= 0 ? 7 : 0)};
        int i11 = iArr[1];
        if (i11 < 1 || i11 > 9999) {
            throw new l.c.a.a("Invalid year of Hijrah Era");
        }
        int i12 = iArr[2];
        if (i12 < 1 || i12 > 12) {
            throw new l.c.a.a("Invalid month of Hijrah date");
        }
        W(iArr[3]);
        int i13 = iArr[4];
        if (i13 < 1 || i13 > r[6].intValue()) {
            throw new l.c.a.a("Invalid day of year of Hijrah date");
        }
        this.x = l.of(iArr[0]);
        int i14 = iArr[1];
        this.y = i14;
        this.z = iArr[2];
        this.A = iArr[3];
        this.B = iArr[4];
        this.C = l.c.a.b.of(iArr[5]);
        this.D = j2;
        h0(i14);
    }

    public static void W(int i2) {
        if (i2 < 1 || i2 > r[5].intValue()) {
            StringBuilder z = e.a.d.a.a.z("Invalid day of month of Hijrah date, day ", i2, " greater than ");
            z.append(r[5].intValue());
            z.append(" or less than 1");
            throw new l.c.a.a(z.toString());
        }
    }

    public static Integer[] a0(int i2) {
        Integer[] numArr;
        try {
            numArr = f9735n.get(Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? w : numArr;
    }

    public static Integer[] b0(int i2) {
        Integer[] numArr;
        try {
            numArr = f9733l.get(Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? h0((long) i2) ? t : s : numArr;
    }

    public static int c0(int i2, int i3, int i4) {
        int intValue;
        Integer[] b0 = b0(i4);
        if (i2 < 0) {
            i2 = h0((long) i4) ? i2 + 355 : i2 + 354;
            if (i3 <= 0) {
                return i2;
            }
            intValue = b0[i3].intValue();
        } else if (i3 <= 0) {
            return i2;
        } else {
            intValue = b0[i3].intValue();
        }
        return i2 - intValue;
    }

    public static int d0(int i2, int i3, int i4) {
        Integer[] a0 = a0(i2);
        return i3 > 0 ? i3 - a0[i4].intValue() : a0[i4].intValue() + i3;
    }

    public static long e0(int i2, int i3, int i4) {
        Long l2;
        int i5 = i2 - 1;
        int i6 = i5 / 30;
        int i7 = i5 % 30;
        int intValue = a0(i6)[Math.abs(i7)].intValue();
        if (i7 < 0) {
            intValue = -intValue;
        }
        try {
            l2 = o[i6];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l2 = null;
        }
        if (l2 == null) {
            l2 = Long.valueOf(i6 * 10631);
        }
        return (((l2.longValue() + intValue) - 492148) - 1) + b0(i2)[i3 - 1].intValue() + i4;
    }

    public static int f0(int i2, int i3) {
        Integer[] b0 = b0(i3);
        int i4 = 0;
        if (i2 >= 0) {
            while (i4 < b0.length) {
                if (i2 < b0[i4].intValue()) {
                    return i4 - 1;
                }
                i4++;
            }
            return 11;
        }
        int i5 = h0((long) i3) ? i2 + 355 : i2 + 354;
        while (i4 < b0.length) {
            if (i5 < b0[i4].intValue()) {
                return i4 - 1;
            }
            i4++;
        }
        return 11;
    }

    public static int g0(int i2, long j2) {
        Integer[] a0 = a0(i2);
        int i3 = 0;
        if (j2 == 0) {
            return 0;
        }
        if (j2 > 0) {
            while (i3 < a0.length) {
                if (j2 < a0[i3].intValue()) {
                    return i3 - 1;
                }
                i3++;
            }
            return 29;
        }
        long j3 = -j2;
        while (i3 < a0.length) {
            if (j3 <= a0[i3].intValue()) {
                return i3 - 1;
            }
            i3++;
        }
        return 29;
    }

    public static boolean h0(long j2) {
        if (j2 <= 0) {
            j2 = -j2;
        }
        return ((j2 * 11) + 14) % 30 < 11;
    }

    public static k i0(int i2, int i3, int i4) {
        return i2 >= 1 ? j0(l.AH, i2, i3, i4) : j0(l.BEFORE_AH, 1 - i2, i3, i4);
    }

    public static k j0(l lVar, int i2, int i3, int i4) {
        e.j.d.w.k0(lVar, "era");
        if (i2 < 1 || i2 > 9999) {
            throw new l.c.a.a("Invalid year of Hijrah Era");
        }
        if (i3 < 1 || i3 > 12) {
            throw new l.c.a.a("Invalid month of Hijrah date");
        }
        W(i4);
        return new k(e0(lVar.prolepticYear(i2), i3, i4));
    }

    public static void k0(String str, int i2) throws ParseException {
        StringTokenizer stringTokenizer;
        int i3 = i2;
        StringTokenizer stringTokenizer2 = new StringTokenizer(str, ";");
        while (stringTokenizer2.hasMoreTokens()) {
            String nextToken = stringTokenizer2.nextToken();
            int indexOf = nextToken.indexOf(58);
            if (indexOf == -1) {
                int i4 = i3;
                throw new ParseException(e.a.d.a.a.f("Offset has incorrect format at line ", i4, "."), i4);
            }
            try {
                int parseInt = Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                int indexOf2 = nextToken.indexOf(45);
                if (indexOf2 == -1) {
                    int i5 = i3;
                    throw new ParseException(e.a.d.a.a.f("Start and end year/month has incorrect format at line ", i5, "."), i5);
                }
                String substring = nextToken.substring(0, indexOf2);
                String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                int indexOf3 = substring.indexOf(47);
                int indexOf4 = substring2.indexOf(47);
                if (indexOf3 == -1) {
                    int i6 = i3;
                    throw new ParseException(e.a.d.a.a.f("Start year/month has incorrect format at line ", i6, "."), i6);
                }
                String substring3 = substring.substring(0, indexOf3);
                String substring4 = substring.substring(indexOf3 + 1, substring.length());
                try {
                    int parseInt2 = Integer.parseInt(substring3);
                    try {
                        int parseInt3 = Integer.parseInt(substring4);
                        if (indexOf4 == -1) {
                            int i7 = i3;
                            throw new ParseException(e.a.d.a.a.f("End year/month has incorrect format at line ", i7, "."), i7);
                        }
                        String substring5 = substring2.substring(0, indexOf4);
                        String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                        try {
                            int parseInt4 = Integer.parseInt(substring5);
                            try {
                                int parseInt5 = Integer.parseInt(substring6);
                                if (parseInt2 == -1 || parseInt3 == -1 || parseInt4 == -1 || parseInt5 == -1) {
                                    throw new ParseException(e.a.d.a.a.f("Unknown error at line ", i2, "."), i2);
                                }
                                if (parseInt2 < 1) {
                                    throw new IllegalArgumentException("startYear < 1");
                                }
                                if (parseInt4 < 1) {
                                    throw new IllegalArgumentException("endYear < 1");
                                }
                                if (parseInt3 < 0 || parseInt3 > 11) {
                                    throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
                                }
                                if (parseInt5 < 0 || parseInt5 > 11) {
                                    throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
                                }
                                if (parseInt4 > 9999) {
                                    throw new IllegalArgumentException("endYear > 9999");
                                }
                                if (parseInt4 < parseInt2) {
                                    throw new IllegalArgumentException("startYear > endYear");
                                }
                                if (parseInt4 == parseInt2 && parseInt5 < parseInt3) {
                                    throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
                                }
                                boolean h0 = h0(parseInt2);
                                Integer[] numArr = f9733l.get(Integer.valueOf(parseInt2));
                                if (numArr == null) {
                                    if (!h0) {
                                        numArr = new Integer[a.length];
                                        int i8 = 0;
                                        while (true) {
                                            int[] iArr = a;
                                            if (i8 >= iArr.length) {
                                                break;
                                            }
                                            numArr[i8] = Integer.valueOf(iArr[i8]);
                                            i8++;
                                        }
                                    } else {
                                        numArr = new Integer[f9723b.length];
                                        int i9 = 0;
                                        while (true) {
                                            int[] iArr2 = f9723b;
                                            if (i9 >= iArr2.length) {
                                                break;
                                            }
                                            numArr[i9] = Integer.valueOf(iArr2[i9]);
                                            i9++;
                                        }
                                    }
                                }
                                Integer[] numArr2 = new Integer[numArr.length];
                                for (int i10 = 0; i10 < 12; i10++) {
                                    if (i10 > parseInt3) {
                                        numArr2[i10] = Integer.valueOf(numArr[i10].intValue() - parseInt);
                                    } else {
                                        numArr2[i10] = Integer.valueOf(numArr[i10].intValue());
                                    }
                                }
                                f9733l.put(Integer.valueOf(parseInt2), numArr2);
                                Integer[] numArr3 = f9734m.get(Integer.valueOf(parseInt2));
                                if (numArr3 == null) {
                                    if (!h0) {
                                        numArr3 = new Integer[f9724c.length];
                                        int i11 = 0;
                                        while (true) {
                                            int[] iArr3 = f9724c;
                                            if (i11 >= iArr3.length) {
                                                break;
                                            }
                                            numArr3[i11] = Integer.valueOf(iArr3[i11]);
                                            i11++;
                                        }
                                    } else {
                                        numArr3 = new Integer[f9725d.length];
                                        int i12 = 0;
                                        while (true) {
                                            int[] iArr4 = f9725d;
                                            if (i12 >= iArr4.length) {
                                                break;
                                            }
                                            numArr3[i12] = Integer.valueOf(iArr4[i12]);
                                            i12++;
                                        }
                                    }
                                }
                                Integer[] numArr4 = new Integer[numArr3.length];
                                for (int i13 = 0; i13 < 12; i13++) {
                                    if (i13 == parseInt3) {
                                        numArr4[i13] = Integer.valueOf(numArr3[i13].intValue() - parseInt);
                                    } else {
                                        numArr4[i13] = Integer.valueOf(numArr3[i13].intValue());
                                    }
                                }
                                f9734m.put(Integer.valueOf(parseInt2), numArr4);
                                if (parseInt2 != parseInt4) {
                                    int i14 = parseInt2 - 1;
                                    int i15 = i14 / 30;
                                    int i16 = i14 % 30;
                                    Integer[] numArr5 = f9735n.get(Integer.valueOf(i15));
                                    if (numArr5 == null) {
                                        int length = f9729h.length;
                                        Integer[] numArr6 = new Integer[length];
                                        for (int i17 = 0; i17 < length; i17++) {
                                            numArr6[i17] = Integer.valueOf(f9729h[i17]);
                                        }
                                        numArr5 = numArr6;
                                    }
                                    for (int i18 = i16 + 1; i18 < f9729h.length; i18++) {
                                        numArr5[i18] = Integer.valueOf(numArr5[i18].intValue() - parseInt);
                                    }
                                    f9735n.put(Integer.valueOf(i15), numArr5);
                                    int i19 = parseInt4 - 1;
                                    int i20 = i19 / 30;
                                    if (i15 != i20) {
                                        int i21 = i15 + 1;
                                        while (true) {
                                            Long[] lArr = o;
                                            if (i21 >= lArr.length) {
                                                break;
                                            }
                                            lArr[i21] = Long.valueOf(lArr[i21].longValue() - parseInt);
                                            i21++;
                                            stringTokenizer2 = stringTokenizer2;
                                        }
                                        StringTokenizer stringTokenizer3 = stringTokenizer2;
                                        int i22 = i20 + 1;
                                        while (true) {
                                            Long[] lArr2 = o;
                                            if (i22 >= lArr2.length) {
                                                break;
                                            }
                                            lArr2[i22] = Long.valueOf(lArr2[i22].longValue() + parseInt);
                                            i22++;
                                            stringTokenizer3 = stringTokenizer3;
                                        }
                                        stringTokenizer = stringTokenizer3;
                                    } else {
                                        stringTokenizer = stringTokenizer2;
                                    }
                                    int i23 = i19 % 30;
                                    Integer[] numArr7 = f9735n.get(Integer.valueOf(i20));
                                    if (numArr7 == null) {
                                        int length2 = f9729h.length;
                                        Integer[] numArr8 = new Integer[length2];
                                        for (int i24 = 0; i24 < length2; i24++) {
                                            numArr8[i24] = Integer.valueOf(f9729h[i24]);
                                        }
                                        numArr7 = numArr8;
                                    }
                                    while (true) {
                                        i23++;
                                        if (i23 >= f9729h.length) {
                                            break;
                                        }
                                        numArr7[i23] = Integer.valueOf(numArr7[i23].intValue() + parseInt);
                                    }
                                    f9735n.put(Integer.valueOf(i20), numArr7);
                                } else {
                                    stringTokenizer = stringTokenizer2;
                                }
                                boolean h02 = h0(parseInt4);
                                Integer[] numArr9 = f9733l.get(Integer.valueOf(parseInt4));
                                if (numArr9 == null) {
                                    if (!h02) {
                                        numArr9 = new Integer[a.length];
                                        int i25 = 0;
                                        while (true) {
                                            int[] iArr5 = a;
                                            if (i25 >= iArr5.length) {
                                                break;
                                            }
                                            numArr9[i25] = Integer.valueOf(iArr5[i25]);
                                            i25++;
                                        }
                                    } else {
                                        numArr9 = new Integer[f9723b.length];
                                        int i26 = 0;
                                        while (true) {
                                            int[] iArr6 = f9723b;
                                            if (i26 >= iArr6.length) {
                                                break;
                                            }
                                            numArr9[i26] = Integer.valueOf(iArr6[i26]);
                                            i26++;
                                        }
                                    }
                                }
                                Integer[] numArr10 = new Integer[numArr9.length];
                                for (int i27 = 0; i27 < 12; i27++) {
                                    if (i27 > parseInt5) {
                                        numArr10[i27] = Integer.valueOf(numArr9[i27].intValue() + parseInt);
                                    } else {
                                        numArr10[i27] = Integer.valueOf(numArr9[i27].intValue());
                                    }
                                }
                                f9733l.put(Integer.valueOf(parseInt4), numArr10);
                                Integer[] numArr11 = f9734m.get(Integer.valueOf(parseInt4));
                                if (numArr11 == null) {
                                    if (!h02) {
                                        numArr11 = new Integer[f9724c.length];
                                        int i28 = 0;
                                        while (true) {
                                            int[] iArr7 = f9724c;
                                            if (i28 >= iArr7.length) {
                                                break;
                                            }
                                            numArr11[i28] = Integer.valueOf(iArr7[i28]);
                                            i28++;
                                        }
                                    } else {
                                        numArr11 = new Integer[f9725d.length];
                                        int i29 = 0;
                                        while (true) {
                                            int[] iArr8 = f9725d;
                                            if (i29 >= iArr8.length) {
                                                break;
                                            }
                                            numArr11[i29] = Integer.valueOf(iArr8[i29]);
                                            i29++;
                                        }
                                    }
                                }
                                Integer[] numArr12 = new Integer[numArr11.length];
                                for (int i30 = 0; i30 < 12; i30++) {
                                    if (i30 == parseInt5) {
                                        numArr12[i30] = Integer.valueOf(numArr11[i30].intValue() + parseInt);
                                    } else {
                                        numArr12[i30] = Integer.valueOf(numArr11[i30].intValue());
                                    }
                                }
                                HashMap<Integer, Integer[]> hashMap = f9734m;
                                hashMap.put(Integer.valueOf(parseInt4), numArr12);
                                Integer[] numArr13 = hashMap.get(Integer.valueOf(parseInt2));
                                Integer[] numArr14 = hashMap.get(Integer.valueOf(parseInt4));
                                HashMap<Integer, Integer[]> hashMap2 = f9733l;
                                int intValue = numArr13[parseInt3].intValue();
                                int intValue2 = numArr14[parseInt5].intValue();
                                int intValue3 = numArr13[11].intValue() + hashMap2.get(Integer.valueOf(parseInt2))[11].intValue();
                                int intValue4 = numArr14[11].intValue() + hashMap2.get(Integer.valueOf(parseInt4))[11].intValue();
                                Integer[] numArr15 = r;
                                int intValue5 = numArr15[5].intValue();
                                Integer[] numArr16 = q;
                                int intValue6 = numArr16[5].intValue();
                                if (intValue5 < intValue) {
                                    intValue5 = intValue;
                                }
                                if (intValue5 < intValue2) {
                                    intValue5 = intValue2;
                                }
                                numArr15[5] = Integer.valueOf(intValue5);
                                if (intValue6 <= intValue) {
                                    intValue = intValue6;
                                }
                                if (intValue <= intValue2) {
                                    intValue2 = intValue;
                                }
                                numArr16[5] = Integer.valueOf(intValue2);
                                int intValue7 = numArr15[6].intValue();
                                int intValue8 = numArr16[6].intValue();
                                if (intValue7 < intValue3) {
                                    intValue7 = intValue3;
                                }
                                if (intValue7 < intValue4) {
                                    intValue7 = intValue4;
                                }
                                numArr15[6] = Integer.valueOf(intValue7);
                                if (intValue8 <= intValue3) {
                                    intValue3 = intValue8;
                                }
                                if (intValue3 <= intValue4) {
                                    intValue4 = intValue3;
                                }
                                numArr16[6] = Integer.valueOf(intValue4);
                                stringTokenizer2 = stringTokenizer;
                                i3 = i2;
                            } catch (NumberFormatException unused) {
                                int i31 = i3;
                                throw new ParseException(e.a.d.a.a.f("End month is not properly set at line ", i31, "."), i31);
                            }
                        } catch (NumberFormatException unused2) {
                            int i32 = i3;
                            throw new ParseException(e.a.d.a.a.f("End year is not properly set at line ", i32, "."), i32);
                        }
                    } catch (NumberFormatException unused3) {
                        int i33 = i3;
                        throw new ParseException(e.a.d.a.a.f("Start month is not properly set at line ", i33, "."), i33);
                    }
                } catch (NumberFormatException unused4) {
                    int i34 = i3;
                    throw new ParseException(e.a.d.a.a.f("Start year is not properly set at line ", i34, "."), i34);
                }
            } catch (NumberFormatException unused5) {
                int i35 = i3;
                throw new ParseException(e.a.d.a.a.f("Offset is not properly set at line ", i35, "."), i35);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x012d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m0() throws java.io.IOException, java.text.ParseException {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c.a.t.k.m0():void");
    }

    public static k n0(int i2, int i3, int i4) {
        int intValue = b0(i2)[i3 - 1].intValue();
        if (i4 > intValue) {
            i4 = intValue;
        }
        return i0(i2, i3, i4);
    }

    private Object readResolve() {
        return new k(this.D);
    }

    private Object writeReplace() {
        return new u((byte) 3, this);
    }

    @Override // l.c.a.t.a, l.c.a.t.b
    public b B(long j2, l.c.a.w.l lVar) {
        return (k) super.h(j2, lVar);
    }

    @Override // l.c.a.t.b
    public long G() {
        return e0(this.y, this.z, this.A);
    }

    @Override // l.c.a.t.b
    public b I(l.c.a.w.f fVar) {
        return (k) j.f9719c.f(fVar.adjustInto(this));
    }

    @Override // l.c.a.t.a
    public a<k> M(long j2, l.c.a.w.l lVar) {
        return (k) super.h(j2, lVar);
    }

    @Override // l.c.a.t.a
    public a<k> P(long j2) {
        return new k(this.D + j2);
    }

    @Override // l.c.a.t.a
    public a<k> Q(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.z - 1) + ((int) j2);
        int i3 = i2 / 12;
        int i4 = i2 % 12;
        while (i4 < 0) {
            i4 += 12;
            int i5 = i3 - 1;
            if ((i3 ^ i5) < 0 && (i3 ^ 1) < 0) {
                throw new ArithmeticException(e.a.d.a.a.g("Subtraction overflows an int: ", i3, " - ", 1));
            }
            i3 = i5;
        }
        return j0(this.x, e.j.d.w.m0(this.y, i3), i4 + 1, this.A);
    }

    @Override // l.c.a.t.a
    public a<k> T(long j2) {
        if (j2 == 0) {
            return this;
        }
        return j0(this.x, e.j.d.w.m0(this.y, (int) j2), this.z, this.A);
    }

    @Override // l.c.a.t.b, l.c.a.w.d
    public l.c.a.w.d b(l.c.a.w.f fVar) {
        return (k) j.f9719c.f(fVar.adjustInto(this));
    }

    @Override // l.c.a.t.b, l.c.a.v.b, l.c.a.w.d
    public l.c.a.w.d f(long j2, l.c.a.w.l lVar) {
        return (k) super.f(j2, lVar);
    }

    @Override // l.c.a.w.e
    public long getLong(l.c.a.w.i iVar) {
        int value;
        int i2;
        if (iVar instanceof l.c.a.w.a) {
            switch (((l.c.a.w.a) iVar).ordinal()) {
                case 15:
                    value = this.C.getValue();
                    break;
                case 16:
                    i2 = (this.A - 1) % 7;
                    value = i2 + 1;
                    break;
                case 17:
                    i2 = (this.B - 1) % 7;
                    value = i2 + 1;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    value = this.A;
                    break;
                case 19:
                    value = this.B;
                    break;
                case 20:
                    return G();
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    i2 = (this.A - 1) / 7;
                    value = i2 + 1;
                    break;
                case 22:
                    i2 = (this.B - 1) / 7;
                    value = i2 + 1;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    value = this.z;
                    break;
                case 24:
                default:
                    throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
                case 25:
                    value = this.y;
                    break;
                case 26:
                    value = this.y;
                    break;
                case 27:
                    value = this.x.getValue();
                    break;
            }
            return value;
        }
        return iVar.getFrom(this);
    }

    @Override // l.c.a.t.a, l.c.a.t.b, l.c.a.w.d
    public l.c.a.w.d h(long j2, l.c.a.w.l lVar) {
        return (k) super.h(j2, lVar);
    }

    public k l0(long j2) {
        return new k(this.D + j2);
    }

    @Override // l.c.a.t.b, l.c.a.w.d
    /* renamed from: o0 */
    public k a(l.c.a.w.i iVar, long j2) {
        if (iVar instanceof l.c.a.w.a) {
            l.c.a.w.a aVar = (l.c.a.w.a) iVar;
            aVar.checkValidValue(j2);
            int i2 = (int) j2;
            switch (aVar.ordinal()) {
                case 15:
                    return l0(j2 - this.C.getValue());
                case 16:
                    return l0(j2 - getLong(l.c.a.w.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 17:
                    return l0(j2 - getLong(l.c.a.w.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    return n0(this.y, this.z, i2);
                case 19:
                    int i3 = i2 - 1;
                    return n0(this.y, (i3 / 30) + 1, (i3 % 30) + 1);
                case 20:
                    return new k(i2);
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    return l0((j2 - getLong(l.c.a.w.a.ALIGNED_WEEK_OF_MONTH)) * 7);
                case 22:
                    return l0((j2 - getLong(l.c.a.w.a.ALIGNED_WEEK_OF_YEAR)) * 7);
                case ConnectionResult.API_DISABLED /* 23 */:
                    return n0(this.y, i2, this.A);
                case 24:
                default:
                    throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
                case 25:
                    if (this.y < 1) {
                        i2 = 1 - i2;
                    }
                    return n0(i2, this.z, this.A);
                case 26:
                    return n0(i2, this.z, this.A);
                case 27:
                    return n0(1 - this.y, this.z, this.A);
            }
        }
        return (k) iVar.adjustInto(this, j2);
    }

    @Override // l.c.a.v.c, l.c.a.w.e
    public l.c.a.w.n range(l.c.a.w.i iVar) {
        int i2;
        if (iVar instanceof l.c.a.w.a) {
            if (isSupported(iVar)) {
                l.c.a.w.a aVar = (l.c.a.w.a) iVar;
                int ordinal = aVar.ordinal();
                Integer[] numArr = null;
                if (ordinal == 18) {
                    int i3 = this.z - 1;
                    int i4 = this.y;
                    try {
                        numArr = f9734m.get(Integer.valueOf(i4));
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                    if (numArr == null) {
                        numArr = h0((long) i4) ? v : u;
                    }
                    return l.c.a.w.n.f(1L, numArr[i3].intValue());
                } else if (ordinal != 19) {
                    if (ordinal != 21) {
                        if (ordinal != 25) {
                            j jVar = j.f9719c;
                            return aVar.range();
                        }
                        return l.c.a.w.n.f(1L, 1000L);
                    }
                    return l.c.a.w.n.f(1L, 5L);
                } else {
                    int i5 = this.y;
                    int i6 = i5 - 1;
                    int i7 = i6 / 30;
                    try {
                        numArr = f9735n.get(Integer.valueOf(i7));
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                    }
                    if (numArr != null) {
                        int i8 = i6 % 30;
                        if (i8 == 29) {
                            Long[] lArr = o;
                            i2 = (lArr[i7 + 1].intValue() - lArr[i7].intValue()) - numArr[i8].intValue();
                        } else {
                            i2 = numArr[i8 + 1].intValue() - numArr[i8].intValue();
                        }
                    } else {
                        i2 = h0((long) i5) ? 355 : 354;
                    }
                    return l.c.a.w.n.f(1L, i2);
                }
            }
            throw new l.c.a.w.m(e.a.d.a.a.o("Unsupported field: ", iVar));
        }
        return iVar.rangeRefinedBy(this);
    }

    @Override // l.c.a.t.a, l.c.a.t.b
    public final c<k> t(l.c.a.g gVar) {
        return new d(this, gVar);
    }

    @Override // l.c.a.t.b
    public h v() {
        return j.f9719c;
    }

    @Override // l.c.a.t.b
    public i y() {
        return this.x;
    }

    @Override // l.c.a.t.b
    public b z(long j2, l.c.a.w.l lVar) {
        return (k) super.f(j2, lVar);
    }
}
