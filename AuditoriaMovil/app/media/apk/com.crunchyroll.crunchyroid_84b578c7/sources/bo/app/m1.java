package bo.app;

import android.net.TrafficStats;
import com.braze.support.BrazeLogger;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import org.apache.commons.codec.binary.Hex;
/* loaded from: classes.dex */
public final class m1 implements a2 {
    public static final a b = new a(null);
    private static final int c = (int) TimeUnit.SECONDS.toMillis(15);
    private final int a;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final InputStream a(HttpURLConnection httpURLConnection) {
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode / 100 == 2) {
                if (com.amazon.aps.iva.oe0.m.Z("gzip", httpURLConnection.getContentEncoding())) {
                    return new GZIPInputStream(httpURLConnection.getInputStream());
                }
                return new BufferedInputStream(httpURLConnection.getInputStream());
            }
            StringBuilder d = com.amazon.aps.iva.e4.e.d("Bad HTTP response code from Braze: [", responseCode, "] to url: ");
            d.append(httpURLConnection.getURL());
            throw new f3(d.toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.if0.b bVar) {
            super(0);
            this.b = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Unable to parse json response from server. Response: [" + this.b + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ URL b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(URL url) {
            super(0);
            this.b = url;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get result from [" + this.b + "].";
        }
    }

    public m1(int i) {
        this.a = i;
    }

    @Override // bo.app.a2
    public com.amazon.aps.iva.kb0.j a(q4 q4Var, Map map, com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(q4Var, "requestTarget");
        com.amazon.aps.iva.yb0.j.f(map, "requestHeaders");
        com.amazon.aps.iva.yb0.j.f(cVar, "payload");
        TrafficStats.setThreadStatsTag(1337);
        URL b2 = q4Var.b();
        try {
            HttpURLConnection a2 = a(b2, cVar, map);
            InputStreamReader inputStreamReader = new InputStreamReader(b.a(a2), com.amazon.aps.iva.oe0.a.b);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String y = com.amazon.aps.iva.aq.k.y(bufferedReader);
                com.amazon.aps.iva.a60.b.k(bufferedReader, null);
                com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c(y);
                Map<String, List<String>> headerFields = a2.getHeaderFields();
                com.amazon.aps.iva.yb0.j.e(headerFields, "connection.headerFields");
                return new com.amazon.aps.iva.kb0.j(cVar2, com.braze.support.g.a(headerFields));
            } finally {
            }
        } catch (com.amazon.aps.iva.if0.b e) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.E, (Throwable) null, new b(e), 2, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new c(b2), 2, (Object) null);
            throw new RuntimeException("Failed to get result from [" + b2 + ']');
        } catch (IOException e2) {
            throw new f3("Failed request to [" + b2 + "], with message: [" + e2.getMessage() + ']', e2);
        }
    }

    private final HttpURLConnection a(URL url, com.amazon.aps.iva.if0.c cVar, Map map) {
        String cVar2 = cVar.toString();
        com.amazon.aps.iva.yb0.j.e(cVar2, "payload.toString()");
        Charset forName = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
        com.amazon.aps.iva.yb0.j.e(forName, "forName(charsetName)");
        byte[] bytes = cVar2.getBytes(forName);
        com.amazon.aps.iva.yb0.j.e(bytes, "this as java.lang.String).getBytes(charset)");
        HttpURLConnection a2 = k6.a.a(url);
        for (Map.Entry entry : map.entrySet()) {
            a2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        a2.setConnectTimeout(c);
        a2.setReadTimeout(this.a);
        a2.setUseCaches(false);
        a2.setInstanceFollowRedirects(false);
        a2.setRequestMethod("POST");
        a2.setDoOutput(true);
        a2.setFixedLengthStreamingMode(bytes.length);
        OutputStream outputStream = a2.getOutputStream();
        try {
            outputStream.write(bytes);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            com.amazon.aps.iva.a60.b.k(outputStream, null);
            return a2;
        } finally {
        }
    }
}
