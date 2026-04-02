package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfgb {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(Context context) {
        zzfhk.zza(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfgy.zza().zzb(context);
        zzfgt.zza().zzb(context);
        zzfhi.zza(context);
        zzfgv.zza().zzc(context);
    }
}
