package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
class zzkd implements zzkb {
    private final zzpa zza;
    private final Class zzb;

    public zzkd(zzpa zzpaVar, Class cls) {
        if (!zzpaVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzpaVar.toString(), cls.getName()));
        }
        this.zza = zzpaVar;
        this.zzb = cls;
    }

    private final zzkc zzg() {
        return new zzkc(this.zza.zza());
    }

    private final Object zzh(zzaef zzaefVar) throws GeneralSecurityException {
        if (!Void.class.equals(this.zzb)) {
            this.zza.zze(zzaefVar);
            return this.zza.zzk(zzaefVar, this.zzb);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    @Override // com.google.android.gms.internal.pal.zzkb
    public final zzvo zza(zzaby zzabyVar) throws GeneralSecurityException {
        try {
            zzaef zza = zzg().zza(zzabyVar);
            zzvl zza2 = zzvo.zza();
            zza2.zzb(this.zza.zzd());
            zza2.zzc(zza.zzaI());
            zza2.zza(this.zza.zzb());
            return (zzvo) zza2.zzan();
        } catch (zzadi e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzkb
    public final zzaef zzb(zzaby zzabyVar) throws GeneralSecurityException {
        try {
            return zzg().zza(zzabyVar);
        } catch (zzadi e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zza().zzg().getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzkb
    public final Class zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzkb
    public final Object zzd(zzaby zzabyVar) throws GeneralSecurityException {
        try {
            return zzh(this.zza.zzc(zzabyVar));
        } catch (zzadi e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzj().getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzkb
    public final Object zze(zzaef zzaefVar) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(this.zza.zzj().getName());
        if (this.zza.zzj().isInstance(zzaefVar)) {
            return zzh(zzaefVar);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.google.android.gms.internal.pal.zzkb
    public final String zzf() {
        return this.zza.zzd();
    }
}
