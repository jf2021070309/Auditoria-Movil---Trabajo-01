package com.google.android.gms.internal.ads;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class zzja<V> {
    private int zza;
    private final SparseArray<V> zzb;
    private final zzakx<V> zzc;

    public zzja() {
        zzakx zzakxVar = zziz.zza;
        throw null;
    }

    public zzja(zzakx<V> zzakxVar) {
        this.zzb = new SparseArray<>();
        this.zzc = zzakxVar;
        this.zza = -1;
    }

    public final V zza(int i2) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i3 = this.zza;
            if (i3 > 0 && i2 < this.zzb.keyAt(i3)) {
                this.zza--;
            }
        }
        while (this.zza < this.zzb.size() - 1 && i2 >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }

    public final void zzb(int i2, V v) {
        if (this.zza == -1) {
            zzakt.zzd(this.zzb.size() == 0);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            SparseArray<V> sparseArray = this.zzb;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzakt.zza(i2 >= keyAt);
            if (keyAt == i2) {
                SparseArray<V> sparseArray2 = this.zzb;
                ((zzir) sparseArray2.valueAt(sparseArray2.size() - 1)).zzb;
            }
        }
        this.zzb.append(i2, v);
    }

    public final V zzc() {
        SparseArray<V> sparseArray = this.zzb;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final void zzd(int i2) {
        int i3 = 0;
        while (i3 < this.zzb.size() - 1) {
            int i4 = i3 + 1;
            if (i2 < this.zzb.keyAt(i4)) {
                return;
            }
            ((zzir) this.zzb.valueAt(i3)).zzb;
            this.zzb.removeAt(i3);
            int i5 = this.zza;
            if (i5 > 0) {
                this.zza = i5 - 1;
            }
            i3 = i4;
        }
    }

    public final void zze() {
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            ((zzir) this.zzb.valueAt(i2)).zzb;
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }
}
