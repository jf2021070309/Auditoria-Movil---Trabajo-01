package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzacn extends zzacz {
    public zzacn(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i, int i2) {
        super(zzabrVar, "0nCS1/lIiwmVLmY4a37W/6SChW3s76Q3PykiLxRk0eA7B+gs2O43l0EwWtwdYppM", "NOQ7v89FdlqbWITe5fQxaJU2MeOCrxMPjMVtpwyCEdc=", zzyjVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaay zzaayVar = new zzaay((String) this.zzf.invoke(null, this.zzb.zzc(), Boolean.valueOf(((Boolean) zzbet.zzc().zzc(zzbjl.zzbM)).booleanValue())));
        synchronized (this.zze) {
            this.zze.zzc(zzaayVar.zza);
            this.zze.zzN(zzaayVar.zzb);
        }
    }
}
