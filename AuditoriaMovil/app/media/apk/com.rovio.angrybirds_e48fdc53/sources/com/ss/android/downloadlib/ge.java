package com.ss.android.downloadlib;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.constant.BaseConstants;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.download.api.model.ge;
import com.ss.android.downloadad.api.download.AdDownloadController;
import com.ss.android.downloadad.api.download.AdDownloadEventConfig;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.q.ge;
import com.ss.android.downloadlib.rb.ll;
import com.ss.android.downloadlib.rb.t;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class ge implements com.ss.android.downloadad.api.ge {
    private static String dr = ge.class.getSimpleName();
    private static volatile ge ge;
    private xu o = xu.dr(wb.getContext());

    private ge() {
    }

    public static ge dr() {
        if (ge == null) {
            synchronized (ge.class) {
                if (ge == null) {
                    ge = new ge();
                }
            }
        }
        return ge;
    }

    @Override // com.ss.android.downloadad.api.ge
    public Dialog dr(Context context, String str, boolean z, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, DownloadStatusChangeListener downloadStatusChangeListener, int i) {
        return dr(context, str, z, downloadModel, downloadEventConfig, downloadController, downloadStatusChangeListener, i, false);
    }

    @Override // com.ss.android.downloadad.api.ge
    public Dialog dr(Context context, String str, boolean z, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, DownloadStatusChangeListener downloadStatusChangeListener, int i, IDownloadButtonClickListener iDownloadButtonClickListener) {
        return dr(context, str, z, downloadModel, downloadEventConfig, downloadController, downloadStatusChangeListener, i, false, iDownloadButtonClickListener);
    }

    public Dialog dr(Context context, String str, boolean z, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, DownloadStatusChangeListener downloadStatusChangeListener, int i, boolean z2) {
        return dr(context, str, z, downloadModel, downloadEventConfig, downloadController, downloadStatusChangeListener, i, z2, null);
    }

    public Dialog dr(final Context context, final String str, final boolean z, final DownloadModel downloadModel, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController, final DownloadStatusChangeListener downloadStatusChangeListener, final int i, final boolean z2, final IDownloadButtonClickListener iDownloadButtonClickListener) {
        return (Dialog) com.ss.android.downloadlib.q.ge.dr(new ge.dr<Dialog>() { // from class: com.ss.android.downloadlib.ge.1
            @Override // com.ss.android.downloadlib.q.ge.dr
            /* renamed from: dr */
            public Dialog ge() {
                return ge.this.ge(context, str, z, downloadModel, downloadEventConfig, downloadController, downloadStatusChangeListener, i, z2, iDownloadButtonClickListener);
            }
        });
    }

    public Dialog ge(Context context, String str, boolean z, final DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, DownloadStatusChangeListener downloadStatusChangeListener, int i, boolean z2, IDownloadButtonClickListener iDownloadButtonClickListener) {
        if (dr(downloadModel.getId())) {
            if (z2) {
                dr(downloadModel.getId(), downloadEventConfig, downloadController);
            } else {
                ge(downloadModel.getId());
            }
            return null;
        } else if (context == null || TextUtils.isEmpty(downloadModel.getDownloadUrl())) {
            return null;
        } else {
            this.o.dr(context, i, downloadStatusChangeListener, downloadModel);
            boolean z3 = true;
            final DownloadEventConfig downloadEventConfig2 = (DownloadEventConfig) yk.dr(downloadEventConfig, o());
            final DownloadController downloadController2 = (DownloadController) yk.dr(downloadController, ge());
            downloadEventConfig2.setDownloadScene(1);
            boolean z4 = (wb.ll().optInt("disable_lp_dialog", 0) == 1) | z;
            if (!downloadController2.enableShowComplianceDialog() || !com.ss.android.downloadlib.addownload.compliance.ge.dr().dr(downloadModel)) {
                z3 = z4;
            }
            if (z3) {
                this.o.dr(downloadModel.getDownloadUrl(), downloadModel.getId(), 2, downloadEventConfig2, downloadController2, iDownloadButtonClickListener);
                return null;
            }
            String str2 = dr;
            t.dr(str2, "tryStartDownload show dialog appName:" + downloadModel.getDownloadUrl(), null);
            Dialog ge2 = wb.o().ge(new ge.dr(context).dr(downloadModel.getName()).ge("确认要下载此应用吗？").o("确认").g("取消").dr(new ge.InterfaceC0290ge() { // from class: com.ss.android.downloadlib.ge.2
                @Override // com.ss.android.download.api.model.ge.InterfaceC0290ge
                public void dr(DialogInterface dialogInterface) {
                    ge.this.o.dr(downloadModel.getDownloadUrl(), downloadModel.getId(), 2, downloadEventConfig2, downloadController2);
                    com.ss.android.downloadlib.g.dr.dr().dr("landing_download_dialog_confirm", downloadModel, downloadEventConfig2, downloadController2);
                    dialogInterface.dismiss();
                }

                @Override // com.ss.android.download.api.model.ge.InterfaceC0290ge
                public void ge(DialogInterface dialogInterface) {
                    com.ss.android.downloadlib.g.dr.dr().dr("landing_download_dialog_cancel", downloadModel, downloadEventConfig2, downloadController2);
                    dialogInterface.dismiss();
                }

                @Override // com.ss.android.download.api.model.ge.InterfaceC0290ge
                public void o(DialogInterface dialogInterface) {
                    com.ss.android.downloadlib.g.dr.dr().dr("landing_download_dialog_cancel", downloadModel, downloadEventConfig2, downloadController2);
                }
            }).dr(0).dr());
            com.ss.android.downloadlib.g.dr.dr().dr("landing_download_dialog_show", downloadModel, downloadEventConfig2, downloadController2);
            return ge2;
        }
    }

    @Override // com.ss.android.downloadad.api.ge
    public boolean dr(Context context, long j, String str, DownloadStatusChangeListener downloadStatusChangeListener, int i) {
        com.ss.android.downloadad.api.dr.ge g = com.ss.android.downloadlib.addownload.ge.bn.dr().g(j);
        if (g != null) {
            this.o.dr(context, i, downloadStatusChangeListener, g.zh());
            return true;
        }
        DownloadModel dr2 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(j);
        if (dr2 != null) {
            this.o.dr(context, i, downloadStatusChangeListener, dr2);
            return true;
        }
        return false;
    }

    @Override // com.ss.android.downloadad.api.ge
    public boolean dr(long j, int i) {
        DownloadModel dr2 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(j);
        if (dr2 != null) {
            this.o.dr(dr2.getDownloadUrl(), i);
            return true;
        }
        return false;
    }

    public void dr(long j, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        DownloadModel dr2 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(j);
        com.ss.android.downloadad.api.dr.ge g = com.ss.android.downloadlib.addownload.ge.bn.dr().g(j);
        if (dr2 == null && g != null) {
            dr2 = g.zh();
        }
        if (dr2 == null) {
            return;
        }
        if (downloadEventConfig == null || downloadController == null || (downloadEventConfig instanceof com.ss.android.download.api.download.o) || (downloadController instanceof com.ss.android.download.api.download.ge)) {
            ge(j);
            return;
        }
        downloadEventConfig.setDownloadScene(1);
        this.o.dr(dr2.getDownloadUrl(), j, 2, downloadEventConfig, downloadController);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.ss.android.download.api.download.DownloadController] */
    public void ge(long j) {
        DownloadEventConfig downloadEventConfig;
        AdDownloadController adDownloadController;
        DownloadModel dr2 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(j);
        com.ss.android.downloadad.api.dr.ge g = com.ss.android.downloadlib.addownload.ge.bn.dr().g(j);
        if (dr2 == null && g != null) {
            dr2 = g.zh();
        }
        if (dr2 == null) {
            return;
        }
        DownloadEventConfig ge2 = com.ss.android.downloadlib.addownload.ge.bn.dr().ge(j);
        DownloadController o = com.ss.android.downloadlib.addownload.ge.bn.dr().o(j);
        if (ge2 instanceof com.ss.android.download.api.download.o) {
            ge2 = null;
        }
        if (o instanceof com.ss.android.download.api.download.ge) {
            o = null;
        }
        if (g == null) {
            if (ge2 == null) {
                ge2 = o();
            }
            if (o != 0) {
                downloadEventConfig = ge2;
                adDownloadController = o;
            } else {
                downloadEventConfig = ge2;
                adDownloadController = ge();
            }
        } else {
            if (ge2 == null) {
                ge2 = new AdDownloadEventConfig.Builder().setClickButtonTag(g.wb()).setRefer(g.ll()).setIsEnableV3Event(g.cu()).setIsEnableClickEvent(false).setClickStartLabel("click_start_detail").setClickPauseLabel("click_pause_detail").setClickContinueLabel("click_continue_detail").setClickInstallLabel("click_install_detail").setStorageDenyLabel("storage_deny_detail").build();
            }
            if (o != null) {
                downloadEventConfig = ge2;
                adDownloadController = o;
            } else {
                downloadEventConfig = ge2;
                adDownloadController = g.sn();
            }
        }
        downloadEventConfig.setDownloadScene(1);
        this.o.dr(dr2.getDownloadUrl(), j, 2, downloadEventConfig, adDownloadController);
    }

    @Override // com.ss.android.downloadad.api.ge
    public boolean dr(long j) {
        return (com.ss.android.downloadlib.addownload.ge.bn.dr().dr(j) == null && com.ss.android.downloadlib.addownload.ge.bn.dr().g(j) == null) ? false : true;
    }

    @Override // com.ss.android.downloadad.api.ge
    public boolean dr(Context context, Uri uri, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        return dr(context, uri, downloadModel, downloadEventConfig, downloadController, null);
    }

    @Override // com.ss.android.downloadad.api.ge
    public boolean dr(final Context context, final Uri uri, final DownloadModel downloadModel, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController, final IDownloadButtonClickListener iDownloadButtonClickListener) {
        return ((Boolean) com.ss.android.downloadlib.q.ge.dr(new ge.dr<Boolean>() { // from class: com.ss.android.downloadlib.ge.3
            @Override // com.ss.android.downloadlib.q.ge.dr
            /* renamed from: dr */
            public Boolean ge() {
                return Boolean.valueOf(ge.this.ge(context, uri, downloadModel, downloadEventConfig, downloadController, iDownloadButtonClickListener));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ge(Context context, Uri uri, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, IDownloadButtonClickListener iDownloadButtonClickListener) {
        Context context2;
        DownloadController ge2;
        if (com.ss.android.download.api.o.dr.dr(uri) && wb.ll().optInt("disable_market") != 1) {
            if (context != null) {
                context2 = context;
            } else {
                context2 = wb.getContext();
            }
            String ge3 = com.ss.android.download.api.o.dr.ge(uri);
            if (downloadModel == null) {
                return ll.dr(context2, ge3).getType() == 5;
            }
            if (!TextUtils.isEmpty(ge3) && (downloadModel instanceof AdDownloadModel)) {
                ((AdDownloadModel) downloadModel).setPackageName(ge3);
            }
            if (downloadController != null) {
                downloadController.setDownloadMode(2);
                ge2 = downloadController;
            } else if ((downloadModel instanceof AdDownloadModel) && TextUtils.isEmpty(downloadModel.getDownloadUrl())) {
                ((AdDownloadModel) downloadModel).setDownloadUrl(uri.toString());
                ge2 = dr(true);
            } else if (downloadModel.getDownloadUrl().startsWith(BaseConstants.SCHEME_MARKET)) {
                ge2 = dr(true);
            } else {
                ge2 = ge();
            }
            com.ss.android.downloadlib.addownload.ge.q qVar = new com.ss.android.downloadlib.addownload.ge.q(downloadModel.getId(), downloadModel, (DownloadEventConfig) yk.dr(downloadEventConfig, o()), ge2);
            com.ss.android.downloadlib.addownload.ge.bn.dr().dr(qVar.ge);
            com.ss.android.downloadlib.addownload.ge.bn.dr().dr(qVar.dr, qVar.o);
            com.ss.android.downloadlib.addownload.ge.bn.dr().dr(qVar.dr, qVar.g);
            if (yk.dr(downloadModel) && DownloadSetting.obtainGlobal().optInt("app_link_opt") == 1 && com.ss.android.downloadlib.ge.dr.dr(qVar)) {
                return true;
            }
            JSONObject jSONObject = new JSONObject();
            yk.dr(jSONObject, "market_url", uri.toString());
            yk.dr(jSONObject, "download_scene", (Object) 1);
            com.ss.android.downloadlib.g.dr.dr().ge("market_click_open", jSONObject, qVar);
            com.ss.android.downloadlib.addownload.ge.rb dr2 = ll.dr(context2, qVar, ge3);
            String dr3 = yk.dr(dr2.ge(), "open_market");
            if (dr2.getType() == 5) {
                com.ss.android.downloadlib.ge.dr.dr(dr3, jSONObject, qVar, true);
                return true;
            } else if (dr2.getType() == 6) {
                yk.dr(jSONObject, "error_code", Integer.valueOf(dr2.dr()));
                com.ss.android.downloadlib.g.dr.dr().ge("market_open_failed", jSONObject, qVar);
                if (com.ss.android.downloadlib.addownload.xu.dr(downloadModel, iDownloadButtonClickListener)) {
                    iDownloadButtonClickListener.handleMarketFailedComplianceDialog();
                }
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static DownloadController ge() {
        return dr(false);
    }

    public static DownloadController dr(boolean z) {
        AdDownloadController.Builder shouldUseNewWebView = new AdDownloadController.Builder().setLinkMode(0).setIsEnableBackDialog(true).setIsEnableMultipleDownload(false).setShouldUseNewWebView(false);
        if (z) {
            shouldUseNewWebView.setDownloadMode(2);
        } else {
            shouldUseNewWebView.setDownloadMode(0);
        }
        return shouldUseNewWebView.build();
    }

    public static DownloadEventConfig o() {
        return new AdDownloadEventConfig.Builder().setClickButtonTag("landing_h5_download_ad_button").setClickItemTag("landing_h5_download_ad_button").setClickStartLabel("click_start_detail").setClickPauseLabel("click_pause_detail").setClickContinueLabel("click_continue_detail").setClickInstallLabel("click_install_detail").setClickOpenLabel("click_open_detail").setStorageDenyLabel("storage_deny_detail").setDownloadScene(1).setIsEnableClickEvent(false).setIsEnableNoChargeClickEvent(true).setIsEnableV3Event(false).build();
    }
}
