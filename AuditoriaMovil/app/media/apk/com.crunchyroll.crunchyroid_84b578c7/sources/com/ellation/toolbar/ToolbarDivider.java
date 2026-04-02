package com.ellation.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.w60.a;
import com.amazon.aps.iva.w60.b;
import com.amazon.aps.iva.w60.d;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: ToolbarDivider.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ellation/toolbar/ToolbarDivider;", "Landroid/view/View;", "Lcom/amazon/aps/iva/w60/d;", "Lcom/amazon/aps/iva/w60/b;", "b", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/w60/b;", "presenter", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ToolbarDivider extends View implements d {
    public final m b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarDivider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        this.b = f.b(new a(this));
    }

    private final b getPresenter() {
        return (b) this.b.getValue();
    }

    public final void G(int i) {
        getPresenter().M4(i);
    }

    @Override // com.amazon.aps.iva.w60.d
    public final void T() {
        setVisibility(0);
    }

    @Override // com.amazon.aps.iva.w60.d
    public final void U() {
        setVisibility(4);
    }
}
