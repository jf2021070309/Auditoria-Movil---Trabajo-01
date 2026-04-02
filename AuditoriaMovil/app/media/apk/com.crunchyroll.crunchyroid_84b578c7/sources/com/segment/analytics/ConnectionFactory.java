package com.segment.analytics;

import com.amazon.aps.iva.oa.a;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
/* loaded from: classes4.dex */
public class ConnectionFactory {
    private static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 15000;
    private static final int DEFAULT_READ_TIMEOUT_MILLIS = 20000;
    static final String USER_AGENT = "analytics-android/4.11.3";

    public HttpURLConnection openConnection(String str) throws IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(DEFAULT_CONNECT_TIMEOUT_MILLIS);
            httpURLConnection.setReadTimeout(DEFAULT_READ_TIMEOUT_MILLIS);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, USER_AGENT);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        } catch (MalformedURLException e) {
            throw new IOException(a.a("Attempted to use malformed url: ", str), e);
        }
    }

    public HttpURLConnection projectSettings(String str) throws IOException {
        return openConnection("https://cdn-settings.segment.com/v1/projects/" + str + "/settings");
    }

    public HttpURLConnection upload(String str) throws IOException {
        HttpURLConnection openConnection = openConnection(String.format("https://%s/import", str));
        openConnection.setRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
        openConnection.setDoOutput(true);
        openConnection.setChunkedStreamingMode(0);
        return openConnection;
    }
}
