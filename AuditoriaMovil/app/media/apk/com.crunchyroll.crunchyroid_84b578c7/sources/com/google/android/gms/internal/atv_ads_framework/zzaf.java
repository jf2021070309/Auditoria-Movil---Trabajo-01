package com.google.android.gms.internal.atv_ads_framework;

import java.util.Set;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public abstract class zzaf extends zzy implements Set {
    private transient zzab zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzam.zza(this);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public zzab zzd() {
        zzab zzabVar = this.zza;
        if (zzabVar == null) {
            zzab zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zzabVar;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: zze */
    public abstract zzan iterator();

    public zzab zzh() {
        return zzab.zzi(toArray());
    }
}
