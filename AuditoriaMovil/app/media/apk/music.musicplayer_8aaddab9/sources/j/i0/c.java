package j.i0;

import ch.qos.logback.core.FileAppender;
import j.e0;
import j.f0;
import j.r;
import j.s;
import j.w;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k.h;
import k.x;
/* loaded from: classes.dex */
public final class c {
    public static final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f9269b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final f0 f9270c;

    /* renamed from: d  reason: collision with root package name */
    public static final h f9271d;

    /* renamed from: e  reason: collision with root package name */
    public static final h f9272e;

    /* renamed from: f  reason: collision with root package name */
    public static final h f9273f;

    /* renamed from: g  reason: collision with root package name */
    public static final h f9274g;

    /* renamed from: h  reason: collision with root package name */
    public static final h f9275h;

    /* renamed from: i  reason: collision with root package name */
    public static final Charset f9276i;

    /* renamed from: j  reason: collision with root package name */
    public static final Charset f9277j;

    /* renamed from: k  reason: collision with root package name */
    public static final Charset f9278k;

    /* renamed from: l  reason: collision with root package name */
    public static final Charset f9279l;

    /* renamed from: m  reason: collision with root package name */
    public static final Charset f9280m;

    /* renamed from: n  reason: collision with root package name */
    public static final TimeZone f9281n;
    public static final Comparator<String> o;
    public static final Method p;
    public static final Pattern q;

    /* loaded from: classes2.dex */
    public class a implements Comparator<String> {
        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        k.d dVar = new k.d();
        dVar.e0(bArr);
        long j2 = 0;
        Method method = null;
        f9270c = new e0(null, j2, dVar);
        d(j2, j2, j2);
        f9271d = h.b("efbbbf");
        f9272e = h.b("feff");
        f9273f = h.b("fffe");
        f9274g = h.b("0000ffff");
        f9275h = h.b("ffff0000");
        f9276i = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        f9277j = Charset.forName("UTF-16BE");
        f9278k = Charset.forName("UTF-16LE");
        f9279l = Charset.forName("UTF-32BE");
        f9280m = Charset.forName("UTF-32LE");
        f9281n = TimeZone.getTimeZone("GMT");
        o = new a();
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        p = method;
        q = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d1, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.i0.c.b(java.lang.String):java.lang.String");
    }

    public static int c(String str, long j2, TimeUnit timeUnit) {
        if (j2 >= 0) {
            Objects.requireNonNull(timeUnit, "unit == null");
            long millis = timeUnit.toMillis(j2);
            if (millis <= 2147483647L) {
                if (millis != 0 || j2 <= 0) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(e.a.d.a.a.k(str, " too small."));
            }
            throw new IllegalArgumentException(e.a.d.a.a.k(str, " too large."));
        }
        throw new IllegalArgumentException(e.a.d.a.a.k(str, " < 0"));
    }

    public static void d(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void f(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!s(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static int g(char c2) {
        if (c2 < '0' || c2 > '9') {
            char c3 = 'a';
            if (c2 < 'a' || c2 > 'f') {
                c3 = 'A';
                if (c2 < 'A' || c2 > 'F') {
                    return -1;
                }
            }
            return (c2 - c3) + 10;
        }
        return c2 - '0';
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d7, code lost:
        if (r7 == 16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00da, code lost:
        if (r8 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00dc, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dd, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ef, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f6, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress h(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.i0.c.h(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int i(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int j(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean k(x xVar, int i2, TimeUnit timeUnit) {
        try {
            return u(xVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean l(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String m(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String n(s sVar, boolean z) {
        String r = sVar.f9539e.contains(":") ? e.a.d.a.a.r(e.a.d.a.a.y("["), sVar.f9539e, "]") : sVar.f9539e;
        if (z || sVar.f9540f != s.d(sVar.f9536b)) {
            StringBuilder A = e.a.d.a.a.A(r, ":");
            A.append(sVar.f9540f);
            return A.toString();
        }
        return r;
    }

    public static <T> List<T> o(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> p(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static int q(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static String[] r(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean s(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean t(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean u(x xVar, int i2, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long c2 = xVar.c().e() ? xVar.c().c() - nanoTime : Long.MAX_VALUE;
        xVar.c().d(Math.min(c2, timeUnit.toNanos(i2)) + nanoTime);
        try {
            k.d dVar = new k.d();
            while (xVar.S(dVar, FileAppender.DEFAULT_BUFFER_SIZE) != -1) {
                dVar.skip(dVar.f9620b);
            }
            if (c2 == Long.MAX_VALUE) {
                xVar.c().a();
            } else {
                xVar.c().d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                xVar.c().a();
            } else {
                xVar.c().d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                xVar.c().a();
            } else {
                xVar.c().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static int v(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int w(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static r x(List<j.i0.i.c> list) {
        r.a aVar = new r.a();
        for (j.i0.i.c cVar : list) {
            j.i0.a aVar2 = j.i0.a.a;
            String K = cVar.f9368g.K();
            String K2 = cVar.f9369h.K();
            Objects.requireNonNull((w.a) aVar2);
            aVar.a.add(K);
            aVar.a.add(K2.trim());
        }
        return new r(aVar);
    }

    public static String y(String str, int i2, int i3) {
        int v = v(str, i2, i3);
        return str.substring(v, w(str, v, i3));
    }
}
