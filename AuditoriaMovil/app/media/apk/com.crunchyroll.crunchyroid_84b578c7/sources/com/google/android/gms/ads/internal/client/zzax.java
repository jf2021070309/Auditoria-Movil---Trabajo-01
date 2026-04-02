package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.ads.zzbbf;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdh;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public abstract class zzax {
    private static final zzce zza;

    static {
        zzce zzccVar;
        zzce zzceVar = null;
        try {
            Object newInstance = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzbzo.zzj("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    if (queryLocalInterface instanceof zzce) {
                        zzccVar = (zzce) queryLocalInterface;
                    } else {
                        zzccVar = new zzcc(iBinder);
                    }
                    zzceVar = zzccVar;
                }
            }
        } catch (Exception unused) {
            zzbzo.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzceVar;
    }

    private final Object zze() {
        zzce zzceVar = zza;
        if (zzceVar != null) {
            try {
                return zzb(zzceVar);
            } catch (RemoteException e) {
                zzbzo.zzk("Cannot invoke local loader using ClientApi class.", e);
                return null;
            }
        }
        zzbzo.zzj("ClientApi class cannot be loaded.");
        return null;
    }

    private final Object zzf() {
        try {
            return zzc();
        } catch (RemoteException e) {
            zzbzo.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }

    public abstract Object zza();

    public abstract Object zzb(zzce zzceVar) throws RemoteException;

    public abstract Object zzc() throws RemoteException;

    public final Object zzd(Context context, boolean z) {
        boolean z2;
        boolean z3;
        Object zze;
        if (!z) {
            zzay.zzb();
            if (!zzbzh.zzs(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzbzo.zze("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z4 = false;
        if (DynamiteModule.getLocalVersion(context, "com.google.android.gms.ads.dynamite") > DynamiteModule.getRemoteVersion(context, "com.google.android.gms.ads.dynamite")) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z5 = !z2;
        zzbbf.zza(context);
        if (((Boolean) zzbct.zza.zze()).booleanValue()) {
            z3 = false;
        } else if (((Boolean) zzbct.zzb.zze()).booleanValue()) {
            z3 = true;
            z4 = true;
        } else {
            z4 = z | z5;
            z3 = false;
        }
        if (z4) {
            zze = zze();
            if (zze == null && !z3) {
                zze = zzf();
            }
        } else {
            Object zzf = zzf();
            if (zzf == null) {
                if (zzay.zze().nextInt(((Long) zzbdh.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzay.zzb().zzn(context, zzay.zzc().zza, "gmob-apps", bundle, true);
                }
            }
            zze = zzf == null ? zze() : zzf;
        }
        if (zze == null) {
            return zza();
        }
        return zze;
    }
}
