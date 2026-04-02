package com.ss.android.socialbase.appdownloader;

import android.content.Context;
import com.facebook.internal.AnalyticsEvents;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
/* loaded from: classes3.dex */
public class ll {
    public static int dr(String str) {
        try {
            return DownloadComponentManager.getAppContext().getResources().getIdentifier(str, "layout", DownloadComponentManager.getAppContext().getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int dr(Context context, String str) {
        try {
            return context.getResources().getIdentifier(str, "string", context.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int ge(String str) {
        return dr(DownloadComponentManager.getAppContext(), str);
    }

    public static int o(String str) {
        try {
            return dr(str, DownloadComponentManager.getAppContext().getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int dr(String str, String str2) {
        try {
            return DownloadComponentManager.getAppContext().getResources().getIdentifier(str, "drawable", str2);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int g(String str) {
        try {
            return DownloadComponentManager.getAppContext().getResources().getIdentifier(str, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, DownloadComponentManager.getAppContext().getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int q(String str) {
        try {
            return DownloadComponentManager.getAppContext().getResources().getIdentifier(str, "id", DownloadComponentManager.getAppContext().getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int bn(String str) {
        try {
            return DownloadComponentManager.getAppContext().getResources().getIdentifier(str, "color", DownloadComponentManager.getAppContext().getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int ge(String str, String str2) {
        try {
            return DownloadComponentManager.getAppContext().getResources().getIdentifier(str, "attr", str2);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
