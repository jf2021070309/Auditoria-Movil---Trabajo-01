package com.amazon.aps.iva.r7;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.amazon.aps.iva.q7.f;
import com.amazon.aps.iva.q7.h;
import com.amazon.aps.iva.s5.a;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.t5.v;
import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: Cea608Decoder.java */
/* loaded from: classes.dex */
public final class a extends c {
    public final int h;
    public final int i;
    public final int j;
    public List<com.amazon.aps.iva.s5.a> n;
    public List<com.amazon.aps.iva.s5.a> o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public byte t;
    public byte u;
    public boolean w;
    public long x;
    public static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, MediaError.DetailedErrorCode.MEDIA_DECODE, MediaError.DetailedErrorCode.MEDIA_NETWORK, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED, 105, 106, 107, 108, 109, MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] D = {193, MediaError.DetailedErrorCode.MEDIAKEYS_NETWORK, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, MediaError.DetailedErrorCode.MEDIAKEYS_UNSUPPORTED, MediaError.DetailedErrorCode.MEDIAKEYS_WEBCRYPTO, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, WebSocketProtocol.PAYLOAD_SHORT, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final v g = new v();
    public final ArrayList<C0668a> l = new ArrayList<>();
    public C0668a m = new C0668a(0, 4);
    public int v = 0;
    public final long k = 16000000;

    /* compiled from: Cea608Decoder.java */
    /* renamed from: com.amazon.aps.iva.r7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0668a {
        public final ArrayList a;
        public final ArrayList b;
        public final StringBuilder c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        /* compiled from: Cea608Decoder.java */
        /* renamed from: com.amazon.aps.iva.r7.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0669a {
            public final int a;
            public final boolean b;
            public int c;

            public C0669a(int i, int i2, boolean z) {
                this.a = i;
                this.b = z;
                this.c = i2;
            }
        }

        public C0668a(int i, int i2) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.b = arrayList2;
            StringBuilder sb = new StringBuilder();
            this.c = sb;
            this.g = i;
            arrayList.clear();
            arrayList2.clear();
            sb.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
            this.h = i2;
        }

        public final void a(char c) {
            StringBuilder sb = this.c;
            if (sb.length() < 32) {
                sb.append(c);
            }
        }

        public final void b() {
            C0669a c0669a;
            int i;
            StringBuilder sb = this.c;
            int length = sb.length();
            if (length > 0) {
                sb.delete(length - 1, length);
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0 && (i = (c0669a = (C0669a) arrayList.get(size)).c) == length) {
                        c0669a.c = i - 1;
                    } else {
                        return;
                    }
                }
            }
        }

        public final com.amazon.aps.iva.s5.a c(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i2 >= arrayList.size()) {
                    break;
                }
                spannableStringBuilder.append((CharSequence) arrayList.get(i2));
                spannableStringBuilder.append('\n');
                i2++;
            }
            spannableStringBuilder.append((CharSequence) d());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.e + this.f;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.g == 2 && (Math.abs(i4) < 3 || length < 0)) {
                    i = 1;
                } else if (this.g == 2 && i4 > 0) {
                    i = 2;
                } else {
                    i = 0;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i5 = this.d;
            if (i5 > 7) {
                i5 = (i5 - 15) - 2;
            } else if (this.g == 1) {
                i5 -= this.h - 1;
            }
            a.C0695a c0695a = new a.C0695a();
            c0695a.a = spannableStringBuilder;
            c0695a.c = Layout.Alignment.ALIGN_NORMAL;
            c0695a.e = i5;
            c0695a.f = 1;
            c0695a.h = f;
            c0695a.i = i;
            return c0695a.a();
        }

        public final SpannableString d() {
            int i;
            boolean z;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            int i7 = 0;
            boolean z2 = false;
            while (true) {
                ArrayList arrayList = this.a;
                if (i6 >= arrayList.size()) {
                    break;
                }
                C0669a c0669a = (C0669a) arrayList.get(i6);
                boolean z3 = c0669a.b;
                int i8 = c0669a.a;
                if (i8 != 8) {
                    if (i8 == 7) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i8 != 7) {
                        i5 = a.A[i8];
                    }
                    z2 = z;
                }
                int i9 = c0669a.c;
                i6++;
                if (i6 < arrayList.size()) {
                    i = ((C0669a) arrayList.get(i6)).c;
                } else {
                    i = length;
                }
                if (i9 != i) {
                    if (i2 != -1 && !z3) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i9, 33);
                        i2 = -1;
                    } else if (i2 == -1 && z3) {
                        i2 = i9;
                    }
                    if (i3 != -1 && !z2) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i3, i9, 33);
                        i3 = -1;
                    } else if (i3 == -1 && z2) {
                        i3 = i9;
                    }
                    if (i5 != i4) {
                        if (i4 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i7, i9, 33);
                        }
                        i4 = i5;
                        i7 = i9;
                    }
                }
            }
            if (i2 != -1 && i2 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
            }
            if (i3 != -1 && i3 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, length, 33);
            }
            if (i7 != length && i4 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i7, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final boolean e() {
            if (this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0) {
                return true;
            }
            return false;
        }
    }

    public a(String str, int i) {
        int i2;
        if ("application/x-mp4-cea-608".equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.h = i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        p.g();
                        this.j = 0;
                        this.i = 0;
                    } else {
                        this.j = 1;
                        this.i = 1;
                    }
                } else {
                    this.j = 0;
                    this.i = 1;
                }
            } else {
                this.j = 1;
                this.i = 0;
            }
        } else {
            this.j = 0;
            this.i = 0;
        }
        k(0);
        j();
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.r7.c
    public final d e() {
        List<com.amazon.aps.iva.s5.a> list = this.n;
        this.o = list;
        list.getClass();
        return new d(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    @Override // com.amazon.aps.iva.r7.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.amazon.aps.iva.r7.c.a r15) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r7.a.f(com.amazon.aps.iva.r7.c$a):void");
    }

    @Override // com.amazon.aps.iva.r7.c, com.amazon.aps.iva.z5.d
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        k(0);
        this.q = 4;
        this.m.h = 4;
        j();
        this.r = false;
        this.s = false;
        this.t = (byte) 0;
        this.u = (byte) 0;
        this.v = 0;
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.r7.c, com.amazon.aps.iva.z5.d
    /* renamed from: g */
    public final h c() throws f {
        boolean z2;
        h pollFirst;
        h c = super.c();
        if (c != null) {
            return c;
        }
        long j = this.k;
        if (j != -9223372036854775807L) {
            long j2 = this.x;
            if (j2 != -9223372036854775807L && this.e - j2 >= j) {
                z2 = true;
                if (!z2 && (pollFirst = this.b.pollFirst()) != null) {
                    this.n = Collections.emptyList();
                    this.x = -9223372036854775807L;
                    pollFirst.l(this.e, e(), Long.MAX_VALUE);
                    return pollFirst;
                }
            }
        }
        z2 = false;
        return !z2 ? null : null;
    }

    @Override // com.amazon.aps.iva.r7.c
    public final boolean h() {
        if (this.n != this.o) {
            return true;
        }
        return false;
    }

    public final List<com.amazon.aps.iva.s5.a> i() {
        ArrayList<C0668a> arrayList = this.l;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            com.amazon.aps.iva.s5.a c = arrayList.get(i2).c(Integer.MIN_VALUE);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.j);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            com.amazon.aps.iva.s5.a aVar = (com.amazon.aps.iva.s5.a) arrayList2.get(i3);
            if (aVar != null) {
                if (aVar.j != i) {
                    aVar = arrayList.get(i3).c(i);
                    aVar.getClass();
                }
                arrayList3.add(aVar);
            }
        }
        return arrayList3;
    }

    public final void j() {
        C0668a c0668a = this.m;
        c0668a.g = this.p;
        c0668a.a.clear();
        c0668a.b.clear();
        c0668a.c.setLength(0);
        c0668a.d = 15;
        c0668a.e = 0;
        c0668a.f = 0;
        ArrayList<C0668a> arrayList = this.l;
        arrayList.clear();
        arrayList.add(this.m);
    }

    public final void k(int i) {
        int i2 = this.p;
        if (i2 == i) {
            return;
        }
        this.p = i;
        if (i == 3) {
            int i3 = 0;
            while (true) {
                ArrayList<C0668a> arrayList = this.l;
                if (i3 < arrayList.size()) {
                    arrayList.get(i3).g = i;
                    i3++;
                } else {
                    return;
                }
            }
        } else {
            j();
            if (i2 == 3 || i == 1 || i == 0) {
                this.n = Collections.emptyList();
            }
        }
    }

    @Override // com.amazon.aps.iva.r7.c, com.amazon.aps.iva.z5.d
    public final void release() {
    }
}
