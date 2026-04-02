package com.ss.android.socialbase.appdownloader;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import android.util.Log;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.socialbase.appdownloader.o.wb;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventListener;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import com.ss.android.socialbase.downloader.utils.SystemUtils;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class o {
    private static int dr;
    private static NotificationChannel ge = null;

    private static String dr(long j, long j2, String str, boolean z) {
        double d = j;
        if (j2 > 1) {
            d /= j2;
        }
        if (z || "GB".equals(str) || "TB".equals(str)) {
            return new DecimalFormat("#.##").format(d) + " " + str;
        }
        return new DecimalFormat("#").format(d) + " " + str;
    }

    public static String dr(long j) {
        return dr(j, true);
    }

    public static String dr(long j, boolean z) {
        long[] jArr = {DownloadConstants.TB, 1073741824, 1048576, 1024, 1};
        String[] strArr = {"TB", "GB", "MB", "KB", "B"};
        if (j < 1) {
            return "0 " + strArr[4];
        }
        for (int i = 0; i < 5; i++) {
            long j2 = jArr[i];
            if (j >= j2) {
                return dr(j, j2, strArr[i], z);
            }
        }
        return null;
    }

    private static String dr(long j, long j2, String str) {
        double d = j;
        if (j2 > 1) {
            d /= j2;
        }
        if ("MB".equals(str)) {
            return new DecimalFormat("#").format(d) + str;
        }
        return new DecimalFormat("#.##").format(d) + str;
    }

    public static String ge(long j) {
        long[] jArr = {DownloadConstants.TB, 1073741824, 1048576, 1024, 1};
        String[] strArr = {"TB", "GB", "MB", "KB", "B"};
        if (j < 1) {
            return "0 " + strArr[4];
        }
        for (int i = 0; i < 5; i++) {
            long j2 = jArr[i];
            if (j >= j2) {
                return dr(j, j2, strArr[i]);
            }
        }
        return null;
    }

    public static int dr(final Context context, final int i, final boolean z) {
        wb rb = g.wb().rb();
        if (rb == null) {
            return g(context, i, z);
        }
        DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i);
        dr = 1;
        rb.dr(downloadInfo, new com.ss.android.socialbase.appdownloader.o.ll() { // from class: com.ss.android.socialbase.appdownloader.o.1
            @Override // com.ss.android.socialbase.appdownloader.o.ll
            public void dr() {
                int unused = o.dr = o.g(context, i, z);
            }
        });
        return dr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(Context context, int i, boolean z) {
        if (DownloadSetting.obtain(i).optInt("notification_opt_2") == 1) {
            DownloadNotificationManager.getInstance().cancelNotification(i);
        }
        dr((Activity) xu.dr().ge());
        if (DownloadSetting.obtain(i).optInt("install_queue_enable", 0) == 1) {
            return xu.dr().dr(context, i, z);
        }
        return ge(context, i, z);
    }

    public static int ge(final Context context, final int i, final boolean z) {
        final DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i);
        if (downloadInfo != null && AdBaseConstants.MIME_APK.equals(downloadInfo.getMimeType()) && !TextUtils.isEmpty(downloadInfo.getSavePath()) && !TextUtils.isEmpty(downloadInfo.getName())) {
            final File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            if (file.exists()) {
                DownloadComponentManager.submitIOTask(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.o.2
                    @Override // java.lang.Runnable
                    public void run() {
                        int dr2 = o.dr(context, i, z, downloadInfo, file);
                        if (dr2 == 1 && g.wb().il() != null) {
                            g.wb().il().onOpenInstaller(downloadInfo, null);
                        }
                        o.ge(downloadInfo, z, dr2);
                    }
                });
                return 1;
            }
        }
        ge(downloadInfo, z, 2);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ge(DownloadInfo downloadInfo, boolean z, int i) {
        if (downloadInfo == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("by_user", z ? 1 : 2);
            jSONObject.put("view_result", i);
            jSONObject.put("real_package_name", downloadInfo.getFilePackageName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        DownloadComponentManager.getEventListener().onEvent(downloadInfo.getId(), MonitorConstants.EventLabel.INSTALL_VIEW_RESULT, jSONObject);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r0 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int dr(android.content.Context r5, int r6, boolean r7, com.ss.android.socialbase.downloader.model.DownloadInfo r8, java.io.File r9) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.o.dr(android.content.Context, int, boolean, com.ss.android.socialbase.downloader.model.DownloadInfo, java.io.File):int");
    }

    public static int dr(Context context, Intent intent) {
        try {
            if (g.wb().v() != null) {
                if (g.wb().v().installApp(intent)) {
                    return 1;
                }
            }
        } catch (Throwable th) {
        }
        try {
            context.startActivity(intent);
            return 1;
        } catch (Throwable th2) {
            return 0;
        }
    }

    public static boolean dr(Context context, DownloadInfo downloadInfo, PackageInfo packageInfo) {
        if (packageInfo != null && !packageInfo.packageName.equals(downloadInfo.getPackageName())) {
            com.ss.android.socialbase.appdownloader.o.g ge2 = g.wb().ge();
            if (ge2 != null) {
                ge2.dr(downloadInfo.getId(), 8, downloadInfo.getPackageName(), packageInfo.packageName, "");
                if (ge2.dr()) {
                    return true;
                }
            }
            IDownloadNotificationEventListener downloadNotificationEventListener = Downloader.getInstance(context).getDownloadNotificationEventListener(downloadInfo.getId());
            if (downloadNotificationEventListener != null) {
                downloadNotificationEventListener.onNotificationEvent(8, downloadInfo, packageInfo.packageName, "");
                com.ss.android.socialbase.appdownloader.o.o dr2 = g.wb().dr();
                if ((dr2 instanceof com.ss.android.socialbase.appdownloader.o.dr) && ((com.ss.android.socialbase.appdownloader.o.dr) dr2).o()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean dr(Context context, int i, File file) {
        if (DownloadSetting.obtain(i).optInt("back_miui_silent_install", 1) == 1) {
            return false;
        }
        if ((com.ss.android.socialbase.appdownloader.bn.q.yk() || com.ss.android.socialbase.appdownloader.bn.q.cu()) && SystemUtils.checkServiceExists(context, "com.miui.securitycore", "com.miui.enterprise.service.EntInstallService")) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.miui.securitycore", "com.miui.enterprise.service.EntInstallService"));
            Bundle bundle = new Bundle();
            bundle.putInt("userId", 0);
            bundle.putInt("flag", 256);
            bundle.putString("apkPath", file.getPath());
            bundle.putString("installerPkg", "com.miui.securitycore");
            intent.putExtras(bundle);
            try {
                context.startService(intent);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static int dr() {
        return g.wb().bn() ? 16384 : 0;
    }

    public static Uri dr(int i, IDownloadFileUriProvider iDownloadFileUriProvider, Context context, String str, File file) {
        Uri uriForFile;
        if (iDownloadFileUriProvider != null) {
            try {
                uriForFile = iDownloadFileUriProvider.getUriForFile(str, file.getAbsolutePath());
            } catch (Throwable th) {
            }
        } else {
            com.ss.android.socialbase.appdownloader.o.bn q = g.wb().q();
            if (q != null) {
                try {
                    uriForFile = q.dr(i, str, file.getAbsolutePath());
                } catch (Throwable th2) {
                }
            }
            uriForFile = null;
        }
        if (uriForFile == null) {
            try {
                if (Build.VERSION.SDK_INT >= 24 && !TextUtils.isEmpty(str)) {
                    uriForFile = FileProvider.getUriForFile(context, str, file);
                } else {
                    uriForFile = Uri.fromFile(file);
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
        return uriForFile;
    }

    private static Intent dr(Context context, DownloadInfo downloadInfo, File file, boolean z, int[] iArr) {
        boolean z2;
        Uri dr2 = dr(downloadInfo.getId(), Downloader.getInstance(context).getDownloadFileUriProvider(downloadInfo.getId()), context, g.wb().g(), file);
        if (dr2 == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
        }
        intent.setDataAndType(dr2, AdBaseConstants.MIME_APK);
        com.ss.android.socialbase.appdownloader.o.g ge2 = g.wb().ge();
        if (ge2 == null) {
            z2 = 0;
        } else {
            z2 = ge2.dr(downloadInfo.getId(), z);
        }
        IDownloadNotificationEventListener downloadNotificationEventListener = Downloader.getInstance(context).getDownloadNotificationEventListener(downloadInfo.getId());
        int i = z2;
        if (downloadNotificationEventListener != null) {
            i = downloadNotificationEventListener.interceptAfterNotificationSuccess(z);
        }
        iArr[0] = i;
        if (i != 0) {
            return null;
        }
        return intent;
    }

    public static boolean dr(DownloadInfo downloadInfo, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(downloadInfo.getPackageName()) || !str.equals(downloadInfo.getPackageName())) {
            return !TextUtils.isEmpty(downloadInfo.getName()) && dr(DownloadComponentManager.getAppContext(), downloadInfo, str);
        }
        return true;
    }

    public static boolean dr(Context context, DownloadInfo downloadInfo, String str) {
        boolean z = false;
        if (context == null) {
            return false;
        }
        try {
            File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            PackageInfo packageInfo = null;
            if (file.exists()) {
                Log.e("AppDownloadUtils", "isPackageNameEqualsWithApk fileName:" + downloadInfo.getName() + " apkFileSize：" + file.length() + " fileUrl：" + downloadInfo.getUrl());
                PackageInfo dr2 = dr(downloadInfo, file);
                if (dr2 == null || !dr2.packageName.equals(str)) {
                    return false;
                }
                int i = dr2.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str, dr());
                } catch (PackageManager.NameNotFoundException e) {
                }
                if (packageInfo != null && i == packageInfo.versionCode) {
                    z = true;
                }
                return z;
            } else if (!DownloadSetting.obtain(downloadInfo.getId()).optBugFix("install_callback_error")) {
                return false;
            } else {
                String string = DownloadUtils.getString(downloadInfo.getTempCacheData().get("extra_apk_package_name"), null);
                int i2 = DownloadUtils.getInt(downloadInfo.getTempCacheData().get("extra_apk_version_code"), 0);
                if (string == null || TextUtils.isEmpty(string) || !string.equals(str)) {
                    return false;
                }
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str, dr());
                } catch (PackageManager.NameNotFoundException e2) {
                }
                return packageInfo != null && i2 == packageInfo.versionCode;
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public static boolean ge(Context context, DownloadInfo downloadInfo, PackageInfo packageInfo) {
        return dr(context, downloadInfo, packageInfo, false);
    }

    public static boolean dr(Context context, DownloadInfo downloadInfo, PackageInfo packageInfo, boolean z) {
        PackageInfo packageInfo2;
        if (packageInfo == null) {
            return false;
        }
        String str = packageInfo.packageName;
        int i = packageInfo.versionCode;
        if (downloadInfo != null) {
            downloadInfo.setAppVersionCode(i);
        }
        try {
            packageInfo2 = context.getPackageManager().getPackageInfo(str, dr());
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo2 = null;
        }
        if (packageInfo2 == null) {
            return false;
        }
        int i2 = packageInfo2.versionCode;
        if (z) {
            if (i >= i2) {
                return false;
            }
            return true;
        } else if (downloadInfo != null && DownloadSetting.obtain(downloadInfo.getId()).optInt("install_with_same_version_code", 0) == 1) {
            if (i >= i2) {
                return false;
            }
            return true;
        } else if (i > i2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean dr(Context context, DownloadInfo downloadInfo) {
        return dr(context, downloadInfo, true);
    }

    public static boolean dr(Context context, DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo == null) {
            return false;
        }
        String packageName = downloadInfo.getPackageName();
        int appVersionCode = downloadInfo.getAppVersionCode();
        if (appVersionCode > 0 || !z) {
            PackageInfo packageInfo = null;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(packageName, dr());
            } catch (PackageManager.NameNotFoundException e) {
            }
            if (packageInfo == null) {
                return false;
            }
            return DownloadSetting.obtain(downloadInfo.getId()).optInt("install_with_same_version_code", 0) == 1 ? appVersionCode < packageInfo.versionCode : appVersionCode <= packageInfo.versionCode;
        }
        return o(context, downloadInfo);
    }

    public static int ge(Context context, DownloadInfo downloadInfo) {
        if (context == null || downloadInfo == null || TextUtils.isEmpty(downloadInfo.getSavePath()) || TextUtils.isEmpty(downloadInfo.getName())) {
            return 0;
        }
        int appVersionCode = downloadInfo.getAppVersionCode();
        if (appVersionCode > 0) {
            return appVersionCode;
        }
        try {
            PackageInfo dr2 = dr(context, downloadInfo, downloadInfo.getSavePath(), downloadInfo.getName());
            if (dr2 != null) {
                int i = dr2.versionCode;
                downloadInfo.setAppVersionCode(i);
                return i;
            }
        } catch (Throwable th) {
        }
        return 0;
    }

    public static boolean o(Context context, DownloadInfo downloadInfo) {
        if (context == null || downloadInfo == null || TextUtils.isEmpty(downloadInfo.getSavePath()) || TextUtils.isEmpty(downloadInfo.getName())) {
            return false;
        }
        return ge(context, downloadInfo, dr(context, downloadInfo, downloadInfo.getSavePath(), downloadInfo.getName()));
    }

    public static PackageInfo dr(Context context, DownloadInfo downloadInfo, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        File file = new File(str, str2);
        if (file.exists()) {
            Log.e("AppDownloadUtils", "isApkInstalled apkFileSize：fileName:" + file.getPath() + " apkFileSize" + file.length());
            return dr(downloadInfo, file);
        }
        return null;
    }

    public static String dr(String str, String str2, String str3, boolean z) {
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        if (z) {
            if (TextUtils.isEmpty(str2)) {
                str2 = (TextUtils.isEmpty(parse.getLastPathSegment()) || parse.getLastPathSegment().contains("..")) ? "default.apk" : parse.getLastPathSegment();
            }
        } else {
            if (!TextUtils.isEmpty(parse.getLastPathSegment()) && !parse.getLastPathSegment().contains("..")) {
                str4 = parse.getLastPathSegment();
            }
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            } else if (TextUtils.isEmpty(str2)) {
                str2 = "default.apk";
            }
        }
        if (o(str3) && !str2.endsWith(".apk")) {
            return str2 + ".apk";
        }
        return str2;
    }

    public static String ge() {
        return DownloadUtils.getDownloadPath();
    }

    public static String dr(String str, DownloadSetting downloadSetting) {
        JSONObject optJSONObject;
        if (downloadSetting != null && (optJSONObject = downloadSetting.optJSONObject(DownloadSettingKeys.KEY_ANTI_HIJACK_DIR)) != null) {
            String optString = optJSONObject.optString(DownloadSettingKeys.AntiHijackDir.KEY_ANTI_HIJACK_DIR_NAME);
            if (!TextUtils.isEmpty(optString) && optString.startsWith("/")) {
                optString = optString.substring(1);
            }
            if (TextUtils.isEmpty(optString)) {
                return optString;
            }
            if (!optString.contains("%s")) {
                optString = optString + str;
            } else {
                try {
                    optString = String.format(optString, str);
                } catch (Throwable th) {
                }
            }
            return optString.length() > 255 ? optString.substring(optString.length() - 255) : optString;
        }
        return "";
    }

    public static boolean dr(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new JSONObject(str).optBoolean("bind_app", false);
    }

    public static boolean ge(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (!jSONObject.optBoolean("bind_app", false)) {
            if (jSONObject.optBoolean("auto_install_with_notification", true)) {
                return false;
            }
        }
        return true;
    }

    public static int dr(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == -2) {
            return 2;
        }
        if (i == 1) {
            return 4;
        }
        if (DownloadStatus.isDownloading(i) || i == 11) {
            return 1;
        }
        if (!DownloadStatus.isDownloadOver(i)) {
            return 0;
        }
        return 3;
    }

    public static boolean o(String str) {
        return !TextUtils.isEmpty(str) && str.equals(AdBaseConstants.MIME_APK);
    }

    public static boolean dr(Context context) {
        int color;
        TypedArray obtainStyledAttributes;
        if (Build.VERSION.SDK_INT <= 20 || context == null) {
            return false;
        }
        try {
            color = context.getResources().getColor(q.ge());
            obtainStyledAttributes = context.obtainStyledAttributes(q.q(), new int[]{q.o(), q.g()});
        } catch (Throwable th) {
        }
        if (color == obtainStyledAttributes.getColor(0, 0)) {
            if (obtainStyledAttributes != null) {
                try {
                    obtainStyledAttributes.recycle();
                } catch (Throwable th2) {
                }
            }
            return true;
        }
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        return false;
    }

    public static String ge(Context context) {
        try {
            if (ge == null) {
                NotificationChannel notificationChannel = new NotificationChannel("111111", "channel_appdownloader", 3);
                ge = notificationChannel;
                notificationChannel.setSound(null, null);
                ge.setShowBadge(false);
                ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(ge);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "111111";
    }

    public static List<String> o() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(AdBaseConstants.MIME_APK);
        arrayList.add("application/ttpatch");
        return arrayList;
    }

    public static void dr(DownloadInfo downloadInfo, boolean z, boolean z2) {
        g.wb().dr(new bn(DownloadComponentManager.getAppContext(), downloadInfo.getUrl()).dr(downloadInfo.getTitle()).ge(downloadInfo.getName()).o(downloadInfo.getSavePath()).dr(downloadInfo.isShowNotification()).ge(downloadInfo.isAutoInstallWithoutNotification()).o(downloadInfo.isOnlyWifi() || z2).g(downloadInfo.getExtra()).q(downloadInfo.getMimeType()).dr(downloadInfo.getExtraHeaders()).q(true).ge(downloadInfo.getRetryCount()).o(downloadInfo.getBackUpUrlRetryCount()).ge(downloadInfo.getBackUpUrls()).g(downloadInfo.getMinProgressTimeMsInterval()).q(downloadInfo.getMaxProgressCount()).bn(z).g(downloadInfo.isNeedHttpsToHttpRetry()).bn(downloadInfo.getPackageName()).rb(downloadInfo.getMd5()).dr(downloadInfo.getExpectFileLength()).ll(downloadInfo.isNeedDefaultHttpServiceBackUp()).wb(downloadInfo.isNeedReuseFirstConnection()).yk(downloadInfo.isNeedIndependentProcess()).dr(downloadInfo.getEnqueueType()).v(downloadInfo.isForce()).cu(downloadInfo.isHeadConnectionAvailable()).rb(downloadInfo.isNeedRetryDelay()).xu(downloadInfo.getRetryDelayTimeArray()).dr(g(downloadInfo.getDownloadSettingString())).wb(downloadInfo.getIconUrl()).bn(downloadInfo.getExecutorGroup()).x(downloadInfo.isAutoInstall()));
    }

    private static JSONObject g(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (Throwable th) {
                return null;
            }
        }
        return null;
    }

    public static void dr(Activity activity) {
        if (activity != null) {
            try {
                if (!activity.isFinishing()) {
                    activity.finish();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static PackageInfo dr(DownloadInfo downloadInfo, File file) {
        if (downloadInfo == null) {
            return com.ss.android.socialbase.appdownloader.bn.dr.q.dr(DownloadComponentManager.getAppContext(), file, dr());
        }
        PackageInfo packageInfo = downloadInfo.getPackageInfo();
        if (packageInfo == null) {
            PackageInfo dr2 = com.ss.android.socialbase.appdownloader.bn.dr.q.dr(DownloadComponentManager.getAppContext(), file, dr());
            downloadInfo.setPackageInfo(dr2);
            return dr2;
        }
        return packageInfo;
    }

    public static int dr(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
