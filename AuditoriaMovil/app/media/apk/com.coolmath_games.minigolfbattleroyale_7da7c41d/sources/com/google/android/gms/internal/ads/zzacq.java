package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzacq extends zzacz {
    private final boolean zzi;

    public zzacq(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i, int i2) {
        super(zzabrVar, "QXlICfiT7SVSRUb0DD1a74y++UqnSLMKlPOXAn9FNLrl7qN9uprYrk5dswjj/dLi", "yqGfvaGOT1fOScq8M0g9vywM6jvcTWdjxf27npfqtn0=", zzyjVar, i, 61);
        this.zzi = zzabrVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, this.zzb.zzc(), Boolean.valueOf(this.zzi))).longValue();
        synchronized (this.zze) {
            this.zze.zzO(longValue);
        }
    }
}
