package com.fyber.inneractive.sdk.player.c.j;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.player.c.j.r;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class n implements r {
    private static final Pattern b = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> c = new AtomicReference<>();
    private final boolean d;
    private final int e;
    private final int f;
    private final String g;
    private final com.fyber.inneractive.sdk.player.c.k.m<String> h;
    private final r.f i;
    private final r.f j;
    private final u<? super n> k;
    private i l;
    private HttpURLConnection m;
    private InputStream n;
    private boolean o;
    private long p;
    private long q;
    private long r;
    private long s;

    public n(String str, u<? super n> uVar, int i, int i2, boolean z, r.f fVar) {
        if (!TextUtils.isEmpty(str)) {
            this.g = str;
            this.h = null;
            this.k = uVar;
            this.j = new r.f();
            this.e = i;
            this.f = i2;
            this.d = z;
            this.i = fVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        r0 = r1;
     */
    @Override // com.fyber.inneractive.sdk.player.c.j.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.fyber.inneractive.sdk.player.c.j.i r25) throws com.fyber.inneractive.sdk.player.c.j.r.c {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.j.n.a(com.fyber.inneractive.sdk.player.c.j.i):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r3 > android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) goto L26;
     */
    @Override // com.fyber.inneractive.sdk.player.c.j.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() throws com.fyber.inneractive.sdk.player.c.j.r.c {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.n     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L7b
            java.net.HttpURLConnection r2 = r9.m     // Catch: java.lang.Throwable -> L8e
            long r3 = r9.q     // Catch: java.lang.Throwable -> L8e
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L13
            long r3 = r9.q     // Catch: java.lang.Throwable -> L8e
            goto L18
        L13:
            long r3 = r9.q     // Catch: java.lang.Throwable -> L8e
            long r7 = r9.s     // Catch: java.lang.Throwable -> L8e
            long r3 = r3 - r7
        L18:
            int r7 = com.fyber.inneractive.sdk.player.c.k.t.a     // Catch: java.lang.Throwable -> L8e
            r8 = 19
            if (r7 == r8) goto L24
            int r7 = com.fyber.inneractive.sdk.player.c.k.t.a     // Catch: java.lang.Throwable -> L8e
            r8 = 20
            if (r7 != r8) goto L6b
        L24:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L34
            int r3 = r2.read()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            r4 = -1
            if (r3 != r4) goto L3a
            goto L6b
        L34:
            r5 = 2048(0x800, double:1.0118E-320)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L6b
        L3a:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            if (r4 != 0) goto L52
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            if (r3 == 0) goto L6b
        L52:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> L8e
        L6b:
            java.io.InputStream r2 = r9.n     // Catch: java.io.IOException -> L71 java.lang.Throwable -> L8e
            r2.close()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> L8e
            goto L7b
        L71:
            r2 = move-exception
            com.fyber.inneractive.sdk.player.c.j.r$c r3 = new com.fyber.inneractive.sdk.player.c.j.r$c     // Catch: java.lang.Throwable -> L8e
            com.fyber.inneractive.sdk.player.c.j.i r4 = r9.l     // Catch: java.lang.Throwable -> L8e
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L8e
            throw r3     // Catch: java.lang.Throwable -> L8e
        L7b:
            r9.n = r0
            r9.c()
            boolean r0 = r9.o
            if (r0 == 0) goto L8d
            r9.o = r1
            com.fyber.inneractive.sdk.player.c.j.u<? super com.fyber.inneractive.sdk.player.c.j.n> r0 = r9.k
            if (r0 == 0) goto L8d
            r0.b()
        L8d:
            return
        L8e:
            r2 = move-exception
            r9.n = r0
            r9.c()
            boolean r0 = r9.o
            if (r0 == 0) goto La1
            r9.o = r1
            com.fyber.inneractive.sdk.player.c.j.u<? super com.fyber.inneractive.sdk.player.c.j.n> r0 = r9.k
            if (r0 == 0) goto La1
            r0.b()
        La1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.j.n.b():void");
    }

    private HttpURLConnection a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.e);
        httpURLConnection.setReadTimeout(this.f);
        r.f fVar = this.i;
        if (fVar != null) {
            for (Map.Entry<String, String> entry : fVar.a().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.j.a().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.g);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long a(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L29
            long r4 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L15
            goto L2b
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.<init>(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r3, r1)
        L29:
            r4 = -1
        L2b:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L9b
            java.util.regex.Pattern r1 = com.fyber.inneractive.sdk.player.c.j.n.b
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L9b
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: java.lang.NumberFormatException -> L87
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L87
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: java.lang.NumberFormatException -> L87
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L87
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L61
            r4 = r6
            goto L9b
        L61:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L9b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r8 = "Inconsistent headers ["
            r1.<init>(r8)     // Catch: java.lang.NumberFormatException -> L87
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> L87
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L87
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> L87
            java.lang.String r0 = r1.toString()     // Catch: java.lang.NumberFormatException -> L87
            android.util.Log.w(r3, r0)     // Catch: java.lang.NumberFormatException -> L87
            long r0 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> L87
            r4 = r0
            goto L9b
        L87:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.<init>(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            android.util.Log.e(r3, r10)
        L9b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.j.n.a(java.net.HttpURLConnection):long");
    }

    private void c() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.m = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final int a(byte[] bArr, int i, int i2) throws r.c {
        try {
            if (this.r != this.p) {
                byte[] andSet = c.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.r != this.p) {
                    int read = this.n.read(andSet, 0, (int) Math.min(this.p - this.r, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.r += read;
                    if (this.k != null) {
                        this.k.a(read);
                    }
                }
                c.set(andSet);
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.q != -1) {
                long j = this.q - this.s;
                if (j == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j);
            }
            int read2 = this.n.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.q == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.s += read2;
            if (this.k != null) {
                this.k.a(read2);
            }
            return read2;
        } catch (IOException e) {
            throw new r.c(e, this.l, 2);
        }
    }
}
