package com.amazon.aps.iva.wa;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.metrics.types.MetricEvent;
import com.amazon.aps.iva.metrics.types.Severity;
import com.amazon.aps.iva.util.LogUtils;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import lombok.NonNull;
/* compiled from: ApsIvaTrackingUrlReporter.java */
/* loaded from: classes.dex */
public final class m {
    public final g a = com.amazon.aps.iva.va.b.c().b();
    public final com.amazon.aps.iva.xa.b b;

    public m(@NonNull com.amazon.aps.iva.xa.b bVar) {
        this.b = bVar;
    }

    public static String a(String str, String str2) {
        String[] split = str.split("&" + str2 + "=");
        if (split.length < 2) {
            return null;
        }
        return split[1].split("&")[0];
    }

    public static void b(HttpsURLConnection httpsURLConnection) {
        try {
            httpsURLConnection.disconnect();
        } catch (RuntimeException e) {
            LogUtils.e("j", String.format("ApsIvaTrackingUrlReporter: Unable To Close Url Connection: %s", e));
        }
    }

    public final void c(@NonNull List<URL> list) {
        if (list != null) {
            ((h) this.a).a.execute(new com.amazon.aps.iva.o4.b(6, this, list));
            for (URL url : list) {
                try {
                    LinkedHashMap b = com.amazon.aps.iva.l9.a.b(url);
                    if (b.containsKey("ex-fargs") && b.get("ex-fargs") != null && b.containsKey("v-args") && b.get("v-args") != null) {
                        String a = a((String) b.get("ex-fargs"), "e");
                        String a2 = a((String) b.get("v-args"), "md");
                        if (!w.f(a) && !w.f(a2)) {
                            this.b.a(new MetricEvent(String.format("apsIva-trackingUrlEvent_%s_%sCounter", a, a2), Severity.INFO));
                        }
                        LogUtils.d("j", "Reporting: apsIva-TrackingUrlEvent_%s_%s", a, a2);
                    }
                } catch (UnsupportedEncodingException unused) {
                    LogUtils.e("j", String.format("Error while parsing query params for url: %s", url));
                }
            }
            return;
        }
        throw new NullPointerException("trackingUrls is marked non-null but is null");
    }

    public final void d(HttpsURLConnection httpsURLConnection) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            com.amazon.aps.iva.xa.b bVar = this.b;
            if (z) {
                try {
                    try {
                        Thread.sleep(i);
                    } catch (InterruptedException e) {
                        LogUtils.e("j", String.format("Error while running Thread.sleep(). %s", e));
                        Thread.currentThread().interrupt();
                        return;
                    } catch (Exception e2) {
                        LogUtils.e("j", String.format("ApsIvaTrackingUrlReporter: Error In Setting The Connection Parameters: %s", e2));
                        bVar.a(new MetricEvent("apsIva-trackingUrlReportFailureCounter", Severity.ERROR));
                    }
                } finally {
                    b(httpsURLConnection);
                }
            }
            httpsURLConnection.setReadTimeout(5000);
            httpsURLConnection.setConnectTimeout(5000);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.connect();
            int responseCode = httpsURLConnection.getResponseCode();
            String responseMessage = httpsURLConnection.getResponseMessage();
            if (responseCode < 400) {
                LogUtils.d("j", "Response Code: %s", String.valueOf(responseCode));
                break;
            }
            LogUtils.e("j", String.format(Locale.US, "Report tracking failure with code: %d. Message: %s. Retry number %d of %d", Integer.valueOf(responseCode), responseMessage, Integer.valueOf(i2), 3));
            bVar.a(new MetricEvent("apsIva-trackingUrlReportErrorResponseCounter", Severity.ERROR));
            i2++;
            i += i2 * 1000;
            if (i2 < 3) {
                z = true;
            } else {
                return;
            }
        }
    }
}
