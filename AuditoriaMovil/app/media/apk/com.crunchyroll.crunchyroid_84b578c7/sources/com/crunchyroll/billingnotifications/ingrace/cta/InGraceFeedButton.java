package com.crunchyroll.billingnotifications.ingrace.cta;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.re.d;
import com.amazon.aps.iva.re.e;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
/* compiled from: InGraceFeedButton.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/crunchyroll/billingnotifications/ingrace/cta/InGraceFeedButton;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/re/e;", "Landroid/widget/TextView;", "b", "Lcom/amazon/aps/iva/bc0/b;", "getButtonWithText", "()Landroid/widget/TextView;", "buttonWithText", "Lcom/amazon/aps/iva/re/c;", "c", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/re/c;", "presenter", "billing-notifications_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InGraceFeedButton extends g implements e {
    public static final /* synthetic */ l<Object>[] d = {q.a(InGraceFeedButton.class, "buttonWithText", "getButtonWithText()Landroid/widget/TextView;", 0)};
    public final v b;
    public final m c;

    /* compiled from: InGraceFeedButton.kt */
    /* loaded from: classes.dex */
    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            InGraceFeedButton inGraceFeedButton = InGraceFeedButton.this;
            inGraceFeedButton.getPresenter().I(r.p(inGraceFeedButton.getButtonWithText(), null));
        }
    }

    /* compiled from: InGraceFeedButton.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.re.c> {
        public final /* synthetic */ Context i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.i = context;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.re.c invoke() {
            Context context = this.i;
            j.d(context, "null cannot be cast to non-null type com.ellation.crunchyroll.analytics.AnalyticsScreenProvider");
            com.amazon.aps.iva.ls.a b1 = ((com.amazon.aps.iva.us.a) context).b1();
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.me.b bVar = com.amazon.aps.iva.a60.b.b;
            if (bVar != null) {
                com.amazon.aps.iva.me.j e = bVar.e();
                j.f(b1, "screen");
                com.amazon.aps.iva.re.b bVar2 = new com.amazon.aps.iva.re.b(b1, e);
                com.amazon.aps.iva.me.c cVar2 = com.amazon.aps.iva.a60.b.c;
                if (cVar2 != null) {
                    com.amazon.aps.iva.ve.e f = cVar2.f();
                    com.amazon.aps.iva.me.b bVar3 = com.amazon.aps.iva.a60.b.b;
                    if (bVar3 != null) {
                        com.amazon.aps.iva.me.j e2 = bVar3.e();
                        com.amazon.aps.iva.k50.m mVar = new com.amazon.aps.iva.k50.m(context);
                        InGraceFeedButton inGraceFeedButton = InGraceFeedButton.this;
                        j.f(inGraceFeedButton, "view");
                        j.f(f, "billingStatusStorage");
                        j.f(e2, "billingNotificationsConfig");
                        return new d(inGraceFeedButton, bVar2, f, e2, mVar);
                    }
                    j.m("dependencies");
                    throw null;
                }
                j.m("instance");
                throw null;
            }
            j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: View.kt */
    /* loaded from: classes.dex */
    public static final class c implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ InGraceFeedButton c;

        public c(View view, InGraceFeedButton inGraceFeedButton) {
            this.b = view;
            this.c = inGraceFeedButton;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            j.f(view, "view");
            this.b.removeOnAttachStateChangeListener(this);
            InGraceFeedButton inGraceFeedButton = this.c;
            inGraceFeedButton.setOnClickListener(new a());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            j.f(view, "view");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InGraceFeedButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getButtonWithText() {
        return (TextView) this.b.getValue(this, d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.amazon.aps.iva.re.c getPresenter() {
        return (com.amazon.aps.iva.re.c) this.c.getValue();
    }

    @Override // com.amazon.aps.iva.re.e
    public final void Be() {
        setVisibility(8);
    }

    @Override // com.amazon.aps.iva.re.e
    public final void eb() {
        setVisibility(0);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InGraceFeedButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = com.amazon.aps.iva.xw.g.c(R.id.in_grace_button_text, this);
        this.c = f.b(new b(context));
        View.inflate(context, R.layout.layout_in_grace_button, this);
        setClipToPadding(false);
        WeakHashMap<View, r0> weakHashMap = g0.a;
        if (g0.g.b(this)) {
            setOnClickListener(new a());
        } else {
            addOnAttachStateChangeListener(new c(this, this));
        }
    }
}
