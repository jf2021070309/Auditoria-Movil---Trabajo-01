package com.ellation.widgets.bottommessage.error;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.c70.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import kotlin.Metadata;
/* compiled from: ErrorBottomMessageView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ellation/widgets/bottommessage/error/ErrorBottomMessageView;", "Lcom/amazon/aps/iva/c70/a;", "Landroid/view/ViewGroup;", "f", "Landroid/view/ViewGroup;", "getMessageLayout", "()Landroid/view/ViewGroup;", "messageLayout", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class ErrorBottomMessageView extends a {
    public final ViewGroup f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorBottomMessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.c70.a
    public ViewGroup getMessageLayout() {
        return this.f;
    }

    public /* synthetic */ ErrorBottomMessageView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorBottomMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.error_message_view_layout, (ViewGroup) this, false);
        j.d(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f = (ViewGroup) inflate;
        addView(getMessageLayout());
        setEnabled(true);
    }
}
