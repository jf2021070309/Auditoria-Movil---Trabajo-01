package com.crunchyroll.watchscreen.screen;

import android.app.assist.AssistContent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.cj.z;
import com.amazon.aps.iva.cp.a;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.el.b0;
import com.amazon.aps.iva.el.h0;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.lo.c;
import com.amazon.aps.iva.oo.n;
import com.amazon.aps.iva.qo.l;
import com.amazon.aps.iva.qo.v;
import com.amazon.aps.iva.u70.h;
import com.crunchyroll.contentunavailable.ContentUnavailableLayout;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.crunchyroll.watchscreen.screen.assets.WatchScreenAssetsLayout;
import com.crunchyroll.watchscreen.screen.layout.WatchScreenLayout;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.toolbarmenu.MenuButtonData;
import com.ellation.crunchyroll.ui.toolbarmenu.ToolbarMenuButtonDataProvider;
import com.ellation.widgets.overflow.OverflowButton;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: WatchScreenActivity.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\b\u0012\u0004\u0012\u00020\t0\b2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u0012B\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/crunchyroll/watchscreen/screen/WatchScreenActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/qo/v;", "Lcom/amazon/aps/iva/oo/e;", "Lcom/amazon/aps/iva/yo/d;", "Lcom/amazon/aps/iva/gn/e;", "Lcom/amazon/aps/iva/u70/j;", "Lcom/amazon/aps/iva/ip/b;", "Lcom/amazon/aps/iva/cp/b;", "Lcom/ellation/crunchyroll/model/PlayableAsset;", "Lcom/amazon/aps/iva/us/a;", "Lcom/ellation/crunchyroll/ui/toolbarmenu/ToolbarMenuButtonDataProvider;", "Lcom/amazon/aps/iva/el/b0;", "Lcom/amazon/aps/iva/cj/z;", "Lcom/amazon/aps/iva/qo/a;", "Lcom/amazon/aps/iva/ff/b;", "Lcom/amazon/aps/iva/df/b;", "Lcom/amazon/aps/iva/zo/c;", "Lcom/amazon/aps/iva/fp/c;", "<init>", "()V", "watch-screen_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class WatchScreenActivity extends com.amazon.aps.iva.i60.b implements v, com.amazon.aps.iva.oo.e, com.amazon.aps.iva.yo.d, com.amazon.aps.iva.gn.e, com.amazon.aps.iva.u70.j, com.amazon.aps.iva.ip.b, com.amazon.aps.iva.cp.b<PlayableAsset>, com.amazon.aps.iva.us.a, ToolbarMenuButtonDataProvider, b0, z, com.amazon.aps.iva.qo.a, com.amazon.aps.iva.ff.b, com.amazon.aps.iva.df.b, com.amazon.aps.iva.zo.c, com.amazon.aps.iva.fp.c {
    public static final /* synthetic */ l<Object>[] s = {q.a(WatchScreenActivity.class, "contentRatingLayout", "getContentRatingLayout()Lcom/crunchyroll/contentrating/BaseContentRatingLayout;", 0), q.a(WatchScreenActivity.class, "commentsLayout", "getCommentsLayout()Lcom/crunchyroll/commenting/comments/BaseCommentsEntryPoint;", 0)};
    public com.amazon.aps.iva.rg.a o;
    public final boolean k = true;
    public final com.amazon.aps.iva.kb0.e l = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.NONE, new k(this));
    public final com.amazon.aps.iva.xw.v m = com.amazon.aps.iva.xw.g.d(this, R.id.watch_screen_content_rating);
    public final com.amazon.aps.iva.xw.v n = com.amazon.aps.iva.xw.g.d(this, R.id.comments_entry_point);
    public final com.amazon.aps.iva.xw.a p = com.amazon.aps.iva.xw.b.b(this, new c());
    public final m q = com.amazon.aps.iva.kb0.f.b(new b());
    public final com.amazon.aps.iva.i5.v<MenuButtonData> r = new com.amazon.aps.iva.i5.v<>();

    /* compiled from: WatchScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "it");
            WatchScreenActivity.this.ni().f().E3();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.qo.j> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.qo.j invoke() {
            return new com.amazon.aps.iva.qo.j(WatchScreenActivity.this);
        }
    }

    /* compiled from: WatchScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e.m, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e.m mVar) {
            com.amazon.aps.iva.yb0.j.f(mVar, "$this$onBackPressedCallback");
            WatchScreenActivity.this.ni().f().a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, false, true, false, com.crunchyroll.watchscreen.screen.a.h, 251);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, true, false, false, com.crunchyroll.watchscreen.screen.b.h, 253);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class f extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.u70.i, com.amazon.aps.iva.kb0.q> {
        public f(Object obj) {
            super(1, obj, WatchScreenActivity.class, "showSnackbar", "showSnackbar(Lcom/ellation/widgets/snackbar/MessageSnackbarUiModel;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.u70.i iVar) {
            com.amazon.aps.iva.u70.i iVar2 = iVar;
            com.amazon.aps.iva.yb0.j.f(iVar2, "p0");
            ((WatchScreenActivity) this.receiver).showSnackbar(iVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g implements com.amazon.aps.iva.cf.a {
        public g() {
        }

        @Override // com.amazon.aps.iva.cf.a
        public final void F1() {
            l<Object>[] lVarArr = WatchScreenActivity.s;
            WatchScreenActivity.this.mi().c.getPlayerView().F1();
        }

        @Override // com.amazon.aps.iva.cf.a
        public final void h0() {
            l<Object>[] lVarArr = WatchScreenActivity.s;
            WatchScreenActivity.this.mi().c.getPlayerView().h0();
        }
    }

    /* compiled from: WatchScreenActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class h extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public h(com.amazon.aps.iva.qo.k kVar) {
            super(0, kVar, com.amazon.aps.iva.qo.k.class, "onHomePressed", "onHomePressed()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.qo.k) this.receiver).A5();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class i extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public i(com.amazon.aps.iva.qo.k kVar) {
            super(0, kVar, com.amazon.aps.iva.qo.k.class, "onRetry", "onRetry()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.qo.k) this.receiver).b();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchScreenActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class j extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public j(v vVar) {
            super(0, vVar, WatchScreenActivity.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((WatchScreenActivity) this.receiver).onBackPressed();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ActivityViewBindingDelegate.kt */
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.h60.a> {
        public final /* synthetic */ com.amazon.aps.iva.k.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(com.amazon.aps.iva.k.c cVar) {
            super(0);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.h60.a invoke() {
            LayoutInflater layoutInflater = this.h.getLayoutInflater();
            com.amazon.aps.iva.yb0.j.e(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.activity_watch_screen, (ViewGroup) null, false);
            FrameLayout frameLayout = (FrameLayout) com.amazon.aps.iva.e.z.u(R.id.error_overlay_container, inflate);
            if (frameLayout != null) {
                WatchScreenLayout watchScreenLayout = (WatchScreenLayout) inflate;
                return new com.amazon.aps.iva.h60.a(watchScreenLayout, frameLayout, watchScreenLayout);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.error_overlay_container)));
        }
    }

    @Override // com.amazon.aps.iva.cj.z
    public final void Dh() {
        ni().j().r6(null);
    }

    @Override // com.amazon.aps.iva.qo.a
    public final boolean G() {
        return mi().c.getPlayerView().Ye();
    }

    @Override // com.amazon.aps.iva.c3.i, com.amazon.aps.iva.el.b0
    public final void G4() {
        ni().f().a();
    }

    @Override // com.amazon.aps.iva.ip.b
    public final boolean G7() {
        return ((h0) com.amazon.aps.iva.xw.b0.a(mi().c.getPlayerView().getSizeState())).isFullscreen();
    }

    @Override // com.amazon.aps.iva.cj.z
    public boolean K1() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void Ka(l.h hVar) {
        com.amazon.aps.iva.lo.d dVar = c.a.a;
        if (dVar != null) {
            com.amazon.aps.iva.fg.a l = dVar.l();
            FrameLayout frameLayout = mi().c.getSummary().getBinding().c;
            com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.watchScreenConta…g.downloadButtonContainer");
            com.amazon.aps.iva.rg.a j2 = l.j(frameLayout);
            this.o = j2;
            if (j2 != null) {
                j2.G(ni().g().a, hVar);
                return;
            } else {
                com.amazon.aps.iva.yb0.j.m("downloadButton");
                throw null;
            }
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.ip.b
    public final void Lg() {
        com.amazon.aps.iva.lo.d dVar = c.a.a;
        if (dVar != null) {
            com.amazon.aps.iva.ff.a h2 = dVar.h();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "supportFragmentManager");
            h2.h(supportFragmentManager);
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.cj.z
    public final void M() {
        ni().f().H();
    }

    @Override // com.amazon.aps.iva.ip.b
    public final void P1() {
        com.amazon.aps.iva.lo.d dVar = c.a.a;
        if (dVar != null) {
            com.amazon.aps.iva.ff.a h2 = dVar.h();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "supportFragmentManager");
            h2.g(supportFragmentManager);
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.cj.z
    public final void Qd() {
        ni().c().q6();
    }

    @Override // com.amazon.aps.iva.fp.c
    public final void Rg() {
        mi().c.getTransparentProgressOverlay().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.cj.z
    public final void Sc(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        ni().c().r6(str);
    }

    @Override // com.amazon.aps.iva.gn.e
    public final void Tb(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        startActivity(com.amazon.aps.iva.gd0.j.i(this, str));
    }

    @Override // com.amazon.aps.iva.ip.b
    public final boolean Ud() {
        com.amazon.aps.iva.lo.d dVar = c.a.a;
        if (dVar != null) {
            com.amazon.aps.iva.ff.a h2 = dVar.h();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "supportFragmentManager");
            return h2.e(supportFragmentManager);
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void Vc(com.amazon.aps.iva.ep.c cVar) {
        mi().c.getProgressOverlay().b1(cVar);
    }

    @Override // com.amazon.aps.iva.df.b
    public final com.amazon.aps.iva.df.a X7() {
        return ni().d();
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void Xg(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "contentId");
        com.amazon.aps.iva.fc0.l<?> lVar = s[1];
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "supportFragmentManager");
        ((com.amazon.aps.iva.hf.b) this.n.getValue(this, lVar)).b1(supportFragmentManager, str);
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void Z1(LabelUiModel labelUiModel) {
        com.amazon.aps.iva.yb0.j.f(labelUiModel, "labelUiModel");
        mi().c.getPlayerView().Z1(labelUiModel);
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void Z6(DownloadButtonState downloadButtonState) {
        com.amazon.aps.iva.yb0.j.f(downloadButtonState, "downloadButtonState");
        com.amazon.aps.iva.rg.a aVar = this.o;
        if (aVar != null) {
            aVar.setState(downloadButtonState);
        } else {
            com.amazon.aps.iva.yb0.j.m("downloadButton");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void a() {
        mi().c.getProgressOverlay().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void a1() {
        getSupportFragmentManager().O();
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void a2(List<com.amazon.aps.iva.n70.b> list) {
        OverflowButton overflowButton = mi().c.getSummary().getBinding().d;
        com.amazon.aps.iva.yb0.j.e(overflowButton, "binding.watchScreenConta….summary.binding.overflow");
        int i2 = OverflowButton.h;
        overflowButton.G(list, null, null, null, null);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void b() {
        mi().c.getProgressOverlay().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return com.amazon.aps.iva.ls.a.EPISODE;
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void c() {
        FrameLayout frameLayout = mi().b;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.errorOverlayContainer");
        com.amazon.aps.iva.k60.a.d(frameLayout, new i(ni().f()), new j(this), 0, 0, 0L, 0L, 252);
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void c4(PlayableAsset playableAsset) {
        ni().a().L4(playableAsset);
    }

    @Override // com.amazon.aps.iva.fp.c
    public final void d6() {
        mi().c.getTransparentProgressOverlay().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.ff.b
    public final LiveData<PlayableAsset> getCurrentAsset() {
        return ni().b().c1();
    }

    @Override // com.ellation.crunchyroll.ui.toolbarmenu.ToolbarMenuButtonDataProvider
    public final LiveData getMenuButtonLiveData() {
        return this.r;
    }

    public final com.amazon.aps.iva.h60.a mi() {
        return (com.amazon.aps.iva.h60.a) this.l.getValue();
    }

    @Override // com.amazon.aps.iva.cp.b
    public final void nf(PlayableAsset playableAsset) {
        PlayableAsset playableAsset2 = playableAsset;
        com.amazon.aps.iva.yb0.j.f(playableAsset2, "data");
        ni().f().r2(playableAsset2);
    }

    public com.amazon.aps.iva.qo.i ni() {
        return (com.amazon.aps.iva.qo.i) this.q.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WatchScreenLayout watchScreenLayout = mi().a;
        com.amazon.aps.iva.yb0.j.e(watchScreenLayout, "binding.root");
        setContentView(watchScreenLayout);
        com.amazon.aps.iva.xw.b.d(this, false);
        getOnBackPressedDispatcher().a(this, this.p);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        FrameLayout frameLayout = mi().b;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.errorOverlayContainer");
        f1.i(frameLayout, d.h);
        f1.i(mi().c.getNoNetworkMessageViewContainer(), e.h);
        WatchScreenAssetsLayout assetList = mi().c.getAssetList();
        com.amazon.aps.iva.so.a g2 = ni().g();
        assetList.getClass();
        com.amazon.aps.iva.yb0.j.f(g2, "dependencies");
        com.amazon.aps.iva.so.c cVar = new com.amazon.aps.iva.so.c(assetList, g2);
        assetList.c = cVar;
        com.amazon.aps.iva.h60.b bVar = assetList.b;
        bVar.c.setAdapter((com.amazon.aps.iva.wo.f) cVar.b.getValue());
        bVar.c.addItemDecoration(new com.amazon.aps.iva.wo.k());
        com.amazon.aps.iva.so.c cVar2 = assetList.c;
        if (cVar2 != null) {
            com.ellation.crunchyroll.mvp.lifecycle.a.b(cVar2.a, assetList);
            mi().c.getPlayerView().J5(K1(), this.r, new n(new com.amazon.aps.iva.oo.b(this)), this);
            mi().c.getPlayerView().setToolbarListener(ni().f());
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                com.amazon.aps.iva.ez.e.a(dVar.getPlayerFeature().g().a, this, new f(this));
                ((com.amazon.aps.iva.sf.a) this.m.getValue(this, s[0])).setVisibilityChangeListener(new com.amazon.aps.iva.dp.a(mi().c.getSummary()));
                mi().c.getCastOverlay().setListener(new g());
                return;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("module");
        throw null;
    }

    @Override // com.amazon.aps.iva.k.c, androidx.fragment.app.h, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ni().e().dispose();
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        com.amazon.aps.iva.yb0.j.f(assistContent, "outContent");
        super.onProvideAssistContent(assistContent);
        ni().f().p(new com.amazon.aps.iva.gn.a(assistContent));
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void q8(PlayableAsset playableAsset, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "currentLanguageTag");
        a.C0183a c0183a = com.amazon.aps.iva.cp.a.m;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "supportFragmentManager");
        com.amazon.aps.iva.cp.c cVar = new com.amazon.aps.iva.cp.c(playableAsset.getImages().getPosterWideMediumThumbnailUrl(), str, playableAsset.getAudioLocale(), playableAsset);
        c0183a.getClass();
        com.amazon.aps.iva.cp.a aVar = new com.amazon.aps.iva.cp.a();
        aVar.k.b(aVar, com.amazon.aps.iva.cp.a.n[7], cVar);
        aVar.show(supportFragmentManager, "LANGUAGE_UNAVAILABLE_DIALOG");
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.I(ni().f(), ni().c(), ni().h(), ni().i());
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i2 = com.amazon.aps.iva.u70.h.a;
        View findViewById = findViewById(R.id.snackbar_container);
        com.amazon.aps.iva.yb0.j.e(findViewById, "findViewById(R.id.snackbar_container)");
        h.a.a((ViewGroup) findViewById, iVar);
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void u0() {
        ((com.amazon.aps.iva.sf.a) this.m.getValue(this, s[0])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void u9(com.amazon.aps.iva.sf.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "contentRatingInput");
        ((com.amazon.aps.iva.sf.a) this.m.getValue(this, s[0])).b1(eVar);
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void ud() {
        ((com.amazon.aps.iva.hf.b) this.n.getValue(this, s[1])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void w6(com.amazon.aps.iva.hp.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "model");
        mi().c.getSummary().U2(cVar);
        mi().c.getSummary().setOnShowTitleClickListener(new a());
    }

    @Override // com.amazon.aps.iva.qo.v
    public final int z1() {
        return getSupportFragmentManager().D();
    }

    @Override // com.amazon.aps.iva.qo.v
    public final void z3(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "mediaId");
        FrameLayout frameLayout = mi().b;
        ContentUnavailableLayout contentUnavailableLayout = new ContentUnavailableLayout(this, null, 6, 0);
        contentUnavailableLayout.b1(str, new h(ni().f()));
        frameLayout.addView(contentUnavailableLayout);
    }
}
