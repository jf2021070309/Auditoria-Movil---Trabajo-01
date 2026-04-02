package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbds {
    private final Context zza;

    public zzbds(Context context) {
        this.zza = context;
    }

    public final void zza(zzbta zzbtaVar) {
        try {
            ((zzbdt) zzbzs.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new zzbzq() { // from class: com.google.android.gms.internal.ads.zzbdr
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzq
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    if (queryLocalInterface instanceof zzbdt) {
                        return (zzbdt) queryLocalInterface;
                    }
                    return new zzbdt(obj);
                }
            })).zze(zzbtaVar);
        } catch (RemoteException e) {
            zzbzo.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
        } catch (zzbzr e2) {
            zzbzo.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
        }
    }
}
