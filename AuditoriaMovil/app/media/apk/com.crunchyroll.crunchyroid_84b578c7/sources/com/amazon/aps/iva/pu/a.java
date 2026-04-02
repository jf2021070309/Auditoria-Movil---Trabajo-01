package com.amazon.aps.iva.pu;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ellation.crunchyroll.commenting.comments.inputview.CommentsInputLayout;
/* compiled from: DialogPostCommentBinding.java */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final LinearLayout a;
    public final CommentsInputLayout b;
    public final FrameLayout c;

    public a(LinearLayout linearLayout, CommentsInputLayout commentsInputLayout, FrameLayout frameLayout) {
        this.a = linearLayout;
        this.b = commentsInputLayout;
        this.c = frameLayout;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
