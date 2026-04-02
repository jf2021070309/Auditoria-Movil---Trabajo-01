package com.ss.android.downloadlib.addownload.g;

import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class q implements g {
    @Override // com.ss.android.downloadlib.addownload.g.g
    public boolean dr(com.ss.android.downloadad.api.dr.ge geVar, int i, o oVar) {
        if (geVar == null || !ge(geVar.i())) {
            return false;
        }
        if (System.currentTimeMillis() - geVar.ed() > dr(geVar.i())) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("pause_optimise_type", "mistake_click");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ss.android.downloadlib.g.dr.dr().dr("pause_optimise", jSONObject, geVar);
        return true;
    }

    private long dr(int i) {
        return DownloadSetting.obtain(i).optInt("pause_optimise_mistake_click_interval", 300);
    }

    private boolean ge(int i) {
        return DownloadSetting.obtain(i).optInt("pause_optimise_mistake_click_interval_switch", 0) == 1;
    }
}
