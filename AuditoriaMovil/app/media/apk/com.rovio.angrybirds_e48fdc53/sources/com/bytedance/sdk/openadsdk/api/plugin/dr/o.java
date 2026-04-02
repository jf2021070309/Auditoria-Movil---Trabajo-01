package com.bytedance.sdk.openadsdk.api.plugin.dr;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
/* loaded from: classes.dex */
public class o {
    private o() {
    }

    /* loaded from: classes.dex */
    private static final class dr {
        private static final o dr = new o();
    }

    public static o dr() {
        return dr.dr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String dr(boolean r4, java.lang.String r5, byte[] r6) {
        /*
            r3 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            javax.net.ssl.X509TrustManager r5 = r3.ge()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            javax.net.ssl.SSLSocketFactory r5 = r3.dr(r5)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r5)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            java.net.URLConnection r5 = r1.openConnection()     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r1 = 5000(0x1388, float:7.006E-42)
            r5.setConnectTimeout(r1)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            com.bytedance.sdk.openadsdk.api.plugin.dr.dr r1 = com.bytedance.sdk.openadsdk.api.plugin.dr.dr.dr     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            r5.setHostnameVerifier(r1)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            if (r4 == 0) goto L49
            if (r6 == 0) goto L49
            int r4 = r6.length     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            if (r4 == 0) goto L49
            r4 = 1
            r5.setDoOutput(r4)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            int r4 = r6.length     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            r5.setFixedLengthStreamingMode(r4)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            java.io.OutputStream r1 = r5.getOutputStream()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            r4.<init>(r1)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            r4.write(r6)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            r4.flush()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            r4.close()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            java.lang.String r4 = "POST"
            r5.setRequestMethod(r4)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            goto L4e
        L49:
            java.lang.String r4 = "GET"
            r5.setRequestMethod(r4)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
        L4e:
            int r4 = r5.getResponseCode()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            r6 = 200(0xc8, float:2.8E-43)
            if (r4 < r6) goto L7d
            r6 = 300(0x12c, float:4.2E-43)
            if (r4 >= r6) goto L7d
            java.lang.String r4 = "Content-Type"
            java.lang.String r4 = r5.getHeaderField(r4)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            java.lang.String r6 = "utf-8"
            java.lang.String r4 = dr(r4, r6)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            java.io.InputStream r1 = r5.getInputStream()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r1 = dr(r1, r2)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            r6.<init>(r1, r4)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L95
            if (r5 == 0) goto L7c
            r5.disconnect()     // Catch: java.lang.Exception -> L7b
            goto L7c
        L7b:
            r4 = move-exception
        L7c:
            return r6
        L7d:
            if (r5 == 0) goto L94
            r5.disconnect()     // Catch: java.lang.Exception -> L92
            goto L91
        L83:
            r4 = move-exception
            goto L89
        L85:
            r4 = move-exception
            goto L97
        L87:
            r4 = move-exception
            r5 = r0
        L89:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L94
            r5.disconnect()     // Catch: java.lang.Exception -> L92
        L91:
            goto L94
        L92:
            r4 = move-exception
            goto L91
        L94:
            return r0
        L95:
            r4 = move-exception
            r0 = r5
        L97:
            if (r0 == 0) goto L9e
            r0.disconnect()     // Catch: java.lang.Exception -> L9d
            goto L9e
        L9d:
            r5 = move-exception
        L9e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.api.plugin.dr.o.dr(boolean, java.lang.String, byte[]):java.lang.String");
    }

    private static byte[] dr(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            return null;
        }
        if (i < 1) {
            i = 1;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.close();
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static String dr(String str, String str2) {
        if (str != null) {
            String[] split = str.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str2;
    }

    private SSLSocketFactory dr(X509TrustManager x509TrustManager) throws IOException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new IOException("No System TLS", e);
        }
    }

    private X509TrustManager ge() throws IOException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            }
            return (X509TrustManager) trustManagers[0];
        } catch (GeneralSecurityException e) {
            throw new IOException("No System TLS", e);
        }
    }
}
