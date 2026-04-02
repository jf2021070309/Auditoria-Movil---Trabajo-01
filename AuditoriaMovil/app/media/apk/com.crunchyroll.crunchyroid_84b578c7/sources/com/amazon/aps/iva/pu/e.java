package com.amazon.aps.iva.pu;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.crunchyroll.commenting.comments.list.item.repliesbutton.CommentRepliesButton;
import com.ellation.crunchyroll.ratebutton.RateButtonLayout;
import com.ellation.widgets.CollapsibleTextView;
import com.ellation.widgets.overflow.OverflowButton;
/* compiled from: LayoutCommentItemBinding.java */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final RateButtonLayout e;
    public final OverflowButton f;
    public final TextView g;
    public final CommentRepliesButton h;
    public final ImageView i;
    public final LinearLayout j;
    public final h k;
    public final CollapsibleTextView l;

    public e(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, RateButtonLayout rateButtonLayout, OverflowButton overflowButton, TextView textView3, CommentRepliesButton commentRepliesButton, ImageView imageView2, LinearLayout linearLayout, h hVar, CollapsibleTextView collapsibleTextView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = rateButtonLayout;
        this.f = overflowButton;
        this.g = textView3;
        this.h = commentRepliesButton;
        this.i = imageView2;
        this.j = linearLayout;
        this.k = hVar;
        this.l = collapsibleTextView;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
