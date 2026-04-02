package com.ss.android.socialbase.appdownloader.bn.dr;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.share.internal.ShareConstants;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.monitor.IDownloadMonitorListener;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class q {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:152:0x015e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static android.content.pm.PackageInfo dr(java.io.File r13) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.bn.dr.q.dr(java.io.File):android.content.pm.PackageInfo");
    }

    public static PackageInfo dr(Context context, File file, int i) {
        if (DownloadExpSwitchCode.isSwitchEnable(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP) && Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 26) {
            try {
                return dr(file);
            } catch (Throwable th) {
                dr("getPackageInfo::unzip_getpackagearchiveinfo", th.getMessage());
                return ge(context, file, i);
            }
        }
        return ge(context, file, i);
    }

    private static PackageInfo ge(Context context, File file, int i) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            dr("unzip_getpackagearchiveinfo", "packageManager == null");
            return null;
        }
        try {
            return packageManager.getPackageArchiveInfo(file.getPath(), i);
        } catch (Throwable th) {
            dr("unzip_getpackagearchiveinfo", "pm.getPackageArchiveInfo failed: " + th.getMessage());
            return null;
        }
    }

    private static void dr(String str, String str2) {
        IDownloadMonitorListener downloadMonitorListener = DownloadComponentManager.getDownloadMonitorListener();
        if (downloadMonitorListener == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str2);
        } catch (JSONException e) {
        }
        downloadMonitorListener.monitorEvent(str, jSONObject, null, null);
    }

    private static String dr(int i) {
        if ((i >>> 24) == 1) {
            return "android:";
        }
        return "";
    }

    private static String dr(dr drVar, int i) {
        int ge = drVar.ge(i);
        int o = drVar.o(i);
        if (ge == 3) {
            return drVar.g(i);
        }
        return ge == 2 ? String.format("?%s%08X", dr(o), Integer.valueOf(o)) : (ge < 16 || ge > 31) ? String.format("<0x%X, type 0x%02X>", Integer.valueOf(o), Integer.valueOf(ge)) : String.valueOf(o);
    }

    public static String dr(Context context, PackageInfo packageInfo, String str) {
        if (packageInfo != null && packageInfo.applicationInfo != null) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            applicationInfo.sourceDir = str;
            applicationInfo.publicSourceDir = str;
            try {
                return applicationInfo.loadLabel(context.getPackageManager()).toString();
            } catch (OutOfMemoryError e) {
                dr("getPackageInfo::fail_load_label", e.getMessage());
                return null;
            }
        }
        return null;
    }
}
