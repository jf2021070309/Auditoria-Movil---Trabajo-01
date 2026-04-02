package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzse extends zzsg {
    final /* synthetic */ zzsh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzse(zzsh zzshVar) {
        super(zzshVar);
        this.zza = zzshVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzc = zzsi.zzc(obj);
        int zzd = this.zza.zzd(obj, zzc);
        if (zzd != -1) {
            this.zza.zzm(zzd, zzc);
            return true;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsg
    public final Object zza(int i) {
        return this.zza.zzb[i];
    }
}
