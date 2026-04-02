package e.d.b.e.a.g;

import java.util.concurrent.CountDownLatch;
/* loaded from: classes2.dex */
public final class s implements c, b {
    public final CountDownLatch a = new CountDownLatch(1);

    public /* synthetic */ s(byte[] bArr) {
    }

    @Override // e.d.b.e.a.g.b
    public final void onFailure(Exception exc) {
        this.a.countDown();
    }

    @Override // e.d.b.e.a.g.c
    public final void onSuccess(Object obj) {
        this.a.countDown();
    }
}
