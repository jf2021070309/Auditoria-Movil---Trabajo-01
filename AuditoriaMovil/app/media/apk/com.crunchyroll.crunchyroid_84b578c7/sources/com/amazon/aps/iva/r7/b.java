package com.amazon.aps.iva.r7;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.amazon.aps.iva.m6.j;
import com.amazon.aps.iva.r7.c;
import com.amazon.aps.iva.s5.a;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.t5.u;
import com.amazon.aps.iva.t5.v;
import com.google.ads.AdSize;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: Cea708Decoder.java */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.r7.c {
    public final v g = new v();
    public final u h = new u();
    public int i = -1;
    public final int j;
    public final C0670b[] k;
    public C0670b l;
    public List<com.amazon.aps.iva.s5.a> m;
    public List<com.amazon.aps.iva.s5.a> n;
    public c o;
    public int p;

    /* compiled from: Cea708Decoder.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static final j c = new j(4);
        public final com.amazon.aps.iva.s5.a a;
        public final int b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
            a.C0695a c0695a = new a.C0695a();
            c0695a.a = spannableStringBuilder;
            c0695a.c = alignment;
            c0695a.e = f;
            c0695a.f = 0;
            c0695a.g = i;
            c0695a.h = f2;
            c0695a.i = i2;
            c0695a.l = -3.4028235E38f;
            if (z) {
                c0695a.o = i3;
                c0695a.n = true;
            }
            this.a = c0695a.a();
            this.b = i4;
        }
    }

    /* compiled from: Cea708Decoder.java */
    /* renamed from: com.amazon.aps.iva.r7.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0670b {
        public static final int[] A;
        public static final boolean[] B;
        public static final int[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;
        public static final int w = c(2, 2, 2, 0);
        public static final int x;
        public static final int[] y;
        public static final int[] z;
        public final ArrayList a = new ArrayList();
        public final SpannableStringBuilder b = new SpannableStringBuilder();
        public boolean c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;

        static {
            int c = c(0, 0, 0, 0);
            x = c;
            int c2 = c(0, 0, 0, 3);
            y = new int[]{0, 0, 0, 0, 0, 2, 0};
            z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{c, c2, c, c, c2, c, c};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{c, c, c, c, c, c2, c2};
        }

        public C0670b() {
            d();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int c(int r4, int r5, int r6, int r7) {
            /*
                r0 = 4
                com.amazon.aps.iva.cq.b.x(r4, r0)
                com.amazon.aps.iva.cq.b.x(r5, r0)
                com.amazon.aps.iva.cq.b.x(r6, r0)
                com.amazon.aps.iva.cq.b.x(r7, r0)
                r0 = 0
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = r0
                goto L22
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L22
            L21:
                r7 = r2
            L22:
                if (r4 <= r1) goto L26
                r4 = r2
                goto L27
            L26:
                r4 = r0
            L27:
                if (r5 <= r1) goto L2b
                r5 = r2
                goto L2c
            L2b:
                r5 = r0
            L2c:
                if (r6 <= r1) goto L2f
                r0 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r7.b.C0670b.c(int, int, int, int):int");
        }

        public final void a(char c) {
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (c == '\n') {
                ArrayList arrayList = this.a;
                arrayList.add(b());
                spannableStringBuilder.clear();
                if (this.p != -1) {
                    this.p = 0;
                }
                if (this.q != -1) {
                    this.q = 0;
                }
                if (this.r != -1) {
                    this.r = 0;
                }
                if (this.t != -1) {
                    this.t = 0;
                }
                while (true) {
                    if ((this.k && arrayList.size() >= this.j) || arrayList.size() >= 15) {
                        arrayList.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                spannableStringBuilder.append(c);
            }
        }

        public final SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
                }
                if (this.r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.a.clear();
            this.b.clear();
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.t = -1;
            this.v = 0;
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = true;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            int i = x;
            this.o = i;
            this.s = w;
            this.u = i;
        }

        public final void e(boolean z2, boolean z3) {
            int i = this.p;
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (i != -1) {
                if (!z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.p, spannableStringBuilder.length(), 33);
                    this.p = -1;
                }
            } else if (z2) {
                this.p = spannableStringBuilder.length();
            }
            if (this.q != -1) {
                if (!z3) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, spannableStringBuilder.length(), 33);
                    this.q = -1;
                }
            } else if (z3) {
                this.q = spannableStringBuilder.length();
            }
        }

        public final void f(int i, int i2) {
            int i3 = this.r;
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (i3 != -1 && this.s != i) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, spannableStringBuilder.length(), 33);
            }
            if (i != w) {
                this.r = spannableStringBuilder.length();
                this.s = i;
            }
            if (this.t != -1 && this.u != i2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, spannableStringBuilder.length(), 33);
            }
            if (i2 != x) {
                this.t = spannableStringBuilder.length();
                this.u = i2;
            }
        }
    }

    /* compiled from: Cea708Decoder.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final int a;
        public final int b;
        public final byte[] c;
        public int d = 0;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = new byte[(i2 * 2) - 1];
        }
    }

    public b(int i, List<byte[]> list) {
        this.j = i == -1 ? 1 : i;
        if (list != null && (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1)) {
        }
        this.k = new C0670b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.k[i2] = new C0670b();
        }
        this.l = this.k[0];
    }

    @Override // com.amazon.aps.iva.r7.c
    public final d e() {
        List<com.amazon.aps.iva.s5.a> list = this.m;
        this.n = list;
        list.getClass();
        return new d(list);
    }

    @Override // com.amazon.aps.iva.r7.c
    public final void f(c.a aVar) {
        boolean z;
        ByteBuffer byteBuffer = aVar.d;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        v vVar = this.g;
        vVar.D(limit, array);
        while (vVar.c - vVar.b >= 3) {
            int u = vVar.u() & 7;
            int i = u & 3;
            boolean z2 = false;
            if ((u & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            byte u2 = (byte) vVar.u();
            byte u3 = (byte) vVar.u();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        i();
                        int i2 = (u2 & 192) >> 6;
                        int i3 = this.i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            k();
                            p.g();
                        }
                        this.i = i2;
                        int i4 = u2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        c cVar = new c(i2, i4);
                        this.o = cVar;
                        int i5 = cVar.d;
                        cVar.d = i5 + 1;
                        cVar.c[i5] = u3;
                    } else {
                        if (i == 2) {
                            z2 = true;
                        }
                        com.amazon.aps.iva.cq.b.t(z2);
                        c cVar2 = this.o;
                        if (cVar2 == null) {
                            p.c();
                        } else {
                            int i6 = cVar2.d;
                            int i7 = i6 + 1;
                            byte[] bArr = cVar2.c;
                            bArr[i6] = u2;
                            cVar2.d = i7 + 1;
                            bArr[i7] = u3;
                        }
                    }
                    c cVar3 = this.o;
                    if (cVar3.d == (cVar3.b * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.r7.c, com.amazon.aps.iva.z5.d
    public final void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        this.p = 0;
        this.l = this.k[0];
        k();
        this.o = null;
    }

    @Override // com.amazon.aps.iva.r7.c
    public final boolean h() {
        if (this.m != this.n) {
            return true;
        }
        return false;
    }

    public final void i() {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        char c2;
        C0670b c0670b;
        c cVar = this.o;
        if (cVar == null) {
            return;
        }
        int i5 = 2;
        if (cVar.d != (cVar.b * 2) - 1) {
            int i6 = cVar.a;
            p.b();
        }
        c cVar2 = this.o;
        byte[] bArr = cVar2.c;
        int i7 = cVar2.d;
        u uVar = this.h;
        uVar.n(i7, bArr);
        boolean z2 = false;
        while (true) {
            if (uVar.b() > 0) {
                int i8 = 3;
                int i9 = uVar.i(3);
                int i10 = uVar.i(5);
                int i11 = 7;
                if (i9 == 7) {
                    uVar.r(i5);
                    i9 = uVar.i(6);
                    if (i9 < 7) {
                        p.g();
                    }
                }
                if (i10 == 0) {
                    if (i9 != 0) {
                        p.g();
                    }
                } else if (i9 != this.j) {
                    uVar.s(i10);
                } else {
                    int g = (i10 * 8) + uVar.g();
                    while (uVar.g() < g) {
                        int i12 = uVar.i(8);
                        if (i12 != 16) {
                            if (i12 <= 31) {
                                if (i12 != 0) {
                                    if (i12 != i8) {
                                        if (i12 != 8) {
                                            switch (i12) {
                                                case 12:
                                                    k();
                                                    break;
                                                case 13:
                                                    this.l.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i12 >= 17 && i12 <= 23) {
                                                        p.g();
                                                        uVar.r(8);
                                                        break;
                                                    } else if (i12 >= 24 && i12 <= 31) {
                                                        p.g();
                                                        uVar.r(16);
                                                        break;
                                                    } else {
                                                        p.g();
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.l.b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.m = j();
                                    }
                                }
                            } else if (i12 <= 127) {
                                if (i12 == 127) {
                                    this.l.a((char) 9835);
                                } else {
                                    this.l.a((char) (i12 & 255));
                                }
                                z2 = true;
                            } else {
                                if (i12 <= 159) {
                                    C0670b[] c0670bArr = this.k;
                                    switch (i12) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i = i8;
                                            i2 = g;
                                            z = true;
                                            int i13 = i12 - 128;
                                            if (this.p != i13) {
                                                this.p = i13;
                                                this.l = c0670bArr[i13];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            i = i8;
                                            i2 = g;
                                            z = true;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (uVar.h()) {
                                                    C0670b c0670b2 = c0670bArr[8 - i14];
                                                    c0670b2.a.clear();
                                                    c0670b2.b.clear();
                                                    c0670b2.p = -1;
                                                    c0670b2.q = -1;
                                                    c0670b2.r = -1;
                                                    c0670b2.t = -1;
                                                    c0670b2.v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i = i8;
                                            i2 = g;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (uVar.h()) {
                                                    c0670bArr[8 - i15].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            i = i8;
                                            i2 = g;
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (uVar.h()) {
                                                    c0670bArr[8 - i16].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            i = i8;
                                            i2 = g;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (uVar.h()) {
                                                    c0670bArr[8 - i17].d = !c0670b.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            i = i8;
                                            i2 = g;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (uVar.h()) {
                                                    c0670bArr[8 - i18].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            i = i8;
                                            i2 = g;
                                            uVar.r(8);
                                            z = true;
                                            break;
                                        case 142:
                                            i = i8;
                                            i2 = g;
                                            z = true;
                                            break;
                                        case 143:
                                            i = i8;
                                            i2 = g;
                                            k();
                                            z = true;
                                            break;
                                        case 144:
                                            i2 = g;
                                            if (!this.l.c) {
                                                uVar.r(16);
                                                i = 3;
                                                z = true;
                                                break;
                                            } else {
                                                uVar.i(4);
                                                uVar.i(2);
                                                uVar.i(2);
                                                boolean h = uVar.h();
                                                boolean h2 = uVar.h();
                                                i = 3;
                                                uVar.i(3);
                                                uVar.i(3);
                                                this.l.e(h, h2);
                                                z = true;
                                            }
                                        case 145:
                                            i2 = g;
                                            if (!this.l.c) {
                                                uVar.r(24);
                                            } else {
                                                int c3 = C0670b.c(uVar.i(2), uVar.i(2), uVar.i(2), uVar.i(2));
                                                int c4 = C0670b.c(uVar.i(2), uVar.i(2), uVar.i(2), uVar.i(2));
                                                uVar.r(2);
                                                C0670b.c(uVar.i(2), uVar.i(2), uVar.i(2), 0);
                                                this.l.f(c3, c4);
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 146:
                                            i2 = g;
                                            if (!this.l.c) {
                                                uVar.r(16);
                                            } else {
                                                uVar.r(4);
                                                int i19 = uVar.i(4);
                                                uVar.r(2);
                                                uVar.i(6);
                                                C0670b c0670b3 = this.l;
                                                if (c0670b3.v != i19) {
                                                    c0670b3.a('\n');
                                                }
                                                c0670b3.v = i19;
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            i = i8;
                                            i2 = g;
                                            z = true;
                                            p.g();
                                            break;
                                        case 151:
                                            i2 = g;
                                            if (!this.l.c) {
                                                uVar.r(32);
                                            } else {
                                                int c5 = C0670b.c(uVar.i(2), uVar.i(2), uVar.i(2), uVar.i(2));
                                                uVar.i(2);
                                                C0670b.c(uVar.i(2), uVar.i(2), uVar.i(2), 0);
                                                uVar.h();
                                                uVar.h();
                                                uVar.i(2);
                                                uVar.i(2);
                                                int i20 = uVar.i(2);
                                                uVar.r(8);
                                                C0670b c0670b4 = this.l;
                                                c0670b4.o = c5;
                                                c0670b4.l = i20;
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i21 = i12 - 152;
                                            C0670b c0670b5 = c0670bArr[i21];
                                            uVar.r(i5);
                                            boolean h3 = uVar.h();
                                            boolean h4 = uVar.h();
                                            uVar.h();
                                            int i22 = uVar.i(i8);
                                            boolean h5 = uVar.h();
                                            int i23 = uVar.i(i11);
                                            int i24 = uVar.i(8);
                                            int i25 = uVar.i(4);
                                            int i26 = uVar.i(4);
                                            uVar.r(i5);
                                            uVar.i(6);
                                            uVar.r(i5);
                                            int i27 = uVar.i(3);
                                            i2 = g;
                                            int i28 = uVar.i(3);
                                            c0670b5.c = true;
                                            c0670b5.d = h3;
                                            c0670b5.k = h4;
                                            c0670b5.e = i22;
                                            c0670b5.f = h5;
                                            c0670b5.g = i23;
                                            c0670b5.h = i24;
                                            c0670b5.i = i25;
                                            int i29 = i26 + 1;
                                            if (c0670b5.j != i29) {
                                                c0670b5.j = i29;
                                                while (true) {
                                                    ArrayList arrayList = c0670b5.a;
                                                    if ((h4 && arrayList.size() >= c0670b5.j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i27 != 0 && c0670b5.m != i27) {
                                                c0670b5.m = i27;
                                                int i30 = i27 - 1;
                                                int i31 = C0670b.C[i30];
                                                boolean z3 = C0670b.B[i30];
                                                int i32 = C0670b.z[i30];
                                                int i33 = C0670b.A[i30];
                                                int i34 = C0670b.y[i30];
                                                c0670b5.o = i31;
                                                c0670b5.l = i34;
                                            }
                                            if (i28 != 0 && c0670b5.n != i28) {
                                                c0670b5.n = i28;
                                                int i35 = i28 - 1;
                                                int i36 = C0670b.E[i35];
                                                int i37 = C0670b.D[i35];
                                                c0670b5.e(false, false);
                                                c0670b5.f(C0670b.w, C0670b.F[i35]);
                                            }
                                            if (this.p != i21) {
                                                this.p = i21;
                                                this.l = c0670bArr[i21];
                                            }
                                            i = 3;
                                            z = true;
                                            break;
                                    }
                                } else {
                                    i = i8;
                                    i2 = g;
                                    z = true;
                                    if (i12 <= 255) {
                                        this.l.a((char) (i12 & 255));
                                    } else {
                                        p.g();
                                        i4 = 2;
                                        i3 = 7;
                                    }
                                }
                                z2 = z;
                                i4 = 2;
                                i3 = 7;
                            }
                            i4 = i5;
                            i = i8;
                            i2 = g;
                            i3 = i11;
                            z = true;
                        } else {
                            i = i8;
                            i2 = g;
                            z = true;
                            int i38 = uVar.i(8);
                            if (i38 <= 31) {
                                i3 = 7;
                                if (i38 > 7) {
                                    if (i38 <= 15) {
                                        uVar.r(8);
                                    } else if (i38 <= 23) {
                                        uVar.r(16);
                                    } else if (i38 <= 31) {
                                        uVar.r(24);
                                    }
                                }
                            } else {
                                i3 = 7;
                                if (i38 <= 127) {
                                    if (i38 != 32) {
                                        if (i38 != 33) {
                                            if (i38 != 37) {
                                                if (i38 != 42) {
                                                    if (i38 != 44) {
                                                        if (i38 != 63) {
                                                            if (i38 != 57) {
                                                                if (i38 != 58) {
                                                                    if (i38 != 60) {
                                                                        if (i38 != 61) {
                                                                            switch (i38) {
                                                                                case 48:
                                                                                    this.l.a((char) 9608);
                                                                                    break;
                                                                                case 49:
                                                                                    this.l.a((char) 8216);
                                                                                    break;
                                                                                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                                                                                    this.l.a((char) 8217);
                                                                                    break;
                                                                                case 51:
                                                                                    this.l.a((char) 8220);
                                                                                    break;
                                                                                case 52:
                                                                                    this.l.a((char) 8221);
                                                                                    break;
                                                                                case 53:
                                                                                    this.l.a((char) 8226);
                                                                                    break;
                                                                                default:
                                                                                    switch (i38) {
                                                                                        case 118:
                                                                                            this.l.a((char) 8539);
                                                                                            break;
                                                                                        case 119:
                                                                                            this.l.a((char) 8540);
                                                                                            break;
                                                                                        case 120:
                                                                                            this.l.a((char) 8541);
                                                                                            break;
                                                                                        case 121:
                                                                                            this.l.a((char) 8542);
                                                                                            break;
                                                                                        case 122:
                                                                                            this.l.a((char) 9474);
                                                                                            break;
                                                                                        case 123:
                                                                                            this.l.a((char) 9488);
                                                                                            break;
                                                                                        case 124:
                                                                                            this.l.a((char) 9492);
                                                                                            break;
                                                                                        case 125:
                                                                                            this.l.a((char) 9472);
                                                                                            break;
                                                                                        case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                                                                                            this.l.a((char) 9496);
                                                                                            break;
                                                                                        case 127:
                                                                                            this.l.a((char) 9484);
                                                                                            break;
                                                                                        default:
                                                                                            p.g();
                                                                                            break;
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            this.l.a((char) 8480);
                                                                        }
                                                                    } else {
                                                                        this.l.a((char) 339);
                                                                    }
                                                                } else {
                                                                    this.l.a((char) 353);
                                                                }
                                                            } else {
                                                                this.l.a((char) 8482);
                                                            }
                                                        } else {
                                                            this.l.a((char) 376);
                                                        }
                                                    } else {
                                                        this.l.a((char) 338);
                                                    }
                                                } else {
                                                    this.l.a((char) 352);
                                                }
                                            } else {
                                                this.l.a((char) 8230);
                                            }
                                        } else {
                                            this.l.a((char) 160);
                                        }
                                    } else {
                                        this.l.a(' ');
                                    }
                                    z2 = true;
                                } else {
                                    if (i38 <= 159) {
                                        if (i38 <= 135) {
                                            uVar.r(32);
                                        } else if (i38 <= 143) {
                                            uVar.r(40);
                                        } else if (i38 <= 159) {
                                            i4 = 2;
                                            uVar.r(2);
                                            c2 = 6;
                                            uVar.r(uVar.i(6) * 8);
                                        }
                                    } else {
                                        i4 = 2;
                                        c2 = 6;
                                        if (i38 <= 255) {
                                            if (i38 == 160) {
                                                this.l.a((char) 13252);
                                            } else {
                                                p.g();
                                                this.l.a('_');
                                            }
                                            z2 = true;
                                        } else {
                                            p.g();
                                        }
                                    }
                                    i8 = i;
                                    i11 = i3;
                                    g = i2;
                                    i5 = i4;
                                }
                            }
                            i4 = 2;
                        }
                        c2 = 6;
                        i8 = i;
                        i11 = i3;
                        g = i2;
                        i5 = i4;
                    }
                }
            }
        }
        if (z2) {
            this.m = j();
        }
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.amazon.aps.iva.s5.a> j() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r7.b.j():java.util.List");
    }

    public final void k() {
        for (int i = 0; i < 8; i++) {
            this.k[i].d();
        }
    }
}
