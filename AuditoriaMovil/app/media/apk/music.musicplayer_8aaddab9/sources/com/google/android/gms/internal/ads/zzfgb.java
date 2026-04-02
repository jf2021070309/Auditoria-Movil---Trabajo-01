package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes.dex */
public final class zzfgb {
    private boolean zza;

    public final boolean zza() {
        return this.zza;
    }

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
