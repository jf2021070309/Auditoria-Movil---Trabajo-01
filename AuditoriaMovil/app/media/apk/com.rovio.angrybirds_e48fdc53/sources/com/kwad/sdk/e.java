package com.kwad.sdk;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.kwad.sdk.api.core.fragment.FileProvider;
import com.kwad.sdk.core.download.DownloadParams;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.io.File;
/* loaded from: classes.dex */
public final class e {
    public static PendingIntent a(File file, int i, boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.addFlags(3);
        Context context = c.wO().getContext();
        Uri a = a(context, file);
        intent.setDataAndType(a, AdBaseConstants.MIME_APK);
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            context.grantUriPermission(resolveInfo.activityInfo.packageName, a, 3);
        }
        if (z) {
            c.wO();
            if (c.wR()) {
                intent = d(intent);
            }
        }
        return PendingIntent.getActivity(context, i, intent, Build.VERSION.SDK_INT >= 31 ? 201326592 : DownloadExpSwitchCode.BUGFIX_SIGBUS_24_25);
    }

    private static Uri a(Context context, File file) {
        if (Build.VERSION.SDK_INT >= 24) {
            return FileProvider.getUriForFile(context, context.getPackageName() + ".adFileProvider", file);
        }
        return Uri.fromFile(file);
    }

    private static Intent d(Intent intent) {
        Intent intent2 = new Intent("intent.action.requestInstallPermission");
        intent2.putExtra("fromNotification", true);
        intent2.putExtra(BaseGmsClient.KEY_PENDING_INTENT, intent);
        intent2.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        return intent2;
    }

    public static PendingIntent l(DownloadTask downloadTask) {
        File file = new File(downloadTask.getTargetFilePath());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.addFlags(3);
        Context context = c.wO().getContext();
        Uri a = a(context, file);
        intent.setDataAndType(a, AdBaseConstants.MIME_APK);
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            context.grantUriPermission(resolveInfo.activityInfo.packageName, a, 3);
        }
        c.wO();
        if (c.wR() && (downloadTask.getTag() instanceof DownloadParams) && ((DownloadParams) downloadTask.getTag()).requestInstallPermission) {
            intent = d(intent);
        }
        return PendingIntent.getActivity(context, downloadTask.getId(), intent, Build.VERSION.SDK_INT >= 31 ? 201326592 : DownloadExpSwitchCode.BUGFIX_SIGBUS_24_25);
    }

    public static PendingIntent m(String str, int i) {
        Context context = c.wO().getContext();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i, launchIntentForPackage, Build.VERSION.SDK_INT >= 31 ? 201326592 : DownloadExpSwitchCode.BUGFIX_SIGBUS_24_25);
    }
}
