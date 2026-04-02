package com.kwad.sdk.core.download.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.util.List;
/* loaded from: classes.dex */
public class b {
    public static int i(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return 0;
        }
        try {
            com.kwad.sdk.core.e.c.d("BaseDeepLinkHelper", "handleDeepLink: " + str);
            Uri parse = Uri.parse(str);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(parse);
            intent.setFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return 0;
            }
            context.startActivity(intent);
            return 1;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            return -1;
        }
    }
}
