package com.google.android.gms.internal.ads;

import android.net.Uri;
import e.a.d.a.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
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

    private zzan(Uri uri, long j2, int i2, byte[] bArr, Map<String, String> map, long j3, long j4, String str, int i3, Object obj) {
        long j5 = j2 + j3;
        boolean z = false;
        zzakt.zza(j5 >= 0);
        zzakt.zza(j3 >= 0);
        zzakt.zza((j4 > 0 || j4 == -1) ? true : true);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zzf = j3;
        this.zze = j5;
        this.zzg = j4;
        this.zzh = null;
        this.zzi = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzan(Uri uri, Uri uri2, long j2, int i2, byte[] bArr, Map<String, String> map, long j3, long j4, String str, int i3, Object obj) {
        this(uri, 0L, 1, null, bArr, map, -1L, null, str, null);
    }

    @Deprecated
    public zzan(Uri uri, byte[] bArr, long j2, long j3, long j4, String str, int i2) {
        this(uri, j2 - j3, 1, null, Collections.emptyMap(), j3, j4, null, i2, null);
    }

    public static String zza(int i2) {
        return "GET";
    }

    public final String toString() {
        String zza = zza(1);
        String valueOf = String.valueOf(this.zza);
        long j2 = this.zzf;
        long j3 = this.zzg;
        int i2 = this.zzi;
        StringBuilder sb = new StringBuilder(zza.length() + 70 + valueOf.length() + 4);
        a.M(sb, "DataSpec[", zza, " ", valueOf);
        a.K(sb, ", ", j2, ", ");
        sb.append(j3);
        sb.append(", null, ");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    public final boolean zzb(int i2) {
        return (this.zzi & i2) == i2;
    }
}
