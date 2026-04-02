package com.amazon.aps.iva.oa0;

import android.net.Uri;
import com.amazon.aps.iva.oa0.c0;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.commons.codec.binary.Hex;
/* compiled from: GeneralHttpService.java */
/* loaded from: classes4.dex */
public final class b0 extends c0 {
    public final com.amazon.aps.iva.b30.j b = new com.amazon.aps.iva.b30.j(b0.class.getSimpleName());

    public final HttpsURLConnection a(String str, Map map) {
        com.amazon.aps.iva.if0.c cVar;
        com.amazon.aps.iva.b30.j jVar = this.b;
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
            httpsURLConnection.setConnectTimeout(10000);
            httpsURLConnection.setReadTimeout(10000);
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, x.b);
            httpsURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpsURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
            if (map != null) {
                cVar = new com.amazon.aps.iva.if0.c((Map<?, ?>) map);
            } else {
                cVar = new com.amazon.aps.iva.if0.c();
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpsURLConnection.getOutputStream(), Hex.DEFAULT_CHARSET_NAME);
            outputStreamWriter.write(cVar.toString());
            outputStreamWriter.close();
            return httpsURLConnection;
        } catch (Throwable th) {
            f1.b(th);
            jVar.getClass();
            return null;
        }
    }

    public final void b(String str, Map<String, String> map, Map<String, String> map2, c0.a aVar) {
        HttpsURLConnection httpsURLConnection;
        InputStreamReader inputStreamReader;
        com.amazon.aps.iva.b30.j jVar = this.b;
        String str2 = "?a=" + u0.p.d.a;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                StringBuilder b = com.amazon.aps.iva.b6.x.b(str2, "&");
                b.append(Uri.encode(entry.getKey()));
                b.append("=");
                b.append(Uri.encode(entry.getValue()));
                str2 = b.toString();
            }
        }
        try {
            httpsURLConnection = a(com.amazon.aps.iva.n4.a.a(new StringBuilder(), this.a, str, com.amazon.aps.iva.k.q.b(str2, "&h=", f1.l(str2, u0.p.d.b))), map2);
        } catch (Throwable th) {
            th = th;
            httpsURLConnection = null;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
            try {
                aVar.onFailure("Error sending request: message - " + th.getMessage());
                f1.b(th);
                jVar.getClass();
                if (httpsURLConnection == null) {
                    return;
                }
                httpsURLConnection.disconnect();
            } finally {
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
            }
        }
        if (httpsURLConnection == null) {
            aVar.onFailure("Error sending request: connection is null");
            jVar.getClass();
            if (httpsURLConnection != null) {
                return;
            }
            return;
        }
        httpsURLConnection.connect();
        int responseCode = httpsURLConnection.getResponseCode();
        StringBuffer stringBuffer = new StringBuffer();
        InputStream inputStream = httpsURLConnection.getInputStream();
        if (httpsURLConnection.getContentEncoding() != null && httpsURLConnection.getContentEncoding().equals("gzip")) {
            inputStreamReader = new InputStreamReader(new GZIPInputStream(inputStream));
        } else {
            inputStreamReader = new InputStreamReader(inputStream);
        }
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            stringBuffer.append(readLine);
        }
        aVar.a(responseCode, stringBuffer.toString());
        httpsURLConnection.disconnect();
    }
}
