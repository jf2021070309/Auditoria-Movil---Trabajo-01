package com.amazon.aps.iva.pu;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ellation.crunchyroll.commenting.commentscount.CommentsCountLayout;
/* compiled from: LayoutCommentRepliesToolbarBinding.java */
/* loaded from: classes2.dex */
public final class g implements com.amazon.aps.iva.d9.a {
    public final LinearLayout a;
    public final ImageView b;
    public final CommentsCountLayout c;

    public g(LinearLayout linearLayout, ImageView imageView, CommentsCountLayout commentsCountLayout) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = commentsCountLayout;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
