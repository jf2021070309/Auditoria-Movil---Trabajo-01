package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzahk {
    private final zzale zza;

    public zzahk(zzale zzaleVar) {
        this.zza = zzaleVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzahk) {
            return this.zza.equals(((zzahk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }
}
