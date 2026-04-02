package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzer extends zzfg {
    private final zzcz zzi;
    private final long zzj;
    private final long zzk;

    public zzer(zzdu zzduVar, String str, String str2, zzr zzrVar, int i, int i2, zzcz zzczVar, long j, long j2) {
        super(zzduVar, "X9PgbTHLX0FFxbl3gdPDuVwcglfXy5CDrzo8siaVNaH+OIJ6JI34Wu3QK5rLega4", "JLulXGPEHVwHK+0FG96HP9my+NvwpTQbwIaIZrjn9OU=", zzrVar, i, 11);
        this.zzi = zzczVar;
        this.zzj = j;
        this.zzk = j2;
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzcz zzczVar = this.zzi;
        if (zzczVar != null) {
            zzcx zzcxVar = new zzcx((String) this.zzf.invoke(null, zzczVar.zza(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                this.zze.zzz(zzcxVar.zza.longValue());
                if (zzcxVar.zzb.longValue() >= 0) {
                    this.zze.zzR(zzcxVar.zzb.longValue());
                }
                if (zzcxVar.zzc.longValue() >= 0) {
                    this.zze.zzf(zzcxVar.zzc.longValue());
                }
            }
        }
    }
}
