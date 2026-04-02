package com.ss.android.socialbase.appdownloader.dr;

import android.content.Context;
import android.content.Intent;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
/* loaded from: classes3.dex */
public class bn extends dr {
    public bn(Context context) {
        super(context, null, null);
    }

    @Override // com.ss.android.socialbase.appdownloader.dr.q
    public Intent ge() {
        Intent intent = new Intent("android.settings.SECURITY_SETTINGS");
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        return intent;
    }
}
