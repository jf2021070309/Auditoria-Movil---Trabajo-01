package com.ellation.crunchyroll.feed.subscriptionbutton;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.k50.j;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.vx.e;
import com.amazon.aps.iva.vx.k;
import com.amazon.aps.iva.vx.n;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.i;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
/* compiled from: FeedSubscriptionButton.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/feed/subscriptionbutton/FeedSubscriptionButton;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/ky/a;", "Lcom/amazon/aps/iva/i5/o;", "Landroid/widget/TextView;", "b", "Lcom/amazon/aps/iva/bc0/b;", "getButtonText", "()Landroid/widget/TextView;", "buttonText", "Lcom/amazon/aps/iva/vx/d;", "d", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/vx/d;", "presenter", "home-feed_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FeedSubscriptionButton extends g implements com.amazon.aps.iva.ky.a {
    public static final /* synthetic */ l<Object>[] e = {q.a(FeedSubscriptionButton.class, "buttonText", "getButtonText()Landroid/widget/TextView;", 0)};
    public final v b;
    public final j c;
    public final m d;

    /* compiled from: FeedSubscriptionButton.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a(com.amazon.aps.iva.vx.d dVar) {
            super(0, dVar, com.amazon.aps.iva.vx.d.class, "onUserBenefitsUpdate", "onUserBenefitsUpdate()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.vx.d) this.receiver).a3();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: FeedSubscriptionButton.kt */
    /* loaded from: classes2.dex */
    public static final class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FeedSubscriptionButton feedSubscriptionButton = FeedSubscriptionButton.this;
            feedSubscriptionButton.getPresenter().I(r.p(feedSubscriptionButton.getButtonText(), null));
        }
    }

    /* compiled from: FeedSubscriptionButton.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.vx.d> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.vx.d invoke() {
            FeedSubscriptionButton feedSubscriptionButton = FeedSubscriptionButton.this;
            j jVar = feedSubscriptionButton.c;
            k kVar = i.f;
            if (kVar != null) {
                com.amazon.aps.iva.xb0.a<Boolean> hasPremiumBenefit = kVar.getHasPremiumBenefit();
                com.amazon.aps.iva.yb0.j.f(hasPremiumBenefit, "hasPremiumBenefit");
                com.amazon.aps.iva.vx.c cVar = new com.amazon.aps.iva.vx.c(hasPremiumBenefit);
                k kVar2 = i.f;
                if (kVar2 != null) {
                    com.amazon.aps.iva.xb0.a<Boolean> hasPremiumBenefit2 = kVar2.getHasPremiumBenefit();
                    com.amazon.aps.iva.yb0.j.f(jVar, "subscriptionFlowRouter");
                    com.amazon.aps.iva.yb0.j.f(hasPremiumBenefit2, "isUserPremium");
                    return new e(feedSubscriptionButton, jVar, cVar, hasPremiumBenefit2);
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: View.kt */
    /* loaded from: classes2.dex */
    public static final class d implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ FeedSubscriptionButton c;

        public d(View view, FeedSubscriptionButton feedSubscriptionButton) {
            this.b = view;
            this.c = feedSubscriptionButton;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "view");
            this.b.removeOnAttachStateChangeListener(this);
            k kVar = i.f;
            if (kVar != null) {
                com.amazon.aps.iva.ct.d e = kVar.e();
                FeedSubscriptionButton feedSubscriptionButton = this.c;
                e.a(feedSubscriptionButton, new a(feedSubscriptionButton.getPresenter()));
                feedSubscriptionButton.setOnClickListener(new b());
                return;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "view");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeedSubscriptionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getButtonText() {
        return (TextView) this.b.getValue(this, e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.amazon.aps.iva.vx.d getPresenter() {
        return (com.amazon.aps.iva.vx.d) this.d.getValue();
    }

    @Override // com.amazon.aps.iva.ky.a
    public final void L0() {
        setVisibility(0);
    }

    @Override // com.amazon.aps.iva.ky.a
    public final void e2() {
        setVisibility(8);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(getPresenter());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedSubscriptionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.b = com.amazon.aps.iva.xw.g.c(R.id.subscription_button_text, this);
        k kVar = i.f;
        if (kVar != null) {
            n f = kVar.f();
            Activity a2 = com.amazon.aps.iva.xw.q.a(context);
            com.amazon.aps.iva.yb0.j.c(a2);
            this.c = f.createSubscriptionFlowRouter((com.amazon.aps.iva.k.c) a2);
            this.d = f.b(new c());
            View.inflate(context, R.layout.layout_subscription_button, this);
            setClipToPadding(false);
            WeakHashMap<View, r0> weakHashMap = g0.a;
            if (g0.g.b(this)) {
                k kVar2 = i.f;
                if (kVar2 != null) {
                    kVar2.e().a(this, new a(getPresenter()));
                    setOnClickListener(new b());
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            addOnAttachStateChangeListener(new d(this, this));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
