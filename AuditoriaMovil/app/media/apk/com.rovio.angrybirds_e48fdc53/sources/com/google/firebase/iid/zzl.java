package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
/* loaded from: classes2.dex */
public class zzl implements Parcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new af();
    private Messenger a;
    private ao b;

    /* loaded from: classes2.dex */
    public static final class zza extends ClassLoader {
        @Override // java.lang.ClassLoader
        protected final Class<?> loadClass(String str, boolean z) {
            if ("com.google.android.gms.iid.MessengerCompat".equals(str)) {
                if (FirebaseInstanceId.d()) {
                    Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
                }
                return zzl.class;
            }
            return super.loadClass(str, z);
        }
    }

    public zzl(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a = new Messenger(iBinder);
        } else {
            this.b = new zzw(iBinder);
        }
    }

    public final void send(Message message) {
        if (this.a != null) {
            this.a.send(message);
        } else {
            this.b.send(message);
        }
    }

    private final IBinder a() {
        return this.a != null ? this.a.getBinder() : this.b.asBinder();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((zzl) obj).a());
        } catch (ClassCastException e) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.a != null) {
            parcel.writeStrongBinder(this.a.getBinder());
        } else {
            parcel.writeStrongBinder(this.b.asBinder());
        }
    }
}
