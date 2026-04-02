package com.umeng.analytics.pro;

import android.text.TextUtils;
import android.util.Log;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.SecureRandom;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
/* compiled from: HttpManager.java */
/* loaded from: classes3.dex */
public class al {
    private static HostnameVerifier a = null;

    private static HostnameVerifier a() {
        if (a == null) {
            a = new HostnameVerifier() { // from class: com.umeng.analytics.pro.al.1
                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str, SSLSession sSLSession) {
                    if (!TextUtils.isEmpty(str)) {
                        if ("pre-ucc.umeng.com".equalsIgnoreCase(str) || "ucc.umeng.com".equalsIgnoreCase(str) || "aspect-upush.umeng.com".equalsIgnoreCase(str) || "pre-msg.umengcloud.com".equalsIgnoreCase(str)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
            };
        }
        return a;
    }

    public static byte[] a(String str, String str2) {
        return a(str, str2.getBytes());
    }

    public static byte[] a(String str, byte[] bArr) {
        byte[] bArr2 = null;
        try {
            HttpsURLConnection a2 = a(str, "ak", ar.a(bArr, UMConfigure.sAppkey.getBytes()));
            if (a2 != null && a2.getResponseCode() == 200) {
                InputStream inputStream = a2.getInputStream();
                try {
                    byte[] readStreamToByteArray = HelperUtils.readStreamToByteArray(inputStream);
                    try {
                        String headerField = a2.getHeaderField("ak");
                        if (!TextUtils.isEmpty(headerField)) {
                            bArr2 = ar.a(readStreamToByteArray, headerField.getBytes());
                        } else {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "ccg 应答不包含ak!");
                        }
                        HelperUtils.safeClose(inputStream);
                    } catch (Throwable th) {
                        th = th;
                        HelperUtils.safeClose(inputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
        }
        return bArr2;
    }

    public static void b(String str, byte[] bArr) {
        byte[] bArr2;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ar.a(bArr, byteArrayOutputStream);
                bArr2 = ar.a(byteArrayOutputStream.toByteArray(), UMConfigure.sAppkey.getBytes());
            } catch (Throwable th) {
                bArr2 = null;
            }
            HttpsURLConnection a2 = a(str, "appkey", bArr2);
            if (a2 != null) {
                int responseCode = a2.getResponseCode();
                if (responseCode != 200) {
                    Log.e(UMRTLog.RTLOG_TAG, "SC event report error, http error code: " + responseCode);
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "SC event report successful.");
                }
            }
            if (a2 != null) {
                a2.disconnect();
            }
        } catch (Throwable th2) {
        }
    }

    private static HttpsURLConnection a(String str, String str2, byte[] bArr) {
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        } catch (Exception e) {
            e = e;
        }
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpsURLConnection.setHostnameVerifier(a());
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setConnectTimeout(15000);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setReadTimeout(15000);
            httpsURLConnection.addRequestProperty(DownloadUtils.CONTENT_TYPE, "application/octet-stream");
            httpsURLConnection.addRequestProperty(str2, UMConfigure.sAppkey);
            httpsURLConnection.connect();
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.flush();
            outputStream.close();
            return httpsURLConnection;
        } catch (Exception e2) {
            e = e2;
            httpsURLConnection2 = httpsURLConnection;
            e.printStackTrace();
            return httpsURLConnection2;
        }
    }
}
