package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzgiq extends zzgio<zzgip, zzgip> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgio
    public final boolean zza(zzght zzghtVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ void zzb(zzgip zzgipVar, int i, long j) {
        zzgipVar.zzh(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    final /* bridge */ /* synthetic */ void zzc(zzgip zzgipVar, int i, int i2) {
        zzgipVar.zzh((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    final /* bridge */ /* synthetic */ void zzd(zzgip zzgipVar, int i, long j) {
        zzgipVar.zzh((i << 3) | 1, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ void zze(zzgip zzgipVar, int i, zzgex zzgexVar) {
        zzgipVar.zzh((i << 3) | 2, zzgexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    final /* bridge */ /* synthetic */ void zzf(zzgip zzgipVar, int i, zzgip zzgipVar2) {
        zzgipVar.zzh((i << 3) | 3, zzgipVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ zzgip zzg() {
        return zzgip.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    final /* bridge */ /* synthetic */ zzgip zzh(zzgip zzgipVar) {
        zzgip zzgipVar2 = zzgipVar;
        zzgipVar2.zzd();
        return zzgipVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ void zzi(Object obj, zzgip zzgipVar) {
        ((zzgga) obj).zzc = zzgipVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ zzgip zzj(Object obj) {
        return ((zzgga) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ void zzl(Object obj, zzgip zzgipVar) {
        ((zzgga) obj).zzc = zzgipVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgio
    public final void zzm(Object obj) {
        ((zzgga) obj).zzc.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ zzgip zzo(zzgip zzgipVar, zzgip zzgipVar2) {
        zzgip zzgipVar3 = zzgipVar2;
        return zzgipVar3.equals(zzgip.zza()) ? zzgipVar : zzgip.zzc(zzgipVar, zzgipVar3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ int zzp(zzgip zzgipVar) {
        return zzgipVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ int zzq(zzgip zzgipVar) {
        return zzgipVar.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* bridge */ /* synthetic */ void zzr(zzgip zzgipVar, zzgfi zzgfiVar) throws IOException {
        zzgipVar.zzi(zzgfiVar);
    }
}
