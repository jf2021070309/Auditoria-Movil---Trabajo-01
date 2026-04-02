package com.ellation.crunchyroll.presentation.main.browse;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ph.a;
import com.amazon.aps.iva.tz.b1;
import com.amazon.aps.iva.tz.c1;
import com.amazon.aps.iva.tz.r0;
import com.amazon.aps.iva.vx.m;
import com.amazon.aps.iva.xw.s0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: BrowseBottomBarActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/presentation/main/browse/BrowseBottomBarActivity;", "Lcom/amazon/aps/iva/v10/c;", "Lcom/amazon/aps/iva/l10/b;", "Lcom/amazon/aps/iva/xh/c;", "Lcom/amazon/aps/iva/vx/m;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BrowseBottomBarActivity extends com.amazon.aps.iva.v10.c implements com.amazon.aps.iva.l10.b, com.amazon.aps.iva.xh.c, m {
    public static final /* synthetic */ int v = 0;
    public final int r = 2;
    public final com.amazon.aps.iva.ls.a s = com.amazon.aps.iva.ls.a.BROWSE;
    public final com.amazon.aps.iva.xh.b t = a.C0616a.a(((d0) com.ellation.crunchyroll.application.e.a()).i, this, null, null, null, null, 30);
    public final com.amazon.aps.iva.xw.a u = com.amazon.aps.iva.xw.b.b(this, new c());

    /* compiled from: BrowseBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Activity activity) {
            j.f(activity, "activity");
            Intent intent = new Intent(activity, BrowseBottomBarActivity.class);
            intent.addFlags(131072);
            intent.putExtra("should_animate", true);
            intent.putExtra("should_open_browse_all", true);
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }
    }

    /* compiled from: BrowseBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.cg.c.values().length];
            try {
                iArr[com.amazon.aps.iva.cg.c.POPULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.cg.c.GENRES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.cg.c.SIMULCAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* compiled from: BrowseBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e.m, q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.e.m mVar) {
            com.amazon.aps.iva.e.m mVar2 = mVar;
            j.f(mVar2, "$this$onBackPressedCallback");
            BrowseBottomBarActivity browseBottomBarActivity = BrowseBottomBarActivity.this;
            if (browseBottomBarActivity.getSupportFragmentManager().D() == 2) {
                browseBottomBarActivity.Rb();
            } else {
                browseBottomBarActivity.finish();
            }
            mVar2.setEnabled(false);
            return q.a;
        }
    }

    /* compiled from: BrowseBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a<Fragment> {
        public static final d h = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Fragment invoke() {
            return r0.a.a(r0.k, b1.BROWSE_ALL, null, com.amazon.aps.iva.a00.b.Popularity, 2);
        }
    }

    /* compiled from: BrowseBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a<Fragment> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Fragment invoke() {
            return r0.a.a(r0.k, b1.GENRE, this.h, null, 4);
        }
    }

    /* compiled from: BrowseBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.a<Fragment> {
        public static final f h = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Fragment invoke() {
            return r0.a.a(r0.k, b1.BROWSE_SIMULCAST, null, null, 6);
        }
    }

    /* compiled from: BrowseBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends l implements com.amazon.aps.iva.xb0.a<Fragment> {
        public final /* synthetic */ b1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b1 b1Var) {
            super(0);
            this.h = b1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Fragment invoke() {
            return r0.a.a(r0.k, this.h, null, null, 6);
        }
    }

    @Override // com.amazon.aps.iva.xh.c
    public final com.amazon.aps.iva.xh.b H6() {
        return this.t;
    }

    @Override // com.amazon.aps.iva.vx.m
    public final void Oa() {
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return this.s;
    }

    @Override // com.amazon.aps.iva.l10.b
    public final void o1(com.amazon.aps.iva.l10.a aVar) {
        j.f(aVar, "genre");
        com.amazon.aps.iva.n10.j.q.getClass();
        com.amazon.aps.iva.n10.j jVar = new com.amazon.aps.iva.n10.j();
        jVar.c.b(jVar, com.amazon.aps.iva.n10.j.r[0], aVar);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.e(R.id.tab_container_primary, jVar, null);
        aVar2.c(null);
        aVar2.h();
    }

    @Override // com.amazon.aps.iva.v10.a, com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.amazon.aps.iva.cg.c cVar;
        int i;
        Object obj;
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(this, this.u);
        View ri = ri();
        View view = (View) this.m.getValue(this, com.amazon.aps.iva.v10.a.q[3]);
        j.d(view, "null cannot be cast to non-null type android.view.ViewGroup");
        j.f(ri, "<this>");
        ri.setOnApplyWindowInsetsListener(new s0((ViewGroup) view));
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras.getSerializable("screen_destination_deeplink", com.amazon.aps.iva.cg.c.class);
                } else {
                    obj = (com.amazon.aps.iva.cg.c) extras.getSerializable("screen_destination_deeplink");
                }
                cVar = (com.amazon.aps.iva.cg.c) obj;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                i = -1;
            } else {
                i = b.a[cVar.ordinal()];
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Intent intent = getIntent();
                        j.e(intent, "intent");
                        ti(intent);
                        return;
                    }
                    mi(f.h);
                    return;
                }
                mi(new e(getIntent().getStringExtra("screen_id_deeplink")));
                return;
            }
            mi(d.h);
        }
    }

    @Override // com.amazon.aps.iva.v10.a, com.amazon.aps.iva.wy.c, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        j.f(intent, "intent");
        super.onNewIntent(intent);
        ti(intent);
    }

    @Override // com.amazon.aps.iva.v10.a
    public final int pi() {
        return this.r;
    }

    public final void ti(Intent intent) {
        b1 b1Var;
        boolean booleanExtra = intent.getBooleanExtra("should_open_browse_all", false);
        boolean booleanExtra2 = intent.getBooleanExtra("should_open_browse_music", false);
        if (qi() == null) {
            if (booleanExtra) {
                b1Var = b1.BROWSE_ALL;
            } else if (booleanExtra2) {
                b1Var = b1.BROWSE_MUSIC;
            } else {
                b1Var = null;
            }
            mi(new g(b1Var));
        } else if (booleanExtra) {
            if (!(qi() instanceof c1)) {
                Rb();
                R8();
            }
            Fragment qi = qi();
            j.d(qi, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.browse.BrowseView");
            ((c1) qi).Vh(b1.BROWSE_ALL);
        }
    }
}
