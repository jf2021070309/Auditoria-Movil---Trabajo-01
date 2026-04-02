package com.ss.android.downloadlib.rb;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.ss.android.download.api.config.il;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class yk {
    private static Object[] ge = new Object[0];
    private static Object[] o = new Object[73];
    static final char[] dr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static String g = null;

    public static boolean dr(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new File(str).exists();
        }
        return false;
    }

    public static boolean ge(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    public static long dr(JSONObject jSONObject, String str) {
        return com.ss.android.download.api.o.ge.dr(jSONObject, str);
    }

    public static JSONObject dr(JSONObject jSONObject, JSONObject jSONObject2) {
        return com.ss.android.download.api.o.ge.dr(jSONObject, jSONObject2);
    }

    public static JSONObject dr(JSONObject jSONObject) {
        return com.ss.android.download.api.o.ge.dr(jSONObject);
    }

    public static JSONObject dr(JSONObject... jSONObjectArr) {
        return com.ss.android.download.api.o.ge.dr(jSONObjectArr);
    }

    public static boolean dr(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null) {
                return !queryIntentActivities.isEmpty();
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static PackageInfo dr(com.ss.android.downloadad.api.dr.ge geVar) {
        DownloadInfo downloadInfo;
        if (geVar == null || (downloadInfo = Downloader.getInstance(com.ss.android.downloadlib.addownload.wb.getContext()).getDownloadInfo(geVar.i())) == null) {
            return null;
        }
        try {
            return com.ss.android.socialbase.appdownloader.o.dr(com.ss.android.downloadlib.addownload.wb.getContext(), downloadInfo, downloadInfo.getSavePath(), downloadInfo.getName());
        } catch (Throwable th) {
            return null;
        }
    }

    public static Drawable dr(Context context, String str) {
        PackageManager packageManager;
        PackageInfo packageArchiveInfo;
        if (context != null && !TextUtils.isEmpty(str) && (packageArchiveInfo = (packageManager = context.getPackageManager()).getPackageArchiveInfo(str, 0)) != null) {
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            applicationInfo.sourceDir = str;
            applicationInfo.publicSourceDir = str;
            try {
                return applicationInfo.loadIcon(packageManager);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static int ge(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
                if (packageInfo != null) {
                    return packageInfo.versionCode;
                }
                return -1;
            } catch (PackageManager.NameNotFoundException e) {
                return -1;
            }
        }
        return -1;
    }

    public static Drawable o(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                return packageManager.getApplicationInfo(str, 0).loadIcon(packageManager);
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return null;
    }

    public static boolean g(Context context, String str) {
        if (context == null) {
            context = com.ss.android.downloadlib.addownload.wb.getContext();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static com.ss.android.downloadlib.addownload.ge.o dr(String str, int i, String str2) {
        com.ss.android.downloadlib.addownload.ge.o oVar = new com.ss.android.downloadlib.addownload.ge.o();
        if (TextUtils.isEmpty(str)) {
            return oVar;
        }
        try {
            PackageInfo packageInfo = com.ss.android.downloadlib.addownload.wb.getContext().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                oVar.ge(packageInfo.versionCode);
                oVar.dr(com.ss.android.downloadlib.addownload.ge.o.ge);
                il rb = com.ss.android.downloadlib.addownload.wb.rb();
                if (rb != null && rb.dr() && !dr(packageInfo.versionCode, i, packageInfo.versionName, str2)) {
                    oVar.dr(com.ss.android.downloadlib.addownload.ge.o.o);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return oVar;
    }

    private static boolean dr(int i, int i2, String str, String str2) {
        if (i2 == 0 && TextUtils.isEmpty(str2)) {
            return true;
        }
        if ((i2 > 0 && i >= i2) || dr(str, str2) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean ge(com.ss.android.downloadad.api.dr.ge geVar) {
        if (geVar == null) {
            return false;
        }
        return dr(geVar.q(), geVar.ho(), geVar.k()).dr();
    }

    public static boolean dr(DownloadModel downloadModel) {
        if (downloadModel == null) {
            return false;
        }
        return dr(downloadModel.getPackageName(), downloadModel.getVersionCode(), downloadModel.getVersionName()).dr();
    }

    public static boolean ge(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        if (context == null) {
            context = com.ss.android.downloadlib.addownload.wb.getContext();
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0;
    }

    public static boolean dr(Context context, String str, String str2) {
        PackageInfo packageArchiveInfo;
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            File file = new File(str);
            if (!file.exists() || (packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0)) == null || !packageArchiveInfo.packageName.equals(str2)) {
                return false;
            }
            int i = packageArchiveInfo.versionCode;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
            } catch (PackageManager.NameNotFoundException e) {
                packageInfo = null;
            }
            if (packageInfo == null) {
                return false;
            }
            if (i != packageInfo.versionCode) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean q(Context context, String str) {
        PackageInfo packageArchiveInfo;
        PackageInfo packageInfo;
        if (context == null || str == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            File file = new File(str);
            if (!file.exists() || (packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0)) == null) {
                return false;
            }
            String str2 = packageArchiveInfo.packageName;
            int i = packageArchiveInfo.versionCode;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
            } catch (PackageManager.NameNotFoundException e) {
                packageInfo = null;
            }
            if (packageInfo == null) {
                return false;
            }
            if (i > packageInfo.versionCode) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static Intent bn(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        return launchIntentForPackage;
    }

    public static Signature[] rb(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo != null) {
                return packageInfo.signatures;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static Signature[] xu(Context context, String str) {
        try {
            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 64);
            if (packageArchiveInfo != null) {
                return packageArchiveInfo.signatures;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static boolean dr(Signature[] signatureArr, Signature[] signatureArr2) {
        if (signatureArr == signatureArr2) {
            return true;
        }
        if (signatureArr == null || signatureArr2 == null || signatureArr.length != signatureArr2.length) {
            return false;
        }
        for (int i = 0; i < signatureArr.length; i++) {
            if ((signatureArr[i] == null && signatureArr2[i] != null) || (signatureArr[i] != null && !signatureArr[i].equals(signatureArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(String str) {
        File file;
        Context context = com.ss.android.downloadlib.addownload.wb.getContext();
        if (!TextUtils.isEmpty(str) && g(context, str)) {
            int i = context.getApplicationInfo().targetSdkVersion;
            if (com.ss.android.downloadlib.addownload.wb.ll().optInt("get_ext_dir_mode") != 0 || Build.VERSION.SDK_INT < 29 || ((i != 29 || Environment.isExternalStorageLegacy()) && i <= 29)) {
                try {
                    if (Build.VERSION.SDK_INT >= 29 && context.getApplicationInfo().targetSdkVersion >= 29 && com.ss.android.downloadlib.addownload.wb.ll().optInt("get_ext_dir_mode") == 1) {
                        file = ll(context, str);
                    } else {
                        String path = Environment.getExternalStorageDirectory().getPath();
                        file = new File(path, "android/data/" + str);
                    }
                    if (file.exists()) {
                        long dr2 = rb.dr(file);
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
                        if (packageInfo != null) {
                            if (packageInfo.lastUpdateTime < dr2) {
                                return true;
                            }
                        }
                        return false;
                    }
                    return false;
                } catch (Exception e) {
                    e.printStackTrace();
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public static File ll(Context context, String str) {
        String str2 = null;
        File parentFile = context.getExternalFilesDir(null).getParentFile();
        if (parentFile != null) {
            str2 = parentFile.getParent();
        }
        File file = new File(str2 + File.separator + str);
        StringBuilder sb = new StringBuilder();
        sb.append("getExtDir: file.toString()-->");
        sb.append(file.toString());
        Logger.d("ToolUtils", sb.toString());
        return file;
    }

    public static int dr(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String dr(String str, int i) {
        if (i == 0) {
            return "";
        }
        if (TextUtils.isEmpty(str) || str.length() <= i) {
            return str;
        }
        return str.substring(0, i);
    }

    public static int dr(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (str.equals(str2)) {
                    return 0;
                }
                String[] split = str.split("\\.");
                String[] split2 = str2.split("\\.");
                int min = Math.min(split.length, split2.length);
                int i = 0;
                int i2 = 0;
                while (i < min) {
                    i2 = Integer.parseInt(split[i]) - Integer.parseInt(split2[i]);
                    if (i2 != 0) {
                        break;
                    }
                    i++;
                }
                if (i2 != 0) {
                    return i2 > 0 ? 1 : -1;
                }
                for (int i3 = i; i3 < split.length; i3++) {
                    if (Integer.parseInt(split[i3]) > 0) {
                        return 1;
                    }
                }
                while (i < split2.length) {
                    if (Integer.parseInt(split2[i]) > 0) {
                        return -1;
                    }
                    i++;
                }
                return 0;
            }
            return -2;
        } catch (Exception e) {
            return -2;
        }
    }

    public static String dr(String... strArr) {
        return com.ss.android.download.api.o.ge.dr(strArr);
    }

    public static <T> T dr(T... tArr) {
        if (tArr == null) {
            throw new IllegalArgumentException("args is null");
        }
        for (T t : tArr) {
            if (t != null) {
                return t;
            }
        }
        throw new IllegalArgumentException("args is null");
    }

    public static long dr(long j) {
        try {
            return dr(Environment.getExternalStorageDirectory(), j);
        } catch (Exception e) {
            e.printStackTrace();
            return j;
        }
    }

    public static long dr(File file, long j) {
        if (file == null) {
            return j;
        }
        try {
            return DownloadUtils.getAvailableSpaceBytes(file.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
            return j;
        }
    }

    public static long dr(File file) {
        if (file == null) {
            return -1L;
        }
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            if (Build.VERSION.SDK_INT < 18) {
                return -1L;
            }
            return statFs.getTotalBytes();
        } catch (Throwable th) {
            th.printStackTrace();
            return -1L;
        }
    }

    public static boolean dr() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void dr(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jSONObject.putOpt(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void ge() {
        try {
            if (!com.ss.android.downloadlib.addownload.wb.q().dr(com.ss.android.downloadlib.addownload.wb.getContext(), "android.permission.REORDER_TASKS")) {
                return;
            }
            ActivityManager activityManager = (ActivityManager) com.ss.android.downloadlib.addownload.wb.getContext().getSystemService(TTDownloadField.TT_ACTIVITY);
            for (ActivityManager.RunningTaskInfo runningTaskInfo : activityManager.getRunningTasks(20)) {
                if (com.ss.android.downloadlib.addownload.wb.getContext().getPackageName().equals(runningTaskInfo.topActivity.getPackageName())) {
                    activityManager.moveTaskToFront(runningTaskInfo.id, 1);
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String, String> ge(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
                return hashMap;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }
}
