package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbgl extends RemoteCreator {
    @VisibleForTesting
    public zzbgl() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof zzbey) {
            return (zzbey) queryLocalInterface;
        }
        return new zzbew(iBinder);
    }

    public final zzbev zza(View view, HashMap hashMap, HashMap hashMap2) {
        zzbev zzbetVar;
        try {
            IBinder zze = ((zzbey) getRemoteCreatorInstance(view.getContext())).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(hashMap), ObjectWrapper.wrap(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof zzbev) {
                zzbetVar = (zzbev) queryLocalInterface;
            } else {
                zzbetVar = new zzbet(zze);
            }
            return zzbetVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzbzo.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
