package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzavl extends zzatk implements zzavm {
    public zzavl() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzavt zzavrVar;
        switch (i) {
            case 2:
                zzbu zze = zze();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof zzavq) {
                        zzavq zzavqVar = (zzavq) queryLocalInterface;
                    }
                }
                zzatl.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzavrVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    if (queryLocalInterface2 instanceof zzavt) {
                        zzavrVar = (zzavt) queryLocalInterface2;
                    } else {
                        zzavrVar = new zzavr(readStrongBinder2);
                    }
                }
                zzatl.zzc(parcel);
                zzi(asInterface, zzavrVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzdn zzf = zzf();
                parcel2.writeNoException();
                zzatl.zzf(parcel2, zzf);
                return true;
            case 6:
                boolean zzg = zzatl.zzg(parcel);
                zzatl.zzc(parcel);
                zzg(zzg);
                parcel2.writeNoException();
                return true;
            case 7:
                zzdg zzb = zzdf.zzb(parcel.readStrongBinder());
                zzatl.zzc(parcel);
                zzh(zzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
