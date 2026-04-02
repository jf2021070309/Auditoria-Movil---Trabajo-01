package com.amazon.aps.iva.x6;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
/* compiled from: VorbisUtil.java */
/* loaded from: classes.dex */
public final class h0 {

    /* compiled from: VorbisUtil.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final String[] a;

        public a(String[] strArr) {
            this.a = strArr;
        }
    }

    /* compiled from: VorbisUtil.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: VorbisUtil.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final byte[] g;

        public c(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = bArr;
        }
    }

    public static com.amazon.aps.iva.q5.f0 a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            int i2 = com.amazon.aps.iva.t5.g0.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                "Failed to parse Vorbis comment: ".concat(str);
                com.amazon.aps.iva.t5.p.g();
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(com.amazon.aps.iva.g7.a.a(new com.amazon.aps.iva.t5.v(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    com.amazon.aps.iva.t5.p.h("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new com.amazon.aps.iva.l7.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.amazon.aps.iva.q5.f0(arrayList);
    }

    public static a b(com.amazon.aps.iva.t5.v vVar, boolean z, boolean z2) throws com.amazon.aps.iva.q5.h0 {
        if (z) {
            c(3, vVar, false);
        }
        vVar.r((int) vVar.k());
        long k = vVar.k();
        String[] strArr = new String[(int) k];
        for (int i = 0; i < k; i++) {
            strArr[i] = vVar.r((int) vVar.k());
        }
        if (z2 && (vVar.u() & 1) == 0) {
            throw com.amazon.aps.iva.q5.h0.a("framing bit expected to be set", null);
        }
        return new a(strArr);
    }

    public static boolean c(int i, com.amazon.aps.iva.t5.v vVar, boolean z) throws com.amazon.aps.iva.q5.h0 {
        if (vVar.c - vVar.b < 7) {
            if (z) {
                return false;
            }
            throw com.amazon.aps.iva.q5.h0.a("too short header: " + (vVar.c - vVar.b), null);
        } else if (vVar.u() != i) {
            if (z) {
                return false;
            }
            throw com.amazon.aps.iva.q5.h0.a("expected header type " + Integer.toHexString(i), null);
        } else if (vVar.u() == 118 && vVar.u() == 111 && vVar.u() == 114 && vVar.u() == 98 && vVar.u() == 105 && vVar.u() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw com.amazon.aps.iva.q5.h0.a("expected characters 'vorbis'", null);
        }
    }
}
