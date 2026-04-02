package com.google.android.gms.internal.common;
/* loaded from: classes.dex */
public final class zzae<E> extends zzz<E> {
    private final zzag<E> zza;

    public zzae(zzag<E> zzagVar, int i2) {
        super(zzagVar.size(), i2);
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final E zza(int i2) {
        return this.zza.get(i2);
    }
}
