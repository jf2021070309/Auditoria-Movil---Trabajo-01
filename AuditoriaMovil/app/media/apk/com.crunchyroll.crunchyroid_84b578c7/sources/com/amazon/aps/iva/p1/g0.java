package com.amazon.aps.iva.p1;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
/* compiled from: PointerInteropFilter.android.kt */
/* loaded from: classes.dex */
public final class g0 implements e0 {
    public com.amazon.aps.iva.xb0.l<? super MotionEvent, Boolean> c;
    public k0 d;
    public boolean e;
    public final b f = new b();

    /* compiled from: PointerInteropFilter.android.kt */
    /* loaded from: classes.dex */
    public enum a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    /* compiled from: PointerInteropFilter.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends d0 {
        public a b = a.Unknown;

        /* compiled from: PointerInteropFilter.android.kt */
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<MotionEvent, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ g0 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g0 g0Var) {
                super(1);
                this.h = g0Var;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                com.amazon.aps.iva.yb0.j.f(motionEvent2, "motionEvent");
                com.amazon.aps.iva.xb0.l<? super MotionEvent, Boolean> lVar = this.h.c;
                if (lVar != null) {
                    lVar.invoke(motionEvent2);
                    return com.amazon.aps.iva.kb0.q.a;
                }
                com.amazon.aps.iva.yb0.j.m("onTouchEvent");
                throw null;
            }
        }

        /* compiled from: PointerInteropFilter.android.kt */
        /* renamed from: com.amazon.aps.iva.p1.g0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0591b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<MotionEvent, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ g0 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0591b(g0 g0Var) {
                super(1);
                this.i = g0Var;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(MotionEvent motionEvent) {
                a aVar;
                MotionEvent motionEvent2 = motionEvent;
                com.amazon.aps.iva.yb0.j.f(motionEvent2, "motionEvent");
                int actionMasked = motionEvent2.getActionMasked();
                g0 g0Var = this.i;
                if (actionMasked == 0) {
                    com.amazon.aps.iva.xb0.l<? super MotionEvent, Boolean> lVar = g0Var.c;
                    if (lVar != null) {
                        if (lVar.invoke(motionEvent2).booleanValue()) {
                            aVar = a.Dispatching;
                        } else {
                            aVar = a.NotDispatching;
                        }
                        b.this.b = aVar;
                    } else {
                        com.amazon.aps.iva.yb0.j.m("onTouchEvent");
                        throw null;
                    }
                } else {
                    com.amazon.aps.iva.xb0.l<? super MotionEvent, Boolean> lVar2 = g0Var.c;
                    if (lVar2 != null) {
                        lVar2.invoke(motionEvent2);
                    } else {
                        com.amazon.aps.iva.yb0.j.m("onTouchEvent");
                        throw null;
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: PointerInteropFilter.android.kt */
        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<MotionEvent, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ g0 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(g0 g0Var) {
                super(1);
                this.h = g0Var;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                com.amazon.aps.iva.yb0.j.f(motionEvent2, "motionEvent");
                com.amazon.aps.iva.xb0.l<? super MotionEvent, Boolean> lVar = this.h.c;
                if (lVar != null) {
                    lVar.invoke(motionEvent2);
                    return com.amazon.aps.iva.kb0.q.a;
                }
                com.amazon.aps.iva.yb0.j.m("onTouchEvent");
                throw null;
            }
        }

        public b() {
        }

        public final void a(m mVar) {
            boolean z;
            List<y> list = mVar.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (list.get(i).b()) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            g0 g0Var = g0.this;
            if (z) {
                if (this.b == a.Dispatching) {
                    com.amazon.aps.iva.s1.q qVar = this.a;
                    if (qVar != null) {
                        com.amazon.aps.iva.ab.x.o0(mVar, qVar.d0(com.amazon.aps.iva.e1.c.b), new a(g0Var), true);
                    } else {
                        throw new IllegalStateException("layoutCoordinates not set".toString());
                    }
                }
                this.b = a.NotDispatching;
                return;
            }
            com.amazon.aps.iva.s1.q qVar2 = this.a;
            if (qVar2 != null) {
                com.amazon.aps.iva.ab.x.o0(mVar, qVar2.d0(com.amazon.aps.iva.e1.c.b), new C0591b(g0Var), false);
                if (this.b == a.Dispatching) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        list.get(i2).a();
                    }
                    h hVar = mVar.b;
                    if (hVar != null) {
                        hVar.c = !g0Var.e;
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("layoutCoordinates not set".toString());
        }

        public final void b() {
            if (this.b == a.Dispatching) {
                long uptimeMillis = SystemClock.uptimeMillis();
                g0 g0Var = g0.this;
                c cVar = new c(g0Var);
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                obtain.setSource(0);
                cVar.invoke(obtain);
                obtain.recycle();
                this.b = a.Unknown;
                g0Var.e = false;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c(com.amazon.aps.iva.p1.m r9, com.amazon.aps.iva.p1.n r10) {
            /*
                r8 = this;
                java.lang.String r0 = "pass"
                com.amazon.aps.iva.yb0.j.f(r10, r0)
                com.amazon.aps.iva.p1.g0 r0 = com.amazon.aps.iva.p1.g0.this
                boolean r1 = r0.e
                r2 = 0
                r3 = 1
                java.util.List<com.amazon.aps.iva.p1.y> r4 = r9.a
                if (r1 != 0) goto L39
                int r1 = r4.size()
                r5 = r2
            L14:
                if (r5 >= r1) goto L33
                java.lang.Object r6 = r4.get(r5)
                com.amazon.aps.iva.p1.y r6 = (com.amazon.aps.iva.p1.y) r6
                boolean r7 = com.amazon.aps.iva.ee0.f1.o(r6)
                if (r7 != 0) goto L2b
                boolean r6 = com.amazon.aps.iva.ee0.f1.p(r6)
                if (r6 == 0) goto L29
                goto L2b
            L29:
                r6 = r2
                goto L2c
            L2b:
                r6 = r3
            L2c:
                if (r6 == 0) goto L30
                r1 = r3
                goto L34
            L30:
                int r5 = r5 + 1
                goto L14
            L33:
                r1 = r2
            L34:
                if (r1 == 0) goto L37
                goto L39
            L37:
                r1 = r2
                goto L3a
            L39:
                r1 = r3
            L3a:
                com.amazon.aps.iva.p1.g0$a r5 = r8.b
                com.amazon.aps.iva.p1.g0$a r6 = com.amazon.aps.iva.p1.g0.a.NotDispatching
                if (r5 == r6) goto L52
                com.amazon.aps.iva.p1.n r5 = com.amazon.aps.iva.p1.n.Initial
                if (r10 != r5) goto L49
                if (r1 == 0) goto L49
                r8.a(r9)
            L49:
                com.amazon.aps.iva.p1.n r5 = com.amazon.aps.iva.p1.n.Final
                if (r10 != r5) goto L52
                if (r1 != 0) goto L52
                r8.a(r9)
            L52:
                com.amazon.aps.iva.p1.n r9 = com.amazon.aps.iva.p1.n.Final
                if (r10 != r9) goto L76
                int r9 = r4.size()
                r10 = r2
            L5b:
                if (r10 >= r9) goto L6e
                java.lang.Object r1 = r4.get(r10)
                com.amazon.aps.iva.p1.y r1 = (com.amazon.aps.iva.p1.y) r1
                boolean r1 = com.amazon.aps.iva.ee0.f1.p(r1)
                if (r1 != 0) goto L6b
                r3 = r2
                goto L6e
            L6b:
                int r10 = r10 + 1
                goto L5b
            L6e:
                if (r3 == 0) goto L76
                com.amazon.aps.iva.p1.g0$a r9 = com.amazon.aps.iva.p1.g0.a.Unknown
                r8.b = r9
                r0.e = r2
            L76:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p1.g0.b.c(com.amazon.aps.iva.p1.m, com.amazon.aps.iva.p1.n):void");
        }
    }

    @Override // com.amazon.aps.iva.p1.e0
    public final b q() {
        return this.f;
    }
}
