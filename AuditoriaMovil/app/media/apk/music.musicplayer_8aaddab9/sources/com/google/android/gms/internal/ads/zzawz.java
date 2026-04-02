package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
/* loaded from: classes.dex */
public final class zzawz implements ValueCallback<String> {
    public final /* synthetic */ zzaxa zza;

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
