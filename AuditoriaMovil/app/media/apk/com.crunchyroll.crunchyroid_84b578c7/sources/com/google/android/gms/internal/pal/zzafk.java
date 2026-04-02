package com.google.android.gms.internal.pal;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzafk extends zzafi {
    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* synthetic */ int zza(Object obj) {
        return ((zzafj) obj).zza();
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzafj) obj).zzb();
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzacz zzaczVar = (zzacz) obj;
        zzafj zzafjVar = zzaczVar.zzc;
        if (zzafjVar == zzafj.zzc()) {
            zzafj zze = zzafj.zze();
            zzaczVar.zzc = zze;
            return zze;
        }
        return zzafjVar;
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzacz) obj).zzc;
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        zzafj zzafjVar = (zzafj) obj2;
        if (zzafjVar.equals(zzafj.zzc())) {
            return obj;
        }
        return zzafj.zzd((zzafj) obj, zzafjVar);
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* synthetic */ Object zzf() {
        return zzafj.zze();
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* synthetic */ Object zzg(Object obj) {
        ((zzafj) obj).zzf();
        return obj;
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zzafj) obj).zzh((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zzafj) obj).zzh((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzafj) obj).zzh((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzaby zzabyVar) {
        ((zzafj) obj).zzh((i << 3) | 2, zzabyVar);
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zzafj) obj).zzh(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final void zzm(Object obj) {
        ((zzacz) obj).zzc.zzf();
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzacz) obj).zzc = (zzafj) obj2;
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzacz) obj).zzc = (zzafj) obj2;
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final /* synthetic */ void zzp(Object obj, zzaga zzagaVar) throws IOException {
        ((zzafj) obj).zzi(zzagaVar);
    }

    @Override // com.google.android.gms.internal.pal.zzafi
    public final boolean zzr(zzaeq zzaeqVar) {
        return false;
    }
}
