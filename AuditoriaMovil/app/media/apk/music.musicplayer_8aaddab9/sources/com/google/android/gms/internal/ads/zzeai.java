package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class zzeai implements zzddx {
    private final Context zza;
    private final zzcfa zzb;

    public zzeai(Context context, zzcfa zzcfaVar) {
        this.zza = context;
        this.zzb = zzcfaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzbG(zzcbj zzcbjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzq(zzfal zzfalVar) {
        if (TextUtils.isEmpty(zzfalVar.zzb.zzb.zzd)) {
            return;
        }
        this.zzb.zzd(this.zza, zzfalVar.zza.zza.zzd);
        this.zzb.zzp(this.zza, zzfalVar.zzb.zzb.zzd);
    }
}
