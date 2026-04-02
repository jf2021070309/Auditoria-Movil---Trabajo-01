package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzzn extends zzxi {
    private final zzxi zza;
    private final zzyz zzb;

    public zzzn(zzwm zzwmVar, Type type, zzxi zzxiVar, zzyz zzyzVar) {
        this.zza = new zzaam(zzwmVar, zzxiVar, type);
        this.zzb = zzyzVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        Collection collection = (Collection) this.zzb.zza();
        zzacvVar.zzj();
        while (zzacvVar.zzq()) {
            collection.add(this.zza.read(zzacvVar));
        }
        zzacvVar.zzl();
        return collection;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        Collection<Object> collection = (Collection) obj;
        if (collection == null) {
            zzacxVar.zzf();
            return;
        }
        zzacxVar.zza();
        for (Object obj2 : collection) {
            this.zza.write(zzacxVar, obj2);
        }
        zzacxVar.zzc();
    }
}
