package com.google.android.gms.internal.pal;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzjd extends zziw implements Set {
    private transient zziz zza;

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
        return zzjk.zza(this);
    }

    @Override // com.google.android.gms.internal.pal.zziw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzjl iterator();

    public final zziz zzf() {
        zziz zzizVar = this.zza;
        if (zzizVar == null) {
            zziz zzg = zzg();
            this.zza = zzg;
            return zzg;
        }
        return zzizVar;
    }

    public zziz zzg() {
        return zziz.zzg(toArray());
    }
}
