package j.i0;
/* loaded from: classes2.dex */
public abstract class b implements Runnable {
    public final String a;

    public b(String str, Object... objArr) {
        this.a = c.m(str, objArr);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.a);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
