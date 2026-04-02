package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzffg {
    public final String zza;
    public final String zzb;

    public zzffg(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzffg) {
            zzffg zzffgVar = (zzffg) obj;
            return this.zza.equals(zzffgVar.zza) && this.zzb.equals(zzffgVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }
}
