package com.ss.android.downloadlib.addownload.o;

import com.ss.android.downloadlib.addownload.ge.bn;
import com.ss.android.downloadlib.addownload.ge.ll;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class ge implements Runnable {
    private DownloadInfo dr;

    public ge(DownloadInfo downloadInfo) {
        this.dr = downloadInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        final com.ss.android.downloadad.api.dr.ge dr;
        if (this.dr == null || (dr = bn.dr().dr(this.dr)) == null) {
            return;
        }
        com.ss.android.downloadlib.g.dr.dr().dr("cleanspace_task", dr);
        long longValue = Double.valueOf((com.ss.android.downloadlib.rb.q.dr(this.dr.getId()) + 1.0d) * this.dr.getTotalBytes()).longValue() - this.dr.getCurBytes();
        long dr2 = yk.dr(0L);
        if (wb.yk() != null) {
            wb.yk().q();
        }
        o.dr();
        o.ge();
        if (com.ss.android.downloadlib.rb.q.rb(dr.i())) {
            o.dr(wb.getContext());
        }
        long dr3 = yk.dr(0L);
        if (dr3 >= longValue) {
            dr.yk("1");
            ll.dr().dr(dr);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("quite_clean_size", Long.valueOf(dr3 - dr2));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            com.ss.android.downloadlib.g.dr.dr().dr("cleanspace_download_after_quite_clean", jSONObject, dr);
            Downloader.getInstance(wb.getContext()).restart(this.dr.getId());
        } else if (wb.yk() != null) {
            dr.g(false);
            g.dr().dr(dr.dr(), new q() { // from class: com.ss.android.downloadlib.addownload.o.ge.1
            });
            if (wb.yk().dr(this.dr.getId(), this.dr.getUrl(), true, longValue)) {
                dr.q(true);
            }
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.putOpt("show_dialog_result", 3);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.ss.android.downloadlib.g.dr.dr().dr("cleanspace_window_show", jSONObject2, dr);
        }
    }
}
