package com.amazon.aps.iva.tv;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.es.b0;
import com.amazon.aps.iva.es.c0;
import com.amazon.aps.iva.es.i0;
import com.amazon.aps.iva.es.j0;
import com.amazon.aps.iva.es.o0;
import com.amazon.aps.iva.ks.m;
import com.amazon.aps.iva.ks.w;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.sv.u1;
import com.amazon.aps.iva.sv.v1;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DownloadsAnalytics.kt */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.tv.c, g0 {
    public final u1 c;
    public final com.amazon.aps.iva.rw.c d;
    public final q e;
    public final com.amazon.aps.iva.ds.a b = com.amazon.aps.iva.ds.c.b;
    public final /* synthetic */ com.amazon.aps.iva.xe0.d f = z.j();

    /* compiled from: DownloadsAnalytics.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.analytics.DownloadsAnalyticsImpl", f = "DownloadsAnalytics.kt", l = {175, 177}, m = "createVideoMediaProperty")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public d h;
        public String i;
        public t j;
        public /* synthetic */ Object k;
        public int m;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return d.this.d(null, null, this);
        }
    }

    /* compiled from: DownloadsAnalytics.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.analytics.DownloadsAnalyticsImpl", f = "DownloadsAnalytics.kt", l = {184}, m = "createVideoMediaProperty")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public PlayableAsset h;
        public /* synthetic */ Object i;
        public int k;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return d.this.c(null, this);
        }
    }

    /* compiled from: DownloadsAnalytics.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.analytics.DownloadsAnalyticsImpl$onDownloadCancel$1", f = "DownloadsAnalytics.kt", l = {116}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            d dVar = d.this;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                this.h = 1;
                obj = dVar.d(this.j, null, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            w wVar = (w) obj;
            if (wVar != null) {
                dVar.b.e(new com.amazon.aps.iva.es.p(wVar, d.b(dVar)));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsAnalytics.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.analytics.DownloadsAnalyticsImpl$onDownloadComplete$1", f = "DownloadsAnalytics.kt", l = {62, 66}, m = "invokeSuspend")
    /* renamed from: com.amazon.aps.iva.tv.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0748d extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public d h;
        public e0 i;
        public w j;
        public d k;
        public int l;
        public final /* synthetic */ e0 n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0748d(e0 e0Var, com.amazon.aps.iva.ob0.d<? super C0748d> dVar) {
            super(2, dVar);
            this.n = e0Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new C0748d(this.n, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((C0748d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            w wVar;
            d dVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.l;
            d dVar2 = d.this;
            e0 e0Var = this.n;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        d dVar3 = this.k;
                        wVar = this.j;
                        e0Var = this.i;
                        d dVar4 = this.h;
                        x.i0(obj);
                        dVar2 = dVar4;
                        dVar = dVar3;
                        dVar.b.e(new c0(wVar, (com.amazon.aps.iva.ks.f) obj, new com.amazon.aps.iva.ks.q(e0Var.h(), e0Var.d()), d.b(dVar2)));
                        return com.amazon.aps.iva.kb0.q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                String e = e0Var.e();
                this.l = 1;
                obj = dVar2.d(e, null, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            w wVar2 = (w) obj;
            if (wVar2 != null) {
                this.h = dVar2;
                this.i = e0Var;
                this.j = wVar2;
                this.k = dVar2;
                this.l = 2;
                Object a = d.a(dVar2, e0Var, this);
                if (a == aVar) {
                    return aVar;
                }
                wVar = wVar2;
                obj = a;
                dVar = dVar2;
                dVar.b.e(new c0(wVar, (com.amazon.aps.iva.ks.f) obj, new com.amazon.aps.iva.ks.q(e0Var.h(), e0Var.d()), d.b(dVar2)));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsAnalytics.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.analytics.DownloadsAnalyticsImpl$onDownloadPause$1", f = "DownloadsAnalytics.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ e0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e0 e0Var, com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(2, dVar);
            this.j = e0Var;
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
            d dVar = d.this;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                String e = this.j.e();
                this.h = 1;
                obj = dVar.d(e, null, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            w wVar = (w) obj;
            if (wVar != null) {
                dVar.b.e(new j0(wVar, d.b(dVar)));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsAnalytics.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.analytics.DownloadsAnalyticsImpl$onDownloadRemoveFinished$1", f = "DownloadsAnalytics.kt", l = {100}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new f(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((f) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            d dVar = d.this;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                this.h = 1;
                obj = dVar.d(this.j, null, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            w wVar = (w) obj;
            if (wVar != null) {
                dVar.b.e(new i0(wVar));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsAnalytics.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.analytics.DownloadsAnalyticsImpl$onDownloadRenew$1", f = "DownloadsAnalytics.kt", l = {124}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ e0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e0 e0Var, com.amazon.aps.iva.ob0.d<? super g> dVar) {
            super(2, dVar);
            this.j = e0Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new g(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((g) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            d dVar = d.this;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                String e = this.j.e();
                this.h = 1;
                obj = dVar.d(e, null, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            w wVar = (w) obj;
            if (wVar != null) {
                dVar.b.e(new b0(wVar, d.b(dVar)));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsAnalytics.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.analytics.DownloadsAnalyticsImpl$onDownloadResume$1", f = "DownloadsAnalytics.kt", l = {108}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, com.amazon.aps.iva.ob0.d<? super h> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new h(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((h) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            d dVar = d.this;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                this.h = 1;
                obj = dVar.d(this.j, null, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            w wVar = (w) obj;
            if (wVar != null) {
                dVar.b.e(new o0(wVar, d.b(dVar)));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsAnalytics.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.analytics.DownloadsAnalyticsImpl$onDownloadStarted$1", f = "DownloadsAnalytics.kt", l = {82, 83}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public d h;
        public w i;
        public int j;
        public final /* synthetic */ PlayableAsset l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(PlayableAsset playableAsset, com.amazon.aps.iva.ob0.d<? super i> dVar) {
            super(2, dVar);
            this.l = playableAsset;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new i(this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((i) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            w wVar;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.j;
            PlayableAsset playableAsset = this.l;
            d dVar2 = d.this;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        wVar = this.i;
                        dVar = this.h;
                        x.i0(obj);
                        dVar.b.e(new c0(wVar, ((com.amazon.aps.iva.wg.b) obj).a(), d.b(dVar2)));
                        return com.amazon.aps.iva.kb0.q.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = this.h;
                x.i0(obj);
            } else {
                x.i0(obj);
                this.h = dVar2;
                this.j = 1;
                obj = dVar2.c(playableAsset, this);
                if (obj == aVar) {
                    return aVar;
                }
                dVar = dVar2;
            }
            w wVar2 = (w) obj;
            com.amazon.aps.iva.rw.c cVar = dVar2.d;
            String id = playableAsset.getId();
            this.h = dVar;
            this.i = wVar2;
            this.j = 2;
            Object a = cVar.a(id, this);
            if (a == aVar) {
                return aVar;
            }
            wVar = wVar2;
            obj = a;
            dVar.b.e(new c0(wVar, ((com.amazon.aps.iva.wg.b) obj).a(), d.b(dVar2)));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public d(v1 v1Var, com.amazon.aps.iva.rw.d dVar, r rVar) {
        this.c = v1Var;
        this.d = dVar;
        this.e = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.amazon.aps.iva.tv.d r4, com.ellation.crunchyroll.downloading.e0 r5, com.amazon.aps.iva.ob0.d r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.amazon.aps.iva.tv.e
            if (r0 == 0) goto L16
            r0 = r6
            com.amazon.aps.iva.tv.e r0 = (com.amazon.aps.iva.tv.e) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.j = r1
            goto L1b
        L16:
            com.amazon.aps.iva.tv.e r0 = new com.amazon.aps.iva.tv.e
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L44
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            com.amazon.aps.iva.ab.x.i0(r6)
            java.lang.String r5 = r5.e()
            r0.j = r3
            com.amazon.aps.iva.rw.c r4 = r4.d
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 != r1) goto L44
            goto L4a
        L44:
            com.amazon.aps.iva.wg.b r6 = (com.amazon.aps.iva.wg.b) r6
            com.amazon.aps.iva.ks.f r1 = r6.a()
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.tv.d.a(com.amazon.aps.iva.tv.d, com.ellation.crunchyroll.downloading.e0, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static final m b(d dVar) {
        if (dVar.e.b()) {
            return m.a.a;
        }
        return m.b.a;
    }

    public static boolean e(Throwable th) {
        boolean z;
        if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
            return true;
        }
        Throwable cause = th.getCause();
        if (cause != null && e(cause)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void A0(e0 e0Var) {
        j.f(e0Var, "localVideo");
    }

    @Override // com.amazon.aps.iva.tv.c
    public final void G4(String str) {
        j.f(str, "downloadId");
        com.amazon.aps.iva.se0.i.d(this, null, null, new c(str, null), 3);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J3(com.amazon.aps.iva.nw.g gVar) {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J7(e0 e0Var) {
        j.f(e0Var, "localVideo");
        com.amazon.aps.iva.se0.i.d(this, null, null, new g(e0Var, null), 3);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void L0() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void M3(List<? extends e0> list) {
        j.f(list, "localVideos");
    }

    @Override // com.amazon.aps.iva.tv.c
    public final void O6(PlayableAsset playableAsset) {
        j.f(playableAsset, "asset");
        com.amazon.aps.iva.se0.i.d(this, null, null, new i(playableAsset, null), 3);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void P5(String str) {
        j.f(str, "downloadId");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void T3() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void V4(List<? extends PlayableAsset> list) {
        j.f(list, "playableAssets");
    }

    @Override // com.amazon.aps.iva.tv.c
    public final void W4(String str) {
        j.f(str, "downloadId");
        com.amazon.aps.iva.se0.i.d(this, null, null, new h(str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.ellation.crunchyroll.model.PlayableAsset r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.ks.w> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.tv.d.b
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.tv.d$b r0 = (com.amazon.aps.iva.tv.d.b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.tv.d$b r0 = new com.amazon.aps.iva.tv.d$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.ellation.crunchyroll.model.PlayableAsset r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
            java.lang.String r6 = r5.getId()
            r0.h = r5
            r0.k = r3
            com.amazon.aps.iva.sv.u1 r2 = r4.c
            java.lang.Object r6 = r2.x(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.ellation.crunchyroll.api.cms.model.streams.Streams r6 = (com.ellation.crunchyroll.api.cms.model.streams.Streams) r6
            com.amazon.aps.iva.vs.d r0 = com.amazon.aps.iva.gr.n.c
            com.amazon.aps.iva.ks.w r5 = r0.a(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.tv.d.c(com.ellation.crunchyroll.model.PlayableAsset, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void c3(String str) {
        j.f(str, "downloadId");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r26, com.amazon.aps.iva.x50.t r27, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.ks.w> r28) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.tv.d.d(java.lang.String, com.amazon.aps.iva.x50.t, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void f7(e0 e0Var) {
        j.f(e0Var, "localVideo");
        com.amazon.aps.iva.se0.i.d(this, null, null, new C0748d(e0Var, null), 3);
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.f.b;
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s3(e0 e0Var) {
        j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s8(e0 e0Var) {
        j.f(e0Var, "localVideo");
        com.amazon.aps.iva.se0.i.d(this, null, null, new e(e0Var, null), 3);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void t3() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void u7(e0 e0Var) {
        j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void v5(ArrayList arrayList) {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void x6(String str) {
        j.f(str, "downloadId");
        com.amazon.aps.iva.se0.i.d(this, null, null, new f(str, null), 3);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void y7(List<? extends e0> list) {
        j.f(list, "localVideos");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z1(List<? extends PlayableAsset> list) {
        j.f(list, "playableAssets");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z3(e0 e0Var, Throwable th) {
        e0.a aVar;
        t tVar;
        j.f(e0Var, "localVideo");
        j.f(th, "throwable");
        if (e(th)) {
            return;
        }
        if (e0Var instanceof e0.a) {
            aVar = (e0.a) e0Var;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            tVar = aVar.q();
        } else {
            tVar = null;
        }
        com.amazon.aps.iva.se0.i.d(this, null, null, new com.amazon.aps.iva.tv.f(this, e0Var, tVar, th, null), 3);
    }
}
