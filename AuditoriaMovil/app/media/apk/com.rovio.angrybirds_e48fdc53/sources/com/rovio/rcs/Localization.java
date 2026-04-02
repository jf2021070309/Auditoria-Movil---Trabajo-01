package com.rovio.rcs;

import android.os.Build;
import android.util.Log;
import com.rovio.fusion.Globals;
import com.ss.android.socialbase.downloader.segment.Segment;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes4.dex */
public class Localization {
    public static String deviceLocale() {
        int i = Build.VERSION.SDK_INT;
        try {
            Locale locale = i < 24 ? Locale.getDefault() : Globals.getActivity().getResources().getConfiguration().getLocales().get(0);
            return i < 21 ? locale.toString() : locale.toLanguageTag();
        } catch (Throwable th) {
            Log.d("LOCALIZATION", "Unable to get locale");
            return "en-US";
        }
    }

    public static String systemLocale() {
        int i = Build.VERSION.SDK_INT;
        String str = Segment.JsonKey.END;
        try {
            str = i > 23 ? getLanguageForAndroidApiLevel24AndAbove() : getLanguageForAndroidApiLevel23AndBelow();
        } catch (Throwable th) {
            Log.d("LOCALIZATION", "Unable to get the locale");
        }
        return str;
    }

    public static String getLocalDateAndTime(long j) {
        return DateFormat.getDateTimeInstance(2, 3).format(new Date(1000 * j));
    }

    private static String getLanguageForAndroidApiLevel24AndAbove() {
        return Globals.getActivity().getResources().getConfiguration().getLocales().get(0).toString();
    }

    private static String getLanguageForAndroidApiLevel23AndBelow() {
        if (Locale.getDefault().equals(Locale.SIMPLIFIED_CHINESE)) {
            return "zh-cn";
        }
        if (Locale.getDefault().equals(Locale.TRADITIONAL_CHINESE)) {
            return "zh-tw";
        }
        return Locale.getDefault().getLanguage();
    }
}
