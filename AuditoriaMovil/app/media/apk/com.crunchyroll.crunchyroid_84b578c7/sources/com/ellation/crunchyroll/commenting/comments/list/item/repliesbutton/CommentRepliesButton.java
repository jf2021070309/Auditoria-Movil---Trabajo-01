package com.ellation.crunchyroll.commenting.comments.list.item.repliesbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.eu.a;
import com.amazon.aps.iva.eu.b;
import com.amazon.aps.iva.pu.f;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CommentRepliesButton.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/commenting/comments/list/item/repliesbutton/CommentRepliesButton;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/eu/b;", "commenting_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CommentRepliesButton extends g implements b {
    public final a b;
    public final f c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentRepliesButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.eu.b
    public final void J1(int i) {
        ((TextView) this.c.c).setText(getResources().getQuantityString(R.plurals.commenting_item_comment_replies_button_with_replies_count, i, Integer.valueOf(i)));
    }

    @Override // com.amazon.aps.iva.eu.b
    public final void N6() {
        setVisibility(0);
    }

    public final void bind(int i) {
        a aVar = this.b;
        if (i > 0) {
            aVar.getView().N6();
            aVar.getView().J1(i);
            return;
        }
        aVar.getView().i3();
    }

    @Override // com.amazon.aps.iva.eu.b
    public final void i3() {
        setVisibility(8);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(this.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentRepliesButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = new a(this);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_comment_replies_button, (ViewGroup) this, false);
        addView(inflate);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            this.c = new f(textView, textView, 0);
            return;
        }
        throw new NullPointerException("rootView");
    }
}
