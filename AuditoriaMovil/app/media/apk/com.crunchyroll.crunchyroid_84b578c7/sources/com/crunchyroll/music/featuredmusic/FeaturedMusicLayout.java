package com.crunchyroll.music.featuredmusic;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.h;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.di.m;
import com.amazon.aps.iva.di.n;
import com.amazon.aps.iva.di.p;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.gn.e;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xw.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yh.f;
import com.amazon.aps.iva.yh.i;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareLazy;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: FeaturedMusicLayout.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/crunchyroll/music/featuredmusic/FeaturedMusicLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/di/m;", "Lcom/amazon/aps/iva/ei/d;", "c", "Lcom/amazon/aps/iva/kb0/e;", "getAdapter", "()Lcom/amazon/aps/iva/ei/d;", "adapter", "Lcom/amazon/aps/iva/di/g;", "d", "getPresenter", "()Lcom/amazon/aps/iva/di/g;", "presenter", "music_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FeaturedMusicLayout extends g implements m {
    public final com.amazon.aps.iva.on.d b;
    public final LifecycleAwareLazy c;
    public final com.amazon.aps.iva.kb0.m d;

    /* compiled from: FeaturedMusicLayout.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ei.d> {
        public final /* synthetic */ Context h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.h = context;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ei.d invoke() {
            Context context = this.h;
            com.crunchyroll.music.featuredmusic.a aVar = new com.crunchyroll.music.featuredmusic.a(context);
            i iVar = f.a.a;
            if (iVar != null) {
                j.d(context, "null cannot be cast to non-null type com.crunchyroll.share.ShareContentView");
                com.amazon.aps.iva.gn.c i = iVar.a.i((e) context);
                Activity a = q.a(context);
                j.c(a);
                return new com.amazon.aps.iva.ei.d(DurationFormatter.Companion.create(context), new com.amazon.aps.iva.gi.e(com.crunchyroll.music.featuredmusic.b.h, i, new com.amazon.aps.iva.ii.a(a)), aVar, k.n(context).c());
            }
            j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: FeaturedMusicLayout.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.di.g> {
        public final /* synthetic */ Context i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.i = context;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.di.g invoke() {
            i iVar = f.a.a;
            if (iVar != null) {
                EtpContentService etpContentService = iVar.getEtpContentService();
                j.f(etpContentService, "contentService");
                com.amazon.aps.iva.di.f fVar = new com.amazon.aps.iva.di.f(etpContentService);
                Context context = this.i;
                j.d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FeaturedMusicLayout featuredMusicLayout = FeaturedMusicLayout.this;
                j.f(featuredMusicLayout, "view");
                return new com.amazon.aps.iva.di.k(featuredMusicLayout, (n) com.amazon.aps.iva.ez.l.a((h) context, p.class, new d(fVar, context)));
            }
            j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: FeaturedMusicLayout.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public c(com.amazon.aps.iva.di.g gVar) {
            super(0, gVar, com.amazon.aps.iva.di.g.class, "onRetry", "onRetry()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.di.g) this.receiver).b();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeaturedMusicLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final com.amazon.aps.iva.ei.d getAdapter() {
        return (com.amazon.aps.iva.ei.d) this.c.getValue();
    }

    private final com.amazon.aps.iva.di.g getPresenter() {
        return (com.amazon.aps.iva.di.g) this.d.getValue();
    }

    @Override // com.amazon.aps.iva.di.m
    public final void Qc(List<? extends com.amazon.aps.iva.ei.i> list) {
        j.f(list, "data");
        getAdapter().e(list);
    }

    public final void b1(com.amazon.aps.iva.di.d dVar) {
        j.f(dVar, "input");
        getPresenter().V1(dVar);
    }

    @Override // com.amazon.aps.iva.di.m
    public final void c() {
        FrameLayout frameLayout = (FrameLayout) this.b.c;
        c cVar = new c(getPresenter());
        j.e(frameLayout, "featuredMusicErrorLayoutContent");
        com.amazon.aps.iva.k60.a.d(frameLayout, cVar, null, R.string.featured_music_error_retry_title, R.string.featured_music_error_retry_button, 0L, 0L, 98);
    }

    @Override // com.amazon.aps.iva.di.m
    public final void jc() {
        RecyclerView recyclerView = (RecyclerView) this.b.d;
        j.e(recyclerView, "binding.featuredMusicList");
        recyclerView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.wy.g, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.amazon.aps.iva.on.d dVar = this.b;
        ((RecyclerView) dVar.d).setAdapter(getAdapter());
        ((RecyclerView) dVar.d).addItemDecoration(com.amazon.aps.iva.ei.f.a);
        ((RecyclerView) dVar.d).setLayoutManager(new GridLayoutManager(getContext(), getResources().getInteger(R.integer.music_list_span_count)));
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(getPresenter());
    }

    @Override // com.amazon.aps.iva.di.m
    public final void t0() {
        RecyclerView recyclerView = (RecyclerView) this.b.d;
        j.e(recyclerView, "binding.featuredMusicList");
        recyclerView.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedMusicLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.featured_music_layout, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.featured_music_error_layout_content;
        FrameLayout frameLayout = (FrameLayout) z.u(R.id.featured_music_error_layout_content, inflate);
        if (frameLayout != null) {
            i2 = R.id.featured_music_list;
            RecyclerView recyclerView = (RecyclerView) z.u(R.id.featured_music_list, inflate);
            if (recyclerView != null) {
                this.b = new com.amazon.aps.iva.on.d((FrameLayout) inflate, frameLayout, recyclerView, 1);
                this.c = com.amazon.aps.iva.aq.j.F(this, new a(context));
                this.d = com.amazon.aps.iva.kb0.f.b(new b(context));
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
