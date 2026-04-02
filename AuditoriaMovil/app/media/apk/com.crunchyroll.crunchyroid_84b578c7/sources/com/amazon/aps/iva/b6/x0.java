package com.amazon.aps.iva.b6;

import android.media.metrics.TrackChangeEvent;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 {
    public static /* synthetic */ TrackChangeEvent.Builder a(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    public static /* bridge */ /* synthetic */ void e(TelephonyManager telephonyManager, Executor executor, com.amazon.aps.iva.t5.s sVar) {
        telephonyManager.registerTelephonyCallback(executor, sVar);
    }
}
