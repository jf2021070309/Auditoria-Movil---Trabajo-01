package com.amazon.aps.iva.wa;

import android.content.SharedPreferences;
import com.amazon.aps.iva.a9.w;
import com.amazon.aps.iva.types.ApsIvaConfigKeys;
import com.amazon.aps.iva.util.LogUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import javax.net.ssl.HttpsURLConnection;
/* compiled from: ApsIvaConfigFetcher.java */
/* loaded from: classes.dex */
public final class f {
    public static final String h = ApsIvaConfigKeys.AMAZON_SIMID_CONTAINER_HTML.getConfigKeyName();
    public static final String i = ApsIvaConfigKeys.AMAZON_SIMID_CONTAINER_JS_INTERFACE_NAME.getConfigKeyName();
    public static final String j = ApsIvaConfigKeys.METRIC_LOGGER_HTTP_URL.getConfigKeyName();
    public static final String k = ApsIvaConfigKeys.SHARED_PREFERENCES_EXPIRY_TIME.getConfigKeyName();
    public final g b;
    public final com.amazon.aps.iva.l9.a c;
    public SharedPreferences f;
    public final int a = (int) new Date().getTime();
    public JsonObject d = null;
    public final com.amazon.aps.iva.e.h g = new com.amazon.aps.iva.e.h(this, 6);
    public final Gson e = w.c().b();

    public f(com.amazon.aps.iva.l9.a aVar, g gVar) {
        this.b = gVar;
        this.c = aVar;
    }

    public static void a(InputStream inputStream, HttpsURLConnection httpsURLConnection) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException | RuntimeException e) {
                LogUtils.e("e", String.format("ApsIvaConfigFetcher: Unable To Close Input Stream: %s", e));
            }
        }
        try {
            httpsURLConnection.disconnect();
        } catch (RuntimeException e2) {
            LogUtils.e("e", String.format("ApsIvaConfigFetcher: Unable To Close Url Connection: %s", e2));
        }
    }

    public static boolean b(HttpsURLConnection httpsURLConnection) {
        try {
            httpsURLConnection.setReadTimeout(10000);
            httpsURLConnection.setConnectTimeout(10000);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.connect();
            if (200 != httpsURLConnection.getResponseCode()) {
                LogUtils.w("e", "Config fetcher response code: %s", String.valueOf(httpsURLConnection.getResponseCode()));
            }
            return true;
        } catch (IOException e) {
            LogUtils.e("e", String.format("ApsIvaConfigFetcher: Error In Setting The Connection Parameters: %s", e));
            return false;
        }
    }

    public final String c() {
        IOException e;
        HttpsURLConnection httpsURLConnection;
        SocketTimeoutException e2;
        StringBuilder sb = new StringBuilder();
        InputStream inputStream = null;
        try {
            try {
                httpsURLConnection = (HttpsURLConnection) ((URL) this.c.a).openConnection();
                try {
                    if (b(httpsURLConnection)) {
                        inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        bufferedReader.close();
                    }
                    a(inputStream, httpsURLConnection);
                } catch (SocketTimeoutException e3) {
                    e2 = e3;
                    LogUtils.e("e", String.format("ApsIvaConfigFetcher: HttpConnection Timeout Error: %s", e2));
                    a(inputStream, httpsURLConnection);
                    return sb.toString();
                } catch (IOException e4) {
                    e = e4;
                    LogUtils.e("e", String.format("ApsIvaConfigFetcher: IO Error While Reading Configs: %s", e));
                    a(inputStream, httpsURLConnection);
                    return sb.toString();
                }
            } catch (Throwable th) {
                th = th;
                a(null, null);
                throw th;
            }
        } catch (SocketTimeoutException e5) {
            e2 = e5;
            httpsURLConnection = null;
        } catch (IOException e6) {
            e = e6;
            httpsURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            a(null, null);
            throw th;
        }
        return sb.toString();
    }

    public final void d() {
        SharedPreferences.Editor edit = this.f.edit();
        JsonObject jsonObject = this.d;
        String str = h;
        edit.putString(str, jsonObject.get(str).getAsString());
        JsonObject jsonObject2 = this.d;
        String str2 = i;
        edit.putString(str2, jsonObject2.get(str2).getAsString());
        JsonObject jsonObject3 = this.d;
        String str3 = j;
        edit.putString(str3, jsonObject3.get(str3).getAsString());
        JsonObject jsonObject4 = this.d;
        String str4 = k;
        edit.putInt(str4, jsonObject4.get(str4).getAsInt() + this.a);
        edit.putString("featureFlags", String.valueOf(this.d.get("featureFlags")));
        ApsIvaConfigKeys apsIvaConfigKeys = ApsIvaConfigKeys.METRIC_SAMPLING_RATES;
        edit.putString(apsIvaConfigKeys.getConfigKeyName(), String.valueOf(this.d.get(apsIvaConfigKeys.getConfigKeyName())));
        edit.apply();
    }
}
