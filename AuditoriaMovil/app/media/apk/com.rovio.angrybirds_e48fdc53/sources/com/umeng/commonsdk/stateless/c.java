package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import com.umeng.analytics.pro.bg;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;
import java.io.OutputStream;
import java.net.URL;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ssl.SSLSocketFactory;
/* compiled from: UMSLNetWorkSenderHelper.java */
/* loaded from: classes3.dex */
public class c {
    private String a = "10.0.0.172";
    private int b = 80;
    private Context c;

    public c(Context context) {
        this.c = context;
    }

    private void a() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.c, "sl_domain_p", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            a.i = DataHelper.assembleStatelessURL(imprintProperty);
        }
    }

    private void b() {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(this.c, "sl_domain_p", "");
        String imprintProperty2 = UMEnvelopeBuild.imprintProperty(this.c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            a.h = DataHelper.assembleStatelessURL(imprintProperty);
        }
        if (!TextUtils.isEmpty(imprintProperty2)) {
            a.k = DataHelper.assembleStatelessURL(imprintProperty2);
        }
        a.i = a.k;
        if (!TextUtils.isEmpty(com.umeng.commonsdk.statistics.b.b)) {
            if (com.umeng.commonsdk.statistics.b.b.startsWith("460") || com.umeng.commonsdk.statistics.b.b.startsWith("461")) {
                a.i = a.h;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v11, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [javax.net.ssl.HttpsURLConnection] */
    public boolean a(byte[] bArr, String str, String str2, String str3) {
        boolean z = false;
        if (bArr == null || str == null) {
            ULog.i("walle", "[stateless] sendMessage, envelopeByte == null || path == null ");
            return false;
        }
        if (SdkVersion.SDK_TYPE == 0) {
            a();
        } else {
            a.h = a.k;
            b();
        }
        String str4 = a.i;
        HttpsURLConnection httpsURLConnection = str2;
        if (!com.umeng.commonsdk.vchannel.a.c.equalsIgnoreCase(str)) {
            httpsURLConnection = str4;
        }
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 无状态收数域名：" + ((String) httpsURLConnection));
        OutputStream outputStream = null;
        try {
            try {
                try {
                    httpsURLConnection = (HttpsURLConnection) new URL(((String) httpsURLConnection) + File.separator + str).openConnection();
                } catch (Throwable th) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Exception e) {
                        }
                    }
                    if (httpsURLConnection != 0) {
                        try {
                            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                            httpsURLConnection.disconnect();
                        } catch (Throwable th2) {
                        }
                    }
                    throw th;
                }
            } catch (SSLHandshakeException e2) {
                e = e2;
                httpsURLConnection = 0;
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = 0;
            }
        } catch (Throwable th4) {
        }
        try {
            httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpsURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
            httpsURLConnection.setRequestProperty("Msg-Type", "envelope/json");
            httpsURLConnection.setRequestProperty(DownloadUtils.CONTENT_TYPE, bg.aQ + str3);
            httpsURLConnection.setRequestProperty("SM-IMP", "1");
            httpsURLConnection.setRequestProperty("User-Agent", DeviceConfig.getCustomAgt());
            httpsURLConnection.setConnectTimeout(30000);
            httpsURLConnection.setReadTimeout(30000);
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setUseCaches(false);
            outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.flush();
            httpsURLConnection.connect();
            if (httpsURLConnection.getResponseCode() == 200) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> send stateless message success : " + a.i + "/" + str);
                z = true;
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e3) {
                }
            }
        } catch (SSLHandshakeException e4) {
            e = e4;
            MLog.e("SSLHandshakeException, Failed to send message.", e);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e5) {
                }
            }
            if (httpsURLConnection != 0) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                httpsURLConnection.disconnect();
            }
            return z;
        } catch (Throwable th5) {
            th = th5;
            MLog.e("Exception,Failed to send message.", th);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e6) {
                }
            }
            if (httpsURLConnection != 0) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
                httpsURLConnection.disconnect();
            }
            return z;
        }
        if (httpsURLConnection != 0) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> stateless: disconnect connection.");
            httpsURLConnection.disconnect();
        }
        return z;
    }
}
