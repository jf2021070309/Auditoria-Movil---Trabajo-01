package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfqd<E> extends zzfot<E> {
    public static final zzfqd<Object> zza;
    private static final Object[] zzd;
    public final transient Object[] zzb;
    public final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzfqd<>(objArr, 0, objArr, 0, 0);
    }

    public zzfqd(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.zzb = objArr;
        this.zze = i2;
        this.zzc = objArr2;
        this.zzf = i3;
        this.zzg = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int zzb = zzfob.zzb(obj);
        while (true) {
            int i2 = zzb & this.zzf;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zzb = i2 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfot, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfot, com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfot, com.google.android.gms.internal.ads.zzfoe
    public final zzfql<E> zza() {
        return zze().listIterator(0);
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
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final int zzg(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, i2, this.zzg);
        return i2 + this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfot
    public final boolean zzm() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfot
    public final zzfoj<E> zzn() {
        return zzfoj.zzs(this.zzb, this.zzg);
    }
}
