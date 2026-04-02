package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public final class ParticipantEntity extends GamesDowngradeableSafeParcel {
    public static final Parcelable.Creator<ParticipantEntity> CREATOR = new zza();

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    /* loaded from: classes.dex */
    static final class zza extends com.google.android.gms.games.multiplayer.zza {
        zza() {
        }

        @Override // com.google.android.gms.games.multiplayer.zza
        public final ParticipantEntity zze(Parcel parcel) {
            if (ParticipantEntity.zzb(ParticipantEntity.zzi()) || ParticipantEntity.canUnparcelSafely(ParticipantEntity.class.getCanonicalName())) {
                return super.createFromParcel(parcel);
            }
            return new ParticipantEntity();
        }

        @Override // com.google.android.gms.games.multiplayer.zza, android.os.Parcelable.Creator
        public final /* synthetic */ ParticipantEntity createFromParcel(Parcel parcel) {
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
        parcel.writeString(null);
        parcel.writeString(null);
        parcel.writeInt(0);
        parcel.writeString("unsupported");
        parcel.writeInt(0);
        parcel.writeInt(0);
    }

    static /* synthetic */ Integer zzi() {
        return getUnparcelClientVersion();
    }
}
