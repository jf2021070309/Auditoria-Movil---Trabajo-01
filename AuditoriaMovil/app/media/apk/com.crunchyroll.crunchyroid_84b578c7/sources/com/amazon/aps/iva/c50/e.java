package com.amazon.aps.iva.c50;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.amazon.aps.iva.b50.t;
import com.amazon.aps.iva.b60.k;
import com.amazon.aps.iva.b60.q;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
import com.ellation.crunchyroll.presentation.watchlist.favorite.FavoriteToggleButton;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.crunchyroll.ui.badges.CardBadgesKt;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
import com.ellation.crunchyroll.ui.labels.LabelsKt;
import com.ellation.widgets.overflow.OverflowButton;
import java.util.List;
import java.util.Set;
/* compiled from: WatchlistItemLayout.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.g implements c {
    public static final /* synthetic */ l<Object>[] k = {q.a(e.class, "thumbnail", "getThumbnail()Landroid/widget/ImageView;", 0), q.a(e.class, "parentTitle", "getParentTitle()Landroid/widget/TextView;", 0), q.a(e.class, "state", "getState()Landroid/widget/TextView;", 0), q.a(e.class, "labels", "getLabels()Landroidx/compose/ui/platform/ComposeView;", 0), q.a(e.class, "favoriteToggleButton", "getFavoriteToggleButton()Lcom/ellation/crunchyroll/presentation/watchlist/favorite/FavoriteToggleButton;", 0), q.a(e.class, "overflowButton", "getOverflowButton()Lcom/ellation/widgets/overflow/OverflowButton;", 0), q.a(e.class, "badgesLayer", "getBadgesLayer()Landroidx/compose/ui/platform/ComposeView;", 0)};
    public final com.amazon.aps.iva.n70.d<t> b;
    public final v c;
    public final v d;
    public final v e;
    public final v f;
    public final v g;
    public final v h;
    public final v i;
    public final f j;

    /* compiled from: WatchlistItemLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ k h;
        public final /* synthetic */ LabelUiModel i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, LabelUiModel labelUiModel) {
            super(2);
            this.h = kVar;
            this.i = labelUiModel;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                CardBadgesKt.CardBadges(this.i, null, null, true, this.h.e, true, false, iVar2, LabelUiModel.$stable | 199680, 70);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchlistItemLayout.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ LabelUiModel h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LabelUiModel labelUiModel) {
            super(2);
            this.h = labelUiModel;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                LabelsKt.m32Labels0OtIIsQ(this.h, null, false, false, false, false, false, true, com.amazon.aps.iva.ao.a.j, null, 0.0f, iVar2, 12582912 | LabelUiModel.$stable, 0, 1662);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, com.amazon.aps.iva.b50.b bVar, com.amazon.aps.iva.n70.d<t> dVar) {
        super(context, null, 0, 6, null);
        j.f(bVar, "watchlistAnalytics");
        j.f(dVar, "menuProvider");
        this.b = dVar;
        this.c = com.amazon.aps.iva.xw.g.c(R.id.watchlist_image, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.watchlist_parent_title, this);
        this.e = com.amazon.aps.iva.xw.g.c(R.id.watchlist_state, this);
        this.f = com.amazon.aps.iva.xw.g.c(R.id.watchlist_labels, this);
        this.g = com.amazon.aps.iva.xw.g.c(R.id.watchlist_favorite_toggle_button, this);
        this.h = com.amazon.aps.iva.xw.g.c(R.id.watchlist_overflow_button, this);
        this.i = com.amazon.aps.iva.xw.g.c(R.id.watchlist_card_badges, this);
        this.j = new f(this, q.a.a(context), new com.amazon.aps.iva.i50.c(context, new com.amazon.aps.iva.i50.a(context, true)), bVar);
        View.inflate(context, R.layout.layout_watchlist_card, this);
        setOnClickListener(new com.amazon.aps.iva.c8.e(this, 23));
    }

    private final ComposeView getBadgesLayer() {
        return (ComposeView) this.i.getValue(this, k[6]);
    }

    private final FavoriteToggleButton getFavoriteToggleButton() {
        return (FavoriteToggleButton) this.g.getValue(this, k[4]);
    }

    private final ComposeView getLabels() {
        return (ComposeView) this.f.getValue(this, k[3]);
    }

    private final OverflowButton getOverflowButton() {
        return (OverflowButton) this.h.getValue(this, k[5]);
    }

    private final TextView getParentTitle() {
        return (TextView) this.d.getValue(this, k[1]);
    }

    private final TextView getState() {
        return (TextView) this.e.getValue(this, k[2]);
    }

    private final ImageView getThumbnail() {
        return (ImageView) this.c.getValue(this, k[0]);
    }

    public final void b1(k kVar, int i) {
        f fVar = this.j;
        fVar.getClass();
        fVar.e = kVar;
        fVar.f = i;
        c view = fVar.getView();
        k kVar2 = fVar.e;
        if (kVar2 != null) {
            view.setParentTitle(kVar2.g.getMetadata().getParentTitle());
            c view2 = fVar.getView();
            k kVar3 = fVar.e;
            if (kVar3 != null) {
                view2.setItemState(fVar.b.a(kVar3));
                OverflowButton.b1(getOverflowButton(), this.b.a(new t(kVar, i)));
                FavoriteToggleButton favoriteToggleButton = getFavoriteToggleButton();
                favoriteToggleButton.getClass();
                com.amazon.aps.iva.d50.c cVar = favoriteToggleButton.b;
                cVar.getClass();
                cVar.d = kVar;
                cVar.getView().setSelected(cVar.q6().d);
                LabelUiModel labelUiModel$default = LabelUiModelKt.toLabelUiModel$default(kVar.g, false, 1, null);
                getBadgesLayer().setContent(com.amazon.aps.iva.v0.b.c(1178595795, new a(kVar, labelUiModel$default), true));
                getLabels().setContent(com.amazon.aps.iva.v0.b.c(-395107652, new b(labelUiModel$default), true));
                return;
            }
            j.m("watchlistItem");
            throw null;
        }
        j.m("watchlistItem");
        throw null;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.j.onConfigurationChanged(configuration);
    }

    @Override // com.amazon.aps.iva.c50.c
    public void setItemState(String str) {
        j.f(str, "state");
        getState().setText(str);
    }

    @Override // com.amazon.aps.iva.c50.c
    public void setParentTitle(String str) {
        j.f(str, "title");
        getParentTitle().setText(str);
    }

    @Override // com.amazon.aps.iva.c50.c
    public void setThumbnailImage(List<Image> list) {
        j.f(list, "thumbnails");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context context = getContext();
        ImageView thumbnail = getThumbnail();
        j.e(context, "context");
        com.amazon.aps.iva.ly.c.a(imageUtil, context, list, thumbnail, Integer.valueOf((int) R.drawable.ic_missing_card_image), Integer.valueOf((int) R.color.cr_woodsmoke), Integer.valueOf((int) R.color.cr_black_pearl));
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(this.j);
    }

    @Override // com.amazon.aps.iva.c50.c
    public final void t(Panel panel) {
        j.f(panel, "panel");
        ShowPageActivity.a aVar = ShowPageActivity.K;
        Context context = getContext();
        j.e(context, "context");
        aVar.getClass();
        ShowPageActivity.a.a(context, panel);
    }
}
