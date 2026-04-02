package com.bytedance.sdk.openadsdk.api.dr;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.DeepLink;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class o implements Bridge {
    private DownloadModel dr;

    public o(DownloadModel downloadModel) {
        this.dr = downloadModel;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return com.bytedance.sdk.openadsdk.api.g.dr().dr(223400, dr()).dr(223401, ge()).dr(223402, o()).dr(223403, g()).dr(223404, q()).dr(223405, bn()).dr(223406, rb()).dr(223407, xu()).dr(223408, ll()).dr(223409, wb()).dr(223410, t()).dr(223411, yk()).dr(223412, cu()).dr(223413, v()).dr(223414, il()).dr(223415, x()).dr(223416, lp()).dr(223418, i()).dr(223421, ii()).dr(223422, uq()).dr(223423, n()).dr(223424, m()).dr(223425, j()).dr(223426, at()).dr(223427, rt()).dr(223428, e()).dr(223429, qx()).dr(223430, a()).dr(223431, bg()).dr(223432, f()).dr(223433, l()).dr(223434, ho()).dr(223435, k()).dr(223436, ux()).dr(223437, xq()).dr(223438, h()).dr(223432, nn()).dr(223433, oz()).dr(223434, ci()).dr(223435, os()).ge();
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        switch (i) {
            case 223417:
                de();
                return null;
            case 223419:
                z();
                return null;
            case 223420:
                tb();
                return null;
            case 223430:
                if (valueSet != null) {
                    return (T) dr((String) valueSet.objectValue(223431, String.class));
                }
                return null;
            default:
                return null;
        }
    }

    public String dr() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getDownloadUrl();
        }
        return null;
    }

    public List<String> ge() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getBackupUrls();
        }
        return null;
    }

    public String o() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getNotificationJumpUrl();
        }
        return null;
    }

    public long g() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getId();
        }
        return 0L;
    }

    public String q() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getMd5();
        }
        return null;
    }

    public long bn() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getExpectFileLength();
        }
        return 0L;
    }

    public long rb() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getExtraValue();
        }
        return 0L;
    }

    public String xu() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getName();
        }
        return null;
    }

    public String ll() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getMimeType();
        }
        return null;
    }

    public Map<String, String> wb() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getHeaders();
        }
        return null;
    }

    public boolean t() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.isShowToast();
        }
        return false;
    }

    public boolean yk() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.isShowNotification();
        }
        return false;
    }

    public boolean cu() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.isNeedWifi();
        }
        return false;
    }

    public boolean v() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.isInExternalPublicDir();
        }
        return false;
    }

    public boolean il() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.isVisibleInDownloadsUi();
        }
        return false;
    }

    public String x() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getFilePath();
        }
        return null;
    }

    public String lp() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getFileName();
        }
        return null;
    }

    public void de() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            downloadModel.forceWifi();
        }
    }

    public JSONObject i() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getDownloadSettings();
        }
        return null;
    }

    public void z() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            downloadModel.forceHideToast();
        }
    }

    public void tb() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            downloadModel.forceHideNotification();
        }
    }

    public boolean ii() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.needIndependentProcess();
        }
        return false;
    }

    public int uq() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getVersionCode();
        }
        return 0;
    }

    public String n() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getVersionName();
        }
        return null;
    }

    public boolean m() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.isAd();
        }
        return false;
    }

    public String j() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getLogExtra();
        }
        return null;
    }

    public String at() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getPackageName();
        }
        return null;
    }

    public String rt() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getAppIcon();
        }
        return null;
    }

    public DeepLink e() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getDeepLink();
        }
        return null;
    }

    public List<String> qx() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getClickTrackUrl();
        }
        return null;
    }

    public JSONObject a() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getExtra();
        }
        return null;
    }

    public int bg() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getModelType();
        }
        return 0;
    }

    public com.ss.android.download.api.model.g f() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getQuickAppModel();
        }
        return null;
    }

    public boolean l() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.autoInstallWithoutNotification();
        }
        return false;
    }

    public IDownloadFileUriProvider ho() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getDownloadFileUriProvider();
        }
        return null;
    }

    public boolean k() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.shouldDownloadWithPatchApply();
        }
        return false;
    }

    public int ux() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getExecutorGroup();
        }
        return 0;
    }

    public int xq() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getFunnelType();
        }
        return 0;
    }

    public String h() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getStartToast();
        }
        return null;
    }

    public DownloadModel dr(String str) {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.setFilePath(str);
        }
        return null;
    }

    public String nn() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.getSdkMonitorScene();
        }
        return null;
    }

    public boolean oz() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.isAutoInstall();
        }
        return false;
    }

    public boolean ci() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.distinctDir();
        }
        return false;
    }

    public boolean os() {
        DownloadModel downloadModel = this.dr;
        if (downloadModel != null) {
            return downloadModel.enablePause();
        }
        return false;
    }
}
