package com.ss.android.socialbase.appdownloader.q;

import android.content.Context;
import com.ss.android.socialbase.downloader.depend.AbsNotificationListener;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.AbsNotificationItem;
/* loaded from: classes3.dex */
public class ge extends AbsNotificationListener {
    private String bn;
    private Context dr;
    private String g;
    private int ge;
    private String o;
    private String q;
    private AbsNotificationItem rb;

    public ge(Context context, int i, String str, String str2, String str3, String str4) {
        if (context != null) {
            this.dr = context.getApplicationContext();
        } else {
            this.dr = DownloadComponentManager.getAppContext();
        }
        this.ge = i;
        this.o = str;
        this.g = str2;
        this.q = str3;
        this.bn = str4;
    }

    public ge(AbsNotificationItem absNotificationItem) {
        this.dr = DownloadComponentManager.getAppContext();
        this.rb = absNotificationItem;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsNotificationListener
    public AbsNotificationItem createNotificationItem() {
        Context context;
        AbsNotificationItem absNotificationItem = this.rb;
        if (absNotificationItem == null && (context = this.dr) != null) {
            return new dr(context, this.ge, this.o, this.g, this.q, this.bn);
        }
        return absNotificationItem;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsNotificationListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPrepare(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.isAutoInstallWithoutNotification()) {
            return;
        }
        super.onPrepare(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsNotificationListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onStart(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.isAutoInstallWithoutNotification()) {
            return;
        }
        super.onStart(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsNotificationListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPause(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.isAutoInstallWithoutNotification()) {
            return;
        }
        super.onPause(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsNotificationListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onProgress(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.isAutoInstallWithoutNotification()) {
            return;
        }
        super.onProgress(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsNotificationListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo == null || this.dr == null) {
            return;
        }
        if (downloadInfo.canShowNotification() && (!downloadInfo.isAutoInstallWithoutNotification() || !downloadInfo.isAutoInstall())) {
            super.onSuccessed(downloadInfo);
        }
        if (downloadInfo.isAutoInstall()) {
            com.ss.android.socialbase.appdownloader.bn.ge.dr(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsNotificationListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        if (downloadInfo == null || this.dr == null || !downloadInfo.canShowNotification() || downloadInfo.isAutoInstallWithoutNotification()) {
            return;
        }
        super.onFailed(downloadInfo, baseException);
    }
}
