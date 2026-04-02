package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfoh<E> extends zzfml<E> {
    private final zzfoj<E> zza;

    public zzfoh(zzfoj<E> zzfojVar, int i2) {
        super(zzfojVar.size(), i2);
        this.zza = zzfojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final E zza(int i2) {
        return this.zza.get(i2);
    }
}
