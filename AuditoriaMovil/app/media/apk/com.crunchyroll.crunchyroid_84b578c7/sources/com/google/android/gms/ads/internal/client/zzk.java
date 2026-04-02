package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbbf;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzs;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzk extends RemoteCreator {
    private zzbsv zza;

    @VisibleForTesting
    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzbv) {
            return (zzbv) queryLocalInterface;
        }
        return new zzbv(iBinder);
    }

    public final zzbu zza(Context context, zzq zzqVar, String str, zzbnt zzbntVar, int i) {
        zzbu zzbsVar;
        zzbu zzbsVar2;
        zzbbf.zza(context);
        if (((Boolean) zzba.zzc().zzb(zzbbf.zzjf)).booleanValue()) {
            try {
                IBinder zze = ((zzbv) zzbzs.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new zzbzq() { // from class: com.google.android.gms.ads.internal.client.zzj
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzbzq
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        if (queryLocalInterface instanceof zzbv) {
                            return (zzbv) queryLocalInterface;
                        }
                        return new zzbv(obj);
                    }
                })).zze(ObjectWrapper.wrap(context), zzqVar, str, zzbntVar, 231004000, i);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface instanceof zzbu) {
                    zzbsVar = (zzbu) queryLocalInterface;
                } else {
                    zzbsVar = new zzbs(zze);
                }
                return zzbsVar;
            } catch (RemoteException | zzbzr | NullPointerException e) {
                zzbsv zza = zzbst.zza(context);
                this.zza = zza;
                zza.zzf(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzbzo.zzl("#007 Could not call remote method.", e);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzbv) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzqVar, str, zzbntVar, 231004000, i);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface2 instanceof zzbu) {
                zzbsVar2 = (zzbu) queryLocalInterface2;
            } else {
                zzbsVar2 = new zzbs(zze2);
            }
            return zzbsVar2;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
            zzbzo.zzf("Could not create remote AdManager.", e2);
            return null;
        }
    }
}
