package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfpx<E> extends zzfoj<E> {
    public static final zzfoj<Object> zza = new zzfpx(new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    public zzfpx(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final E get(int i2) {
        zzflx.zze(i2, this.zzc, "index");
        E e2 = (E) this.zzb[i2];
        e2.getClass();
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfoj, com.google.android.gms.internal.ads.zzfoe
    public final int zzg(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, i2, this.zzc);
        return i2 + this.zzc;
    }
}
