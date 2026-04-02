package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
/* loaded from: classes2.dex */
public final class zzw implements ao {
    private final IBinder a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzw(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // com.google.firebase.iid.ao
    public final void send(Message message) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
