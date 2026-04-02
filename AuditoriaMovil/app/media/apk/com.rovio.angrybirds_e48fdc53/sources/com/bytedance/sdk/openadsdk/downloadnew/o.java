package com.bytedance.sdk.openadsdk.downloadnew;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
/* loaded from: classes.dex */
public class o {
    public static HttpURLConnection dr(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Exception e) {
        }
        try {
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("accept", "*/*");
            httpURLConnection.setRequestProperty("connection", "Keep-Alive");
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                return httpURLConnection;
            }
            if (responseCode >= 300 && responseCode < 400) {
                return dr(httpURLConnection.getHeaderField("Location"), map);
            }
            return httpURLConnection;
        } catch (Exception e2) {
            httpURLConnection3 = httpURLConnection2;
            return httpURLConnection3;
        }
    }

    public static Map<String, String> dr(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        int size = httpURLConnection.getHeaderFields().size();
        for (int i = 0; i < size; i++) {
            hashMap.put(httpURLConnection.getHeaderFieldKey(i), httpURLConnection.getHeaderField(i));
        }
        return hashMap;
    }

    public static dr dr(String str, List<HttpHeader> list) throws IOException {
        int responseCode;
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty()) {
            for (HttpHeader httpHeader : list) {
                hashMap.put(httpHeader.getName(), httpHeader.getValue());
            }
        }
        HttpURLConnection dr2 = dr(str, hashMap);
        if (dr2 == null || (responseCode = dr2.getResponseCode()) < 200 || responseCode >= 300) {
            return null;
        }
        Map<String, String> dr3 = dr(dr2);
        InputStream inputStream = dr2.getInputStream();
        String contentEncoding = dr2.getContentEncoding();
        if (!TextUtils.isEmpty(contentEncoding) && contentEncoding.contains("gzip")) {
            inputStream = new GZIPInputStream(inputStream);
        }
        return new dr(inputStream, dr3, responseCode, dr2);
    }

    /* loaded from: classes.dex */
    public static class dr {
        public InputStream dr;
        public HttpURLConnection g;
        public Map<String, String> ge;
        public int o;

        public dr(InputStream inputStream, Map<String, String> map, int i, HttpURLConnection httpURLConnection) {
            this.dr = inputStream;
            this.ge = map;
            this.o = i;
            this.g = httpURLConnection;
        }
    }
}
