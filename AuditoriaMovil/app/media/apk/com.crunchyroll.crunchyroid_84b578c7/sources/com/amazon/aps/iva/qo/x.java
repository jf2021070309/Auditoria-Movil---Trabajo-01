package com.amazon.aps.iva.qo;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.qo.y;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import com.ellation.crunchyroll.api.etp.content.model.PlayheadKt;
import com.ellation.crunchyroll.api.etp.playback.model.SkipEvents;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: WatchScreenViewModel.kt */
/* loaded from: classes2.dex */
public final class x extends com.amazon.aps.iva.ez.b implements w {
    public final com.amazon.aps.iva.bp.b b;
    public final com.amazon.aps.iva.lo.f c;
    public final com.amazon.aps.iva.fg.e d;
    public final com.amazon.aps.iva.ti.a e;
    public final com.amazon.aps.iva.az.h f;
    public final com.amazon.aps.iva.az.d g;
    public final com.amazon.aps.iva.az.d h;
    public final com.amazon.aps.iva.az.d i;
    public final com.amazon.aps.iva.bz.d j;
    public final androidx.lifecycle.c k;
    public final com.amazon.aps.iva.i5.u l;
    public final com.amazon.aps.iva.i5.u m;
    public final com.amazon.aps.iva.i5.u n;
    public final androidx.lifecycle.c o;

    /* compiled from: WatchScreenViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.WatchScreenViewModelImpl$contentContainerFlow$1", f = "WatchScreenViewModel.kt", l = {95}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<y, com.amazon.aps.iva.ob0.d<? super ContentContainer>, Object> {
        public int h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(y yVar, com.amazon.aps.iva.ob0.d<? super ContentContainer> dVar) {
            return ((a) create(yVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                com.amazon.aps.iva.bp.b bVar = x.this.b;
                this.h = 1;
                obj = bVar.f(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: WatchScreenViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.qo.g, com.amazon.aps.iva.sf.e> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.sf.e invoke(com.amazon.aps.iva.qo.g gVar) {
            com.amazon.aps.iva.qo.g gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "it");
            return new com.amazon.aps.iva.sf.e(gVar2.b.a.getId(), gVar2.a.getResourceType());
        }
    }

    /* compiled from: WatchScreenViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, Boolean> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(Throwable th) {
            boolean z;
            Throwable th2 = th;
            com.amazon.aps.iva.yb0.j.f(th2, "it");
            if (!(th2 instanceof IOException) && !(th2 instanceof com.amazon.aps.iva.bp.a)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: WatchScreenViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.WatchScreenViewModelImpl$currentUpNextFlow$2", f = "WatchScreenViewModel.kt", l = {101, MediaError.DetailedErrorCode.MEDIA_NETWORK, MediaError.DetailedErrorCode.MEDIA_NETWORK, 105, 106}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<y, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.no.b>, Object> {
        public int h;
        public /* synthetic */ Object i;

        /* compiled from: WatchScreenViewModel.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.WatchScreenViewModelImpl$currentUpNextFlow$2$2", f = "WatchScreenViewModel.kt", l = {118, 119, 120}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.no.b>, Object> {
            public Object h;
            public int i;
            public int j;
            public int k;
            public long l;
            public int m;
            public /* synthetic */ Object n;
            public final /* synthetic */ y o;
            public final /* synthetic */ x p;

            /* compiled from: WatchScreenViewModel.kt */
            @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.WatchScreenViewModelImpl$currentUpNextFlow$2$2$assetJob$1", f = "WatchScreenViewModel.kt", l = {112}, m = "invokeSuspend")
            /* renamed from: com.amazon.aps.iva.qo.x$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0651a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super PlayableAsset>, Object> {
                public int h;
                public final /* synthetic */ y i;
                public final /* synthetic */ x j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0651a(x xVar, y yVar, com.amazon.aps.iva.ob0.d dVar) {
                    super(2, dVar);
                    this.i = yVar;
                    this.j = xVar;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                    return new C0651a(this.j, this.i, dVar);
                }

                @Override // com.amazon.aps.iva.xb0.p
                public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super PlayableAsset> dVar) {
                    return ((C0651a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                        y yVar = this.i;
                        PlayableAsset playableAsset = yVar.c;
                        if (playableAsset == null) {
                            com.amazon.aps.iva.bp.b bVar = this.j.b;
                            String str = yVar.b;
                            this.h = 1;
                            obj = bVar.n(str, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else {
                            return playableAsset;
                        }
                    }
                    return (PlayableAsset) obj;
                }
            }

            /* compiled from: WatchScreenViewModel.kt */
            @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.WatchScreenViewModelImpl$currentUpNextFlow$2$2$playheadJob$1", f = "WatchScreenViewModel.kt", l = {109}, m = "invokeSuspend")
            /* loaded from: classes2.dex */
            public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super Long>, Object> {
                public int h;
                public final /* synthetic */ y i;
                public final /* synthetic */ x j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(x xVar, y yVar, com.amazon.aps.iva.ob0.d dVar) {
                    super(2, dVar);
                    this.i = yVar;
                    this.j = xVar;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                    return new b(this.j, this.i, dVar);
                }

                @Override // com.amazon.aps.iva.xb0.p
                public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super Long> dVar) {
                    return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    Long l;
                    long longValue;
                    com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                    int i = this.h;
                    y yVar = this.i;
                    if (i != 0) {
                        if (i == 1) {
                            com.amazon.aps.iva.ab.x.i0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        com.amazon.aps.iva.ab.x.i0(obj);
                        l = yVar.f;
                        if (l == null) {
                            this.h = 1;
                            obj = this.j.b.o(new String[]{yVar.b}, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        }
                        longValue = l.longValue();
                        return new Long(longValue);
                    }
                    Playhead playhead = (Playhead) ((Map) obj).get(yVar.b);
                    if (playhead != null) {
                        l = new Long(PlayheadKt.getPlayheadToPlaySec(playhead));
                    } else {
                        l = null;
                    }
                    if (l == null) {
                        longValue = 0;
                        return new Long(longValue);
                    }
                    longValue = l.longValue();
                    return new Long(longValue);
                }
            }

            /* compiled from: WatchScreenViewModel.kt */
            @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.WatchScreenViewModelImpl$currentUpNextFlow$2$2$skipEventsJob$1", f = "WatchScreenViewModel.kt", l = {115}, m = "invokeSuspend")
            /* loaded from: classes2.dex */
            public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super SkipEvents>, Object> {
                public int h;
                public /* synthetic */ Object i;
                public final /* synthetic */ x j;
                public final /* synthetic */ y k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(x xVar, y yVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
                    super(2, dVar);
                    this.j = xVar;
                    this.k = yVar;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                    c cVar = new c(this.j, this.k, dVar);
                    cVar.i = obj;
                    return cVar;
                }

                @Override // com.amazon.aps.iva.xb0.p
                public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super SkipEvents> dVar) {
                    return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    Object H;
                    com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                    int i = this.h;
                    try {
                        if (i != 0) {
                            if (i == 1) {
                                com.amazon.aps.iva.ab.x.i0(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            com.amazon.aps.iva.ab.x.i0(obj);
                            g0 g0Var = (g0) this.i;
                            x xVar = this.j;
                            y yVar = this.k;
                            com.amazon.aps.iva.fg.e eVar = xVar.d;
                            String str = yVar.b;
                            this.h = 1;
                            obj = eVar.getSkipEvents(str, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        }
                        H = (SkipEvents) obj;
                    } catch (Throwable th) {
                        H = com.amazon.aps.iva.ab.x.H(th);
                    }
                    if (H instanceof k.a) {
                        return null;
                    }
                    return H;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x xVar, y yVar, com.amazon.aps.iva.ob0.d dVar) {
                super(2, dVar);
                this.o = yVar;
                this.p = xVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                a aVar = new a(this.p, this.o, dVar);
                aVar.n = obj;
                return aVar;
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.no.b> dVar) {
                return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00bf A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00c0  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
            @Override // com.amazon.aps.iva.qb0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 224
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qo.x.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.i = obj;
            return dVar2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(y yVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.no.b> dVar) {
            return ((d) create(yVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0085 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ab A[RETURN] */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r10.h
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 1
                r6 = 2
                com.amazon.aps.iva.qo.x r7 = com.amazon.aps.iva.qo.x.this
                r8 = 0
                if (r1 == 0) goto L40
                if (r1 == r5) goto L38
                if (r1 == r6) goto L34
                if (r1 == r4) goto L2e
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                com.amazon.aps.iva.ab.x.i0(r11)
                goto Lac
            L1d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L25:
                java.lang.Object r1 = r10.i
                com.amazon.aps.iva.qo.y r1 = (com.amazon.aps.iva.qo.y) r1
                com.amazon.aps.iva.ab.x.i0(r11)
                goto L9c
            L2e:
                java.lang.Object r0 = r10.i
                com.amazon.aps.iva.ab.x.i0(r11)
                goto L87
            L34:
                com.amazon.aps.iva.ab.x.i0(r11)
                goto L6b
            L38:
                java.lang.Object r1 = r10.i
                com.amazon.aps.iva.qo.y r1 = (com.amazon.aps.iva.qo.y) r1
                com.amazon.aps.iva.ab.x.i0(r11)
                goto L5a
            L40:
                com.amazon.aps.iva.ab.x.i0(r11)
                java.lang.Object r11 = r10.i
                com.amazon.aps.iva.qo.y r11 = (com.amazon.aps.iva.qo.y) r11
                com.amazon.aps.iva.az.h r1 = r7.f
                com.amazon.aps.iva.ez.g$b r9 = new com.amazon.aps.iva.ez.g$b
                r9.<init>(r8)
                r10.i = r11
                r10.h = r5
                java.lang.Object r1 = r1.a(r9, r10)
                if (r1 != r0) goto L59
                return r0
            L59:
                r1 = r11
            L5a:
                java.lang.String r11 = r1.b
                if (r11 != 0) goto L8a
                com.amazon.aps.iva.bp.b r11 = r7.b
                r10.i = r8
                r10.h = r6
                java.lang.Object r11 = r11.t(r10)
                if (r11 != r0) goto L6b
                return r0
            L6b:
                r1 = r11
                com.amazon.aps.iva.no.b r1 = (com.amazon.aps.iva.no.b) r1
                com.amazon.aps.iva.az.h r2 = r7.f
                com.amazon.aps.iva.ez.g$c r3 = new com.amazon.aps.iva.ez.g$c
                com.ellation.crunchyroll.model.PlayableAsset r1 = r1.a
                java.lang.String r1 = r1.getId()
                r3.<init>(r1, r8)
                r10.i = r11
                r10.h = r4
                java.lang.Object r1 = r2.a(r3, r10)
                if (r1 != r0) goto L86
                return r0
            L86:
                r0 = r11
            L87:
                com.amazon.aps.iva.no.b r0 = (com.amazon.aps.iva.no.b) r0
                goto Laf
            L8a:
                com.amazon.aps.iva.az.h r4 = r7.f
                com.amazon.aps.iva.ez.g$c r5 = new com.amazon.aps.iva.ez.g$c
                r5.<init>(r11, r8)
                r10.i = r1
                r10.h = r3
                java.lang.Object r11 = r4.a(r5, r10)
                if (r11 != r0) goto L9c
                return r0
            L9c:
                com.amazon.aps.iva.qo.x$d$a r11 = new com.amazon.aps.iva.qo.x$d$a
                r11.<init>(r7, r1, r8)
                r10.i = r8
                r10.h = r2
                java.lang.Object r11 = com.amazon.aps.iva.e.z.p(r11, r10)
                if (r11 != r0) goto Lac
                return r0
            Lac:
                r0 = r11
                com.amazon.aps.iva.no.b r0 = (com.amazon.aps.iva.no.b) r0
            Laf:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qo.x.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WatchScreenViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.qo.g, LabelUiModel> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final LabelUiModel invoke(com.amazon.aps.iva.qo.g gVar) {
            com.amazon.aps.iva.qo.g gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "watchScreenData");
            return LabelUiModelKt.toLabelUiModel$default(gVar2.b.a, false, 1, null);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes2.dex */
    public static final class f implements com.amazon.aps.iva.ve0.f<PlayableAsset> {
        public final /* synthetic */ com.amazon.aps.iva.ve0.f b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes2.dex */
        public static final class a<T> implements com.amazon.aps.iva.ve0.g {
            public final /* synthetic */ com.amazon.aps.iva.ve0.g b;

            /* compiled from: Emitters.kt */
            @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.WatchScreenViewModelImpl$special$$inlined$mapNotNull$1$2", f = "WatchScreenViewModel.kt", l = {225}, m = "emit")
            /* renamed from: com.amazon.aps.iva.qo.x$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0652a extends com.amazon.aps.iva.qb0.c {
                public /* synthetic */ Object h;
                public int i;

                public C0652a(com.amazon.aps.iva.ob0.d dVar) {
                    super(dVar);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    this.h = obj;
                    this.i |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(com.amazon.aps.iva.ve0.g gVar) {
                this.b = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // com.amazon.aps.iva.ve0.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r5, com.amazon.aps.iva.ob0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.amazon.aps.iva.qo.x.f.a.C0652a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.amazon.aps.iva.qo.x$f$a$a r0 = (com.amazon.aps.iva.qo.x.f.a.C0652a) r0
                    int r1 = r0.i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.i = r1
                    goto L18
                L13:
                    com.amazon.aps.iva.qo.x$f$a$a r0 = new com.amazon.aps.iva.qo.x$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.h
                    com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r2 = r0.i
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    com.amazon.aps.iva.ab.x.i0(r6)
                    goto L43
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    com.amazon.aps.iva.ab.x.i0(r6)
                    com.amazon.aps.iva.no.b r5 = (com.amazon.aps.iva.no.b) r5
                    com.ellation.crunchyroll.model.PlayableAsset r5 = r5.a
                    if (r5 == 0) goto L43
                    r0.i = r3
                    com.amazon.aps.iva.ve0.g r6 = r4.b
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qo.x.f.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
            }
        }

        public f(com.amazon.aps.iva.xy.b bVar) {
            this.b = bVar;
        }

        @Override // com.amazon.aps.iva.ve0.f
        public final Object c(com.amazon.aps.iva.ve0.g<? super PlayableAsset> gVar, com.amazon.aps.iva.ob0.d dVar) {
            Object c = this.b.c(new a(gVar), dVar);
            if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return c;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.qo.g, com.amazon.aps.iva.hp.c> {
        public static final g h = new g();

        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.hp.c invoke(com.amazon.aps.iva.qo.g gVar) {
            String str;
            com.amazon.aps.iva.qo.g gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "watchScreenData");
            PlayableAsset playableAsset = gVar2.b.a;
            String title = gVar2.a.getTitle();
            com.amazon.aps.iva.yb0.j.f(playableAsset, "<this>");
            com.amazon.aps.iva.yb0.j.f(title, "parentTitle");
            com.amazon.aps.iva.mt.p W = f1.W(playableAsset);
            String description = playableAsset.getDescription();
            ExtendedMaturityRating extendedMaturityRating = playableAsset.getExtendedMaturityRating();
            if (extendedMaturityRating != null) {
                str = extendedMaturityRating.getRating();
            } else {
                str = null;
            }
            return new com.amazon.aps.iva.hp.c(W, title, description, str, LabelUiModelKt.toLabelUiModel$default(playableAsset, false, 1, null));
        }
    }

    /* compiled from: WatchScreenViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.WatchScreenViewModelImpl$upNextAssetFlow$1", f = "WatchScreenViewModel.kt", l = {WebSocketProtocol.PAYLOAD_SHORT, 128}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<String, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.no.b>, Object> {
        public int h;
        public /* synthetic */ Object i;

        public h(com.amazon.aps.iva.ob0.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            h hVar = new h(dVar);
            hVar.i = obj;
            return hVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.no.b> dVar) {
            return ((h) create(str, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r13.h
                r2 = 0
                com.amazon.aps.iva.qo.x r3 = com.amazon.aps.iva.qo.x.this
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 != r4) goto L19
                java.lang.Object r0 = r13.i
                com.ellation.crunchyroll.model.PlayableAsset r0 = (com.ellation.crunchyroll.model.PlayableAsset) r0
                com.amazon.aps.iva.ab.x.i0(r14)     // Catch: java.lang.Throwable -> L17
                goto L4e
            L17:
                r14 = move-exception
                goto L55
            L19:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L21:
                com.amazon.aps.iva.ab.x.i0(r14)
                goto L37
            L25:
                com.amazon.aps.iva.ab.x.i0(r14)
                java.lang.Object r14 = r13.i
                java.lang.String r14 = (java.lang.String) r14
                com.amazon.aps.iva.lo.f r1 = r3.c
                r13.h = r5
                java.lang.Object r14 = r1.c(r14, r13)
                if (r14 != r0) goto L37
                return r0
            L37:
                com.ellation.crunchyroll.model.PlayableAsset r14 = (com.ellation.crunchyroll.model.PlayableAsset) r14
                if (r14 == 0) goto L70
                com.amazon.aps.iva.fg.e r1 = r3.d     // Catch: java.lang.Throwable -> L51
                java.lang.String r3 = r14.getId()     // Catch: java.lang.Throwable -> L51
                r13.i = r14     // Catch: java.lang.Throwable -> L51
                r13.h = r4     // Catch: java.lang.Throwable -> L51
                java.lang.Object r1 = r1.getSkipEvents(r3, r13)     // Catch: java.lang.Throwable -> L51
                if (r1 != r0) goto L4c
                return r0
            L4c:
                r0 = r14
                r14 = r1
            L4e:
                com.ellation.crunchyroll.api.etp.playback.model.SkipEvents r14 = (com.ellation.crunchyroll.api.etp.playback.model.SkipEvents) r14     // Catch: java.lang.Throwable -> L17
                goto L59
            L51:
                r0 = move-exception
                r12 = r0
                r0 = r14
                r14 = r12
            L55:
                com.amazon.aps.iva.kb0.k$a r14 = com.amazon.aps.iva.ab.x.H(r14)
            L59:
                r4 = r0
                boolean r0 = r14 instanceof com.amazon.aps.iva.kb0.k.a
                if (r0 == 0) goto L5f
                goto L60
            L5f:
                r2 = r14
            L60:
                r10 = r2
                com.ellation.crunchyroll.api.etp.playback.model.SkipEvents r10 = (com.ellation.crunchyroll.api.etp.playback.model.SkipEvents) r10
                com.amazon.aps.iva.no.b r2 = new com.amazon.aps.iva.no.b
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r11 = 30
                r3 = r2
                r3.<init>(r4, r5, r6, r7, r8, r10, r11)
            L70:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qo.x.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WatchScreenViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<ContentContainer, com.amazon.aps.iva.no.b, com.amazon.aps.iva.qo.g> {
        public static final i h = new i();

        public i() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.qo.g invoke(ContentContainer contentContainer, com.amazon.aps.iva.no.b bVar) {
            ContentContainer contentContainer2 = contentContainer;
            com.amazon.aps.iva.no.b bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(contentContainer2, "first");
            com.amazon.aps.iva.yb0.j.f(bVar2, "second");
            return new com.amazon.aps.iva.qo.g(contentContainer2, bVar2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.amazon.aps.iva.ap.g gVar, androidx.lifecycle.p pVar, com.amazon.aps.iva.bp.b bVar, com.amazon.aps.iva.lo.f fVar, com.amazon.aps.iva.fg.e eVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(gVar, "input");
        com.amazon.aps.iva.yb0.j.f(pVar, "savedStateHandle");
        com.amazon.aps.iva.yb0.j.f(bVar, "watchScreenInteractor");
        com.amazon.aps.iva.yb0.j.f(fVar, "nextAssetInteractor");
        com.amazon.aps.iva.yb0.j.f(eVar, "skipEventsInteractor");
        this.b = bVar;
        this.c = fVar;
        this.d = eVar;
        com.amazon.aps.iva.ti.a t = com.amazon.aps.iva.ab.x.t(pVar, "watch_screen_state", y.a.a(gVar), com.amazon.aps.iva.e.w.D(this));
        this.e = t;
        com.amazon.aps.iva.az.h hVar = new com.amazon.aps.iva.az.h(new g.b(null), 2);
        this.f = hVar;
        com.amazon.aps.iva.az.d d2 = com.amazon.aps.iva.xy.m.d(t, com.amazon.aps.iva.e.w.D(this), null, new a(null), 6);
        this.g = d2;
        com.amazon.aps.iva.az.d d3 = com.amazon.aps.iva.xy.m.d(t, com.amazon.aps.iva.e.w.D(this), c.h, new d(null), 2);
        this.h = d3;
        this.i = com.amazon.aps.iva.xy.m.c(hVar, com.amazon.aps.iva.e.w.D(this), null, null, new h(null), 14);
        g0 D = com.amazon.aps.iva.e.w.D(this);
        i iVar = i.h;
        com.amazon.aps.iva.yb0.j.f(iVar, "transform");
        com.amazon.aps.iva.bz.d dVar = new com.amazon.aps.iva.bz.d(iVar, D, d2, d3);
        this.j = dVar;
        androidx.lifecycle.c b2 = com.amazon.aps.iva.i5.j.b(dVar, com.amazon.aps.iva.e.w.D(this).getCoroutineContext());
        this.k = b2;
        this.l = com.amazon.aps.iva.ez.h.b(b2, g.h);
        this.m = com.amazon.aps.iva.ez.h.b(b2, e.h);
        this.n = com.amazon.aps.iva.ez.h.b(b2, b.h);
        this.o = com.amazon.aps.iva.i5.j.b(com.amazon.aps.iva.dg.b.m(new f(com.amazon.aps.iva.xy.m.a(d3))), com.amazon.aps.iva.e.w.D(this).getCoroutineContext());
    }

    @Override // com.amazon.aps.iva.qo.w
    public final LiveData<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.qo.g>> D5() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.qo.w
    public final com.amazon.aps.iva.az.b L8() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.qo.w
    public final com.amazon.aps.iva.az.b P1() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.qo.w
    public final void U3() {
        this.i.e(false);
    }

    @Override // com.amazon.aps.iva.qo.w
    public final void V7(long j, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "mediaId");
        this.b.u();
        com.amazon.aps.iva.ti.a aVar = this.e;
        aVar.d(y.a((y) aVar.getValue(), str, Long.valueOf(j), 44));
    }

    @Override // com.amazon.aps.iva.qo.w
    public final androidx.lifecycle.c c1() {
        return this.o;
    }

    @Override // com.amazon.aps.iva.qo.w
    public final void c8(PlayableAsset playableAsset, Playhead playhead) {
        long j;
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        if (com.amazon.aps.iva.yb0.j.a(getCurrentAsset(), playableAsset)) {
            return;
        }
        if (playhead != null) {
            j = PlayheadKt.getPlayheadToPlaySec(playhead);
        } else {
            j = 0;
        }
        this.e.d(y.a.b(playableAsset, Long.valueOf(j)));
    }

    @Override // com.amazon.aps.iva.qo.w
    public final com.amazon.aps.iva.i5.u f4() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.qo.w
    public final PlayableAsset getCurrentAsset() {
        com.amazon.aps.iva.no.b bVar = (com.amazon.aps.iva.no.b) com.amazon.aps.iva.xy.m.b(this.h);
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.qo.w
    public final ContentContainer h0() {
        return (ContentContainer) com.amazon.aps.iva.xy.m.b(this.g);
    }

    @Override // com.amazon.aps.iva.qo.w
    public final com.amazon.aps.iva.i5.u h4() {
        return this.m;
    }

    @Override // com.amazon.aps.iva.qo.w
    public final void i5(String str) {
        PlayableAsset playableAsset;
        com.amazon.aps.iva.yb0.j.f(str, "currentAssetId");
        com.amazon.aps.iva.no.b bVar = (com.amazon.aps.iva.no.b) com.amazon.aps.iva.xy.m.b(this.i);
        if (bVar != null && (playableAsset = bVar.a) != null) {
            this.e.d(y.a.b(playableAsset, 0L));
        }
    }

    @Override // com.amazon.aps.iva.qo.w
    public final com.amazon.aps.iva.az.f<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.qo.g>> k2() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.qo.w
    public final void l0(boolean z) {
        com.amazon.aps.iva.ti.a aVar = this.e;
        if (z) {
            this.b.u();
            aVar.d(y.a((y) aVar.getValue(), null, null, 61));
            return;
        }
        aVar.d(aVar.getValue());
    }

    @Override // com.amazon.aps.iva.qo.w
    public final y o0() {
        return (y) this.e.getValue();
    }

    @Override // com.amazon.aps.iva.qo.w
    public final com.amazon.aps.iva.az.a u4() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.qo.w
    public final LiveData<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.sf.e>> x() {
        return this.n;
    }
}
