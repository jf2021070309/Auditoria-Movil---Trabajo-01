package com.google.android.gms.internal.ads;

import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzja<V> {
    private int zza;
    private final SparseArray<V> zzb;
    private final zzakx<V> zzc;

    public zzja() {
        zzakx zzakxVar = zziz.zza;
        throw null;
    }

    public final void zzb(int i, V v) {
        if (this.zza == -1) {
            zzakt.zzd(this.zzb.size() == 0);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            SparseArray<V> sparseArray = this.zzb;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzakt.zza(i >= keyAt);
            if (keyAt == i) {
                SparseArray<V> sparseArray2 = this.zzb;
                ((zzir) sparseArray2.valueAt(sparseArray2.size() - 1)).zzb;
            }
        }
        this.zzb.append(i, v);
    }

    public final V zzc() {
        SparseArray<V> sparseArray = this.zzb;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final void zzd(int i) {
        int i2 = 0;
        while (i2 < this.zzb.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.zzb.keyAt(i3)) {
                return;
            }
            ((zzir) this.zzb.valueAt(i2)).zzb;
            this.zzb.removeAt(i2);
            int i4 = this.zza;
            if (i4 > 0) {
                this.zza = i4 - 1;
            }
            i2 = i3;
        }
    }

    public final void zze() {
        for (int i = 0; i < this.zzb.size(); i++) {
            ((zzir) this.zzb.valueAt(i)).zzb;
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzja(zzakx<V> zzakxVar) {
        this.zzb = new SparseArray<>();
        this.zzc = zzakxVar;
        this.zza = -1;
    }

    public final V zza(int i) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i2 = this.zza;
            if (i2 > 0 && i < this.zzb.keyAt(i2)) {
                this.zza--;
            }
        }
        while (this.zza < this.zzb.size() - 1 && i >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }
}
