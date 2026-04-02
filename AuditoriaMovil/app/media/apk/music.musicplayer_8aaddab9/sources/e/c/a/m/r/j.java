package e.c.a.m.r;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import e.c.a.m.r.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
/* loaded from: classes.dex */
public class j implements d<InputStream> {
    public static final b a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final e.c.a.m.t.g f5570b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5571c;

    /* renamed from: d  reason: collision with root package name */
    public HttpURLConnection f5572d;

    /* renamed from: e  reason: collision with root package name */
    public InputStream f5573e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f5574f;

    /* loaded from: classes.dex */
    public static class a implements b {
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public j(e.c.a.m.t.g gVar, int i2) {
        this.f5570b = gVar;
        this.f5571c = i2;
    }

    @Override // e.c.a.m.r.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // e.c.a.m.r.d
    public void b() {
        InputStream inputStream = this.f5573e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f5572d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f5572d = null;
    }

    public final InputStream c(URL url, int i2, URL url2, Map<String, String> map) throws IOException {
        if (i2 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new e.c.a.m.e("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f5572d = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f5572d.addRequestProperty(entry.getKey(), entry.getValue());
            }
            this.f5572d.setConnectTimeout(this.f5571c);
            this.f5572d.setReadTimeout(this.f5571c);
            this.f5572d.setUseCaches(false);
            this.f5572d.setDoInput(true);
            this.f5572d.setInstanceFollowRedirects(false);
            this.f5572d.connect();
            this.f5573e = this.f5572d.getInputStream();
            if (this.f5574f) {
                return null;
            }
            int responseCode = this.f5572d.getResponseCode();
            int i3 = responseCode / 100;
            if (i3 == 2) {
                HttpURLConnection httpURLConnection = this.f5572d;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.f5573e = new e.c.a.s.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
                } else {
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        httpURLConnection.getContentEncoding();
                    }
                    this.f5573e = httpURLConnection.getInputStream();
                }
                return this.f5573e;
            }
            if (!(i3 == 3)) {
                if (responseCode == -1) {
                    throw new e.c.a.m.e(responseCode);
                }
                throw new e.c.a.m.e(this.f5572d.getResponseMessage(), responseCode);
            }
            String headerField = this.f5572d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new e.c.a.m.e("Received empty or null redirect url");
            }
            URL url3 = new URL(url, headerField);
            b();
            return c(url3, i2 + 1, url, map);
        }
        throw new e.c.a.m.e("Too many (> 5) redirects!");
    }

    @Override // e.c.a.m.r.d
    public void cancel() {
        this.f5574f = true;
    }

    @Override // e.c.a.m.r.d
    public e.c.a.m.a d() {
        return e.c.a.m.a.REMOTE;
    }

    @Override // e.c.a.m.r.d
    public void e(e.c.a.f fVar, d.a<? super InputStream> aVar) {
        int i2 = e.c.a.s.f.f6026b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.f(c(this.f5570b.d(), 0, null, this.f5570b.f5789b.a()));
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            } catch (IOException e2) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.c(e2);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            }
            e.c.a.s.f.a(elapsedRealtimeNanos);
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                e.c.a.s.f.a(elapsedRealtimeNanos);
            }
            throw th;
        }
    }
}
