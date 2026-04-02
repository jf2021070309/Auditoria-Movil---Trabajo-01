package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s;
import com.facebook.places.model.PlaceFields;
import com.flurry.android.Constants;
import com.ss.android.socialbase.downloader.constants.SpJsonConstants;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {
    static final c[] a = {new c(c.i, ""), new c(c.f, "GET"), new c(c.f, "POST"), new c(c.g, "/"), new c(c.g, "/index.html"), new c(c.h, "http"), new c(c.h, "https"), new c(c.e, "200"), new c(c.e, "204"), new c(c.e, "206"), new c(c.e, "304"), new c(c.e, "400"), new c(c.e, "404"), new c(c.e, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c(SpJsonConstants.CACHE_CONTROL, ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c(DownloadUtils.IF_MODIFIED_SINCE, ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c(PlaceFields.LOCATION, ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
    static final Map<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f, Integer> b = a();

    /* loaded from: classes.dex */
    static final class a {
        private final List<c> a;
        private final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.e b;
        private final int c;
        private int d;
        c[] e;
        int f;
        int g;
        int h;

        a(int i, int i2, s sVar) {
            this.a = new ArrayList();
            c[] cVarArr = new c[8];
            this.e = cVarArr;
            this.f = cVarArr.length - 1;
            this.g = 0;
            this.h = 0;
            this.c = i;
            this.d = i2;
            this.b = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.l.a(sVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i, s sVar) {
            this(i, i, sVar);
        }

        private int a(int i) {
            return this.f + 1 + i;
        }

        private void a(int i, c cVar) {
            this.a.add(cVar);
            int i2 = cVar.c;
            if (i != -1) {
                i2 -= this.e[a(i)].c;
            }
            int i3 = this.d;
            if (i2 > i3) {
                e();
                return;
            }
            int b = b((this.h + i2) - i3);
            if (i == -1) {
                int i4 = this.g;
                c[] cVarArr = this.e;
                if (i4 + 1 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f = this.e.length - 1;
                    this.e = cVarArr2;
                }
                int i5 = this.f;
                this.f = i5 - 1;
                this.e[i5] = cVar;
                this.g++;
            } else {
                this.e[b + a(i) + i] = cVar;
            }
            this.h = i2 + this.h;
        }

        private int b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    c[] cVarArr = this.e;
                    i -= cVarArr[length].c;
                    this.h -= cVarArr[length].c;
                    this.g--;
                    i3++;
                }
                c[] cVarArr2 = this.e;
                int i4 = i2 + 1;
                System.arraycopy(cVarArr2, i4, cVarArr2, i4 + i3, this.g);
                this.f += i3;
            }
            return i3;
        }

        private bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f c(int i) {
            return (d(i) ? d.a[i] : this.e[a(i - d.a.length)]).a;
        }

        private void d() {
            int i = this.d;
            int i2 = this.h;
            if (i < i2) {
                if (i == 0) {
                    e();
                } else {
                    b(i2 - i);
                }
            }
        }

        private boolean d(int i) {
            return i >= 0 && i <= d.a.length - 1;
        }

        private void e() {
            Arrays.fill(this.e, (Object) null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        private void e(int i) throws IOException {
            if (d(i)) {
                this.a.add(d.a[i]);
                return;
            }
            int a = a(i - d.a.length);
            if (a >= 0) {
                c[] cVarArr = this.e;
                if (a <= cVarArr.length - 1) {
                    this.a.add(cVarArr[a]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private int f() throws IOException {
            return this.b.readByte() & Constants.UNKNOWN;
        }

        private void f(int i) throws IOException {
            a(-1, new c(c(i), b()));
        }

        private void g() throws IOException {
            a(-1, new c(d.a(b()), b()));
        }

        private void g(int i) throws IOException {
            this.a.add(new c(c(i), b()));
        }

        private void h() throws IOException {
            this.a.add(new c(d.a(b()), b()));
        }

        int a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int f = f();
                if ((f & 128) == 0) {
                    return (f << i4) + i2;
                }
                i2 += (f & 127) << i4;
                i4 += 7;
            }
        }

        public List<c> a() {
            ArrayList arrayList = new ArrayList(this.a);
            this.a.clear();
            return arrayList;
        }

        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f b() throws IOException {
            int f = f();
            boolean z = (f & 128) == 128;
            int a = a(f, 127);
            return z ? bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f.a(k.b().a(this.b.d(a))) : this.b.a(a);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c() throws IOException {
            while (!this.b.f()) {
                int readByte = this.b.readByte() & Constants.UNKNOWN;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    e(a(readByte, 127) - 1);
                } else if (readByte == 64) {
                    g();
                } else if ((readByte & 64) == 64) {
                    f(a(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int a = a(readByte, 31);
                    this.d = a;
                    if (a < 0 || a > this.c) {
                        throw new IOException("Invalid dynamic table size update " + this.d);
                    }
                    d();
                } else if (readByte == 16 || readByte == 0) {
                    h();
                } else {
                    g(a(readByte, 15) - 1);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static final class b {
        private final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c a;
        private final boolean b;
        private int c;
        private boolean d;
        int e;
        c[] f;
        int g;
        int h;
        int i;

        b(int i, boolean z, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar) {
            this.c = Integer.MAX_VALUE;
            c[] cVarArr = new c[8];
            this.f = cVarArr;
            this.g = cVarArr.length - 1;
            this.h = 0;
            this.i = 0;
            this.e = i;
            this.b = z;
            this.a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar) {
            this(4096, true, cVar);
        }

        private void a() {
            int i = this.e;
            int i2 = this.i;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    b(i2 - i);
                }
            }
        }

        private void a(c cVar) {
            int i = cVar.c;
            int i2 = this.e;
            if (i > i2) {
                b();
                return;
            }
            b((this.i + i) - i2);
            int i3 = this.h;
            c[] cVarArr = this.f;
            if (i3 + 1 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.g = this.f.length - 1;
                this.f = cVarArr2;
            }
            int i4 = this.g;
            this.g = i4 - 1;
            this.f[i4] = cVar;
            this.h++;
            this.i = i + this.i;
        }

        private int b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f.length;
                while (true) {
                    length--;
                    i2 = this.g;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    c[] cVarArr = this.f;
                    i -= cVarArr[length].c;
                    this.i -= cVarArr[length].c;
                    this.h--;
                    i3++;
                }
                c[] cVarArr2 = this.f;
                int i4 = i2 + 1;
                System.arraycopy(cVarArr2, i4, cVarArr2, i4 + i3, this.h);
                c[] cVarArr3 = this.f;
                int i5 = this.g + 1;
                Arrays.fill(cVarArr3, i5, i5 + i3, (Object) null);
                this.g += i3;
            }
            return i3;
        }

        private void b() {
            Arrays.fill(this.f, (Object) null);
            this.g = this.f.length - 1;
            this.h = 0;
            this.i = 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(int i) {
            int min = Math.min(i, 16384);
            int i2 = this.e;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.c = Math.min(this.c, min);
            }
            this.d = true;
            this.e = min;
            a();
        }

        void a(int i, int i2, int i3) {
            int i4;
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar;
            if (i < i2) {
                cVar = this.a;
                i4 = i | i3;
            } else {
                this.a.writeByte(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.a.writeByte(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                cVar = this.a;
            }
            cVar.writeByte(i4);
        }

        void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f fVar) throws IOException {
            int e;
            int i;
            if (!this.b || k.b().a(fVar) >= fVar.e()) {
                e = fVar.e();
                i = 0;
            } else {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c();
                k.b().a(fVar, cVar);
                fVar = cVar.m();
                e = fVar.e();
                i = 128;
            }
            a(e, 127, i);
            this.a.a(fVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(java.util.List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.c> r13) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 229
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.d.b.a(java.util.List):void");
        }
    }

    static bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f fVar) throws IOException {
        int e = fVar.e();
        for (int i = 0; i < e; i++) {
            byte a2 = fVar.a(i);
            if (a2 >= 65 && a2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.h());
            }
        }
        return fVar;
    }

    private static Map<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        int i = 0;
        while (true) {
            c[] cVarArr = a;
            if (i >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i].a)) {
                linkedHashMap.put(cVarArr[i].a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
