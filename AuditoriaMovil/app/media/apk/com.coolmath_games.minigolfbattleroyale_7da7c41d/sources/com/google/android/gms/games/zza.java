package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes.dex */
public final class zza extends com.google.android.gms.games.internal.zzb implements CurrentPlayerInfo {
    public static final Parcelable.Creator<zza> CREATOR = new zzc();
    private final int zzf;

    public zza(CurrentPlayerInfo currentPlayerInfo) {
        this.zzf = currentPlayerInfo.getFriendsListVisibilityStatus();
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ CurrentPlayerInfo freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public zza(int i) {
        this.zzf = i;
    }

    @Override // com.google.android.gms.games.CurrentPlayerInfo
    public final int getFriendsListVisibilityStatus() {
        return this.zzf;
    }

    public final int hashCode() {
        return zza(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(CurrentPlayerInfo currentPlayerInfo) {
        return Objects.hashCode(Integer.valueOf(currentPlayerInfo.getFriendsListVisibilityStatus()));
    }

    public final boolean equals(Object obj) {
        return zza(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(CurrentPlayerInfo currentPlayerInfo, Object obj) {
        if (obj instanceof CurrentPlayerInfo) {
            return obj == currentPlayerInfo || ((CurrentPlayerInfo) obj).getFriendsListVisibilityStatus() == currentPlayerInfo.getFriendsListVisibilityStatus();
        }
        return false;
    }

    public final String toString() {
        return zzb(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzb(CurrentPlayerInfo currentPlayerInfo) {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(currentPlayerInfo);
        stringHelper.add("FriendsListVisibilityStatus", Integer.valueOf(currentPlayerInfo.getFriendsListVisibilityStatus()));
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getFriendsListVisibilityStatus());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
