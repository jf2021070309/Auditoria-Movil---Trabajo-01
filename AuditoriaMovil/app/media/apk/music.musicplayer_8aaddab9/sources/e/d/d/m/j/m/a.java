package e.d.d.m.j.m;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.rolling.helper.Compressor;
import e.d.d.m.j.f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
/* loaded from: classes2.dex */
public class a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f7497b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f7498c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.a = str;
        this.f7497b = map;
    }

    public final String a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(next.getKey());
        sb2.append("=");
        sb2.append(next.getValue() != null ? next.getValue() : "");
        sb.append(sb2.toString());
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            StringBuilder y = e.a.d.a.a.y("&");
            y.append(next2.getKey());
            y.append("=");
            y.append(next2.getValue() != null ? next2.getValue() : "");
            sb.append(y.toString());
        }
        String sb3 = sb.toString();
        if (sb3.isEmpty()) {
            return str;
        }
        if (str.contains(CallerData.NA)) {
            if (!str.endsWith("&")) {
                sb3 = e.a.d.a.a.k("&", sb3);
            }
            return e.a.d.a.a.k(str, sb3);
        }
        return e.a.d.a.a.l(str, CallerData.NA, sb3);
    }

    public c b() throws IOException {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String sb = null;
        inputStream = null;
        try {
            String a = a(this.a, this.f7497b);
            f.a.a(2);
            httpsURLConnection = (HttpsURLConnection) new URL(a).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f7498c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[Compressor.BUFFER_SIZE];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, read);
                        }
                        sb = sb2.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, sb);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }
}
