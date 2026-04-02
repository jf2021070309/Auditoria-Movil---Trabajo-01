package com.braze.ui.contentcards.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.yb0.j;
import com.braze.ui.R$dimen;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import kotlin.Metadata;
/* compiled from: ContentCardsDividerItemDecoration.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/braze/ui/contentcards/recycler/ContentCardsDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$o;", "", "parentWidth", "getSidePaddingValue", "Landroid/graphics/Rect;", "itemViewOutputRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$b0;", "state", "Lcom/amazon/aps/iva/kb0/q;", "getItemOffsets", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "itemDividerHeight", "I", "contentCardsItemMaxWidth", "context", "<init>", "(Landroid/content/Context;)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class ContentCardsDividerItemDecoration extends RecyclerView.o {
    private final Context appContext;
    private final int contentCardsItemMaxWidth;
    private final int itemDividerHeight;

    public ContentCardsDividerItemDecoration(Context context) {
        j.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        j.e(applicationContext, "context.applicationContext");
        this.appContext = applicationContext;
        this.itemDividerHeight = applicationContext.getResources().getDimensionPixelSize(R$dimen.com_braze_content_cards_divider_height);
        this.contentCardsItemMaxWidth = applicationContext.getResources().getDimensionPixelSize(R$dimen.com_braze_content_cards_max_width);
    }

    private final int getSidePaddingValue(int i) {
        int i2 = (i - this.contentCardsItemMaxWidth) / 2;
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        boolean z;
        int i;
        j.f(rect, "itemViewOutputRect");
        j.f(view, "view");
        j.f(recyclerView, "parent");
        j.f(b0Var, "state");
        super.getItemOffsets(rect, view, recyclerView, b0Var);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i2 = 0;
        if (recyclerView.getAdapter() instanceof ContentCardAdapter) {
            RecyclerView.h adapter = recyclerView.getAdapter();
            j.d(adapter, "null cannot be cast to non-null type com.braze.ui.contentcards.adapters.ContentCardAdapter");
            z = ((ContentCardAdapter) adapter).isControlCardAtPosition(childAdapterPosition);
        } else {
            z = false;
        }
        if (childAdapterPosition == 0) {
            i = this.itemDividerHeight;
        } else {
            i = 0;
        }
        rect.top = i;
        if (!z) {
            i2 = this.itemDividerHeight;
        }
        rect.bottom = i2;
        int sidePaddingValue = getSidePaddingValue(recyclerView.getWidth());
        rect.left = sidePaddingValue;
        rect.right = sidePaddingValue;
    }
}
