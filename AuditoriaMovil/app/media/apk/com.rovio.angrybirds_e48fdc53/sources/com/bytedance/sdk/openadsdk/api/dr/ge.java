package com.bytedance.sdk.openadsdk.api.dr;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.ss.android.download.api.download.DownloadEventConfig;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ge implements Bridge {
    private DownloadEventConfig dr;

    public ge(DownloadEventConfig downloadEventConfig) {
        this.dr = downloadEventConfig;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return com.bytedance.sdk.openadsdk.api.g.dr().dr(223500, dr()).dr(223501, ge()).dr(223502, o()).dr(223503, g()).dr(223504, q()).dr(223505, bn()).dr(223506, rb()).dr(223507, xu()).dr(223508, ll()).dr(223509, wb()).dr(223510, t()).dr(223511, yk()).dr(223512, cu()).dr(223513, v()).dr(223514, il()).ge();
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 223515) {
            if (valueSet != null) {
                dr(((Integer) valueSet.objectValue(223516, Integer.class)).intValue());
                return null;
            }
            return null;
        } else if (i == 223517 && valueSet != null) {
            dr((String) valueSet.objectValue(223518, String.class));
            return null;
        } else {
            return null;
        }
    }

    public String dr() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getRefer();
        }
        return null;
    }

    public String ge() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickButtonTag();
        }
        return null;
    }

    public String o() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickItemTag();
        }
        return null;
    }

    public String g() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickLabel();
        }
        return null;
    }

    public String q() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickStartLabel();
        }
        return null;
    }

    public String bn() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickPauseLabel();
        }
        return null;
    }

    public String rb() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickContinueLabel();
        }
        return null;
    }

    public String xu() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getClickInstallLabel();
        }
        return null;
    }

    public String ll() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getStorageDenyLabel();
        }
        return null;
    }

    public Object wb() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getExtraEventObject();
        }
        return null;
    }

    public int t() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getDownloadScene();
        }
        return 0;
    }

    public boolean yk() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.isEnableClickEvent();
        }
        return false;
    }

    public boolean cu() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.isEnableV3Event();
        }
        return false;
    }

    public JSONObject v() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getExtraJson();
        }
        return null;
    }

    public JSONObject il() {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            return downloadEventConfig.getParamsJson();
        }
        return null;
    }

    public void dr(int i) {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            downloadEventConfig.setDownloadScene(i);
        }
    }

    public void dr(String str) {
        DownloadEventConfig downloadEventConfig = this.dr;
        if (downloadEventConfig != null) {
            downloadEventConfig.setRefer(str);
        }
    }
}
