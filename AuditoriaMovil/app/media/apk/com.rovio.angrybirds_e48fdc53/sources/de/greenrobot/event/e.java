package de.greenrobot.event;
/* loaded from: classes4.dex */
final class e {
    private d a;
    private d b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(d dVar) {
        if (dVar == null) {
            throw new NullPointerException("null cannot be enqueued");
        }
        if (this.b != null) {
            this.b.c = dVar;
            this.b = dVar;
        } else if (this.a == null) {
            this.b = dVar;
            this.a = dVar;
        } else {
            throw new IllegalStateException("Head present, but no tail");
        }
        notifyAll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized d a() {
        d dVar;
        dVar = this.a;
        if (this.a != null) {
            this.a = this.a.c;
            if (this.a == null) {
                this.b = null;
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized d a(int i) {
        if (this.a == null) {
            wait(i);
        }
        return a();
    }
}
