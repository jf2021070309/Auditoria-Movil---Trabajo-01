package com.bytedance.sdk.openadsdk.api.dr;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.ss.android.download.api.download.DownloadController;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class dr implements Bridge {
    private DownloadController dr;

    public dr(DownloadController downloadController) {
        this.dr = downloadController;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return com.bytedance.sdk.openadsdk.api.g.dr().dr(223300, dr()).dr(223301, ge()).dr(223302, o()).dr(223303, g()).dr(223304, q()).dr(223305, bn()).dr(223306, rb()).dr(223307, xu()).dr(223308, ll()).dr(223309, wb()).dr(2233010, t()).dr(223309, wb()).dr(223314, yk()).dr(223315, cu()).dr(223316, v()).dr(223318, il()).dr(223319, x()).ge();
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        if (i != 223317) {
            switch (i) {
                case 223311:
                    if (valueSet != null) {
                        dr(((Integer) valueSet.objectValue(223320, Integer.class)).intValue());
                        return null;
                    }
                    return null;
                case 223312:
                    if (valueSet != null) {
                        ge(((Integer) valueSet.objectValue(223321, Integer.class)).intValue());
                        return null;
                    }
                    return null;
                case 223313:
                    if (valueSet != null) {
                        dr(((Boolean) valueSet.objectValue(223322, Boolean.class)).booleanValue());
                        return null;
                    }
                    return null;
                default:
                    return null;
            }
        } else if (valueSet != null) {
            ge(((Boolean) valueSet.objectValue(223323, Boolean.class)).booleanValue());
            return null;
        } else {
            return null;
        }
    }

    public int dr() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.getLinkMode();
        }
        return 0;
    }

    public int ge() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.getDownloadMode();
        }
        return 0;
    }

    public boolean o() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.isEnableBackDialog();
        }
        return false;
    }

    public boolean g() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.isAddToDownloadManage();
        }
        return false;
    }

    public boolean q() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.isEnableMultipleDownload();
        }
        return false;
    }

    public int bn() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.getDowloadChunkCount();
        }
        return 0;
    }

    public Object rb() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.getExtraClickOperation();
        }
        return null;
    }

    public boolean xu() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.shouldUseNewWebView();
        }
        return false;
    }

    public int ll() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.getInterceptFlag();
        }
        return 0;
    }

    public JSONObject wb() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.getExtraJson();
        }
        return null;
    }

    public Object t() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.getExtraObject();
        }
        return null;
    }

    public void dr(int i) {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            downloadController.setDownloadMode(i);
        }
    }

    public void ge(int i) {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            downloadController.setLinkMode(i);
        }
    }

    public void dr(boolean z) {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            downloadController.setEnableShowComplianceDialog(z);
        }
    }

    public boolean yk() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.enableShowComplianceDialog();
        }
        return false;
    }

    public boolean cu() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.isAutoDownloadOnCardShow();
        }
        return false;
    }

    public boolean v() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.enableNewActivity();
        }
        return false;
    }

    public void ge(boolean z) {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            downloadController.setEnableNewActivity(z);
        }
    }

    public boolean il() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.enableAH();
        }
        return false;
    }

    public boolean x() {
        DownloadController downloadController = this.dr;
        if (downloadController != null) {
            return downloadController.enableAM();
        }
        return false;
    }
}
