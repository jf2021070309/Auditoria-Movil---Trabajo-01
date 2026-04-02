package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzjn extends zzw {
    public static final zzjn zzA;
    @Deprecated
    public static final zzjn zzB;
    public static final zzadw<zzjn> zzN;
    public final int zzC;
    public final boolean zzD;
    public final boolean zzE;
    public final boolean zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    private final SparseArray<Map<zzs, zzjq>> zzO;
    private final SparseBooleanArray zzP;

    static {
        zzjn zzjnVar = new zzjn(new zzjo());
        zzA = zzjnVar;
        zzB = zzjnVar;
        zzN = zzjm.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzjn(zzjo zzjoVar) {
        super(zzjoVar);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        SparseArray<Map<zzs, zzjq>> sparseArray;
        SparseBooleanArray sparseBooleanArray;
        z = zzjoVar.zza;
        this.zzD = z;
        this.zzE = false;
        z2 = zzjoVar.zzb;
        this.zzF = z2;
        z3 = zzjoVar.zzc;
        this.zzG = z3;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzC = 0;
        z4 = zzjoVar.zzd;
        this.zzK = z4;
        this.zzL = false;
        z5 = zzjoVar.zze;
        this.zzM = z5;
        sparseArray = zzjoVar.zzf;
        this.zzO = sparseArray;
        sparseBooleanArray = zzjoVar.zzg;
        this.zzP = sparseBooleanArray;
    }

    public static zzjn zzc(Context context) {
        return new zzjn(new zzjo(context));
    }

    @Override // com.google.android.gms.internal.ads.zzw
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzjn zzjnVar = (zzjn) obj;
            if (super.equals(zzjnVar) && this.zzD == zzjnVar.zzD && this.zzF == zzjnVar.zzF && this.zzG == zzjnVar.zzG && this.zzK == zzjnVar.zzK && this.zzM == zzjnVar.zzM) {
                SparseBooleanArray sparseBooleanArray = this.zzP;
                SparseBooleanArray sparseBooleanArray2 = zzjnVar.zzP;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        } else {
                            SparseArray<Map<zzs, zzjq>> sparseArray = this.zzO;
                            SparseArray<Map<zzs, zzjq>> sparseArray2 = zzjnVar.zzO;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map<zzs, zzjq> valueAt = sparseArray.valueAt(i2);
                                        Map<zzs, zzjq> valueAt2 = sparseArray2.valueAt(indexOfKey);
                                        if (valueAt2.size() == valueAt.size()) {
                                            for (Map.Entry<zzs, zzjq> entry : valueAt.entrySet()) {
                                                zzs key = entry.getKey();
                                                if (valueAt2.containsKey(key)) {
                                                    if (!zzamq.zzc(entry.getValue(), valueAt2.get(key))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzw
    public final int hashCode() {
        return ((((((((((super.hashCode() + 31) * 31) + (this.zzD ? 1 : 0)) * 961) + (this.zzF ? 1 : 0)) * 31) + (this.zzG ? 1 : 0)) * 28629151) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0);
    }

    public final boolean zzd(int i) {
        return this.zzP.get(i);
    }

    public final boolean zze(int i, zzs zzsVar) {
        Map<zzs, zzjq> map = this.zzO.get(i);
        return map != null && map.containsKey(zzsVar);
    }

    public final zzjq zzf(int i, zzs zzsVar) {
        Map<zzs, zzjq> map = this.zzO.get(i);
        if (map != null) {
            return map.get(zzsVar);
        }
        return null;
    }

    public final zzjo zzg() {
        return new zzjo(this, null);
    }
}
