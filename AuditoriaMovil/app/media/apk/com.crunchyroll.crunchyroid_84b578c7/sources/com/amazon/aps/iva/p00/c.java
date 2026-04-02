package com.amazon.aps.iva.p00;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mt.o;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.sv.h;
import com.amazon.aps.iva.t00.b;
import com.amazon.aps.iva.u00.n;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.zv.b;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.util.List;
/* compiled from: VideoDownloadModuleImpl.kt */
/* loaded from: classes2.dex */
public final class c implements j {
    public final androidx.fragment.app.h a;
    public final com.amazon.aps.iva.tg.a b;
    public final l<String, PlayableAsset> c;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hg.e> d;
    public final int e;
    public final com.amazon.aps.iva.r00.i f;
    public final com.amazon.aps.iva.u00.i g;
    public final m h;

    /* compiled from: VideoDownloadModuleImpl.kt */
    /* loaded from: classes2.dex */
    public final class a implements com.amazon.aps.iva.u00.m {
        public final p<com.amazon.aps.iva.hg.f, n, q> b;

        /* compiled from: VideoDownloadModuleImpl.kt */
        /* renamed from: com.amazon.aps.iva.p00.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0589a extends com.amazon.aps.iva.yb0.l implements l<com.amazon.aps.iva.a70.a<n>, q> {
            public final /* synthetic */ com.amazon.aps.iva.hg.f i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0589a(com.amazon.aps.iva.hg.f fVar) {
                super(1);
                this.i = fVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(com.amazon.aps.iva.a70.a<n> aVar) {
                com.amazon.aps.iva.a70.a<n> aVar2 = aVar;
                com.amazon.aps.iva.yb0.j.f(aVar2, "entry");
                p<com.amazon.aps.iva.hg.f, n, q> pVar = a.this.b;
                com.amazon.aps.iva.a70.b bVar = aVar2.a;
                com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.download.bulk.BulkDownloadControlDialogAction");
                pVar.invoke(this.i, (n) bVar);
                return q.a;
            }
        }

        public a(e eVar, f fVar) {
            this.b = eVar;
            b.a aVar = com.amazon.aps.iva.t00.b.i;
            FragmentManager supportFragmentManager = c.this.a.getSupportFragmentManager();
            com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "activity.supportFragmentManager");
            com.amazon.aps.iva.p00.b bVar = new com.amazon.aps.iva.p00.b(fVar);
            aVar.getClass();
            b.a.a(supportFragmentManager, "bulk_sync_audio_language", c.this.a, bVar);
        }

        @Override // com.amazon.aps.iva.u00.m
        public final void L5(com.amazon.aps.iva.hg.f fVar, com.amazon.aps.iva.a70.c<n> cVar, View view) {
            com.amazon.aps.iva.yb0.j.f(fVar, "statusData");
            com.amazon.aps.iva.yb0.j.f(view, "anchor");
            new com.amazon.aps.iva.pz.a(c.this.a, view, cVar, null, new C0589a(fVar), 232).show();
        }

        @Override // com.amazon.aps.iva.u00.m
        public final void Y9(List<PlayableAssetVersion> list, com.amazon.aps.iva.hg.g gVar, String str) {
            com.amazon.aps.iva.yb0.j.f(list, "versions");
            com.amazon.aps.iva.yb0.j.f(gVar, "input");
            com.amazon.aps.iva.yb0.j.f(str, "currentAudioLocale");
            b.a aVar = com.amazon.aps.iva.t00.b.i;
            FragmentManager supportFragmentManager = c.this.a.getSupportFragmentManager();
            com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "activity.supportFragmentManager");
            aVar.getClass();
            b.a.b(supportFragmentManager, "bulk_sync_audio_language", list, str, gVar);
        }

        @Override // com.amazon.aps.iva.u00.m
        public final void l2(List<PlayableAssetVersion> list, String str, com.amazon.aps.iva.xb0.a<q> aVar) {
            com.amazon.aps.iva.yb0.j.f(list, "versions");
            com.amazon.aps.iva.yb0.j.f(str, "audioLocale");
            ((com.amazon.aps.iva.a10.d) c.this.h.getValue()).G(list, str, aVar);
        }
    }

    /* compiled from: VideoDownloadModuleImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b implements com.amazon.aps.iva.q00.a {
        public final androidx.fragment.app.h b;

        public b(androidx.fragment.app.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "activity");
            this.b = hVar;
        }

        @Override // com.amazon.aps.iva.q00.a
        public final void I3(com.amazon.aps.iva.xb0.a<q> aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "onEnabledSyncViaMobileDataAction");
            com.amazon.aps.iva.c10.b bVar = new com.amazon.aps.iva.c10.b(this.b);
            com.amazon.aps.iva.zv.b bVar2 = com.amazon.aps.iva.sv.e.e;
            if (bVar2 != null) {
                com.amazon.aps.iva.zv.g q = bVar2.q();
                com.amazon.aps.iva.zv.b bVar3 = com.amazon.aps.iva.sv.e.e;
                if (bVar3 != null) {
                    com.amazon.aps.iva.zv.f o = bVar3.o();
                    com.amazon.aps.iva.yb0.j.f(q, "userPreferences");
                    com.amazon.aps.iva.yb0.j.f(o, "syncOverCellularAnalytics");
                    bVar.c = new com.amazon.aps.iva.c10.c(q, aVar, o, bVar);
                    new MaterialAlertDialogBuilder(bVar.b).setTitle(R.string.sync_over_cellular_dialog_title).setMessage(R.string.sync_over_cellular_dialog_message).setNegativeButton(R.string.sync_over_cellular_dialog_negative_button, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.sync_over_cellular_dialog_positive_button, (DialogInterface.OnClickListener) new com.amazon.aps.iva.c10.a(bVar, 0)).show();
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }

        @Override // com.amazon.aps.iva.q00.a
        public final void P7() {
            new MaterialAlertDialogBuilder(this.b).setMessage(R.string.offline_access_incomplete_video).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).show();
        }

        @Override // com.amazon.aps.iva.q00.a
        public final void Wh() {
            new MaterialAlertDialogBuilder(this.b).setTitle(R.string.restricted_by_location_title).setMessage(R.string.restricted_by_location_message).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).show();
        }

        @Override // com.amazon.aps.iva.q00.a
        public final void Z4(PlayableAsset playableAsset) {
            com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
            com.amazon.aps.iva.z00.b.k.getClass();
            com.amazon.aps.iva.z00.b bVar = new com.amazon.aps.iva.z00.b();
            bVar.j.b(bVar, com.amazon.aps.iva.z00.b.l[6], playableAsset);
            bVar.show(this.b.getSupportFragmentManager(), "maturity_restriction_dialog");
        }

        @Override // com.amazon.aps.iva.u70.j
        public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
            com.amazon.aps.iva.yb0.j.f(iVar, "message");
            int i = com.amazon.aps.iva.u70.h.a;
            View findViewById = this.b.findViewById(R.id.snackbar_container);
            com.amazon.aps.iva.yb0.j.e(findViewById, "activity.findViewById(R.id.snackbar_container)");
            h.a.a((ViewGroup) findViewById, iVar);
        }
    }

    /* compiled from: VideoDownloadModuleImpl.kt */
    /* renamed from: com.amazon.aps.iva.p00.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0590c implements com.amazon.aps.iva.r00.p {
        public final p<PlayableAsset, com.amazon.aps.iva.r00.q, q> b;

        /* compiled from: VideoDownloadModuleImpl.kt */
        /* renamed from: com.amazon.aps.iva.p00.c$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements l<com.amazon.aps.iva.a70.a<com.amazon.aps.iva.r00.q>, q> {
            public final /* synthetic */ PlayableAsset i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayableAsset playableAsset) {
                super(1);
                this.i = playableAsset;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(com.amazon.aps.iva.a70.a<com.amazon.aps.iva.r00.q> aVar) {
                com.amazon.aps.iva.a70.a<com.amazon.aps.iva.r00.q> aVar2 = aVar;
                com.amazon.aps.iva.yb0.j.f(aVar2, "entry");
                p<PlayableAsset, com.amazon.aps.iva.r00.q, q> pVar = C0590c.this.b;
                com.amazon.aps.iva.a70.b bVar = aVar2.a;
                com.amazon.aps.iva.yb0.j.d(bVar, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.download.actions.DownloadControlDialogAction");
                pVar.invoke(this.i, (com.amazon.aps.iva.r00.q) bVar);
                return q.a;
            }
        }

        public C0590c(g gVar, h hVar) {
            this.b = gVar;
            b.a aVar = com.amazon.aps.iva.t00.b.i;
            FragmentManager supportFragmentManager = c.this.a.getSupportFragmentManager();
            com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "activity.supportFragmentManager");
            d dVar = new d(hVar);
            aVar.getClass();
            b.a.a(supportFragmentManager, "download_audio_language", c.this.a, dVar);
        }

        @Override // com.amazon.aps.iva.r00.p
        public final void Ib(PlayableAsset playableAsset, String str) {
            com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
            com.amazon.aps.iva.yb0.j.f(str, "currentAudioLocale");
            b.a aVar = com.amazon.aps.iva.t00.b.i;
            FragmentManager supportFragmentManager = c.this.a.getSupportFragmentManager();
            com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "activity.supportFragmentManager");
            List<PlayableAssetVersion> versions = playableAsset.getVersions();
            aVar.getClass();
            b.a.b(supportFragmentManager, "download_audio_language", versions, str, playableAsset);
        }

        @Override // com.amazon.aps.iva.r00.p
        public final void l2(List<PlayableAssetVersion> list, String str, com.amazon.aps.iva.xb0.a<q> aVar) {
            com.amazon.aps.iva.yb0.j.f(list, "versions");
            com.amazon.aps.iva.yb0.j.f(str, "audioLocale");
            ((com.amazon.aps.iva.a10.d) c.this.h.getValue()).G(list, str, aVar);
        }

        @Override // com.amazon.aps.iva.r00.p
        public final void nd(PlayableAsset playableAsset, com.amazon.aps.iva.a70.c<com.amazon.aps.iva.r00.q> cVar, View view) {
            com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
            com.amazon.aps.iva.yb0.j.f(view, "anchor");
            new com.amazon.aps.iva.pz.a(c.this.a, view, cVar, null, new a(playableAsset), 232).show();
        }
    }

    public c(androidx.fragment.app.h hVar, g0 g0Var, com.amazon.aps.iva.ng.a aVar, com.amazon.aps.iva.pg.a aVar2, com.amazon.aps.iva.tg.a aVar3, l lVar, com.amazon.aps.iva.xb0.a aVar4) {
        com.amazon.aps.iva.yb0.j.f(hVar, "activity");
        com.amazon.aps.iva.yb0.j.f(g0Var, "lifecycleCoroutineScope");
        com.amazon.aps.iva.yb0.j.f(aVar, "matureFlowComponent");
        com.amazon.aps.iva.yb0.j.f(aVar2, "downloadAccessUpsellFlowComponent");
        com.amazon.aps.iva.yb0.j.f(aVar3, "seasonTitleFormatter");
        this.a = hVar;
        this.b = aVar3;
        this.c = lVar;
        this.d = aVar4;
        this.e = R.id.snackbar_container;
        com.amazon.aps.iva.sv.h hVar2 = h.a.a;
        if (hVar2 != null) {
            com.amazon.aps.iva.sv.c b2 = hVar2.b();
            com.amazon.aps.iva.sv.h hVar3 = h.a.a;
            if (hVar3 != null) {
                InternalDownloadsManager a2 = hVar3.a();
                com.ellation.crunchyroll.downloading.bulk.g gVar = k0.d;
                if (gVar != null) {
                    BulkDownloadsManager a3 = gVar.a();
                    com.amazon.aps.iva.wu.b bVar = com.amazon.aps.iva.wu.b.a;
                    com.amazon.aps.iva.yb0.j.f(b2, "downloadingCoroutineScope");
                    com.amazon.aps.iva.yb0.j.f(a2, "downloadsManager");
                    com.amazon.aps.iva.yb0.j.f(a3, "bulkDownloadsManager");
                    com.amazon.aps.iva.sv.n nVar = new com.amazon.aps.iva.sv.n(g0Var, b2, a2, a3, bVar);
                    b bVar2 = new b(hVar);
                    C0590c c0590c = new C0590c(new g(this), new h(this));
                    a aVar5 = new a(new e(this), new f(this));
                    com.amazon.aps.iva.sv.h hVar4 = h.a.a;
                    if (hVar4 != null) {
                        InternalDownloadsManager a4 = hVar4.a();
                        com.amazon.aps.iva.zv.b bVar3 = com.amazon.aps.iva.sv.e.e;
                        if (bVar3 != null) {
                            com.amazon.aps.iva.aj.a c = bVar3.c();
                            com.amazon.aps.iva.sv.g gVar2 = com.amazon.aps.iva.sv.e.f;
                            if (gVar2 != null) {
                                com.amazon.aps.iva.uv.d r = gVar2.r();
                                com.amazon.aps.iva.sv.h hVar5 = h.a.a;
                                if (hVar5 != null) {
                                    boolean e = hVar5.e();
                                    Context context = b.a.a;
                                    if (context != null) {
                                        if (q.a.a == null) {
                                            q.a.a = new r(context);
                                        }
                                        r rVar = q.a.a;
                                        com.amazon.aps.iva.yb0.j.c(rVar);
                                        com.amazon.aps.iva.zv.b bVar4 = com.amazon.aps.iva.sv.e.e;
                                        if (bVar4 != null) {
                                            final com.amazon.aps.iva.zv.g q = bVar4.q();
                                            com.amazon.aps.iva.q00.e eVar = new com.amazon.aps.iva.q00.e(rVar, new com.amazon.aps.iva.yb0.n(q) { // from class: com.amazon.aps.iva.r00.a
                                                @Override // com.amazon.aps.iva.fc0.m
                                                public final Object get() {
                                                    return Boolean.valueOf(((com.amazon.aps.iva.zv.g) this.receiver).a());
                                                }

                                                @Override // com.amazon.aps.iva.fc0.i
                                                public final void set(Object obj) {
                                                    ((com.amazon.aps.iva.zv.g) this.receiver).b(((Boolean) obj).booleanValue());
                                                }
                                            });
                                            com.amazon.aps.iva.zv.b bVar5 = com.amazon.aps.iva.sv.e.e;
                                            if (bVar5 != null) {
                                                com.amazon.aps.iva.zv.c invoke = bVar5.t().invoke();
                                                com.amazon.aps.iva.yb0.j.f(a4, "downloadsManager");
                                                com.amazon.aps.iva.yb0.j.f(c, "maturityRestrictionProvider");
                                                com.amazon.aps.iva.yb0.j.f(r, "contentAvailabilityProvider");
                                                com.amazon.aps.iva.yb0.j.f(invoke, "geoRestrictedInteractor");
                                                com.amazon.aps.iva.r00.e eVar2 = new com.amazon.aps.iva.r00.e(bVar2, a4, aVar, c, aVar2, r, e, eVar, invoke);
                                                com.ellation.crunchyroll.mvp.lifecycle.a.a(eVar2, hVar);
                                                com.amazon.aps.iva.r00.i iVar = new com.amazon.aps.iva.r00.i(c0590c, nVar, new o(hVar, new com.amazon.aps.iva.mt.m(hVar)), eVar2);
                                                com.ellation.crunchyroll.mvp.lifecycle.a.a(iVar, hVar);
                                                this.f = iVar;
                                                com.amazon.aps.iva.sv.g gVar3 = com.amazon.aps.iva.sv.e.f;
                                                if (gVar3 != null) {
                                                    com.amazon.aps.iva.uv.d r2 = gVar3.r();
                                                    com.amazon.aps.iva.yb0.j.f(r2, "provider");
                                                    com.amazon.aps.iva.v00.b bVar6 = new com.amazon.aps.iva.v00.b(bVar2, new com.amazon.aps.iva.uv.b(r2), eVar2);
                                                    com.ellation.crunchyroll.mvp.lifecycle.a.a(bVar6, hVar);
                                                    com.amazon.aps.iva.u00.b bVar7 = new com.amazon.aps.iva.u00.b(hVar, aVar3);
                                                    com.ellation.crunchyroll.downloading.bulk.g gVar4 = k0.d;
                                                    if (gVar4 != null) {
                                                        com.amazon.aps.iva.tv.a aVar6 = (com.amazon.aps.iva.tv.a) gVar4.d.getValue();
                                                        com.amazon.aps.iva.yb0.j.f(aVar6, "bulkDownloadsAnalytics");
                                                        com.amazon.aps.iva.u00.i iVar2 = new com.amazon.aps.iva.u00.i(aVar5, nVar, bVar6, bVar7, aVar6);
                                                        com.ellation.crunchyroll.mvp.lifecycle.a.a(iVar2, hVar);
                                                        this.g = iVar2;
                                                        this.h = com.amazon.aps.iva.kb0.f.b(new i(this));
                                                        return;
                                                    }
                                                    com.amazon.aps.iva.yb0.j.m("instance");
                                                    throw null;
                                                }
                                                com.amazon.aps.iva.yb0.j.m("downloadingFeature");
                                                throw null;
                                            }
                                            com.amazon.aps.iva.yb0.j.m("dependencies");
                                            throw null;
                                        }
                                        com.amazon.aps.iva.yb0.j.m("dependencies");
                                        throw null;
                                    }
                                    com.amazon.aps.iva.yb0.j.m("internalContext");
                                    throw null;
                                }
                                com.amazon.aps.iva.yb0.j.m("instance");
                                throw null;
                            }
                            com.amazon.aps.iva.yb0.j.m("downloadingFeature");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("dependencies");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("instance");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("instance");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.fg.g
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hg.e> a() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.fg.g
    public final l<String, PlayableAsset> b() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.p00.j
    public final com.amazon.aps.iva.u00.i c() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.p00.j
    public final com.amazon.aps.iva.r00.i d() {
        return this.f;
    }
}
