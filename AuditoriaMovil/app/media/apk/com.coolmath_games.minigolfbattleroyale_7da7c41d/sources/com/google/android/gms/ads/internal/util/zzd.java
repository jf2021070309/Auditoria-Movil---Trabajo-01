package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzfsm;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        if (zzcgs.zzk(context) && !zzcgs.zzi()) {
            zzfsm<?> zzc = new zzc(context).zzc();
            zze.zzh("Updating ad debug logging enablement.");
            zzchj.zza(zzc, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
