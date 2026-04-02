package com.moat.analytics.mobile.vng;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes2.dex */
class q {
    q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.IOException] */
    public static com.moat.analytics.mobile.vng.a.b.a<String> a(String str) {
        com.moat.analytics.mobile.vng.a.b.a<String> a;
        ?? e = 0;
        e = 0;
        e = 0;
        e = 0;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() >= 400) {
                    a = com.moat.analytics.mobile.vng.a.b.a.a();
                    if (0 != 0) {
                        try {
                            e.close();
                        } catch (IOException e2) {
                            e = e2;
                        }
                    }
                } else {
                    e = httpURLConnection.getInputStream();
                    a = com.moat.analytics.mobile.vng.a.b.a.a(a((InputStream) e));
                    if (e != 0) {
                        try {
                            e.close();
                        } catch (IOException e3) {
                            e = e3;
                        }
                    }
                }
            } catch (Throwable th) {
                if (e != 0) {
                    try {
                        e.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            a = com.moat.analytics.mobile.vng.a.b.a.a();
            if (e != 0) {
                try {
                    e.close();
                } catch (IOException e6) {
                    e = e6;
                }
            }
        }
        return a;
    }

    private static String a(InputStream inputStream) {
        char[] cArr = new char[256];
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        int i = 0;
        do {
            int read = inputStreamReader.read(cArr, 0, cArr.length);
            if (read <= 0) {
                break;
            }
            i += read;
            sb.append(cArr, 0, read);
        } while (i < 1024);
        return sb.toString();
    }
}
