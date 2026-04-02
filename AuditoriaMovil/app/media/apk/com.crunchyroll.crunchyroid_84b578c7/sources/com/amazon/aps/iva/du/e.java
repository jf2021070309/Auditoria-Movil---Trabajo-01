package com.amazon.aps.iva.du;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.du.j;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.xw.t0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.commenting.comments.list.item.repliesbutton.CommentRepliesButton;
import com.ellation.crunchyroll.ratebutton.RateButtonLayout;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.widgets.CollapsibleTextView;
import com.ellation.widgets.overflow.OverflowButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: CommentItemLayout.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.g implements o {
    public static final /* synthetic */ int e = 0;
    public int b;
    public final j c;
    public final com.amazon.aps.iva.pu.e d;

    /* compiled from: CommentItemLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a implements com.amazon.aps.iva.j50.f, com.amazon.aps.iva.l60.a {
        public final /* synthetic */ com.amazon.aps.iva.l60.b a;

        public a(Context context) {
            this.a = new com.amazon.aps.iva.l60.b(context);
        }

        @Override // com.amazon.aps.iva.j50.f, com.amazon.aps.iva.l60.a
        public final String a(int i) {
            return this.a.b(i);
        }

        @Override // com.amazon.aps.iva.l60.a
        public final String b(long j) {
            return this.a.b(j);
        }
    }

    /* compiled from: CommentItemLayout.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public b(j jVar) {
            super(0, jVar, g.class, "onLikeButtonClick", "onLikeButtonClick()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((g) this.receiver).i1();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = R.dimen.comments_list_item_default_avatar_size;
        j jVar = new j(this, new com.amazon.aps.iva.t50.b(context));
        this.c = jVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_comment_item, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.comment_author_avatar;
        ImageView imageView = (ImageView) z.u(R.id.comment_author_avatar, inflate);
        if (imageView != null) {
            i2 = R.id.comment_author_name;
            TextView textView = (TextView) z.u(R.id.comment_author_name, inflate);
            if (textView != null) {
                i2 = R.id.comment_hide_spoiler;
                TextView textView2 = (TextView) z.u(R.id.comment_hide_spoiler, inflate);
                if (textView2 != null) {
                    i2 = R.id.comment_like_button_container;
                    RateButtonLayout rateButtonLayout = (RateButtonLayout) z.u(R.id.comment_like_button_container, inflate);
                    if (rateButtonLayout != null) {
                        i2 = R.id.comment_overflow_button;
                        OverflowButton overflowButton = (OverflowButton) z.u(R.id.comment_overflow_button, inflate);
                        if (overflowButton != null) {
                            i2 = R.id.comment_post_date;
                            TextView textView3 = (TextView) z.u(R.id.comment_post_date, inflate);
                            if (textView3 != null) {
                                i2 = R.id.comment_replies_button;
                                CommentRepliesButton commentRepliesButton = (CommentRepliesButton) z.u(R.id.comment_replies_button, inflate);
                                if (commentRepliesButton != null) {
                                    i2 = R.id.comment_reply_button;
                                    ImageView imageView2 = (ImageView) z.u(R.id.comment_reply_button, inflate);
                                    if (imageView2 != null) {
                                        i2 = R.id.comment_spoiler_container;
                                        LinearLayout linearLayout = (LinearLayout) z.u(R.id.comment_spoiler_container, inflate);
                                        if (linearLayout != null) {
                                            i2 = R.id.comment_spoiler_overlay;
                                            View u = z.u(R.id.comment_spoiler_overlay, inflate);
                                            if (u != null) {
                                                com.amazon.aps.iva.pu.h hVar = new com.amazon.aps.iva.pu.h((FrameLayout) u);
                                                CollapsibleTextView collapsibleTextView = (CollapsibleTextView) z.u(R.id.comment_text, inflate);
                                                if (collapsibleTextView != null) {
                                                    this.d = new com.amazon.aps.iva.pu.e((ConstraintLayout) inflate, imageView, textView, textView2, rateButtonLayout, overflowButton, textView3, commentRepliesButton, imageView2, linearLayout, hVar, collapsibleTextView);
                                                    setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                                                    rateButtonLayout.U2(new a(context), new b(jVar));
                                                    return;
                                                }
                                                i2 = R.id.comment_text;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    private final void setCommentControlsEnabled(boolean z) {
        com.amazon.aps.iva.pu.e eVar = this.d;
        eVar.e.setEnabled(z);
        eVar.i.setEnabled(z);
        eVar.f.setEnabled(z);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void B2() {
        com.amazon.aps.iva.pu.e eVar = this.d;
        FrameLayout frameLayout = eVar.k.a;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.commentSpoilerOverlay.root");
        frameLayout.setVisibility(8);
        TextView textView = eVar.d;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.commentHideSpoiler");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void Cd() {
        this.d.l.setLinesWhenCollapsed(Integer.MAX_VALUE);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void D7() {
        setCommentControlsEnabled(false);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void Fh() {
        CollapsibleTextView collapsibleTextView = this.d.l;
        com.amazon.aps.iva.yb0.j.e(collapsibleTextView, "binding.commentText");
        collapsibleTextView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void G5(x xVar, j.a aVar, j.b bVar, j.c cVar, j.d dVar, j.e eVar, j.f fVar, j.g gVar) {
        OverflowButton overflowButton = this.d.f;
        com.amazon.aps.iva.yb0.j.e(overflowButton, "bindOverflowButton$lambda$3");
        ArrayList a2 = new w(aVar, bVar, cVar, dVar, eVar, fVar, gVar).a(xVar);
        int i = OverflowButton.h;
        overflowButton.G(a2, null, null, null, null);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void H5() {
        this.d.j.setOnClickListener(new com.amazon.aps.iva.c8.h(this, 11));
    }

    @Override // com.amazon.aps.iva.du.o
    public final void J1(int i) {
        this.d.h.bind(i);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void Q1(com.amazon.aps.iva.j50.d dVar) {
        this.d.e.b1(dVar);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void Qh() {
        CollapsibleTextView collapsibleTextView = this.d.l;
        com.amazon.aps.iva.yb0.j.e(collapsibleTextView, "binding.commentText");
        collapsibleTextView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void Sb() {
        com.amazon.aps.iva.pu.e eVar = this.d;
        FrameLayout frameLayout = eVar.k.a;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.commentSpoilerOverlay.root");
        frameLayout.setVisibility(0);
        TextView textView = eVar.d;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.commentHideSpoiler");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void T4(List<Image> list) {
        com.amazon.aps.iva.yb0.j.f(list, "images");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context context = getContext();
        com.amazon.aps.iva.yb0.j.e(context, "context");
        ImageView imageView = this.d.b;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.commentAuthorAvatar");
        com.amazon.aps.iva.tu.a.a(imageUtil, context, list, imageView);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void V3() {
        setCommentControlsEnabled(true);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void c7(boolean z) {
        this.d.l.setCollapsed(z);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void fg() {
        com.amazon.aps.iva.pu.e eVar = this.d;
        FrameLayout frameLayout = eVar.k.a;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.commentSpoilerOverlay.root");
        frameLayout.setVisibility(8);
        TextView textView = eVar.d;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.commentHideSpoiler");
        textView.setVisibility(0);
    }

    public final int getAvatarSize() {
        return this.b;
    }

    public final com.amazon.aps.iva.pu.e getBinding() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.du.o
    public final void gg(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "date");
        this.d.g.setText(str);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void k4() {
        com.amazon.aps.iva.pu.e eVar = this.d;
        eVar.j.setClickable(false);
        eVar.j.setFocusable(false);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void kf(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "username");
        this.d.c.setText(str);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void m3(i iVar) {
        new MaterialAlertDialogBuilder(getContext(), R.style.CommentsDeleteMaterialAlertDialogTheme).setTitle(R.string.commenting_comment_delete_title).setMessage(R.string.commenting_comment_delete_message).setNegativeButton(R.string.commenting_comment_delete_negative_button, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.commenting_comment_delete_positive_button, (DialogInterface.OnClickListener) new com.amazon.aps.iva.el.c(1, iVar)).show();
    }

    @Override // com.amazon.aps.iva.wy.g, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.amazon.aps.iva.pu.e eVar = this.d;
        eVar.b.getLayoutParams().width = t0.a(this.b, this);
        eVar.b.getLayoutParams().height = t0.a(this.b, this);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void p8(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "text");
        this.d.l.setText(str);
    }

    @Override // com.amazon.aps.iva.du.o
    public final void rg() {
        this.d.l.setLinesWhenCollapsed(getResources().getInteger(R.integer.comment_text_lines_when_collapsed));
    }

    public final void setAvatarSize(int i) {
        this.b = i;
    }

    @Override // com.amazon.aps.iva.du.o
    public void setCommentBackground(int i) {
        ConstraintLayout constraintLayout = this.d.a;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.root");
        constraintLayout.setBackgroundColor(com.amazon.aps.iva.d3.a.getColor(constraintLayout.getContext(), i));
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(this.c);
    }
}
