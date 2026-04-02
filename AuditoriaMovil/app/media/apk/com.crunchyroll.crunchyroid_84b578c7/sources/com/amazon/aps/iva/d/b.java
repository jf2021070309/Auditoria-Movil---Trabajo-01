package com.amazon.aps.iva.d;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.d.a;
/* compiled from: ResultReceiver.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public com.amazon.aps.iva.d.a b;

    /* compiled from: ResultReceiver.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    /* compiled from: ResultReceiver.java */
    /* renamed from: com.amazon.aps.iva.d.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class BinderC0187b extends a.AbstractBinderC0185a {
        public BinderC0187b() {
        }
    }

    public b(Parcel parcel) {
        com.amazon.aps.iva.d.a c0186a;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = a.AbstractBinderC0185a.a;
        if (readStrongBinder == null) {
            c0186a = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(com.amazon.aps.iva.d.a.d);
            if (queryLocalInterface != null && (queryLocalInterface instanceof com.amazon.aps.iva.d.a)) {
                c0186a = (com.amazon.aps.iva.d.a) queryLocalInterface;
            } else {
                c0186a = new a.AbstractBinderC0185a.C0186a(readStrongBinder);
            }
        }
        this.b = c0186a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.b == null) {
                this.b = new BinderC0187b();
            }
            parcel.writeStrongBinder(this.b.asBinder());
        }
    }

    public void a(int i, Bundle bundle) {
    }
}
