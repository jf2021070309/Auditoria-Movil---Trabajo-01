package com.google.android.gms.internal.measurement;

import android.content.Context;
import e.a.d.a.a;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class zzgx extends zzhs {
    private final Context zza;
    private final zzib<zzhz<zzhi>> zzb;

    public zzgx(Context context, @Nullable zzib<zzhz<zzhi>> zzibVar) {
        Objects.requireNonNull(context, "Null context");
        this.zza = context;
        this.zzb = zzibVar;
    }

    public final boolean equals(Object obj) {
        zzib<zzhz<zzhi>> zzibVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhs) {
            zzhs zzhsVar = (zzhs) obj;
            if (this.zza.equals(zzhsVar.zza()) && ((zzibVar = this.zzb) != null ? zzibVar.equals(zzhsVar.zzb()) : zzhsVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzib<zzhz<zzhi>> zzibVar = this.zzb;
        return hashCode ^ (zzibVar == null ? 0 : zzibVar.hashCode());
    }

    public final String toString() {
        String obj = this.zza.toString();
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(obj.length() + 46 + valueOf.length());
        a.M(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzhs
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhs
    @Nullable
    public final zzib<zzhz<zzhi>> zzb() {
        return this.zzb;
    }
}
