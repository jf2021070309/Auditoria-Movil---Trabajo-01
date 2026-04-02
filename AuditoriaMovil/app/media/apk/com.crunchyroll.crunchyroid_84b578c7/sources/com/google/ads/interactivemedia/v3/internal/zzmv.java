package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.concurrent.Executor;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzmv extends RemoteCreator {
    private static final zzmv zza = new zzmv();

    private zzmv() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    public static zzmy zza(Context context, Executor executor, zzm zzmVar) {
        zzmy zzmyVar = null;
        if (zzmVar.zzh() && GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12800000) == 0) {
            zzmyVar = zza.zzb(context, executor, zzmVar);
        }
        if (zzmyVar == null) {
            return new zzmu(context, executor, zzmVar);
        }
        return zzmyVar;
    }

    private final zzmy zzb(Context context, Executor executor, zzm zzmVar) {
        zzmy zzmwVar;
        try {
            IBinder zze = ((zzmz) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(executor), zzmVar.zzav());
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            if (queryLocalInterface instanceof zzmy) {
                zzmwVar = (zzmy) queryLocalInterface;
            } else {
                zzmwVar = new zzmw(zze);
            }
            return zzmwVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException | IllegalArgumentException | LinkageError unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        if (queryLocalInterface instanceof zzmz) {
            return (zzmz) queryLocalInterface;
        }
        return new zzmz(iBinder);
    }
}
