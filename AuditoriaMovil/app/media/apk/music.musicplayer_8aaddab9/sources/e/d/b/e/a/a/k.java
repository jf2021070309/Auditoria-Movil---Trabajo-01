package e.d.b.e.a.a;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class k extends j<ParcelFileDescriptor> {
    public k(o oVar, e.d.b.e.a.g.n<ParcelFileDescriptor> nVar) {
        super(oVar, nVar);
    }

    @Override // e.d.b.e.a.a.j, e.d.b.e.a.c.m0
    public final void f0(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f6821b.f6876e.a();
        o.a.a(4, "onGetChunkFileDescriptor", new Object[0]);
        this.a.b((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
