package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzfrz;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
final class zzu implements zzfrz<zzah> {
    final /* synthetic */ zzv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(zzv zzvVar) {
        this.zza = zzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzv.zzy(this.zza, "sgf", "sgf_reason", th.getMessage());
        com.google.android.gms.ads.internal.util.zze.zzg("Failed to initialize webview for loading SDKCore. ", th);
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(zzah zzahVar) {
        com.google.android.gms.ads.internal.util.zze.zzd("Initialized webview successfully for SDKCore.");
    }
}
