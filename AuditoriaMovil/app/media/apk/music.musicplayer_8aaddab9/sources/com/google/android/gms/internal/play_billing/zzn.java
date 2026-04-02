package com.google.android.gms.internal.play_billing;
/* loaded from: classes2.dex */
public final class zzn<E> extends zzl<E> {
    private final zzp<E> zza;

    public zzn(zzp<E> zzpVar, int i2) {
        super(zzpVar.size(), i2);
        this.zza = zzpVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzl
    public final E zza(int i2) {
        return this.zza.get(i2);
    }
}
