package j.i0.i;

import j.i0.i.g;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes2.dex */
public class n extends j.i0.b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f9447b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u f9448c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g.C0209g f9449d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g.C0209g c0209g, String str, Object[] objArr, boolean z, u uVar) {
        super(str, objArr);
        this.f9449d = c0209g;
        this.f9447b = z;
        this.f9448c = uVar;
    }

    @Override // j.i0.b
    public void a() {
        q[] qVarArr;
        long j2;
        g.C0209g c0209g = this.f9449d;
        boolean z = this.f9447b;
        u uVar = this.f9448c;
        synchronized (g.this.w) {
            synchronized (g.this) {
                int a = g.this.u.a();
                if (z) {
                    u uVar2 = g.this.u;
                    uVar2.a = 0;
                    Arrays.fill(uVar2.f9490b, 0);
                }
                u uVar3 = g.this.u;
                Objects.requireNonNull(uVar3);
                int i2 = 0;
                while (true) {
                    boolean z2 = true;
                    if (i2 >= 10) {
                        break;
                    }
                    if (((1 << i2) & uVar.a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        uVar3.b(i2, uVar.f9490b[i2]);
                    }
                    i2++;
                }
                int a2 = g.this.u.a();
                qVarArr = null;
                if (a2 == -1 || a2 == a) {
                    j2 = 0;
                } else {
                    j2 = a2 - a;
                    if (!g.this.f9400d.isEmpty()) {
                        qVarArr = (q[]) g.this.f9400d.values().toArray(new q[g.this.f9400d.size()]);
                    }
                }
            }
            try {
                g gVar = g.this;
                gVar.w.a(gVar.u);
            } catch (IOException unused) {
                g.a(g.this);
            }
        }
        if (qVarArr != null) {
            for (q qVar : qVarArr) {
                synchronized (qVar) {
                    qVar.f9460b += j2;
                    if (j2 > 0) {
                        qVar.notifyAll();
                    }
                }
            }
        }
        g.a.execute(new o(c0209g, "OkHttp %s settings", g.this.f9401e));
    }
}
