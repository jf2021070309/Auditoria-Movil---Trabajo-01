package com.kwad.sdk.core.download;

import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.kwad.sdk.DownloadTask;
import com.kwad.sdk.core.network.s;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ad;
import com.kwad.sdk.utils.ag;
import com.kwad.sdk.utils.av;
import com.kwad.sdk.utils.v;
import com.kwad.sdk.utils.w;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
/* loaded from: classes.dex */
public final class a {
    private static Context mContext;
    private static volatile boolean mHasInit;

    /* renamed from: com.kwad.sdk.core.download.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0252a {
    }

    public static String B(AdInfo adInfo) {
        if (mContext == null) {
            return "";
        }
        DownloadParams transform = DownloadParams.transform(adInfo);
        if (TextUtils.isEmpty(transform.mFileUrl)) {
            return null;
        }
        return av.cM(mContext) + File.separator + cF(transform.mFileUrl);
    }

    public static void C(AdInfo adInfo) {
        a(adInfo, false);
    }

    private static InputStream a(Map<String, List<String>> map, InputStream inputStream) {
        List<String> value;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if ("Content-Encoding".equalsIgnoreCase(entry.getKey()) && (value = entry.getValue()) != null && !value.isEmpty()) {
                boolean z = false;
                Iterator<String> it = value.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("gzip".equalsIgnoreCase(it.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    try {
                        return new GZIPInputStream(inputStream);
                    } catch (IOException e) {
                    }
                } else {
                    continue;
                }
            }
        }
        return inputStream;
    }

    private static void a(AdInfo adInfo, boolean z) {
        Context context = mContext;
        if (context == null) {
            return;
        }
        if (!ag.isNetworkConnected(context)) {
            Context context2 = mContext;
            v.L(context2, w.bY(context2));
            return;
        }
        DownloadParams transform = DownloadParams.transform(adInfo);
        int i = 0;
        transform.requestInstallPermission = false;
        String str = transform.mFileUrl;
        if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
            return;
        }
        DownloadTask.DownloadRequest downloadRequest = new DownloadTask.DownloadRequest(transform.mFileUrl);
        downloadRequest.setDestinationFileName(cF(str));
        downloadRequest.setTag(transform);
        downloadRequest.setDownloadEnablePause(transform.downloadEnablePause);
        if (ServiceProvider.HB().showNotification && aW(mContext)) {
            i = 3;
        }
        downloadRequest.setNotificationVisibility(i);
        com.kwad.sdk.e.a.a(mContext, transform.mDownloadid, downloadRequest);
    }

    public static void a(String str, File file, boolean z) {
        a(str, file, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0117 A[Catch: all -> 0x0141, TryCatch #1 {all -> 0x0141, blocks: (B:61:0x0113, B:63:0x0117, B:65:0x0140, B:64:0x011a), top: B:76:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a A[Catch: all -> 0x0141, TryCatch #1 {all -> 0x0141, blocks: (B:61:0x0113, B:63:0x0117, B:65:0x0140, B:64:0x011a), top: B:76:0x0113 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(java.lang.String r10, java.io.File r11, com.kwad.sdk.core.download.a.InterfaceC0252a r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.core.download.a.a(java.lang.String, java.io.File, com.kwad.sdk.core.download.a$a, boolean):boolean");
    }

    public static synchronized void aV(Context context) {
        synchronized (a.class) {
            if (context != null) {
                if (!mHasInit) {
                    mContext = context;
                    com.kwad.sdk.c.wO().init(context);
                    c.Av().init(context);
                    mHasInit = true;
                }
            }
        }
    }

    private static boolean aW(Context context) {
        try {
            new NotificationCompat.Builder(context, "");
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private static String cF(String str) {
        return ad.bq(str) + ".apk";
    }

    public static void cG(String str) {
        if (mContext == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.kwad.sdk.e.a.z(mContext, str);
    }

    private static URLConnection cH(String str) {
        URLConnection openConnection = new URL(str).openConnection();
        s.wrapHttpURLConnection(openConnection);
        openConnection.setRequestProperty("Accept-Language", "zh-CN");
        openConnection.setConnectTimeout(10000);
        openConnection.setReadTimeout(120000);
        openConnection.setUseCaches(false);
        openConnection.setDoInput(true);
        openConnection.setRequestProperty("Connection", "keep-alive");
        openConnection.setRequestProperty("Charset", "UTF-8");
        return openConnection;
    }

    public static boolean d(String str, File file) {
        try {
            return a(str, file, null, false);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
