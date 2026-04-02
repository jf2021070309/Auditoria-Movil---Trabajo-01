package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1;

import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
final class l {
    private final CountDownLatch a = new CountDownLatch(1);
    private long b = -1;
    private long c = -1;

    l() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.c == -1) {
            long j = this.b;
            if (j != -1) {
                this.c = j - 1;
                this.a.countDown();
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.c != -1 || this.b == -1) {
            throw new IllegalStateException();
        }
        this.c = System.nanoTime();
        this.a.countDown();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.b != -1) {
            throw new IllegalStateException();
        }
        this.b = System.nanoTime();
    }
}
