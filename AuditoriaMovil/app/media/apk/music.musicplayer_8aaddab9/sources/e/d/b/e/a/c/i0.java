package e.d.b.e.a.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
/* loaded from: classes2.dex */
public final class i0 extends f0 implements k0 {
    public i0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.d.b.e.a.c.k0
    public final void A0(String str, Bundle bundle, Bundle bundle2, m0 m0Var) throws RemoteException {
        Parcel s0 = s0();
        s0.writeString(str);
        h0.b(s0, bundle);
        h0.b(s0, bundle2);
        s0.writeStrongBinder(m0Var);
        R0(11, s0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.d.b.e.a.c.k0
    public final void D0(String str, List<Bundle> list, Bundle bundle, m0 m0Var) throws RemoteException {
        Parcel s0 = s0();
        s0.writeString(str);
        s0.writeTypedList(list);
        h0.b(s0, bundle);
        s0.writeStrongBinder(m0Var);
        R0(14, s0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.d.b.e.a.c.k0
    public final void U(String str, Bundle bundle, m0 m0Var) throws RemoteException {
        Parcel s0 = s0();
        s0.writeString(str);
        h0.b(s0, bundle);
        s0.writeStrongBinder(m0Var);
        R0(10, s0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.d.b.e.a.c.k0
    public final void Y(String str, Bundle bundle, Bundle bundle2, m0 m0Var) throws RemoteException {
        Parcel s0 = s0();
        s0.writeString(str);
        h0.b(s0, bundle);
        h0.b(s0, bundle2);
        s0.writeStrongBinder(m0Var);
        R0(6, s0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.d.b.e.a.c.k0
    public final void e0(String str, Bundle bundle, m0 m0Var) throws RemoteException {
        Parcel s0 = s0();
        s0.writeString(str);
        h0.b(s0, bundle);
        s0.writeStrongBinder(m0Var);
        R0(5, s0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.d.b.e.a.c.k0
    public final void h0(String str, Bundle bundle, Bundle bundle2, m0 m0Var) throws RemoteException {
        Parcel s0 = s0();
        s0.writeString(str);
        h0.b(s0, bundle);
        h0.b(s0, bundle2);
        s0.writeStrongBinder(m0Var);
        R0(7, s0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.d.b.e.a.c.k0
    public final void t0(String str, Bundle bundle, Bundle bundle2, m0 m0Var) throws RemoteException {
        Parcel s0 = s0();
        s0.writeString(str);
        h0.b(s0, bundle);
        h0.b(s0, bundle2);
        s0.writeStrongBinder(m0Var);
        R0(9, s0);
    }
}
