package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int f57b;

    /* renamed from: c  reason: collision with root package name */
    public int f58c;

    /* renamed from: d  reason: collision with root package name */
    public int f59d;

    /* renamed from: e  reason: collision with root package name */
    public int f60e;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }
    }

    public ParcelableVolumeInfo(int i2, int i3, int i4, int i5, int i6) {
        this.a = i2;
        this.f57b = i3;
        this.f58c = i4;
        this.f59d = i5;
        this.f60e = i6;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.a = parcel.readInt();
        this.f58c = parcel.readInt();
        this.f59d = parcel.readInt();
        this.f60e = parcel.readInt();
        this.f57b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.f58c);
        parcel.writeInt(this.f59d);
        parcel.writeInt(this.f60e);
        parcel.writeInt(this.f57b);
    }
}
