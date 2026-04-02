package com.kuaishou.weapon.p0;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
/* loaded from: classes.dex */
public class l {
    static SSLSocketFactory b = null;
    private static final String c = "gzip";
    private static final int d = 1024;
    private static Context g;
    private boolean e = false;
    private static volatile l f = null;
    static TrustManager[] a = {new X509TrustManager() { // from class: com.kuaishou.weapon.p0.l.1
        @Override // javax.net.ssl.X509TrustManager
        public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            try {
                l.b(x509CertificateArr);
            } catch (Throwable th) {
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public final X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }};

    private l(Context context) {
        g = context;
    }

    public static l a(Context context) {
        if (f == null) {
            synchronized (l.class) {
                if (f == null) {
                    f = new l(context);
                }
            }
        }
        return f;
    }

    private InputStream a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null && httpURLConnection != null) {
            try {
                if (c.equalsIgnoreCase(httpURLConnection.getContentEncoding())) {
                    this.e = true;
                } else {
                    this.e = false;
                }
                return httpURLConnection.getInputStream();
            } catch (IOException e) {
            }
        }
        return null;
    }

    private static void a(String str) {
        try {
            new h(g).c(de.m, str, true);
        } catch (Exception e) {
        }
    }

    private synchronized void a(HttpsURLConnection httpsURLConnection) {
        if (httpsURLConnection != null) {
            try {
                if (b == null) {
                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                    sSLContext.init(null, a, new SecureRandom());
                    b = sSLContext.getSocketFactory();
                }
                SSLSocketFactory sSLSocketFactory = b;
                if (sSLSocketFactory != null) {
                    httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
                }
            } catch (Throwable th) {
            }
        }
    }

    private boolean a(InputStream inputStream, File file) {
        BufferedOutputStream bufferedOutputStream;
        if (this.e) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } catch (IOException e) {
            }
        }
        if (inputStream == null) {
            return false;
        }
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        try {
                            bufferedOutputStream.close();
                            return true;
                        } catch (IOException e2) {
                            return true;
                        }
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                    bufferedOutputStream.flush();
                }
            } catch (Throwable th) {
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e3) {
                    }
                }
                return false;
            }
        } catch (Throwable th2) {
            bufferedOutputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(X509Certificate[] x509CertificateArr) {
        if (x509CertificateArr != null) {
            try {
                if (x509CertificateArr.length == 0) {
                    return;
                }
                String name = x509CertificateArr[0].getIssuerX500Principal().getName();
                if (Pattern.compile(".*(GeoTrust|VeriSign|Symantec|GlobalSign|Entrust|Thawte|DigiCert).*", 2).matcher(name).matches()) {
                    return;
                }
                a(name);
            } catch (Throwable th) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0 A[Catch: Exception -> 0x00ec, TRY_LEAVE, TryCatch #3 {Exception -> 0x00ec, blocks: (B:54:0x00e8, B:58:0x00f0), top: B:76:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(com.kuaishou.weapon.p0.m r11) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.l.a(com.kuaishou.weapon.p0.m):java.lang.String");
    }

    public String a(Map<String, String> map) {
        String str = "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            str = str + "&" + entry.getKey() + "=" + entry.getValue();
        }
        return str.substring(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.net.HttpURLConnection] */
    public HttpURLConnection a(String str, String str2) {
        HttpsURLConnection httpsURLConnection;
        try {
            URL url = new URL(str);
            if ("https".equals(url.getProtocol())) {
                HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) url.openConnection();
                a(httpsURLConnection2);
                httpsURLConnection = httpsURLConnection2;
            } else {
                httpsURLConnection = (HttpURLConnection) url.openConnection();
            }
            try {
                httpsURLConnection.setRequestMethod(str2);
                httpsURLConnection.setAllowUserInteraction(true);
                httpsURLConnection.setInstanceFollowRedirects(true);
                httpsURLConnection.setChunkedStreamingMode(0);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setReadTimeout(5000);
                httpsURLConnection.setRequestProperty("Charset", "UTF-8");
                httpsURLConnection.setRequestProperty(DownloadUtils.CONTENT_TYPE, "application/json; charset=UTF-8");
                if (str2.equalsIgnoreCase("post")) {
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setUseCaches(false);
                    return httpsURLConnection;
                }
                return httpsURLConnection;
            } catch (Exception e) {
                return httpsURLConnection;
            }
        } catch (Exception e2) {
            return null;
        }
    }

    public void a(m mVar, j jVar) {
        a(mVar, jVar, "GET");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ff A[Catch: Exception -> 0x00fb, TryCatch #3 {Exception -> 0x00fb, blocks: (B:60:0x00f7, B:64:0x00ff, B:66:0x0104), top: B:80:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0104 A[Catch: Exception -> 0x00fb, TRY_LEAVE, TryCatch #3 {Exception -> 0x00fb, blocks: (B:60:0x00f7, B:64:0x00ff, B:66:0x0104), top: B:80:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.kuaishou.weapon.p0.m r10, com.kuaishou.weapon.p0.j r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kuaishou.weapon.p0.l.a(com.kuaishou.weapon.p0.m, com.kuaishou.weapon.p0.j, java.lang.String):void");
    }

    public boolean a(String str, File file) {
        HttpURLConnection httpURLConnection;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        InputStream inputStream = null;
        try {
            httpURLConnection = a(str, "GET");
            try {
                inputStream = a(httpURLConnection);
                boolean a2 = a(inputStream, file);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th) {
                        return false;
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return a2;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        return false;
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return false;
            }
        } catch (Throwable th4) {
            httpURLConnection = null;
        }
    }

    public void b(m mVar, j jVar) {
        a(mVar, jVar, "POST");
    }
}
