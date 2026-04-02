package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcsw implements zzdbx {
    private final zzfbi zza;

    public zzcsw(zzfbi zzfbiVar) {
        this.zza = zzfbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zza(Context context) {
        try {
            this.zza.zzi();
        } catch (zzfaw e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zzb(Context context) {
        try {
            this.zza.zzj();
            if (context != null) {
                this.zza.zzp(context);
            }
        } catch (zzfaw e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zzbo(Context context) {
        try {
            this.zza.zzf();
        } catch (zzfaw e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
