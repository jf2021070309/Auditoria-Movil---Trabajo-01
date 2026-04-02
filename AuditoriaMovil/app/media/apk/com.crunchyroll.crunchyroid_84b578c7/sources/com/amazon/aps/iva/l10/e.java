package com.amazon.aps.iva.l10;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.cx.p;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.n60.b;
import com.amazon.aps.iva.xw.u;
import com.amazon.aps.iva.xw.v;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.application.a;
import com.ellation.widgets.ScrollToggleRecyclerView;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: GenresListFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/aps/iva/l10/e;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/l10/l;", "Lcom/amazon/aps/iva/w70/i;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.qy.a implements l, com.amazon.aps.iva.w70.i {
    public final u c = new u("genre_id");
    public final v d = com.amazon.aps.iva.xw.g.f(this, R.id.genres_recycler_view);
    public final com.amazon.aps.iva.ez.f e = new com.amazon.aps.iva.ez.f(this, n.class, new d());
    public final com.amazon.aps.iva.kb0.m f = com.amazon.aps.iva.kb0.f.b(new b());
    public final int g = R.string.genres_tab_name;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] i = {defpackage.e.b(e.class, "preselectGenreId", "getPreselectGenreId()Ljava/lang/String;", 0), q.a(e.class, "genresRecyclerView", "getGenresRecyclerView()Lcom/ellation/widgets/ScrollToggleRecyclerView;", 0), q.a(e.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/presentation/genres/GenresListViewModelImpl;", 0)};
    public static final a h = new a();

    /* compiled from: GenresListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: GenresListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<g> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final g invoke() {
            a aVar = e.h;
            e eVar = e.this;
            eVar.getClass();
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = e.i;
            String str = (String) eVar.c.getValue(eVar, lVarArr[0]);
            n nVar = (n) eVar.e.getValue(eVar, lVarArr[2]);
            com.ellation.crunchyroll.application.a aVar2 = a.C0959a.a;
            if (aVar2 != null) {
                Object c = aVar2.c().c(p.class, "app_resume_screens_reload_intervals");
                if (c != null) {
                    return new k(eVar, str, nVar, b.a.a((p) c));
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.ScreenReloadIntervalsImpl");
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    /* compiled from: GenresListFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public c(g gVar) {
            super(0, gVar, g.class, "onRetry", "onRetry()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((g) this.receiver).b();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: GenresListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, n> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final n invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
            com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
            return new n(new com.amazon.aps.iva.l10.d(etpContentService), e.this.requireContext().getResources().getInteger(R.integer.empty_genre_cards_count));
        }
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int G() {
        return 0;
    }

    @Override // com.amazon.aps.iva.l10.l
    public final void H() {
        di().setScrollEnabled(true);
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int H6() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.l10.l
    public final void c() {
        com.amazon.aps.iva.k60.a.c(this, new c((g) this.f.getValue()));
    }

    public final ScrollToggleRecyclerView di() {
        return (ScrollToggleRecyclerView) this.d.getValue(this, i[1]);
    }

    @Override // com.amazon.aps.iva.l10.l
    public final void o1(com.amazon.aps.iva.l10.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "genre");
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.d(requireActivity, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.genres.GenreRouter");
        ((com.amazon.aps.iva.l10.b) requireActivity).o1(aVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_genres_list, viewGroup, false);
    }

    @Override // com.amazon.aps.iva.l10.l
    public final void setGenres(List<? extends com.amazon.aps.iva.m10.e> list) {
        com.amazon.aps.iva.m10.g gVar;
        com.amazon.aps.iva.yb0.j.f(list, "genresList");
        RecyclerView.h adapter = di().getAdapter();
        GridLayoutManager gridLayoutManager = null;
        if (adapter instanceof com.amazon.aps.iva.m10.g) {
            gVar = (com.amazon.aps.iva.m10.g) adapter;
        } else {
            gVar = null;
        }
        if (gVar == null) {
            gVar = new com.amazon.aps.iva.m10.g(new com.amazon.aps.iva.m10.l(new f(this)));
            ScrollToggleRecyclerView di = di();
            di.setAdapter(gVar);
            RecyclerView.p layoutManager = di().getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                gridLayoutManager = (GridLayoutManager) layoutManager;
            }
            if (gridLayoutManager == null) {
                gridLayoutManager = new GridLayoutManager(getContext(), getResources().getInteger(R.integer.genres_list_number_of_columns));
            }
            di.setLayoutManager(gridLayoutManager);
            Context requireContext = requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            di.addItemDecoration(new com.amazon.aps.iva.r30.d(requireContext));
        }
        gVar.e(list);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((g) this.f.getValue());
    }

    @Override // com.amazon.aps.iva.l10.l
    public final void v() {
        di().setScrollEnabled(false);
    }
}
