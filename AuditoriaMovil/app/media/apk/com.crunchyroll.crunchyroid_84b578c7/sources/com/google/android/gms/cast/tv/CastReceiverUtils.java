package com.google.android.gms.cast.tv;

import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public class CastReceiverUtils {
    private CastReceiverUtils() {
    }

    public static CastLaunchRequest parseCastLaunchRequestFromLaunchIntent(Intent intent) {
        return com.google.android.gms.cast.tv.internal.zzc.zze().zzb(intent);
    }
}
