package com.google.android.gms.internal.ads;

import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzasg implements Runnable {
    final /* synthetic */ zzasj zza;
    final /* synthetic */ zzasl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
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
        for (int i = 0; i < size; i++) {
            sparseArray2 = this.zzb.zzn;
            ((zzata) sparseArray2.valueAt(i)).zzg();
        }
    }
}
