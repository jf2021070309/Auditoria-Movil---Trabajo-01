package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfqi<E> extends zzfot<E> {
    public final transient E zza;
    private transient int zzb;

    public zzfqi(E e2) {
        Objects.requireNonNull(e2);
        this.zza = e2;
    }

    public zzfqi(E e2, int i2) {
        this.zza = e2;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfot, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i2 = this.zzb;
        if (i2 == 0) {
            int hashCode = this.zza.hashCode();
            this.zzb = hashCode;
            return hashCode;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfot, com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new zzfou(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zza.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfot, com.google.android.gms.internal.ads.zzfoe
    public final zzfql<E> zza() {
        return new zzfou(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final int zzg(Object[] objArr, int i2) {
        objArr[i2] = this.zza;
        return i2 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfot
    public final boolean zzm() {
        return this.zzb != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfot
    public final zzfoj<E> zzn() {
        return zzfoj.zzj(this.zza);
    }
}
