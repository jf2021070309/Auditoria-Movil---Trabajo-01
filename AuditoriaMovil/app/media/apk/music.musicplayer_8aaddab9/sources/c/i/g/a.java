package c.i.g;
/* loaded from: classes.dex */
public final class a {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public InterfaceC0036a f2067b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2068c;

    /* renamed from: c.i.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0036a {
        void a();
    }

    public void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.f2068c = true;
            InterfaceC0036a interfaceC0036a = this.f2067b;
            if (interfaceC0036a != null) {
                try {
                    interfaceC0036a.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f2068c = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f2068c = false;
                notifyAll();
            }
        }
    }

    public void b(InterfaceC0036a interfaceC0036a) {
        synchronized (this) {
            while (this.f2068c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f2067b == interfaceC0036a) {
                return;
            }
            this.f2067b = interfaceC0036a;
            if (this.a) {
                interfaceC0036a.a();
            }
        }
    }
}
