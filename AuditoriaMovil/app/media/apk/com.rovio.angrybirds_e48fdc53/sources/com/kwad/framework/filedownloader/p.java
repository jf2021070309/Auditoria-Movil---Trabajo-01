package com.kwad.framework.filedownloader;

import android.os.IBinder;
import android.os.RemoteException;
import com.kwad.framework.filedownloader.c.a;
import com.kwad.framework.filedownloader.c.b;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
/* loaded from: classes.dex */
final class p extends com.kwad.framework.filedownloader.services.a<a, com.kwad.framework.filedownloader.c.b> {

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class a extends a.AbstractBinderC0230a {
        protected a() {
        }

        @Override // com.kwad.framework.filedownloader.c.a
        public final void q(MessageSnapshot messageSnapshot) {
            com.kwad.framework.filedownloader.message.e.vj().s(messageSnapshot);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Class<?> cls) {
        super(cls);
    }

    private static com.kwad.framework.filedownloader.c.b a(IBinder iBinder) {
        return b.a.a(iBinder);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.framework.filedownloader.c.b bVar, a aVar) {
        bVar.a(aVar);
    }

    private static a tV() {
        return new a();
    }

    @Override // com.kwad.framework.filedownloader.services.a
    public final /* bridge */ /* synthetic */ void a(com.kwad.framework.filedownloader.c.b bVar, a aVar) {
        a2(bVar, aVar);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, com.kwad.framework.filedownloader.d.b bVar, boolean z3) {
        if (isConnected()) {
            try {
                vu().b(str, str2, z, i, i2, i3, z2, bVar, z3);
                return true;
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
        }
        return com.kwad.framework.filedownloader.f.a.h(str, str2, z);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean aY(int i) {
        if (isConnected()) {
            try {
                return vu().aY(i);
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
        }
        return com.kwad.framework.filedownloader.f.a.aY(i);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final byte aZ(int i) {
        if (isConnected()) {
            try {
                return vu().aZ(i);
            } catch (RemoteException e) {
                e.printStackTrace();
                return (byte) 0;
            }
        }
        return com.kwad.framework.filedownloader.f.a.aZ(i);
    }

    @Override // com.kwad.framework.filedownloader.services.a
    public final /* synthetic */ com.kwad.framework.filedownloader.c.b b(IBinder iBinder) {
        return a(iBinder);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean ba(int i) {
        if (isConnected()) {
            try {
                return vu().ba(i);
            } catch (RemoteException e) {
                e.printStackTrace();
                return false;
            }
        }
        return com.kwad.framework.filedownloader.f.a.ba(i);
    }

    @Override // com.kwad.framework.filedownloader.services.a
    public final /* synthetic */ a tW() {
        return tV();
    }
}
