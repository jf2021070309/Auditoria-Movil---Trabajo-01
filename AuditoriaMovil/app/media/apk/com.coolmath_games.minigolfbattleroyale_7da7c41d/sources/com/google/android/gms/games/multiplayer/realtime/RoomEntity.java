package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public final class RoomEntity extends GamesDowngradeableSafeParcel {
    public static final Parcelable.Creator<RoomEntity> CREATOR = new zza();

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    static final class zza extends zzc {
        zza() {
        }

        @Override // com.google.android.gms.games.multiplayer.realtime.zzc
        public final RoomEntity zzf(Parcel parcel) {
            if (RoomEntity.zzb(RoomEntity.zzi()) || RoomEntity.canUnparcelSafely(RoomEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            return new RoomEntity();
        }

        @Override // com.google.android.gms.games.multiplayer.realtime.zzc, android.os.Parcelable.Creator
        public final /* synthetic */ RoomEntity createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (!shouldDowngrade()) {
            SafeParcelWriter.finishObjectHeader(parcel, SafeParcelWriter.beginObjectHeader(parcel));
            return;
        }
        parcel.writeString("unsupported");
        parcel.writeString("unsupported");
        parcel.writeLong(0L);
        parcel.writeInt(0);
        parcel.writeString("unsupported");
        parcel.writeInt(-1);
        parcel.writeBundle(null);
        parcel.writeInt(0);
    }

    static /* synthetic */ Integer zzi() {
        return getUnparcelClientVersion();
    }
}
