package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
/* loaded from: classes.dex */
public final class zzale {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzale) {
            zzale zzaleVar = (zzale) obj;
            if (zzamq.zza < 24) {
                if (this.zza.size() == zzaleVar.zza.size()) {
                    for (int i2 = 0; i2 < this.zza.size(); i2++) {
                        if (zzb(i2) != zzaleVar.zzb(i2)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return this.zza.equals(zzaleVar.zza);
        }
        return false;
    }

    public final int hashCode() {
        if (zzamq.zza < 24) {
            int size = this.zza.size();
            for (int i2 = 0; i2 < this.zza.size(); i2++) {
                size = (size * 31) + zzb(i2);
            }
            return size;
        }
        return this.zza.hashCode();
    }

    public final int zza() {
        return this.zza.size();
    }

    public final int zzb(int i2) {
        zzakt.zzc(i2, 0, this.zza.size());
        return this.zza.keyAt(i2);
    }
}
