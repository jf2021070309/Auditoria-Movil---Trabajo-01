package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zze;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzavh extends zzavo {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzavh(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzavp
    public final void zzc(zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavp
    public final void zzd(zzavm zzavmVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzavi(zzavmVar, this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavp
    public final void zzb(int i) {
    }
}
