package com.segment.analytics;

import android.text.TextUtils;
import com.amazon.aps.iva.e4.e;
import com.google.common.net.HttpHeaders;
import com.segment.analytics.internal.Utils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPOutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class Client {
    final ConnectionFactory connectionFactory;
    final String writeKey;

    /* loaded from: classes4.dex */
    public static abstract class Connection implements Closeable {
        final HttpURLConnection connection;
        final InputStream is;
        final OutputStream os;

        public Connection(HttpURLConnection httpURLConnection, InputStream inputStream, OutputStream outputStream) {
            if (httpURLConnection != null) {
                this.connection = httpURLConnection;
                this.is = inputStream;
                this.os = outputStream;
                return;
            }
            throw new IllegalArgumentException("connection == null");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.connection.disconnect();
        }
    }

    /* loaded from: classes4.dex */
    public static class HTTPException extends IOException {
        final String responseBody;
        final int responseCode;
        final String responseMessage;

        public HTTPException(int i, String str, String str2) {
            super("HTTP " + i + ": " + str + ". Response: " + str2);
            this.responseCode = i;
            this.responseMessage = str;
            this.responseBody = str2;
        }

        public boolean is4xx() {
            int i = this.responseCode;
            if (i >= 400 && i < 500) {
                return true;
            }
            return false;
        }
    }

    public Client(String str, ConnectionFactory connectionFactory) {
        this.writeKey = str;
        this.connectionFactory = connectionFactory;
    }

    private static Connection createGetConnection(HttpURLConnection httpURLConnection) throws IOException {
        return new Connection(httpURLConnection, Utils.getInputStream(httpURLConnection), null) { // from class: com.segment.analytics.Client.2
            @Override // com.segment.analytics.Client.Connection, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                this.is.close();
            }
        };
    }

    private static Connection createPostConnection(HttpURLConnection httpURLConnection) throws IOException {
        OutputStream outputStream;
        if (TextUtils.equals("gzip", httpURLConnection.getRequestProperty(HttpHeaders.CONTENT_ENCODING))) {
            outputStream = new GZIPOutputStream(httpURLConnection.getOutputStream());
        } else {
            outputStream = httpURLConnection.getOutputStream();
        }
        return new Connection(httpURLConnection, null, outputStream) { // from class: com.segment.analytics.Client.1
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
                if (r2 == null) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
                throw new com.segment.analytics.Client.HTTPException(r1, r5.connection.getResponseMessage(), r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
                if (r2 != null) goto L10;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
                r2.close();
             */
            @Override // com.segment.analytics.Client.Connection, java.io.Closeable, java.lang.AutoCloseable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void close() throws java.io.IOException {
                /*
                    r5 = this;
                    java.lang.String r0 = "Could not read response body for rejected message: "
                    java.net.HttpURLConnection r1 = r5.connection     // Catch: java.lang.Throwable -> L4e
                    int r1 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L4e
                    r2 = 300(0x12c, float:4.2E-43)
                    if (r1 < r2) goto L45
                    r2 = 0
                    java.net.HttpURLConnection r3 = r5.connection     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f
                    java.io.InputStream r2 = com.segment.analytics.internal.Utils.getInputStream(r3)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f
                    java.lang.String r0 = com.segment.analytics.internal.Utils.readFully(r2)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f
                    if (r2 == 0) goto L33
                L19:
                    r2.close()     // Catch: java.lang.Throwable -> L4e
                    goto L33
                L1d:
                    r0 = move-exception
                    goto L3f
                L1f:
                    r3 = move-exception
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
                    r4.<init>(r0)     // Catch: java.lang.Throwable -> L1d
                    java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L1d
                    r4.append(r0)     // Catch: java.lang.Throwable -> L1d
                    java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L1d
                    if (r2 == 0) goto L33
                    goto L19
                L33:
                    com.segment.analytics.Client$HTTPException r2 = new com.segment.analytics.Client$HTTPException     // Catch: java.lang.Throwable -> L4e
                    java.net.HttpURLConnection r3 = r5.connection     // Catch: java.lang.Throwable -> L4e
                    java.lang.String r3 = r3.getResponseMessage()     // Catch: java.lang.Throwable -> L4e
                    r2.<init>(r1, r3, r0)     // Catch: java.lang.Throwable -> L4e
                    throw r2     // Catch: java.lang.Throwable -> L4e
                L3f:
                    if (r2 == 0) goto L44
                    r2.close()     // Catch: java.lang.Throwable -> L4e
                L44:
                    throw r0     // Catch: java.lang.Throwable -> L4e
                L45:
                    super.close()
                    java.io.OutputStream r0 = r5.os
                    r0.close()
                    return
                L4e:
                    r0 = move-exception
                    super.close()
                    java.io.OutputStream r1 = r5.os
                    r1.close()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.Client.AnonymousClass1.close():void");
            }
        };
    }

    public Connection fetchSettings() throws IOException {
        HttpURLConnection projectSettings = this.connectionFactory.projectSettings(this.writeKey);
        int responseCode = projectSettings.getResponseCode();
        if (responseCode == 200) {
            return createGetConnection(projectSettings);
        }
        projectSettings.disconnect();
        StringBuilder d = e.d("HTTP ", responseCode, ": ");
        d.append(projectSettings.getResponseMessage());
        throw new IOException(d.toString());
    }

    public Connection upload(String str) throws IOException {
        return createPostConnection(this.connectionFactory.upload(str));
    }
}
