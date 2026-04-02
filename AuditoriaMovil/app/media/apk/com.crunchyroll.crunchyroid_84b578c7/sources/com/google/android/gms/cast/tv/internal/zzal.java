package com.google.android.gms.cast.tv.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.tv.CastLaunchRequest;
import com.google.android.gms.cast.tv.CastReceiverOptions;
import com.google.android.gms.cast.tv.SenderInfo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.cast_tv.zzes;
import com.google.android.gms.internal.cast_tv.zzey;
import com.google.android.gms.internal.cast_tv.zzfe;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzal extends com.google.android.gms.internal.cast_tv.zzb implements zzam {
    public zzal() {
        super("com.google.android.gms.cast.tv.internal.ICastTvDynamiteModule");
    }

    public static zzam asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.tv.internal.ICastTvDynamiteModule");
        if (queryLocalInterface instanceof zzam) {
            return (zzam) queryLocalInterface;
        }
        return new zzak(iBinder);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzap zzanVar;
        switch (i) {
            case 1:
                com.google.android.gms.internal.cast_tv.zzc.zzc(parcel);
                broadcastReceiverContextStartedIntent(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzey) com.google.android.gms.internal.cast_tv.zzc.zza(parcel, zzey.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.internal.cast_tv.zzc.zzc(parcel);
                com.google.android.gms.internal.cast_tv.zzr createReceiverMediaControlChannelImpl = createReceiverMediaControlChannelImpl(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.internal.cast_tv.zzn.zzb(parcel.readStrongBinder()), (CastReceiverOptions) com.google.android.gms.internal.cast_tv.zzc.zza(parcel, CastReceiverOptions.CREATOR));
                parcel2.writeNoException();
                com.google.android.gms.internal.cast_tv.zzc.zzf(parcel2, createReceiverMediaControlChannelImpl);
                return true;
            case 3:
                com.google.android.gms.internal.cast_tv.zzf zze = com.google.android.gms.internal.cast_tv.zze.zze(parcel.readStrongBinder());
                com.google.android.gms.internal.cast_tv.zzc.zzc(parcel);
                com.google.android.gms.internal.cast_tv.zzi createReceiverCacChannelImpl = createReceiverCacChannelImpl(zze);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast_tv.zzc.zzf(parcel2, createReceiverCacChannelImpl);
                return true;
            case 4:
                com.google.android.gms.internal.cast_tv.zzc.zzc(parcel);
                SenderInfo parseSenderInfo = parseSenderInfo((zzfe) com.google.android.gms.internal.cast_tv.zzc.zza(parcel, zzfe.CREATOR));
                parcel2.writeNoException();
                com.google.android.gms.internal.cast_tv.zzc.zze(parcel2, parseSenderInfo);
                return true;
            case 5:
                com.google.android.gms.internal.cast_tv.zzc.zzc(parcel);
                CastLaunchRequest parseCastLaunchRequest = parseCastLaunchRequest((zzes) com.google.android.gms.internal.cast_tv.zzc.zza(parcel, zzes.CREATOR));
                parcel2.writeNoException();
                com.google.android.gms.internal.cast_tv.zzc.zze(parcel2, parseCastLaunchRequest);
                return true;
            case 6:
                com.google.android.gms.internal.cast_tv.zzc.zzc(parcel);
                CastLaunchRequest parseCastLaunchRequestFromLaunchIntent = parseCastLaunchRequestFromLaunchIntent((Intent) com.google.android.gms.internal.cast_tv.zzc.zza(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                com.google.android.gms.internal.cast_tv.zzc.zze(parcel2, parseCastLaunchRequestFromLaunchIntent);
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzanVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.tv.internal.IUmaEventSink");
                    if (queryLocalInterface instanceof zzap) {
                        zzanVar = (zzap) queryLocalInterface;
                    } else {
                        zzanVar = new zzan(readStrongBinder);
                    }
                }
                com.google.android.gms.internal.cast_tv.zzc.zzc(parcel);
                setUmaEventSink(zzanVar);
                parcel2.writeNoException();
                return true;
            case 8:
                onWargInfoReceived();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
