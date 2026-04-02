package com.ss.android.downloadlib.addownload;

import com.ss.android.socialbase.downloader.downloader.IReserveWifiStatusListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class t implements IReserveWifiStatusListener {
    @Override // com.ss.android.socialbase.downloader.downloader.IReserveWifiStatusListener
    public void onStatusChanged(DownloadInfo downloadInfo, int i, int i2) {
        com.ss.android.downloadad.api.dr.ge dr = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("reserve_wifi_source", Integer.valueOf(i2));
            jSONObject.putOpt("reserve_wifi_status", Integer.valueOf(i));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ss.android.downloadlib.g.dr.dr().dr("pause_reserve_wifi", jSONObject, dr);
    }
}
