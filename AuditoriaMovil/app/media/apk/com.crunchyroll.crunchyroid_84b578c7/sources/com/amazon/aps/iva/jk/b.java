package com.amazon.aps.iva.jk;

import com.amazon.aps.iva.a6.m0;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.nk.e;
import com.amazon.aps.iva.pj.e;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.se0.c2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.ve0.v0;
import com.google.android.gms.cast.MediaError;
/* compiled from: PlayerEventListener.kt */
/* loaded from: classes.dex */
public final class b implements l0.c {
    public final g0 b;
    public final com.amazon.aps.iva.xb0.a<androidx.media3.ui.d> c;
    public final com.amazon.aps.iva.ve0.g0<com.amazon.aps.iva.nk.j> d;
    public final com.amazon.aps.iva.ve0.g0<com.amazon.aps.iva.nk.d> e;
    public final com.amazon.aps.iva.ve0.g0<com.amazon.aps.iva.nk.f> f;
    public final l0 g;
    public final com.amazon.aps.iva.p0.e h;
    public final com.amazon.aps.iva.oj.a i;
    public float j;
    public long k;
    public c2 l;
    public c2 m;

    /* compiled from: PlayerEventListener.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.listeners.PlayerEventListener$onIsPlayingChanged$1", f = "PlayerEventListener.kt", l = {MediaError.DetailedErrorCode.MEDIA_DECODE}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;

        /* compiled from: PlayerEventListener.kt */
        /* renamed from: com.amazon.aps.iva.jk.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0420a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ b h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0420a(b bVar) {
                super(0);
                this.h = bVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.kb0.q invoke() {
                b bVar = this.h;
                bVar.I(bVar.g.a());
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            g0 g0Var;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    g0Var = (g0) this.i;
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                g0Var = (g0) this.i;
            }
            while (z.E(g0Var)) {
                b bVar = b.this;
                C0420a c0420a = new C0420a(bVar);
                this.i = g0Var;
                this.h = 1;
                if (b.G(bVar, c0420a, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerEventListener.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.listeners.PlayerEventListener$onPlaybackStateChanged$1", f = "PlayerEventListener.kt", l = {124}, m = "invokeSuspend")
    /* renamed from: com.amazon.aps.iva.jk.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0421b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;

        public C0421b(com.amazon.aps.iva.ob0.d<? super C0421b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            C0421b c0421b = new C0421b(dVar);
            c0421b.i = obj;
            return c0421b;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((C0421b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            g0 g0Var;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    g0Var = (g0) this.i;
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                g0Var = (g0) this.i;
            }
            while (z.E(g0Var)) {
                b.this.K();
                this.i = g0Var;
                this.h = 1;
                if (com.amazon.aps.iva.ab.t.l(250L, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerEventListener.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.j, com.amazon.aps.iva.nk.j> {
        public final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(1);
            this.h = i;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.j invoke(com.amazon.aps.iva.nk.j jVar) {
            com.amazon.aps.iva.nk.j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
            com.amazon.aps.iva.nk.e.Companion.getClass();
            return com.amazon.aps.iva.nk.j.a(jVar2, false, 0L, 0L, 0.0f, 0L, e.a.a(this.h), null, 0, null, null, null, null, null, null, null, null, false, null, null, 4193215);
        }
    }

    /* compiled from: PlayerEventListener.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.j, com.amazon.aps.iva.nk.j> {
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(1);
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.j invoke(com.amazon.aps.iva.nk.j jVar) {
            com.amazon.aps.iva.nk.j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
            boolean J0 = b.this.g.J0();
            com.amazon.aps.iva.nk.e.Companion.getClass();
            return com.amazon.aps.iva.nk.j.a(jVar2, J0, 0L, 0L, 0.0f, 0L, e.a.a(this.i), null, 0, null, null, null, null, null, null, null, null, false, null, null, 4194238);
        }
    }

    /* compiled from: PlayerEventListener.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.exoplayercomponent.listeners.PlayerEventListener$savePlayheadPositionToServer$1", f = "PlayerEventListener.kt", l = {177}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ long j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(2, dVar);
            this.j = j;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new e(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((e) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                b bVar = b.this;
                com.amazon.aps.iva.p0.e eVar = bVar.h;
                String str = bVar.d.getValue().h.a;
                String str2 = bVar.d.getValue().h.h;
                if (str2 == null) {
                    str2 = "";
                }
                long j = this.j;
                this.h = 1;
                Object b = ((com.amazon.aps.iva.yj.a) eVar.b).b.a.b(str, str2, j / 1000, this);
                if (b != aVar) {
                    b = com.amazon.aps.iva.kb0.q.a;
                }
                if (b != aVar) {
                    b = com.amazon.aps.iva.kb0.q.a;
                }
                if (b != aVar) {
                    b = com.amazon.aps.iva.kb0.q.a;
                }
                if (b == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerEventListener.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nk.j, com.amazon.aps.iva.nk.j> {
        public final /* synthetic */ l0 h;
        public final /* synthetic */ b i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l0 l0Var, b bVar) {
            super(1);
            this.h = l0Var;
            this.i = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nk.j invoke(com.amazon.aps.iva.nk.j jVar) {
            long j;
            long j2;
            com.amazon.aps.iva.nk.j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "$this$set");
            l0 l0Var = this.h;
            int i = (l0Var.getDuration() > 0L ? 1 : (l0Var.getDuration() == 0L ? 0 : -1));
            b bVar = this.i;
            if (i > 0) {
                bVar.j = ((float) l0Var.a()) / ((float) l0Var.getDuration());
            }
            bVar.k = l0Var.getDuration() - l0Var.a();
            boolean J0 = l0Var.J0();
            com.amazon.aps.iva.kk.c cVar = jVar2.h;
            long duration = l0Var.getDuration();
            if (duration < 0) {
                duration = 0;
            }
            com.amazon.aps.iva.kk.c a = com.amazon.aps.iva.kk.c.a(cVar, null, null, null, null, null, duration, 268173311);
            long a2 = l0Var.a();
            if (a2 < 0) {
                a2 = 0;
            }
            long j3 = bVar.k;
            if (j3 < 0) {
                j = 0;
            } else {
                j = j3;
            }
            float f = bVar.j;
            long G0 = l0Var.G0();
            if (G0 < 0) {
                j2 = 0;
            } else {
                j2 = G0;
            }
            return com.amazon.aps.iva.nk.j.a(jVar2, J0, j, a2, f, j2, null, a, 0, null, null, null, null, null, null, null, null, false, null, null, 4194120);
        }
    }

    public b(com.amazon.aps.iva.xe0.d dVar, com.amazon.aps.iva.tj.b bVar, v0 v0Var, v0 v0Var2, v0 v0Var3, m0 m0Var, com.amazon.aps.iva.p0.e eVar, com.amazon.aps.iva.oj.a aVar) {
        com.amazon.aps.iva.yb0.j.f(v0Var, "state");
        com.amazon.aps.iva.yb0.j.f(v0Var2, "nextEpisodeState");
        com.amazon.aps.iva.yb0.j.f(v0Var3, "previousEpisodeState");
        com.amazon.aps.iva.yb0.j.f(eVar, "exoplayerHelper");
        this.b = dVar;
        this.c = bVar;
        this.d = v0Var;
        this.e = v0Var2;
        this.f = v0Var3;
        this.g = m0Var;
        this.h = eVar;
        this.i = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.amazon.aps.iva.xb0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(com.amazon.aps.iva.jk.b r4, com.amazon.aps.iva.jk.b.a.C0420a r5, com.amazon.aps.iva.ob0.d r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.amazon.aps.iva.jk.f
            if (r0 == 0) goto L16
            r0 = r6
            com.amazon.aps.iva.jk.f r0 = (com.amazon.aps.iva.jk.f) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.k = r1
            goto L1b
        L16:
            com.amazon.aps.iva.jk.f r0 = new com.amazon.aps.iva.jk.f
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.i
            com.amazon.aps.iva.pb0.a r6 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            com.amazon.aps.iva.xb0.a r5 = r0.h
            com.amazon.aps.iva.xb0.a r5 = (com.amazon.aps.iva.xb0.a) r5
            com.amazon.aps.iva.ab.x.i0(r4)
            goto L46
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            com.amazon.aps.iva.ab.x.i0(r4)
            r0.h = r5
            r0.k = r2
            r1 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r4 = com.amazon.aps.iva.ab.t.l(r1, r0)
            if (r4 != r6) goto L46
            goto L4b
        L46:
            r5.invoke()
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jk.b.G(com.amazon.aps.iva.jk.b, com.amazon.aps.iva.jk.b$a$a, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public final void I(long j) {
        com.amazon.aps.iva.se0.i.d(this.b, r0.b, null, new e(j, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.q5.l0.c
    public final void J(int i) {
        com.amazon.aps.iva.nk.e.Companion.getClass();
        com.amazon.aps.iva.nk.e a2 = e.a.a(i);
        com.amazon.aps.iva.nk.e eVar = com.amazon.aps.iva.nk.e.READY;
        com.amazon.aps.iva.ve0.g0<com.amazon.aps.iva.nk.j> g0Var = this.d;
        if (a2 == eVar) {
            c2 c2Var = this.l;
            if (c2Var != null) {
                c2Var.a(null);
            }
            this.l = com.amazon.aps.iva.se0.i.d(this.b, null, null, new C0421b(null), 3);
            c cVar = new c(i);
            com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
            g0Var.setValue(cVar.invoke(g0Var.getValue()));
        }
        if (((com.amazon.aps.iva.nk.j) g0Var.getValue()).g != com.amazon.aps.iva.nk.e.VIDEO_SETTING_CHANGE) {
            g0Var.setValue(new d(i).invoke(g0Var.getValue()));
        }
    }

    public final void K() {
        f fVar = new f(this.g, this);
        com.amazon.aps.iva.ve0.g0<com.amazon.aps.iva.nk.j> g0Var = this.d;
        com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
        g0Var.setValue(fVar.invoke(g0Var.getValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.q5.l0.c
    public final void g0(int i, boolean z) {
        boolean z2;
        com.amazon.aps.iva.nk.e.Companion.getClass();
        com.amazon.aps.iva.nk.e a2 = e.a.a(i);
        com.amazon.aps.iva.nk.e eVar = com.amazon.aps.iva.nk.e.READY;
        com.amazon.aps.iva.ve0.g0<com.amazon.aps.iva.nk.j> g0Var = this.d;
        if (a2 == eVar) {
            c2 c2Var = this.l;
            if (c2Var != null) {
                c2Var.a(null);
            }
            this.l = com.amazon.aps.iva.se0.i.d(this.b, null, null, new com.amazon.aps.iva.jk.c(this, null), 3);
            com.amazon.aps.iva.jk.d dVar = new com.amazon.aps.iva.jk.d(this);
            com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
            g0Var.setValue(dVar.invoke(g0Var.getValue()));
        }
        androidx.media3.ui.d invoke = this.c.invoke();
        if (invoke != null) {
            if (a2 != com.amazon.aps.iva.nk.e.IDLE && a2 != com.amazon.aps.iva.nk.e.ENDED && z) {
                z2 = true;
            } else {
                z2 = false;
            }
            invoke.setKeepScreenOn(z2);
        }
        if (((com.amazon.aps.iva.nk.j) g0Var.getValue()).g != com.amazon.aps.iva.nk.e.VIDEO_SETTING_CHANGE) {
            g0Var.setValue(new com.amazon.aps.iva.jk.e(this, a2).invoke(g0Var.getValue()));
        }
        if (a2 == com.amazon.aps.iva.nk.e.END_OF_MEDIA_ITEM) {
            e.i.a aVar = e.i.a.a;
            this.i.b(b.class.getSimpleName(), aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    @Override // com.amazon.aps.iva.q5.l0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(int r45, com.amazon.aps.iva.q5.b0 r46) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jk.b.l0(int, com.amazon.aps.iva.q5.b0):void");
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void s0(boolean z) {
        l0 l0Var = this.g;
        if (l0Var.o()) {
            return;
        }
        com.amazon.aps.iva.xb0.a<androidx.media3.ui.d> aVar = this.c;
        if (z) {
            c2 c2Var = this.m;
            if (c2Var != null) {
                c2Var.a(null);
            }
            I(l0Var.a());
            this.m = com.amazon.aps.iva.se0.i.d(this.b, null, null, new a(null), 3);
            androidx.media3.ui.d invoke = aVar.invoke();
            if (invoke != null) {
                invoke.setKeepScreenOn(true);
                return;
            }
            return;
        }
        c2 c2Var2 = this.m;
        if (c2Var2 != null) {
            c2Var2.a(null);
        }
        I(this.d.getValue().c);
        androidx.media3.ui.d invoke2 = aVar.invoke();
        if (invoke2 != null) {
            invoke2.setKeepScreenOn(false);
        }
    }
}
