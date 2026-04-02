package i.a.g2;

import ch.qos.logback.core.CoreConstants;
import i.a.i2.q;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes2.dex */
public class d<E> extends a<E> {

    /* renamed from: c  reason: collision with root package name */
    public final int f8991c;

    /* renamed from: d  reason: collision with root package name */
    public final ReentrantLock f8992d;

    /* renamed from: e  reason: collision with root package name */
    public Object[] f8993e;

    /* renamed from: f  reason: collision with root package name */
    public int f8994f;
    private volatile /* synthetic */ int size;

    public d(int i2, e eVar, h.o.b.l<? super E, h.k> lVar) {
        super(lVar);
        this.f8991c = i2;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(e.a.d.a.a.f("ArrayChannel capacity must be at least 1, but ", i2, " was specified").toString());
        }
        this.f8992d = new ReentrantLock();
        int min = Math.min(i2, 8);
        Object[] objArr = new Object[min];
        q qVar = b.a;
        h.o.c.j.e(objArr, "<this>");
        Arrays.fill(objArr, 0, min, qVar);
        this.f8993e = objArr;
        this.size = 0;
    }

    @Override // i.a.g2.c
    public String c() {
        StringBuilder y = e.a.d.a.a.y("(buffer:capacity=");
        y.append(this.f8991c);
        y.append(",size=");
        y.append(this.size);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }

    @Override // i.a.g2.a
    public Object f() {
        ReentrantLock reentrantLock = this.f8992d;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                Object d2 = d();
                if (d2 == null) {
                    d2 = b.f8989b;
                }
                return d2;
            }
            Object[] objArr = this.f8993e;
            int i3 = this.f8994f;
            Object obj = objArr[i3];
            l lVar = null;
            objArr[i3] = null;
            this.size = i2 - 1;
            Object obj2 = b.f8989b;
            boolean z = false;
            if (i2 == this.f8991c) {
                l lVar2 = null;
                while (true) {
                    l e2 = e();
                    if (e2 == null) {
                        lVar = lVar2;
                        break;
                    } else if (e2.q(null) != null) {
                        obj2 = e2.p();
                        lVar = e2;
                        z = true;
                        break;
                    } else {
                        lVar2 = e2;
                    }
                }
            }
            if (obj2 != b.f8989b && !(obj2 instanceof h)) {
                this.size = i2;
                Object[] objArr2 = this.f8993e;
                objArr2[(this.f8994f + i2) % objArr2.length] = obj2;
            }
            this.f8994f = (this.f8994f + 1) % this.f8993e.length;
            if (z) {
                h.o.c.j.c(lVar);
                lVar.o();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
