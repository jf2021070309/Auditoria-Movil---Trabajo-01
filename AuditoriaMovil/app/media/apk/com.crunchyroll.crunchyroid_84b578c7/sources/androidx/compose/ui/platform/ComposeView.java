package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* compiled from: ComposeView.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Lcom/amazon/aps/iva/v1/a;", "", "getAccessibilityClassName", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/kb0/q;", FirebaseAnalytics.Param.CONTENT, "setContent", "(Lcom/amazon/aps/iva/xb0/p;)V", "", "<set-?>", "k", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ComposeView extends com.amazon.aps.iva.v1.a {
    public final y1 j;
    public boolean k;

    /* compiled from: ComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(2);
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.i | 1);
            ComposeView.this.a(iVar, I);
            return q.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.v1.a
    public final void a(com.amazon.aps.iva.o0.i iVar, int i) {
        com.amazon.aps.iva.o0.j g = iVar.g(420213850);
        e0.b bVar = e0.a;
        p pVar = (p) this.j.getValue();
        if (pVar != null) {
            pVar.invoke(g, 0);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new a(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // com.amazon.aps.iva.v1.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.k;
    }

    public final void setContent(p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, FirebaseAnalytics.Param.CONTENT);
        this.k = true;
        this.j.setValue(pVar);
        if (isAttachedToWindow()) {
            c();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ComposeView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r4 = r4 & 2
            r0 = 0
            if (r4 == 0) goto L6
            r3 = r0
        L6:
            java.lang.String r4 = "context"
            com.amazon.aps.iva.yb0.j.f(r2, r4)
            r4 = 0
            r1.<init>(r2, r3, r4)
            com.amazon.aps.iva.o0.y1 r2 = com.amazon.aps.iva.cq.b.c0(r0)
            r1.j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ComposeView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
