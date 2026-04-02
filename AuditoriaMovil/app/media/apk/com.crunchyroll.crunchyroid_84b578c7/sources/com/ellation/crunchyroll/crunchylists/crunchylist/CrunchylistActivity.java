package com.ellation.crunchyroll.crunchylists.crunchylist;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.c8.r;
import com.amazon.aps.iva.cv.j;
import com.amazon.aps.iva.cv.k;
import com.amazon.aps.iva.cv.p;
import com.amazon.aps.iva.cv.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.g70.f;
import com.amazon.aps.iva.gv.b;
import com.amazon.aps.iva.gv.i;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u70.c;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.xu.g;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.connectivity.ConnectionErrorBottomMessageLayout;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.NestedScrollCoordinatorLayout;
import com.ellation.widgets.collapsibletoolbar.CollapsibleToolbarLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CrunchylistActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/crunchylists/crunchylist/CrunchylistActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/cv/x;", "Lcom/amazon/aps/iva/xu/g;", "<init>", "()V", "a", "crunchylists_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CrunchylistActivity extends com.amazon.aps.iva.i60.b implements x, g {
    public static final /* synthetic */ int m = 0;
    public final j k = new j(this);
    public final m l = f.b(new b());

    /* compiled from: CrunchylistActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(h hVar, com.amazon.aps.iva.cv.c cVar) {
            Intent intent = new Intent(hVar, CrunchylistActivity.class);
            com.amazon.aps.iva.yb0.j.e(intent.putExtra("CRUNCHYLIST_INPUT", cVar), "intent.putExtra(\"CRUNCHYLIST_INPUT\", this)");
            hVar.startActivity(intent);
        }
    }

    /* compiled from: CrunchylistActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ov.a> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ov.a invoke() {
            View inflate = LayoutInflater.from(CrunchylistActivity.this).inflate(R.layout.activity_crunchylist, (ViewGroup) null, false);
            int i = R.id.collapsible_app_bar;
            if (((AppBarLayout) z.u(R.id.collapsible_app_bar, inflate)) != null) {
                i = R.id.collapsible_tool_bar;
                CollapsibleToolbarLayout collapsibleToolbarLayout = (CollapsibleToolbarLayout) z.u(R.id.collapsible_tool_bar, inflate);
                if (collapsibleToolbarLayout != null) {
                    i = R.id.crunchylist_connectivity_error;
                    if (((ConnectionErrorBottomMessageLayout) z.u(R.id.crunchylist_connectivity_error, inflate)) != null) {
                        i = R.id.crunchylist_empty_view;
                        View u = z.u(R.id.crunchylist_empty_view, inflate);
                        if (u != null) {
                            int i2 = R.id.empty_crunchylist_popular_button;
                            TextView textView = (TextView) z.u(R.id.empty_crunchylist_popular_button, u);
                            if (textView != null) {
                                i2 = R.id.empty_crunchylist_search_button;
                                Button button = (Button) z.u(R.id.empty_crunchylist_search_button, u);
                                if (button != null) {
                                    com.amazon.aps.iva.cm.c cVar = new com.amazon.aps.iva.cm.c((LinearLayout) u, textView, button, 2);
                                    int i3 = R.id.crunchylist_error_container;
                                    FrameLayout frameLayout = (FrameLayout) z.u(R.id.crunchylist_error_container, inflate);
                                    if (frameLayout != null) {
                                        i3 = R.id.crunchylist_fragment_container;
                                        if (((FrameLayout) z.u(R.id.crunchylist_fragment_container, inflate)) != null) {
                                            i3 = R.id.crunchylist_manage_appbar;
                                            if (((AppBarLayout) z.u(R.id.crunchylist_manage_appbar, inflate)) != null) {
                                                i3 = R.id.crunchylist_manage_toolbar;
                                                View u2 = z.u(R.id.crunchylist_manage_toolbar, inflate);
                                                if (u2 != null) {
                                                    int i4 = R.id.crunchylist_add_show_button;
                                                    TextView textView2 = (TextView) z.u(R.id.crunchylist_add_show_button, u2);
                                                    if (textView2 != null) {
                                                        i4 = R.id.crunchylist_items_count;
                                                        TextView textView3 = (TextView) z.u(R.id.crunchylist_items_count, u2);
                                                        if (textView3 != null) {
                                                            com.amazon.aps.iva.mj.a aVar = new com.amazon.aps.iva.mj.a((ConstraintLayout) u2, textView2, textView3, 2);
                                                            i = R.id.crunchylist_recycler_view;
                                                            RecyclerView recyclerView = (RecyclerView) z.u(R.id.crunchylist_recycler_view, inflate);
                                                            if (recyclerView != null) {
                                                                i = R.id.crunchylist_snackbar_container;
                                                                FrameLayout frameLayout2 = (FrameLayout) z.u(R.id.crunchylist_snackbar_container, inflate);
                                                                if (frameLayout2 != null) {
                                                                    i = R.id.nested_coordinator;
                                                                    NestedScrollCoordinatorLayout nestedScrollCoordinatorLayout = (NestedScrollCoordinatorLayout) z.u(R.id.nested_coordinator, inflate);
                                                                    if (nestedScrollCoordinatorLayout != null) {
                                                                        i = R.id.toolbar;
                                                                        Toolbar toolbar = (Toolbar) z.u(R.id.toolbar, inflate);
                                                                        if (toolbar != null) {
                                                                            return new com.amazon.aps.iva.ov.a((FrameLayout) inflate, collapsibleToolbarLayout, cVar, frameLayout, aVar, recyclerView, frameLayout2, nestedScrollCoordinatorLayout, toolbar);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    throw new NullPointerException("Missing required view with ID: ".concat(u2.getResources().getResourceName(i4)));
                                                }
                                            }
                                        }
                                    }
                                    i = i3;
                                }
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(u.getResources().getResourceName(i2)));
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    /* compiled from: CrunchylistActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.g70.j, q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.g70.j jVar) {
            com.amazon.aps.iva.g70.j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "it");
            k b = CrunchylistActivity.this.k.b();
            Serializable serializable = jVar2.c;
            com.amazon.aps.iva.yb0.j.d(serializable, "null cannot be cast to non-null type com.ellation.crunchyroll.crunchylists.crunchyliststab.list.item.CrunchylistItemUiModel");
            b.M((com.amazon.aps.iva.nv.e) serializable);
            return q.a;
        }
    }

    /* compiled from: CrunchylistActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a70.b, q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.a70.b bVar) {
            com.amazon.aps.iva.a70.b bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "actionItem");
            CrunchylistActivity.this.k.b().O(bVar2);
            return q.a;
        }
    }

    /* compiled from: CrunchylistActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p.i iVar) {
            super(0);
            this.i = iVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            CrunchylistActivity crunchylistActivity = CrunchylistActivity.this;
            com.amazon.aps.iva.dv.d a = crunchylistActivity.k.a();
            RecyclerView recyclerView = crunchylistActivity.mi().f;
            com.amazon.aps.iva.yb0.j.e(recyclerView, "binding.crunchylistRecyclerView");
            com.ellation.crunchyroll.crunchylists.crunchylist.a aVar = new com.ellation.crunchyroll.crunchylists.crunchylist.a(recyclerView);
            com.amazon.aps.iva.yb0.j.f(a, "<this>");
            a.registerAdapterDataObserver(new com.amazon.aps.iva.xw.c(a, aVar));
            this.i.invoke();
            return q.a;
        }
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void C7(List<? extends com.amazon.aps.iva.dv.a> list) {
        com.amazon.aps.iva.yb0.j.f(list, FirebaseAnalytics.Param.ITEMS);
        RecyclerView recyclerView = mi().f;
        com.amazon.aps.iva.yb0.j.e(recyclerView, "binding.crunchylistRecyclerView");
        recyclerView.setVisibility(0);
        this.k.a().e(list);
    }

    @Override // com.amazon.aps.iva.cv.x
    public final boolean Hc() {
        if (getSupportFragmentManager().C("crunchylist_search") != null) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void I(com.amazon.aps.iva.xb0.a<q> aVar) {
        FrameLayout frameLayout = mi().d;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistErrorContainer");
        com.amazon.aps.iva.k60.a.d(frameLayout, aVar, null, 0, 0, 0L, 0L, 254);
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void I1(com.amazon.aps.iva.nv.e eVar) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a a2 = defpackage.b.a(supportFragmentManager, supportFragmentManager);
        b.a aVar = com.amazon.aps.iva.gv.b.e;
        i.c cVar = new i.c(eVar);
        aVar.getClass();
        a2.d(0, b.a.a(cVar), "crunchylists", 1);
        a2.h();
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void N1(com.amazon.aps.iva.nv.e eVar) {
        com.amazon.aps.iva.g70.g gVar = new com.amazon.aps.iva.g70.g(R.style.DeleteCrunchylistDialog, getString(R.string.crunchylists_action_delete), getString(R.string.crunchylist_delete_message), getString(R.string.crunchylist_delete_positive_button), eVar, getString(R.string.crunchylist_delete_negative_button));
        com.amazon.aps.iva.g70.f.e.getClass();
        f.a.a(gVar).show(getSupportFragmentManager(), "delete_dialog_tag");
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void Ng() {
        TextView textView = (TextView) mi().e.c;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.crunchylistManag….crunchylistAddShowButton");
        textView.setEnabled(true);
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void P4() {
        ConstraintLayout a2 = mi().e.a();
        com.amazon.aps.iva.yb0.j.e(a2, "binding.crunchylistManageToolbar.root");
        a2.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void U3(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        mi().i.setTitle(str);
        mi().b.setTitle(str);
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void Z5() {
        ConstraintLayout a2 = mi().e.a();
        com.amazon.aps.iva.yb0.j.e(a2, "binding.crunchylistManageToolbar.root");
        a2.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void a1() {
        getSupportFragmentManager().O();
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void e(String str, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.xb0.a<q> aVar2) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        int i = com.amazon.aps.iva.u70.c.a;
        FrameLayout frameLayout = mi().g;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistSnackbarContainer");
        com.amazon.aps.iva.u70.c a2 = c.a.a(frameLayout, 0, com.ellation.crunchyroll.ui.R.style.ActionSnackBarTextStyle, com.ellation.crunchyroll.ui.R.style.ActionSnackBarActionTextStyle);
        a2.b(aVar, new e((p.i) aVar2));
        String string = getString(R.string.crunchylist_delete_show_snackbar_title, str);
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.crunc…ow_snackbar_title, title)");
        com.amazon.aps.iva.u70.c.c(a2, string, R.string.crunchylist_snackbar_undo, 0, 12);
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void h() {
        LinearLayout a2 = mi().c.a();
        com.amazon.aps.iva.yb0.j.e(a2, "binding.crunchylistEmptyView.root");
        a2.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void h3() {
        com.amazon.aps.iva.xu.f fVar = com.amazon.aps.iva.e1.d.f;
        if (fVar != null) {
            fVar.a.invoke(this);
        } else {
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void i() {
        LinearLayout a2 = mi().c.a();
        com.amazon.aps.iva.yb0.j.e(a2, "binding.crunchylistEmptyView.root");
        a2.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void l3(int i) {
        this.k.a().notifyItemChanged(i);
    }

    public final com.amazon.aps.iva.ov.a mi() {
        return (com.amazon.aps.iva.ov.a) this.l.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = mi().a;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.root");
        setContentView(frameLayout);
        CollapsibleToolbarLayout collapsibleToolbarLayout = mi().b;
        NestedScrollCoordinatorLayout nestedScrollCoordinatorLayout = mi().h;
        com.amazon.aps.iva.yb0.j.e(nestedScrollCoordinatorLayout, "binding.nestedCoordinator");
        Toolbar toolbar = mi().i;
        com.amazon.aps.iva.yb0.j.e(toolbar, "binding.toolbar");
        collapsibleToolbarLayout.c = nestedScrollCoordinatorLayout;
        collapsibleToolbarLayout.getViewTreeObserver().addOnPreDrawListener(new com.amazon.aps.iva.e70.b(collapsibleToolbarLayout, toolbar, true, nestedScrollCoordinatorLayout));
        ((TextView) mi().e.c).setOnClickListener(new com.amazon.aps.iva.c8.k(this, 10));
        ((Button) mi().c.d).setOnClickListener(new r(this, 11));
        RecyclerView recyclerView = mi().f;
        j jVar = this.k;
        recyclerView.setAdapter(jVar.a());
        jVar.a().e.f(mi().f);
        mi().f.addItemDecoration(new com.amazon.aps.iva.dv.l());
        new androidx.recyclerview.widget.q(new com.amazon.aps.iva.r70.e(this, new com.amazon.aps.iva.cv.b(jVar.b()))).f(mi().f);
        String string = getString(R.string.crunchylist_popular_anime);
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.crunchylist_popular_anime)");
        TextView textView = (TextView) mi().c.c;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.crunchylistEmpty…yCrunchylistPopularButton");
        String string2 = getString(R.string.crunchylist_need_help, string);
        com.amazon.aps.iva.yb0.j.e(string2, "getString(\n             …tedText\n                )");
        SpannableString spannableString = new SpannableString(m0.b(com.amazon.aps.iva.d3.a.getColor(this, R.color.primary), string2, string));
        m0.a(spannableString, string, false, new com.amazon.aps.iva.cv.a(this));
        r0.b(textView, spannableString);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "supportFragmentManager");
        com.amazon.aps.iva.bo.e.h(supportFragmentManager, "delete_dialog_tag", this, new c(), com.amazon.aps.iva.g70.i.h);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        com.amazon.aps.iva.yb0.j.f(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_crunchylist, menu);
        return true;
    }

    @Override // com.amazon.aps.iva.i60.b, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        com.amazon.aps.iva.yb0.j.f(menuItem, "item");
        if (menuItem.getItemId() == R.id.menu_item_more) {
            this.k.b().y5();
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void p2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a a2 = defpackage.b.a(supportFragmentManager, supportFragmentManager);
        com.amazon.aps.iva.hv.a.g.getClass();
        a2.e(R.id.crunchylist_fragment_container, new com.amazon.aps.iva.hv.a(), "crunchylist_search");
        a2.c("crunchylist_search");
        a2.h();
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void p3() {
        RecyclerView recyclerView = mi().f;
        com.amazon.aps.iva.yb0.j.e(recyclerView, "binding.crunchylistRecyclerView");
        recyclerView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void qg(int i, int i2) {
        ((TextView) mi().e.d).setText(getResources().getString(R.string.crunchylist_items_count, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(this.k.b());
    }

    @Override // com.amazon.aps.iva.cv.x, com.amazon.aps.iva.xu.g
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i = com.amazon.aps.iva.u70.h.a;
        FrameLayout frameLayout = mi().g;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistSnackbarContainer");
        h.a.a(frameLayout, iVar);
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void x4() {
        TextView textView = (TextView) mi().e.c;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.crunchylistManag….crunchylistAddShowButton");
        textView.setEnabled(false);
    }

    @Override // com.amazon.aps.iva.cv.x
    public final void z9(List<? extends com.amazon.aps.iva.a70.b> list) {
        com.amazon.aps.iva.a70.h hVar = new com.amazon.aps.iva.a70.h(this, list, Integer.valueOf((int) R.style.PopupActionMenuStyle), new d());
        View findViewById = mi().i.findViewById(R.id.menu_item_more);
        com.amazon.aps.iva.yb0.j.e(findViewById, "binding.toolbar.findViewById(R.id.menu_item_more)");
        hVar.G(findViewById);
    }
}
