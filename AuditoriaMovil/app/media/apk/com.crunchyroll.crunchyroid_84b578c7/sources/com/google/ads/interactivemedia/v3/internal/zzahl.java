package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzahl extends zzahj {
    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* synthetic */ int zza(Object obj) {
        return ((zzahk) obj).zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzahk) obj).zzb();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzaet zzaetVar = (zzaet) obj;
        zzahk zzahkVar = zzaetVar.zzc;
        if (zzahkVar == zzahk.zzc()) {
            zzahk zzf = zzahk.zzf();
            zzaetVar.zzc = zzf;
            return zzf;
        }
        return zzahkVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzaet) obj).zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (!zzahk.zzc().equals(obj2)) {
            if (zzahk.zzc().equals(obj)) {
                return zzahk.zze((zzahk) obj, (zzahk) obj2);
            }
            ((zzahk) obj).zzd((zzahk) obj2);
            return obj;
        }
        return obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* synthetic */ Object zzf() {
        return zzahk.zzf();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* synthetic */ Object zzg(Object obj) {
        ((zzahk) obj).zzh();
        return obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zzahk) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zzahk) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzahk) obj).zzj((i << 3) | 3, obj2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzadr zzadrVar) {
        ((zzahk) obj).zzj((i << 3) | 2, zzadrVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zzahk) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final void zzm(Object obj) {
        ((zzaet) obj).zzc.zzh();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzaet) obj).zzc = (zzahk) obj2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzaet) obj).zzc = (zzahk) obj2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final /* synthetic */ void zzp(Object obj, zzaib zzaibVar) throws IOException {
        ((zzahk) obj).zzk(zzaibVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahj
    public final boolean zzr(zzagk zzagkVar) {
        return false;
    }
}
