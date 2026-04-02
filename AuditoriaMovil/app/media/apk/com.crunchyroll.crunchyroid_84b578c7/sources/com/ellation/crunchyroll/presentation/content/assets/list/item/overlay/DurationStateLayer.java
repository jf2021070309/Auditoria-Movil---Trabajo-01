package com.ellation.crunchyroll.presentation.content.assets.list.item.overlay;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.amazon.aps.iva.h00.a;
import com.amazon.aps.iva.h00.b;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: DurationStateLayer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/content/assets/list/item/overlay/DurationStateLayer;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/amazon/aps/iva/h00/b;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DurationStateLayer extends AppCompatTextView implements b {
    public final a b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DurationStateLayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.h00.b
    public final void f() {
        setVisibility(8);
    }

    @Override // com.amazon.aps.iva.h00.b
    public final void k() {
        setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DurationStateLayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = new a(this);
    }
}
