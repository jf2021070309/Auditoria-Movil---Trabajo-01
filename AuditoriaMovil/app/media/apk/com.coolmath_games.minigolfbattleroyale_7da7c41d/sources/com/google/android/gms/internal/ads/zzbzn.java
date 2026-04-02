package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbzn extends RemoteCreator<zzbzt> {
    public zzbzn() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* bridge */ /* synthetic */ zzbzt getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzbzt) {
            return (zzbzt) queryLocalInterface;
        }
        return new zzbzr(iBinder);
    }

    public final zzbzq zza(Activity activity) {
        zzbzq zzbzoVar;
        try {
            IBinder zze = getRemoteCreatorInstance(activity).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzbzq) {
                zzbzoVar = (zzbzq) queryLocalInterface;
            } else {
                zzbzoVar = new zzbzo(zze);
            }
            return zzbzoVar;
        } catch (RemoteException e) {
            zzcgt.zzj("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzcgt.zzj("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
