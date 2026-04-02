package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfui implements zzful {
    final /* synthetic */ zzftu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfui(zzftu zzftuVar) {
        this.zza = zzftuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final <Q> zzftm<Q> zza(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzfto(this.zza, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final zzftm<?> zzb() {
        zzftu zzftuVar = this.zza;
        return new zzfto(zzftuVar, zzftuVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final Class<?> zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final Set<Class<?>> zzd() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final Class<?> zze() {
        return null;
    }
}
