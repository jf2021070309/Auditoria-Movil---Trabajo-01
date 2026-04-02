package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class zzaco extends zzacz {
    public zzaco(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i2, int i3) {
        super(zzabrVar, "Md0NasjzX5Dv6RV9gbRrdbbQw799E9EBpEgmAwiNqi/RiG7V51y0yTZI5hLTRiUF", "4FqMwpBmkecZ5KuntXganMUU8jtWDsP5C5fiOE4sCtY=", zzyjVar, i2, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i2 = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzc())).booleanValue();
            zzyj zzyjVar = this.zze;
            if (true == booleanValue) {
                i2 = 2;
            }
            zzyjVar.zzY(i2);
        } catch (InvocationTargetException unused) {
            this.zze.zzY(3);
        }
    }
}
