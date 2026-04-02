package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes.dex */
public final class zzcde {
    public static final zzccs zza(Context context, String str, zzbvg zzbvgVar) {
        try {
            IBinder zze = ((zzccw) zzcgx.zza(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzcdd.zza)).zze(ObjectWrapper.wrap(context), str, zzbvgVar, 213806000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzccs ? (zzccs) queryLocalInterface : new zzccq(zze);
        } catch (RemoteException | zzcgw e2) {
            zzcgt.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
