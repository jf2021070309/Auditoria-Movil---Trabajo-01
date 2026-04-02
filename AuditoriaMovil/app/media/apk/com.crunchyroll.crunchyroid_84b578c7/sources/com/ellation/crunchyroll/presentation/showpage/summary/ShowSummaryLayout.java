package com.ellation.crunchyroll.presentation.showpage.summary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.r40.c;
import com.amazon.aps.iva.r40.d;
import com.amazon.aps.iva.r40.f;
import com.amazon.aps.iva.v0.b;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.crunchylists.addtocrunchylistbutton.AddToCrunchylistButton;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
import com.ellation.crunchyroll.showrating.ratingview.ShowRatingLayout;
import com.google.android.gms.cast.MediaTrack;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ShowSummaryView.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0012\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\tH\u0016R\u001b\u0010\u0004\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0007\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001b\u0010\u001a\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u001b\u0010\u001f\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/ellation/crunchyroll/presentation/showpage/summary/ShowSummaryLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/r40/f;", "", "title", "Lcom/amazon/aps/iva/kb0/q;", "setTitle", MediaTrack.ROLE_DESCRIPTION, "setDescription", "", "ctaButtonTitle", "setCtaButtonTitle", "Landroid/widget/TextView;", "b", "Lcom/amazon/aps/iva/bc0/b;", "getTitle", "()Landroid/widget/TextView;", "Landroidx/compose/ui/platform/ComposeView;", "c", "getLabels", "()Landroidx/compose/ui/platform/ComposeView;", "labels", "d", "getDescription", "e", "getCtaButton", "ctaButton", "Lcom/ellation/crunchyroll/showrating/ratingview/ShowRatingLayout;", "f", "getShowRating", "()Lcom/ellation/crunchyroll/showrating/ratingview/ShowRatingLayout;", "showRating", "Landroid/view/View;", "g", "getShowSummaryContent", "()Landroid/view/View;", "showSummaryContent", "Lcom/ellation/crunchyroll/crunchylists/addtocrunchylistbutton/AddToCrunchylistButton;", "h", "getAddToCrunchylistsButton", "()Lcom/ellation/crunchyroll/crunchylists/addtocrunchylistbutton/AddToCrunchylistButton;", "addToCrunchylistsButton", "Lcom/amazon/aps/iva/r40/c;", "i", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/r40/c;", "presenter", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ShowSummaryLayout extends g implements f {
    public static final /* synthetic */ l<Object>[] j = {q.a(ShowSummaryLayout.class, "title", "getTitle()Landroid/widget/TextView;", 0), q.a(ShowSummaryLayout.class, "labels", "getLabels()Landroidx/compose/ui/platform/ComposeView;", 0), q.a(ShowSummaryLayout.class, MediaTrack.ROLE_DESCRIPTION, "getDescription()Landroid/widget/TextView;", 0), q.a(ShowSummaryLayout.class, "ctaButton", "getCtaButton()Landroid/widget/TextView;", 0), q.a(ShowSummaryLayout.class, "showRating", "getShowRating()Lcom/ellation/crunchyroll/showrating/ratingview/ShowRatingLayout;", 0), q.a(ShowSummaryLayout.class, "showSummaryContent", "getShowSummaryContent()Landroid/view/View;", 0), q.a(ShowSummaryLayout.class, "addToCrunchylistsButton", "getAddToCrunchylistsButton()Lcom/ellation/crunchyroll/crunchylists/addtocrunchylistbutton/AddToCrunchylistButton;", 0)};
    public final v b;
    public final v c;
    public final v d;
    public final v e;
    public final v f;
    public final v g;
    public final v h;
    public final m i;

    /* compiled from: ShowSummaryView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<c> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final c invoke() {
            ShowSummaryLayout showSummaryLayout = ShowSummaryLayout.this;
            j.f(showSummaryLayout, "view");
            return new d(showSummaryLayout);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShowSummaryLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final TextView getCtaButton() {
        return (TextView) this.e.getValue(this, j[3]);
    }

    private final TextView getDescription() {
        return (TextView) this.d.getValue(this, j[2]);
    }

    private final ComposeView getLabels() {
        return (ComposeView) this.c.getValue(this, j[1]);
    }

    private final c getPresenter() {
        return (c) this.i.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.b.getValue(this, j[0]);
    }

    @Override // com.amazon.aps.iva.r40.f
    public final void V1() {
        getShowSummaryContent().setVisibility(0);
    }

    public final void b1(com.amazon.aps.iva.r40.a aVar, ShowPageActivity.b bVar) {
        j.f(aVar, "showSummary");
        getPresenter().a2(aVar);
        getLabels().setContent(b.c(1028648181, new com.amazon.aps.iva.r40.b(aVar), true));
        getCtaButton().setOnClickListener(new com.amazon.aps.iva.wf.d(3, bVar));
    }

    @Override // com.amazon.aps.iva.r40.f
    public final void g() {
        getDescription().setVisibility(8);
    }

    public final AddToCrunchylistButton getAddToCrunchylistsButton() {
        return (AddToCrunchylistButton) this.h.getValue(this, j[6]);
    }

    public final ShowRatingLayout getShowRating() {
        return (ShowRatingLayout) this.f.getValue(this, j[4]);
    }

    public final View getShowSummaryContent() {
        return (View) this.g.getValue(this, j[5]);
    }

    @Override // com.amazon.aps.iva.r40.f
    public final void r() {
        getDescription().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.r40.f
    public void setCtaButtonTitle(int i) {
        getCtaButton().setVisibility(0);
        getCtaButton().setText(i);
    }

    @Override // com.amazon.aps.iva.r40.f
    public void setDescription(String str) {
        j.f(str, MediaTrack.ROLE_DESCRIPTION);
        getDescription().setText(str);
    }

    @Override // com.amazon.aps.iva.r40.f
    public void setTitle(String str) {
        j.f(str, "title");
        getTitle().setText(str);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowSummaryLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = com.amazon.aps.iva.xw.g.c(R.id.show_page_summary_title, this);
        this.c = com.amazon.aps.iva.xw.g.c(R.id.show_page_summary_labels, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.show_page_summary_description, this);
        this.e = com.amazon.aps.iva.xw.g.c(R.id.show_page_summary_cta, this);
        this.f = com.amazon.aps.iva.xw.g.c(R.id.show_page_summary_show_rating, this);
        this.g = com.amazon.aps.iva.xw.g.c(R.id.show_page_summary_content, this);
        this.h = com.amazon.aps.iva.xw.g.c(R.id.show_page_summary_add_to_crunchylist_button, this);
        this.i = com.amazon.aps.iva.kb0.f.b(new a());
        View.inflate(context, R.layout.layout_show_summary, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }
}
