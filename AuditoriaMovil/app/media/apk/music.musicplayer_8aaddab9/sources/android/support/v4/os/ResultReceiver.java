package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b.a.b.b.a;
import java.util.Objects;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();
    public b.a.b.b.a a;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ResultReceiver[] newArray(int i2) {
            return new ResultReceiver[i2];
        }
    }

    /* loaded from: classes.dex */
    public class b extends a.AbstractBinderC0009a {
        public b() {
        }

        @Override // b.a.b.b.a
        public void P0(int i2, Bundle bundle) {
            Objects.requireNonNull(ResultReceiver.this);
            ResultReceiver.this.b(i2, bundle);
        }
    }

    public ResultReceiver(Parcel parcel) {
        b.a.b.b.a c0010a;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i2 = a.AbstractBinderC0009a.a;
        if (readStrongBinder == null) {
            c0010a = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            c0010a = (queryLocalInterface == null || !(queryLocalInterface instanceof b.a.b.b.a)) ? new a.AbstractBinderC0009a.C0010a(readStrongBinder) : (b.a.b.b.a) queryLocalInterface;
        }
        this.a = c0010a;
    }

    public void b(int i2, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new b();
            }
            parcel.writeStrongBinder(this.a.asBinder());
        }
    }
}
