package c.i.g;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import com.android.music.MusicApp;
import e.a.c.b7;
import e.a.c.j6;
import e.a.c.p6;
import e.d.d.m.i;
import e.h.d.a0;
import e.h.d.b0;
import e.h.g.a1;
import e.h.g.l0;
import e.h.g.q1;
import e.h.g.s1;
import e.h.g.x0;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;
import java.util.zip.ZipException;
/* loaded from: classes.dex */
public final class b {
    public static boolean a;

    /* renamed from: b  reason: collision with root package name */
    public static b7 f2069b;

    /* renamed from: c  reason: collision with root package name */
    public static Handler f2070c;

    /* renamed from: d  reason: collision with root package name */
    public static b0 f2071d;

    /* renamed from: e  reason: collision with root package name */
    public static a0 f2072e;

    /* renamed from: f  reason: collision with root package name */
    public static p6 f2073f;

    public static void a(String str, String str2, String str3) {
        l0 i2 = i(x0.f8405d);
        if (i2 != null) {
            i2.p("LANG", str);
            i2.p("country", str2);
            i2.p("script", str3);
            i2.m("set", true);
        }
        q1.a();
    }

    public static c.s.e b(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            StringBuilder y = e.a.d.a.a.y("File too short to be a zip file: ");
            y.append(randomAccessFile.length());
            throw new ZipException(y.toString());
        }
        long j2 = length - 65536;
        long j3 = j2 >= 0 ? j2 : 0L;
        int reverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                c.s.e eVar = new c.s.e();
                eVar.f2509b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                eVar.a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return eVar;
            }
            length--;
        } while (length >= j3);
        throw new ZipException("End Of Central Directory signature not found");
    }

    public static String c() {
        Objects.requireNonNull(f2071d);
        return "music.musicplayer";
    }

    public static Class<?> d() {
        return ((MusicApp.a) f2071d).b();
    }

    public static p6 e() {
        if (f2073f == null) {
            f2073f = ((MusicApp.a) f2071d).c();
        }
        return f2073f;
    }

    public static a0 f() {
        if (f2072e == null) {
            Objects.requireNonNull((MusicApp.a) f2071d);
            f2072e = new j6();
        }
        return f2072e;
    }

    public static a1 g(Context context) {
        String str;
        l0 i2 = i(context);
        String str2 = null;
        String str3 = "";
        if (i2 != null) {
            str2 = i2.k("LANG", null);
            String k2 = i2.k("country", "");
            str = i2.k("script", "");
            str3 = k2;
        } else {
            str = "";
        }
        if (str2 == null) {
            c h2 = h(Resources.getSystem().getConfiguration());
            int i3 = -1;
            for (int i4 = 0; i4 < h2.c() && (i3 = a1.c(h2.b(i4))) == -1; i4++) {
            }
            if (i3 >= 0) {
                return a1.b(i3);
            }
            str2 = "en";
        }
        a1.a();
        int d2 = a1.d(str2, str3, str);
        return d2 >= 0 ? a1.b(d2) : a1.a[0];
    }

    public static c h(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new c(new f(configuration.getLocales())) : c.a(configuration.locale);
    }

    public static l0 i(Context context) {
        try {
            return l0.j(context, "lang", true);
        } catch (Throwable th) {
            s1.l(th, true);
            return null;
        }
    }

    public static boolean j() {
        l0 i2 = i(x0.f8405d);
        if (i2 == null) {
            return true;
        }
        return i2.d("set", false);
    }

    public static void k(String str) {
        if (a) {
            i.a().a.e(str);
        }
    }

    public static void l(Throwable th) {
        try {
            if (a) {
                i.a().b(th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static void m(Throwable th) {
        Objects.requireNonNull((MusicApp.a) f2071d);
        try {
            if (a) {
                i.a().b(th);
            }
        } catch (IllegalStateException unused) {
        }
    }
}
