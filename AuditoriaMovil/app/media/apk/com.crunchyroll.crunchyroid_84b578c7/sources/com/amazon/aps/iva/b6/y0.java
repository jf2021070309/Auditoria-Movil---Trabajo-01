package com.amazon.aps.iva.b6;

import android.content.pm.ApkChecksum;
import android.telephony.TelephonyManager;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 {
    public static /* bridge */ /* synthetic */ ApkChecksum a(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ void d(TelephonyManager telephonyManager, com.amazon.aps.iva.t5.s sVar) {
        telephonyManager.unregisterTelephonyCallback(sVar);
    }
}
