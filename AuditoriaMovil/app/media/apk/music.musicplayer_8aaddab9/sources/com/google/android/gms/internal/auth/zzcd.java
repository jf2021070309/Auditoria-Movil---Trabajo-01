package com.google.android.gms.internal.auth;

import android.content.Context;
import e.a.d.a.a;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class zzcd extends zzcy {
    private final Context zza;
    private final zzdg<zzde<zzco>> zzb;

    public zzcd(Context context, @Nullable zzdg<zzde<zzco>> zzdgVar) {
        Objects.requireNonNull(context, "Null context");
        this.zza = context;
        this.zzb = zzdgVar;
    }

    public final boolean equals(Object obj) {
        zzdg<zzde<zzco>> zzdgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcy) {
            zzcy zzcyVar = (zzcy) obj;
            if (this.zza.equals(zzcyVar.zza()) && ((zzdgVar = this.zzb) != null ? zzdgVar.equals(zzcyVar.zzb()) : zzcyVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzdg<zzde<zzco>> zzdgVar = this.zzb;
        return hashCode ^ (zzdgVar == null ? 0 : zzdgVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        a.M(sb, "FlagsContext{context=", valueOf, ", hermeticFileOverrides=", valueOf2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.auth.zzcy
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzcy
    @Nullable
    public final zzdg<zzde<zzco>> zzb() {
        return this.zzb;
    }
}
