package com.google.android.gms.games.internal;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaf extends com.google.android.gms.internal.games.zzb implements zzac {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.IGamesService");
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzb(IronSourceConstants.errorCode_biddingDataException, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zzb(IronSourceConstants.errorCode_isReadyException, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final String zzbe() throws RemoteException {
        Parcel zza = zza(IronSourceConstants.errorCode_loadInProgress, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Bundle getConnectionHint() throws RemoteException {
        Parcel zza = zza(IronSourceConstants.errorCode_showInProgress, zza());
        Bundle bundle = (Bundle) com.google.android.gms.internal.games.zzd.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzd.zza(zza, bundle);
        zzb(IronSourceConstants.errorCode_loadException, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzbd() throws RemoteException {
        zzb(IronSourceConstants.errorCode_showFailed, zza());
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final String zzai() throws RemoteException {
        Parcel zza = zza(IronSourceConstants.errorCode_initSuccess, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final String zzbf() throws RemoteException {
        Parcel zza = zza(5012, zza());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final DataHolder zzbg() throws RemoteException {
        Parcel zza = zza(5013, zza());
        DataHolder dataHolder = (DataHolder) com.google.android.gms.internal.games.zzd.zza(zza, DataHolder.CREATOR);
        zza.recycle();
        return dataHolder;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, int i, boolean z, boolean z2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeInt(i);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z2);
        zzb(5015, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        zzb(5019, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(zzy zzyVar, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        zzb(5020, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, Bundle bundle, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        com.google.android.gms.internal.games.zzd.zza(zza, bundle);
        zza.writeInt(i);
        zza.writeInt(i2);
        zzb(5021, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(str);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzd.zza(zza, bundle);
        zzb(5023, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(zzy zzyVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(str);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzd.zza(zza, bundle);
        zzb(5024, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzd.zza(zza, bundle);
        zzb(5025, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(zzy zzyVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zzb(5026, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final DataHolder zzbh() throws RemoteException {
        Parcel zza = zza(5502, zza());
        DataHolder dataHolder = (DataHolder) com.google.android.gms.internal.games.zzd.zza(zza, DataHolder.CREATOR);
        zza.recycle();
        return dataHolder;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        zzb(GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(zzy zzyVar, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        zzb(GamesStatusCodes.STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(str);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        zzb(GamesStatusCodes.STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, long j, String str2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(str);
        zza.writeLong(j);
        zza.writeString(str2);
        zzb(GamesStatusCodes.STATUS_INVALID_REAL_TIME_ROOM_ID, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(zzy zzyVar, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzd.zza(zza, bundle);
        zzb(GamesStatusCodes.STATUS_PARTICIPANT_NOT_CONNECTED, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, String str2, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeInt(i);
        zza.writeInt(i2);
        zzb(8001, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzc(zzy zzyVar, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        zzb(8027, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zzao() throws RemoteException {
        Parcel zza = zza(GamesStatusCodes.STATUS_VIDEO_STORAGE_ERROR, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(zza, Intent.CREATOR);
        zza.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zzaq() throws RemoteException {
        Parcel zza = zza(9005, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(zza, Intent.CREATOR);
        zza.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zzar() throws RemoteException {
        Parcel zza = zza(9010, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(zza, Intent.CREATOR);
        zza.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zzbi() throws RemoteException {
        Parcel zza = zza(9012, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(zza, Intent.CREATOR);
        zza.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, int i, boolean z, boolean z2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(str);
        zza.writeInt(i);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z2);
        zzb(9020, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zza(String str, boolean z, boolean z2, int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z2);
        zza.writeInt(i);
        Parcel zza2 = zza(12001, zza);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(zza2, Intent.CREATOR);
        zza2.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzd(zzy zzyVar, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        zzb(12002, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(str);
        com.google.android.gms.internal.games.zzd.zza(zza, snapshotMetadataChangeEntity);
        com.google.android.gms.internal.games.zzd.zza(zza, contents);
        zzb(12007, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(Contents contents) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, contents);
        zzb(12019, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(str);
        zzb(12020, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, String str2, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.games.zzd.zza(zza, snapshotMetadataChangeEntity);
        com.google.android.gms.internal.games.zzd.zza(zza, contents);
        zzb(12033, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final int zzat() throws RemoteException {
        Parcel zza = zza(12035, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final int zzav() throws RemoteException {
        Parcel zza = zza(12036, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zze(zzy zzyVar, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        zzb(12016, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, boolean z, String[] strArr) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        zza.writeStringArray(strArr);
        zzb(12031, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(String str, int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        zzb(12017, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(zzy zzyVar, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(str);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        zzb(13006, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, String str, boolean z, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeString(str);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        zza.writeInt(i);
        zzb(15001, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzaa zzaaVar, long j) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzaaVar);
        zza.writeLong(j);
        zzb(15501, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zza(PlayerEntity playerEntity) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, playerEntity);
        Parcel zza2 = zza(15503, zza);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(zza2, Intent.CREATOR);
        zza2.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzf(zzy zzyVar, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        com.google.android.gms.internal.games.zzd.writeBoolean(zza, z);
        zzb(17001, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zzb(String str, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(i2);
        Parcel zza2 = zza(18001, zza);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(zza2, Intent.CREATOR);
        zza2.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zzbj() throws RemoteException {
        Parcel zza = zza(19002, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(zza, Intent.CREATOR);
        zza.recycle();
        return intent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzc(zzy zzyVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zzb(21007, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeInt(i);
        zzb(22016, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zza(zzy zzyVar, long j) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zza.writeLong(j);
        zzb(22026, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzb(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzb(22027, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final void zzd(zzy zzyVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzd.zza(zza, zzyVar);
        zzb(22028, zza);
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final boolean zzaz() throws RemoteException {
        Parcel zza = zza(22030, zza());
        boolean zza2 = com.google.android.gms.internal.games.zzd.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final PendingIntent zzbk() throws RemoteException {
        Parcel zza = zza(25015, zza());
        PendingIntent pendingIntent = (PendingIntent) com.google.android.gms.internal.games.zzd.zza(zza, PendingIntent.CREATOR);
        zza.recycle();
        return pendingIntent;
    }

    @Override // com.google.android.gms.games.internal.zzac
    public final Intent zza(String str, String str2, String str3) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zza2 = zza(25016, zza);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzd.zza(zza2, Intent.CREATOR);
        zza2.recycle();
        return intent;
    }
}
