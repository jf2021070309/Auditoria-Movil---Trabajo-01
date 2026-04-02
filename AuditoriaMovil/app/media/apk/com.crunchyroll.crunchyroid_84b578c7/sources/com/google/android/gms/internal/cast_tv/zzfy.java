package com.google.android.gms.internal.cast_tv;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzfy extends zzfv {
    static final zzfy zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzfy(objArr, 0, objArr, 0, 0);
    }

    public zzfy(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zzc = objArr2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.zzc;
        if (obj != null) {
            int length = objArr.length;
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzfv, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzfv, com.google.android.gms.internal.cast_tv.zzfr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzfr
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzfr
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzfr
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzfv, com.google.android.gms.internal.cast_tv.zzfr
    public final zzfz zzd() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzfr
    public final Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzfv
    public final zzfu zzg() {
        int i = zzfu.zzd;
        return zzfx.zza;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzfv
    public final boolean zzi() {
        return true;
    }
}
