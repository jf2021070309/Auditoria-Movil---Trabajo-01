package com.moat.analytics.mobile.vng;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class m extends Exception {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Exception exc) {
        if (w.a().b) {
            Log.e("MoatException", Log.getStackTraceString(exc));
        }
    }
}
