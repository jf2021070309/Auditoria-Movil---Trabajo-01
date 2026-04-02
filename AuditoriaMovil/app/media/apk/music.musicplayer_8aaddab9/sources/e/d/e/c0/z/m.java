package e.d.e.c0.z;

import e.d.e.a0;
import e.d.e.u;
import e.d.e.v;
import e.d.e.z;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class m<T> extends z<T> {
    public final v<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.e.n<T> f7868b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.e.j f7869c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.e.d0.a<T> f7870d;

    /* renamed from: e  reason: collision with root package name */
    public final m<T>.b f7871e = new b(this, null);

    /* renamed from: f  reason: collision with root package name */
    public z<T> f7872f;

    /* loaded from: classes2.dex */
    public final class b implements u, e.d.e.m {
        public b(m mVar, a aVar) {
        }
    }

    public m(v<T> vVar, e.d.e.n<T> nVar, e.d.e.j jVar, e.d.e.d0.a<T> aVar, a0 a0Var) {
        this.a = vVar;
        this.f7868b = nVar;
        this.f7869c = jVar;
        this.f7870d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004b  */
    @Override // e.d.e.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T a(e.d.e.e0.a r4) throws java.io.IOException {
        /*
            r3 = this;
            e.d.e.n<T> r0 = r3.f7868b
            r1 = 0
            if (r0 != 0) goto L19
            e.d.e.z<T> r0 = r3.f7872f
            if (r0 == 0) goto La
            goto L14
        La:
            e.d.e.j r0 = r3.f7869c
            e.d.e.d0.a<T> r2 = r3.f7870d
            e.d.e.z r0 = r0.d(r1, r2)
            r3.f7872f = r0
        L14:
            java.lang.Object r4 = r0.a(r4)
            return r4
        L19:
            r4.g0()     // Catch: java.lang.NumberFormatException -> L28 java.io.IOException -> L2f e.d.e.e0.d -> L36 java.io.EOFException -> L3d
            r0 = 0
            e.d.e.z<e.d.e.o> r2 = e.d.e.c0.z.o.X     // Catch: java.io.EOFException -> L26 java.lang.NumberFormatException -> L28 java.io.IOException -> L2f e.d.e.e0.d -> L36
            java.lang.Object r4 = r2.a(r4)     // Catch: java.io.EOFException -> L26 java.lang.NumberFormatException -> L28 java.io.IOException -> L2f e.d.e.e0.d -> L36
            e.d.e.o r4 = (e.d.e.o) r4     // Catch: java.io.EOFException -> L26 java.lang.NumberFormatException -> L28 java.io.IOException -> L2f e.d.e.e0.d -> L36
            goto L43
        L26:
            r4 = move-exception
            goto L3f
        L28:
            r4 = move-exception
            e.d.e.w r0 = new e.d.e.w
            r0.<init>(r4)
            throw r0
        L2f:
            r4 = move-exception
            e.d.e.p r0 = new e.d.e.p
            r0.<init>(r4)
            throw r0
        L36:
            r4 = move-exception
            e.d.e.w r0 = new e.d.e.w
            r0.<init>(r4)
            throw r0
        L3d:
            r4 = move-exception
            r0 = 1
        L3f:
            if (r0 == 0) goto L58
            e.d.e.q r4 = e.d.e.q.a
        L43:
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r4 instanceof e.d.e.q
            if (r0 == 0) goto L4b
            return r1
        L4b:
            e.d.e.n<T> r0 = r3.f7868b
            e.d.e.d0.a<T> r1 = r3.f7870d
            java.lang.reflect.Type r1 = r1.f7896b
            e.d.e.c0.z.m<T>$b r2 = r3.f7871e
            java.lang.Object r4 = r0.a(r4, r1, r2)
            return r4
        L58:
            e.d.e.w r0 = new e.d.e.w
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.e.c0.z.m.a(e.d.e.e0.a):java.lang.Object");
    }

    @Override // e.d.e.z
    public void b(e.d.e.e0.c cVar, T t) throws IOException {
        v<T> vVar = this.a;
        if (vVar == null) {
            z<T> zVar = this.f7872f;
            if (zVar == null) {
                zVar = this.f7869c.d(null, this.f7870d);
                this.f7872f = zVar;
            }
            zVar.b(cVar, t);
        } else if (t == null) {
            cVar.y();
        } else {
            o.X.b(cVar, vVar.a(t, this.f7870d.f7896b, this.f7871e));
        }
    }
}
