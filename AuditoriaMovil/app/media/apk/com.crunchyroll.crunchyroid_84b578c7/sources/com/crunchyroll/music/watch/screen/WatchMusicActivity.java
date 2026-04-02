package com.crunchyroll.music.watch.screen;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import com.amazon.aps.iva.cj.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.el.b0;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.ni.q;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yh.f;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.music.watch.screen.WatchMusicActivity;
import com.crunchyroll.music.watch.screen.layout.WatchMusicLayout;
import com.ellation.crunchyroll.ui.toolbarmenu.MenuButtonData;
import com.ellation.crunchyroll.ui.toolbarmenu.ToolbarMenuButtonDataProvider;
import com.ellation.widgets.bottommessage.error.ErrorBottomMessageView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: WatchMusicActivity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\nB\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/crunchyroll/music/watch/screen/WatchMusicActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/gn/e;", "Lcom/amazon/aps/iva/ni/q;", "Lcom/amazon/aps/iva/pi/f;", "Lcom/amazon/aps/iva/u70/j;", "Lcom/amazon/aps/iva/el/b0;", "Lcom/amazon/aps/iva/cj/z;", "Lcom/amazon/aps/iva/ni/a;", "Lcom/ellation/crunchyroll/ui/toolbarmenu/ToolbarMenuButtonDataProvider;", "Lcom/amazon/aps/iva/df/b;", "<init>", "()V", "music_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WatchMusicActivity extends com.amazon.aps.iva.i60.b implements com.amazon.aps.iva.gn.e, q, com.amazon.aps.iva.pi.f, com.amazon.aps.iva.u70.j, b0, z, com.amazon.aps.iva.ni.a, ToolbarMenuButtonDataProvider, com.amazon.aps.iva.df.b {
    public static final /* synthetic */ int s = 0;
    public androidx.appcompat.app.e m;
    public final com.amazon.aps.iva.kb0.e k = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.NONE, new i(this));
    public final m l = com.amazon.aps.iva.kb0.f.b(new b());
    public final com.amazon.aps.iva.xw.a n = com.amazon.aps.iva.xw.b.b(this, new c());
    public final v<MenuButtonData> o = new v<>();
    public final boolean p = true;
    public final m q = com.amazon.aps.iva.kb0.f.b(new a());
    public final com.amazon.aps.iva.ni.b r = new com.amazon.aps.iva.ni.b();

    /* compiled from: WatchMusicActivity.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<GridLayoutManager> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final GridLayoutManager invoke() {
            WatchMusicActivity watchMusicActivity = WatchMusicActivity.this;
            return new GridLayoutManager(watchMusicActivity, watchMusicActivity.getResources().getInteger(R.integer.music_list_span_count));
        }
    }

    /* compiled from: WatchMusicActivity.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ni.e> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ni.e invoke() {
            int i = com.amazon.aps.iva.ni.e.a;
            WatchMusicActivity watchMusicActivity = WatchMusicActivity.this;
            com.amazon.aps.iva.yb0.j.f(watchMusicActivity, "activity");
            return new com.amazon.aps.iva.ni.f(watchMusicActivity);
        }
    }

    /* compiled from: WatchMusicActivity.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e.m, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e.m mVar) {
            com.amazon.aps.iva.yb0.j.f(mVar, "$this$onBackPressedCallback");
            int i = WatchMusicActivity.s;
            WatchMusicActivity.this.ni().getPresenter().a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchMusicActivity.kt */
    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, false, true, false, com.crunchyroll.music.watch.screen.a.h, 251);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchMusicActivity.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class e extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.u70.i, com.amazon.aps.iva.kb0.q> {
        public e(Object obj) {
            super(1, obj, WatchMusicActivity.class, "showSnackbar", "showSnackbar(Lcom/ellation/widgets/snackbar/MessageSnackbarUiModel;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.u70.i iVar) {
            com.amazon.aps.iva.u70.i iVar2 = iVar;
            com.amazon.aps.iva.yb0.j.f(iVar2, "p0");
            ((WatchMusicActivity) this.receiver).showSnackbar(iVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchMusicActivity.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class f extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public f(com.amazon.aps.iva.ni.g gVar) {
            super(0, gVar, com.amazon.aps.iva.ni.g.class, "onAssetsRetry", "onAssetsRetry()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.ni.g) this.receiver).Q0();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchMusicActivity.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class g extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public g(com.amazon.aps.iva.ni.g gVar) {
            super(0, gVar, com.amazon.aps.iva.ni.g.class, "onRetry", "onRetry()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.ni.g) this.receiver).b();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchMusicActivity.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class h extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public h(com.amazon.aps.iva.ni.g gVar) {
            super(0, gVar, com.amazon.aps.iva.ni.g.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.ni.g) this.receiver).a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ActivityViewBindingDelegate.kt */
    /* loaded from: classes.dex */
    public static final class i extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.vy.b> {
        public final /* synthetic */ com.amazon.aps.iva.k.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.amazon.aps.iva.k.c cVar) {
            super(0);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.vy.b invoke() {
            LayoutInflater layoutInflater = this.h.getLayoutInflater();
            com.amazon.aps.iva.yb0.j.e(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.activity_watch_music, (ViewGroup) null, false);
            int i = R.id.error_overlay_container;
            FrameLayout frameLayout = (FrameLayout) com.amazon.aps.iva.e.z.u(R.id.error_overlay_container, inflate);
            if (frameLayout != null) {
                i = R.id.no_network_error_container;
                if (((FrameLayout) com.amazon.aps.iva.e.z.u(R.id.no_network_error_container, inflate)) != null) {
                    i = R.id.no_network_message_view;
                    if (((ErrorBottomMessageView) com.amazon.aps.iva.e.z.u(R.id.no_network_message_view, inflate)) != null) {
                        i = R.id.progress_overlay;
                        View u = com.amazon.aps.iva.e.z.u(R.id.progress_overlay, inflate);
                        if (u != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) u;
                            com.amazon.aps.iva.vf.a aVar = new com.amazon.aps.iva.vf.a(relativeLayout, relativeLayout, 1);
                            int i2 = R.id.transparent_progress_overlay;
                            if (((FrameLayout) com.amazon.aps.iva.e.z.u(R.id.transparent_progress_overlay, inflate)) != null) {
                                i2 = R.id.watch_music_container;
                                WatchMusicLayout watchMusicLayout = (WatchMusicLayout) com.amazon.aps.iva.e.z.u(R.id.watch_music_container, inflate);
                                if (watchMusicLayout != null) {
                                    return new com.amazon.aps.iva.vy.b((LinearLayout) inflate, frameLayout, aVar, watchMusicLayout);
                                }
                            }
                            i = i2;
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    /* compiled from: WatchMusicActivity.kt */
    /* loaded from: classes.dex */
    public static final class j extends GridLayoutManager.c {
        public final /* synthetic */ int c;

        public j(int i) {
            this.c = i;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            if (i == 0) {
                return this.c;
            }
            return 1;
        }
    }

    @Override // com.amazon.aps.iva.pi.f
    public final void Ad() {
        androidx.appcompat.app.e eVar = this.m;
        if (eVar != null) {
            eVar.dismiss();
        }
    }

    @Override // com.amazon.aps.iva.ni.a
    public final boolean G() {
        return mi().d.getPlayer().Ye();
    }

    @Override // com.amazon.aps.iva.cj.z
    public final boolean K1() {
        return this.p;
    }

    @Override // com.amazon.aps.iva.cj.z
    public final void M() {
        ni().getPresenter().H();
    }

    @Override // com.amazon.aps.iva.pi.f
    public final void P2() {
        this.m = new MaterialAlertDialogBuilder(this).setCancelable(false).setMessage(R.string.dialog_casting_unavailable_message).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.amazon.aps.iva.ni.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = WatchMusicActivity.s;
                WatchMusicActivity watchMusicActivity = WatchMusicActivity.this;
                com.amazon.aps.iva.yb0.j.f(watchMusicActivity, "this$0");
                watchMusicActivity.ni().c().q6();
            }
        }).setPositiveButton(R.string.dialog_casting_stop_button, new DialogInterface.OnClickListener() { // from class: com.amazon.aps.iva.ni.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = WatchMusicActivity.s;
                WatchMusicActivity watchMusicActivity = WatchMusicActivity.this;
                com.amazon.aps.iva.yb0.j.f(watchMusicActivity, "this$0");
                watchMusicActivity.ni().c().r6();
            }
        }).show();
    }

    @Override // com.amazon.aps.iva.cj.z
    public final void Qd() {
        ni().c().s6();
    }

    @Override // com.amazon.aps.iva.ni.q
    public final void R(List<com.amazon.aps.iva.ci.h> list) {
        com.amazon.aps.iva.yb0.j.f(list, "musicAssetsList");
        ni().a().e(list);
    }

    @Override // com.amazon.aps.iva.ni.q
    public final void Rd() {
        FrameLayout frameLayout = mi().b;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.errorOverlayContainer");
        com.amazon.aps.iva.k60.a.d(frameLayout, new g(ni().getPresenter()), new h(ni().getPresenter()), 0, 0, 0L, 0L, 252);
    }

    @Override // com.amazon.aps.iva.cj.z
    public final void Sc(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
    }

    @Override // com.amazon.aps.iva.gn.e
    public final void Tb(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        startActivity(com.amazon.aps.iva.gd0.j.i(this, str));
    }

    @Override // com.amazon.aps.iva.ni.q
    public final void V5() {
        com.amazon.aps.iva.k60.a.d(mi().d.getAssetsError(), new f(ni().getPresenter()), null, 0, 0, 0L, 0L, 254);
    }

    @Override // com.amazon.aps.iva.df.b
    public final com.amazon.aps.iva.df.a X7() {
        return this.r;
    }

    @Override // com.amazon.aps.iva.ni.q
    public final void Yc(com.amazon.aps.iva.qi.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "summaryUiModel");
        ni().d().e(f1.J(gVar));
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void a() {
        RelativeLayout relativeLayout = (RelativeLayout) mi().c.b;
        com.amazon.aps.iva.yb0.j.e(relativeLayout, "binding.progressOverlay.root");
        relativeLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void b() {
        RelativeLayout relativeLayout = (RelativeLayout) mi().c.b;
        com.amazon.aps.iva.yb0.j.e(relativeLayout, "binding.progressOverlay.root");
        relativeLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.ni.q
    public final void b7() {
        mi().d.getAssetsProgress().setVisibility(0);
    }

    @Override // com.ellation.crunchyroll.ui.toolbarmenu.ToolbarMenuButtonDataProvider
    public final LiveData getMenuButtonLiveData() {
        return this.o;
    }

    public final com.amazon.aps.iva.vy.b mi() {
        return (com.amazon.aps.iva.vy.b) this.k.getValue();
    }

    public final com.amazon.aps.iva.ni.e ni() {
        return (com.amazon.aps.iva.ni.e) this.l.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LinearLayout linearLayout = mi().a;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.root");
        setContentView(linearLayout);
        mi().d.getAssetList().addItemDecoration(com.amazon.aps.iva.ci.f.a);
        mi().d.getAssetList().setAdapter(new androidx.recyclerview.widget.f(ni().d(), ni().a()));
        mi().d.getPlayer().J5(false, this.o, new com.amazon.aps.iva.pi.q(new com.amazon.aps.iva.yh.d(new com.amazon.aps.iva.yh.b(this))), this);
        mi().d.getPlayer().setToolbarListener(ni().getPresenter());
        FrameLayout frameLayout = mi().b;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.errorOverlayContainer");
        f1.i(frameLayout, d.h);
        com.amazon.aps.iva.yh.i iVar = f.a.a;
        if (iVar != null) {
            com.amazon.aps.iva.ez.e.a(iVar.getPlayerFeature().g().a, this, new e(this));
            getOnBackPressedDispatcher().a(this, this.n);
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.I(ni().c(), ni().getPresenter());
    }

    @Override // com.amazon.aps.iva.ni.q
    public final void sh() {
        mi().d.getAssetsProgress().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i2 = com.amazon.aps.iva.u70.h.a;
        View findViewById = findViewById(R.id.snackbar_container);
        com.amazon.aps.iva.yb0.j.e(findViewById, "findViewById(R.id.snackbar_container)");
        h.a.a((ViewGroup) findViewById, iVar);
    }

    @Override // com.amazon.aps.iva.ni.q
    public final void x8() {
        int integer = getResources().getInteger(R.integer.music_list_span_count);
        m mVar = this.q;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) mVar.getValue();
        if (gridLayoutManager != null) {
            gridLayoutManager.g(integer);
        }
        GridLayoutManager gridLayoutManager2 = (GridLayoutManager) mVar.getValue();
        if (gridLayoutManager2 != null) {
            gridLayoutManager2.g = new j(integer);
        }
        mi().d.getAssetList().setLayoutManager((GridLayoutManager) mVar.getValue());
    }

    @Override // com.amazon.aps.iva.cj.z
    public final void Dh() {
    }
}
