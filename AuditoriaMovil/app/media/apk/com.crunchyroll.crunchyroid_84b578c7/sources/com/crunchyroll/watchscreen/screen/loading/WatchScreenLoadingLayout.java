package com.crunchyroll.watchscreen.screen.loading;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ep.d;
import com.amazon.aps.iva.h60.c;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.w0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: WatchScreenLoadingLayout.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/crunchyroll/watchscreen/screen/loading/WatchScreenLoadingLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/ep/d;", "Lcom/amazon/aps/iva/ep/a;", "c", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/ep/a;", "presenter", "watch-screen_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WatchScreenLoadingLayout extends g implements d {
    public final c b;
    public final m c;

    /* compiled from: WatchScreenLoadingLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ep.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ep.a invoke() {
            WatchScreenLoadingLayout watchScreenLoadingLayout = WatchScreenLoadingLayout.this;
            j.f(watchScreenLoadingLayout, "view");
            return new com.amazon.aps.iva.ep.b(watchScreenLoadingLayout);
        }
    }

    /* compiled from: WatchScreenLoadingLayout.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<androidx.constraintlayout.widget.c, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(androidx.constraintlayout.widget.c cVar) {
            androidx.constraintlayout.widget.c cVar2 = cVar;
            j.f(cVar2, "$this$modifyConstraints");
            cVar2.g(R.id.action_buttons, 3, WatchScreenLoadingLayout.this.b.b.getId(), 3);
            return q.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WatchScreenLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final com.amazon.aps.iva.ep.a getPresenter() {
        return (com.amazon.aps.iva.ep.a) this.c.getValue();
    }

    public final void b1(com.amazon.aps.iva.ep.c cVar) {
        getPresenter().S2(cVar);
    }

    @Override // com.amazon.aps.iva.ep.d
    public final void p5() {
        c cVar = this.b;
        LinearLayout linearLayout = cVar.b;
        j.e(linearLayout, "binding.episodeRating");
        linearLayout.setVisibility(0);
        ConstraintLayout constraintLayout = cVar.d;
        j.e(constraintLayout, "binding.titleContainer");
        w0.b(constraintLayout, new b());
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }

    @Override // com.amazon.aps.iva.ep.d
    public final void wa() {
        ConstraintLayout constraintLayout = this.b.c;
        j.e(constraintLayout, "binding.loadingCommentsContainer");
        constraintLayout.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchScreenLoadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_watch_screen_loading, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.action_buttons;
        if (((LinearLayout) z.u(R.id.action_buttons, inflate)) != null) {
            i2 = R.id.comments_icon;
            if (z.u(R.id.comments_icon, inflate) != null) {
                i2 = R.id.content_title;
                if (z.u(R.id.content_title, inflate) != null) {
                    i2 = R.id.episode_rating;
                    LinearLayout linearLayout = (LinearLayout) z.u(R.id.episode_rating, inflate);
                    if (linearLayout != null) {
                        i2 = R.id.loading_comments_container;
                        ConstraintLayout constraintLayout = (ConstraintLayout) z.u(R.id.loading_comments_container, inflate);
                        if (constraintLayout != null) {
                            i2 = R.id.title_container;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) z.u(R.id.title_container, inflate);
                            if (constraintLayout2 != null) {
                                this.b = new c((FrameLayout) inflate, linearLayout, constraintLayout, constraintLayout2);
                                this.c = f.b(new a());
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
