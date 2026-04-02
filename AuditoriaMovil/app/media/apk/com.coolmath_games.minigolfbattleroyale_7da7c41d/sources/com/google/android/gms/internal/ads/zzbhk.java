package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbhk extends zzbes {
    final /* synthetic */ zzbhl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbhk(zzbhl zzbhlVar) {
        this.zza = zzbhlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbes, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        VideoController videoController;
        videoController = this.zza.zze;
        videoController.zza(this.zza.zzx());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.internal.ads.zzbes, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        VideoController videoController;
        videoController = this.zza.zze;
        videoController.zza(this.zza.zzx());
        super.onAdLoaded();
    }
}
