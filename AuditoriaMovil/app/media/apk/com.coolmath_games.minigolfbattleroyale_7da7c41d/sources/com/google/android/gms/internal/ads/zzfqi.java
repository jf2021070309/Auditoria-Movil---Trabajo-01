package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfqi<E> extends zzfot<E> {
    final transient E zza;
    private transient int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqi(E e) {
        if (e == null) {
            throw null;
        }
        this.zza = e;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfot, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.zzb;
        if (i == 0) {
            int hashCode = this.zza.hashCode();
            this.zzb = hashCode;
            return hashCode;
        }
        return i;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfoe
    public final boolean zzf() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfoe
    public final int zzg(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfot
    final boolean zzm() {
        return this.zzb != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfot
    final zzfoj<E> zzn() {
        return zzfoj.zzj(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqi(E e, int i) {
        this.zza = e;
        this.zzb = i;
    }
}
