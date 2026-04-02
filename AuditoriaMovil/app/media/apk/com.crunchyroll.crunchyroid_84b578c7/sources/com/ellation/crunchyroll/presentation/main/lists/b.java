package com.ellation.crunchyroll.presentation.main.lists;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.lifecycle.p;
import androidx.viewpager2.widget.ViewPager2;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.y10.i;
import com.amazon.aps.iva.y10.k;
import com.amazon.aps.iva.y10.l;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.cast.CastFeature;
import com.ellation.crunchyroll.presentation.main.lists.tabs.MyListsTabLayout;
import com.ellation.crunchyroll.presentation.search.result.summary.SearchResultSummaryActivity;
import com.google.android.material.tabs.TabLayoutMediator;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: MyListsFragment.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/presentation/main/lists/b;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/y10/l;", "Landroidx/appcompat/widget/Toolbar$h;", "Lcom/amazon/aps/iva/us/a;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.qy.a implements l, Toolbar.h, com.amazon.aps.iva.us.a {
    public com.amazon.aps.iva.y10.e g;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] l = {q.a(b.class, "toolbarContainer", "getToolbarContainer()Landroid/view/View;", 0), q.a(b.class, "tabLayout", "getTabLayout()Lcom/ellation/crunchyroll/presentation/main/lists/tabs/MyListsTabLayout;", 0), q.a(b.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), q.a(b.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), q.a(b.class, "editModeViewModel", "getEditModeViewModel()Lcom/ellation/crunchyroll/edit/EditModeViewModel;", 0)};
    public static final a k = new a();
    public final v c = g.f(this, R.id.app_bar);
    public final v d = g.f(this, R.id.tab_layout);
    public final v e = g.f(this, R.id.toolbar);
    public final v f = g.f(this, R.id.view_pager);
    public final i h = new i();
    public final m i = f.b(new d());
    public final com.amazon.aps.iva.ez.a j = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.uw.b.class, new e(this), C0971b.h);

    /* compiled from: MyListsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: MyListsFragment.kt */
    /* renamed from: com.ellation.crunchyroll.presentation.main.lists.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0971b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.uw.b> {
        public static final C0971b h = new C0971b();

        public C0971b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.uw.b invoke(p pVar) {
            j.f(pVar, "it");
            return new com.amazon.aps.iva.uw.b();
        }
    }

    /* compiled from: MyListsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, false, true, false, com.ellation.crunchyroll.presentation.main.lists.c.h, 251);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: MyListsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.y10.j> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.y10.j invoke() {
            com.amazon.aps.iva.y10.m mVar;
            Intent intent;
            Bundle extras;
            Object obj;
            a aVar = b.k;
            b bVar = b.this;
            bVar.getClass();
            com.amazon.aps.iva.uw.a aVar2 = (com.amazon.aps.iva.uw.a) bVar.j.getValue(bVar, b.l[4]);
            Context requireContext = bVar.requireContext();
            j.e(requireContext, "requireContext()");
            if (q.a.a == null) {
                q.a.a = new r(requireContext);
            }
            r rVar = q.a.a;
            j.c(rVar);
            h activity = bVar.getActivity();
            if (activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras.getSerializable("tab_to_open", com.amazon.aps.iva.y10.m.class);
                } else {
                    obj = (com.amazon.aps.iva.y10.m) extras.getSerializable("tab_to_open");
                }
                mVar = (com.amazon.aps.iva.y10.m) obj;
            } else {
                mVar = null;
            }
            return new k(aVar2, rVar, mVar, bVar);
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class e extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<h> {
        public e(Object obj) {
            super(0, obj, Fragment.class, "requireActivity", "requireActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            return ((Fragment) this.receiver).requireActivity();
        }
    }

    @Override // com.amazon.aps.iva.y10.l
    public final void F4() {
        ViewPager2 di = di();
        Iterator<com.amazon.aps.iva.wy.e> it = this.h.a.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next() instanceof com.ellation.crunchyroll.presentation.watchlist.a) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        di.b(i, false);
    }

    @Override // com.amazon.aps.iva.y10.l
    public final void Ig() {
        ViewPager2 di = di();
        i iVar = this.h;
        iVar.getClass();
        di.b(((d0) com.ellation.crunchyroll.application.e.a()).g.b(iVar.a), false);
    }

    @Override // com.amazon.aps.iva.y10.l
    public final void Se() {
        di().setAdapter(new com.amazon.aps.iva.ry.a(this, this.h));
        di().setOffscreenPageLimit(2);
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = l;
        com.amazon.aps.iva.fc0.l<?> lVar = lVarArr[1];
        v vVar = this.d;
        new TabLayoutMediator((MyListsTabLayout) vVar.getValue(this, lVar), di(), new com.amazon.aps.iva.f1.d0(this, 8)).attach();
        new com.amazon.aps.iva.a80.h(di(), (MyListsTabLayout) vVar.getValue(this, lVarArr[1]));
    }

    @Override // com.amazon.aps.iva.y10.l
    public final void Te() {
        di().b(this.h.a(), false);
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        com.amazon.aps.iva.wy.e eVar = this.h.a.get(di().getCurrentItem());
        j.d(eVar, "null cannot be cast to non-null type com.ellation.crunchyroll.analytics.AnalyticsScreenProvider");
        return ((com.amazon.aps.iva.us.a) eVar).b1();
    }

    @Override // com.amazon.aps.iva.wy.e
    public final void ci(Intent intent) {
        j.f(intent, "intent");
        super.ci(intent);
        for (com.amazon.aps.iva.wy.e eVar : this.h.a) {
            eVar.ci(intent);
        }
    }

    public final ViewPager2 di() {
        return (ViewPager2) this.f.getValue(this, l[3]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        j.f(menu, "menu");
        j.f(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.menu_main, menu);
        CastFeature a2 = com.ellation.crunchyroll.application.e.a().a();
        h requireActivity = requireActivity();
        j.e(requireActivity, "requireActivity()");
        a2.addCastButton(requireActivity, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        setHasOptionsMenu(true);
        return layoutInflater.inflate(R.layout.fragment_my_lists, viewGroup, false);
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public final boolean onMenuItemClick(MenuItem menuItem) {
        j.f(menuItem, "menuItem");
        if (menuItem.getItemId() == R.id.menu_item_search) {
            SearchResultSummaryActivity.a aVar = SearchResultSummaryActivity.r;
            h requireActivity = requireActivity();
            j.e(requireActivity, "requireActivity()");
            aVar.getClass();
            SearchResultSummaryActivity.a.a(requireActivity);
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        h requireActivity = requireActivity();
        j.d(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = l;
        com.amazon.aps.iva.fc0.l<?> lVar = lVarArr[2];
        v vVar = this.e;
        ((com.amazon.aps.iva.k.c) requireActivity).setSupportActionBar((Toolbar) vVar.getValue(this, lVar));
        ((Toolbar) vVar.getValue(this, lVarArr[2])).setOnMenuItemClickListener(this);
        f1.i((Toolbar) vVar.getValue(this, lVarArr[2]), c.h);
        com.amazon.aps.iva.fc0.l<?> lVar2 = lVarArr[0];
        this.g = new com.amazon.aps.iva.y10.e((MyListsTabLayout) this.d.getValue(this, lVarArr[1]), (View) this.c.getValue(this, lVar2));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((com.amazon.aps.iva.y10.j) this.i.getValue());
    }

    @Override // com.amazon.aps.iva.y10.l
    public final void u() {
        com.amazon.aps.iva.y10.e eVar = this.g;
        if (eVar != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(eVar.b, "alpha", 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.start();
            ofFloat.addListener(new com.amazon.aps.iva.y10.c(eVar));
        }
        di().setUserInputEnabled(true);
    }

    @Override // com.amazon.aps.iva.y10.l
    public final void z() {
        com.amazon.aps.iva.y10.e eVar = this.g;
        if (eVar != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(eVar.b, "alpha", 0.4f);
            ofFloat.setDuration(300L);
            ofFloat.start();
            ofFloat.addListener(new com.amazon.aps.iva.y10.b(eVar));
        }
        di().setUserInputEnabled(false);
    }
}
