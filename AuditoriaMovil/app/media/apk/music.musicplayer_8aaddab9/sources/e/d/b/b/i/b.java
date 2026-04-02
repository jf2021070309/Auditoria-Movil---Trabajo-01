package e.d.b.b.i;

import c.t.m;
import e.d.b.b.i.d;
import e.d.b.b.i.e.s;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ d a;

    public /* synthetic */ b(d dVar) {
        this.a = dVar;
    }

    public final Object a(Object obj) {
        d dVar = this.a;
        d.a aVar = (d.a) obj;
        Objects.requireNonNull(dVar);
        m.g("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.f6053g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.2"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f6055c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                ((e.d.d.p.j.d) dVar.a).a(aVar.f6054b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                m.m("CctTransportBackend");
                httpURLConnection.getHeaderField("Content-Type");
                m.m("CctTransportBackend");
                httpURLConnection.getHeaderField("Content-Encoding");
                m.m("CctTransportBackend");
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new d.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new d.b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                    d.b bVar = new d.b(responseCode, null, ((e.d.b.b.i.e.m) s.a(new BufferedReader(new InputStreamReader(gZIPInputStream)))).a);
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (e.d.d.p.c e2) {
            e = e2;
            m.h("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new d.b(400, null, 0L);
        } catch (ConnectException e3) {
            e = e3;
            m.h("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new d.b(500, null, 0L);
        } catch (UnknownHostException e4) {
            e = e4;
            m.h("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new d.b(500, null, 0L);
        } catch (IOException e5) {
            e = e5;
            m.h("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new d.b(400, null, 0L);
        }
    }
}
