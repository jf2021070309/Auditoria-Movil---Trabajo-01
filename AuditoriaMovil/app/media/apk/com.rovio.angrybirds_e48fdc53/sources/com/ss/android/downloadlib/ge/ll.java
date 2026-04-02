package com.ss.android.downloadlib.ge;

import android.os.Build;
/* loaded from: classes3.dex */
public class ll {
    public static boolean dr(com.ss.android.downloadad.api.dr.dr drVar) {
        return com.ss.android.socialbase.appdownloader.bn.q.g() && Build.VERSION.SDK_INT < 29 && com.ss.android.downloadlib.addownload.wb.t() != null && com.ss.android.downloadlib.addownload.wb.t().dr() && com.ss.android.downloadlib.rb.q.dr(drVar).optInt("invoke_app_form_background_switch") == 1 && drVar.lp();
    }
}
