package com.amazon.aps.iva.d10;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.sv.c;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.Panel;
import com.google.ads.AdSize;
import java.util.Collection;
import java.util.List;
/* compiled from: DownloadedPanelsInteractor.kt */
/* loaded from: classes2.dex */
public final class l extends q {
    public final f c;
    public final /* synthetic */ p d;

    /* compiled from: DownloadedPanelsInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Panel, List<? extends e0>, i> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final i invoke(Panel panel, List<? extends e0> list) {
            int i;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            j jVar;
            Panel panel2 = panel;
            List<? extends e0> list2 = list;
            com.amazon.aps.iva.yb0.j.f(panel2, "panel");
            com.amazon.aps.iva.yb0.j.f(list2, "localVideos");
            List<? extends e0> list3 = list2;
            boolean z7 = list3 instanceof Collection;
            if (z7 && list3.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (e0 e0Var : list3) {
                    if (e0Var.i() && (i = i + 1) < 0) {
                        f1.R();
                        throw null;
                    }
                }
            }
            if (!z7 || !list3.isEmpty()) {
                for (e0 e0Var2 : list3) {
                    if (e0Var2.l()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                jVar = j.IN_PROGRESS;
            } else {
                if (!z7 || !list3.isEmpty()) {
                    for (e0 e0Var3 : list3) {
                        if (e0Var3.m()) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    jVar = j.WAITING;
                } else {
                    if (!z7 || !list3.isEmpty()) {
                        for (e0 e0Var4 : list3) {
                            if (e0Var4.g() == e0.b.PAUSED) {
                                z3 = true;
                                continue;
                            } else {
                                z3 = false;
                                continue;
                            }
                            if (z3) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                    z4 = false;
                    if (z4) {
                        jVar = j.PAUSED;
                    } else {
                        if (!z7 || !list3.isEmpty()) {
                            for (e0 e0Var5 : list3) {
                                if (e0Var5.k()) {
                                    z5 = true;
                                    break;
                                }
                            }
                        }
                        z5 = false;
                        if (z5) {
                            jVar = j.FAILED;
                        } else {
                            if (!z7 || !list3.isEmpty()) {
                                for (e0 e0Var6 : list3) {
                                    if (e0Var6.j()) {
                                        z6 = true;
                                        break;
                                    }
                                }
                            }
                            z6 = false;
                            if (z6) {
                                jVar = j.EXPIRED;
                            } else {
                                int i2 = h.a[panel2.getResourceType().ordinal()];
                                if (i2 != 1 && i2 != 2) {
                                    jVar = j.COMPLETED_EPISODES;
                                } else {
                                    jVar = j.COMPLETED_MOVIES;
                                }
                            }
                        }
                    }
                }
            }
            return new i(panel2, jVar, i, false);
        }
    }

    /* compiled from: DownloadedPanelsInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.downloads.DownloadedPanelsInteractorImpl$panelsListener$2$1$onPanelsUpdate$1", f = "DownloadedPanelsInteractor.kt", l = {AdSize.PORTRAIT_AD_HEIGHT}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ p j;

        /* compiled from: DownloadedPanelsInteractor.kt */
        /* loaded from: classes2.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends i>, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ p h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar) {
                super(1);
                this.h = pVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(List<? extends i> list) {
                List<? extends i> list2 = list;
                com.amazon.aps.iva.yb0.j.f(list2, "it");
                this.h.e.notify(new m(list2));
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = pVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
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
                f fVar = l.this.c;
                a aVar2 = new a(this.j);
                this.h = 1;
                fVar.getClass();
                fVar.a.Z(new d(fVar, aVar2));
                if (com.amazon.aps.iva.kb0.q.a == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadedPanelsInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.downloads.DownloadedPanelsInteractorImpl$panelsListener$2$1$onVideoUpdate$1", f = "DownloadedPanelsInteractor.kt", l = {58}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;
        public final /* synthetic */ p k;

        /* compiled from: DownloadedPanelsInteractor.kt */
        /* loaded from: classes2.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<i, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ p h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar) {
                super(1);
                this.h = pVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(i iVar) {
                i iVar2 = iVar;
                com.amazon.aps.iva.yb0.j.f(iVar2, "it");
                this.h.e.notify(new n(iVar2));
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, p pVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
            this.j = str;
            this.k = pVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
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
                f fVar = l.this.c;
                a aVar2 = new a(this.k);
                this.h = 1;
                if (fVar.b(this.j, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public l(p pVar) {
        this.d = pVar;
        InternalDownloadsManager internalDownloadsManager = pVar.b;
        com.amazon.aps.iva.sv.c.n0.getClass();
        com.amazon.aps.iva.sv.d dVar = c.a.b;
        com.amazon.aps.iva.yb0.j.f(internalDownloadsManager, "downloadsManager");
        a aVar = a.h;
        com.amazon.aps.iva.yb0.j.f(aVar, "createDownloadPanel");
        com.amazon.aps.iva.yb0.j.f(dVar, "coroutineScope");
        com.amazon.aps.iva.wu.a aVar2 = pVar.d;
        com.amazon.aps.iva.yb0.j.f(aVar2, "coroutineContextProvider");
        this.c = new f(internalDownloadsManager, aVar, dVar, aVar2);
    }

    @Override // com.amazon.aps.iva.d10.q
    public final void c() {
        p pVar = this.d;
        com.amazon.aps.iva.se0.i.d(pVar, pVar.d.a(), null, new b(pVar, null), 2);
    }

    @Override // com.amazon.aps.iva.d10.q
    public final void d(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        p pVar = this.d;
        com.amazon.aps.iva.se0.i.d(pVar, pVar.d.a(), null, new c(str, pVar, null), 2);
    }
}
