package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzan {
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map<String, String> zzd;
    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final String zzh;
    public final int zzi;

    private zzan(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j + j2;
        boolean z = false;
        zzakt.zza(j4 >= 0);
        zzakt.zza(j2 >= 0);
        zzakt.zza((j3 > 0 || j3 == -1) ? true : z);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zzf = j2;
        this.zze = j4;
        this.zzg = j3;
        this.zzh = null;
        this.zzi = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzan(Uri uri, Uri uri2, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        this(uri, 0L, 1, null, bArr, map, -1L, null, str, null);
    }

    public static String zza(int i) {
        return "GET";
    }

    public final String toString() {
        String zza = zza(1);
        String valueOf = String.valueOf(this.zza);
        long j = this.zzf;
        long j2 = this.zzg;
        int i = this.zzi;
        StringBuilder sb = new StringBuilder(zza.length() + 70 + String.valueOf(valueOf).length() + 4);
        sb.append("DataSpec[");
        sb.append(zza);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", null, ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public final boolean zzb(int i) {
        return (this.zzi & i) == i;
    }

    @Deprecated
    public zzan(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, j - j2, 1, null, Collections.emptyMap(), j2, j3, null, i, null);
    }
}
