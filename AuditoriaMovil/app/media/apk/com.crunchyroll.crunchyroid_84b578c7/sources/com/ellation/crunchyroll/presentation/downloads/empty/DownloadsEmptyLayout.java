package com.ellation.crunchyroll.presentation.downloads.empty;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.c8.e;
import com.amazon.aps.iva.c8.s;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.h10.b;
import com.amazon.aps.iva.h10.c;
import com.amazon.aps.iva.h10.f;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.us.u;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.button.ButtonTextProvider;
import com.google.android.gms.cast.MediaTrack;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DownloadsEmptyLayout.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0003H\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0018R\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010 R\u001b\u0010$\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010 ¨\u0006%"}, d2 = {"Lcom/ellation/crunchyroll/presentation/downloads/empty/DownloadsEmptyLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/h10/f;", "", "imageRes", "Lcom/amazon/aps/iva/kb0/q;", "setImage", MediaTrack.ROLE_SUBTITLE, "setSubtitle", "Landroid/util/AttributeSet;", "b", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "attrs", "Landroid/widget/ImageView;", "c", "Lcom/amazon/aps/iva/bc0/b;", "getImage", "()Landroid/widget/ImageView;", "image", "Landroid/widget/TextView;", "d", "getTitleText", "()Landroid/widget/TextView;", "titleText", "e", "getSubtitleText", "subtitleText", "Landroid/view/View;", "f", "getSubscriptionButton", "()Landroid/view/View;", "subscriptionButton", "g", "getBrowseAllButton", "browseAllButton", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DownloadsEmptyLayout extends g implements f {
    public static final /* synthetic */ l<Object>[] i = {q.a(DownloadsEmptyLayout.class, "image", "getImage()Landroid/widget/ImageView;", 0), q.a(DownloadsEmptyLayout.class, "titleText", "getTitleText()Landroid/widget/TextView;", 0), q.a(DownloadsEmptyLayout.class, "subtitleText", "getSubtitleText()Landroid/widget/TextView;", 0), q.a(DownloadsEmptyLayout.class, "subscriptionButton", "getSubscriptionButton()Landroid/view/View;", 0), q.a(DownloadsEmptyLayout.class, "browseAllButton", "getBrowseAllButton()Landroid/view/View;", 0)};
    public final AttributeSet b;
    public final v c;
    public final v d;
    public final v e;
    public final v f;
    public final v g;
    public b h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DownloadsEmptyLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public static void b1(DownloadsEmptyLayout downloadsEmptyLayout) {
        boolean a;
        j.f(downloadsEmptyLayout, "this$0");
        b bVar = downloadsEmptyLayout.h;
        if (bVar != null) {
            View subscriptionButton = downloadsEmptyLayout.getSubscriptionButton();
            j.d(subscriptionButton, "null cannot be cast to non-null type com.ellation.crunchyroll.ui.button.ButtonTextProvider");
            u.a.a(bVar.d, r.p(((ButtonTextProvider) subscriptionButton).getButtonTextView(), null), null, 6);
            c cVar = bVar.f;
            if (cVar != null) {
                if (j.a(cVar, c.a.f)) {
                    a = true;
                } else {
                    a = j.a(cVar, c.e.f);
                }
                if (a) {
                    bVar.c.a(null);
                    return;
                }
                return;
            }
            j.m("state");
            throw null;
        }
        j.m("presenter");
        throw null;
    }

    private final View getBrowseAllButton() {
        return (View) this.g.getValue(this, i[4]);
    }

    private final ImageView getImage() {
        return (ImageView) this.c.getValue(this, i[0]);
    }

    private final View getSubscriptionButton() {
        return (View) this.f.getValue(this, i[3]);
    }

    private final TextView getSubtitleText() {
        return (TextView) this.e.getValue(this, i[2]);
    }

    private final TextView getTitleText() {
        return (TextView) this.d.getValue(this, i[1]);
    }

    @Override // com.amazon.aps.iva.h10.f
    public final void L0() {
        getSubscriptionButton().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.h10.f
    public final void e2() {
        getSubscriptionButton().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.h10.f
    public final void g6(int i2) {
        TextView titleText = getTitleText();
        titleText.setVisibility(0);
        titleText.setText(i2);
    }

    public final AttributeSet getAttrs() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.h10.f
    public final void lc(String str, List<String> list) {
        j.f(str, MediaTrack.ROLE_SUBTITLE);
        j.f(list, "tierTitles");
        getSubtitleText().setText(m0.d(str, Typeface.DEFAULT_BOLD, list));
    }

    @Override // com.amazon.aps.iva.h10.f
    public final void p() {
        getTitleText().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.h10.f
    public final void q4() {
        getBrowseAllButton().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.h10.f
    public final void rh() {
        getBrowseAllButton().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.h10.f
    public void setImage(int i2) {
        getImage().setImageResource(i2);
    }

    @Override // com.amazon.aps.iva.h10.f
    public void setSubtitle(int i2) {
        getSubtitleText().setText(i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadsEmptyLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        j.f(context, "context");
        this.b = attributeSet;
        this.c = com.amazon.aps.iva.xw.g.c(R.id.downloads_empty_image, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.downloads_empty_title, this);
        this.e = com.amazon.aps.iva.xw.g.c(R.id.downloads_empty_subtitle, this);
        this.f = com.amazon.aps.iva.xw.g.c(R.id.downloads_subscription_button, this);
        this.g = com.amazon.aps.iva.xw.g.c(R.id.downloads_empty_browse_all_button, this);
        View.inflate(context, R.layout.layout_downloads_empty_state, this);
        getSubscriptionButton().setOnClickListener(new s(this, 15));
        getBrowseAllButton().setOnClickListener(new e(this, 15));
    }
}
