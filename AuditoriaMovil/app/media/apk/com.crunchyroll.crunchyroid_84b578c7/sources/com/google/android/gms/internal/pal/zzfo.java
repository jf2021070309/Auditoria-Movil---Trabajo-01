package com.google.android.gms.internal.pal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzfo extends RemoteCreator {
    private static final zzfo zza = new zzfo();

    private zzfo() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    @Deprecated
    public static zzfr zza(String str, Context context, boolean z, boolean z2) {
        zzfr zzfrVar;
        if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12800000) == 0) {
            zzfrVar = zza.zzb("h.3.2.2/n.android.3.2.2", context, false);
        } else {
            zzfrVar = null;
        }
        if (zzfrVar == null) {
            return new zzfn("h.3.2.2/n.android.3.2.2", context, false);
        }
        return zzfrVar;
    }

    private final zzfr zzb(String str, Context context, boolean z) {
        zzfr zzfpVar;
        try {
            IBinder zze = ((zzfs) getRemoteCreatorInstance(context)).zze("h.3.2.2/n.android.3.2.2", ObjectWrapper.wrap(context));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            if (queryLocalInterface instanceof zzfr) {
                zzfpVar = (zzfr) queryLocalInterface;
            } else {
                zzfpVar = new zzfp(zze);
            }
            return zzfpVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException | LinkageError unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        if (queryLocalInterface instanceof zzfs) {
            return (zzfs) queryLocalInterface;
        }
        return new zzfs(iBinder);
    }
}
