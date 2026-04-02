package com.ss.android.downloadlib.addownload.g;

import android.content.Context;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadlib.xu;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class bn {
    private static bn dr;
    private List<g> ge;

    public static bn dr() {
        if (dr == null) {
            synchronized (bn.class) {
                if (dr == null) {
                    dr = new bn();
                }
            }
        }
        return dr;
    }

    private bn() {
        ArrayList arrayList = new ArrayList();
        this.ge = arrayList;
        arrayList.add(new q());
        this.ge.add(new rb());
        this.ge.add(new ge());
        this.ge.add(new dr());
    }

    public void dr(com.ss.android.downloadad.api.dr.ge geVar, int i, o oVar) {
        List<g> list = this.ge;
        if (list == null || list.size() == 0 || geVar == null) {
            oVar.dr(geVar);
            return;
        }
        DownloadInfo ge = xu.dr((Context) null).ge(geVar.dr());
        if (ge == null || !AdBaseConstants.MIME_APK.equals(ge.getMimeType())) {
            oVar.dr(geVar);
            return;
        }
        boolean z = DownloadSetting.obtain(geVar.i()).optInt("pause_optimise_switch", 0) == 1;
        for (g gVar : this.ge) {
            if (z || (gVar instanceof rb)) {
                if (gVar.dr(geVar, i, oVar)) {
                    return;
                }
            }
        }
        oVar.dr(geVar);
    }
}
