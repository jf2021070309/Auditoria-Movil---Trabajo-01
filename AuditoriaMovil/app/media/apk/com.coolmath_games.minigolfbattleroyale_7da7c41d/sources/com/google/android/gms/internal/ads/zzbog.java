package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbog extends RemoteCreator<zzbmo> {
    public zzbog() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* bridge */ /* synthetic */ zzbmo getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzbmo) {
            return (zzbmo) queryLocalInterface;
        }
        return new zzbmm(iBinder);
    }

    public final zzbml zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        zzbml zzbmjVar;
        try {
            IBinder zze = getRemoteCreatorInstance(context).zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(frameLayout), ObjectWrapper.wrap(frameLayout2), 213806000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof zzbml) {
                zzbmjVar = (zzbml) queryLocalInterface;
            } else {
                zzbmjVar = new zzbmj(zze);
            }
            return zzbmjVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcgt.zzj("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
