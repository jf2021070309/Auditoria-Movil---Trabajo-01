package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbvw {
    public static final zzbvk zza(Context context, String str, zzbnt zzbntVar) {
        zzbvk zzbviVar;
        try {
            IBinder zze = ((zzbvo) zzbzs.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzbzq() { // from class: com.google.android.gms.internal.ads.zzbvv
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzq
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    if (queryLocalInterface instanceof zzbvo) {
                        return (zzbvo) queryLocalInterface;
                    }
                    return new zzbvo(obj);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbntVar, 231004000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof zzbvk) {
                zzbviVar = (zzbvk) queryLocalInterface;
            } else {
                zzbviVar = new zzbvi(zze);
            }
            return zzbviVar;
        } catch (RemoteException | zzbzr e) {
            zzbzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
