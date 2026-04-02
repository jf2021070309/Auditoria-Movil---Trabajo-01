package com.ss.android.socialbase.appdownloader.q;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.socialbase.appdownloader.DownloadHandlerService;
import com.ss.android.socialbase.appdownloader.ll;
import com.ss.android.socialbase.appdownloader.q;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.DownloadProcessDispatcher;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.AbsNotificationItem;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
/* loaded from: classes3.dex */
public class dr extends AbsNotificationItem {
    private final Context dr;
    private String g;
    private final Resources ge;
    private String o;
    private String q;

    public dr(Context context, int i, String str, String str2, String str3, String str4) {
        super(i, str);
        this.g = str2;
        this.o = str3;
        this.q = str4;
        Context applicationContext = context.getApplicationContext();
        this.dr = applicationContext;
        this.ge = applicationContext.getResources();
    }

    @Override // com.ss.android.socialbase.downloader.notification.AbsNotificationItem
    public void updateNotificationItem(DownloadInfo downloadInfo) {
        super.updateNotificationItem(downloadInfo);
        this.g = downloadInfo.getSavePath();
        this.o = downloadInfo.getName();
        this.q = downloadInfo.getExtra();
    }

    @Override // com.ss.android.socialbase.downloader.notification.AbsNotificationItem
    public void updateNotification(BaseException baseException, boolean z) {
        if (this.dr == null) {
            return;
        }
        try {
            this.notification = dr(baseException, z);
            notify(this.notification);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Notification dr(BaseException baseException, boolean z) {
        int i;
        int ge;
        int i2;
        String str;
        String str2;
        boolean z2;
        String string;
        int ge2;
        int ge3;
        int i3;
        int status = getStatus();
        int dr = com.ss.android.socialbase.appdownloader.o.dr(status);
        if (dr == 0) {
            return null;
        }
        NotificationCompat.Builder ge4 = ge();
        ge4.setWhen(getFirstShowTime());
        int id = getId();
        DownloadSetting obtain = DownloadSetting.obtain(id);
        if (Build.VERSION.SDK_INT >= 24 && obtain.optInt(DownloadSettingKeys.KEY_SET_NOTIFICATION_GROUP, 0) == 1) {
            ge4.setGroup("com.ss.android.socialbase.APP_DOWNLOADER");
            ge4.setGroupSummary(false);
        }
        int dr2 = dr(dr, id);
        if (dr2 != 0) {
            ge4.setSmallIcon(dr2);
        }
        String str3 = "android.ss.intent.action.DOWNLOAD_CLICK_CONTENT";
        if (dr == 1 || dr == 4 || dr == 2) {
            ge4.setContentIntent(dr("android.ss.intent.action.DOWNLOAD_CLICK_CONTENT", dr, id));
            ge4.setOngoing(dr == 1 || dr == 4);
            ge4.setAutoCancel(false);
        } else if (dr == 3) {
            ge4.setOngoing(false);
            ge4.setAutoCancel(true);
            if (status != -1 && status != -4) {
                if (status == -3 && obtain.optInt("notification_click_install_auto_cancel", 1) == 0) {
                    ge4.setAutoCancel(false);
                    if (getClickInstallTimes() > 0) {
                        ge4.setOngoing(false);
                        str3 = "android.ss.intent.action.DOWNLOAD_OPEN";
                    } else {
                        ge4.setOngoing(true);
                    }
                }
                str3 = "android.ss.intent.action.DOWNLOAD_OPEN";
            }
            ge4.setContentIntent(dr(str3, dr, id));
            ge4.setDeleteIntent(dr("android.ss.intent.action.DOWNLOAD_HIDE", dr, id));
        }
        long curBytes = getCurBytes();
        long totalBytes = getTotalBytes();
        if (totalBytes > 0) {
            i = (int) ((curBytes * 100) / totalBytes);
        } else {
            i = 0;
        }
        String title = getTitle();
        if (TextUtils.isEmpty(title)) {
            title = this.ge.getString(ll.ge("tt_appdownloader_download_unknown_title"));
        }
        RemoteViews dr3 = dr();
        int t = q.t();
        if (DownloadSetting.obtain(id).optInt("notification_opt_2") != 1) {
            dr3.setOnClickPendingIntent(t, dr("android.ss.intent.action.DOWNLOAD_CLICK_BTN", dr, id));
        }
        if (DownloadSetting.obtain(id).optInt(DownloadSettingKeys.OPT_NOTIFICATION_UI) >= 1) {
            dr3.setInt(t, "setBackgroundResource", q.i());
            dr3.setTextColor(t, -1);
        }
        dr3.setTextViewText(q.cu(), title);
        int dr4 = dr(id);
        dr3.setViewVisibility(dr4, 0);
        dr3.setProgressBar(dr4, 100, i, z);
        int yk = q.yk();
        if (dr2 != 0) {
            dr3.setImageViewResource(yk, dr2);
        }
        if (DownloadSetting.obtain(id).optInt(DownloadSettingKeys.OPT_NOTIFICATION_UI) >= 1) {
            Bitmap dr5 = o.dr().dr(id);
            if (dr5 != null) {
                dr3.setInt(yk, "setBackgroundColor", 0);
                dr3.setImageViewBitmap(yk, dr5);
            } else {
                dr3.setInt(yk, "setBackgroundResource", q.i());
            }
        }
        String str4 = "";
        if (dr == 1 || dr == 4) {
            str4 = com.ss.android.socialbase.appdownloader.o.dr(getCurBytes()) + "/" + com.ss.android.socialbase.appdownloader.o.dr(getTotalBytes());
            if (dr == 1) {
                if (getStatus() == 11) {
                    ge = ll.ge("tt_appdownloader_notification_waiting_download_complete_handler");
                } else {
                    ge = ll.ge("tt_appdownloader_notification_downloading");
                }
            } else {
                ge = ll.ge("tt_appdownloader_notification_prepare");
            }
            String string2 = this.dr.getResources().getString(ge);
            String string3 = this.dr.getResources().getString(ll.ge("tt_appdownloader_notification_download_pause"));
            dr3.setViewVisibility(dr(id), 0);
            dr3.setViewVisibility(q.ll(), 8);
            dr3.setViewVisibility(q.wb(), 0);
            int t2 = q.t();
            if (com.ss.android.socialbase.appdownloader.o.dr(this.q)) {
                i2 = 8;
                dr3.setViewVisibility(t2, 8);
            } else {
                i2 = 8;
                dr3.setViewVisibility(t2, 0);
            }
            if (obtain.optInt(DownloadSettingKeys.OPT_NOTIFICATION_UI) >= 2) {
                dr3.setViewVisibility(t2, i2);
            }
            str = string3;
            str2 = string2;
        } else if (dr == 2) {
            String str5 = com.ss.android.socialbase.appdownloader.o.dr(getCurBytes()) + "/" + com.ss.android.socialbase.appdownloader.o.dr(getTotalBytes());
            str2 = this.dr.getResources().getString(ll.ge("tt_appdownloader_notification_pausing"));
            String string4 = this.dr.getResources().getString(ll.ge("tt_appdownloader_notification_download_resume"));
            if (obtain.optInt("notification_opt_2") == 1) {
                if (i >= obtain.optInt("noti_progress_show_th", 70)) {
                    dr3.setViewVisibility(dr(id), 0);
                    dr3.setViewVisibility(q.wb(), 0);
                    dr3.setViewVisibility(q.ll(), 8);
                } else {
                    dr3.setViewVisibility(dr(id), 8);
                    dr3.setViewVisibility(q.wb(), 8);
                    dr3.setViewVisibility(q.ll(), 0);
                    dr3.setViewVisibility(q.il(), 8);
                    str2 = this.ge.getString(ll.ge("tt_appdownloader_notification_download_continue"));
                }
            } else {
                dr3.setViewVisibility(q.wb(), 0);
                int dr6 = dr(id);
                if (obtain.optInt(DownloadSettingKeys.OPT_NOTIFICATION_UI) >= 2) {
                    dr3.setViewVisibility(dr6, 0);
                } else {
                    dr3.setViewVisibility(dr6, 8);
                }
                dr3.setViewVisibility(q.ll(), 8);
            }
            int t3 = q.t();
            if (com.ss.android.socialbase.appdownloader.o.dr(this.q)) {
                dr3.setViewVisibility(t3, 8);
            } else {
                dr3.setViewVisibility(t3, 0);
                if (obtain.optInt(DownloadSettingKeys.OPT_NOTIFICATION_UI) >= 2) {
                    str5 = com.ss.android.socialbase.appdownloader.o.dr(getCurBytes(), false) + "/" + com.ss.android.socialbase.appdownloader.o.dr(getTotalBytes(), false);
                }
            }
            str = string4;
            str4 = str5;
        } else if (dr != 3) {
            str2 = "";
            str = str2;
        } else {
            DownloadInfo downloadInfo = Downloader.getInstance(DownloadComponentManager.getAppContext()).getDownloadInfo(id);
            if (getStatus() == -1 || getStatus() == -4) {
                if (obtain.optInt(DownloadSettingKeys.OPT_NOTIFICATION_UI) >= 2 && getStatus() == -1 && (DownloadUtils.isNetworkError(baseException) || DownloadUtils.isInsufficientSpaceError(baseException))) {
                    str4 = com.ss.android.socialbase.appdownloader.o.dr(getCurBytes()) + "/" + com.ss.android.socialbase.appdownloader.o.dr(getTotalBytes());
                }
                dr3.setViewVisibility(q.il(), 8);
                if (baseException == null || baseException.getErrorCode() != 1006) {
                    if (dr(baseException, obtain, downloadInfo)) {
                        if (downloadInfo != null && downloadInfo.isOnlyWifi()) {
                            ge2 = ll.ge("tt_appdownloader_notification_download_waiting_wifi");
                        } else {
                            ge2 = ll.ge("tt_appdownloader_notification_download_waiting_net");
                        }
                        string = this.dr.getResources().getString(ge2);
                    } else {
                        string = this.dr.getResources().getString(ll.ge("tt_appdownloader_notification_download_failed"));
                    }
                } else {
                    string = this.dr.getResources().getString(ll.ge("tt_appdownloader_notification_download_space_failed"));
                }
                str = this.dr.getResources().getString(ll.ge("tt_appdownloader_notification_download_restart"));
                dr3.setViewVisibility(q.t(), 8);
                if (obtain.optInt(DownloadSettingKeys.OPT_NOTIFICATION_UI) >= 2 && getStatus() == -1) {
                    if (DownloadUtils.isNetworkError(baseException)) {
                        if (DownloadUtils.isWaitWifiAndInNet(baseException, downloadInfo)) {
                            string = this.dr.getResources().getString(ll.ge("tt_appdownloader_notification_no_wifi_and_in_net"));
                            str = this.dr.getResources().getString(ll.ge("tt_appdownloader_notification_download_resume"));
                        } else {
                            string = this.dr.getResources().getString(ll.ge("tt_appdownloader_notification_no_internet_error"));
                        }
                    } else if (DownloadUtils.isInsufficientSpaceError(baseException)) {
                        string = this.dr.getResources().getString(ll.ge("tt_appdownloader_notification_insufficient_space_error"), com.ss.android.socialbase.appdownloader.o.ge(getTotalBytes() - getCurBytes()));
                    }
                }
            } else if (getStatus() != -3) {
                string = "";
                str = string;
            } else {
                String dr7 = com.ss.android.socialbase.appdownloader.o.dr(getTotalBytes());
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(AdBaseConstants.MIME_APK)) {
                    if (com.ss.android.socialbase.appdownloader.o.dr(this.dr, downloadInfo, !obtain.optBugFix("fix_ui_thread_parser_apk_file", true))) {
                        ge3 = ll.ge("tt_appdownloader_notification_install_finished_open");
                        i3 = ll.ge("tt_appdownloader_notification_download_open");
                    } else {
                        ge3 = ll.ge("tt_appdownloader_notification_download_complete_with_install");
                        i3 = ll.ge("tt_appdownloader_notification_download_install");
                    }
                } else {
                    ge3 = ll.ge("tt_appdownloader_notification_download_complete_without_install");
                    if (DownloadProcessDispatcher.getInstance().getNotificationClickCallback(id) == null) {
                        i3 = 0;
                    } else {
                        ge3 = ll.ge("tt_appdownloader_notification_download_complete_open");
                        i3 = 0;
                    }
                }
                String string5 = this.ge.getString(ge3);
                ge4.setContentText(string5);
                if (i3 != 0) {
                    str4 = this.ge.getString(i3);
                }
                if (obtain.optInt("notification_opt_2") == 1) {
                    dr3.setTextViewText(q.t(), str4);
                    dr3.setViewVisibility(q.il(), 8);
                } else {
                    dr3.setViewVisibility(q.t(), 8);
                }
                str = str4;
                str4 = dr7;
                string = string5;
            }
            dr3.setViewVisibility(dr(id), 8);
            dr3.setViewVisibility(q.ll(), 0);
            dr3.setViewVisibility(q.wb(), 8);
            if (obtain.optInt(DownloadSettingKeys.OPT_NOTIFICATION_UI) < 2) {
                str2 = string;
            } else if (getStatus() != -1) {
                str2 = string;
            } else if (DownloadUtils.isNetworkError(baseException) || DownloadUtils.isInsufficientSpaceError(baseException)) {
                dr3.setViewVisibility(dr(id), 0);
                dr3.setViewVisibility(q.ll(), 8);
                dr3.setViewVisibility(q.wb(), 0);
                int t4 = q.t();
                if (DownloadUtils.isWaitWifiAndInNet(baseException, downloadInfo)) {
                    dr3.setViewVisibility(t4, 0);
                    StringBuilder sb = new StringBuilder();
                    str2 = string;
                    sb.append(com.ss.android.socialbase.appdownloader.o.dr(getCurBytes(), false));
                    sb.append("/");
                    sb.append(com.ss.android.socialbase.appdownloader.o.dr(getTotalBytes(), false));
                    str4 = sb.toString();
                } else {
                    str2 = string;
                    dr3.setViewVisibility(t4, 8);
                }
            } else {
                str2 = string;
            }
        }
        dr3.setTextViewText(q.v(), str4);
        dr3.setTextViewText(q.x(), str2);
        dr3.setTextViewText(q.il(), str4);
        dr3.setTextViewText(q.lp(), str2);
        int t5 = q.t();
        if (TextUtils.isEmpty(str)) {
            dr3.setViewVisibility(t5, 8);
        } else {
            dr3.setTextViewText(t5, str);
        }
        if (obtain.optInt("notification_opt_2") != 1) {
            z2 = false;
        } else {
            ge4.setAutoCancel(true);
            if (obtain.optInt("notification_ongoing", 0) == 1) {
                ge4.setOngoing(true);
                z2 = true;
            } else {
                ge4.setOngoing(false);
                z2 = false;
            }
        }
        Notification build = ge4.build();
        if (!z2) {
            setOngoing(false);
        } else {
            build.flags |= 2;
            setOngoing(true);
        }
        build.contentView = dr3;
        return build;
    }

    private boolean dr(BaseException baseException, DownloadSetting downloadSetting, DownloadInfo downloadInfo) {
        return baseException != null && (baseException.getErrorCode() == 1013 || baseException.getErrorCode() == 1049) && downloadInfo != null && AdBaseConstants.MIME_APK.contains(downloadInfo.getMimeType()) && downloadSetting.optInt(DownloadSettingKeys.NOTIFICATION_TEXT_OPT, 0) == 1;
    }

    private RemoteViews dr() {
        RemoteViews remoteViews = new RemoteViews(this.dr.getPackageName(), q.dr());
        if (Build.VERSION.SDK_INT > 20) {
            try {
                if (com.ss.android.socialbase.appdownloader.o.dr(this.dr)) {
                    remoteViews.setInt(q.bn(), "setBackgroundColor", this.dr.getResources().getColor(q.de()));
                }
            } catch (Throwable th) {
            }
        }
        return remoteViews;
    }

    private int dr(int i, int i2) {
        if (DownloadSetting.obtain(i2).optInt("notification_opt_2") == 1) {
            return q.ii();
        }
        if (i == 1 || i == 4) {
            return q.z();
        }
        if (i == 2) {
            return q.tb();
        }
        if (i != 3) {
            return 0;
        }
        return q.ii();
    }

    private PendingIntent dr(String str, int i, int i2) {
        Intent intent = new Intent(this.dr, DownloadHandlerService.class);
        intent.setAction(str);
        intent.putExtra("extra_click_download_ids", i2);
        intent.putExtra("extra_click_download_type", i);
        intent.putExtra("extra_from_notification", true);
        return PendingIntent.getService(this.dr, i2, intent, 201326592);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0045 -> B:17:0x004c). Please submit an issue!!! */
    private NotificationCompat.Builder ge() {
        NotificationCompat.Builder builder;
        String ll = com.ss.android.socialbase.appdownloader.g.wb().ll();
        if (Build.VERSION.SDK_INT < 26) {
            return new NotificationCompat.Builder(this.dr);
        }
        if (TextUtils.isEmpty(ll)) {
            ll = com.ss.android.socialbase.appdownloader.o.ge(this.dr);
        }
        try {
            if (com.ss.android.socialbase.appdownloader.g.wb().t() != null) {
                builder = com.ss.android.socialbase.appdownloader.g.wb().t().dr(this.dr, ll);
            } else {
                builder = new NotificationCompat.Builder(this.dr, ll);
            }
        } catch (NoSuchMethodError e) {
            builder = new NotificationCompat.Builder(this.dr);
        }
        return builder;
    }

    private int dr(int i) {
        if (DownloadSetting.obtain(i).optInt(DownloadSettingKeys.OPT_NOTIFICATION_UI) >= 1) {
            return q.xu();
        }
        return q.rb();
    }
}
