package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfro extends zzfrp {
    final /* synthetic */ zzfrq zza;
    private final Callable zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfro(zzfrq zzfrqVar, Callable callable, Executor executor) {
        super(zzfrqVar, executor);
        this.zza = zzfrqVar;
        if (callable == null) {
            throw null;
        }
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzfrp
    final void zzb(Object obj) {
        this.zza.zzp(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    final String zzc() {
        return this.zzc.toString();
    }
}
