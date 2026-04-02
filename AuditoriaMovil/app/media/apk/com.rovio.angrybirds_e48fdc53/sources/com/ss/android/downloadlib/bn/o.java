package com.ss.android.downloadlib.bn;

import com.ss.android.socialbase.appdownloader.o.ll;
import com.ss.android.socialbase.appdownloader.o.wb;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class o implements wb {
    private static volatile o dr;
    private List<wb> ge;

    public static o dr() {
        if (dr == null) {
            synchronized (o.class) {
                if (dr == null) {
                    dr = new o();
                }
            }
        }
        return dr;
    }

    private o() {
        ArrayList arrayList = new ArrayList();
        this.ge = arrayList;
        arrayList.add(new ge());
        this.ge.add(new dr());
    }

    @Override // com.ss.android.socialbase.appdownloader.o.wb
    public void dr(DownloadInfo downloadInfo, ll llVar) {
        if (downloadInfo == null || this.ge.size() == 0) {
            if (llVar != null) {
                llVar.dr();
                return;
            }
            return;
        }
        dr(downloadInfo, 0, llVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dr(final DownloadInfo downloadInfo, final int i, final ll llVar) {
        if (i == this.ge.size() || i < 0) {
            llVar.dr();
        } else {
            this.ge.get(i).dr(downloadInfo, new ll() { // from class: com.ss.android.downloadlib.bn.o.1
                @Override // com.ss.android.socialbase.appdownloader.o.ll
                public void dr() {
                    o.this.dr(downloadInfo, i + 1, llVar);
                }
            });
        }
    }
}
