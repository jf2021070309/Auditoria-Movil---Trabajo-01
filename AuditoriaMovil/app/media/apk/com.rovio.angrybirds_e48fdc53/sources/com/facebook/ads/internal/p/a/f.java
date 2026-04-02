package com.facebook.ads.internal.p.a;

import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes2.dex */
public abstract class f implements q {
    private final r a;

    public f() {
        this(new g());
    }

    public f(r rVar) {
        this.a = rVar;
    }

    @Override // com.facebook.ads.internal.p.a.q
    public OutputStream a(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.facebook.ads.internal.p.a.q
    public HttpURLConnection a(String str) {
        return (HttpURLConnection) new URL(str).openConnection();
    }

    @Override // com.facebook.ads.internal.p.a.q
    public void a(OutputStream outputStream, byte[] bArr) {
        outputStream.write(bArr);
    }

    @Override // com.facebook.ads.internal.p.a.q
    public void a(HttpURLConnection httpURLConnection, j jVar, String str) {
        httpURLConnection.setRequestMethod(jVar.c());
        httpURLConnection.setDoOutput(jVar.b());
        httpURLConnection.setDoInput(jVar.a());
        if (str != null) {
            httpURLConnection.setRequestProperty(DownloadUtils.CONTENT_TYPE, str);
        }
        httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
    }

    @Override // com.facebook.ads.internal.p.a.q
    public boolean a(m mVar) {
        n a = mVar.a();
        if (this.a.a()) {
            this.a.a("BasicRequestHandler.onError got");
            mVar.printStackTrace();
        }
        return a != null && a.a() > 0;
    }

    @Override // com.facebook.ads.internal.p.a.q
    public byte[] a(InputStream inputStream) {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // com.facebook.ads.internal.p.a.q
    public InputStream b(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getInputStream();
    }
}
