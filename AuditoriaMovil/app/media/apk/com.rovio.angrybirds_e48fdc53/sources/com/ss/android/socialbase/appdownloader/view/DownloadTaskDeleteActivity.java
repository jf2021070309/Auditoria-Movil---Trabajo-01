package com.ss.android.socialbase.appdownloader.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import com.ss.android.socialbase.appdownloader.g;
import com.ss.android.socialbase.appdownloader.ll;
import com.ss.android.socialbase.appdownloader.o.o;
import com.ss.android.socialbase.appdownloader.o.t;
import com.ss.android.socialbase.appdownloader.o.yk;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventListener;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
/* loaded from: classes3.dex */
public class DownloadTaskDeleteActivity extends Activity {
    private t dr;
    private Intent ge;

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dr();
    }

    private void dr() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.ge = getIntent();
        ge();
        t tVar = this.dr;
        if (tVar != null && !tVar.ge()) {
            this.dr.dr();
        } else if (this.dr == null) {
            finish();
        }
    }

    private void ge() {
        Intent intent;
        if (this.dr != null || (intent = this.ge) == null) {
            return;
        }
        try {
            final boolean z = false;
            final int intExtra = intent.getIntExtra("extra_click_download_ids", 0);
            final DownloadInfo downloadInfo = Downloader.getInstance(getApplicationContext()).getDownloadInfo(intExtra);
            if (downloadInfo == null) {
                return;
            }
            String title = downloadInfo.getTitle();
            if (TextUtils.isEmpty(title)) {
                Log.w("DeleteActivity", "Missing appName; skipping handle");
                return;
            }
            String format = String.format(getString(ll.dr(this, "tt_appdownloader_notification_download_delete")), title);
            o dr = g.wb().dr();
            yk ykVar = null;
            if (dr != null) {
                ykVar = dr.dr(this);
            }
            if (ykVar == null) {
                ykVar = new com.ss.android.socialbase.appdownloader.g.dr(this);
            }
            if (ykVar != null) {
                int dr2 = ll.dr(this, "tt_appdownloader_tip");
                int dr3 = ll.dr(this, "tt_appdownloader_label_ok");
                int dr4 = ll.dr(this, "tt_appdownloader_label_cancel");
                if (DownloadSetting.obtain(downloadInfo.getId()).optInt(DownloadSettingKeys.CANCEL_WITH_NET_OPT, 0) == 1 && DownloadUtils.isNoWifiAndInNet() && downloadInfo.getCurBytes() != downloadInfo.getTotalBytes()) {
                    z = true;
                }
                if (z) {
                    dr3 = ll.dr(this, "tt_appdownloader_label_reserve_wifi");
                    dr4 = ll.dr(this, "tt_appdownloader_label_cancel_directly");
                    format = getResources().getString(ll.dr(this, "tt_appdownloader_resume_in_wifi"));
                }
                ykVar.dr(dr2).dr(format).dr(dr3, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (!z) {
                            DownloadTaskDeleteActivity.this.dr(downloadInfo, intExtra);
                        } else {
                            downloadInfo.setOnlyWifi(true);
                            Downloader.getInstance(DownloadTaskDeleteActivity.this).pause(downloadInfo.getId());
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Downloader.getInstance(DownloadTaskDeleteActivity.this).resume(downloadInfo.getId());
                                }
                            }, 100L);
                        }
                        DownloadTaskDeleteActivity.this.finish();
                    }
                }).ge(dr4, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (z) {
                            DownloadTaskDeleteActivity.this.dr(downloadInfo, intExtra);
                        }
                        DownloadTaskDeleteActivity.this.finish();
                    }
                }).dr(new DialogInterface.OnCancelListener() { // from class: com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        DownloadTaskDeleteActivity.this.finish();
                    }
                });
                this.dr = ykVar.dr();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dr(DownloadInfo downloadInfo, int i) {
        com.ss.android.socialbase.appdownloader.o.g ge = g.wb().ge();
        if (ge != null) {
            ge.dr(downloadInfo);
        }
        IDownloadNotificationEventListener downloadNotificationEventListener = Downloader.getInstance(DownloadComponentManager.getAppContext()).getDownloadNotificationEventListener(i);
        if (downloadNotificationEventListener != null) {
            downloadNotificationEventListener.onNotificationEvent(10, downloadInfo, "", "");
        }
        if (DownloadComponentManager.getAppContext() != null) {
            Downloader.getInstance(DownloadComponentManager.getAppContext()).cancel(i);
        }
    }
}
