package com.google.android.gms.internal.ads;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class zzasg implements Runnable {
    public final /* synthetic */ zzasj zza;
    public final /* synthetic */ zzasl zzb;

    public zzasg(zzasl zzaslVar, zzasj zzasjVar) {
        this.zzb = zzaslVar;
        this.zza = zzasjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.zza.zza();
        sparseArray = this.zzb.zzn;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray2 = this.zzb.zzn;
            ((zzata) sparseArray2.valueAt(i2)).zzg();
        }
    }
}
