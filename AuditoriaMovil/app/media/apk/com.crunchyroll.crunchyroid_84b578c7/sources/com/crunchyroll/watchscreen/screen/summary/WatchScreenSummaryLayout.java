package com.crunchyroll.watchscreen.screen.summary;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.aj.h;
import com.amazon.aps.iva.c8.f;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.hp.d;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lo.c;
import com.amazon.aps.iva.mt.o;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.o0;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelsKt;
import com.ellation.widgets.CollapsibleTextView;
import com.ellation.widgets.overflow.OverflowButton;
import com.google.android.gms.cast.MediaTrack;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: WatchScreenSummaryLayout.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/crunchyroll/watchscreen/screen/summary/WatchScreenSummaryLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/hp/d;", "", "title", "Lcom/amazon/aps/iva/kb0/q;", "setShowTitle", "setAssetTitle", MediaTrack.ROLE_DESCRIPTION, "setDescription", "Lcom/amazon/aps/iva/hp/c;", "summary", "setParentalControls", "Lcom/amazon/aps/iva/h60/d;", "b", "Lcom/amazon/aps/iva/h60/d;", "getBinding", "()Lcom/amazon/aps/iva/h60/d;", "binding", "Lkotlin/Function1;", "Landroid/view/View;", "c", "Lcom/amazon/aps/iva/xb0/l;", "getOnShowTitleClickListener", "()Lcom/amazon/aps/iva/xb0/l;", "setOnShowTitleClickListener", "(Lcom/amazon/aps/iva/xb0/l;)V", "onShowTitleClickListener", "Lcom/amazon/aps/iva/hp/a;", "d", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/hp/a;", "presenter", "watch-screen_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WatchScreenSummaryLayout extends g implements d {
    public static final /* synthetic */ int e = 0;
    public final com.amazon.aps.iva.h60.d b;
    public l<? super View, q> c;
    public final m d;

    /* compiled from: WatchScreenSummaryLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements p<i, Integer, q> {
        public final /* synthetic */ LabelUiModel h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LabelUiModel labelUiModel) {
            super(2);
            this.h = labelUiModel;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                LabelsKt.m32Labels0OtIIsQ(this.h, null, false, true, false, false, false, true, com.amazon.aps.iva.ao.a.j, null, 0.0f, iVar2, 12585984 | LabelUiModel.$stable, 0, 1654);
            }
            return q.a;
        }
    }

    /* compiled from: WatchScreenSummaryLayout.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hp.a> {
        public final /* synthetic */ Context i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.i = context;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.hp.a invoke() {
            Context context = this.i;
            j.f(context, "context");
            o oVar = new o(context, new com.amazon.aps.iva.mt.m(context));
            com.amazon.aps.iva.lo.d dVar = c.a.a;
            if (dVar != null) {
                h d = dVar.e().d();
                WatchScreenSummaryLayout watchScreenSummaryLayout = WatchScreenSummaryLayout.this;
                j.f(watchScreenSummaryLayout, "view");
                j.f(d, "showParentalControls");
                return new com.amazon.aps.iva.hp.b(watchScreenSummaryLayout, oVar, d);
            }
            j.m("dependencies");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WatchScreenSummaryLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public static void b1(WatchScreenSummaryLayout watchScreenSummaryLayout) {
        j.f(watchScreenSummaryLayout, "this$0");
        watchScreenSummaryLayout.getPresenter().q();
    }

    private final com.amazon.aps.iva.hp.a getPresenter() {
        return (com.amazon.aps.iva.hp.a) this.d.getValue();
    }

    public final void U2(com.amazon.aps.iva.hp.c cVar) {
        j.f(cVar, "summary");
        getPresenter().z4(cVar);
        this.b.f.setOnClickListener(new f(this, 6));
    }

    @Override // com.amazon.aps.iva.hp.d
    public final void X1(LabelUiModel labelUiModel) {
        j.f(labelUiModel, "labelUiModel");
        this.b.g.setContent(com.amazon.aps.iva.v0.b.c(-2034349866, new a(labelUiModel), true));
    }

    @Override // com.amazon.aps.iva.hp.d
    public final void Z() {
        CollapsibleTextView collapsibleTextView = this.b.e;
        collapsibleTextView.setCollapsed(!collapsibleTextView.k);
    }

    @Override // com.amazon.aps.iva.hp.d
    public final void g() {
        CollapsibleTextView collapsibleTextView = this.b.e;
        j.e(collapsibleTextView, "binding.showDescription");
        collapsibleTextView.setVisibility(8);
    }

    public final com.amazon.aps.iva.h60.d getBinding() {
        return this.b;
    }

    public final l<View, q> getOnShowTitleClickListener() {
        return this.c;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t0.j(this, Integer.valueOf(t0.a(R.dimen.watch_screen_summary_margin_horizontal, this)), null, Integer.valueOf(t0.a(R.dimen.watch_screen_summary_margin_horizontal, this)), null, 10);
    }

    @Override // com.amazon.aps.iva.hp.d
    public final void r() {
        CollapsibleTextView collapsibleTextView = this.b.e;
        j.e(collapsibleTextView, "binding.showDescription");
        collapsibleTextView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.hp.d
    public void setAssetTitle(String str) {
        j.f(str, "title");
        this.b.b.setText(str);
    }

    @Override // com.amazon.aps.iva.hp.d
    public void setDescription(String str) {
        j.f(str, MediaTrack.ROLE_DESCRIPTION);
        com.amazon.aps.iva.h60.d dVar = this.b;
        dVar.e.setText(str);
        dVar.e.setOnClickListener(new com.amazon.aps.iva.ne.a(this, 9));
    }

    public final void setOnShowTitleClickListener(l<? super View, q> lVar) {
        this.c = lVar;
    }

    @Override // com.amazon.aps.iva.hp.d
    public void setParentalControls(com.amazon.aps.iva.hp.c cVar) {
        SpannableStringBuilder b2;
        boolean z;
        SpannableStringBuilder b3;
        j.f(cVar, "summary");
        String string = getContext().getString(R.string.media_metadata_content_advisory);
        j.e(string, "context.getString(Common…etadata_content_advisory)");
        Typeface a2 = com.amazon.aps.iva.f3.f.a(R.font.lato_semibold, getContext());
        if (a2 != null) {
            b2 = m0.f(string, string, getContext().getColor(R.color.color_white), a2, 16, true);
        } else {
            b2 = m0.b(getContext().getColor(R.color.color_white), string, string);
        }
        String B0 = x.B0(cVar.e.getContentDescriptors(), ", ", null, null, null, 62);
        String str = cVar.d;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            B0 = com.amazon.aps.iva.k.q.b(str, "\n", B0);
        }
        String str2 = B0;
        Typeface a3 = com.amazon.aps.iva.f3.f.a(R.font.lato_semibold, getContext());
        if (a3 != null) {
            b3 = m0.f(str2, str2, getContext().getColor(R.color.cr_silver_chalice), a3, 14, true);
        } else {
            b3 = m0.b(getContext().getColor(R.color.cr_silver_chalice), str2, str2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int integer = getResources().getInteger(R.integer.watch_page_summary_advisory_margin_top);
        m0.c(spannableStringBuilder, integer, new o0(integer));
        spannableStringBuilder.append((CharSequence) b2);
        int integer2 = getResources().getInteger(R.integer.watch_page_summary_descriptors_margin_top);
        m0.c(spannableStringBuilder, integer2, new o0(integer2));
        spannableStringBuilder.append((CharSequence) b3);
        CollapsibleTextView collapsibleTextView = this.b.e;
        collapsibleTextView.getClass();
        SpannableStringBuilder spannableStringBuilder2 = collapsibleTextView.c;
        spannableStringBuilder2.clearSpans();
        spannableStringBuilder2.clear();
        spannableStringBuilder2.append((CharSequence) collapsibleTextView.b);
        spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
        if (!collapsibleTextView.S7()) {
            collapsibleTextView.setText(spannableStringBuilder2);
        }
    }

    @Override // com.amazon.aps.iva.hp.d
    public void setShowTitle(String str) {
        j.f(str, "title");
        this.b.f.setText(str);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchScreenSummaryLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_watch_screen_summary, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.asset_title;
        TextView textView = (TextView) z.u(R.id.asset_title, inflate);
        if (textView != null) {
            i2 = R.id.download_button_container;
            FrameLayout frameLayout = (FrameLayout) z.u(R.id.download_button_container, inflate);
            if (frameLayout != null) {
                i2 = R.id.overflow;
                OverflowButton overflowButton = (OverflowButton) z.u(R.id.overflow, inflate);
                if (overflowButton != null) {
                    i2 = R.id.show_description;
                    CollapsibleTextView collapsibleTextView = (CollapsibleTextView) z.u(R.id.show_description, inflate);
                    if (collapsibleTextView != null) {
                        i2 = R.id.show_title;
                        TextView textView2 = (TextView) z.u(R.id.show_title, inflate);
                        if (textView2 != null) {
                            i2 = R.id.summary_labels;
                            ComposeView composeView = (ComposeView) z.u(R.id.summary_labels, inflate);
                            if (composeView != null) {
                                i2 = R.id.tools_container;
                                if (((ConstraintLayout) z.u(R.id.tools_container, inflate)) != null) {
                                    i2 = R.id.watch_screen_content_rating;
                                    if (z.u(R.id.watch_screen_content_rating, inflate) != null) {
                                        this.b = new com.amazon.aps.iva.h60.d((LinearLayout) inflate, textView, frameLayout, overflowButton, collapsibleTextView, textView2, composeView);
                                        this.d = com.amazon.aps.iva.kb0.f.b(new b(context));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
