package okhttp3.internal.http2;

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
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class a {
    static final Header[] a = {new Header(Header.TARGET_AUTHORITY, ""), new Header(Header.TARGET_METHOD, "GET"), new Header(Header.TARGET_METHOD, "POST"), new Header(Header.TARGET_PATH, "/"), new Header(Header.TARGET_PATH, "/index.html"), new Header(Header.TARGET_SCHEME, "http"), new Header(Header.TARGET_SCHEME, "https"), new Header(Header.RESPONSE_STATUS, "200"), new Header(Header.RESPONSE_STATUS, "204"), new Header(Header.RESPONSE_STATUS, "206"), new Header(Header.RESPONSE_STATUS, "304"), new Header(Header.RESPONSE_STATUS, "400"), new Header(Header.RESPONSE_STATUS, "404"), new Header(Header.RESPONSE_STATUS, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header(SpJsonConstants.CACHE_CONTROL, ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header(DownloadUtils.IF_MODIFIED_SINCE, ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header(PlaceFields.LOCATION, ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
    static final Map<ByteString, Integer> b = a();

    private a() {
    }

    /* renamed from: okhttp3.internal.http2.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0339a {
        Header[] a;
        int b;
        int c;
        int d;
        private final List<Header> e;
        private final BufferedSource f;
        private final int g;
        private int h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0339a(int i, Source source) {
            this(i, i, source);
        }

        C0339a(int i, int i2, Source source) {
            this.e = new ArrayList();
            this.a = new Header[8];
            this.b = this.a.length - 1;
            this.c = 0;
            this.d = 0;
            this.g = i;
            this.h = i2;
            this.f = Okio.buffer(source);
        }

        private void d() {
            if (this.h < this.d) {
                if (this.h == 0) {
                    e();
                } else {
                    a(this.d - this.h);
                }
            }
        }

        private void e() {
            Arrays.fill(this.a, (Object) null);
            this.b = this.a.length - 1;
            this.c = 0;
            this.d = 0;
        }

        private int a(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.a.length;
                while (true) {
                    length--;
                    if (length < this.b || i <= 0) {
                        break;
                    }
                    i -= this.a[length].a;
                    this.d -= this.a[length].a;
                    this.c--;
                    i2++;
                }
                System.arraycopy(this.a, this.b + 1, this.a, this.b + 1 + i2, this.c);
                this.b += i2;
            }
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            while (!this.f.exhausted()) {
                int readByte = this.f.readByte() & Constants.UNKNOWN;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    b(a(readByte, 127) - 1);
                } else if (readByte == 64) {
                    g();
                } else if ((readByte & 64) == 64) {
                    e(a(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    this.h = a(readByte, 31);
                    if (this.h < 0 || this.h > this.g) {
                        throw new IOException("Invalid dynamic table size update " + this.h);
                    }
                    d();
                } else if (readByte == 16 || readByte == 0) {
                    f();
                } else {
                    d(a(readByte, 15) - 1);
                }
            }
        }

        public List<Header> b() {
            ArrayList arrayList = new ArrayList(this.e);
            this.e.clear();
            return arrayList;
        }

        private void b(int i) {
            if (g(i)) {
                this.e.add(a.a[i]);
                return;
            }
            int c = c(i - a.a.length);
            if (c < 0 || c > this.a.length - 1) {
                throw new IOException("Header index too large " + (i + 1));
            }
            this.e.add(this.a[c]);
        }

        private int c(int i) {
            return this.b + 1 + i;
        }

        private void d(int i) {
            this.e.add(new Header(f(i), c()));
        }

        private void f() {
            this.e.add(new Header(a.a(c()), c()));
        }

        private void e(int i) {
            a(-1, new Header(f(i), c()));
        }

        private void g() {
            a(-1, new Header(a.a(c()), c()));
        }

        private ByteString f(int i) {
            return g(i) ? a.a[i].name : this.a[c(i - a.a.length)].name;
        }

        private boolean g(int i) {
            return i >= 0 && i <= a.a.length + (-1);
        }

        private void a(int i, Header header) {
            this.e.add(header);
            int i2 = header.a;
            if (i != -1) {
                i2 -= this.a[c(i)].a;
            }
            if (i2 > this.h) {
                e();
                return;
            }
            int a = a((this.d + i2) - this.h);
            if (i == -1) {
                if (this.c + 1 > this.a.length) {
                    Header[] headerArr = new Header[this.a.length * 2];
                    System.arraycopy(this.a, 0, headerArr, this.a.length, this.a.length);
                    this.b = this.a.length - 1;
                    this.a = headerArr;
                }
                int i3 = this.b;
                this.b = i3 - 1;
                this.a[i3] = header;
                this.c++;
            } else {
                this.a[a + c(i) + i] = header;
            }
            this.d = i2 + this.d;
        }

        private int h() {
            return this.f.readByte() & Constants.UNKNOWN;
        }

        int a(int i, int i2) {
            int i3 = i & i2;
            if (i3 >= i2) {
                int i4 = 0;
                while (true) {
                    int h = h();
                    if ((h & 128) != 0) {
                        i2 += (h & 127) << i4;
                        i4 += 7;
                    } else {
                        return (h << i4) + i2;
                    }
                }
            } else {
                return i3;
            }
        }

        ByteString c() {
            int h = h();
            boolean z = (h & 128) == 128;
            int a = a(h, 127);
            if (z) {
                return ByteString.of(d.a().a(this.f.readByteArray(a)));
            }
            return this.f.readByteString(a);
        }
    }

    private static Map<ByteString, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        for (int i = 0; i < a.length; i++) {
            if (!linkedHashMap.containsKey(a[i].name)) {
                linkedHashMap.put(a[i].name, Integer.valueOf(i));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* loaded from: classes4.dex */
    static final class b {
        int a;
        int b;
        Header[] c;
        int d;
        int e;
        int f;
        private final Buffer g;
        private final boolean h;
        private int i;
        private boolean j;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Buffer buffer) {
            this(4096, true, buffer);
        }

        b(int i, boolean z, Buffer buffer) {
            this.i = Integer.MAX_VALUE;
            this.c = new Header[8];
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
            this.a = i;
            this.b = i;
            this.h = z;
            this.g = buffer;
        }

        private void a() {
            Arrays.fill(this.c, (Object) null);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
        }

        private int b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.c.length;
                while (true) {
                    length--;
                    if (length < this.d || i <= 0) {
                        break;
                    }
                    i -= this.c[length].a;
                    this.f -= this.c[length].a;
                    this.e--;
                    i2++;
                }
                System.arraycopy(this.c, this.d + 1, this.c, this.d + 1 + i2, this.e);
                Arrays.fill(this.c, this.d + 1, this.d + 1 + i2, (Object) null);
                this.d += i2;
            }
            return i2;
        }

        private void a(Header header) {
            int i = header.a;
            if (i > this.b) {
                a();
                return;
            }
            b((this.f + i) - this.b);
            if (this.e + 1 > this.c.length) {
                Header[] headerArr = new Header[this.c.length * 2];
                System.arraycopy(this.c, 0, headerArr, this.c.length, this.c.length);
                this.d = this.c.length - 1;
                this.c = headerArr;
            }
            int i2 = this.d;
            this.d = i2 - 1;
            this.c[i2] = header;
            this.e++;
            this.f = i + this.f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(List<Header> list) {
            int i;
            int i2;
            if (this.j) {
                if (this.i < this.b) {
                    a(this.i, 31, 32);
                }
                this.j = false;
                this.i = Integer.MAX_VALUE;
                a(this.b, 31, 32);
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Header header = list.get(i3);
                ByteString asciiLowercase = header.name.toAsciiLowercase();
                ByteString byteString = header.value;
                Integer num = a.b.get(asciiLowercase);
                if (num != null) {
                    i = num.intValue() + 1;
                    if (i > 1 && i < 8) {
                        if (Util.equal(a.a[i - 1].value, byteString)) {
                            i2 = i;
                        } else if (Util.equal(a.a[i].value, byteString)) {
                            i2 = i + 1;
                        }
                    }
                    i2 = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i2 == -1) {
                    int i4 = this.d + 1;
                    int length = this.c.length;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        if (Util.equal(this.c[i4].name, asciiLowercase)) {
                            if (Util.equal(this.c[i4].value, byteString)) {
                                i2 = (i4 - this.d) + a.a.length;
                                break;
                            } else if (i == -1) {
                                i = (i4 - this.d) + a.a.length;
                            }
                        }
                        i4++;
                    }
                }
                if (i2 != -1) {
                    a(i2, 127, 128);
                } else if (i == -1) {
                    this.g.writeByte(64);
                    a(asciiLowercase);
                    a(byteString);
                    a(header);
                } else if (asciiLowercase.startsWith(Header.PSEUDO_PREFIX) && !Header.TARGET_AUTHORITY.equals(asciiLowercase)) {
                    a(i, 15, 0);
                    a(byteString);
                } else {
                    a(i, 63, 64);
                    a(byteString);
                    a(header);
                }
            }
        }

        void a(int i, int i2, int i3) {
            if (i < i2) {
                this.g.writeByte(i3 | i);
                return;
            }
            this.g.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.g.writeByte((i4 & 127) | 128);
                i4 >>>= 7;
            }
            this.g.writeByte(i4);
        }

        void a(ByteString byteString) {
            if (this.h && d.a().a(byteString) < byteString.size()) {
                Buffer buffer = new Buffer();
                d.a().a(byteString, buffer);
                ByteString readByteString = buffer.readByteString();
                a(readByteString.size(), 127, 128);
                this.g.write(readByteString);
                return;
            }
            a(byteString.size(), 127, 0);
            this.g.write(byteString);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(int i) {
            this.a = i;
            int min = Math.min(i, 16384);
            if (this.b != min) {
                if (min < this.b) {
                    this.i = Math.min(this.i, min);
                }
                this.j = true;
                this.b = min;
                b();
            }
        }

        private void b() {
            if (this.b < this.f) {
                if (this.b == 0) {
                    a();
                } else {
                    b(this.f - this.b);
                }
            }
        }
    }

    static ByteString a(ByteString byteString) {
        int size = byteString.size();
        for (int i = 0; i < size; i++) {
            byte b2 = byteString.getByte(i);
            if (b2 >= 65 && b2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }
}
