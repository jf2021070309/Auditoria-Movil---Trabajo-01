package com.bytedance.sdk.openadsdk.downloadnew;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.TTDownloadEventLogger;
import com.bytedance.sdk.openadsdk.downloadnew.core.DialogBuilder;
import com.bytedance.sdk.openadsdk.downloadnew.core.ExitInstallListener;
import com.bytedance.sdk.openadsdk.downloadnew.core.IDialogStatusChangedListener;
import com.bytedance.sdk.openadsdk.downloadnew.core.ITTDownloadAdapter;
import com.bytedance.sdk.openadsdk.downloadnew.core.ITTDownloadVisitor;
import com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback;
import com.bytedance.sdk.openadsdk.downloadnew.core.ITTPermissionCallback;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadEventModel;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.bytedance.sdk.openadsdk.downloadnew.o;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.de;
import com.ss.android.download.api.config.ll;
import com.ss.android.download.api.config.lp;
import com.ss.android.download.api.config.rb;
import com.ss.android.download.api.config.yk;
import com.ss.android.download.api.config.z;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.dr;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadlib.addownload.dr.dr;
import com.ss.android.downloadlib.addownload.ge.bn;
import com.ss.android.downloadlib.ge.wb;
import com.ss.android.downloadlib.xu;
import com.ss.android.socialbase.downloader.depend.IDownloadSettings;
import com.ss.android.socialbase.downloader.depend.IInstallAppHandler;
import com.ss.android.socialbase.downloader.downloader.DownloaderBuilder;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.vungle.publisher.VungleAdActivity;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g {
    private static Map<Integer, ITTDownloadAdapter.OnEventLogHandler> bn;
    public static volatile String dr;
    private static final AtomicBoolean g = new AtomicBoolean(false);
    public static boolean ge = true;
    public static ITTDownloadVisitor o;
    private static Context q;
    private static final com.ss.android.download.api.download.dr.dr rb;

    static /* synthetic */ ITTDownloadVisitor g() {
        return q();
    }

    static {
        try {
            dr = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
        } catch (Throwable th) {
        }
        rb = new com.ss.android.download.api.download.dr.dr() { // from class: com.bytedance.sdk.openadsdk.downloadnew.g.6
            @Override // com.ss.android.download.api.download.dr.dr
            public void dr(DownloadModel downloadModel, DownloadController downloadController, DownloadEventConfig downloadEventConfig) {
                com.bytedance.sdk.openadsdk.api.ge.ge("TTDownloadVisitor", "completeListener: onDownloadStart");
            }

            @Override // com.ss.android.download.api.download.dr.dr
            public void dr(DownloadInfo downloadInfo, String str) {
                com.bytedance.sdk.openadsdk.api.ge.ge("TTDownloadVisitor", "completeListener: onDownloadFinished");
            }

            @Override // com.ss.android.download.api.download.dr.dr
            public void ge(DownloadInfo downloadInfo, String str) {
                com.bytedance.sdk.openadsdk.api.ge.ge("TTDownloadVisitor", "completeListener: onInstalled");
                g.o(str);
            }

            @Override // com.ss.android.download.api.download.dr.dr
            public void dr(DownloadInfo downloadInfo, BaseException baseException, String str) {
                com.bytedance.sdk.openadsdk.api.ge.ge("TTDownloadVisitor", "completeListener: onDownloadFailed");
            }

            @Override // com.ss.android.download.api.download.dr.dr
            public void dr(DownloadInfo downloadInfo) {
                com.bytedance.sdk.openadsdk.api.ge.ge("TTDownloadVisitor", "completeListener: onCanceled");
            }
        };
    }

    private static ITTDownloadVisitor q() {
        ITTDownloadVisitor iTTDownloadVisitor = o;
        if (iTTDownloadVisitor == null) {
            TTAdManager adManager = TTAdSdk.getAdManager();
            if (adManager == null) {
                return null;
            }
            return (ITTDownloadVisitor) adManager.getExtra(ITTDownloadVisitor.class, com.bytedance.sdk.openadsdk.downloadnew.ge.dr(1));
        }
        return iTTDownloadVisitor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(String str) {
        com.ss.android.downloadad.api.dr.ge dr2;
        JSONObject rb2;
        if (!TextUtils.isEmpty(str) && (dr2 = bn.dr().dr(str)) != null && (rb2 = dr2.rb()) != null && q() != null) {
            q().checkAutoControl(rb2, str);
        }
    }

    public static void dr(Context context) {
        if (context == null) {
            context = TTAppContextHolder.getContext();
        }
        if (context == null) {
            return;
        }
        AtomicBoolean atomicBoolean = g;
        if (!atomicBoolean.get()) {
            synchronized (g.class) {
                if (!atomicBoolean.get()) {
                    q = context.getApplicationContext();
                    if (q() != null) {
                        String initPath = q().initPath(ge);
                        if (!TextUtils.isEmpty(initPath)) {
                            dr = initPath;
                        }
                    }
                    atomicBoolean.set(ge(q));
                }
            }
        }
    }

    public static void dr(String str) {
        if (!TextUtils.isEmpty(str)) {
            dr = str;
        }
    }

    public static xu dr() {
        dr(getContext());
        return xu.dr(getContext());
    }

    public static boolean dr(Context context, Uri uri, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, IDownloadButtonClickListener iDownloadButtonClickListener) {
        return dr().q().dr(context, uri, downloadModel, downloadEventConfig, downloadController, iDownloadButtonClickListener);
    }

    public static boolean dr(Context context, Uri uri, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        return dr().q().dr(context, uri, downloadModel, downloadEventConfig, downloadController);
    }

    public static boolean dr(Uri uri) {
        return wb.dr(uri);
    }

    public static void ge() {
        dr().rb();
        if (q() != null) {
            q().clearAllData(dr);
        }
    }

    public static void dr(int i) {
        Map<Integer, ITTDownloadAdapter.OnEventLogHandler> map = bn;
        if (map != null) {
            map.remove(Integer.valueOf(i));
        }
    }

    public static void dr(int i, ITTDownloadAdapter.OnEventLogHandler onEventLogHandler) {
        if (onEventLogHandler != null) {
            if (bn == null) {
                bn = Collections.synchronizedMap(new WeakHashMap());
            }
            bn.put(Integer.valueOf(i), onEventLogHandler);
        }
    }

    public static Map<Integer, ITTDownloadAdapter.OnEventLogHandler> o() {
        return bn;
    }

    public static boolean dr(String str, String str2, JSONObject jSONObject, Object obj) {
        boolean z = false;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || jSONObject == null) {
            return false;
        }
        Map<Integer, ITTDownloadAdapter.OnEventLogHandler> o2 = o();
        if (o2 != null) {
            for (Map.Entry<Integer, ITTDownloadAdapter.OnEventLogHandler> entry : o2.entrySet()) {
                int intValue = entry.getKey().intValue();
                ITTDownloadAdapter.OnEventLogHandler value = entry.getValue();
                if (value != null) {
                    boolean onEventLog = value.onEventLog(intValue, jSONObject.toString(), str, str2, obj);
                    if (!z && !onEventLog) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    private static boolean bn() {
        return false;
    }

    private static boolean ge(Context context) {
        com.ss.android.download.api.dr dr2;
        if (context == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            packageName = "";
        }
        if (bn()) {
            try {
                dr2 = xu.dr(applicationContext).dr(AdBaseConstants.DownloadConfigureName.PANGOLIN);
            } catch (Throwable th) {
                dr2 = xu.dr(applicationContext).dr();
            }
        } else {
            dr2 = xu.dr(applicationContext).dr();
        }
        if (dr2 == null) {
            return false;
        }
        com.ss.android.download.api.dr dr3 = dr2.dr(new o()).dr(new dr()).dr(new C0099g(applicationContext)).dr(new ge()).dr(new com.ss.android.download.api.config.wb() { // from class: com.bytedance.sdk.openadsdk.downloadnew.g.3
            @Override // com.ss.android.download.api.config.wb
            public JSONObject dr() {
                if (g.g() != null) {
                    return g.g().getDownloadSettings();
                }
                return new JSONObject();
            }
        }).dr(new com.ss.android.download.api.config.ge() { // from class: com.bytedance.sdk.openadsdk.downloadnew.g.2
            @Override // com.ss.android.download.api.config.ge
            public boolean dr() {
                if (g.g() != null) {
                    return g.g().getAppIsBackground();
                }
                return false;
            }
        }).dr(new dr.C0289dr().ge("143").dr(TTAdConstant.APP_NAME).o("5.3.0.5").g(String.valueOf(5305)).dr()).dr(new lp() { // from class: com.bytedance.sdk.openadsdk.downloadnew.g.1
            @Override // com.ss.android.download.api.config.lp
            public byte[] dr(byte[] bArr, int i) {
                return new byte[0];
            }
        });
        dr3.dr(packageName + ".TTFileProvider").dr(dr(applicationContext, q() != null ? q().getDownloadSettings() : new JSONObject())).dr();
        com.ss.android.downloadlib.rb.dr.dr();
        if (!"main".equals(UMModuleRegister.INNER)) {
            xu.dr(applicationContext).g().dr(1);
            xu.dr(applicationContext).dr(rb);
            com.ss.android.socialbase.appdownloader.g.wb().dr(new IInstallAppHandler() { // from class: com.bytedance.sdk.openadsdk.downloadnew.g.4
                @Override // com.ss.android.socialbase.downloader.depend.IInstallAppHandler
                public boolean installApp(Intent intent) {
                    return false;
                }
            });
        }
        TTDownloadEventLogger tTDownloadEventLogger = q().getTTDownloadEventLogger();
        if (tTDownloadEventLogger != null) {
            tTDownloadEventLogger.onDownloadConfigReady();
        }
        return true;
    }

    private static DownloaderBuilder dr(Context context, JSONObject jSONObject) {
        return new DownloaderBuilder(context).downloadSetting(new IDownloadSettings() { // from class: com.bytedance.sdk.openadsdk.downloadnew.g.5
            @Override // com.ss.android.socialbase.downloader.depend.IDownloadSettings
            public JSONObject get() {
                if (g.g() != null) {
                    return g.g().getDownloadSettings();
                }
                return new JSONObject();
            }
        }).downloadExpSwitch(jSONObject.optInt("download_exp_switch_temp", 1040187391)).httpService(new q());
    }

    public static boolean dr(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        List<DownloadInfo> ge2 = com.ss.android.socialbase.appdownloader.g.wb().ge(context);
        if (!ge2.isEmpty()) {
            for (DownloadInfo downloadInfo : ge2) {
                if (downloadInfo != null && str.equals(downloadInfo.getUrl())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Context getContext() {
        Context context = q;
        return context == null ? TTAppContextHolder.getContext() : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class o implements ll {
        @Override // com.ss.android.download.api.config.ll
        public void dr(Activity activity, String[] strArr, final z zVar) {
            if (g.g() != null) {
                g.g().requestPermission(activity, strArr, new ITTPermissionCallback() { // from class: com.bytedance.sdk.openadsdk.downloadnew.g.o.1
                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTPermissionCallback
                    public void onGranted() {
                        z zVar2 = zVar;
                        if (zVar2 != null) {
                            zVar2.dr();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTPermissionCallback
                    public void onDenied(String str) {
                        z zVar2 = zVar;
                        if (zVar2 != null) {
                            zVar2.dr(str);
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.download.api.config.ll
        public boolean dr(Context context, String str) {
            if (g.g() != null) {
                return g.g().hasPermission(context, str);
            }
            return false;
        }

        @Override // com.ss.android.download.api.config.ll
        public void dr(Activity activity, int i, String[] strArr, int[] iArr) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class ge implements com.ss.android.download.api.config.xu {
        private ge() {
        }

        @Override // com.ss.android.download.api.config.xu
        public void dr(String str, String str2, Map<String, Object> map, final de deVar) {
            char c;
            int hashCode = str.hashCode();
            int i = 1;
            if (hashCode != 70454) {
                if (hashCode == 2461856 && str.equals("POST")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("GET")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                i = 0;
            } else if (c != 1) {
                i = 0;
            }
            if (g.g() != null) {
                g.g().execute(i, str2, map, new ITTHttpCallback() { // from class: com.bytedance.sdk.openadsdk.downloadnew.g.ge.1
                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback
                    public void onResponse(String str3) {
                        de deVar2 = deVar;
                        if (deVar2 != null) {
                            deVar2.dr(str3);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback
                    public void onError(Throwable th) {
                        de deVar2 = deVar;
                        if (deVar2 != null) {
                            deVar2.dr(th);
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.download.api.config.xu
        public void dr(String str, byte[] bArr, String str2, int i, final de deVar) {
            if (g.g() != null) {
                g.g().postBody(str, bArr, str2, new ITTHttpCallback() { // from class: com.bytedance.sdk.openadsdk.downloadnew.g.ge.2
                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback
                    public void onResponse(String str3) {
                        de deVar2 = deVar;
                        if (deVar2 != null) {
                            deVar2.dr(str3);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback
                    public void onError(Throwable th) {
                        de deVar2 = deVar;
                        if (deVar2 != null) {
                            deVar2.dr(th);
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes.dex */
    public static class q implements IDownloadHttpService {
        @Override // com.ss.android.socialbase.downloader.network.IDownloadHttpService
        public IDownloadHttpConnection downloadWithConnection(int i, String str, List<HttpHeader> list) throws IOException {
            final o.dr dr = com.bytedance.sdk.openadsdk.downloadnew.o.dr(str, list);
            if (dr != null) {
                return new IDownloadHttpConnection() { // from class: com.bytedance.sdk.openadsdk.downloadnew.g.q.1
                    @Override // com.ss.android.socialbase.downloader.network.IDownloadHttpConnection
                    public InputStream getInputStream() {
                        return dr.dr;
                    }

                    @Override // com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection
                    public String getResponseHeaderField(String str2) {
                        if (dr.ge != null) {
                            return dr.ge.get(str2);
                        }
                        return null;
                    }

                    @Override // com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection
                    public int getResponseCode() {
                        return dr.o;
                    }

                    @Override // com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection
                    public void cancel() {
                    }

                    @Override // com.ss.android.socialbase.downloader.network.IDownloadHttpConnection
                    public void end() {
                        try {
                            dr.g.disconnect();
                        } catch (Exception e) {
                        }
                    }
                };
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.downloadnew.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0099g implements yk {
        private final WeakReference<Context> dr;

        public C0099g(Context context) {
            this.dr = new WeakReference<>(context);
        }

        @Override // com.ss.android.download.api.config.yk
        public void dr(int i, Context context, DownloadModel downloadModel, String str, Drawable drawable, int i2) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    Toast.makeText(context, str, 0).show();
                }
            } catch (Exception e) {
                Logger.e("LibUIFactory", "showToastWithDuration e " + e.getMessage());
            }
        }

        @Override // com.ss.android.download.api.config.yk
        /* renamed from: dr */
        public AlertDialog ge(com.ss.android.download.api.model.ge geVar) {
            if (geVar != null && g.g() != null) {
                if (geVar.dr != null && (geVar.dr instanceof Activity)) {
                    return g.g().showDialogBySelf((Activity) geVar.dr, geVar.wb == 1, o(geVar));
                }
                g.g().showDialogByDelegate(this.dr, geVar.wb == 1, o(geVar));
            }
            return null;
        }

        private DialogBuilder o(final com.ss.android.download.api.model.ge geVar) {
            return DialogBuilder.builder().setTitle(geVar.ge).setMessage(geVar.o).setNegativeBtnText(geVar.q).setPositiveBtnText(geVar.g).setIcon(geVar.rb).setDialogStatusChangedListener(new IDialogStatusChangedListener() { // from class: com.bytedance.sdk.openadsdk.downloadnew.g.g.1
                @Override // com.bytedance.sdk.openadsdk.downloadnew.core.IDialogStatusChangedListener
                public void onPositiveBtnClick(DialogInterface dialogInterface) {
                    if (geVar.xu != null) {
                        geVar.xu.dr(dialogInterface);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.downloadnew.core.IDialogStatusChangedListener
                public void onNegativeBtnClick(DialogInterface dialogInterface) {
                    if (geVar.xu != null) {
                        try {
                            geVar.xu.ge(dialogInterface);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.downloadnew.core.IDialogStatusChangedListener
                public void onCancel(DialogInterface dialogInterface) {
                    if (geVar.xu != null) {
                        geVar.xu.o(dialogInterface);
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class dr implements rb {
        @Override // com.ss.android.download.api.config.rb
        public void dr(com.ss.android.download.api.model.o oVar) {
            com.bytedance.sdk.openadsdk.api.ge.ge("LibEventLogger", "onV3Event");
            dr(oVar, true);
        }

        @Override // com.ss.android.download.api.config.rb
        public void ge(com.ss.android.download.api.model.o oVar) {
            com.bytedance.sdk.openadsdk.api.ge.ge("LibEventLogger", "onEvent called");
            dr(oVar, false);
            o(oVar);
        }

        private void o(com.ss.android.download.api.model.o oVar) {
            if (oVar == null) {
                return;
            }
            Object yk = oVar.yk();
            JSONObject jSONObject = null;
            if (yk instanceof JSONObject) {
                jSONObject = (JSONObject) yk;
            }
            TTDownloadEventModel label = TTDownloadEventModel.builder().setTag(oVar.ge()).setExtJson(oVar.xu()).setMaterialMeta(jSONObject).setLabel(oVar.o());
            boolean z = "download_notification".equals(oVar.ge()) || "landing_h5_download_ad_button".equals(oVar.ge());
            if (g.g() != null) {
                g.g().executeLogUpload(label, z);
            }
        }

        private void dr(com.ss.android.download.api.model.o oVar, boolean z) {
            TTDownloadEventLogger tTDownloadEventLogger;
            if (g.g() == null || (tTDownloadEventLogger = g.g().getTTDownloadEventLogger()) == null || oVar == null) {
                return;
            }
            if (tTDownloadEventLogger.shouldFilterOpenSdkLog() && g.g().isOpenSdkEvent(oVar.toString())) {
                return;
            }
            if (z) {
                tTDownloadEventLogger.onV3Event(g.ge(oVar));
            } else {
                tTDownloadEventLogger.onEvent(g.ge(oVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject ge(com.ss.android.download.api.model.o oVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", oVar.dr());
            jSONObject.put("tag", oVar.ge());
            jSONObject.put(TTDownloadField.TT_LABEL, oVar.o());
            jSONObject.put("isAd", oVar.g());
            jSONObject.put(VungleAdActivity.AD_ID_EXTRA_KEY, oVar.q());
            jSONObject.put(TTDownloadField.TT_LOG_EXTRA, oVar.bn());
            jSONObject.put("extValue", oVar.rb());
            jSONObject.put("extJson", oVar.xu());
            jSONObject.put("paramsJson", oVar.ll());
            jSONObject.put("eventSource", oVar.t());
            jSONObject.put("extraObject", oVar.yk());
            jSONObject.put("clickTrackUrl", oVar.wb());
            jSONObject.put("isV3", oVar.cu());
            jSONObject.put("V3EventName", oVar.v());
            jSONObject.put("V3EventParams", oVar.il());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static boolean dr(Activity activity, final ExitInstallListener exitInstallListener) {
        return com.ss.android.downloadlib.addownload.dr.dr.dr().dr(activity, false, new dr.InterfaceC0291dr() { // from class: com.bytedance.sdk.openadsdk.downloadnew.g.7
            @Override // com.ss.android.downloadlib.addownload.dr.dr.InterfaceC0291dr
            public void dr() {
                ExitInstallListener exitInstallListener2 = ExitInstallListener.this;
                if (exitInstallListener2 != null) {
                    exitInstallListener2.onExitInstall();
                }
            }
        });
    }
}
