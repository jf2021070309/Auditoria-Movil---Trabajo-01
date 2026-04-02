package com.ss.android.downloadlib.addownload;

import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes3.dex */
public class o {
    private static String dr = o.class.getSimpleName();
    private static volatile o ge;
    private ConcurrentHashMap<Long, Runnable> o;

    public o() {
        this.o = null;
        this.o = new ConcurrentHashMap<>();
    }

    public static o dr() {
        if (ge == null) {
            synchronized (o.class) {
                if (ge == null) {
                    ge = new o();
                }
            }
        }
        return ge;
    }

    public void dr(q qVar, boolean z, int i, DownloadModel downloadModel) {
        if (downloadModel instanceof AdDownloadModel) {
            ((AdDownloadModel) downloadModel).setFunnelType(3);
        }
        long id = downloadModel.getId();
        if (i == 4) {
            if (!z) {
                dr(id, false, 2);
                qVar.ge(false);
                return;
            }
            dr(id, true, 2);
        } else if (i == 5) {
            if (!z) {
                dr(id, false, 1);
                qVar.o(false);
                return;
            }
            dr(id, true, 1);
        } else if (i == 7) {
            Runnable remove = this.o.remove(Long.valueOf(id));
            if (z) {
                com.ss.android.downloadlib.g.dr.dr().dr(id, 1);
                dr(id, true, 1);
                return;
            }
            if (remove != null) {
                com.ss.android.downloadlib.rb.dr().ge().post(remove);
            }
            dr(id, false, 1);
        }
    }

    private void dr(long j, boolean z, int i) {
        com.ss.android.downloadlib.g.dr.dr().dr(j, z, i);
        if (z) {
            wb.z().dr(null, null, null, null, null, 3);
        }
    }

    public void dr(final q qVar, final int i, final DownloadModel downloadModel) {
        com.ss.android.downloadlib.ge.q.dr().dr(new com.ss.android.downloadlib.ge.g() { // from class: com.ss.android.downloadlib.addownload.o.1
            @Override // com.ss.android.downloadlib.ge.g
            public void dr(boolean z) {
                o.this.dr(qVar, z, i, downloadModel);
            }
        }, ge());
    }

    public long ge() {
        return wb.ll().optLong("quick_app_check_internal", 1200L);
    }

    public static boolean dr(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.getStatus() == 0 || downloadInfo.getStatus() == -4) {
            return true;
        }
        return false;
    }
}
