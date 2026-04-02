package com.ellation.crunchyroll.presentation.search.result.summary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.p;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.q30.x;
import com.amazon.aps.iva.q30.y;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.u70.i;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.x30.o;
import com.amazon.aps.iva.x30.z;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.animation.AnimationUtil;
import com.ellation.widgets.searchtoolbar.SearchToolbarLayout;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SearchResultSummaryActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/presentation/search/result/summary/SearchResultSummaryActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/x30/z;", "Lcom/amazon/aps/iva/p30/d;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SearchResultSummaryActivity extends com.amazon.aps.iva.i60.b implements z, com.amazon.aps.iva.p30.d {
    public View o;
    public static final /* synthetic */ l<Object>[] s = {q.a(SearchResultSummaryActivity.class, "toolbar", "getToolbar()Lcom/ellation/widgets/searchtoolbar/SearchToolbarLayout;", 0), q.a(SearchResultSummaryActivity.class, "searchContainer", "getSearchContainer()Landroid/view/ViewGroup;", 0), q.a(SearchResultSummaryActivity.class, "errorsLayout", "getErrorsLayout()Landroid/widget/FrameLayout;", 0), q.a(SearchResultSummaryActivity.class, "recentSearchesViewModel", "getRecentSearchesViewModel()Lcom/ellation/crunchyroll/presentation/search/recent/RecentSearchesViewModel;", 0)};
    public static final a r = new a();
    public final int k = R.layout.activity_search_result_summary;
    public final v l = com.amazon.aps.iva.xw.g.d(this, R.id.toolbar);
    public final v m = com.amazon.aps.iva.xw.g.d(this, R.id.search_container);
    public final v n = com.amazon.aps.iva.xw.g.d(this, R.id.errors_layout);
    public final m p = com.amazon.aps.iva.kb0.f.b(new e());
    public final com.amazon.aps.iva.ez.a q = new com.amazon.aps.iva.ez.a(y.class, new g(this), f.h);

    /* compiled from: SearchResultSummaryActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Context context) {
            j.f(context, "context");
            context.startActivity(new Intent(context, SearchResultSummaryActivity.class));
        }
    }

    /* compiled from: SearchResultSummaryActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            String str2 = str;
            j.f(str2, "text");
            a aVar = SearchResultSummaryActivity.r;
            SearchResultSummaryActivity searchResultSummaryActivity = SearchResultSummaryActivity.this;
            ((com.amazon.aps.iva.x30.a) searchResultSummaryActivity.p.getValue()).F(str2);
            ((x) searchResultSummaryActivity.q.getValue(searchResultSummaryActivity, SearchResultSummaryActivity.s[3])).h7(str2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SearchResultSummaryActivity.kt */
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
            com.amazon.aps.iva.xa0.f.a(fVar2, false, false, true, false, com.ellation.crunchyroll.presentation.search.result.summary.a.h, 251);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SearchResultSummaryActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, true, false, false, com.ellation.crunchyroll.presentation.search.result.summary.b.h, 253);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SearchResultSummaryActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.x30.a> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.x30.a invoke() {
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.p30.a aVar = com.amazon.aps.iva.p30.a.h;
            j.f(aVar, "createTimer");
            com.amazon.aps.iva.p30.c cVar2 = new com.amazon.aps.iva.p30.c(cVar, aVar);
            SearchResultSummaryActivity searchResultSummaryActivity = SearchResultSummaryActivity.this;
            j.f(searchResultSummaryActivity, "view");
            return new com.amazon.aps.iva.x30.b(searchResultSummaryActivity, cVar2);
        }
    }

    /* compiled from: SearchResultSummaryActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, y> {
        public static final f h = new f();

        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final y invoke(p pVar) {
            j.f(pVar, "it");
            return new y();
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    @Override // com.amazon.aps.iva.x30.z
    public final void B8(String str) {
        com.ellation.crunchyroll.presentation.search.result.summary.c cVar;
        j.f(str, "newSearchString");
        Fragment B = getSupportFragmentManager().B(R.id.container);
        if (B instanceof com.ellation.crunchyroll.presentation.search.result.summary.c) {
            cVar = (com.ellation.crunchyroll.presentation.search.result.summary.c) B;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            cVar.di().y0(str, o.h);
        }
    }

    @Override // com.amazon.aps.iva.x30.z
    public final void Bf() {
        ViewGroup viewGroup = (ViewGroup) this.m.getValue(this, s[1]);
        View view = this.o;
        if (view != null) {
            AnimationUtil.INSTANCE.hideViewWithFade(view);
        }
        AnimationUtil.INSTANCE.showViewWithFade(viewGroup);
        this.o = viewGroup;
    }

    @Override // com.amazon.aps.iva.p30.d
    public final void F(i iVar) {
        j.f(iVar, "message");
        int i = com.amazon.aps.iva.u70.h.a;
        h.a.a((FrameLayout) this.n.getValue(this, s[2]), iVar);
    }

    @Override // com.amazon.aps.iva.x30.z
    public final void bb() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a a2 = defpackage.b.a(supportFragmentManager, supportFragmentManager);
        com.ellation.crunchyroll.presentation.search.result.summary.c.u.getClass();
        com.ellation.crunchyroll.presentation.search.result.summary.c cVar = new com.ellation.crunchyroll.presentation.search.result.summary.c();
        cVar.i.b(cVar, com.ellation.crunchyroll.presentation.search.result.summary.c.v[6], "");
        a2.e(R.id.container, cVar, null);
        a2.i();
    }

    @Override // com.amazon.aps.iva.wy.c
    public final Integer ji() {
        return Integer.valueOf(this.k);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.amazon.aps.iva.xw.b.d(this, false);
        ((com.amazon.aps.iva.x30.a) this.p.getValue()).onCreate(bundle);
        l<?>[] lVarArr = s;
        l<?> lVar = lVarArr[0];
        v vVar = this.l;
        ((SearchToolbarLayout) vVar.getValue(this, lVar)).setNavigationOnClickListener(new com.amazon.aps.iva.ne.a(this, 19));
        ((SearchToolbarLayout) vVar.getValue(this, lVarArr[0])).setSearchTextChangeListener(new b());
        f1.i((SearchToolbarLayout) vVar.getValue(this, lVarArr[0]), c.h);
        f1.i((FrameLayout) this.n.getValue(this, lVarArr[2]), d.h);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H((com.amazon.aps.iva.x30.a) this.p.getValue());
    }
}
