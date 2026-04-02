package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.data.DataBufferRef;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes.dex */
public class StockProfileImageRef extends DataBufferRef implements StockProfileImage {
    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    public String getImageUrl() {
        return getString(MessengerShareContentUtility.IMAGE_URL);
    }

    @Override // com.google.android.gms.games.internal.player.StockProfileImage
    public final Uri zzcd() {
        throw new NoSuchMethodError();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        throw new NoSuchMethodError();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.common.data.Freezable
    public /* synthetic */ StockProfileImage freeze() {
        throw new NoSuchMethodError();
    }
}
