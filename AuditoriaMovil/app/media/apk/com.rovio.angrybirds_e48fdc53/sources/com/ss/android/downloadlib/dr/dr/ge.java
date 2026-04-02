package com.ss.android.downloadlib.dr.dr;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.socialbase.downloader.BuildConfig;
/* loaded from: classes3.dex */
public class ge {
    public static String dr(Context context) {
        try {
            return dr(o.dr(dr(), "MD5"));
        } catch (Exception e) {
            return null;
        }
    }

    public static String dr() {
        return ge(wb.getContext());
    }

    public static String ge(Context context) {
        String str;
        try {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e) {
            e.printStackTrace();
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        return str;
    }

    public static String dr(byte[] bArr) {
        return dr.dr(bArr);
    }
}
