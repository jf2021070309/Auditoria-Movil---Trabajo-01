package e.h.e;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import com.android.music.MusicApp;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.security.ProviderInstaller;
import com.google.firebase.analytics.FirebaseAnalytics;
import e.h.e.g;
import e.h.g.j0;
import e.h.g.j1;
import e.h.g.r0;
import e.h.g.s1;
import e.h.g.t1;
import e.h.g.v0;
import e.h.g.x0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class g {
    public static r0 a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f8233b;

    /* renamed from: c  reason: collision with root package name */
    public static b f8234c;

    /* renamed from: d  reason: collision with root package name */
    public static final Object f8235d;

    /* renamed from: e  reason: collision with root package name */
    public static FirebaseAnalytics f8236e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f8237f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f8238g;

    /* renamed from: h  reason: collision with root package name */
    public static BlockingQueue<c> f8239h;

    /* renamed from: i  reason: collision with root package name */
    public static int f8240i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f8241j;

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public Double f8242b;

        /* renamed from: c  reason: collision with root package name */
        public String f8243c;

        /* renamed from: d  reason: collision with root package name */
        public Long f8244d;

        /* renamed from: e  reason: collision with root package name */
        public Map<String, String> f8245e;

        public c(String str) {
            this.f8243c = str;
            this.f8245e = new HashMap();
        }

        public c(String str, double d2, String str2) {
            this.f8243c = str;
            this.f8245e = null;
            this.f8242b = Double.valueOf(d2);
            this.a = str2;
        }

        public c(String str, Map<String, String> map, long j2) {
            this.f8243c = str;
            this.f8245e = map;
            this.f8244d = Long.valueOf(j2);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Runnable {
        public d(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            Thread.currentThread().setPriority(1);
            while (true) {
                try {
                    c take = g.f8239h.take();
                    if (take != null && g.f8234c != null) {
                        String str2 = take.f8243c;
                        Map<String, String> map = take.f8245e;
                        if (g.f8236e == null) {
                            g.f8236e = FirebaseAnalytics.getInstance(x0.f8405d);
                        }
                        synchronized (g.f8235d) {
                            if (((MusicApp.c) g.f8234c).a()) {
                                if (map != null) {
                                    for (String str3 : map.keySet()) {
                                        if (str3 != null && (str = map.get(str3)) != null) {
                                            g.f8236e.f4729b.zzN(null, str3, str, false);
                                        }
                                    }
                                }
                                Bundle bundle = new Bundle();
                                Long l2 = take.f8244d;
                                if (l2 != null) {
                                    bundle.putLong("value", l2.longValue());
                                }
                                Double d2 = take.f8242b;
                                if (d2 != null) {
                                    bundle.putDouble("value", d2.doubleValue());
                                }
                                String str4 = take.a;
                                if (str4 != null) {
                                    bundle.putString(AppLovinEventParameters.REVENUE_CURRENCY, str4);
                                }
                                Objects.requireNonNull(g.f8234c);
                                g.f8236e.f4729b.zzx(str2, bundle);
                            } else {
                                g.f8236e.f4729b.zzK(Boolean.FALSE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    b bVar = g.f8234c;
                    if (bVar != null) {
                        MusicApp.c cVar = (MusicApp.c) bVar;
                        s1.l(th, true);
                    }
                }
            }
        }
    }

    static {
        r0 r0Var = new r0();
        r0Var.h();
        a = r0Var;
        f8235d = new Object();
        f8239h = new LinkedBlockingQueue();
        f8240i = -1;
        f8241j = false;
    }

    public static void a() {
        if (f8241j) {
            return;
        }
        try {
            ProviderInstaller.installIfNeeded(x0.f8405d);
            f8241j = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        r3.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(final boolean r3) {
        /*
            r0 = -1
            if (r3 == 0) goto L5
            e.h.e.g.f8240i = r0
        L5:
            int r1 = e.h.e.g.f8240i
            if (r1 != r0) goto L41
            boolean r0 = e.h.g.j1.f()
            if (r0 != 0) goto L39
            android.net.Uri r3 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L41
            java.lang.String r0 = "_id"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "is_music=1"
            r2 = 0
            android.database.Cursor r3 = f(r3, r0, r1, r2, r2)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L33
            int r0 = r3.getCount()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L27
            goto L33
        L27:
            int r0 = r3.getCount()     // Catch: java.lang.Throwable -> L2e
            e.h.e.g.f8240i = r0     // Catch: java.lang.Throwable -> L2e
            goto L33
        L2e:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L41
            throw r0     // Catch: java.lang.Throwable -> L41
        L33:
            if (r3 == 0) goto L41
            r3.close()     // Catch: java.lang.Throwable -> L41
            goto L41
        L39:
            e.h.e.e r0 = new e.h.e.e
            r0.<init>()
            e.h.g.j0.c(r0)
        L41:
            int r3 = e.h.e.g.f8240i
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.e.g.b(boolean):int");
    }

    public static boolean c() {
        if (f8234c != null && a.c() > TimeUnit.MINUTES.toMillis(1L)) {
            f8233b = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(x0.f8405d) == 0;
            a.g();
        }
        return f8233b;
    }

    public static boolean d() {
        return f8237f && c();
    }

    public static Cursor e(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2, int i2) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                return null;
            }
            if (i2 > 0) {
                Uri.Builder buildUpon = uri.buildUpon();
                uri = buildUpon.appendQueryParameter("limit", "" + i2).build();
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Cursor f(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        x0 x0Var = x0.f8405d;
        if (x0Var != null && v0.l()) {
            return e(x0Var, uri, strArr, str, null, null, 0);
        }
        return null;
    }

    public static void g(final String str) {
        j0.f(new j0.b() { // from class: e.h.e.f
            @Override // e.h.g.j0.b
            public final void a() {
                g.j(str);
            }
        });
    }

    public static void h(final String str, final double d2, final String str2) {
        j0.f(new j0.b() { // from class: e.h.e.d
            @Override // e.h.g.j0.b
            public final void a() {
                String str3 = str;
                double d3 = d2;
                String str4 = str2;
                if (g.d() && g.f8238g && g.f8234c != null) {
                    synchronized (g.f8235d) {
                        g.b bVar = g.f8234c;
                        if (bVar != null && ((MusicApp.c) bVar).a()) {
                            g.f8239h.add(new g.c(str3, d3, str4));
                        }
                    }
                }
            }
        });
    }

    public static void i(final String str, final Map<String, String> map) {
        j0.f(new j0.b() { // from class: e.h.e.a
            @Override // e.h.g.j0.b
            public final void a() {
                String str2 = str;
                Map map2 = map;
                if (g.d() && g.f8238g && g.f8234c != null) {
                    synchronized (g.f8235d) {
                        if (((MusicApp.c) g.f8234c).a()) {
                            g.f8239h.add(new g.c(str2, map2, 16842788L));
                        }
                    }
                }
            }
        });
    }

    public static boolean j(String str) {
        boolean z = false;
        if (d() && f8238g && f8234c != null) {
            synchronized (f8235d) {
                if (((MusicApp.c) f8234c).a()) {
                    f8239h.add(new c(str));
                    z = true;
                }
            }
        }
        return z;
    }

    public static void k(boolean z, boolean z2) {
        if (f8234c == null) {
            throw new NetworkOnMainThreadException();
        }
        if (!f8237f) {
            t1.f("Turning On Firebase " + z + " " + z2);
            f8238g = z;
            if (!j1.e()) {
                e.d.d.g.f(x0.f8405d);
                t1.f("Finished initializing Firebase");
            }
            f8237f = true;
            if (f8238g) {
                new Thread(new d(null)).start();
            }
        }
        f8238g = z;
    }
}
