package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzvy extends zzvp {
    final /* synthetic */ zzvz zza;
    private final Callable zzb;

    public zzvy(zzvz zzvzVar, Callable callable) {
        this.zza = zzvzVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvp
    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvp
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvp
    public final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvp
    public final void zze(Object obj) {
        this.zza.zzc(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvp
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
