package com.ss.android.socialbase.appdownloader.dr;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
/* loaded from: classes3.dex */
public class ge extends dr {
    public ge(Context context) {
        super(context, null, null);
    }

    @Override // com.ss.android.socialbase.appdownloader.dr.q
    public Intent ge() {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + this.dr.getPackageName()));
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        return intent;
    }
}
