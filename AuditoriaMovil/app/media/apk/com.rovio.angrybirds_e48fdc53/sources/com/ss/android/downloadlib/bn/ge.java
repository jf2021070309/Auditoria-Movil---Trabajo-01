package com.ss.android.downloadlib.bn;

import com.ss.android.downloadlib.addownload.ge.bn;
import com.ss.android.socialbase.appdownloader.o.ll;
import com.ss.android.socialbase.appdownloader.o.wb;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes3.dex */
public class ge implements wb {
    @Override // com.ss.android.socialbase.appdownloader.o.wb
    public void dr(DownloadInfo downloadInfo, ll llVar) {
        com.ss.android.downloadad.api.dr.ge dr;
        if (downloadInfo != null && (dr = bn.dr().dr(downloadInfo)) != null) {
            downloadInfo.setLinkMode(dr.oz());
        }
        if (llVar != null) {
            llVar.dr();
        }
    }
}
