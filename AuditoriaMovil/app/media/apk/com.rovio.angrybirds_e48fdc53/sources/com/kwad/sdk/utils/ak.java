package com.kwad.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.kwad.sdk.api.core.fragment.FileProvider;
import com.kwad.sdk.service.ServiceProvider;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.io.File;
/* loaded from: classes3.dex */
public final class ak {
    public static boolean ak(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Exception e) {
            return false;
        }
    }

    public static int al(Context context, String str) {
        if (context == null || str == null || c.bH(context) || ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.i) != 0) {
            return -1;
        }
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        File file = new File(absolutePath + "/Android/data/" + str);
        return (file.exists() && file.isDirectory()) ? 1 : 0;
    }

    public static boolean am(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                return false;
            }
            com.kwad.sdk.core.e.c.d("PackageUtil", "openApp context: " + context);
            launchIntentForPackage.setFlags(337641472);
            context.startActivity(launchIntentForPackage);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean an(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                File file = new File(str);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
                intent.addFlags(3);
                Uri uriForFile = Build.VERSION.SDK_INT >= 24 ? FileProvider.getUriForFile(context, context.getPackageName() + ".adFileProvider", file) : Uri.fromFile(file);
                intent.setDataAndType(uriForFile, AdBaseConstants.MIME_APK);
                for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
                    context.grantUriPermission(resolveInfo.activityInfo.packageName, uriForFile, 3);
                }
                context.startActivity(intent);
                return true;
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            }
        }
        return false;
    }

    public static void ap(String str, String str2) {
        String str3;
        com.kwad.sdk.core.e.c.w("PackageUtil", "saveDownloadFile " + str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str3 = "cannot save package, has no download apk info.";
        } else {
            File file = new File(str);
            if (file.exists()) {
                Context context = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext();
                if (context == null) {
                    return;
                }
                y.f(context, str2, file.length());
                try {
                    y.g(context, str2, a.getFileMD5(file));
                    return;
                } catch (Exception e) {
                    com.kwad.sdk.core.e.c.printStackTrace(e);
                    return;
                }
            }
            str3 = "cannot save package, download apk is not exists.";
        }
        com.kwad.sdk.core.e.c.w("PackageUtil", str3);
    }

    public static int aq(String str, String str2) {
        String str3;
        com.kwad.sdk.core.e.c.w("PackageUtil", "isPackageChanged " + str + " packageName " + str2);
        Context context = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext();
        if (context == null) {
            return 0;
        }
        long R = y.R(context, str);
        String S = y.S(context, str);
        if (TextUtils.isEmpty(S) || R <= 0) {
            str3 = "cannot judge package, has no download apk info.";
        } else {
            try {
                PackageInfo packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(str2, 0);
                if (TextUtils.isEmpty(str2) || packageInfo == null || packageInfo.applicationInfo == null || TextUtils.isEmpty(packageInfo.applicationInfo.publicSourceDir)) {
                    str3 = "cannot judge package, cannot get installed apk info.";
                } else {
                    File file = new File(packageInfo.applicationInfo.publicSourceDir);
                    if (!file.exists()) {
                        str3 = "cannot judge package, insgtalled apk is not exists.";
                    } else if (R != file.length()) {
                        return 1;
                    } else {
                        if (TextUtils.isEmpty(S)) {
                            str3 = "cannot judge package, cannot calculate md5 of download file.";
                        } else {
                            String fileMD5 = a.getFileMD5(file);
                            if (!TextUtils.isEmpty(fileMD5)) {
                                return S.equalsIgnoreCase(fileMD5) ? 2 : 1;
                            }
                            str3 = "cannot judge package, cannot calculate md5 of installed file.";
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
                return 0;
            }
        }
        com.kwad.sdk.core.e.c.w("PackageUtil", str3);
        return 0;
    }

    public static String fD(String str) {
        PackageInfo packageArchiveInfo;
        if (!new File(str).exists()) {
            com.kwad.sdk.core.e.c.w("PackageUtil", "cannot save package, download apk is not exists.");
            return null;
        }
        Context context = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext();
        if (context == null || (packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 1)) == null) {
            return null;
        }
        return packageArchiveInfo.applicationInfo.packageName;
    }
}
