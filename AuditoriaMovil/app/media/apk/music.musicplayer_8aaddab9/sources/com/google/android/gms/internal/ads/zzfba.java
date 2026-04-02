package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes.dex */
public final class zzfba {
    public static zzbpr<zzcml> zza(final zzedq zzedqVar, final zzffu zzffuVar, final zzdio zzdioVar) {
        return new zzbpr(zzdioVar, zzffuVar, zzedqVar) { // from class: com.google.android.gms.internal.ads.zzfax
            private final zzdio zza;
            private final zzffu zzb;
            private final zzedq zzc;

            {
                this.zza = zzdioVar;
                this.zzb = zzffuVar;
                this.zzc = zzedqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                zzdio zzdioVar2 = this.zza;
                zzffu zzffuVar2 = this.zzb;
                zzedq zzedqVar2 = this.zzc;
                zzcml zzcmlVar = (zzcml) obj;
                zzbpq.zzc(map, zzdioVar2);
                String str = (String) map.get("u");
                if (str == null) {
                    zzcgt.zzi("URL missing from click GMSG.");
                } else {
                    zzfsd.zzp(zzbpq.zza(zzcmlVar, str), new zzfaz(zzcmlVar, zzffuVar2, zzedqVar2), zzchg.zza);
                }
            }
        };
    }

    public static <T extends zzcmc & zzcni & zzcnn & zzcnv> zzbpr<T> zzb(final zzedq zzedqVar, final zzffu zzffuVar) {
        return new zzbpr(zzffuVar, zzedqVar) { // from class: com.google.android.gms.internal.ads.zzfay
            private final zzffu zza;
            private final zzedq zzb;

            {
                this.zza = zzffuVar;
                this.zzb = zzedqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbpr
            public final void zza(Object obj, Map map) {
                zzffu zzffuVar2 = this.zza;
                zzedq zzedqVar2 = this.zzb;
                zzcmc zzcmcVar = (zzcmc) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    zzcgt.zzi("URL missing from httpTrack GMSG.");
                } else if (zzcmcVar.zzF().zzaf) {
                    zzedqVar2.zze(new zzeds(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis(), ((zzcni) zzcmcVar).zzaB().zzb, str, 2));
                } else {
                    zzffuVar2.zzb(str);
                }
            }
        };
    }
}
