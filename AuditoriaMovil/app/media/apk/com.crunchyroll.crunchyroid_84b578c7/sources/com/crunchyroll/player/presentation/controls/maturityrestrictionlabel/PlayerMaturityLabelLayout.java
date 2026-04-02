package com.crunchyroll.player.presentation.controls.maturityrestrictionlabel;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.cj.h;
import com.amazon.aps.iva.cj.k;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.el.c0;
import com.amazon.aps.iva.el.d0;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.m6.e;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xk.f;
import com.amazon.aps.iva.xk.i;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelsKt;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: PlayerMaturityLabelLayout.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/crunchyroll/player/presentation/controls/maturityrestrictionlabel/PlayerMaturityLabelLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/xk/i;", "Lcom/amazon/aps/iva/i5/o;", "Lcom/amazon/aps/iva/dl/d;", "c", "Lcom/amazon/aps/iva/ez/a;", "getControlsVisibilityViewModel", "()Lcom/amazon/aps/iva/dl/d;", "controlsVisibilityViewModel", "Lcom/amazon/aps/iva/xk/g;", "d", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/xk/g;", "presenter", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PlayerMaturityLabelLayout extends g implements i {
    public static final /* synthetic */ l<Object>[] e = {q.a(PlayerMaturityLabelLayout.class, "controlsVisibilityViewModel", "getControlsVisibilityViewModel()Lcom/crunchyroll/player/presentation/controls/visibility/ControlsVisibilityViewModelImpl;", 0)};
    public final com.amazon.aps.iva.mj.i b;
    public final com.amazon.aps.iva.ez.a c;
    public final m d;

    /* compiled from: PlayerMaturityLabelLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ LabelUiModel h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LabelUiModel labelUiModel) {
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
                LabelsKt.m32Labels0OtIIsQ(this.h, null, false, true, false, false, false, false, 0L, null, 0.0f, iVar2, LabelUiModel.$stable | 3072, 0, 2038);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PlayerMaturityLabelLayout.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.dl.d> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.dl.d invoke(androidx.lifecycle.p pVar) {
            j.f(pVar, "it");
            k kVar = n.d;
            if (kVar != null) {
                return new com.amazon.aps.iva.dl.d(kVar.i());
            }
            j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: PlayerMaturityLabelLayout.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.xk.g> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.xk.g invoke() {
            com.amazon.aps.iva.cj.p pVar = n.f;
            if (pVar != null) {
                h d = pVar.d();
                PlayerMaturityLabelLayout playerMaturityLabelLayout = PlayerMaturityLabelLayout.this;
                v<com.amazon.aps.iva.ez.d<c0>> vVar = playerMaturityLabelLayout.getControlsVisibilityViewModel().d;
                LifecycleCoroutineScopeImpl O = x.O(playerMaturityLabelLayout);
                j.f(d, "player");
                j.f(vVar, "playerControlsVisibility");
                f fVar = new f(d, vVar, O);
                com.amazon.aps.iva.xk.c cVar = new com.amazon.aps.iva.xk.c();
                k kVar = n.d;
                if (kVar != null) {
                    com.amazon.aps.iva.aj.h d2 = kVar.e().d();
                    j.f(d2, "showParentalControls");
                    if (((Boolean) d2.invoke()).booleanValue()) {
                        return new com.amazon.aps.iva.xk.h(playerMaturityLabelLayout, fVar, cVar);
                    }
                    return new com.amazon.aps.iva.xk.a();
                }
                j.m("dependencies");
                throw null;
            }
            j.m("feature");
            throw null;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerMaturityLabelLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.amazon.aps.iva.dl.d getControlsVisibilityViewModel() {
        return (com.amazon.aps.iva.dl.d) this.c.getValue(this, e[0]);
    }

    private final com.amazon.aps.iva.xk.g getPresenter() {
        return (com.amazon.aps.iva.xk.g) this.d.getValue();
    }

    public final void U2(LabelUiModel labelUiModel) {
        j.f(labelUiModel, "labelUiModel");
        getPresenter().f5(labelUiModel);
    }

    @Override // com.amazon.aps.iva.xk.i
    public final void cd(LabelUiModel labelUiModel) {
        j.f(labelUiModel, "labelUiModel");
        ((ComposeView) this.b.e).setContent(com.amazon.aps.iva.v0.b.c(1830177966, new a(labelUiModel), true));
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    @Override // com.amazon.aps.iva.xk.i
    public final void k5() {
        clearAnimation();
        View view = new View[]{this}[0];
        view.animate().alpha(1.0f).setDuration(300L).withStartAction(new e(view, 7)).setInterpolator(new DecelerateInterpolator()).start();
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(getPresenter());
    }

    @Override // com.amazon.aps.iva.xk.i
    public final void t6() {
        clearAnimation();
        View view = new View[]{this}[0];
        view.animate().alpha(0.0f).setDuration(300L).withEndAction(new d0(view, 0)).setInterpolator(new DecelerateInterpolator()).start();
    }

    @Override // com.amazon.aps.iva.xk.i
    public final void yc(String str) {
        this.b.b.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerMaturityLabelLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.player_maturity_label_layout, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.maturity_content_descriptor_text;
        TextView textView = (TextView) z.u(R.id.maturity_content_descriptor_text, inflate);
        if (textView != null) {
            i2 = R.id.maturity_label;
            ComposeView composeView = (ComposeView) z.u(R.id.maturity_label, inflate);
            if (composeView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                this.b = new com.amazon.aps.iva.mj.i(relativeLayout, textView, composeView, relativeLayout);
                Activity a2 = com.amazon.aps.iva.xw.q.a(context);
                j.d(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                this.c = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.dl.d.class, new d((androidx.fragment.app.h) a2), b.h);
                this.d = com.amazon.aps.iva.kb0.f.b(new c());
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
