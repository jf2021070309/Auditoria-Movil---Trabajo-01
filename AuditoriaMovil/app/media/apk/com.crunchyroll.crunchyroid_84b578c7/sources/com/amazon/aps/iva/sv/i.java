package com.amazon.aps.iva.sv;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.ew.b;
import com.amazon.aps.iva.gw.a;
import com.amazon.aps.iva.ow.a;
import com.amazon.aps.iva.sv.a2;
import com.amazon.aps.iva.sv.c;
import com.amazon.aps.iva.sv.e;
import com.amazon.aps.iva.sv.u1;
import com.amazon.aps.iva.wv.d;
import com.amazon.aps.iva.wv.n0;
import com.amazon.aps.iva.wv.o;
import com.amazon.aps.iva.x50.q;
import com.crunchyroll.connectivity.d;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.download.DownloadService;
import com.ellation.crunchyroll.application.d;
import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.queue.LocalVideosManagerQueue;
import com.ellation.crunchyroll.presentation.download.notification.b;
import java.io.File;
/* compiled from: DownloadingModule.kt */
/* loaded from: classes2.dex */
public final class i implements com.amazon.aps.iva.sv.h {
    public final boolean b = true;
    public final com.amazon.aps.iva.sv.d c;
    public final com.amazon.aps.iva.rw.e d;
    public final LocalVideosManagerQueue e;
    public final DownloadsManagerImpl f;
    public final l g;

    /* compiled from: DownloadingModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xb0.l<? super Boolean, ? extends com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.x50.k<Boolean>> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.x50.k<Boolean> invoke(com.amazon.aps.iva.xb0.l<? super Boolean, ? extends com.amazon.aps.iva.kb0.q> lVar) {
            com.amazon.aps.iva.xb0.l<? super Boolean, ? extends com.amazon.aps.iva.kb0.q> lVar2 = lVar;
            com.amazon.aps.iva.yb0.j.f(lVar2, "onConnectionRefresh");
            int i = com.amazon.aps.iva.x50.k.a;
            int i2 = com.amazon.aps.iva.x50.m.a;
            return new com.amazon.aps.iva.x50.j(500L, new com.amazon.aps.iva.x50.n(new Handler(Looper.getMainLooper())), new j(lVar2));
        }
    }

    /* compiled from: DownloadingModule.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<InternalDownloadsManager> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final InternalDownloadsManager invoke() {
            return i.this.f;
        }
    }

    /* compiled from: DownloadingModule.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class e extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<Boolean> {
        public e(com.amazon.aps.iva.x50.r rVar) {
            super(0, rVar, com.amazon.aps.iva.x50.q.class, "hasNetworkConnection", "hasNetworkConnection()Z", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            return Boolean.valueOf(((com.amazon.aps.iva.x50.q) this.receiver).c());
        }
    }

    /* compiled from: DownloadingModule.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
        public static final h h = new h();

        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            com.amazon.aps.iva.zv.b bVar = com.amazon.aps.iva.sv.e.e;
            if (bVar != null) {
                return bVar.s().b();
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: DownloadingModule.kt */
    /* renamed from: com.amazon.aps.iva.sv.i$i  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0716i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<o2> {
        public static final C0716i h = new C0716i();

        public C0716i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final o2 invoke() {
            com.amazon.aps.iva.zv.b bVar = com.amazon.aps.iva.sv.e.e;
            if (bVar != null) {
                return bVar.h();
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [com.amazon.aps.iva.sv.i$a] */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.amazon.aps.iva.sv.i$c] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.amazon.aps.iva.sv.i$f] */
    public i(Context context) {
        com.amazon.aps.iva.rw.e eVar;
        v1 v1Var;
        com.amazon.aps.iva.sv.c.n0.getClass();
        com.amazon.aps.iva.sv.d dVar = c.a.b;
        this.c = dVar;
        com.amazon.aps.iva.wu.b bVar = com.amazon.aps.iva.wu.b.a;
        if (q.a.a == null) {
            q.a.a = new com.amazon.aps.iva.x50.r(context);
        }
        com.amazon.aps.iva.x50.r rVar = q.a.a;
        com.amazon.aps.iva.yb0.j.c(rVar);
        com.amazon.aps.iva.yb0.j.f(dVar, "coroutineScope");
        com.ellation.crunchyroll.downloading.e eVar2 = new com.ellation.crunchyroll.downloading.e(dVar);
        com.amazon.aps.iva.rw.e eVar3 = new com.amazon.aps.iva.rw.e(context, h.h, C0716i.h);
        this.d = eVar3;
        l2 l2Var = new l2(context, dVar, new com.amazon.aps.iva.pw.c(new d()), new e(rVar), eVar3, eVar2);
        LocalVideosManagerQueue a2 = l2Var.a(null);
        this.e = a2;
        com.amazon.aps.iva.sv.g gVar = com.amazon.aps.iva.sv.e.f;
        if (gVar != null) {
            DownloadService u = gVar.u();
            com.amazon.aps.iva.zv.b bVar2 = com.amazon.aps.iva.sv.e.e;
            if (bVar2 != null) {
                o2 h2 = bVar2.h();
                com.amazon.aps.iva.yb0.j.f(u, "downloadService");
                com.amazon.aps.iva.yb0.j.f(h2, "configuration");
                com.amazon.aps.iva.bw.p pVar = new com.amazon.aps.iva.bw.p(eVar3, u, h2);
                com.amazon.aps.iva.bw.e eVar4 = l2Var.i;
                if (eVar4 != null) {
                    q1 q1Var = l2Var.j;
                    if (q1Var != null) {
                        com.amazon.aps.iva.bw.n nVar = new com.amazon.aps.iva.bw.n(eVar4, q1Var);
                        com.amazon.aps.iva.ew.c cVar = b.a.a;
                        if (cVar == null) {
                            Context applicationContext = context.getApplicationContext();
                            com.amazon.aps.iva.yb0.j.e(applicationContext, "context.applicationContext");
                            cVar = new com.amazon.aps.iva.ew.c(applicationContext);
                            b.a.a = cVar;
                        }
                        com.amazon.aps.iva.ew.c cVar2 = b.a.a;
                        if (cVar2 == null) {
                            eVar = eVar3;
                            Context applicationContext2 = context.getApplicationContext();
                            com.amazon.aps.iva.yb0.j.e(applicationContext2, "context.applicationContext");
                            cVar2 = new com.amazon.aps.iva.ew.c(applicationContext2);
                            b.a.a = cVar2;
                        } else {
                            eVar = eVar3;
                        }
                        com.amazon.aps.iva.ew.e eVar5 = new com.amazon.aps.iva.ew.e(nVar, cVar, new com.amazon.aps.iva.ew.j(cVar2));
                        com.amazon.aps.iva.ew.g gVar2 = new com.amazon.aps.iva.ew.g(eVar5, e.a.a().n(), d.a.a(), dVar);
                        com.amazon.aps.iva.zv.d C = e.a.a().C();
                        com.amazon.aps.iva.nw.e eVar6 = l2Var.k;
                        if (eVar6 != null) {
                            com.amazon.aps.iva.yb0.j.f(C, "networkModule");
                            v1 a3 = u1.a.a();
                            File filesDir = context.getFilesDir();
                            com.amazon.aps.iva.yb0.j.e(filesDir, "filesDir");
                            com.amazon.aps.iva.wv.o0 o0Var = n0.a.a;
                            if (o0Var != null) {
                                v1Var = a3;
                            } else {
                                v1Var = a3;
                                Context applicationContext3 = context.getApplicationContext();
                                com.amazon.aps.iva.yb0.j.e(applicationContext3, "context.applicationContext");
                                o0Var = new com.amazon.aps.iva.wv.o0(applicationContext3);
                                n0.a.a = o0Var;
                            }
                            com.amazon.aps.iva.wv.o0 o0Var2 = o0Var;
                            c2 a4 = a2.a.a(dVar);
                            com.amazon.aps.iva.ye0.b bVar3 = com.amazon.aps.iva.se0.r0.b;
                            com.amazon.aps.iva.yb0.j.f(bVar3, "dispatcher");
                            v1 v1Var2 = v1Var;
                            com.amazon.aps.iva.rw.e eVar7 = eVar;
                            com.amazon.aps.iva.qw.h hVar = new com.amazon.aps.iva.qw.h(filesDir + "/downloads/subtitles", o0Var2, com.amazon.aps.iva.qw.f.h, a4, dVar, bVar3);
                            com.amazon.aps.iva.wv.f fVar = n0.a.b;
                            if (fVar == null) {
                                Context applicationContext4 = context.getApplicationContext();
                                com.amazon.aps.iva.yb0.j.e(applicationContext4, "context.applicationContext");
                                fVar = new com.amazon.aps.iva.wv.f(applicationContext4);
                                n0.a.b = fVar;
                            }
                            com.amazon.aps.iva.wv.f fVar2 = fVar;
                            c2 a5 = a2.a.a(dVar);
                            com.amazon.aps.iva.qw.h hVar2 = new com.amazon.aps.iva.qw.h(filesDir + "/downloads/captions", fVar2, com.amazon.aps.iva.qw.e.h, a5, dVar, bVar3);
                            com.amazon.aps.iva.wv.e eVar8 = d.a.a;
                            if (eVar8 == null) {
                                Context applicationContext5 = context.getApplicationContext();
                                com.amazon.aps.iva.yb0.j.e(applicationContext5, "context.applicationContext");
                                eVar8 = new com.amazon.aps.iva.wv.e(applicationContext5);
                                d.a.a = eVar8;
                            }
                            c2 a6 = a2.a.a(dVar);
                            com.ellation.crunchyroll.downloading.b bVar4 = new com.ellation.crunchyroll.downloading.b(filesDir + "/downloads/bif", eVar8, a6, dVar);
                            com.amazon.aps.iva.ow.b bVar5 = a.C0586a.a;
                            if (bVar5 == null) {
                                Context applicationContext6 = context.getApplicationContext();
                                com.amazon.aps.iva.yb0.j.e(applicationContext6, "context.applicationContext");
                                bVar5 = new com.amazon.aps.iva.ow.b(applicationContext6);
                                a.C0586a.a = bVar5;
                            }
                            r2 r2Var = new r2(bVar5, new s2(C.getSkipEventsService()), dVar);
                            EtpContentService a7 = C.a();
                            com.amazon.aps.iva.ye0.c cVar3 = com.amazon.aps.iva.wu.b.d;
                            com.amazon.aps.iva.zv.b bVar6 = com.amazon.aps.iva.sv.e.e;
                            if (bVar6 != null) {
                                com.amazon.aps.iva.sw.e eVar9 = new com.amazon.aps.iva.sw.e(pVar, hVar, hVar2, bVar4, r2Var, a7, dVar, cVar3, bVar6.A());
                                EtpContentService a8 = C.a();
                                com.amazon.aps.iva.zv.b bVar7 = com.amazon.aps.iva.sv.e.e;
                                if (bVar7 != null) {
                                    com.amazon.aps.iva.nw.c cVar4 = new com.amazon.aps.iva.nw.c(a8, eVar5, bVar7.F(), eVar6, new b0(a2));
                                    u2 u2Var = new u2(context);
                                    com.amazon.aps.iva.wv.p pVar2 = o.a.a;
                                    if (pVar2 == null) {
                                        Context applicationContext7 = context.getApplicationContext();
                                        com.amazon.aps.iva.yb0.j.e(applicationContext7, "context.applicationContext");
                                        pVar2 = new com.amazon.aps.iva.wv.p(applicationContext7);
                                        o.a.a = pVar2;
                                    }
                                    c2 a9 = a2.a.a(dVar);
                                    com.ellation.crunchyroll.downloading.a0 a0Var = new com.ellation.crunchyroll.downloading.a0(filesDir + "/downloads/img", pVar2, a9, dVar);
                                    v1Var2.v = new c0(a0Var);
                                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                                    com.amazon.aps.iva.ds.c cVar5 = com.amazon.aps.iva.ds.c.b;
                                    com.amazon.aps.iva.rw.d dVar2 = new com.amazon.aps.iva.rw.d(v1Var2, eVar7);
                                    if (q.a.a == null) {
                                        q.a.a = new com.amazon.aps.iva.x50.r(context);
                                    }
                                    com.amazon.aps.iva.x50.r rVar2 = q.a.a;
                                    com.amazon.aps.iva.yb0.j.c(rVar2);
                                    com.amazon.aps.iva.tv.d dVar3 = new com.amazon.aps.iva.tv.d(v1Var2, dVar2, rVar2);
                                    com.amazon.aps.iva.zv.b bVar8 = com.amazon.aps.iva.sv.e.e;
                                    if (bVar8 != null) {
                                        DownloadsManagerImpl downloadsManagerImpl = new DownloadsManagerImpl(v1Var2, eVar9, cVar4, u2Var, hVar, hVar2, bVar4, a0Var, r2Var, dVar3, a2, com.amazon.aps.iva.ab.x.G(bVar8.F()), dVar);
                                        downloadsManagerImpl.addEventListener(new com.amazon.aps.iva.rw.a(v1Var2, eVar7, dVar));
                                        eVar2.c = downloadsManagerImpl;
                                        downloadsManagerImpl.addEventListener(gVar2);
                                        this.f = downloadsManagerImpl;
                                        com.amazon.aps.iva.q00.e eVar10 = new com.amazon.aps.iva.q00.e(rVar, new com.amazon.aps.iva.yb0.n(e.a.a().q()) { // from class: com.amazon.aps.iva.sv.i.g
                                            @Override // com.amazon.aps.iva.fc0.m
                                            public final Object get() {
                                                return Boolean.valueOf(((com.amazon.aps.iva.zv.g) this.receiver).a());
                                            }

                                            @Override // com.amazon.aps.iva.fc0.i
                                            public final void set(Object obj) {
                                                ((com.amazon.aps.iva.zv.g) this.receiver).b(((Boolean) obj).booleanValue());
                                            }
                                        });
                                        com.amazon.aps.iva.b10.o oVar = b.a.a;
                                        if (oVar == null) {
                                            oVar = new com.amazon.aps.iva.b10.o(context);
                                            b.a.a = oVar;
                                        }
                                        com.amazon.aps.iva.b10.f fVar3 = new com.amazon.aps.iva.b10.f(context, downloadsManagerImpl, oVar, dVar, e.a.a().s().a());
                                        p1 p1Var = new p1(context);
                                        com.amazon.aps.iva.zv.h s = e.a.a().s();
                                        ?? r3 = new com.amazon.aps.iva.yb0.t(e.a.a().F()) { // from class: com.amazon.aps.iva.sv.i.c
                                            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                                            public final Object get() {
                                                return Boolean.valueOf(((com.amazon.aps.iva.zv.a) this.receiver).r());
                                            }
                                        };
                                        com.ellation.crunchyroll.application.d a10 = d.a.a();
                                        com.amazon.aps.iva.yb0.j.f(s, "userStateProvider");
                                        com.amazon.aps.iva.yb0.j.f(a10, "appLifecycle");
                                        l lVar = new l(p1Var, downloadsManagerImpl, fVar3, s, r3, a10, rVar, eVar7);
                                        this.g = lVar;
                                        lVar.init();
                                        d.a.a(context, androidx.lifecycle.m.j.g).a(new com.amazon.aps.iva.yv.b(downloadsManagerImpl, eVar10, new com.amazon.aps.iva.yb0.t(e.a.a().F()) { // from class: com.amazon.aps.iva.sv.i.a
                                            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                                            public final Object get() {
                                                return Boolean.valueOf(((com.amazon.aps.iva.zv.a) this.receiver).r());
                                            }
                                        }, b.h));
                                        d.a.a().Lf(new com.amazon.aps.iva.jw.a(downloadsManagerImpl, new u2(context), eVar10, rVar, new com.amazon.aps.iva.yb0.t(e.a.a().F()) { // from class: com.amazon.aps.iva.sv.i.f
                                            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                                            public final Object get() {
                                                return Boolean.valueOf(((com.amazon.aps.iva.zv.a) this.receiver).r());
                                            }
                                        }));
                                        new com.amazon.aps.iva.fw.e(a.C0311a.a(), d.a.a());
                                        return;
                                    }
                                    com.amazon.aps.iva.yb0.j.m("dependencies");
                                    throw null;
                                }
                                com.amazon.aps.iva.yb0.j.m("dependencies");
                                throw null;
                            }
                            com.amazon.aps.iva.yb0.j.m("dependencies");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("renewContentMonitor");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("downloadsProvider");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("licenseManager");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("downloadingFeature");
        throw null;
    }

    @Override // com.amazon.aps.iva.sv.h
    public final InternalDownloadsManager a() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.sv.h
    public final com.amazon.aps.iva.sv.c b() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.sv.h
    public final k c() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.sv.h
    public final com.amazon.aps.iva.wg.a d() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.sv.h
    public final boolean e() {
        return this.b;
    }
}
