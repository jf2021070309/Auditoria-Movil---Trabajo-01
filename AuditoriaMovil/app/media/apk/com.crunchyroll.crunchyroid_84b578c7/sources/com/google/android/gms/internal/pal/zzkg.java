package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzkg implements zzkh {
    final /* synthetic */ zzpr zza;
    final /* synthetic */ zzpa zzb;

    public zzkg(zzpr zzprVar, zzpa zzpaVar) {
        this.zza = zzprVar;
        this.zzb = zzpaVar;
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final zzkb zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzld(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final zzkb zzb() {
        zzpr zzprVar = this.zza;
        return new zzld(zzprVar, this.zzb, zzprVar.zzi());
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final Class zzd() {
        return this.zzb.getClass();
    }

    @Override // com.google.android.gms.internal.pal.zzkh
    public final Set zze() {
        return this.zza.zzl();
    }
}
