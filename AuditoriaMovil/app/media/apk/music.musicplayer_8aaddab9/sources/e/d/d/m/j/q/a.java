package e.d.d.m.j.q;
/* loaded from: classes.dex */
public class a implements d {
    public final d[] a;

    /* renamed from: b  reason: collision with root package name */
    public final b f7537b;

    public a(int i2, d... dVarArr) {
        this.a = dVarArr;
        this.f7537b = new b(i2);
    }

    @Override // e.d.d.m.j.q.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        d[] dVarArr;
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.a) {
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? this.f7537b.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
