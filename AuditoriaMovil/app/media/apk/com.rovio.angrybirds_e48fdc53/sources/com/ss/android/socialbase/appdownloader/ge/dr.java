package com.ss.android.socialbase.appdownloader.ge;

import android.os.Build;
import android.text.TextUtils;
/* loaded from: classes3.dex */
public class dr {
    public static final String dr;

    static {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(Build.VERSION.RELEASE);
        boolean z3 = !TextUtils.isEmpty(Build.ID);
        z = (!"REL".equals(Build.VERSION.CODENAME) || TextUtils.isEmpty(Build.MODEL)) ? false : false;
        sb.append("AppDownloader");
        if (z2) {
            sb.append("/");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append(" (Linux; U; Android");
        if (z2) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        if (z || z3) {
            sb.append(";");
            if (z) {
                sb.append(" ");
                sb.append(Build.MODEL);
            }
            if (z3) {
                sb.append(" Build/");
                sb.append(Build.ID);
            }
        }
        sb.append(")");
        dr = sb.toString();
    }
}
