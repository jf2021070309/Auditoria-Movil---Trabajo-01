package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzzu extends zzxi {
    final /* synthetic */ zzzv zza;
    private final zzxi zzb;
    private final zzxi zzc;
    private final zzyz zzd;

    public zzzu(zzzv zzzvVar, zzwm zzwmVar, Type type, zzxi zzxiVar, Type type2, zzxi zzxiVar2, zzyz zzyzVar) {
        this.zza = zzzvVar;
        this.zzb = new zzaam(zzwmVar, zzxiVar, type);
        this.zzc = new zzaam(zzwmVar, zzxiVar2, type2);
        this.zzd = zzyzVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        int zzt = zzacvVar.zzt();
        if (zzt == 9) {
            zzacvVar.zzn();
            return null;
        }
        Map map = (Map) this.zzd.zza();
        if (zzt == 1) {
            zzacvVar.zzj();
            while (zzacvVar.zzq()) {
                zzacvVar.zzj();
                Object read = this.zzb.read(zzacvVar);
                if (map.put(read, this.zzc.read(zzacvVar)) == null) {
                    zzacvVar.zzl();
                } else {
                    throw new zzwz("duplicate key: ".concat(String.valueOf(read)));
                }
            }
            zzacvVar.zzl();
        } else {
            zzacvVar.zzk();
            while (zzacvVar.zzq()) {
                zzyp.zza.zza(zzacvVar);
                Object read2 = this.zzb.read(zzacvVar);
                if (map.put(read2, this.zzc.read(zzacvVar)) != null) {
                    throw new zzwz("duplicate key: ".concat(String.valueOf(read2)));
                }
            }
            zzacvVar.zzm();
        }
        return map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            zzacxVar.zzf();
            return;
        }
        zzacxVar.zzb();
        for (Map.Entry entry : map.entrySet()) {
            zzacxVar.zze(String.valueOf(entry.getKey()));
            this.zzc.write(zzacxVar, entry.getValue());
        }
        zzacxVar.zzd();
    }
}
