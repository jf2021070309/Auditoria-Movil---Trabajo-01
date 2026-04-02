package com.google.android.gms.internal.play_billing;
/* loaded from: classes2.dex */
public final class zzq<E> extends zzp<E> {
    public static final zzp<Object> zza = new zzq(new Object[0], 0);
    public final transient Object[] zzb;

    public zzq(Object[] objArr, int i2) {
        this.zzb = objArr;
    }

    @Override // java.util.List
    public final E get(int i2) {
        zzj.zza(i2, 0, "index");
        return (E) this.zzb[i2];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzp, com.google.android.gms.internal.play_billing.zzm
    public final int zza(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzm
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzm
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzm
    public final Object[] zze() {
        return this.zzb;
    }
}
