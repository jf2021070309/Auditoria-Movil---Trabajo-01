package com.amazon.aps.iva.ve0;

import com.amazon.aps.iva.se0.j1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: StateFlow.kt */
/* loaded from: classes4.dex */
public final class v0<T> extends com.amazon.aps.iva.we0.b<w0> implements g0<T>, f {
    private volatile /* synthetic */ Object _state;
    public int f;

    /* compiled from: StateFlow.kt */
    @com.amazon.aps.iva.qb0.e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public v0 h;
        public g i;
        public w0 j;
        public j1 k;
        public Object l;
        public /* synthetic */ Object m;
        public final /* synthetic */ v0<T> n;
        public int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v0<T> v0Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
            this.n = v0Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.m = obj;
            this.o |= Integer.MIN_VALUE;
            return this.n.c(null, this);
        }
    }

    public v0(Object obj) {
        this._state = obj;
    }

    @Override // com.amazon.aps.iva.ve0.f0, com.amazon.aps.iva.ve0.g
    public final Object a(T t, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        setValue(t);
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final boolean b(T t) {
        setValue(t);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
        if (com.amazon.aps.iva.yb0.j.a(r0, r2) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:14:0x003a, B:34:0x0092, B:36:0x0096, B:39:0x009d, B:40:0x00a1, B:42:0x00a4, B:52:0x00c5, B:57:0x00dd, B:58:0x00f5, B:64:0x0107, B:65:0x010c, B:68:0x0115, B:61:0x00ff, B:44:0x00aa, B:48:0x00b1, B:19:0x0050, B:22:0x005b, B:33:0x0083), top: B:78:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:14:0x003a, B:34:0x0092, B:36:0x0096, B:39:0x009d, B:40:0x00a1, B:42:0x00a4, B:52:0x00c5, B:57:0x00dd, B:58:0x00f5, B:64:0x0107, B:65:0x010c, B:68:0x0115, B:61:0x00ff, B:44:0x00aa, B:48:0x00b1, B:19:0x0050, B:22:0x005b, B:33:0x0083), top: B:78:0x0028 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00db -> B:34:0x0092). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0117 -> B:34:0x0092). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.ve0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.amazon.aps.iva.ve0.g<? super T> r18, com.amazon.aps.iva.ob0.d<?> r19) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ve0.v0.c(com.amazon.aps.iva.ve0.g, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.we0.b
    public final w0 e() {
        return new w0();
    }

    @Override // com.amazon.aps.iva.ve0.f0
    public final void g() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // com.amazon.aps.iva.ve0.g0
    public final T getValue() {
        com.amazon.aps.iva.xe0.s sVar = com.amazon.aps.iva.gr.n.d;
        T t = (T) this._state;
        if (t == sVar) {
            return null;
        }
        return t;
    }

    @Override // com.amazon.aps.iva.we0.b
    public final com.amazon.aps.iva.we0.c[] h() {
        return new w0[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.amazon.aps.iva.xe0.s] */
    public final boolean j(T t, T t2) {
        ?? r0 = com.amazon.aps.iva.gr.n.d;
        if (t2 == null) {
            t2 = r0;
        }
        return k(t, t2);
    }

    public final boolean k(Object obj, Object obj2) {
        int i;
        Object obj3;
        com.amazon.aps.iva.xe0.s sVar;
        boolean z;
        boolean z2;
        synchronized (this) {
            Object obj4 = this._state;
            if (obj != null && !com.amazon.aps.iva.yb0.j.a(obj4, obj)) {
                return false;
            }
            if (com.amazon.aps.iva.yb0.j.a(obj4, obj2)) {
                return true;
            }
            this._state = obj2;
            int i2 = this.f;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.f = i3;
                Object obj5 = this.b;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                while (true) {
                    w0[] w0VarArr = (w0[]) obj5;
                    if (w0VarArr != null) {
                        for (w0 w0Var : w0VarArr) {
                            if (w0Var != null) {
                                while (true) {
                                    Object obj6 = w0Var._state;
                                    if (obj6 != null && obj6 != (sVar = com.amazon.aps.iva.ab.x.d)) {
                                        com.amazon.aps.iva.xe0.s sVar2 = com.amazon.aps.iva.ab.x.c;
                                        if (obj6 == sVar2) {
                                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w0.a;
                                            while (true) {
                                                if (atomicReferenceFieldUpdater.compareAndSet(w0Var, obj6, sVar)) {
                                                    z = true;
                                                    break;
                                                } else if (atomicReferenceFieldUpdater.get(w0Var) != obj6) {
                                                    z = false;
                                                    break;
                                                }
                                            }
                                            if (z) {
                                                break;
                                            }
                                        } else {
                                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w0.a;
                                            while (true) {
                                                if (atomicReferenceFieldUpdater2.compareAndSet(w0Var, obj6, sVar2)) {
                                                    z2 = true;
                                                    break;
                                                } else if (atomicReferenceFieldUpdater2.get(w0Var) != obj6) {
                                                    z2 = false;
                                                    break;
                                                }
                                            }
                                            if (z2) {
                                                ((com.amazon.aps.iva.se0.n) obj6).resumeWith(com.amazon.aps.iva.kb0.q.a);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.f;
                        if (i == i3) {
                            this.f = i3 + 1;
                            return true;
                        }
                        obj3 = this.b;
                        com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
                    }
                    obj5 = obj3;
                    i3 = i;
                }
            } else {
                this.f = i2 + 2;
                return true;
            }
        }
    }

    @Override // com.amazon.aps.iva.ve0.g0
    public final void setValue(T t) {
        if (t == null) {
            t = (T) com.amazon.aps.iva.gr.n.d;
        }
        k(null, t);
    }
}
