package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
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

    public zzjo(Context context) {
        super.zzk(context);
        Point zzaa = zzamq.zzaa(context);
        zzj(zzaa.x, zzaa.y, true);
        this.zzf = new SparseArray<>();
        this.zzg = new SparseBooleanArray();
        zzt();
    }

    public /* synthetic */ zzjo(zzjn zzjnVar, zzjk zzjkVar) {
        super(zzjnVar);
        this.zza = zzjnVar.zzD;
        this.zzb = zzjnVar.zzF;
        this.zzc = zzjnVar.zzG;
        this.zzd = zzjnVar.zzK;
        this.zze = zzjnVar.zzM;
        SparseArray zza = zzjn.zza(zzjnVar);
        SparseArray<Map<zzs, zzjq>> sparseArray = new SparseArray<>();
        for (int i2 = 0; i2 < zza.size(); i2++) {
            sparseArray.put(zza.keyAt(i2), new HashMap((Map) zza.valueAt(i2)));
        }
        this.zzf = sparseArray;
        this.zzg = zzjn.zzb(zzjnVar).clone();
    }

    private final void zzt() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzv
    public final /* bridge */ /* synthetic */ zzv zzj(int i2, int i3, boolean z) {
        super.zzj(i2, i3, true);
        return this;
    }

    public final zzjo zzs(int i2, boolean z) {
        if (this.zzg.get(i2) == z) {
            return this;
        }
        if (z) {
            this.zzg.put(i2, true);
        } else {
            this.zzg.delete(i2);
        }
        return this;
    }
}
