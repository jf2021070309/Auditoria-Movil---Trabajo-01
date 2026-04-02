package com.amazon.aps.iva.pu;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.crunchyroll.commenting.comments.list.item.repliesbutton.CommentRepliesButton;
/* compiled from: LayoutCommentDeletedItemBinding.java */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final CommentRepliesButton e;

    public d(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, CommentRepliesButton commentRepliesButton) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = commentRepliesButton;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
