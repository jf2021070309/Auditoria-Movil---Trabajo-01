package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class zzacw extends zzacz {
    private final View zzi;

    public zzacw(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i2, int i3, View view) {
        super(zzabrVar, "Rh7wPiyt0Q0zAefasWAQ/36LhULiVi3U1eCO9K34euxkll+3xBb3q2iaqyDuAy33", "Kmv9uscZLQkY9DcwgermeDphrIGnHnQJYdRAudw6Thg=", zzyjVar, i2, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) zzbet.zzc().zzc(zzbjl.zzbX);
            zzabv zzabvVar = new zzabv((String) this.zzf.invoke(null, this.zzi, this.zzb.zzc().getResources().getDisplayMetrics(), bool));
            zzyx zza = zzyy.zza();
            zza.zza(zzabvVar.zza.longValue());
            zza.zzb(zzabvVar.zzb.longValue());
            zza.zzc(zzabvVar.zzc.longValue());
            if (bool.booleanValue()) {
                zza.zzd(zzabvVar.zzd.longValue());
            }
            this.zze.zzL(zza.zzah());
        }
    }
}
