package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes.dex */
public final class zzks implements zzai {
    private final Context zza;
    private final zzai zzb;

    public zzks(Context context) {
        zzao zzaoVar = new zzao();
        this.zza = context.getApplicationContext();
        this.zzb = zzaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzai
    public final /* bridge */ /* synthetic */ zzaj zza() {
        return new zzkt(this.zza, ((zzao) this.zzb).zza());
    }
}
