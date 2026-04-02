package com.ss.android.socialbase.appdownloader.dr;

import android.content.Context;
import android.content.Intent;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
/* loaded from: classes3.dex */
public class rb extends dr {
    public rb(Context context, DownloadSetting downloadSetting, String str) {
        super(context, downloadSetting, str);
    }

    @Override // com.ss.android.socialbase.appdownloader.dr.q
    public Intent ge() {
        Intent intent = new Intent(DownloadConstants.LOWER_OPPO + ".filemanager.intent.action.BROWSER_FILE");
        intent.putExtra("CurrentDir", this.o);
        intent.putExtra("CurrentMode", 1);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.addFlags(32768);
        intent.addFlags(1073741824);
        return intent;
    }
}
