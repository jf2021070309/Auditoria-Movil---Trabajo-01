package j.i0.i;

import e.j.d.w;
import j.i0.i.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k.x;
/* loaded from: classes2.dex */
public final class d {
    public static final c[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<k.h, Integer> f9371b;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public final k.g f9372b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9373c;

        /* renamed from: d  reason: collision with root package name */
        public int f9374d;
        public final List<c> a = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public c[] f9375e = new c[8];

        /* renamed from: f  reason: collision with root package name */
        public int f9376f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f9377g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f9378h = 0;

        public a(int i2, x xVar) {
            this.f9373c = i2;
            this.f9374d = i2;
            this.f9372b = w.l(xVar);
        }

        public final void a() {
            Arrays.fill(this.f9375e, (Object) null);
            this.f9376f = this.f9375e.length - 1;
            this.f9377g = 0;
            this.f9378h = 0;
        }

        public final int b(int i2) {
            return this.f9376f + 1 + i2;
        }

        public final int c(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f9375e.length;
                while (true) {
                    length--;
                    i3 = this.f9376f;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    c[] cVarArr = this.f9375e;
                    i2 -= cVarArr[length].f9370i;
                    this.f9378h -= cVarArr[length].f9370i;
                    this.f9377g--;
                    i4++;
                }
                c[] cVarArr2 = this.f9375e;
                System.arraycopy(cVarArr2, i3 + 1, cVarArr2, i3 + 1 + i4, this.f9377g);
                this.f9376f += i4;
            }
            return i4;
        }

        public final k.h d(int i2) throws IOException {
            if (i2 >= 0 && i2 <= d.a.length + (-1)) {
                return d.a[i2].f9368g;
            }
            int b2 = b(i2 - d.a.length);
            if (b2 >= 0) {
                c[] cVarArr = this.f9375e;
                if (b2 < cVarArr.length) {
                    return cVarArr[b2].f9368g;
                }
            }
            StringBuilder y = e.a.d.a.a.y("Header index too large ");
            y.append(i2 + 1);
            throw new IOException(y.toString());
        }

        public final void e(int i2, c cVar) {
            this.a.add(cVar);
            int i3 = cVar.f9370i;
            if (i2 != -1) {
                i3 -= this.f9375e[(this.f9376f + 1) + i2].f9370i;
            }
            int i4 = this.f9374d;
            if (i3 > i4) {
                a();
                return;
            }
            int c2 = c((this.f9378h + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f9377g + 1;
                c[] cVarArr = this.f9375e;
                if (i5 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f9376f = this.f9375e.length - 1;
                    this.f9375e = cVarArr2;
                }
                int i6 = this.f9376f;
                this.f9376f = i6 - 1;
                this.f9375e[i6] = cVar;
                this.f9377g++;
            } else {
                this.f9375e[this.f9376f + 1 + i2 + c2 + i2] = cVar;
            }
            this.f9378h += i3;
        }

        public k.h f() throws IOException {
            int readByte = this.f9372b.readByte() & 255;
            boolean z = (readByte & 128) == 128;
            int g2 = g(readByte, 127);
            if (z) {
                s sVar = s.f9486c;
                byte[] L = this.f9372b.L(g2);
                Objects.requireNonNull(sVar);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                s.a aVar = sVar.f9487d;
                int i2 = 0;
                int i3 = 0;
                for (byte b2 : L) {
                    i2 = (i2 << 8) | (b2 & 255);
                    i3 += 8;
                    while (i3 >= 8) {
                        int i4 = i3 - 8;
                        aVar = aVar.a[(i2 >>> i4) & 255];
                        if (aVar.a == null) {
                            byteArrayOutputStream.write(aVar.f9488b);
                            i3 -= aVar.f9489c;
                            aVar = sVar.f9487d;
                        } else {
                            i3 = i4;
                        }
                    }
                }
                while (i3 > 0) {
                    s.a aVar2 = aVar.a[(i2 << (8 - i3)) & 255];
                    if (aVar2.a != null || aVar2.f9489c > i3) {
                        break;
                    }
                    byteArrayOutputStream.write(aVar2.f9488b);
                    i3 -= aVar2.f9489c;
                    aVar = sVar.f9487d;
                }
                return k.h.y(byteArrayOutputStream.toByteArray());
            }
            return this.f9372b.g(g2);
        }

        public int g(int i2, int i3) throws IOException {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int readByte = this.f9372b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i3 + (readByte << i5);
                }
                i3 += (readByte & 127) << i5;
                i5 += 7;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public final k.d a;

        /* renamed from: c  reason: collision with root package name */
        public boolean f9380c;

        /* renamed from: b  reason: collision with root package name */
        public int f9379b = Integer.MAX_VALUE;

        /* renamed from: e  reason: collision with root package name */
        public c[] f9382e = new c[8];

        /* renamed from: f  reason: collision with root package name */
        public int f9383f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f9384g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f9385h = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f9381d = 4096;

        public b(k.d dVar) {
            this.a = dVar;
        }

        public final void a() {
            Arrays.fill(this.f9382e, (Object) null);
            this.f9383f = this.f9382e.length - 1;
            this.f9384g = 0;
            this.f9385h = 0;
        }

        public final int b(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f9382e.length;
                while (true) {
                    length--;
                    i3 = this.f9383f;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    c[] cVarArr = this.f9382e;
                    i2 -= cVarArr[length].f9370i;
                    this.f9385h -= cVarArr[length].f9370i;
                    this.f9384g--;
                    i4++;
                }
                c[] cVarArr2 = this.f9382e;
                System.arraycopy(cVarArr2, i3 + 1, cVarArr2, i3 + 1 + i4, this.f9384g);
                c[] cVarArr3 = this.f9382e;
                int i5 = this.f9383f;
                Arrays.fill(cVarArr3, i5 + 1, i5 + 1 + i4, (Object) null);
                this.f9383f += i4;
            }
            return i4;
        }

        public final void c(c cVar) {
            int i2 = cVar.f9370i;
            int i3 = this.f9381d;
            if (i2 > i3) {
                a();
                return;
            }
            b((this.f9385h + i2) - i3);
            int i4 = this.f9384g + 1;
            c[] cVarArr = this.f9382e;
            if (i4 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f9383f = this.f9382e.length - 1;
                this.f9382e = cVarArr2;
            }
            int i5 = this.f9383f;
            this.f9383f = i5 - 1;
            this.f9382e[i5] = cVar;
            this.f9384g++;
            this.f9385h += i2;
        }

        public void d(k.h hVar) throws IOException {
            Objects.requireNonNull(s.f9486c);
            long j2 = 0;
            int i2 = 0;
            long j3 = 0;
            for (int i3 = 0; i3 < hVar.i(); i3++) {
                j3 += s.f9485b[hVar.v(i3) & 255];
            }
            if (((int) ((j3 + 7) >> 3)) >= hVar.i()) {
                f(hVar.i(), 127, 0);
                this.a.d0(hVar);
                return;
            }
            k.d dVar = new k.d();
            Objects.requireNonNull(s.f9486c);
            byte b2 = 0;
            while (i2 < hVar.i()) {
                int v = hVar.v(i2) & 255;
                int i4 = s.a[v];
                byte b3 = s.f9485b[v];
                j2 = (j2 << b3) | i4;
                int i5 = b2 + b3;
                while (i5 >= 8) {
                    i5 = (i5 == 1 ? 1 : 0) - 8;
                    dVar.q((int) (j2 >> i5));
                }
                i2++;
                b2 = i5;
            }
            if (b2 > 0) {
                dVar.q((int) ((j2 << (8 - b2)) | (255 >>> b2)));
            }
            k.h z = dVar.z();
            f(z.i(), 127, 128);
            this.a.d0(z);
        }

        public void e(List<c> list) throws IOException {
            int i2;
            int i3;
            if (this.f9380c) {
                int i4 = this.f9379b;
                if (i4 < this.f9381d) {
                    f(i4, 31, 32);
                }
                this.f9380c = false;
                this.f9379b = Integer.MAX_VALUE;
                f(this.f9381d, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                c cVar = list.get(i5);
                k.h G = cVar.f9368g.G();
                k.h hVar = cVar.f9369h;
                Integer num = d.f9371b.get(G);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        c[] cVarArr = d.a;
                        if (j.i0.c.l(cVarArr[i2 - 1].f9369h, hVar)) {
                            i3 = i2;
                        } else if (j.i0.c.l(cVarArr[i2].f9369h, hVar)) {
                            i3 = i2;
                            i2++;
                        }
                    }
                    i3 = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i3 = -1;
                }
                if (i2 == -1) {
                    int i6 = this.f9383f + 1;
                    int length = this.f9382e.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        if (j.i0.c.l(this.f9382e[i6].f9368g, G)) {
                            if (j.i0.c.l(this.f9382e[i6].f9369h, hVar)) {
                                i2 = d.a.length + (i6 - this.f9383f);
                                break;
                            } else if (i3 == -1) {
                                i3 = (i6 - this.f9383f) + d.a.length;
                            }
                        }
                        i6++;
                    }
                }
                if (i2 != -1) {
                    f(i2, 127, 128);
                } else if (i3 == -1) {
                    this.a.h0(64);
                    d(G);
                    d(hVar);
                    c(cVar);
                } else {
                    k.h hVar2 = c.a;
                    Objects.requireNonNull(G);
                    h.o.c.j.e(hVar2, "prefix");
                    if (!G.z(0, hVar2, 0, hVar2.i()) || c.f9367f.equals(G)) {
                        f(i3, 63, 64);
                        d(hVar);
                        c(cVar);
                    } else {
                        f(i3, 15, 0);
                        d(hVar);
                    }
                }
            }
        }

        public void f(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.a.h0(i2 | i4);
                return;
            }
            this.a.h0(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.a.h0(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.a.h0(i5);
        }
    }

    static {
        c cVar = new c(c.f9367f, "");
        int i2 = 0;
        k.h hVar = c.f9364c;
        k.h hVar2 = c.f9365d;
        k.h hVar3 = c.f9366e;
        k.h hVar4 = c.f9363b;
        c[] cVarArr = {cVar, new c(hVar, "GET"), new c(hVar, "POST"), new c(hVar2, "/"), new c(hVar2, "/index.html"), new c(hVar3, "http"), new c(hVar3, "https"), new c(hVar4, "200"), new c(hVar4, "204"), new c(hVar4, "206"), new c(hVar4, "304"), new c(hVar4, "400"), new c(hVar4, "404"), new c(hVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        while (true) {
            c[] cVarArr2 = a;
            if (i2 >= cVarArr2.length) {
                f9371b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
            if (!linkedHashMap.containsKey(cVarArr2[i2].f9368g)) {
                linkedHashMap.put(cVarArr2[i2].f9368g, Integer.valueOf(i2));
            }
            i2++;
        }
    }

    public static k.h a(k.h hVar) throws IOException {
        int i2 = hVar.i();
        for (int i3 = 0; i3 < i2; i3++) {
            byte v = hVar.v(i3);
            if (v >= 65 && v <= 90) {
                StringBuilder y = e.a.d.a.a.y("PROTOCOL_ERROR response malformed: mixed case name: ");
                y.append(hVar.K());
                throw new IOException(y.toString());
            }
        }
        return hVar;
    }
}
