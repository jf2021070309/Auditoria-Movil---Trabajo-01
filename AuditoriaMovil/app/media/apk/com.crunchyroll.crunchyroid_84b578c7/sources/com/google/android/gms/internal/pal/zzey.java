package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzey extends zzfg {
    private final StackTraceElement[] zzi;

    public zzey(zzdu zzduVar, String str, String str2, zzr zzrVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzduVar, "d2tnKFzXPwiZyQGi+81r0jKuUmc/wF2bs8mf3rZLUgisIeswnimQDm/skPYjpEo4", "e/DvqiTz4SkFtBEBn/3V8Pr2h2slHO4xuLOBAItCJ4w=", zzrVar, i, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzdn zzdnVar = new zzdn((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                this.zze.zzG(zzdnVar.zza.longValue());
                if (zzdnVar.zzb.booleanValue()) {
                    zzr zzrVar = this.zze;
                    int i = 1;
                    if (true != zzdnVar.zzc.booleanValue()) {
                        i = 2;
                    }
                    zzrVar.zzad(i);
                } else {
                    this.zze.zzad(3);
                }
            }
        }
    }
}
