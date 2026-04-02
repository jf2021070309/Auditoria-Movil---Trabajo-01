package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzjo extends zzv {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final SparseArray<Map<zzs, zzjq>> zzf;
    private final SparseBooleanArray zzg;

    @Deprecated
    public zzjo() {
        this.zzf = new SparseArray<>();
        this.zzg = new SparseBooleanArray();
        zzt();
    }

    private final void zzt() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzv
    public final /* bridge */ /* synthetic */ zzv zzj(int i, int i2, boolean z) {
        super.zzj(i, i2, true);
        return this;
    }

    public final zzjo zzs(int i, boolean z) {
        if (this.zzg.get(i) == z) {
            return this;
        }
        if (z) {
            this.zzg.put(i, true);
        } else {
            this.zzg.delete(i);
        }
        return this;
    }

    public zzjo(Context context) {
        super.zzk(context);
        Point zzaa = zzamq.zzaa(context);
        zzj(zzaa.x, zzaa.y, true);
        this.zzf = new SparseArray<>();
        this.zzg = new SparseBooleanArray();
        zzt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzjo(zzjn zzjnVar, zzjk zzjkVar) {
        super(zzjnVar);
        this.zza = zzjnVar.zzD;
        this.zzb = zzjnVar.zzF;
        this.zzc = zzjnVar.zzG;
        this.zzd = zzjnVar.zzK;
        this.zze = zzjnVar.zzM;
        SparseArray zza = zzjn.zza(zzjnVar);
        SparseArray<Map<zzs, zzjq>> sparseArray = new SparseArray<>();
        for (int i = 0; i < zza.size(); i++) {
            sparseArray.put(zza.keyAt(i), new HashMap((Map) zza.valueAt(i)));
        }
        this.zzf = sparseArray;
        this.zzg = zzjn.zzb(zzjnVar).clone();
    }
}
