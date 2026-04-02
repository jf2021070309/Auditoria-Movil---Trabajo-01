package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class zzaca extends zzacz {
    public zzaca(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i2, int i3) {
        super(zzabrVar, "pECbn1i7ArZz8HseR71ZVkvFfTp84DNv2haWC1WmGQudMO74UcIxEa2NyELtzZhK", "LbaQh8VAFWEQeupBiMdSh8EgMse5yKT8p6jkCYTG+aQ=", zzyjVar, i2, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzW(3);
        try {
            int i2 = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzc())).booleanValue();
            zzyj zzyjVar = this.zze;
            if (true == booleanValue) {
                i2 = 2;
            }
            zzyjVar.zzW(i2);
        } catch (InvocationTargetException e2) {
            if (!(e2.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e2;
            }
        }
    }
}
