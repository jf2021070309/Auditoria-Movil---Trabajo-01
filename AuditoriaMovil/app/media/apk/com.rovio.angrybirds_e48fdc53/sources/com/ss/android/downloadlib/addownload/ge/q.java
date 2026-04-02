package com.ss.android.downloadlib.addownload.ge;

import android.text.TextUtils;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadad.api.download.AdDownloadController;
import com.ss.android.downloadad.api.download.AdDownloadEventConfig;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class q implements com.ss.android.downloadad.api.dr.dr {
    public long dr;
    public DownloadController g;
    public DownloadModel ge;
    public DownloadEventConfig o;

    public q() {
    }

    public q(long j, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        this.dr = j;
        this.ge = downloadModel;
        this.o = downloadEventConfig;
        this.g = downloadController;
    }

    public boolean n() {
        DownloadModel downloadModel;
        if (this.dr == 0 || (downloadModel = this.ge) == null || this.o == null || this.g == null) {
            return true;
        }
        return downloadModel.isAd() && this.dr <= 0;
    }

    public boolean m() {
        if (n()) {
            return false;
        }
        if (this.ge.isAd()) {
            DownloadModel downloadModel = this.ge;
            return (downloadModel instanceof AdDownloadModel) && !TextUtils.isEmpty(downloadModel.getLogExtra()) && (this.o instanceof AdDownloadEventConfig) && (this.g instanceof AdDownloadController);
        }
        return this.ge instanceof AdDownloadModel;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public String dr() {
        return this.ge.getDownloadUrl();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public long ge() {
        return this.ge.getId();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public boolean o() {
        return this.ge.isAd();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public String g() {
        return this.ge.getLogExtra();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public String q() {
        return this.ge.getPackageName();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public String bn() {
        if (this.ge.getDeepLink() != null) {
            return this.ge.getDeepLink().getOpenUrl();
        }
        return null;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public JSONObject rb() {
        return this.ge.getExtra();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public int xu() {
        if (this.g.getDownloadMode() == 2) {
            return 2;
        }
        return this.ge.getFunnelType();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public long yk() {
        return this.ge.getExtraValue();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public List<String> v() {
        return this.ge.getClickTrackUrl();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public String ll() {
        return this.o.getRefer();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public String wb() {
        return this.o.getClickButtonTag();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public JSONObject t() {
        return this.o.getParamsJson();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public boolean cu() {
        return this.o.isEnableV3Event();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public Object il() {
        return this.o.getExtraEventObject();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public JSONObject x() {
        return this.o.getExtraJson();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public boolean lp() {
        return this.g.enableNewActivity();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public JSONObject de() {
        return this.ge.getDownloadSettings();
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public int i() {
        return 0;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public DownloadModel tb() {
        return this.ge;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public DownloadEventConfig ii() {
        return this.o;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public DownloadController uq() {
        return this.g;
    }

    @Override // com.ss.android.downloadad.api.dr.dr
    public int z() {
        return this.o.getDownloadScene();
    }
}
