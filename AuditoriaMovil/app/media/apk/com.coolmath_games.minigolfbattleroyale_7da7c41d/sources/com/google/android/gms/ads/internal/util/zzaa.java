package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.telephony.TelephonyManager;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public class zzaa extends zzz {
    @Override // com.google.android.gms.ads.internal.util.zzad
    public final int zzq(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzt.zzc();
        return (zzs.zzE(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) ? 2 : 1;
    }
}
