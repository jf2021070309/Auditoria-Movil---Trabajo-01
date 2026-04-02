package com.amazon.aps.iva.zz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.h;
import androidx.lifecycle.p;
import com.amazon.aps.iva.c8.r;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.lb0.m0;
import com.amazon.aps.iva.tz.p0;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.xw.u;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.application.e;
import com.ellation.crunchyroll.presentation.browse.BrowseAllFragment;
import com.ellation.crunchyroll.presentation.search.result.summary.SearchResultSummaryActivity;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: BrowseGenreFeedFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/aps/iva/zz/a;", "Lcom/ellation/crunchyroll/presentation/browse/BrowseAllFragment;", "Lcom/amazon/aps/iva/zz/d;", "Landroidx/appcompat/widget/Toolbar$h;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a extends BrowseAllFragment implements d, Toolbar.h {
    public static final /* synthetic */ l<Object>[] D = {q.a(a.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), e.b(a.class, "parentGenre", "getParentGenre()Lcom/ellation/crunchyroll/presentation/genres/Genre;", 0), e.b(a.class, "subgenre", "getSubgenre()Lcom/ellation/crunchyroll/presentation/genres/Genre;", 0), q.a(a.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/presentation/browse/BrowseAllViewModel;", 0)};
    public static final C0931a C = new C0931a();
    public final v x = g.f(this, R.id.toolbar);
    public final s y = new s("parent_genre");
    public final u z = new u("subgenre");
    public final m A = f.b(new b());
    public final com.amazon.aps.iva.ez.f B = new com.amazon.aps.iva.ez.f(this, com.ellation.crunchyroll.presentation.browse.a.class, new c());

    /* compiled from: BrowseGenreFeedFragment.kt */
    /* renamed from: com.amazon.aps.iva.zz.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0931a {
    }

    /* compiled from: BrowseGenreFeedFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.zz.b> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.zz.b invoke() {
            C0931a c0931a = a.C;
            a aVar = a.this;
            aVar.getClass();
            return new com.amazon.aps.iva.zz.c(aVar, (com.amazon.aps.iva.a00.b) aVar.k.getValue(aVar, BrowseAllFragment.w[8]));
        }
    }

    /* compiled from: BrowseGenreFeedFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.ellation.crunchyroll.presentation.browse.a> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.ellation.crunchyroll.presentation.browse.a invoke(p pVar) {
            j.f(pVar, "it");
            C0931a c0931a = a.C;
            a aVar = a.this;
            return aVar.ei(aVar.oi(), (com.amazon.aps.iva.l10.a) aVar.z.getValue(aVar, a.D[2]));
        }
    }

    @Override // com.ellation.crunchyroll.presentation.browse.BrowseAllFragment
    public final String gi() {
        return oi().b;
    }

    @Override // com.ellation.crunchyroll.presentation.browse.BrowseAllFragment
    public final com.amazon.aps.iva.ws.b ki() {
        return new com.amazon.aps.iva.ws.g(oi(), (com.amazon.aps.iva.l10.a) this.z.getValue(this, D[2]));
    }

    @Override // com.ellation.crunchyroll.presentation.browse.BrowseAllFragment
    public final com.amazon.aps.iva.ls.a mi() {
        return com.amazon.aps.iva.ls.a.SUBGENRE;
    }

    @Override // com.ellation.crunchyroll.presentation.browse.BrowseAllFragment
    public final p0 ni() {
        return (p0) this.B.getValue(this, D[3]);
    }

    @Override // com.amazon.aps.iva.zz.d
    public final void od(String str, String str2) {
        pi().setTitle(str);
        pi().setSubtitle(str2);
    }

    public final com.amazon.aps.iva.l10.a oi() {
        return (com.amazon.aps.iva.l10.a) this.y.getValue(this, D[1]);
    }

    @Override // com.ellation.crunchyroll.presentation.browse.BrowseAllFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_browse_genre_feed, viewGroup, false);
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

    @Override // com.ellation.crunchyroll.presentation.browse.BrowseAllFragment, com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        Toolbar pi = pi();
        pi.inflateMenu(R.menu.menu_main);
        pi.setOnMenuItemClickListener(this);
        pi.setNavigationOnClickListener(new r(this, 12));
        super.onViewCreated(view, bundle);
        ((com.amazon.aps.iva.zz.b) this.A.getValue()).T5(oi(), (com.amazon.aps.iva.l10.a) this.z.getValue(this, D[2]));
        ((d0) e.a()).j.addCastButton(pi());
    }

    public final Toolbar pi() {
        return (Toolbar) this.x.getValue(this, D[0]);
    }

    @Override // com.ellation.crunchyroll.presentation.browse.BrowseAllFragment, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return m0.Q(super.setupPresenters(), l1.H((com.amazon.aps.iva.zz.b) this.A.getValue()));
    }
}
