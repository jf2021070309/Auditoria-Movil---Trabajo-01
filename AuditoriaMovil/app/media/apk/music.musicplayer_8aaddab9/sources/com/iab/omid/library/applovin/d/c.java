package com.iab.omid.library.applovin.d;

import android.text.TextUtils;
import android.util.Log;
/* loaded from: classes2.dex */
public final class c {
    public static void a(String str) {
        if (com.iab.omid.library.applovin.a.a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
    }

    public static void a(String str, Exception exc) {
        if ((!com.iab.omid.library.applovin.a.a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
