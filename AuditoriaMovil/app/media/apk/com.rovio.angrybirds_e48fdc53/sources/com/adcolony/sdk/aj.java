package com.adcolony.sdk;

import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
class aj implements Runnable {
    boolean d;
    int e;
    int f;
    private HttpURLConnection g;
    private InputStream h;
    private d i;
    private a j;
    private String l;
    private Map<String, List<String>> o;
    private final int k = 4096;
    private int m = 0;
    private boolean n = false;
    private String p = "";
    ExecutorService a = Executors.newSingleThreadExecutor();
    String b = "";
    String c = "";

    /* loaded from: classes2.dex */
    interface a {
        void a(aj ajVar, d dVar, Map<String, List<String>> map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aj(d dVar, a aVar) {
        this.i = dVar;
        this.j = aVar;
        try {
            this.a.submit(this);
        } catch (RejectedExecutionException e) {
            this.d = false;
            aVar.a(this, dVar, this.o);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = false;
        this.d = false;
        try {
            if (a()) {
                this.d = b();
                if (this.i.c().equals("WebServices.post") && this.f != 200) {
                    this.d = false;
                }
            }
            z = true;
        } catch (IllegalStateException e) {
            au.g.b("okhttp error: " + e.toString());
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            au.g.b("Out of memory error - disabling AdColony. (" + this.e + "/" + this.m + "): " + this.b);
            com.adcolony.sdk.a.a().a(true);
            z = true;
        } catch (MalformedURLException e3) {
            au.h.a("MalformedURLException: ").b(e3.toString());
            this.d = true;
            z = true;
        } catch (IOException e4) {
            au.f.a("Download of ").a(this.b).a(" failed: ").b(e4.toString());
            this.f = this.f == 0 ? 404 : this.f;
            z = true;
        } catch (Exception e5) {
            au.g.b("Exception: " + e5.toString());
            e5.printStackTrace();
            z = true;
        }
        if (this.d) {
            au.d.a("Downloaded ").b(this.b);
        }
        if (z) {
            this.j.a(this, this.i, this.o);
        }
    }

    private boolean a() {
        JSONObject b = this.i.b();
        String b2 = as.b(b, "content_type");
        String b3 = as.b(b, "content");
        boolean d = as.d(b, "no_redirect");
        this.b = as.b(b, "url");
        this.p = as.b(b, "filepath");
        this.l = as.b(b, "encoding");
        this.m = as.a(b, "max_size", 0);
        this.n = this.m != 0;
        this.e = 0;
        this.h = null;
        this.g = null;
        this.o = null;
        if (this.b.startsWith("file://")) {
            if (this.b.startsWith("file:///android_asset/")) {
                if (com.adcolony.sdk.a.d()) {
                    this.h = com.adcolony.sdk.a.c().getAssets().open(this.b.substring("file:///android_asset/".length()));
                }
            } else {
                this.h = new FileInputStream(this.b.substring("file://".length()));
            }
        } else {
            this.g = (HttpURLConnection) new URL(this.b).openConnection();
            this.g.setInstanceFollowRedirects(!d);
            this.g.setFixedLengthStreamingMode(b3.getBytes("UTF-8").length);
            this.g.setRequestProperty("Accept-Charset", "UTF-8");
            if (!b2.equals("")) {
                this.g.setRequestProperty(DownloadUtils.CONTENT_TYPE, b2);
            }
            if (this.i.c().equals("WebServices.post")) {
                this.g.setDoOutput(true);
                new PrintStream(this.g.getOutputStream()).print(b3);
            }
        }
        return (this.g == null && this.h == null) ? false : true;
    }

    private boolean b() {
        OutputStream outputStream = null;
        String c = this.i.c();
        if (this.h != null) {
            if (this.p.length() == 0) {
                outputStream = new ByteArrayOutputStream(4096);
            } else {
                outputStream = new FileOutputStream(new File(this.p).getAbsolutePath());
            }
        } else if (c.equals("WebServices.download")) {
            this.h = this.g.getInputStream();
            outputStream = new FileOutputStream(this.p);
        } else if (c.equals("WebServices.get")) {
            this.h = this.g.getInputStream();
            outputStream = new ByteArrayOutputStream(4096);
        } else if (c.equals("WebServices.post")) {
            this.g.connect();
            this.h = this.g.getResponseCode() == 200 ? this.g.getInputStream() : this.g.getErrorStream();
            outputStream = new ByteArrayOutputStream(4096);
        }
        if (this.g != null) {
            this.f = this.g.getResponseCode();
            this.o = this.g.getHeaderFields();
        }
        return a(this.h, outputStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.io.InputStream r7, java.io.OutputStream r8) {
        /*
            r6 = this;
            r3 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La9
            r2.<init>(r7)     // Catch: java.lang.Throwable -> La6 java.lang.Exception -> La9
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
        La:
            r3 = 0
            r4 = 4096(0x1000, float:5.74E-42)
            int r3 = r2.read(r1, r3, r4)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            r4 = -1
            if (r3 == r4) goto L76
            int r4 = r6.e     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            int r4 = r4 + r3
            r6.e = r4     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            boolean r4 = r6.n     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            if (r4 == 0) goto L71
            int r4 = r6.e     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            int r5 = r6.m     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            if (r4 <= r5) goto L71
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            r3.<init>()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            java.lang.String r4 = "Data exceeds expected maximum ("
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            int r4 = r6.e     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            java.lang.String r4 = "/"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            int r4 = r6.m     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            java.lang.String r4 = "): "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            java.net.HttpURLConnection r4 = r6.g     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            java.net.URL r4 = r4.getURL()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            r1.<init>(r3)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            throw r1     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
        L5e:
            r1 = move-exception
        L5f:
            throw r1     // Catch: java.lang.Throwable -> L60
        L60:
            r1 = move-exception
        L61:
            if (r8 == 0) goto L66
            r8.close()
        L66:
            if (r7 == 0) goto L6b
            r7.close()
        L6b:
            if (r2 == 0) goto L70
            r2.close()
        L70:
            throw r1
        L71:
            r4 = 0
            r8.write(r1, r4, r3)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            goto La
        L76:
            java.lang.String r1 = "UTF-8"
            java.lang.String r3 = r6.l     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            if (r3 == 0) goto Lac
            java.lang.String r3 = r6.l     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            if (r3 != 0) goto Lac
            java.lang.String r1 = r6.l     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            r3 = r1
        L87:
            boolean r1 = r8 instanceof java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            if (r1 == 0) goto L95
            r0 = r8
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            r1 = r0
            java.lang.String r1 = r1.toString(r3)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
            r6.c = r1     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L60
        L95:
            r1 = 1
            if (r8 == 0) goto L9b
            r8.close()
        L9b:
            if (r7 == 0) goto La0
            r7.close()
        La0:
            if (r2 == 0) goto La5
            r2.close()
        La5:
            return r1
        La6:
            r1 = move-exception
            r2 = r3
            goto L61
        La9:
            r1 = move-exception
            r2 = r3
            goto L5f
        Lac:
            r3 = r1
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.aj.a(java.io.InputStream, java.io.OutputStream):boolean");
    }
}
