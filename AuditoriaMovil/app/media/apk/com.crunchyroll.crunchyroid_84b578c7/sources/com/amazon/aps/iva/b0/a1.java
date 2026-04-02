package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.b0.w0;
import com.google.android.gms.cast.MediaError;
/* compiled from: TapGestureDetector.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.p1.f0 j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.q<h0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> l;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> m;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> n;

    /* compiled from: TapGestureDetector.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {100, 114, 129, 141, 156, 178}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public Object i;
        public Object j;
        public com.amazon.aps.iva.yb0.d0 k;
        public long l;
        public int m;
        public /* synthetic */ Object n;
        public final /* synthetic */ com.amazon.aps.iva.se0.g0 o;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<h0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> p;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> q;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> r;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> s;
        public final /* synthetic */ i0 t;

        /* compiled from: TapGestureDetector.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.b0.a1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0119a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public final /* synthetic */ i0 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0119a(i0 i0Var, com.amazon.aps.iva.ob0.d<? super C0119a> dVar) {
                super(2, dVar);
                this.h = i0Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new C0119a(this.h, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((C0119a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                com.amazon.aps.iva.ab.x.i0(obj);
                i0 i0Var = this.h;
                i0Var.c = true;
                i0Var.e.d(null);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: TapGestureDetector.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {MediaError.DetailedErrorCode.MEDIA_NETWORK}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public final /* synthetic */ i0 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i0 i0Var, com.amazon.aps.iva.ob0.d<? super b> dVar) {
                super(2, dVar);
                this.i = i0Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new b(this.i, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                    this.h = 1;
                    if (this.i.b(this) == aVar) {
                        return aVar;
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: TapGestureDetector.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {106}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public final /* synthetic */ com.amazon.aps.iva.xb0.q<h0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> i;
            public final /* synthetic */ i0 j;
            public final /* synthetic */ com.amazon.aps.iva.p1.y k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(com.amazon.aps.iva.xb0.q<? super h0, ? super com.amazon.aps.iva.e1.c, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar, i0 i0Var, com.amazon.aps.iva.p1.y yVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
                super(2, dVar);
                this.i = qVar;
                this.j = i0Var;
                this.k = yVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new c(this.i, this.j, this.k, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                    com.amazon.aps.iva.e1.c cVar = new com.amazon.aps.iva.e1.c(this.k.c);
                    this.h = 1;
                    if (this.i.invoke(this.j, cVar, this) == aVar) {
                        return aVar;
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: TapGestureDetector.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {115}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class d extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.p1.y>, Object> {
            public int i;
            public /* synthetic */ Object j;

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                d dVar2 = new d(dVar);
                dVar2.j = obj;
                return dVar2;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.p1.y> dVar) {
                return ((d) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.i;
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    this.i = 1;
                    w0.a aVar2 = w0.a;
                    obj = w0.e((com.amazon.aps.iva.p1.c) this.j, com.amazon.aps.iva.p1.n.Main, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: TapGestureDetector.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class e extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public final /* synthetic */ i0 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(i0 i0Var, com.amazon.aps.iva.ob0.d<? super e> dVar) {
                super(2, dVar);
                this.h = i0Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new e(this.h, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((e) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                com.amazon.aps.iva.ab.x.i0(obj);
                i0 i0Var = this.h;
                i0Var.d = true;
                i0Var.e.d(null);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: TapGestureDetector.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class f extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public final /* synthetic */ i0 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(i0 i0Var, com.amazon.aps.iva.ob0.d<? super f> dVar) {
                super(2, dVar);
                this.h = i0Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new f(this.h, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((f) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                com.amazon.aps.iva.ab.x.i0(obj);
                i0 i0Var = this.h;
                i0Var.c = true;
                i0Var.e.d(null);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: TapGestureDetector.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public final /* synthetic */ i0 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(i0 i0Var, com.amazon.aps.iva.ob0.d<? super g> dVar) {
                super(2, dVar);
                this.h = i0Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new g(this.h, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((g) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                com.amazon.aps.iva.ab.x.i0(obj);
                i0 i0Var = this.h;
                i0Var.c = true;
                i0Var.e.d(null);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: TapGestureDetector.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {148}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class h extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public final /* synthetic */ i0 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(i0 i0Var, com.amazon.aps.iva.ob0.d<? super h> dVar) {
                super(2, dVar);
                this.i = i0Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new h(this.i, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((h) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                    this.h = 1;
                    if (this.i.b(this) == aVar) {
                        return aVar;
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: TapGestureDetector.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {151}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class i extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public final /* synthetic */ com.amazon.aps.iva.xb0.q<h0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> i;
            public final /* synthetic */ i0 j;
            public final /* synthetic */ com.amazon.aps.iva.p1.y k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public i(com.amazon.aps.iva.xb0.q<? super h0, ? super com.amazon.aps.iva.e1.c, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar, i0 i0Var, com.amazon.aps.iva.p1.y yVar, com.amazon.aps.iva.ob0.d<? super i> dVar) {
                super(2, dVar);
                this.i = qVar;
                this.j = i0Var;
                this.k = yVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new i(this.i, this.j, this.k, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((i) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                    com.amazon.aps.iva.e1.c cVar = new com.amazon.aps.iva.e1.c(this.k.c);
                    this.h = 1;
                    if (this.i.invoke(this.j, cVar, this) == aVar) {
                        return aVar;
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: TapGestureDetector.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", f = "TapGestureDetector.kt", l = {157}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class j extends com.amazon.aps.iva.qb0.h implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.p1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int i;
            public /* synthetic */ Object j;
            public final /* synthetic */ com.amazon.aps.iva.se0.g0 k;
            public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> l;
            public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> m;
            public final /* synthetic */ com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.p1.y> n;
            public final /* synthetic */ i0 o;

            /* compiled from: TapGestureDetector.kt */
            @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.amazon.aps.iva.b0.a1$a$j$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0120a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
                public final /* synthetic */ i0 h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0120a(i0 i0Var, com.amazon.aps.iva.ob0.d<? super C0120a> dVar) {
                    super(2, dVar);
                    this.h = i0Var;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                    return new C0120a(this.h, dVar);
                }

                @Override // com.amazon.aps.iva.xb0.p
                public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                    return ((C0120a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                    com.amazon.aps.iva.ab.x.i0(obj);
                    i0 i0Var = this.h;
                    i0Var.c = true;
                    i0Var.e.d(null);
                    return com.amazon.aps.iva.kb0.q.a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* loaded from: classes.dex */
            public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
                public final /* synthetic */ i0 h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(i0 i0Var, com.amazon.aps.iva.ob0.d<? super b> dVar) {
                    super(2, dVar);
                    this.h = i0Var;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                    return new b(this.h, dVar);
                }

                @Override // com.amazon.aps.iva.xb0.p
                public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                    return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                    com.amazon.aps.iva.ab.x.i0(obj);
                    i0 i0Var = this.h;
                    i0Var.d = true;
                    i0Var.e.d(null);
                    return com.amazon.aps.iva.kb0.q.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public j(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> lVar2, com.amazon.aps.iva.yb0.d0<com.amazon.aps.iva.p1.y> d0Var, i0 i0Var, com.amazon.aps.iva.ob0.d<? super j> dVar) {
                super(dVar);
                this.k = g0Var;
                this.l = lVar;
                this.m = lVar2;
                this.n = d0Var;
                this.o = i0Var;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                j jVar = new j(this.k, this.l, this.m, this.n, this.o, dVar);
                jVar.j = obj;
                return jVar;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((j) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.i;
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    this.i = 1;
                    w0.a aVar2 = w0.a;
                    obj = w0.e((com.amazon.aps.iva.p1.c) this.j, com.amazon.aps.iva.p1.n.Main, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                com.amazon.aps.iva.p1.y yVar = (com.amazon.aps.iva.p1.y) obj;
                com.amazon.aps.iva.se0.g0 g0Var = this.k;
                i0 i0Var = this.o;
                if (yVar != null) {
                    yVar.a();
                    com.amazon.aps.iva.se0.i.d(g0Var, null, null, new C0120a(i0Var, null), 3);
                    this.l.invoke(new com.amazon.aps.iva.e1.c(yVar.c));
                    return com.amazon.aps.iva.kb0.q.a;
                }
                com.amazon.aps.iva.se0.i.d(g0Var, null, null, new b(i0Var, null), 3);
                com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> lVar = this.m;
                if (lVar == null) {
                    return null;
                }
                lVar.invoke(new com.amazon.aps.iva.e1.c(this.n.b.c));
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.xb0.q<? super h0, ? super com.amazon.aps.iva.e1.c, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> lVar2, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.e1.c, com.amazon.aps.iva.kb0.q> lVar3, i0 i0Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
            this.o = g0Var;
            this.p = qVar;
            this.q = lVar;
            this.r = lVar2;
            this.s = lVar3;
            this.t = i0Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.o, this.p, this.q, this.r, this.s, this.t, dVar);
            aVar.n = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00da A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e4 A[Catch: o -> 0x00fb, TryCatch #3 {o -> 0x00fb, blocks: (B:31:0x00de, B:33:0x00e4, B:34:0x00ed), top: B:84:0x00de }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ed A[Catch: o -> 0x00fb, TRY_LEAVE, TryCatch #3 {o -> 0x00fb, blocks: (B:31:0x00de, B:33:0x00e4, B:34:0x00ed), top: B:84:0x00de }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0120 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0183  */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v38 */
        /* JADX WARN: Type inference failed for: r2v4, types: [com.amazon.aps.iva.ob0.g, com.amazon.aps.iva.se0.h0, com.amazon.aps.iva.ob0.d] */
        /* JADX WARN: Type inference failed for: r2v41 */
        /* JADX WARN: Type inference failed for: r2v42 */
        /* JADX WARN: Type inference failed for: r2v43 */
        /* JADX WARN: Type inference failed for: r5v0, types: [com.amazon.aps.iva.xb0.q, com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.b0.h0, com.amazon.aps.iva.e1.c, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, java.lang.Object>] */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r5v9 */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 528
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b0.a1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.amazon.aps.iva.p1.f0 f0Var, com.amazon.aps.iva.ob0.d dVar, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.l lVar2, com.amazon.aps.iva.xb0.l lVar3, com.amazon.aps.iva.xb0.q qVar) {
        super(2, dVar);
        this.j = f0Var;
        this.k = qVar;
        this.l = lVar;
        this.m = lVar2;
        this.n = lVar3;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        a1 a1Var = new a1(this.j, dVar, this.l, this.m, this.n, this.k);
        a1Var.i = obj;
        return a1Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((a1) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            com.amazon.aps.iva.se0.g0 g0Var = (com.amazon.aps.iva.se0.g0) this.i;
            com.amazon.aps.iva.p1.f0 f0Var = this.j;
            a aVar2 = new a(g0Var, this.k, this.l, this.m, this.n, new i0(f0Var), null);
            this.h = 1;
            if (c0.b(f0Var, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
