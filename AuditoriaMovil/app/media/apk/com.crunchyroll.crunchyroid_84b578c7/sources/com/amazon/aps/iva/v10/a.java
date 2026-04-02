package com.amazon.aps.iva.v10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import botX.mod.p.C0089;
import com.amazon.aps.iva.cg.d0;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.lb0.h0;
import com.amazon.aps.iva.ne0.e;
import com.amazon.aps.iva.ne0.s;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.v10.d;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.y30.e0;
import com.amazon.aps.iva.y30.k0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.main.BottomNavigationBarLayout;
import com.ellation.crunchyroll.presentation.main.BottomNavigationTabItemLayout;
import com.ellation.crunchyroll.presentation.main.browse.BrowseBottomBarActivity;
import com.ellation.crunchyroll.presentation.main.home.HomeBottomBarActivity;
import com.ellation.crunchyroll.presentation.main.lists.MyListsBottomBarActivity;
import com.ellation.crunchyroll.presentation.main.settings.SettingsBottomBarActivity;
import com.ellation.crunchyroll.presentation.main.simulcast.SimulcastBottomBarActivity;
import com.ellation.crunchyroll.presentation.main.store.CrStoreBottomBarActivity;
import com.i.a.k.update;
import java.util.Map;
import java.util.Set;
/* compiled from: BaseBottomBarActivity.kt */
/* loaded from: classes2.dex */
public abstract class a extends com.amazon.aps.iva.i60.b implements f, e0.a, com.amazon.aps.iva.u70.j, com.amazon.aps.iva.us.a {
    public static final /* synthetic */ l<Object>[] q = {q.a(a.class, "bottomNavigationBar", "getBottomNavigationBar()Lcom/ellation/crunchyroll/presentation/main/BottomNavigationBarLayout;", 0), q.a(a.class, "castMiniControllerLayout", "getCastMiniControllerLayout()Lcom/ellation/crunchyroll/cast/mini/CastMiniControllerLayout;", 0), q.a(a.class, "tabContainerPrimary", "getTabContainerPrimary()Landroid/view/View;", 0), q.a(a.class, "tabContainerSecondary", "getTabContainerSecondary()Landroid/view/View;", 0)};
    public final v k = com.amazon.aps.iva.xw.g.d(this, R.id.bottom_navigation_bar);
    public final v l;
    public final v m;
    public final m n;
    public final m o;
    public final int p;

    /* compiled from: BaseBottomBarActivity.kt */
    /* renamed from: com.amazon.aps.iva.v10.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0779a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<d> {
        public C0779a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final d invoke() {
            a aVar = a.this;
            return d.a.a(aVar.pi(), aVar);
        }
    }

    /* compiled from: BaseBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, true, false, false, com.amazon.aps.iva.v10.b.h, 253);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BaseBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<e0> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final e0 invoke() {
            a aVar = a.this;
            com.amazon.aps.iva.yb0.j.f(aVar, "activity");
            return new k0(aVar);
        }
    }

    public a() {
        com.amazon.aps.iva.xw.g.b(this, R.id.cast_mini_controller_layout);
        this.l = com.amazon.aps.iva.xw.g.d(this, R.id.tab_container_primary);
        this.m = com.amazon.aps.iva.xw.g.d(this, R.id.tab_container_secondary);
        this.n = com.amazon.aps.iva.kb0.f.b(new C0779a());
        this.o = com.amazon.aps.iva.kb0.f.b(new c());
        this.p = R.layout.activity_bottom_navigation;
    }

    @Override // com.amazon.aps.iva.v10.f
    public final void A() {
        si(HomeBottomBarActivity.class);
    }

    @Override // com.amazon.aps.iva.v10.f
    public final void Ic() {
        si(CrStoreBottomBarActivity.class);
    }

    @Override // com.amazon.aps.iva.v10.f
    public final void P9() {
        si(BrowseBottomBarActivity.class);
    }

    @Override // com.amazon.aps.iva.v10.f
    public void R8() {
        if (getSupportFragmentManager().D() > 0) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            int id = getSupportFragmentManager().d.get(0).getId();
            if (id >= 0) {
                supportFragmentManager.Q(id, 1);
            } else {
                supportFragmentManager.getClass();
                throw new IllegalArgumentException(c0.a("Bad id: ", id));
            }
        }
    }

    @Override // com.amazon.aps.iva.v10.f
    public final void Rb() {
        ri().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.v10.f
    public final void Zc(d0 d0Var) {
        SettingsBottomBarActivity.B.getClass();
        startActivity(SettingsBottomBarActivity.a.a(this, d0Var));
        overridePendingTransition(0, 0);
    }

    @Override // com.amazon.aps.iva.v10.f
    public final void ec() {
        si(MyListsBottomBarActivity.class);
    }

    @Override // com.amazon.aps.iva.wy.c
    public Integer ji() {
        return Integer.valueOf(this.p);
    }

    @Override // com.amazon.aps.iva.v10.f
    public final void l8() {
        si(SimulcastBottomBarActivity.class);
    }

    @Override // com.amazon.aps.iva.y30.e0.a
    public final e0 mh() {
        return (e0) this.o.getValue();
    }

    public final void mi(com.amazon.aps.iva.xb0.a<? extends Fragment> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "createFragment");
        if (qi() == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a a = defpackage.b.a(supportFragmentManager, supportFragmentManager);
            a.d(R.id.tab_container_primary, aVar.invoke(), null, 1);
            a.h();
        }
    }

    public final void ni(Fragment fragment, String str) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.e(R.id.tab_container_secondary, fragment, str);
        aVar.c(str);
        aVar.h();
        ri().setVisibility(8);
    }

    public final BottomNavigationBarLayout oi() {
        return (BottomNavigationBarLayout) this.k.getValue(this, q[0]);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        C0089.m1(this);
        super.onCreate(bundle);
        ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).o.a().a(this);
        oi().setOnTabSelectedListener((d) this.n.getValue());
        com.amazon.aps.iva.xw.b.d(this, false);
        f1.i(oi(), b.h);
        update.ok(this);
    }

    @Override // com.amazon.aps.iva.wy.c, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        com.amazon.aps.iva.qy.a aVar;
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        super.onNewIntent(intent);
        if (n.w(intent)) {
            overridePendingTransition(0, 0);
        }
        Fragment B = getSupportFragmentManager().B(R.id.tab_container_secondary);
        com.amazon.aps.iva.qy.a aVar2 = null;
        if (B instanceof com.amazon.aps.iva.qy.a) {
            aVar = (com.amazon.aps.iva.qy.a) B;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.ci(intent);
            return;
        }
        Fragment qi = qi();
        if (qi instanceof com.amazon.aps.iva.qy.a) {
            aVar2 = (com.amazon.aps.iva.qy.a) qi;
        }
        if (aVar2 != null) {
            aVar2.ci(intent);
        }
    }

    public abstract int pi();

    public final Fragment qi() {
        return getSupportFragmentManager().B(R.id.tab_container_primary);
    }

    public final View ri() {
        return (View) this.l.getValue(this, q[2]);
    }

    @Override // com.amazon.aps.iva.cz.b
    public Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((d) this.n.getValue());
    }

    @Override // com.amazon.aps.iva.u70.j
    public void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i = com.amazon.aps.iva.u70.h.a;
        View findViewById = findViewById(R.id.errors_layout);
        com.amazon.aps.iva.yb0.j.e(findViewById, "findViewById(R.id.errors_layout)");
        h.a.a((ViewGroup) findViewById, iVar);
    }

    public final void si(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        intent.addFlags(131072);
        intent.putExtra("should_animate", true);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    @Override // com.amazon.aps.iva.v10.f
    public final void v6(int i) {
        Map<Integer, BottomNavigationTabItemLayout> map = oi().c;
        BottomNavigationTabItemLayout bottomNavigationTabItemLayout = map.get(Integer.valueOf(i));
        if (bottomNavigationTabItemLayout != null) {
            bottomNavigationTabItemLayout.setSelected(true);
            CharSequence contentDescription = bottomNavigationTabItemLayout.getContentDescription();
            String string = bottomNavigationTabItemLayout.getResources().getString(R.string.desc_selected_suffix);
            bottomNavigationTabItemLayout.setContentDescription(((Object) contentDescription) + " " + string);
            bottomNavigationTabItemLayout.c(R.color.bottom_navigation_selected_tab_color);
        }
        e.a aVar = new e.a(s.W(h0.c0(map), new i(i)));
        while (aVar.hasNext()) {
            BottomNavigationTabItemLayout bottomNavigationTabItemLayout2 = (BottomNavigationTabItemLayout) ((Map.Entry) aVar.next()).getValue();
            bottomNavigationTabItemLayout2.setSelected(false);
            bottomNavigationTabItemLayout2.c(R.color.bottom_navigation_default_tab_color);
        }
    }

    @Override // com.amazon.aps.iva.v10.k
    public void yh() {
        k kVar;
        Fragment qi = qi();
        if (qi instanceof k) {
            kVar = (k) qi;
        } else {
            kVar = null;
        }
        if (kVar != null) {
            kVar.yh();
        }
    }

    @Override // com.amazon.aps.iva.v10.f
    public final int z1() {
        return getSupportFragmentManager().D();
    }
}
