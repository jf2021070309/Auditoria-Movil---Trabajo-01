package com.amazon.aps.iva.a0;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import com.amazon.aps.iva.v1.t1;
import com.google.android.gms.cast.MediaError;
import java.util.List;
/* compiled from: AndroidOverscroll.kt */
/* loaded from: classes.dex */
public final class b implements p1 {
    public final n1 a;
    public com.amazon.aps.iva.e1.c b;
    public final EdgeEffect c;
    public final EdgeEffect d;
    public final EdgeEffect e;
    public final EdgeEffect f;
    public final List<EdgeEffect> g;
    public final EdgeEffect h;
    public final EdgeEffect i;
    public final EdgeEffect j;
    public final EdgeEffect k;
    public final com.amazon.aps.iva.o0.y1 l;
    public final boolean m;
    public boolean n;
    public long o;
    public com.amazon.aps.iva.p1.x p;
    public final com.amazon.aps.iva.a1.f q;

    /* compiled from: AndroidOverscroll.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.kt", l = {MediaError.DetailedErrorCode.HLS_SEGMENT_PARSING}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.f0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;

        /* compiled from: AndroidOverscroll.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.kt", l = {317, MediaError.DetailedErrorCode.DASH_NETWORK}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.a0.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0093a extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int i;
            public /* synthetic */ Object j;
            public final /* synthetic */ b k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0093a(b bVar, com.amazon.aps.iva.ob0.d<? super C0093a> dVar) {
                super(dVar);
                this.k = bVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                C0093a c0093a = new C0093a(this.k, dVar);
                c0093a.j = obj;
                return c0093a;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((C0093a) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00ad A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005c -> B:17:0x005f). Please submit an issue!!! */
            @Override // com.amazon.aps.iva.qb0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 221
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a0.b.a.C0093a.invokeSuspend(java.lang.Object):java.lang.Object");
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
        public final Object invoke(com.amazon.aps.iva.p1.f0 f0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(f0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                C0093a c0093a = new C0093a(b.this, null);
                this.h = 1;
                if (com.amazon.aps.iva.b0.c0.b((com.amazon.aps.iva.p1.f0) this.i, c0093a, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AndroidOverscroll.kt */
    /* renamed from: com.amazon.aps.iva.a0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0094b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.j, com.amazon.aps.iva.kb0.q> {
        public C0094b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o2.j jVar) {
            long j = jVar.a;
            long b = com.amazon.aps.iva.o2.k.b(j);
            b bVar = b.this;
            boolean z = !com.amazon.aps.iva.e1.g.a(b, bVar.o);
            bVar.o = com.amazon.aps.iva.o2.k.b(j);
            if (z) {
                int i = (int) (j >> 32);
                bVar.c.setSize(i, com.amazon.aps.iva.o2.j.b(j));
                bVar.d.setSize(i, com.amazon.aps.iva.o2.j.b(j));
                bVar.e.setSize(com.amazon.aps.iva.o2.j.b(j), i);
                bVar.f.setSize(com.amazon.aps.iva.o2.j.b(j), i);
                bVar.h.setSize(i, com.amazon.aps.iva.o2.j.b(j));
                bVar.i.setSize(i, com.amazon.aps.iva.o2.j.b(j));
                bVar.j.setSize(com.amazon.aps.iva.o2.j.b(j), i);
                bVar.k.setSize(com.amazon.aps.iva.o2.j.b(j), i);
            }
            if (z) {
                bVar.i();
                bVar.e();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public b(Context context, n1 n1Var) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.a = n1Var;
        EdgeEffect a2 = a0.a(context);
        this.c = a2;
        EdgeEffect a3 = a0.a(context);
        this.d = a3;
        EdgeEffect a4 = a0.a(context);
        this.e = a4;
        EdgeEffect a5 = a0.a(context);
        this.f = a5;
        List<EdgeEffect> K = com.amazon.aps.iva.ee0.f1.K(a4, a2, a5, a3);
        this.g = K;
        this.h = a0.a(context);
        this.i = a0.a(context);
        this.j = a0.a(context);
        this.k = a0.a(context);
        int size = K.size();
        for (int i = 0; i < size; i++) {
            K.get(i).setColor(defpackage.i.G(this.a.a));
        }
        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        this.l = com.amazon.aps.iva.cq.b.b0(qVar, com.amazon.aps.iva.o0.r1.a);
        this.m = true;
        this.o = com.amazon.aps.iva.e1.g.b;
        C0094b c0094b = new C0094b();
        com.amazon.aps.iva.a1.f fVar = d.a;
        com.amazon.aps.iva.yb0.j.f(fVar, "other");
        com.amazon.aps.iva.a1.f K2 = com.amazon.aps.iva.e.z.K(com.amazon.aps.iva.p1.l0.a(fVar, qVar, new a(null)), c0094b);
        t1.a aVar = com.amazon.aps.iva.v1.t1.a;
        this.q = K2.o(new z(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0168  */
    @Override // com.amazon.aps.iva.a0.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r19, com.amazon.aps.iva.b0.v0.e r21, com.amazon.aps.iva.ob0.d r22) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a0.b.a(long, com.amazon.aps.iva.b0.v0$e, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0196 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0289 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013b  */
    @Override // com.amazon.aps.iva.a0.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(long r21, int r23, com.amazon.aps.iva.b0.v0.a r24) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a0.b.b(long, int, com.amazon.aps.iva.b0.v0$a):long");
    }

    @Override // com.amazon.aps.iva.a0.p1
    public final boolean c() {
        float f;
        boolean z;
        List<EdgeEffect> list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            com.amazon.aps.iva.yb0.j.f(edgeEffect, "<this>");
            if (Build.VERSION.SDK_INT >= 31) {
                f = f.a.b(edgeEffect);
            } else {
                f = 0.0f;
            }
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.a0.p1
    public final com.amazon.aps.iva.a1.f d() {
        return this.q;
    }

    public final void e() {
        List<EdgeEffect> list = this.g;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            edgeEffect.onRelease();
            if (!edgeEffect.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            i();
        }
    }

    public final boolean f(com.amazon.aps.iva.h1.e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-com.amazon.aps.iva.e1.g.d(this.o), (-com.amazon.aps.iva.e1.g.b(this.o)) + eVar.P0(this.a.b.a()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean g(com.amazon.aps.iva.h1.e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-com.amazon.aps.iva.e1.g.b(this.o), eVar.P0(this.a.b.b(eVar.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean h(com.amazon.aps.iva.h1.e eVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int a2 = com.amazon.aps.iva.ob0.f.a(com.amazon.aps.iva.e1.g.d(this.o));
        float c = this.a.b.c(eVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, eVar.P0(c) + (-a2));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final void i() {
        if (this.m) {
            this.l.setValue(com.amazon.aps.iva.kb0.q.a);
        }
    }

    public final float j(long j, long j2) {
        float f;
        float c = com.amazon.aps.iva.e1.c.c(j2) / com.amazon.aps.iva.e1.g.d(this.o);
        float f2 = -(com.amazon.aps.iva.e1.c.d(j) / com.amazon.aps.iva.e1.g.b(this.o));
        boolean z = true;
        float f3 = 1 - c;
        EdgeEffect edgeEffect = this.d;
        com.amazon.aps.iva.yb0.j.f(edgeEffect, "<this>");
        int i = Build.VERSION.SDK_INT;
        f fVar = f.a;
        if (i >= 31) {
            f2 = fVar.c(edgeEffect, f2, f3);
        } else {
            edgeEffect.onPull(f2, f3);
        }
        float b = com.amazon.aps.iva.e1.g.b(this.o) * (-f2);
        com.amazon.aps.iva.yb0.j.f(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            f = fVar.b(edgeEffect);
        } else {
            f = 0.0f;
        }
        if (f != 0.0f) {
            z = false;
        }
        if (!z) {
            return com.amazon.aps.iva.e1.c.d(j);
        }
        return b;
    }

    public final float k(long j, long j2) {
        float f;
        float d = com.amazon.aps.iva.e1.c.d(j2) / com.amazon.aps.iva.e1.g.b(this.o);
        float c = com.amazon.aps.iva.e1.c.c(j) / com.amazon.aps.iva.e1.g.d(this.o);
        boolean z = true;
        float f2 = 1 - d;
        EdgeEffect edgeEffect = this.e;
        com.amazon.aps.iva.yb0.j.f(edgeEffect, "<this>");
        int i = Build.VERSION.SDK_INT;
        f fVar = f.a;
        if (i >= 31) {
            c = fVar.c(edgeEffect, c, f2);
        } else {
            edgeEffect.onPull(c, f2);
        }
        float d2 = com.amazon.aps.iva.e1.g.d(this.o) * c;
        com.amazon.aps.iva.yb0.j.f(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            f = fVar.b(edgeEffect);
        } else {
            f = 0.0f;
        }
        if (f != 0.0f) {
            z = false;
        }
        if (!z) {
            return com.amazon.aps.iva.e1.c.c(j);
        }
        return d2;
    }

    public final float l(long j, long j2) {
        float f;
        boolean z;
        float d = com.amazon.aps.iva.e1.c.d(j2) / com.amazon.aps.iva.e1.g.b(this.o);
        float f2 = -(com.amazon.aps.iva.e1.c.c(j) / com.amazon.aps.iva.e1.g.d(this.o));
        EdgeEffect edgeEffect = this.f;
        com.amazon.aps.iva.yb0.j.f(edgeEffect, "<this>");
        int i = Build.VERSION.SDK_INT;
        f fVar = f.a;
        if (i >= 31) {
            f2 = fVar.c(edgeEffect, f2, d);
        } else {
            edgeEffect.onPull(f2, d);
        }
        float d2 = com.amazon.aps.iva.e1.g.d(this.o) * (-f2);
        com.amazon.aps.iva.yb0.j.f(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            f = fVar.b(edgeEffect);
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return com.amazon.aps.iva.e1.c.c(j);
        }
        return d2;
    }

    public final float m(long j, long j2) {
        float f;
        boolean z;
        float c = com.amazon.aps.iva.e1.c.c(j2) / com.amazon.aps.iva.e1.g.d(this.o);
        float d = com.amazon.aps.iva.e1.c.d(j) / com.amazon.aps.iva.e1.g.b(this.o);
        EdgeEffect edgeEffect = this.c;
        com.amazon.aps.iva.yb0.j.f(edgeEffect, "<this>");
        int i = Build.VERSION.SDK_INT;
        f fVar = f.a;
        if (i >= 31) {
            d = fVar.c(edgeEffect, d, c);
        } else {
            edgeEffect.onPull(d, c);
        }
        float b = com.amazon.aps.iva.e1.g.b(this.o) * d;
        com.amazon.aps.iva.yb0.j.f(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            f = fVar.b(edgeEffect);
        } else {
            f = 0.0f;
        }
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return com.amazon.aps.iva.e1.c.d(j);
        }
        return b;
    }
}
