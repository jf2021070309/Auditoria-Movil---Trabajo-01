package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import c.i.a;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class zzcn implements zzck {
    private static zzcn zza;
    @Nullable
    private final Context zzb;
    @Nullable
    private final ContentObserver zzc;

    private zzcn() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzcn(Context context) {
        this.zzb = context;
        zzcm zzcmVar = new zzcm(this, null);
        this.zzc = zzcmVar;
        context.getContentResolver().registerContentObserver(zzcb.zza, true, zzcmVar);
    }

    public static zzcn zza(Context context) {
        zzcn zzcnVar;
        synchronized (zzcn.class) {
            if (zza == null) {
                zza = a.j(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzcn(context) : new zzcn();
            }
            zzcnVar = zza;
        }
        return zzcnVar;
    }

    public static synchronized void zze() {
        Context context;
        synchronized (zzcn.class) {
            zzcn zzcnVar = zza;
            if (zzcnVar != null && (context = zzcnVar.zzb) != null && zzcnVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    @Override // com.google.android.gms.internal.auth.zzck
    /* renamed from: zzc */
    public final String zzb(final String str) {
        if (this.zzb == null) {
            return null;
        }
        try {
            return (String) zzci.zza(new zzcj() { // from class: com.google.android.gms.internal.auth.zzcl
                @Override // com.google.android.gms.internal.auth.zzcj
                public final Object zza() {
                    return zzcn.this.zzd(str);
                }
            });
        } catch (IllegalStateException | SecurityException e2) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e2);
            return null;
        }
    }

    public final /* synthetic */ String zzd(String str) {
        return zzcb.zza(this.zzb.getContentResolver(), str, null);
    }
}
