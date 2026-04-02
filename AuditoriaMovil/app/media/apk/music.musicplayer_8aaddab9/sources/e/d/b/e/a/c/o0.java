package e.d.b.e.a.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class o0 extends f0 implements p0 {
    public o0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    @Override // e.d.b.e.a.c.p0
    public final void b(Bundle bundle) throws RemoteException {
        Parcel s0 = s0();
        h0.b(s0, bundle);
        R0(3, s0);
    }

    @Override // e.d.b.e.a.c.p0
    public final void c(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel s0 = s0();
        h0.b(s0, bundle);
        h0.b(s0, bundle2);
        R0(2, s0);
    }

    @Override // e.d.b.e.a.c.p0
    public final void g0(Bundle bundle) throws RemoteException {
        Parcel s0 = s0();
        h0.b(s0, bundle);
        R0(4, s0);
    }
}
