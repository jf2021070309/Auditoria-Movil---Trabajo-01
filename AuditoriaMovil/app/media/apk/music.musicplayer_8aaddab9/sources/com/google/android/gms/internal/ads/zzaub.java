package com.google.android.gms.internal.ads;

import android.net.Uri;
import e.a.d.a.a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzaub {
    public final Uri zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;

    public zzaub(Uri uri, byte[] bArr, long j2, long j3, long j4, String str, int i2) {
        boolean z = false;
        zzaup.zza(j2 >= 0);
        zzaup.zza(j3 >= 0);
        zzaup.zza((j4 > 0 || j4 == -1) ? true : true);
        this.zza = uri;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String arrays = Arrays.toString((byte[]) null);
        long j2 = this.zzb;
        long j3 = this.zzc;
        long j4 = this.zzd;
        StringBuilder sb = new StringBuilder(a.b(valueOf.length(), 93, String.valueOf(arrays).length(), 4));
        a.M(sb, "DataSpec[", valueOf, ", ", arrays);
        a.K(sb, ", ", j2, ", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", null, 0]");
        return sb.toString();
    }
}
