package com.amazon.aps.iva.t5;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
/* compiled from: NetworkTypeObserver.java */
/* loaded from: classes.dex */
public final class s extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final t a;

    public s(t tVar) {
        this.a = tVar;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z = false;
        } else {
            z = true;
        }
        t tVar = this.a;
        if (z) {
            i = 10;
        }
        t.a(tVar, i);
    }
}
