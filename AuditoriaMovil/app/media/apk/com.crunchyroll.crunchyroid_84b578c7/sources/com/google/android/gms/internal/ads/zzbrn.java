package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbrn extends RemoteCreator {
    public zzbrn() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzbrt) {
            return (zzbrt) queryLocalInterface;
        }
        return new zzbrr(iBinder);
    }

    public final zzbrq zza(Activity activity) {
        zzbrq zzbroVar;
        try {
            IBinder zze = ((zzbrt) getRemoteCreatorInstance(activity)).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzbrq) {
                zzbroVar = (zzbrq) queryLocalInterface;
            } else {
                zzbroVar = new zzbro(zze);
            }
            return zzbroVar;
        } catch (RemoteException e) {
            zzbzo.zzk("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzbzo.zzk("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
