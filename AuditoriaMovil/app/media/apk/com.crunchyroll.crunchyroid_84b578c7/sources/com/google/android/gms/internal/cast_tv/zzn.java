package com.google.android.gms.internal.cast_tv;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.tv.media.EditAudioTracksData;
import com.google.android.gms.cast.tv.media.EditTracksInfoData;
import com.google.android.gms.cast.tv.media.FetchItemsRequestData;
import com.google.android.gms.cast.tv.media.MediaResumeSessionRequestData;
import com.google.android.gms.cast.tv.media.QueueInsertRequestData;
import com.google.android.gms.cast.tv.media.QueueRemoveRequestData;
import com.google.android.gms.cast.tv.media.QueueReorderRequestData;
import com.google.android.gms.cast.tv.media.QueueUpdateRequestData;
import com.google.android.gms.cast.tv.media.SeekRequestData;
import com.google.android.gms.cast.tv.media.SetPlaybackRateRequestData;
import com.google.android.gms.cast.tv.media.StoreSessionRequestData;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzn extends zzb implements zzo {
    public zzn() {
        super("com.google.android.gms.cast.tv.media.internal.IReceiverMediaControlChannel");
    }

    public static zzo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.tv.media.internal.IReceiverMediaControlChannel");
        if (queryLocalInterface instanceof zzo) {
            return (zzo) queryLocalInterface;
        }
        return new zzm(iBinder);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                List zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeList(zzh);
                return true;
            case 3:
                MediaStatus mediaStatus = (MediaStatus) zzc.zza(parcel, MediaStatus.CREATOR);
                zzc.zzc(parcel);
                zzf(mediaStatus);
                parcel2.writeNoException();
                zzc.zze(parcel2, mediaStatus);
                return true;
            case 4:
                MediaStatus mediaStatus2 = (MediaStatus) zzc.zza(parcel, MediaStatus.CREATOR);
                zzc.zzc(parcel);
                zze(mediaStatus2);
                parcel2.writeNoException();
                zzc.zze(parcel2, mediaStatus2);
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzc.zzc(parcel);
                zzD(readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzeq zzb = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzm(parcel.readString(), (com.google.android.gms.cast.tv.media.zzz) zzc.zza(parcel, com.google.android.gms.cast.tv.media.zzz.CREATOR), zzb);
                parcel2.writeNoException();
                return true;
            case 7:
                zzeq zzb2 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzl(parcel.readString(), (com.google.android.gms.cast.tv.media.zzz) zzc.zza(parcel, com.google.android.gms.cast.tv.media.zzz.CREATOR), zzb2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzeq zzb3 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzB(parcel.readString(), (com.google.android.gms.cast.tv.media.zzz) zzc.zza(parcel, com.google.android.gms.cast.tv.media.zzz.CREATOR), zzb3);
                parcel2.writeNoException();
                return true;
            case 9:
                zzeq zzb4 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzw(parcel.readString(), (SeekRequestData) zzc.zza(parcel, SeekRequestData.CREATOR), zzb4);
                parcel2.writeNoException();
                return true;
            case 10:
                zzeq zzb5 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzA(parcel.readString(), (com.google.android.gms.cast.tv.media.zzz) zzc.zza(parcel, com.google.android.gms.cast.tv.media.zzz.CREATOR), zzb5);
                parcel2.writeNoException();
                return true;
            case 11:
                zzeq zzb6 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzi(parcel.readString(), (EditAudioTracksData) zzc.zza(parcel, EditAudioTracksData.CREATOR), zzb6);
                parcel2.writeNoException();
                return true;
            case 12:
                zzeq zzb7 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzj(parcel.readString(), (EditTracksInfoData) zzc.zza(parcel, EditTracksInfoData.CREATOR), zzb7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzeq zzb8 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzr(parcel.readString(), (QueueInsertRequestData) zzc.zza(parcel, QueueInsertRequestData.CREATOR), zzb8);
                parcel2.writeNoException();
                return true;
            case 14:
                zzeq zzb9 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzs(parcel.readString(), (QueueRemoveRequestData) zzc.zza(parcel, QueueRemoveRequestData.CREATOR), zzb9);
                parcel2.writeNoException();
                return true;
            case 15:
                zzeq zzb10 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzt(parcel.readString(), (QueueReorderRequestData) zzc.zza(parcel, QueueReorderRequestData.CREATOR), zzb10);
                parcel2.writeNoException();
                return true;
            case 16:
                zzeq zzb11 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzu(parcel.readString(), (QueueUpdateRequestData) zzc.zza(parcel, QueueUpdateRequestData.CREATOR), zzb11);
                parcel2.writeNoException();
                return true;
            case 17:
                zzeq zzb12 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzo(parcel.readString(), (com.google.android.gms.cast.tv.media.zzz) zzc.zza(parcel, com.google.android.gms.cast.tv.media.zzz.CREATOR), zzb12);
                parcel2.writeNoException();
                return true;
            case 18:
                zzeq zzb13 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzq(parcel.readString(), (com.google.android.gms.cast.tv.media.zze) zzc.zza(parcel, com.google.android.gms.cast.tv.media.zze.CREATOR), zzb13);
                parcel2.writeNoException();
                return true;
            case 19:
                zzeq zzb14 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzp(parcel.readString(), (FetchItemsRequestData) zzc.zza(parcel, FetchItemsRequestData.CREATOR), zzb14);
                parcel2.writeNoException();
                return true;
            case 20:
                zzeq zzb15 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzk(parcel.readString(), (MediaLoadRequestData) zzc.zza(parcel, MediaLoadRequestData.CREATOR), zzb15);
                parcel2.writeNoException();
                return true;
            case 21:
                zzeq zzb16 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzv(parcel.readString(), (MediaResumeSessionRequestData) zzc.zza(parcel, MediaResumeSessionRequestData.CREATOR), zzb16);
                parcel2.writeNoException();
                return true;
            case 22:
                zzeq zzb17 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzn(parcel.readString(), (com.google.android.gms.cast.tv.media.zzz) zzc.zza(parcel, com.google.android.gms.cast.tv.media.zzz.CREATOR), zzb17);
                parcel2.writeNoException();
                return true;
            case ConnectionResult.API_DISABLED /* 23 */:
                zzeq zzb18 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzC(parcel.readString(), (StoreSessionRequestData) zzc.zza(parcel, StoreSessionRequestData.CREATOR), zzb18);
                parcel2.writeNoException();
                return true;
            case 24:
                zzz zzg = zzg();
                parcel2.writeNoException();
                zzc.zze(parcel2, zzg);
                return true;
            case 25:
                String readString3 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList createTypedArrayList = parcel.createTypedArrayList(MediaTrack.CREATOR);
                ArrayList zzb19 = zzc.zzb(parcel);
                zzeq zzb20 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzx(readString3, readInt, createTypedArrayList, zzb19, zzb20);
                parcel2.writeNoException();
                return true;
            case 26:
                zzeq zzb21 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzz(parcel.readString(), (TextTrackStyle) zzc.zza(parcel, TextTrackStyle.CREATOR), zzb21);
                parcel2.writeNoException();
                return true;
            case 27:
                zzeq zzb22 = zzep.zzb(parcel.readStrongBinder());
                zzc.zzc(parcel);
                zzy(parcel.readString(), (SetPlaybackRateRequestData) zzc.zza(parcel, SetPlaybackRateRequestData.CREATOR), zzb22);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
