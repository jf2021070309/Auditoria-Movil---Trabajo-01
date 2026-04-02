package com.ellation.crunchyroll.commenting.commentscount.compact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.ou.a;
import com.amazon.aps.iva.ou.b;
import com.amazon.aps.iva.p000do.f;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: CommentsCountCompactLayout.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/commenting/commentscount/compact/CommentsCountCompactLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/amazon/aps/iva/ou/b;", "", "commentsCount", "Lcom/amazon/aps/iva/kb0/q;", "setCommentsCount", "commenting_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CommentsCountCompactLayout extends ConstraintLayout implements b {
    public final f b;
    public final a c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsCountCompactLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.ou.b
    public final void af() {
        TextView textView = (TextView) this.b.c;
        j.e(textView, "binding.commentsCount");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.gf.a
    public final void bind(int i) {
        a aVar = this.c;
        if (i > 0) {
            aVar.getView().setCommentsCount(aVar.b.a(i));
        } else {
            aVar.getView().af();
        }
    }

    @Override // com.amazon.aps.iva.ou.b
    public void setCommentsCount(String str) {
        j.f(str, "commentsCount");
        f fVar = this.b;
        TextView textView = (TextView) fVar.c;
        j.e(textView, "binding.commentsCount");
        textView.setVisibility(0);
        ((TextView) fVar.c).setText(str);
    }

    public /* synthetic */ CommentsCountCompactLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentsCountCompactLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_comments_count_compact, (ViewGroup) this, false);
        addView(inflate);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            this.b = new f(textView, textView, 1);
            this.c = new a(this, new com.amazon.aps.iva.l60.b(context));
            return;
        }
        throw new NullPointerException("rootView");
    }
}
