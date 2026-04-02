package com.amazon.aps.iva.tz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.vz.b;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.presentation.browse.BrowseAllFragment;
import com.ellation.crunchyroll.presentation.browse.tabs.BrowseTabLayout;
import com.ellation.crunchyroll.presentation.search.result.summary.SearchResultSummaryActivity;
import com.ellation.crunchyroll.presentation.simulcast.SimulcastFragment;
import com.google.android.material.tabs.TabLayoutMediator;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: BrowseFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/aps/iva/tz/r0;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/tz/c1;", "Landroidx/appcompat/widget/Toolbar$h;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class r0 extends com.amazon.aps.iva.qy.a implements c1, Toolbar.h {
    public final com.amazon.aps.iva.xw.u c = new com.amazon.aps.iva.xw.u("tab_to_open");
    public final com.amazon.aps.iva.xw.u d = new com.amazon.aps.iva.xw.u("genre_id");
    public final com.amazon.aps.iva.xw.u e = new com.amazon.aps.iva.xw.u("sort_option");
    public final com.amazon.aps.iva.xw.v f = com.amazon.aps.iva.xw.g.f(this, R.id.tab_layout);
    public final com.amazon.aps.iva.xw.v g = com.amazon.aps.iva.xw.g.f(this, R.id.toolbar);
    public final com.amazon.aps.iva.xw.v h = com.amazon.aps.iva.xw.g.f(this, R.id.view_pager);
    public final com.amazon.aps.iva.kb0.m i = com.amazon.aps.iva.kb0.f.b(new c());
    public final com.amazon.aps.iva.kb0.m j = com.amazon.aps.iva.kb0.f.b(new f());
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] l = {defpackage.e.b(r0.class, "tabToOpen", "getTabToOpen()Lcom/ellation/crunchyroll/presentation/browse/BrowseTabToOpen;", 0), defpackage.e.b(r0.class, "preselectGenreId", "getPreselectGenreId()Ljava/lang/String;", 0), defpackage.e.b(r0.class, "preselectedSortOption", "getPreselectedSortOption()Lcom/ellation/crunchyroll/presentation/browse/sorting/BrowseSortOption;", 0), com.amazon.aps.iva.k.q.a(r0.class, "tabLayout", "getTabLayout()Lcom/ellation/crunchyroll/presentation/browse/tabs/BrowseTabLayout;", 0), com.amazon.aps.iva.k.q.a(r0.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), com.amazon.aps.iva.k.q.a(r0.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public static final a k = new a();

    /* compiled from: BrowseFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static r0 a(a aVar, b1 b1Var, String str, com.amazon.aps.iva.a00.b bVar, int i) {
            if ((i & 1) != 0) {
                b1Var = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                bVar = null;
            }
            aVar.getClass();
            r0 r0Var = new r0();
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = r0.l;
            r0Var.c.b(r0Var, lVarArr[0], b1Var);
            r0Var.d.b(r0Var, lVarArr[1], str);
            r0Var.e.b(r0Var, lVarArr[2], bVar);
            return r0Var;
        }
    }

    /* compiled from: BrowseFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b1.values().length];
            try {
                iArr[b1.BROWSE_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b1.BROWSE_SIMULCAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b1.GENRE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b1.BROWSE_MUSIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* compiled from: BrowseFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<t0> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final t0 invoke() {
            a aVar = r0.k;
            r0 r0Var = r0.this;
            r0Var.getClass();
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = r0.l;
            String str = (String) r0Var.d.getValue(r0Var, lVarArr[1]);
            com.amazon.aps.iva.a00.b bVar = (com.amazon.aps.iva.a00.b) r0Var.e.getValue(r0Var, lVarArr[2]);
            com.ellation.crunchyroll.application.a aVar2 = a.C0959a.a;
            if (aVar2 != null) {
                Object c = aVar2.c().c(com.amazon.aps.iva.lx.a.class, "browse_music");
                if (c != null) {
                    return new t0((com.amazon.aps.iva.lx.a) c, bVar, str);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.music.BrowseMusicConfigImpl");
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    /* compiled from: BrowseFragment.kt */
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
            com.amazon.aps.iva.xa0.f.a(fVar2, false, false, true, false, s0.h, 251);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BrowseFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends ViewPager2.e {
        public e() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void onPageSelected(int i) {
            boolean z;
            a aVar = r0.k;
            r0 r0Var = r0.this;
            ViewPager2 fi = r0Var.fi();
            if (i != r0Var.di().a()) {
                z = true;
            } else {
                z = false;
            }
            fi.setUserInputEnabled(z);
        }
    }

    /* compiled from: BrowseFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<w0> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final w0 invoke() {
            a aVar = r0.k;
            r0 r0Var = r0.this;
            r0Var.getClass();
            return new x0(r0Var, (b1) r0Var.c.getValue(r0Var, r0.l[0]), b.a.a());
        }
    }

    @Override // com.amazon.aps.iva.tz.c1
    public final void Vh(b1 b1Var) {
        int i;
        int i2;
        com.amazon.aps.iva.yb0.j.f(b1Var, "tabToOpen");
        int i3 = b.a[b1Var.ordinal()];
        int i4 = -1;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        i2 = di().a();
                    } else {
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                } else {
                    i = 0;
                    for (Fragment fragment : di().p()) {
                        if (!(fragment instanceof com.amazon.aps.iva.l10.e)) {
                            i++;
                        } else {
                            i4 = i;
                            break;
                        }
                    }
                    i2 = i4;
                }
            } else {
                i = 0;
                for (Fragment fragment2 : di().p()) {
                    if (!(fragment2 instanceof SimulcastFragment)) {
                        i++;
                    } else {
                        i4 = i;
                        break;
                    }
                }
                i2 = i4;
            }
        } else {
            i = 0;
            for (Fragment fragment3 : di().p()) {
                if (fragment3 instanceof BrowseAllFragment) {
                    i4 = i;
                    break;
                }
                i++;
            }
            i2 = i4;
        }
        fi().b(i2, false);
    }

    public final t0 di() {
        return (t0) this.i.getValue();
    }

    public final Toolbar ei() {
        return (Toolbar) this.g.getValue(this, l[4]);
    }

    public final ViewPager2 fi() {
        return (ViewPager2) this.h.getValue(this, l[5]);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_browse, viewGroup, false);
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public final boolean onMenuItemClick(MenuItem menuItem) {
        com.amazon.aps.iva.yb0.j.f(menuItem, "menuItem");
        if (menuItem.getItemId() == R.id.menu_item_search) {
            SearchResultSummaryActivity.a aVar = SearchResultSummaryActivity.r;
            androidx.fragment.app.h requireActivity = requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
            aVar.getClass();
            SearchResultSummaryActivity.a.a(requireActivity);
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        ei().inflateMenu(R.menu.menu_main);
        ei().setOnMenuItemClickListener(this);
        fi().setAdapter(new com.amazon.aps.iva.ry.a(this, di()));
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = l;
        com.amazon.aps.iva.fc0.l<?> lVar = lVarArr[3];
        com.amazon.aps.iva.xw.v vVar = this.f;
        new TabLayoutMediator((BrowseTabLayout) vVar.getValue(this, lVar), fi(), new com.amazon.aps.iva.g1.m(this)).attach();
        new com.amazon.aps.iva.a80.h(fi(), (BrowseTabLayout) vVar.getValue(this, lVarArr[3]));
        com.amazon.aps.iva.ee0.f1.i(ei(), d.h);
        super.onViewCreated(view, bundle);
        ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).j.addCastButton(ei());
        ViewPager2 fi = fi();
        fi.d.a.add(new e());
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((w0) this.j.getValue());
    }
}
