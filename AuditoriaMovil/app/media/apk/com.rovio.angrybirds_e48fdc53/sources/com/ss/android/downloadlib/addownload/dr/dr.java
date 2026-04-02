package com.ss.android.downloadlib.addownload.dr;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.ss.android.download.api.model.ge;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.addownload.ge.bn;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.t;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.downloadlib.xu;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class dr {
    private static final String dr = dr.class.getSimpleName();
    private static dr ge;
    private ge bn;
    private boolean g = false;
    private CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.ge.dr> o;
    private String q;

    /* renamed from: com.ss.android.downloadlib.addownload.dr.dr$dr  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0291dr {
        void dr();
    }

    private dr() {
        ge geVar = new ge();
        this.bn = geVar;
        this.o = geVar.dr("sp_ad_install_back_dialog", "key_uninstalled_list");
    }

    public static dr dr() {
        if (ge == null) {
            ge = new dr();
        }
        return ge;
    }

    private boolean dr(Activity activity, DownloadInfo downloadInfo, boolean z, InterfaceC0291dr interfaceC0291dr) {
        if (downloadInfo == null) {
            try {
                if (this.o.isEmpty()) {
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        if (activity != null && !activity.isFinishing()) {
            boolean z2 = true;
            if (downloadInfo != null && this.o.isEmpty()) {
                dr(activity, new com.ss.android.downloadlib.addownload.ge.dr(downloadInfo.getId(), 0L, 0L, downloadInfo.getPackageName(), downloadInfo.getTitle(), null, downloadInfo.getTargetFilePath()), z, interfaceC0291dr);
                return true;
            }
            long j = 0;
            if (downloadInfo != null) {
                j = new File(downloadInfo.getTargetFilePath()).lastModified();
            }
            CopyOnWriteArrayList<com.ss.android.downloadlib.addownload.ge.dr> copyOnWriteArrayList = this.o;
            ListIterator<com.ss.android.downloadlib.addownload.ge.dr> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    z2 = false;
                    break;
                }
                com.ss.android.downloadlib.addownload.ge.dr previous = listIterator.previous();
                if (previous != null && !yk.g(wb.getContext(), previous.g) && yk.dr(previous.rb)) {
                    if (new File(previous.rb).lastModified() >= j) {
                        dr(activity, previous, z, interfaceC0291dr);
                    } else {
                        dr(activity, new com.ss.android.downloadlib.addownload.ge.dr(downloadInfo.getId(), 0L, 0L, downloadInfo.getPackageName(), downloadInfo.getTitle(), null, downloadInfo.getTargetFilePath()), z, interfaceC0291dr);
                    }
                }
            }
            t.dr(dr, "tryShowInstallDialog isShow:" + z2, null);
            return z2;
        }
        return false;
    }

    public boolean dr(Activity activity, boolean z, InterfaceC0291dr interfaceC0291dr) {
        if (wb.ll().optInt("disable_install_app_dialog") == 1 || this.g) {
            return false;
        }
        return dr(activity, dr(activity), z, interfaceC0291dr);
    }

    public void dr(Context context, com.ss.android.downloadlib.addownload.ge.dr drVar, boolean z, InterfaceC0291dr interfaceC0291dr) {
        this.o.clear();
        dr(context, drVar, interfaceC0291dr, z);
        this.g = true;
        xu.dr(context).o();
        this.bn.ge("sp_ad_install_back_dialog", "key_uninstalled_list");
        t.dr(dr, "tryShowInstallDialog isShow:true", null);
    }

    public DownloadInfo dr(Context context) {
        long ge2;
        List<DownloadInfo> successedDownloadInfosWithMimeType;
        DownloadInfo downloadInfo = null;
        try {
            ge2 = xu.dr(context).ge();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (wb.ll().optInt("enable_miniapp_dialog", 0) != 0 && (successedDownloadInfosWithMimeType = Downloader.getInstance(context).getSuccessedDownloadInfosWithMimeType(AdBaseConstants.MIME_APK)) != null && !successedDownloadInfosWithMimeType.isEmpty()) {
            long j = 0;
            for (DownloadInfo downloadInfo2 : successedDownloadInfosWithMimeType) {
                if (downloadInfo2 != null && !yk.g(context, downloadInfo2.getPackageName()) && yk.dr(downloadInfo2.getTargetFilePath())) {
                    long lastModified = new File(downloadInfo2.getTargetFilePath()).lastModified();
                    if (lastModified >= ge2 && downloadInfo2.getExtra() != null) {
                        try {
                            if (new JSONObject(downloadInfo2.getExtra()).has("isMiniApp") && (j == 0 || lastModified > j)) {
                                downloadInfo = downloadInfo2;
                                j = lastModified;
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
            return downloadInfo;
        }
        return null;
    }

    public void dr(long j, long j2, long j3, String str, String str2, String str3, String str4) {
        for (int i = 0; i < this.o.size(); i++) {
            com.ss.android.downloadlib.addownload.ge.dr drVar = this.o.get(i);
            if (drVar != null && drVar.ge == j2) {
                this.o.set(i, new com.ss.android.downloadlib.addownload.ge.dr(j, j2, j3, str, str2, str3, str4));
                this.bn.dr("sp_ad_install_back_dialog", "key_uninstalled_list", this.o);
                return;
            }
        }
        this.o.add(new com.ss.android.downloadlib.addownload.ge.dr(j, j2, j3, str, str2, str3, str4));
        this.bn.dr("sp_ad_install_back_dialog", "key_uninstalled_list", this.o);
    }

    private void dr(final Context context, final com.ss.android.downloadlib.addownload.ge.dr drVar, final InterfaceC0291dr interfaceC0291dr, boolean z) {
        final com.ss.android.downloadad.api.dr.ge g = bn.dr().g(drVar.ge);
        if (g == null) {
            com.ss.android.downloadlib.q.o.dr().dr("showBackInstallDialog nativeModel null");
            return;
        }
        com.ss.android.download.api.config.yk o = wb.o();
        ge.dr dr2 = new ge.dr(context).dr(z ? "应用安装确认" : "退出确认");
        Object[] objArr = new Object[1];
        objArr[0] = TextUtils.isEmpty(drVar.q) ? "刚刚下载的应用" : drVar.q;
        o.ge(dr2.ge(String.format("%1$s下载完成，是否立即安装？", objArr)).o("立即安装").g(z ? "暂不安装" : String.format("退出%1$s", context.getResources().getString(context.getApplicationContext().getApplicationInfo().labelRes))).dr(false).dr(yk.dr(context, drVar.rb)).dr(new ge.InterfaceC0290ge() { // from class: com.ss.android.downloadlib.addownload.dr.dr.1
            @Override // com.ss.android.download.api.model.ge.InterfaceC0290ge
            public void dr(DialogInterface dialogInterface) {
                com.ss.android.downloadlib.g.dr.dr().ge("backdialog_install", g);
                com.ss.android.socialbase.appdownloader.g.dr(context, (int) drVar.dr);
                dialogInterface.dismiss();
            }

            @Override // com.ss.android.download.api.model.ge.InterfaceC0290ge
            public void ge(DialogInterface dialogInterface) {
                com.ss.android.downloadlib.g.dr.dr().ge("backdialog_exit", g);
                InterfaceC0291dr interfaceC0291dr2 = interfaceC0291dr;
                if (interfaceC0291dr2 != null) {
                    interfaceC0291dr2.dr();
                }
                dr.this.ge("");
                dialogInterface.dismiss();
            }

            @Override // com.ss.android.download.api.model.ge.InterfaceC0290ge
            public void o(DialogInterface dialogInterface) {
                dr.this.ge("");
            }
        }).dr(1).dr());
        com.ss.android.downloadlib.g.dr.dr().ge("backdialog_show", g);
        this.q = drVar.g;
    }

    public boolean dr(String str) {
        return TextUtils.equals(this.q, str);
    }

    public void ge(String str) {
        if (TextUtils.isEmpty(str)) {
            this.q = "";
        } else if (TextUtils.equals(this.q, str)) {
            this.q = "";
        }
    }

    public void dr(com.ss.android.downloadad.api.dr.ge geVar) {
        if (wb.ll().optInt("enable_open_app_dialog", 0) == 1 && !geVar.b() && geVar.lp()) {
            geVar.t(true);
            TTDelegateActivity.dr(geVar);
        }
    }
}
