package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdsx implements zzdbx {
    private final zzcml zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdsx(zzcml zzcmlVar) {
        this.zza = zzcmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zza(Context context) {
        zzcml zzcmlVar = this.zza;
        if (zzcmlVar != null) {
            zzcmlVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zzb(Context context) {
        zzcml zzcmlVar = this.zza;
        if (zzcmlVar != null) {
            zzcmlVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zzbo(Context context) {
        zzcml zzcmlVar = this.zza;
        if (zzcmlVar != null) {
            zzcmlVar.destroy();
        }
    }
}
