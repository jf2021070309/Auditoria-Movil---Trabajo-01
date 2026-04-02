package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzawz implements ValueCallback<String> {
    final /* synthetic */ zzaxa zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawz(zzaxa zzaxaVar) {
        this.zza = zzaxaVar;
    }

    @Override // android.webkit.ValueCallback
    /* renamed from: zza */
    public final void onReceiveValue(String str) {
        zzaxa zzaxaVar = this.zza;
        zzaxaVar.zze.zzd(zzaxaVar.zzb, zzaxaVar.zzc, str, zzaxaVar.zzd);
    }
}
