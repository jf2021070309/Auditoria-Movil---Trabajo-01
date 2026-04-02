package com.google.android.gms.internal.cast_tv;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzca {
    private final zzbz zza;

    public zzca(zzbz zzbzVar) {
        this.zza = zzbzVar;
    }

    private final void zze(zzds zzdsVar) {
        this.zza.zza(new zzdx(zzdsVar.zzn()));
    }

    public final void zza(String str, boolean z) {
        zzdr zza = zzds.zza();
        zza.zzd(2);
        zza.zzb(str);
        zza.zza(z);
        zze((zzds) zza.zzi());
    }

    public final void zzb(String str) {
        zzdr zza = zzds.zza();
        zza.zzd(3);
        zza.zzb(str);
        zze((zzds) zza.zzi());
    }

    public final void zzc(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str2.getBytes());
            zzd("Cast.AtvReceiver.PackageName", ByteBuffer.wrap(messageDigest.digest(), 0, 8).getLong());
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    public final void zzd(String str, long j) {
        zzdr zza = zzds.zza();
        zza.zzd(5);
        zza.zzb(str);
        zza.zzc(j);
        zze((zzds) zza.zzi());
    }
}
