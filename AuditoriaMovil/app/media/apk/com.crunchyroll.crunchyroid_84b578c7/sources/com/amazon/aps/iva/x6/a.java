package com.amazon.aps.iva.x6;

import com.google.android.gms.common.ConnectionResult;
/* compiled from: AacUtil.java */
/* loaded from: classes.dex */
public final class a {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* compiled from: AacUtil.java */
    /* renamed from: com.amazon.aps.iva.x6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0844a {
        public final int a;
        public final int b;
        public final String c;

        public C0844a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }
    }

    public static int a(com.amazon.aps.iva.t5.u uVar) throws com.amazon.aps.iva.q5.h0 {
        int i = uVar.i(4);
        if (i == 15) {
            if (uVar.b() >= 24) {
                return uVar.i(24);
            }
            throw com.amazon.aps.iva.q5.h0.a("AAC header insufficient data", null);
        } else if (i < 13) {
            return a[i];
        } else {
            throw com.amazon.aps.iva.q5.h0.a("AAC header wrong Sampling Frequency Index", null);
        }
    }

    public static C0844a b(com.amazon.aps.iva.t5.u uVar, boolean z) throws com.amazon.aps.iva.q5.h0 {
        int i = uVar.i(5);
        if (i == 31) {
            i = uVar.i(6) + 32;
        }
        int a2 = a(uVar);
        int i2 = uVar.i(4);
        String a3 = com.amazon.aps.iva.q.c0.a("mp4a.40.", i);
        if (i == 5 || i == 29) {
            a2 = a(uVar);
            int i3 = uVar.i(5);
            if (i3 == 31) {
                i3 = uVar.i(6) + 32;
            }
            i = i3;
            if (i == 22) {
                i2 = uVar.i(4);
            }
        }
        if (z) {
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7 && i != 17) {
                switch (i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case ConnectionResult.API_DISABLED /* 23 */:
                        break;
                    default:
                        throw com.amazon.aps.iva.q5.h0.c("Unsupported audio object type: " + i);
                }
            }
            if (uVar.h()) {
                com.amazon.aps.iva.t5.p.g();
            }
            if (uVar.h()) {
                uVar.r(14);
            }
            boolean h = uVar.h();
            if (i2 != 0) {
                if (i == 6 || i == 20) {
                    uVar.r(3);
                }
                if (h) {
                    if (i == 22) {
                        uVar.r(16);
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        uVar.r(3);
                    }
                    uVar.r(1);
                }
                switch (i) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case ConnectionResult.API_DISABLED /* 23 */:
                        int i4 = uVar.i(2);
                        if (i4 == 2 || i4 == 3) {
                            throw com.amazon.aps.iva.q5.h0.c("Unsupported epConfig: " + i4);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i5 = b[i2];
        if (i5 != -1) {
            return new C0844a(a2, i5, a3);
        }
        throw com.amazon.aps.iva.q5.h0.a(null, null);
    }
}
