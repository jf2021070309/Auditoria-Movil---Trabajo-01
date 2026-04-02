package com.ellation.crunchyroll.presentation.main.home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.ct.k;
import com.amazon.aps.iva.js.i;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.lb0.m0;
import com.amazon.aps.iva.ph.a;
import com.amazon.aps.iva.v10.d;
import com.amazon.aps.iva.vx.m;
import com.amazon.aps.iva.vx.v;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yb0.t;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.contentunavailable.fullscreen.ContentUnavailableActivity;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.music.artist.ArtistActivity;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.api.drm.DrmProxyServiceImpl;
import com.ellation.crunchyroll.inappupdates.view.InAppUpdatesLayout;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.Artist;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.ellation.crunchyroll.presentation.downloads.activity.DownloadsActivity;
import com.ellation.crunchyroll.presentation.main.browse.BrowseBottomBarActivity;
import com.ellation.crunchyroll.presentation.main.lists.MyListsBottomBarActivity;
import com.ellation.crunchyroll.presentation.main.settings.SettingsBottomBarActivity;
import com.ellation.crunchyroll.presentation.search.result.summary.SearchResultSummaryActivity;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
import com.ellation.crunchyroll.presentation.startup.StartupActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: HomeBottomBarActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/presentation/main/home/HomeBottomBarActivity;", "Lcom/amazon/aps/iva/v10/c;", "Lcom/amazon/aps/iva/x10/a;", "Lcom/amazon/aps/iva/xh/c;", "Lcom/amazon/aps/iva/vx/m;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HomeBottomBarActivity extends com.amazon.aps.iva.v10.c implements com.amazon.aps.iva.x10.a, com.amazon.aps.iva.xh.c, m {
    public static final a x = new a();
    public final com.amazon.aps.iva.ls.a r = com.amazon.aps.iva.ls.a.HOME;
    public final com.amazon.aps.iva.kb0.m s = f.b(new b());
    public final com.amazon.aps.iva.v10.e t = d.a.a(0, this);
    public final com.amazon.aps.iva.xw.a u = com.amazon.aps.iva.xw.b.b(this, new c());
    public final com.amazon.aps.iva.h.c<String> v;
    public final com.amazon.aps.iva.xh.b w;

    /* compiled from: HomeBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Context context) {
            j.f(context, "context");
            Intent intent = new Intent(context, HomeBottomBarActivity.class);
            intent.addFlags(268468224);
            intent.putExtra("show_primary_screen", true);
            context.startActivity(intent);
        }
    }

    /* compiled from: HomeBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.x10.b> {
        public b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [com.ellation.crunchyroll.presentation.main.home.a] */
        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.x10.b invoke() {
            HomeBottomBarActivity homeBottomBarActivity = HomeBottomBarActivity.this;
            j.f(homeBottomBarActivity, "context");
            if (q.a.a == null) {
                q.a.a = new r(homeBottomBarActivity);
            }
            r rVar = q.a.a;
            j.c(rVar);
            final k a = com.ellation.crunchyroll.application.f.a(null, 3);
            ?? r3 = new t(a) { // from class: com.ellation.crunchyroll.presentation.main.home.a
                @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                public final Object get() {
                    return Boolean.valueOf(((com.amazon.aps.iva.ct.j) this.receiver).R1());
                }
            };
            com.ellation.crunchyroll.presentation.main.home.b bVar = new com.ellation.crunchyroll.presentation.main.home.b(com.ellation.crunchyroll.application.e.b());
            com.amazon.aps.iva.cg.e eVar = new com.amazon.aps.iva.cg.e(com.amazon.aps.iva.ds.c.b);
            com.amazon.aps.iva.i50.c cVar = new com.amazon.aps.iva.i50.c(homeBottomBarActivity, new com.amazon.aps.iva.i50.a(homeBottomBarActivity, true));
            com.amazon.aps.iva.f20.k b = ((d0) com.ellation.crunchyroll.application.e.a()).i.b(homeBottomBarActivity);
            com.amazon.aps.iva.xh.b a2 = a.C0616a.a(((d0) com.ellation.crunchyroll.application.e.a()).i, HomeBottomBarActivity.this, null, null, null, null, 30);
            j.f(b, "subscriptionFlowRouter");
            j.f(a2, "upgradeFlowRouter");
            return new com.amazon.aps.iva.x10.c(homeBottomBarActivity, rVar, r3, bVar, eVar, cVar, b, a2);
        }
    }

    /* compiled from: HomeBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e.m, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e.m mVar) {
            com.amazon.aps.iva.e.m mVar2 = mVar;
            j.f(mVar2, "$this$onBackPressedCallback");
            HomeBottomBarActivity homeBottomBarActivity = HomeBottomBarActivity.this;
            if (homeBottomBarActivity.getSupportFragmentManager().D() == 1) {
                homeBottomBarActivity.Rb();
            } else {
                homeBottomBarActivity.finish();
            }
            mVar2.setEnabled(false);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HomeBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a<Fragment> {
        public static final d h = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Fragment invoke() {
            com.amazon.aps.iva.j10.a.i.getClass();
            return new com.amazon.aps.iva.j10.a();
        }
    }

    /* compiled from: HomeBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e implements com.amazon.aps.iva.h.b<Boolean> {
        public e() {
        }

        @Override // com.amazon.aps.iva.h.b
        public final void a(Boolean bool) {
            Boolean bool2 = bool;
            com.amazon.aps.iva.v10.e eVar = HomeBottomBarActivity.this.t;
            j.e(bool2, "isGranted");
            eVar.c.a(bool2.booleanValue());
        }
    }

    public HomeBottomBarActivity() {
        com.amazon.aps.iva.h.c<String> registerForActivityResult = registerForActivityResult(new com.amazon.aps.iva.i.c(), new e());
        j.e(registerForActivityResult, "registerForActivityResul…nted(isGranted)\n        }");
        this.v = registerForActivityResult;
        this.w = a.C0616a.a(((d0) com.ellation.crunchyroll.application.e.a()).i, this, com.amazon.aps.iva.xh.a.BENTO_DESCRIPTION, null, null, i.CR_VOD_GAMEVAULT, 12);
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void E7(com.amazon.aps.iva.cg.d0 d0Var) {
        j.f(d0Var, FirebaseAnalytics.Param.DESTINATION);
        SettingsBottomBarActivity.B.getClass();
        Intent intent = new Intent(this, SettingsBottomBarActivity.class);
        intent.putExtra("settings_deeplink_destination", d0Var);
        intent.addFlags(131072);
        startActivity(intent);
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void Ea() {
        MyListsBottomBarActivity.a aVar = MyListsBottomBarActivity.w;
        com.amazon.aps.iva.y10.m mVar = com.amazon.aps.iva.y10.m.CRUNCHYLISTS;
        aVar.getClass();
        MyListsBottomBarActivity.a.a(this, mVar);
    }

    @Override // com.amazon.aps.iva.xh.c
    public final com.amazon.aps.iva.xh.b H6() {
        return this.w;
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void I8(MusicAsset musicAsset) {
        j.f(musicAsset, "musicAsset");
        ((d0) com.ellation.crunchyroll.application.e.a()).s.k().a(this, new com.amazon.aps.iva.l50.c(musicAsset.getId(), musicAsset.getType()));
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void Lb(com.amazon.aps.iva.cg.c cVar, String str) {
        j.f(cVar, FirebaseAnalytics.Param.DESTINATION);
        Intent intent = new Intent(this, BrowseBottomBarActivity.class);
        intent.addFlags(131072);
        intent.putExtra("screen_destination_deeplink", cVar);
        if (str != null) {
            intent.putExtra("screen_id_deeplink", str);
        }
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    @Override // com.amazon.aps.iva.vx.m
    public final void Oa() {
        ((com.amazon.aps.iva.x10.b) this.s.getValue()).P1();
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void R0() {
        overridePendingTransition(0, 0);
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void T3() {
        Intent intent = new Intent(this, StartupActivity.class);
        intent.setData(new Uri.Builder().scheme(DrmProxyServiceImpl.ACCOUNTING_ID).authority("offline_library").build());
        startActivity(intent);
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void Uf() {
        startActivity(new Intent(this, DownloadsActivity.class));
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void W8() {
        MyListsBottomBarActivity.a aVar = MyListsBottomBarActivity.w;
        com.amazon.aps.iva.y10.m mVar = com.amazon.aps.iva.y10.m.WATCHLIST;
        aVar.getClass();
        MyListsBottomBarActivity.a.a(this, mVar);
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void Y5() {
        startActivities(new Intent[]{new Intent(this, StartupActivity.class), new Intent(this, DownloadsActivity.class)});
        finish();
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return this.r;
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void be(String str) {
        j.f(str, "mediaId");
        Intent intent = new Intent(this, ContentUnavailableActivity.class);
        intent.putExtra("media_id", str);
        startActivity(intent);
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void d7(Artist artist) {
        j.f(artist, "artist");
        com.amazon.aps.iva.l50.a aVar = new com.amazon.aps.iva.l50.a(artist.getId());
        Intent intent = new Intent(this, ArtistActivity.class);
        j.e(intent.putExtra("ARTIST_INPUT", aVar), "intent.putExtra(ARTIST_INPUT_EXTRA, this)");
        startActivity(intent);
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void e3(Season season) {
        j.f(season, "season");
        ShowPageActivity.K.getClass();
        Intent intent = new Intent(this, ShowPageActivity.class);
        intent.putExtra("show_page_input", new com.amazon.aps.iva.o40.j(com.amazon.aps.iva.x50.t.SERIES, season.getSeriesId(), season.getId()));
        startActivity(intent);
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void f2() {
        com.amazon.aps.iva.j10.a aVar;
        Fragment qi = qi();
        if (qi instanceof com.amazon.aps.iva.j10.a) {
            aVar = (com.amazon.aps.iva.j10.a) qi;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            ((v) aVar.di()).f2();
        }
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void i8() {
        MyListsBottomBarActivity.a aVar = MyListsBottomBarActivity.w;
        com.amazon.aps.iva.y10.m mVar = com.amazon.aps.iva.y10.m.OFFLINE;
        aVar.getClass();
        MyListsBottomBarActivity.a.a(this, mVar);
    }

    @Override // com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((InAppUpdatesLayout) findViewById(R.id.in_app_updates_view)).c.onActivityResult(i, i2, null);
    }

    @Override // com.amazon.aps.iva.v10.a, com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = false;
        if (getIntent().getBooleanExtra("show_downloads_from_notification", false)) {
            LinkedHashSet linkedHashSet = this.c;
            if (!linkedHashSet.contains("show_downloads_from_notification")) {
                linkedHashSet.add("show_downloads_from_notification");
                ((com.amazon.aps.iva.x10.b) this.s.getValue()).U2();
            }
        }
        mi(d.h);
        ((d0) com.ellation.crunchyroll.application.e.a()).h.a(this);
        if (Build.VERSION.SDK_INT >= 33) {
            if (com.amazon.aps.iva.d3.a.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
                z = true;
            }
            if (!z && !com.amazon.aps.iva.c3.a.a(this, "android.permission.POST_NOTIFICATIONS")) {
                this.v.a("android.permission.POST_NOTIFICATIONS");
            }
        }
        getOnBackPressedDispatcher().a(this, this.u);
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void p2() {
        SearchResultSummaryActivity.r.getClass();
        SearchResultSummaryActivity.a.a(this);
    }

    @Override // com.amazon.aps.iva.v10.a
    public final int pi() {
        return 0;
    }

    @Override // com.amazon.aps.iva.v10.a, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return m0.R(super.setupPresenters(), (com.amazon.aps.iva.x10.b) this.s.getValue());
    }

    @Override // com.amazon.aps.iva.x10.a
    public final void t(Panel panel) {
        j.f(panel, "panel");
        ShowPageActivity.K.getClass();
        ShowPageActivity.a.a(this, panel);
    }
}
