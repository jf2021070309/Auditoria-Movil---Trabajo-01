package e.d.b.e.a.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class q0 extends f0 implements b {
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.d.b.e.a.c.b
    public final void o(String str, Bundle bundle, d dVar) throws RemoteException {
        Parcel s0 = s0();
        s0.writeString(str);
        h0.b(s0, bundle);
        s0.writeStrongBinder(dVar);
        R0(2, s0);
    }
}
