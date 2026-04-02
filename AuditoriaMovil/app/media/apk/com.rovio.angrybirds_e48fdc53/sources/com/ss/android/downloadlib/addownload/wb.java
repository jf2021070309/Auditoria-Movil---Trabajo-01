package com.ss.android.downloadlib.addownload;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.ss.android.download.api.config.cu;
import com.ss.android.download.api.config.i;
import com.ss.android.download.api.config.il;
import com.ss.android.download.api.config.lp;
import com.ss.android.download.api.config.tb;
import com.ss.android.download.api.config.v;
import com.ss.android.download.api.config.x;
import com.ss.android.download.api.constant.BaseConstants;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class wb {
    private static com.ss.android.download.api.config.xu bn;
    private static com.ss.android.download.api.config.q cu;

    /* renamed from: de  reason: collision with root package name */
    private static cu f11de;
    public static final JSONObject dr = new JSONObject();
    private static com.ss.android.download.api.config.o g;
    private static Context ge;
    private static x i;
    private static i ii;
    private static com.ss.android.download.api.config.t il;
    private static com.ss.android.download.api.model.dr ll;
    private static v lp;
    private static com.ss.android.download.api.config.rb o;
    private static com.ss.android.download.api.config.yk q;
    private static com.ss.android.download.api.config.ll rb;
    private static com.ss.android.socialbase.appdownloader.o.xu t;
    private static lp tb;
    private static il v;
    private static com.ss.android.download.api.config.ge wb;
    private static tb x;
    private static com.ss.android.download.api.config.wb xu;
    private static com.ss.android.download.api.config.g yk;
    private static com.ss.android.download.api.ge.dr z;

    public static void dr(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            throw new IllegalArgumentException("Context is null");
        }
        ge = context.getApplicationContext();
    }

    public static void ge(Context context) {
        if (ge == null && context != null && context.getApplicationContext() != null) {
            ge = context.getApplicationContext();
        }
    }

    public static Context getContext() {
        Context context = ge;
        if (context == null) {
            throw new IllegalArgumentException("Context is null");
        }
        return context;
    }

    public static void dr(com.ss.android.download.api.config.rb rbVar) {
        o = rbVar;
    }

    public static void dr(com.ss.android.download.api.config.yk ykVar) {
        q = ykVar;
    }

    public static void dr(com.ss.android.download.api.config.xu xuVar) {
        bn = xuVar;
    }

    public static void dr(com.ss.android.download.api.config.ll llVar) {
        rb = llVar;
    }

    public static void dr(com.ss.android.download.api.config.wb wbVar) {
        xu = wbVar;
    }

    public static void dr(com.ss.android.download.api.model.dr drVar) {
        ll = drVar;
    }

    public static void dr(com.ss.android.download.api.config.ge geVar) {
        wb = geVar;
    }

    public static com.ss.android.download.api.config.rb dr() {
        return o;
    }

    public static com.ss.android.download.api.config.o ge() {
        if (g == null) {
            g = new com.ss.android.download.api.config.o() { // from class: com.ss.android.downloadlib.addownload.wb.1
                @Override // com.ss.android.download.api.config.o
                public void dr(Context context, DownloadModel downloadModel, DownloadController downloadController, DownloadEventConfig downloadEventConfig) {
                }

                @Override // com.ss.android.download.api.config.o
                public void dr(Context context, DownloadModel downloadModel, DownloadController downloadController, DownloadEventConfig downloadEventConfig, String str, String str2) {
                }
            };
        }
        return g;
    }

    public static com.ss.android.download.api.config.yk o() {
        if (q == null) {
            q = new com.ss.android.download.api.dr.dr();
        }
        return q;
    }

    public static com.ss.android.download.api.config.xu g() {
        return bn;
    }

    public static com.ss.android.download.api.config.ll q() {
        if (rb == null) {
            rb = new com.ss.android.download.api.dr.ge();
        }
        return rb;
    }

    public static com.ss.android.socialbase.appdownloader.o.xu bn() {
        if (t == null) {
            t = new com.ss.android.socialbase.appdownloader.o.xu() { // from class: com.ss.android.downloadlib.addownload.wb.2
                @Override // com.ss.android.socialbase.appdownloader.o.xu
                public void dr(DownloadInfo downloadInfo, BaseException baseException, int i2) {
                }
            };
        }
        return t;
    }

    public static il rb() {
        return v;
    }

    public static x xu() {
        if (i == null) {
            i = new x() { // from class: com.ss.android.downloadlib.addownload.wb.3
                @Override // com.ss.android.download.api.config.x
                public void dr(String str, int i2, JSONObject jSONObject) {
                }
            };
        }
        return i;
    }

    public static JSONObject ll() {
        com.ss.android.download.api.config.wb wbVar = xu;
        if (wbVar == null || wbVar.dr() == null) {
            return dr;
        }
        return xu.dr();
    }

    public static cu wb() {
        return f11de;
    }

    public static com.ss.android.download.api.config.ge t() {
        return wb;
    }

    public static v yk() {
        return lp;
    }

    public static void dr(String str) {
        com.ss.android.socialbase.appdownloader.g.wb().dr(str);
    }

    public static String cu() {
        return "1.7.0";
    }

    public static com.ss.android.download.api.config.g v() {
        return yk;
    }

    public static com.ss.android.download.api.config.q il() {
        return cu;
    }

    public static com.ss.android.download.api.config.t x() {
        return il;
    }

    public static void dr(lp lpVar) {
        tb = lpVar;
    }

    public static lp lp() {
        return tb;
    }

    public static tb de() {
        return x;
    }

    public static void dr(com.ss.android.download.api.ge.dr drVar) {
        z = drVar;
    }

    public static com.ss.android.download.api.ge.dr i() {
        if (z == null) {
            z = new com.ss.android.download.api.ge.dr() { // from class: com.ss.android.downloadlib.addownload.wb.4
                @Override // com.ss.android.download.api.ge.dr
                public void dr(Throwable th, String str) {
                }
            };
        }
        return z;
    }

    public static i z() {
        if (ii == null) {
            ii = new i() { // from class: com.ss.android.downloadlib.addownload.wb.5
                @Override // com.ss.android.download.api.config.i
                public void dr(Context context, DownloadModel downloadModel, DownloadController downloadController, DownloadEventConfig downloadEventConfig, String str, int i2) {
                }
            };
        }
        return ii;
    }

    public static String tb() {
        try {
            int i2 = getContext().getApplicationInfo().targetSdkVersion;
            if (Build.VERSION.SDK_INT >= 29 && ((i2 == 29 && !Environment.isExternalStorageLegacy()) || i2 > 29)) {
                return getContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
            }
            return Environment.getExternalStorageDirectory().getPath() + File.separator + ll().optString("default_save_dir_name", BaseConstants.DOWNLOAD_DIR);
        } catch (Throwable th) {
            return null;
        }
    }

    public static boolean ii() {
        if (o == null || bn == null || xu == null || wb == null || tb == null) {
            return false;
        }
        return true;
    }
}
