package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes.dex */
public final class zzgiq extends zzgio<zzgip, zzgip> {
    @Override // com.google.android.gms.internal.ads.zzgio
    public final boolean zza(zzght zzghtVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ void zzb(zzgip zzgipVar, int i2, long j2) {
        zzgipVar.zzh(i2 << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ void zzc(zzgip zzgipVar, int i2, int i3) {
        zzgipVar.zzh((i2 << 3) | 5, Integer.valueOf(i3));
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ void zzd(zzgip zzgipVar, int i2, long j2) {
        zzgipVar.zzh((i2 << 3) | 1, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ void zze(zzgip zzgipVar, int i2, zzgex zzgexVar) {
        zzgipVar.zzh((i2 << 3) | 2, zzgexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ void zzf(zzgip zzgipVar, int i2, zzgip zzgipVar2) {
        zzgipVar.zzh((i2 << 3) | 3, zzgipVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ zzgip zzg() {
        return zzgip.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ zzgip zzh(zzgip zzgipVar) {
        zzgip zzgipVar2 = zzgipVar;
        zzgipVar2.zzd();
        return zzgipVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ void zzi(Object obj, zzgip zzgipVar) {
        ((zzgga) obj).zzc = zzgipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ zzgip zzj(Object obj) {
        return ((zzgga) obj).zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ zzgip zzk(Object obj) {
        zzgga zzggaVar = (zzgga) obj;
        zzgip zzgipVar = zzggaVar.zzc;
        if (zzgipVar == zzgip.zza()) {
            zzgip zzb = zzgip.zzb();
            zzggaVar.zzc = zzb;
            return zzb;
        }
        return zzgipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ void zzl(Object obj, zzgip zzgipVar) {
        ((zzgga) obj).zzc = zzgipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final void zzm(Object obj) {
        ((zzgga) obj).zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ zzgip zzo(zzgip zzgipVar, zzgip zzgipVar2) {
        zzgip zzgipVar3 = zzgipVar2;
        return zzgipVar3.equals(zzgip.zza()) ? zzgipVar : zzgip.zzc(zzgipVar, zzgipVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ int zzp(zzgip zzgipVar) {
        return zzgipVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ int zzq(zzgip zzgipVar) {
        return zzgipVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ void zzr(zzgip zzgipVar, zzgfi zzgfiVar) throws IOException {
        zzgipVar.zzi(zzgfiVar);
    }
}
