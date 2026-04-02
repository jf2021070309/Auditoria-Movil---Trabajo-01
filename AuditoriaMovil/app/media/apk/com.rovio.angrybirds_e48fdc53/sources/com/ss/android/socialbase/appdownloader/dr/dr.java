package com.ss.android.socialbase.appdownloader.dr;

import android.content.Context;
import android.util.Log;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
/* loaded from: classes3.dex */
public abstract class dr implements q {
    protected final Context dr;
    protected final DownloadSetting ge;
    protected final String o;

    public dr(Context context, DownloadSetting downloadSetting, String str) {
        this.dr = context;
        this.ge = downloadSetting;
        this.o = str;
    }

    public boolean dr() {
        if (this.dr == null) {
            return false;
        }
        try {
        } catch (Throwable th) {
            if (Logger.debug()) {
                Log.e("AbsDevicePlan", "check is valid failed!", th);
            }
        }
        return ge().resolveActivity(this.dr.getPackageManager()) != null;
    }
}
