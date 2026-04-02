package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new a();
    public final byte[] a;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<WrappedParcelable> {
        @Override // android.os.Parcelable.Creator
        public WrappedParcelable createFromParcel(Parcel parcel) {
            return new WrappedParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public WrappedParcelable[] newArray(int i2) {
            return new WrappedParcelable[i2];
        }
    }

    public WrappedParcelable(Parcel parcel) {
        this.a = parcel.createByteArray();
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.a = marshallParcelable(parcelable);
    }

    public WrappedParcelable(byte[] bArr) {
        this.a = bArr;
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] bArr = this.a;
        if (bArr != null) {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            Parcelable readParcelable = obtain.readParcelable(classLoader);
            obtain.recycle();
            return readParcelable;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(this.a);
    }
}
