package com.amazon.aps.iva.ni;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.amazon.aps.iva.cj.j0;
import com.amazon.aps.iva.yh.f;
import com.crunchyroll.music.watch.screen.WatchMusicActivity;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.playback.PlayService;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
/* compiled from: WatchMusicModule.kt */
/* loaded from: classes.dex */
public final class f implements com.amazon.aps.iva.ni.e {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] l = {com.amazon.aps.iva.k.q.a(f.class, "viewModel", "getViewModel()Lcom/crunchyroll/music/watch/screen/WatchMusicViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(f.class, "playerViewModel", "getPlayerViewModel()Lcom/crunchyroll/music/watch/screen/player/WatchMusicPlayerViewModelImpl;", 0)};
    public final com.amazon.aps.iva.at.f b;
    public final com.amazon.aps.iva.gn.c c;
    public final com.amazon.aps.iva.ji.b d;
    public final com.amazon.aps.iva.yh.d e;
    public final o f;
    public final com.amazon.aps.iva.ez.a g;
    public final com.amazon.aps.iva.kb0.m h;
    public final com.amazon.aps.iva.pi.e i;
    public final com.amazon.aps.iva.ci.e j;
    public final com.amazon.aps.iva.qi.a k;

    /* compiled from: WatchMusicModule.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<Boolean> {
        public a(com.amazon.aps.iva.yh.i iVar) {
            super(0, iVar, com.amazon.aps.iva.yh.e.class, "isUserPremium", "isUserPremium()Z", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            return Boolean.valueOf(((com.amazon.aps.iva.yh.e) this.receiver).b());
        }
    }

    /* compiled from: WatchMusicModule.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ci.h, com.amazon.aps.iva.kb0.q> {
        public b(com.amazon.aps.iva.ni.g gVar) {
            super(1, gVar, com.amazon.aps.iva.ni.g.class, "onAssetSelected", "onAssetSelected(Lcom/crunchyroll/music/cards/MusicItemUiModel;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ci.h hVar) {
            com.amazon.aps.iva.ci.h hVar2 = hVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "p0");
            ((com.amazon.aps.iva.ni.g) this.receiver).G0(hVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchMusicModule.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ci.h, com.amazon.aps.iva.gi.f> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.gi.f invoke(com.amazon.aps.iva.ci.h hVar) {
            com.amazon.aps.iva.ci.h hVar2 = hVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "it");
            String str = hVar2.a;
            String str2 = hVar2.j;
            com.amazon.aps.iva.x50.t tVar = hVar2.i;
            String str3 = hVar2.b;
            String str4 = hVar2.k;
            if (str4 == null) {
                str4 = "";
            }
            return new com.amazon.aps.iva.gi.f(str, str2, tVar, str3, str4);
        }
    }

    /* compiled from: WatchMusicModule.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
        public final /* synthetic */ WatchMusicActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(WatchMusicActivity watchMusicActivity) {
            super(0);
            this.h = watchMusicActivity;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final String invoke() {
            ComponentName callingActivity = this.h.getCallingActivity();
            if (callingActivity != null) {
                return callingActivity.getClassName();
            }
            return null;
        }
    }

    /* compiled from: WatchMusicModule.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.pi.p> {
        public final /* synthetic */ f h;
        public final /* synthetic */ WatchMusicActivity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WatchMusicActivity watchMusicActivity, f fVar) {
            super(1);
            this.h = fVar;
            this.i = watchMusicActivity;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.pi.p invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            f fVar = this.h;
            fVar.getClass();
            w wVar = (w) fVar.g.getValue(fVar, f.l[0]);
            com.amazon.aps.iva.yh.i iVar = f.a.a;
            if (iVar != null) {
                com.amazon.aps.iva.cj.h player = iVar.getPlayerFeature().getPlayer();
                com.amazon.aps.iva.yh.i iVar2 = f.a.a;
                if (iVar2 != null) {
                    PlayService playService = iVar2.getPlayService();
                    com.amazon.aps.iva.yh.i iVar3 = f.a.a;
                    if (iVar3 != null) {
                        j0 h = iVar3.h();
                        com.amazon.aps.iva.yb0.j.f(playService, "playService");
                        com.amazon.aps.iva.yb0.j.f(h, "streamsLimitsConfig");
                        com.amazon.aps.iva.mi.c cVar = new com.amazon.aps.iva.mi.c(playService, h);
                        com.amazon.aps.iva.yh.i iVar4 = f.a.a;
                        if (iVar4 != null) {
                            com.amazon.aps.iva.aj.a c = iVar4.c();
                            com.amazon.aps.iva.at.f fVar2 = fVar.b;
                            com.amazon.aps.iva.yb0.j.f(fVar2, "availabilityProvider");
                            com.amazon.aps.iva.yb0.j.f(c, "maturityRestrictionProvider");
                            com.amazon.aps.iva.pi.c cVar2 = new com.amazon.aps.iva.pi.c(cVar, fVar2, c);
                            com.amazon.aps.iva.pi.a aVar = new com.amazon.aps.iva.pi.a(fVar2);
                            com.amazon.aps.iva.yh.d dVar = fVar.e;
                            com.amazon.aps.iva.yh.i iVar5 = f.a.a;
                            if (iVar5 != null) {
                                com.amazon.aps.iva.ye.f castStateProvider = iVar5.a().getCastStateProvider();
                                Context applicationContext = this.i.getApplicationContext();
                                com.amazon.aps.iva.yb0.j.e(applicationContext, "activity.applicationContext");
                                return new com.amazon.aps.iva.pi.p(wVar, player, cVar2, aVar, dVar, castStateProvider, applicationContext);
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
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: WatchMusicModule.kt */
    /* renamed from: com.amazon.aps.iva.ni.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0540f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ni.g> {
        public final /* synthetic */ WatchMusicActivity h;
        public final /* synthetic */ f i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0540f(WatchMusicActivity watchMusicActivity, f fVar) {
            super(0);
            this.h = watchMusicActivity;
            this.i = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ni.g invoke() {
            f fVar = this.i;
            fVar.getClass();
            w wVar = (w) fVar.g.getValue(fVar, f.l[0]);
            com.amazon.aps.iva.yh.i iVar = f.a.a;
            if (iVar != null) {
                WatchMusicActivity watchMusicActivity = this.h;
                com.amazon.aps.iva.k50.j g = iVar.g(watchMusicActivity);
                com.amazon.aps.iva.yh.i iVar2 = f.a.a;
                if (iVar2 != null) {
                    com.amazon.aps.iva.cj.h player = iVar2.getPlayerFeature().getPlayer();
                    com.amazon.aps.iva.ks.g gVar = new com.amazon.aps.iva.ks.g(null, null, null, "native");
                    com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                    com.amazon.aps.iva.yh.d dVar = fVar.e;
                    com.amazon.aps.iva.yb0.j.f(dVar, "multipleArtistsFormatter");
                    com.amazon.aps.iva.ki.a aVar = com.amazon.aps.iva.ki.a.h;
                    com.amazon.aps.iva.yb0.j.f(aVar, "createTimer");
                    com.amazon.aps.iva.ki.c cVar2 = new com.amazon.aps.iva.ki.c(dVar, cVar, gVar, aVar);
                    com.amazon.aps.iva.yb0.j.f(g, "subscriptionFlowRouter");
                    com.amazon.aps.iva.gn.c cVar3 = fVar.c;
                    com.amazon.aps.iva.yb0.j.f(cVar3, "shareComponent");
                    o oVar = fVar.f;
                    com.amazon.aps.iva.yb0.j.f(oVar, "router");
                    com.amazon.aps.iva.yb0.j.f(player, "player");
                    return new com.amazon.aps.iva.ni.k(watchMusicActivity, wVar, g, cVar3, oVar, player, watchMusicActivity, dVar, cVar2);
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: WatchMusicModule.kt */
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, w> {
        public final /* synthetic */ WatchMusicActivity h;
        public final /* synthetic */ f i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(WatchMusicActivity watchMusicActivity, f fVar) {
            super(1);
            this.h = watchMusicActivity;
            this.i = fVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final w invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.l50.c cVar;
            Object obj;
            androidx.lifecycle.p pVar2 = pVar;
            com.amazon.aps.iva.yb0.j.f(pVar2, "savedStateHandle");
            Intent intent = this.h.getIntent();
            com.amazon.aps.iva.yb0.j.e(intent, "activity.intent");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras.getSerializable("WATCH_MUSIC_INPUT", com.amazon.aps.iva.l50.c.class);
                } else {
                    obj = (com.amazon.aps.iva.l50.c) extras.getSerializable("WATCH_MUSIC_INPUT");
                }
                cVar = (com.amazon.aps.iva.l50.c) obj;
            } else {
                cVar = null;
            }
            com.amazon.aps.iva.l50.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.c(cVar2);
            f fVar = this.i;
            return new w(cVar2, pVar2, fVar.d, fVar.b, fVar.e);
        }
    }

    /* compiled from: WatchMusicModule.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class j extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public j(com.amazon.aps.iva.ni.g gVar) {
            super(1, gVar, com.amazon.aps.iva.ni.g.class, "onArtistTitleClick", "onArtistTitleClick(Ljava/lang/String;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            String str2 = str;
            com.amazon.aps.iva.yb0.j.f(str2, "p0");
            ((com.amazon.aps.iva.ni.g) this.receiver).z5(str2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchMusicModule.kt */
    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.qi.g, com.amazon.aps.iva.gi.f> {
        public static final k h = new k();

        public k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.gi.f invoke(com.amazon.aps.iva.qi.g gVar) {
            com.amazon.aps.iva.qi.g gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "it");
            return new com.amazon.aps.iva.gi.f(gVar2.a, gVar2.b, gVar2.i, gVar2.c, gVar2.d);
        }
    }

    public f(WatchMusicActivity watchMusicActivity) {
        com.amazon.aps.iva.yh.i iVar = f.a.a;
        if (iVar != null) {
            this.b = new com.amazon.aps.iva.at.f(new a(iVar));
            com.amazon.aps.iva.yh.i iVar2 = f.a.a;
            if (iVar2 != null) {
                com.amazon.aps.iva.gn.c i2 = iVar2.a.i(watchMusicActivity);
                this.c = i2;
                com.amazon.aps.iva.yh.i iVar3 = f.a.a;
                if (iVar3 != null) {
                    EtpContentService etpContentService = iVar3.getEtpContentService();
                    com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
                    this.d = new com.amazon.aps.iva.ji.b(etpContentService);
                    this.e = new com.amazon.aps.iva.yh.d(new com.amazon.aps.iva.yh.b(watchMusicActivity));
                    o oVar = new o(watchMusicActivity, new d(watchMusicActivity), new com.amazon.aps.iva.ii.a(watchMusicActivity));
                    this.f = oVar;
                    this.g = new com.amazon.aps.iva.ez.a(w.class, new g(watchMusicActivity), new i(watchMusicActivity, this));
                    e eVar = new e(watchMusicActivity, this);
                    h hVar = new h(watchMusicActivity);
                    this.h = com.amazon.aps.iva.kb0.f.b(new C0540f(watchMusicActivity, this));
                    com.amazon.aps.iva.yb0.j.f(l[1], "property");
                    com.amazon.aps.iva.pi.p pVar = (com.amazon.aps.iva.pi.p) com.amazon.aps.iva.ez.l.a(hVar.invoke(), com.amazon.aps.iva.pi.p.class, eVar);
                    com.amazon.aps.iva.yh.i iVar4 = f.a.a;
                    if (iVar4 != null) {
                        com.amazon.aps.iva.ye.a a2 = iVar4.a();
                        com.amazon.aps.iva.yb0.j.f(a2, "castDependencies");
                        this.i = new com.amazon.aps.iva.pi.e(watchMusicActivity, pVar, a2);
                        b bVar = new b(getPresenter());
                        this.j = new com.amazon.aps.iva.ci.e(DurationFormatter.Companion.create(watchMusicActivity), new com.amazon.aps.iva.gi.e(c.h, i2, oVar), bVar, com.amazon.aps.iva.aq.k.n(watchMusicActivity).c());
                        this.k = new com.amazon.aps.iva.qi.a(new j(getPresenter()), new com.amazon.aps.iva.gi.e(k.h, i2, oVar));
                        androidx.lifecycle.g lifecycle = watchMusicActivity.getLifecycle();
                        com.amazon.aps.iva.yh.i iVar5 = f.a.a;
                        if (iVar5 != null) {
                            lifecycle.addObserver(iVar5.getPlayerFeature().getPlayer().S());
                            return;
                        } else {
                            com.amazon.aps.iva.yb0.j.m("dependencies");
                            throw null;
                        }
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
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.ni.e
    public final com.amazon.aps.iva.ci.e a() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.ni.e
    public final com.amazon.aps.iva.pi.e c() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.ni.e
    public final com.amazon.aps.iva.qi.a d() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.ni.e
    public final com.amazon.aps.iva.ni.g getPresenter() {
        return (com.amazon.aps.iva.ni.g) this.h.getValue();
    }
}
