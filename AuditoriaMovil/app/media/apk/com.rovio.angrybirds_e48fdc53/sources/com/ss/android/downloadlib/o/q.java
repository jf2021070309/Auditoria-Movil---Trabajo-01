package com.ss.android.downloadlib.o;

import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.monitor.InnerEventListener;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class q implements InnerEventListener {
    @Override // com.ss.android.socialbase.downloader.monitor.InnerEventListener
    public void onEvent(int i, String str, JSONObject jSONObject) {
        com.ss.android.downloadad.api.dr.ge dr;
        DownloadInfo downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(i);
        if (downloadInfo == null || (dr = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo)) == null) {
            return;
        }
        if (MonitorConstants.EventLabel.INSTALL_VIEW_RESULT.equals(str)) {
            jSONObject = yk.dr(jSONObject);
            com.ss.android.downloadlib.dr.dr(jSONObject, downloadInfo);
            yk.dr(jSONObject, "model_id", Long.valueOf(dr.ge()));
        }
        com.ss.android.downloadlib.g.dr.dr().ge(str, jSONObject, dr);
    }

    @Override // com.ss.android.socialbase.downloader.monitor.InnerEventListener
    public void onUnityEvent(int i, String str, JSONObject jSONObject) {
        com.ss.android.downloadad.api.dr.ge dr;
        DownloadInfo downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(i);
        if (downloadInfo == null || (dr = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo)) == null) {
            return;
        }
        com.ss.android.downloadlib.g.dr.dr().dr(str, jSONObject, dr);
    }
}
