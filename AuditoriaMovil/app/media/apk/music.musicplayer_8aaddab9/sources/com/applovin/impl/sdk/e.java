package com.applovin.impl.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class e {
    private static final int a = (int) TimeUnit.SECONDS.toMillis(30);

    /* renamed from: l  reason: collision with root package name */
    private static final e f4009l = new e();

    /* renamed from: c  reason: collision with root package name */
    private Handler f4011c;

    /* renamed from: e  reason: collision with root package name */
    private Handler f4013e;

    /* renamed from: h  reason: collision with root package name */
    private long f4016h;

    /* renamed from: i  reason: collision with root package name */
    private long f4017i;

    /* renamed from: j  reason: collision with root package name */
    private long f4018j;

    /* renamed from: k  reason: collision with root package name */
    private URL f4019k;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f4010b = new AtomicLong(0);

    /* renamed from: d  reason: collision with root package name */
    private final HandlerThread f4012d = new HandlerThread("applovin-anr-detector");

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f4014f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f4015g = new AtomicBoolean();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f4014f.get()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - e.this.f4010b.get();
            if (currentTimeMillis < 0 || currentTimeMillis > e.this.f4016h) {
                e.this.a();
                e.this.b();
            }
            e.this.f4013e.postDelayed(this, e.this.f4018j);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f4014f.get()) {
                return;
            }
            e.this.f4010b.set(System.currentTimeMillis());
            e.this.f4011c.postDelayed(this, e.this.f4017i);
        }
    }

    private e() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f4016h = timeUnit.toMillis(4L);
        this.f4017i = timeUnit.toMillis(3L);
        this.f4018j = timeUnit.toMillis(3L);
        this.f4019k = null;
    }

    private static String a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f4015g.get()) {
            this.f4014f.set(true);
        }
    }

    public static void a(m mVar) {
        if (mVar != null) {
            if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.eU)).booleanValue()) {
                f4009l.b(mVar);
            } else {
                f4009l.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            URL url = this.f4019k;
            if (url != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                int i2 = a;
                httpURLConnection.setConnectTimeout(i2);
                httpURLConnection.setReadTimeout(i2);
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.getResponseCode();
            }
        } catch (Throwable th) {
            Log.w("applovin-anr-detector", "Failed to report ANR", th);
        }
    }

    private void b(m mVar) {
        if (this.f4015g.compareAndSet(false, true)) {
            this.f4016h = ((Long) mVar.a(com.applovin.impl.sdk.c.b.eV)).longValue();
            this.f4017i = ((Long) mVar.a(com.applovin.impl.sdk.c.b.eW)).longValue();
            this.f4018j = ((Long) mVar.a(com.applovin.impl.sdk.c.b.eX)).longValue();
            this.f4011c = new Handler(mVar.L().getMainLooper());
            this.f4019k = c(mVar);
            this.f4012d.start();
            this.f4011c.post(new b());
            Handler handler = new Handler(this.f4012d.getLooper());
            this.f4013e = handler;
            handler.postDelayed(new a(), this.f4018j / 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b0 A[Catch: MalformedURLException -> 0x00e7, TryCatch #2 {MalformedURLException -> 0x00e7, blocks: (B:8:0x0017, B:10:0x00b0, B:11:0x00b2, B:13:0x00c0, B:14:0x00c2), top: B:22:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0 A[Catch: MalformedURLException -> 0x00e7, TryCatch #2 {MalformedURLException -> 0x00e7, blocks: (B:8:0x0017, B:10:0x00b0, B:11:0x00b2, B:13:0x00c0, B:14:0x00c2), top: B:22:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.URL c(com.applovin.impl.sdk.m r8) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            android.content.Context r1 = r8.L()
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L15
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r1, r3)     // Catch: java.lang.Throwable -> L16
            goto L17
        L15:
            r1 = r0
        L16:
            r4 = r2
        L17:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.net.MalformedURLException -> Le7
            r5.<init>()     // Catch: java.net.MalformedURLException -> Le7
            com.applovin.impl.sdk.c.b<java.lang.String> r6 = com.applovin.impl.sdk.c.b.bf     // Catch: java.net.MalformedURLException -> Le7
            java.lang.Object r6 = r8.a(r6)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.net.MalformedURLException -> Le7
            r5.append(r6)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r6 = "?type=anr&platform="
            r5.append(r6)     // Catch: java.net.MalformedURLException -> Le7
            com.applovin.impl.sdk.o r6 = r8.V()     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r6 = r6.f()     // Catch: java.net.MalformedURLException -> Le7
            r5.append(r6)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r6 = "&package_name="
            r5.append(r6)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r1 = a(r1)     // Catch: java.net.MalformedURLException -> Le7
            r5.append(r1)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r1 = "&applovin_random_token="
            r5.append(r1)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r1 = r8.o()     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r1 = a(r1)     // Catch: java.net.MalformedURLException -> Le7
            r5.append(r1)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r1 = "&compass_random_token="
            r5.append(r1)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = r8.n()     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = a(r8)     // Catch: java.net.MalformedURLException -> Le7
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = "&model="
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = android.os.Build.MODEL     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = a(r8)     // Catch: java.net.MalformedURLException -> Le7
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = "&brand="
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = android.os.Build.MANUFACTURER     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = a(r8)     // Catch: java.net.MalformedURLException -> Le7
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = "&brand_name="
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = android.os.Build.BRAND     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = a(r8)     // Catch: java.net.MalformedURLException -> Le7
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = "&hardware="
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = android.os.Build.HARDWARE     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = a(r8)     // Catch: java.net.MalformedURLException -> Le7
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = "&revision="
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = android.os.Build.DEVICE     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = a(r8)     // Catch: java.net.MalformedURLException -> Le7
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = "&app_version="
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            if (r4 == 0) goto Lb2
            java.lang.String r0 = r4.versionName     // Catch: java.net.MalformedURLException -> Le7
        Lb2:
            java.lang.String r8 = a(r0)     // Catch: java.net.MalformedURLException -> Le7
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = "&app_version_code="
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            if (r4 == 0) goto Lc2
            int r3 = r4.versionCode     // Catch: java.net.MalformedURLException -> Le7
        Lc2:
            r5.append(r3)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = "&os="
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = a(r8)     // Catch: java.net.MalformedURLException -> Le7
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = "&api_level="
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: java.net.MalformedURLException -> Le7
            r5.append(r8)     // Catch: java.net.MalformedURLException -> Le7
            java.lang.String r8 = r5.toString()     // Catch: java.net.MalformedURLException -> Le7
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> Le7
            r0.<init>(r8)     // Catch: java.net.MalformedURLException -> Le7
            return r0
        Le7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.c(com.applovin.impl.sdk.m):java.net.URL");
    }
}
