package i.a.h2;

import ch.qos.logback.classic.Level;
/* loaded from: classes2.dex */
public final class s<T> extends i.a.h2.w.b<u> implements k<T>, b {
    private volatile /* synthetic */ Object _state;

    /* renamed from: d  reason: collision with root package name */
    public int f9037d;

    @h.m.i.a.e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public Object f9038b;

        /* renamed from: c  reason: collision with root package name */
        public Object f9039c;

        /* renamed from: d  reason: collision with root package name */
        public Object f9040d;

        /* renamed from: e  reason: collision with root package name */
        public Object f9041e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f9042f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ s<T> f9043g;

        /* renamed from: h  reason: collision with root package name */
        public int f9044h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s<T> sVar, h.m.d<? super a> dVar) {
            super(dVar);
            this.f9043g = sVar;
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f9042f = obj;
            this.f9044h |= Level.ALL_INT;
            return this.f9043g.a(null, this);
        }
    }

    public s(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
        if (h.o.c.j.a(r14, r15) != false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:14:0x003c, B:34:0x00a6, B:40:0x00b3, B:50:0x00d4, B:55:0x00eb, B:59:0x010f, B:61:0x0117, B:64:0x011f, B:58:0x010a, B:42:0x00b9, B:46:0x00c0, B:37:0x00ab, B:67:0x0124, B:68:0x0128, B:19:0x005a, B:22:0x006d, B:33:0x0095), top: B:74:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:14:0x003c, B:34:0x00a6, B:40:0x00b3, B:50:0x00d4, B:55:0x00eb, B:59:0x010f, B:61:0x0117, B:64:0x011f, B:58:0x010a, B:42:0x00b9, B:46:0x00c0, B:37:0x00ab, B:67:0x0124, B:68:0x0128, B:19:0x005a, B:22:0x006d, B:33:0x0095), top: B:74:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00e9 -> B:34:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0121 -> B:34:0x00a6). Please submit an issue!!! */
    @Override // i.a.h2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(i.a.h2.c<? super T> r14, h.m.d<? super h.k> r15) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.h2.s.a(i.a.h2.c, h.m.d):java.lang.Object");
    }

    @Override // i.a.h2.j, i.a.h2.c
    public Object b(T t, h.m.d<? super h.k> dVar) {
        if (t == null) {
            t = (T) i.a.h2.w.g.a;
        }
        g(null, t);
        return h.k.a;
    }

    @Override // i.a.h2.w.b
    public u d() {
        return new u();
    }

    @Override // i.a.h2.w.b
    public u[] e(int i2) {
        return new u[i2];
    }

    public final boolean g(Object obj, Object obj2) {
        int i2;
        Object obj3;
        i.a.i2.q qVar;
        synchronized (this) {
            Object obj4 = this._state;
            if (obj != null && !h.o.c.j.a(obj4, obj)) {
                return false;
            }
            if (h.o.c.j.a(obj4, obj2)) {
                return true;
            }
            this._state = obj2;
            int i3 = this.f9037d;
            if ((i3 & 1) != 0) {
                this.f9037d = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f9037d = i4;
            Object obj5 = this.a;
            while (true) {
                u[] uVarArr = (u[]) obj5;
                if (uVarArr != null) {
                    for (u uVar : uVarArr) {
                        if (uVar != null) {
                            while (true) {
                                Object obj6 = uVar._state;
                                if (obj6 != null && obj6 != (qVar = t.f9045b)) {
                                    i.a.i2.q qVar2 = t.a;
                                    if (obj6 == qVar2) {
                                        if (u.a.compareAndSet(uVar, obj6, qVar)) {
                                            break;
                                        }
                                    } else if (u.a.compareAndSet(uVar, obj6, qVar2)) {
                                        ((i.a.k) obj6).resumeWith(h.k.a);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f9037d;
                    if (i2 == i4) {
                        this.f9037d = i4 + 1;
                        return true;
                    }
                    obj3 = this.a;
                }
                obj5 = obj3;
                i4 = i2;
            }
        }
    }

    @Override // i.a.h2.k, i.a.h2.r
    public T getValue() {
        i.a.i2.q qVar = i.a.h2.w.g.a;
        T t = (T) this._state;
        if (t == qVar) {
            return null;
        }
        return t;
    }

    @Override // i.a.h2.k
    public void setValue(T t) {
        if (t == null) {
            t = (T) i.a.h2.w.g.a;
        }
        g(null, t);
    }
}
