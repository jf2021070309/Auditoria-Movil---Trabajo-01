package com.ss.android.socialbase.appdownloader.dr;

import android.content.Context;
import android.content.Intent;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
/* loaded from: classes3.dex */
public class yk extends dr {
    public yk(Context context, DownloadSetting downloadSetting, String str) {
        super(context, downloadSetting, str);
    }

    @Override // com.ss.android.socialbase.appdownloader.dr.q
    public Intent ge() {
        String optString = this.ge.optString("s");
        String dr = com.ss.android.socialbase.appdownloader.bn.o.dr(this.ge.optString("ag"), optString);
        String dr2 = com.ss.android.socialbase.appdownloader.bn.o.dr(this.ge.optString("ah"), optString);
        String dr3 = com.ss.android.socialbase.appdownloader.bn.o.dr(this.ge.optString("ai"), optString);
        String dr4 = com.ss.android.socialbase.appdownloader.bn.o.dr(this.ge.optString("aj"), optString);
        Intent intent = new Intent();
        intent.putExtra(dr, this.o);
        intent.putExtra(dr2, "*/*");
        intent.putExtra(dr3, true);
        intent.setAction(dr4);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.addFlags(32768);
        return intent;
    }
}
