package com.vungle.publisher;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.vungle.publisher.log.Logger;
/* loaded from: classes4.dex */
public class yy {
    public static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod(MonitorConstants.CONNECT_TYPE_GET, String.class).invoke(null, str);
        } catch (Exception e) {
            Logger.w(Logger.CONFIG_TAG, "error getting Android system property " + str, e);
            return null;
        }
    }
}
