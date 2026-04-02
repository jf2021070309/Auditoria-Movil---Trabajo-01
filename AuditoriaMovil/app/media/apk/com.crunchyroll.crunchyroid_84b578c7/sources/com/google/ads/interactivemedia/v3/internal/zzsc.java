package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzsc extends zzsg {
    public zzsc(zzsh zzshVar) {
        super(zzshVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int zzd = this.zzb.zzd(key, zzsi.zzc(key));
            if (zzd != -1 && zzri.zza(this.zzb.zza[zzd], value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int zzc = zzsi.zzc(key);
            int zzd = this.zzb.zzd(key, zzc);
            if (zzd != -1 && zzri.zza(this.zzb.zza[zzd], value)) {
                this.zzb.zzm(zzd, zzc);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsg
    public final /* bridge */ /* synthetic */ Object zza(int i) {
        return new zzrz(this.zzb, i);
    }
}
