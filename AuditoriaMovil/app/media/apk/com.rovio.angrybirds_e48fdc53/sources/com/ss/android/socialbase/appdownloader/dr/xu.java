package com.ss.android.socialbase.appdownloader.dr;

import android.content.Context;
import android.content.Intent;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
/* loaded from: classes3.dex */
public class xu extends dr {
    public xu(Context context, DownloadSetting downloadSetting, String str) {
        super(context, downloadSetting, str);
    }

    @Override // com.ss.android.socialbase.appdownloader.dr.q
    public Intent ge() {
        Intent intent = new Intent(DownloadConstants.LOWER_OPPO + ".intent.action.OPEN_FILEMANAGER");
        intent.putExtra("CurrentDir", this.o);
        intent.putExtra("first_position", 1);
        intent.putExtra("CurrentMode", 1);
        intent.putExtra("com.iqoo.secure", true);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.addFlags(32768);
        intent.addFlags(1073741824);
        return intent;
    }
}
