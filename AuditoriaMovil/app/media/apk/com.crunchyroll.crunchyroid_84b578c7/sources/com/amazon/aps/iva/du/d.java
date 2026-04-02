package com.amazon.aps.iva.du;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.xw.t0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.commenting.comments.list.item.repliesbutton.CommentRepliesButton;
/* compiled from: CommentDeletedItemLayout.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.g {
    public int b;
    public final com.amazon.aps.iva.pu.d c;
    public final com.amazon.aps.iva.t50.b d;

    public d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = R.dimen.comments_list_item_default_avatar_size;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_comment_deleted_item, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.comment_author_avatar;
        ImageView imageView = (ImageView) z.u(R.id.comment_author_avatar, inflate);
        if (imageView != null) {
            i2 = R.id.comment_author_name;
            TextView textView = (TextView) z.u(R.id.comment_author_name, inflate);
            if (textView != null) {
                i2 = R.id.comment_deleted;
                if (((TextView) z.u(R.id.comment_deleted, inflate)) != null) {
                    i2 = R.id.comment_post_date;
                    TextView textView2 = (TextView) z.u(R.id.comment_post_date, inflate);
                    if (textView2 != null) {
                        i2 = R.id.comment_replies_button;
                        CommentRepliesButton commentRepliesButton = (CommentRepliesButton) z.u(R.id.comment_replies_button, inflate);
                        if (commentRepliesButton != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            this.c = new com.amazon.aps.iva.pu.d(constraintLayout, imageView, textView, textView2, commentRepliesButton);
                            Context context2 = constraintLayout.getContext();
                            com.amazon.aps.iva.yb0.j.e(context2, "binding.root.context");
                            this.d = new com.amazon.aps.iva.t50.b(context2);
                            setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public final int getAvatarSize() {
        return this.b;
    }

    public final com.amazon.aps.iva.pu.d getBinding() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.wy.g, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.amazon.aps.iva.pu.d dVar = this.c;
        dVar.b.getLayoutParams().width = t0.a(this.b, this);
        dVar.b.getLayoutParams().height = t0.a(this.b, this);
    }

    public final void setAvatarSize(int i) {
        this.b = i;
    }
}
