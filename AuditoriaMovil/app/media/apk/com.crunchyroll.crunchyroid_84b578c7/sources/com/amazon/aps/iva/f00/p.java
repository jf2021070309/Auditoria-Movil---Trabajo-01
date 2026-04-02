package com.amazon.aps.iva.f00;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.ot.a;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.commenting.commentscount.compact.CommentsCountCompactLayout;
import com.ellation.crunchyroll.presentation.content.assets.list.item.overlay.DurationStateLayer;
import com.ellation.crunchyroll.presentation.download.button.DownloadButton;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.widgets.overflow.OverflowButton;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.Set;
/* compiled from: PlayableAssetItemView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.wy.g implements s {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] o = {com.amazon.aps.iva.k.q.a(p.class, "badgesLayer", "getBadgesLayer()Landroidx/compose/ui/platform/ComposeView;", 0), com.amazon.aps.iva.k.q.a(p.class, "assetDuration", "getAssetDuration()Lcom/ellation/crunchyroll/presentation/content/assets/list/item/overlay/DurationStateLayer;", 0), com.amazon.aps.iva.k.q.a(p.class, "thumbnail", "getThumbnail()Landroid/widget/ImageView;", 0), com.amazon.aps.iva.k.q.a(p.class, "cardStateLayer", "getCardStateLayer()Landroidx/compose/ui/platform/ComposeView;", 0), com.amazon.aps.iva.k.q.a(p.class, "assetTitle", "getAssetTitle()Landroid/widget/TextView;", 0), com.amazon.aps.iva.k.q.a(p.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0), com.amazon.aps.iva.k.q.a(p.class, "comments", "getComments()Lcom/ellation/crunchyroll/commenting/commentscount/compact/CommentsCountCompactLayout;", 0), com.amazon.aps.iva.k.q.a(p.class, "downloadButton", "getDownloadButton()Lcom/ellation/crunchyroll/presentation/download/button/DownloadButton;", 0), com.amazon.aps.iva.k.q.a(p.class, "overflowButton", "getOverflowButton()Lcom/ellation/widgets/overflow/OverflowButton;", 0)};
    public final com.amazon.aps.iva.fg.g b;
    public final com.amazon.aps.iva.xw.v c;
    public final com.amazon.aps.iva.xw.v d;
    public final com.amazon.aps.iva.xw.v e;
    public final com.amazon.aps.iva.xw.v f;
    public final com.amazon.aps.iva.xw.v g;
    public final com.amazon.aps.iva.xw.v h;
    public final com.amazon.aps.iva.xw.v i;
    public final com.amazon.aps.iva.xw.v j;
    public final com.amazon.aps.iva.xw.v k;
    public final com.amazon.aps.iva.oh.g l;
    public final com.amazon.aps.iva.g00.e m;
    public final com.amazon.aps.iva.kb0.m n;

    /* compiled from: PlayableAssetItemView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oh.a, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.oh.a aVar) {
            com.amazon.aps.iva.oh.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "assetId");
            p.this.l.U4(aVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayableAssetItemView.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<k> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final k invoke() {
            p pVar = p.this;
            return new k(pVar, pVar.m);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, com.amazon.aps.iva.fg.g gVar, com.amazon.aps.iva.ls.a aVar) {
        super(context, null, 0, 6, null);
        com.amazon.aps.iva.yb0.j.f(gVar, "videoDownloadModule");
        com.amazon.aps.iva.yb0.j.f(aVar, "segmentAnalyticsScreen");
        this.b = gVar;
        this.c = com.amazon.aps.iva.xw.g.c(R.id.show_page_asset_card_badges_layer, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.show_page_asset_card_duration_state_layer, this);
        this.e = com.amazon.aps.iva.xw.g.c(R.id.show_page_asset_card_thumbnail, this);
        this.f = com.amazon.aps.iva.xw.g.c(R.id.show_page_asset_card_state_layer, this);
        this.g = com.amazon.aps.iva.xw.g.c(R.id.show_page_asset_card_asset_title, this);
        this.h = com.amazon.aps.iva.xw.g.c(R.id.show_page_asset_card_content_progress_bar, this);
        this.i = com.amazon.aps.iva.xw.g.c(R.id.show_page_asset_card_comments_layout, this);
        this.j = com.amazon.aps.iva.xw.g.c(R.id.show_page_asset_card_download_button, this);
        this.k = com.amazon.aps.iva.xw.g.c(R.id.show_page_asset_card_overflow_button, this);
        this.l = ((d0) com.ellation.crunchyroll.application.e.a()).y.b(context, aVar);
        a aVar2 = new a();
        Activity a2 = com.amazon.aps.iva.xw.q.a(context);
        com.amazon.aps.iva.yb0.j.d(a2, "null cannot be cast to non-null type com.crunchyroll.share.ShareContentView");
        com.amazon.aps.iva.ts.b.a.getClass();
        this.m = new com.amazon.aps.iva.g00.e(aVar2, c.a.a((com.amazon.aps.iva.gn.e) a2, com.amazon.aps.iva.ts.a.j));
        this.n = com.amazon.aps.iva.kb0.f.b(new b());
        View.inflate(context, R.layout.layout_show_page_asset_card, this);
    }

    private final DurationStateLayer getAssetDuration() {
        return (DurationStateLayer) this.d.getValue(this, o[1]);
    }

    private final TextView getAssetTitle() {
        return (TextView) this.g.getValue(this, o[4]);
    }

    private final ComposeView getBadgesLayer() {
        return (ComposeView) this.c.getValue(this, o[0]);
    }

    private final ComposeView getCardStateLayer() {
        return (ComposeView) this.f.getValue(this, o[3]);
    }

    private final CommentsCountCompactLayout getComments() {
        return (CommentsCountCompactLayout) this.i.getValue(this, o[6]);
    }

    private final DownloadButton getDownloadButton() {
        return (DownloadButton) this.j.getValue(this, o[7]);
    }

    private final OverflowButton getOverflowButton() {
        return (OverflowButton) this.k.getValue(this, o[8]);
    }

    private final k getPresenter() {
        return (k) this.n.getValue();
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) this.h.getValue(this, o[5]);
    }

    private final ImageView getThumbnail() {
        return (ImageView) this.e.getValue(this, o[2]);
    }

    @Override // com.amazon.aps.iva.f00.s
    public final void A7() {
        getDownloadButton().setEnabled(false);
    }

    @Override // com.amazon.aps.iva.f00.s
    public final void D1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "episodeNumber");
        TextView assetTitle = getAssetTitle();
        assetTitle.setVisibility(0);
        assetTitle.setText(assetTitle.getResources().getString(R.string.season_episode_title_format, str, ""));
    }

    @Override // com.amazon.aps.iva.f00.s
    public final void N0(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        TextView assetTitle = getAssetTitle();
        assetTitle.setVisibility(0);
        assetTitle.setText(str);
    }

    public final void U2(DownloadButtonState downloadButtonState) {
        com.amazon.aps.iva.yb0.j.f(downloadButtonState, "state");
        getDownloadButton().setState(downloadButtonState);
    }

    @Override // com.amazon.aps.iva.f00.s
    public final void a2(List<com.amazon.aps.iva.n70.b> list) {
        com.amazon.aps.iva.yb0.j.f(list, "menuItems");
        getOverflowButton().G(list, null, null, null, null);
        getOverflowButton().setVisibility(0);
    }

    public final void b1(final com.amazon.aps.iva.d00.a aVar, final q qVar) {
        boolean z;
        boolean z2;
        boolean a2;
        boolean a3;
        boolean z3;
        boolean z4;
        int i;
        com.amazon.aps.iva.yb0.j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Context context = getContext();
        com.amazon.aps.iva.yb0.j.e(context, "context");
        boolean z5 = false;
        if (com.amazon.aps.iva.aq.k.n(context).c()) {
            Resources resources = getResources();
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                i = R.dimen.paragraph_font_size;
            } else {
                i = R.dimen.paragraph_tiny_font_size;
            }
            getAssetTitle().setTextSize(0, resources.getDimensionPixelSize(i));
        }
        k presenter = getPresenter();
        presenter.getClass();
        presenter.c = qVar;
        s view = presenter.getView();
        q qVar2 = presenter.c;
        if (qVar2 != null) {
            view.q1(qVar2.c);
            q qVar3 = presenter.c;
            if (qVar3 != null) {
                if (qVar3.d.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                String str = qVar3.f;
                if (z) {
                    if (str.length() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        presenter.getView().D1(str);
                    } else {
                        presenter.getView().p();
                    }
                } else {
                    if (str.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        s view2 = presenter.getView();
                        q qVar4 = presenter.c;
                        if (qVar4 != null) {
                            view2.N0(qVar4.d);
                        } else {
                            com.amazon.aps.iva.yb0.j.m("asset");
                            throw null;
                        }
                    } else {
                        s view3 = presenter.getView();
                        q qVar5 = presenter.c;
                        if (qVar5 != null) {
                            StringBuilder b2 = com.amazon.aps.iva.b6.x.b(str, ". ");
                            b2.append(qVar5.d);
                            view3.N0(b2.toString());
                        } else {
                            com.amazon.aps.iva.yb0.j.m("asset");
                            throw null;
                        }
                    }
                }
                s view4 = presenter.getView();
                q qVar6 = presenter.c;
                if (qVar6 != null) {
                    view4.g3(qVar6.j);
                    q qVar7 = presenter.c;
                    if (qVar7 != null) {
                        com.amazon.aps.iva.ot.a aVar2 = qVar7.m;
                        if (aVar2 instanceof a.d) {
                            a2 = true;
                        } else {
                            a2 = com.amazon.aps.iva.yb0.j.a(aVar2, a.C0584a.d);
                        }
                        if (a2) {
                            s view5 = presenter.getView();
                            q qVar8 = presenter.c;
                            if (qVar8 != null) {
                                view5.setWatchProgress(qVar8.k);
                            } else {
                                com.amazon.aps.iva.yb0.j.m("asset");
                                throw null;
                            }
                        } else {
                            presenter.getView().setWatchProgress(0);
                        }
                        s view6 = presenter.getView();
                        q qVar9 = presenter.c;
                        if (qVar9 != null) {
                            view6.cg(qVar9.p);
                            q qVar10 = presenter.c;
                            if (qVar10 != null) {
                                if (qVar10.p instanceof DownloadButtonState.Inactive) {
                                    presenter.getView().A7();
                                } else {
                                    presenter.getView().d5();
                                }
                                if (qVar.q) {
                                    presenter.getView().a2(presenter.b.a(qVar));
                                }
                                getCardStateLayer().setContent(com.amazon.aps.iva.v0.b.c(1698429261, new m(qVar), true));
                                getBadgesLayer().setContent(com.amazon.aps.iva.v0.b.c(-2057918026, new n(qVar), true));
                                DurationStateLayer assetDuration = getAssetDuration();
                                assetDuration.getClass();
                                com.amazon.aps.iva.h00.a aVar3 = assetDuration.b;
                                aVar3.getClass();
                                aVar3.b = qVar;
                                a.g gVar = a.g.d;
                                com.amazon.aps.iva.ot.a aVar4 = qVar.m;
                                if (com.amazon.aps.iva.yb0.j.a(aVar4, gVar)) {
                                    a3 = true;
                                } else {
                                    a3 = com.amazon.aps.iva.yb0.j.a(aVar4, a.h.d);
                                }
                                if (a3) {
                                    aVar3.getView().k();
                                    aVar3.getView().setText(aVar4.a);
                                } else if (aVar4 instanceof a.d) {
                                    aVar3.getView().k();
                                    aVar3.getView().setText(((a.d) aVar4).d);
                                } else {
                                    q qVar11 = aVar3.b;
                                    if (qVar11 != null) {
                                        if (qVar11.i.length() == 0) {
                                            z5 = true;
                                        }
                                        if (z5) {
                                            aVar3.getView().f();
                                        } else {
                                            aVar3.getView().k();
                                            com.amazon.aps.iva.h00.b view7 = aVar3.getView();
                                            q qVar12 = aVar3.b;
                                            if (qVar12 != null) {
                                                view7.setText(qVar12.i);
                                            } else {
                                                com.amazon.aps.iva.yb0.j.m("asset");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        com.amazon.aps.iva.yb0.j.m("asset");
                                        throw null;
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.asset_item_wrapper);
                                viewGroup.setOnClickListener(new com.amazon.aps.iva.dc.b(3, aVar, qVar));
                                viewGroup.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.amazon.aps.iva.f00.l
                                    @Override // android.view.View.OnLongClickListener
                                    public final boolean onLongClick(View view8) {
                                        com.amazon.aps.iva.d00.a aVar5 = com.amazon.aps.iva.d00.a.this;
                                        com.amazon.aps.iva.yb0.j.f(aVar5, "$listener");
                                        q qVar13 = qVar;
                                        com.amazon.aps.iva.yb0.j.f(qVar13, "$asset");
                                        aVar5.K4(qVar13);
                                        return true;
                                    }
                                });
                                getDownloadButton().G(this.b, new o(this, qVar));
                                return;
                            }
                            com.amazon.aps.iva.yb0.j.m("asset");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("asset");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("asset");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("asset");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("asset");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("asset");
        throw null;
    }

    @Override // com.amazon.aps.iva.f00.s
    public final void cg(DownloadButtonState downloadButtonState) {
        com.amazon.aps.iva.yb0.j.f(downloadButtonState, "state");
        getDownloadButton().setState(downloadButtonState);
    }

    @Override // com.amazon.aps.iva.f00.s
    public final void d5() {
        getDownloadButton().setEnabled(true);
    }

    @Override // com.amazon.aps.iva.f00.s
    public final void g3(int i) {
        getComments().bind(i);
    }

    @Override // com.amazon.aps.iva.f00.s
    public final void p() {
        getAssetTitle().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.f00.s
    public final void q1(List<Image> list) {
        com.amazon.aps.iva.yb0.j.f(list, "thumbnails");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context context = getContext();
        ImageView thumbnail = getThumbnail();
        com.amazon.aps.iva.yb0.j.e(context, "context");
        com.amazon.aps.iva.ly.c.b(imageUtil, context, list, thumbnail, null, Integer.valueOf((int) R.color.cr_woodsmoke), Integer.valueOf((int) R.color.cr_black_pearl), 8);
    }

    @Override // com.amazon.aps.iva.f00.s
    public void setWatchProgress(int i) {
        getProgressBar().setProgress(i);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(getPresenter());
    }
}
