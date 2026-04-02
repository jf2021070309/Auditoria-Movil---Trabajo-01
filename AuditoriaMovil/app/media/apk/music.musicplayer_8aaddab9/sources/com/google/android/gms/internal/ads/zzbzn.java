package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* loaded from: classes.dex */
public final class zzbzn extends RemoteCreator<zzbzt> {
    public zzbzn() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* bridge */ /* synthetic */ zzbzt getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbzt ? (zzbzt) queryLocalInterface : new zzbzr(iBinder);
    }

    public final zzbzq zza(Activity activity) {
        try {
            IBinder zze = getRemoteCreatorInstance(activity).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzbzq ? (zzbzq) queryLocalInterface : new zzbzo(zze);
        } catch (RemoteException e2) {
            zzcgt.zzj("Could not create remote AdOverlay.", e2);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e3) {
            zzcgt.zzj("Could not create remote AdOverlay.", e3);
            return null;
        }
    }
}
