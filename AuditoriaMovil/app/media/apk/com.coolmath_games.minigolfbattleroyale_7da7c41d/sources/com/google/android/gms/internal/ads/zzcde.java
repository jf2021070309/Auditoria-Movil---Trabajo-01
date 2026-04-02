package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcde {
    public static final zzccs zza(Context context, String str, zzbvg zzbvgVar) {
        zzccs zzccqVar;
        try {
            IBinder zze = ((zzccw) zzcgx.zza(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzcdd.zza)).zze(ObjectWrapper.wrap(context), str, zzbvgVar, 213806000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof zzccs) {
                zzccqVar = (zzccs) queryLocalInterface;
            } else {
                zzccqVar = new zzccq(zze);
            }
            return zzccqVar;
        } catch (RemoteException | zzcgw e) {
            zzcgt.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
