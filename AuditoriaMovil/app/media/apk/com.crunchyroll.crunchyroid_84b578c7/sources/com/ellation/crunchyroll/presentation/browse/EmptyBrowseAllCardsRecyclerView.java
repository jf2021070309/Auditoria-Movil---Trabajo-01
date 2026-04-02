package com.ellation.crunchyroll.presentation.browse;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.tz.h0;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: EmptyBrowseAllCardsRecyclerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ellation/crunchyroll/presentation/browse/EmptyBrowseAllCardsRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EmptyBrowseAllCardsRecyclerView extends RecyclerView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmptyBrowseAllCardsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyBrowseAllCardsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        addItemDecoration(new h0());
    }
}
