package com.fyber.inneractive.sdk.m;

import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.fyber.inneractive.sdk.util.q;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class i {
    private static final byte[] a = new byte[0];
    private static final i b = new i();
    private final h<k> c = new h<>();

    public static void b() {
    }

    public static i a() {
        return b;
    }

    public final WebResourceResponse a(WebResourceRequest webResourceRequest, int i, int i2, int i3) {
        URL url;
        HttpURLConnection httpURLConnection;
        if (webResourceRequest.getUrl() != null && webResourceRequest.getUrl().getScheme() != null && webResourceRequest.getUrl().getScheme().startsWith("http") && TextUtils.equals(webResourceRequest.getMethod(), "GET")) {
            j jVar = this.c.get(new k(webResourceRequest));
            if (jVar != null) {
                return jVar.b();
            }
            try {
                url = new URL(webResourceRequest.getUrl().toString());
            } catch (MalformedURLException unused) {
                url = null;
            }
            if (url != null) {
                ByteBuffer b2 = com.fyber.inneractive.sdk.util.c.a().b();
                try {
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    try {
                        httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                        httpURLConnection.setInstanceFollowRedirects(false);
                        a(webResourceRequest, httpURLConnection);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    httpURLConnection = null;
                }
                if (httpURLConnection != null) {
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i2);
                    j jVar2 = null;
                    while (i3 > 0) {
                        try {
                            jVar2 = a(httpURLConnection, b2);
                        } catch (SocketTimeoutException | UnknownHostException unused4) {
                        } catch (Throwable unused5) {
                            i3 = 0;
                        }
                        if (jVar2 != null) {
                            break;
                        }
                        i3--;
                    }
                    if (jVar2 != null) {
                        try {
                            if (jVar2.a()) {
                                this.c.put(new k(webResourceRequest), jVar2);
                            }
                            WebResourceResponse b3 = jVar2.b();
                            httpURLConnection.disconnect();
                            com.fyber.inneractive.sdk.util.c.a().a(b2);
                            return b3;
                        } catch (Throwable unused6) {
                        }
                    }
                    httpURLConnection.disconnect();
                    com.fyber.inneractive.sdk.util.c.a().a(b2);
                }
            }
        }
        return null;
    }

    private static j a(HttpURLConnection httpURLConnection, ByteBuffer byteBuffer) throws IOException {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        String str;
        String str2;
        httpURLConnection.connect();
        for (int i = 0; i < 20; i++) {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 300 || responseCode >= 400) {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byte[] array = byteBuffer.array();
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            try {
                                int read = inputStream.read(array);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(array, 0, read);
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        byteArrayOutputStream = null;
                    }
                } catch (Throwable unused3) {
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
                q.a((Closeable) inputStream);
                httpURLConnection.disconnect();
                String contentType = httpURLConnection.getContentType();
                if (TextUtils.isEmpty(contentType)) {
                    str = "";
                    str2 = str;
                } else {
                    String[] split = contentType.split(";");
                    String trim = split.length > 0 ? split[0].trim() : "";
                    if (split.length > 1) {
                        str2 = split[1].trim();
                        str = trim;
                    } else {
                        str = trim;
                        str2 = "";
                    }
                }
                HashMap<String, String> a2 = a(httpURLConnection);
                String responseMessage = httpURLConnection.getResponseMessage();
                if (TextUtils.isEmpty(responseMessage)) {
                    return null;
                }
                return new j(byteArrayOutputStream == null ? a : byteArrayOutputStream.toByteArray(), a2, str, str2, responseCode, responseMessage);
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                return null;
            }
            httpURLConnection.disconnect();
            httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
            httpURLConnection.connect();
        }
        return null;
    }

    private static HashMap<String, String> a(HttpURLConnection httpURLConnection) {
        HashMap<String, String> hashMap = new HashMap<>();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields != null) {
            for (String str : headerFields.keySet()) {
                List<String> list = headerFields.get(str);
                if (list != null && list.size() > 0) {
                    hashMap.put(str, list.get(0));
                }
            }
        }
        return hashMap;
    }

    private static void a(WebResourceRequest webResourceRequest, HttpURLConnection httpURLConnection) {
        if (webResourceRequest.getRequestHeaders() == null || webResourceRequest.getRequestHeaders().size() <= 0) {
            return;
        }
        for (String str : webResourceRequest.getRequestHeaders().keySet()) {
            if (str != null && webResourceRequest.getRequestHeaders().get(str) != null) {
                httpURLConnection.setRequestProperty(str, webResourceRequest.getRequestHeaders().get(str));
            }
        }
    }
}
