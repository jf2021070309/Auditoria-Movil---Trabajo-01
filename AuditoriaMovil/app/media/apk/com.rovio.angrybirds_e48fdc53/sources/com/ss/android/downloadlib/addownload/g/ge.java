package com.ss.android.downloadlib.addownload.g;

import android.content.Context;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.addownload.ll;
import com.ss.android.downloadlib.xu;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class ge implements g {
    private static com.ss.android.downloadlib.addownload.dr.o dr;

    public static com.ss.android.downloadlib.addownload.dr.o dr() {
        return dr;
    }

    @Override // com.ss.android.downloadlib.addownload.g.g
    public boolean dr(final com.ss.android.downloadad.api.dr.ge geVar, int i, final o oVar) {
        DownloadInfo ge;
        if (geVar == null || geVar.yd() || !dr(geVar) || (ge = xu.dr((Context) null).ge(geVar.dr())) == null) {
            return false;
        }
        long curBytes = ge.getCurBytes();
        long totalBytes = ge.getTotalBytes();
        if (curBytes > 0 && totalBytes > 0) {
            int dr2 = ll.dr(ge.getId(), (int) ((curBytes * 100) / totalBytes));
            if (dr2 > dr(geVar.i())) {
                dr = new com.ss.android.downloadlib.addownload.dr.o() { // from class: com.ss.android.downloadlib.addownload.g.ge.1
                    @Override // com.ss.android.downloadlib.addownload.dr.o
                    public void dr() {
                        com.ss.android.downloadlib.addownload.dr.o unused = ge.dr = null;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.putOpt("pause_optimise_type", "download_percent");
                            jSONObject.putOpt("pause_optimise_action", "confirm");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        com.ss.android.downloadlib.g.dr.dr().dr("pause_optimise", jSONObject, geVar);
                    }

                    @Override // com.ss.android.downloadlib.addownload.dr.o
                    public void ge() {
                        com.ss.android.downloadlib.addownload.dr.o unused = ge.dr = null;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.putOpt("pause_optimise_type", "download_percent");
                            jSONObject.putOpt("pause_optimise_action", "cancel");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        com.ss.android.downloadlib.g.dr.dr().dr("pause_optimise", jSONObject, geVar);
                        oVar.dr(geVar);
                    }
                };
                TTDelegateActivity.ge(geVar, String.format("已下载%s%%，即将下载完成，是否继续下载？", Integer.valueOf(dr2)), "继续", "暂停");
                geVar.il(true);
                return true;
            }
        }
        return false;
    }

    private int dr(int i) {
        return DownloadSetting.obtain(i).optInt("pause_optimise_download_percent", 50);
    }

    private boolean dr(com.ss.android.downloadad.api.dr.dr drVar) {
        return com.ss.android.downloadlib.rb.q.dr(drVar).optInt("pause_optimise_download_percent_switch", 0) == 1 && drVar.lp();
    }
}
