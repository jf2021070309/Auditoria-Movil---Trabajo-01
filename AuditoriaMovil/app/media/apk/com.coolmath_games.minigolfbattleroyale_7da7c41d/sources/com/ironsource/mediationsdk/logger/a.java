package com.ironsource.mediationsdk.logger;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
/* loaded from: classes2.dex */
public final class a extends IronSourceLogger {
    private a() {
        super("console");
    }

    public a(int i) {
        super("console", 0);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        if (i == 0) {
            Log.v("ironSourceSDK: " + ironSourceTag, str);
        } else if (i == 1) {
            Log.i("ironSourceSDK: " + ironSourceTag, str);
        } else if (i == 2) {
            Log.w("ironSourceSDK: " + ironSourceTag, str);
        } else if (i != 3) {
        } else {
            Log.e("ironSourceSDK: " + ironSourceTag, str);
        }
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        log(ironSourceTag, str + ":stacktrace[" + Log.getStackTraceString(th) + "]", 3);
    }
}
