package com.google.android.gms.internal.cast_tv;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzfv extends zzfr implements Set {
    private transient zzfu zza;

    public static zzfv zzh() {
        return zzfy.zza;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfv) {
            ((zzfv) obj).zzi();
            if (hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
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
    public int hashCode() {
        int i;
        int i2 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzfr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzfz iterator();

    public final zzfu zzf() {
        zzfu zzfuVar = this.zza;
        if (zzfuVar == null) {
            zzfu zzg = zzg();
            this.zza = zzg;
            return zzg;
        }
        return zzfuVar;
    }

    public zzfu zzg() {
        throw null;
    }

    public boolean zzi() {
        throw null;
    }
}
