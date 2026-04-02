package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzsd extends zzsg {
    final /* synthetic */ zzsh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzsd(zzsh zzshVar) {
        super(zzshVar);
        this.zza = zzshVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzc = zzsi.zzc(obj);
        int zzc2 = this.zza.zzc(obj, zzc);
        if (zzc2 != -1) {
            this.zza.zzl(zzc2, zzc);
            return true;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsg
    public final Object zza(int i) {
        return this.zza.zza[i];
    }
}
