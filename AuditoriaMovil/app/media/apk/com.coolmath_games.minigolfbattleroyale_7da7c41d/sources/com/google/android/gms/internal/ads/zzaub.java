package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaub {
    public final Uri zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;

    public zzaub(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        zzaup.zza(j >= 0);
        zzaup.zza(j2 >= 0);
        zzaup.zza((j3 > 0 || j3 == -1) ? true : z);
        this.zza = uri;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String arrays = Arrays.toString((byte[]) null);
        long j = this.zzb;
        long j2 = this.zzc;
        long j3 = this.zzd;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93 + String.valueOf(arrays).length() + 4);
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", null, 0]");
        return sb.toString();
    }
}
