package com.ss.android.downloadlib.bn;

import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.addownload.ge.bn;
import com.ss.android.socialbase.appdownloader.o.ll;
import com.ss.android.socialbase.appdownloader.o.wb;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
/* loaded from: classes3.dex */
public class dr implements wb {
    @Override // com.ss.android.socialbase.appdownloader.o.wb
    public void dr(DownloadInfo downloadInfo, final ll llVar) {
        dr(downloadInfo, new com.ss.android.downloadlib.guide.install.dr() { // from class: com.ss.android.downloadlib.bn.dr.1
            @Override // com.ss.android.downloadlib.guide.install.dr
            public void dr() {
                llVar.dr();
            }
        });
    }

    public void dr(final DownloadInfo downloadInfo, final com.ss.android.downloadlib.guide.install.dr drVar) {
        com.ss.android.downloadad.api.dr.ge dr = bn.dr().dr(downloadInfo);
        if (dr != null && com.ss.android.downloadlib.ge.ll.dr(dr)) {
            TTDelegateActivity.dr(dr, new com.ss.android.downloadlib.guide.install.dr() { // from class: com.ss.android.downloadlib.bn.dr.2
                @Override // com.ss.android.downloadlib.guide.install.dr
                public void dr() {
                    dr.this.ge(downloadInfo, drVar);
                }
            });
        } else {
            ge(downloadInfo, drVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ge(DownloadInfo downloadInfo, final com.ss.android.downloadlib.guide.install.dr drVar) {
        com.ss.android.downloadad.api.dr.ge dr = bn.dr().dr(downloadInfo);
        boolean dr2 = com.ss.android.downloadlib.ge.bn.dr(dr);
        boolean ge = com.ss.android.downloadlib.ge.bn.ge(dr);
        if (!dr2 || !ge) {
            drVar.dr();
        } else {
            com.ss.android.downloadlib.ge.o.dr(dr, new com.ss.android.downloadlib.guide.install.dr() { // from class: com.ss.android.downloadlib.bn.dr.3
                @Override // com.ss.android.downloadlib.guide.install.dr
                public void dr() {
                    drVar.dr();
                }
            });
        }
    }
}
