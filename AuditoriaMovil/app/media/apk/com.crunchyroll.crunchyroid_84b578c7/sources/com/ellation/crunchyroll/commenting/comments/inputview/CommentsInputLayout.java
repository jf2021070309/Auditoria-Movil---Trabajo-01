package com.ellation.crunchyroll.commenting.comments.inputview;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.g;
import com.amazon.aps.iva.d70.b;
import com.amazon.aps.iva.d70.d;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.pm.e;
import com.amazon.aps.iva.pu.j;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yt.c;
import com.amazon.aps.iva.yt.h;
import com.amazon.aps.iva.yt.i;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.commenting.comments.inputview.CommentsInputLayout;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.widgets.characterlimit.CharacterLimitTextView;
import com.ellation.widgets.input.InputUnderlineView;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
/* compiled from: CommentsInputLayout.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\n\u001a\u00020\u00052\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007J\u0012\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/ellation/crunchyroll/commenting/comments/inputview/CommentsInputLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/amazon/aps/iva/yt/i;", "", "text", "Lcom/amazon/aps/iva/kb0/q;", "setInputText", "Lkotlin/Function2;", "", "onPost", "setPostListener", "", "anonymousHint", "setNoUsernameHint", "Lcom/amazon/aps/iva/pu/j;", "b", "Lcom/amazon/aps/iva/pu/j;", "getBinding", "()Lcom/amazon/aps/iva/pu/j;", "binding", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "commenting_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CommentsInputLayout extends ConstraintLayout implements i {
    public static final /* synthetic */ int d = 0;
    public final j b;
    public final h c;

    /* compiled from: CommentsInputLayout.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements p<Boolean, d, q> {
        public a(h hVar) {
            super(2, hVar, c.class, "onCommentTextChanged", "onCommentTextChanged(ZLcom/ellation/widgets/characterlimit/TextChangeData;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(Boolean bool, d dVar) {
            boolean booleanValue = bool.booleanValue();
            d dVar2 = dVar;
            com.amazon.aps.iva.yb0.j.f(dVar2, "p1");
            ((c) this.receiver).v1(booleanValue, dVar2);
            return q.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.yt.i
    public final void A9() {
        ImageView imageView = this.b.e;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.commentInputPost");
        imageView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.yt.i
    public final void Ae() {
        CheckBox checkBox = this.b.d;
        com.amazon.aps.iva.yb0.j.e(checkBox, "binding.commentInputMarkAsSpoiler");
        checkBox.setVisibility(0);
    }

    public final void G(com.amazon.aps.iva.yt.a aVar) {
        h hVar = this.c;
        hVar.getClass();
        hVar.d = aVar;
        hVar.b.b().e(hVar.getView(), new h.a(new com.amazon.aps.iva.yt.d(hVar)));
        j jVar = this.b;
        CharacterLimitTextView characterLimitTextView = jVar.c;
        TextInputEditText textInputEditText = jVar.g;
        com.amazon.aps.iva.yb0.j.e(textInputEditText, "binding.commentInputText");
        a aVar2 = new a(hVar);
        com.amazon.aps.iva.d70.a aVar3 = characterLimitTextView.b;
        aVar3.getClass();
        aVar3.d = aVar2;
        textInputEditText.addTextChangedListener(new b(characterLimitTextView, textInputEditText));
        textInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.amazon.aps.iva.yt.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i = CommentsInputLayout.d;
                CommentsInputLayout commentsInputLayout = CommentsInputLayout.this;
                com.amazon.aps.iva.yb0.j.f(commentsInputLayout, "this$0");
                j jVar2 = commentsInputLayout.b;
                CharacterLimitTextView characterLimitTextView2 = jVar2.c;
                TextInputEditText textInputEditText2 = jVar2.g;
                characterLimitTextView2.U2(String.valueOf(textInputEditText2.getText()).length(), z);
                String.valueOf(textInputEditText2.getText());
                h hVar2 = commentsInputLayout.c;
                if (z) {
                    hVar2.getView().Ae();
                    hVar2.getView().A9();
                    return;
                }
                hVar2.getView().o6();
                hVar2.getView().z2();
            }
        });
    }

    @Override // com.amazon.aps.iva.yt.i
    public final void Oh() {
        ImageView imageView = this.b.e;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.commentInputPost");
        imageView.setEnabled(false);
    }

    @Override // com.amazon.aps.iva.yt.i
    public final void S(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "avatarUrl");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context context = getContext();
        com.amazon.aps.iva.yb0.j.e(context, "context");
        ImageView imageView = this.b.b;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.commentInputAvatar");
        imageUtil.loadRoundImage(context, str, imageView, R.drawable.comment_input_avatar_failure, R.drawable.comment_input_avatar_placeholder);
    }

    @Override // com.amazon.aps.iva.yt.i
    public final void U9(int i, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "username");
        this.b.g.setHint(getContext().getString(i, str));
    }

    @Override // com.amazon.aps.iva.yt.i
    public final void Zb() {
        ProgressBar progressBar = this.b.f;
        com.amazon.aps.iva.yb0.j.e(progressBar, "binding.commentInputPostProgress");
        progressBar.setVisibility(0);
    }

    public final void b1() {
        ConstraintLayout constraintLayout = this.b.h;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.container");
        t0.j(constraintLayout, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.comment_input_field_horizontal_margin_start)), null, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.comment_input_field_horizontal_margin_end)), null, 10);
    }

    public final j getBinding() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.i5.o
    public g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    @Override // com.amazon.aps.iva.yt.i
    public final void l7() {
        ImageView imageView = this.b.e;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.commentInputPost");
        imageView.setEnabled(true);
    }

    @Override // com.amazon.aps.iva.yt.i
    public final void ma() {
        ProgressBar progressBar = this.b.f;
        com.amazon.aps.iva.yb0.j.e(progressBar, "binding.commentInputPostProgress");
        progressBar.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.yt.i
    public final void o6() {
        CheckBox checkBox = this.b.d;
        com.amazon.aps.iva.yb0.j.e(checkBox, "binding.commentInputMarkAsSpoiler");
        checkBox.setVisibility(8);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b1();
    }

    @Override // com.amazon.aps.iva.yt.i
    public final boolean p7() {
        String str;
        boolean z;
        String str2;
        Editable text = this.b.g.getText();
        String str3 = null;
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        h hVar = this.c;
        hVar.getClass();
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            String obj = com.amazon.aps.iva.oe0.q.O0(str).toString();
            com.amazon.aps.iva.yt.a aVar = hVar.d;
            if (aVar != null) {
                com.amazon.aps.iva.su.a a2 = aVar.a();
                if (a2 != null && (str2 = a2.c) != null) {
                    str3 = com.amazon.aps.iva.oe0.q.O0(str2).toString();
                }
                if (!com.amazon.aps.iva.yb0.j.a(obj, str3)) {
                    return false;
                }
            } else {
                com.amazon.aps.iva.yb0.j.m("commentsInputUiModel");
                throw null;
            }
        }
        return true;
    }

    @Override // com.amazon.aps.iva.yt.i
    public void setInputText(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "text");
        j jVar = this.b;
        jVar.g.setText(str);
        jVar.g.setSelection(str.length());
    }

    @Override // com.amazon.aps.iva.yt.i
    public void setNoUsernameHint(int i) {
        this.b.g.setHint(getContext().getString(i));
    }

    public final void setPostListener(p<? super String, ? super Boolean, q> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "onPost");
        this.b.e.setOnClickListener(new com.amazon.aps.iva.dc.c(2, pVar, this));
    }

    @Override // com.amazon.aps.iva.yt.i
    public final void w7() {
        this.b.b.setImageResource(R.drawable.ic_avatar_anonymous);
    }

    @Override // com.amazon.aps.iva.yt.i
    public final void xe() {
        Editable text = this.b.g.getText();
        if (text != null) {
            text.clear();
        }
    }

    @Override // com.amazon.aps.iva.yt.i
    public final void z2() {
        ImageView imageView = this.b.e;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.commentInputPost");
        imageView.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentsInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_comments_input_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.comment_input_avatar;
        ImageView imageView = (ImageView) z.u(R.id.comment_input_avatar, inflate);
        if (imageView != null) {
            i2 = R.id.comment_input_counter;
            CharacterLimitTextView characterLimitTextView = (CharacterLimitTextView) z.u(R.id.comment_input_counter, inflate);
            if (characterLimitTextView != null) {
                i2 = R.id.comment_input_mark_as_spoiler;
                CheckBox checkBox = (CheckBox) z.u(R.id.comment_input_mark_as_spoiler, inflate);
                if (checkBox != null) {
                    i2 = R.id.comment_input_post;
                    ImageView imageView2 = (ImageView) z.u(R.id.comment_input_post, inflate);
                    if (imageView2 != null) {
                        i2 = R.id.comment_input_post_progress;
                        ProgressBar progressBar = (ProgressBar) z.u(R.id.comment_input_post_progress, inflate);
                        if (progressBar != null) {
                            i2 = R.id.comment_input_text;
                            TextInputEditText textInputEditText = (TextInputEditText) z.u(R.id.comment_input_text, inflate);
                            if (textInputEditText != null) {
                                i2 = R.id.comment_input_underline;
                                InputUnderlineView inputUnderlineView = (InputUnderlineView) z.u(R.id.comment_input_underline, inflate);
                                if (inputUnderlineView != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    this.b = new j(constraintLayout, imageView, characterLimitTextView, checkBox, imageView2, progressBar, textInputEditText, inputUnderlineView, constraintLayout);
                                    com.amazon.aps.iva.ut.b bVar = com.amazon.aps.iva.ut.c.f;
                                    if (bVar != null) {
                                        e b = bVar.b().b();
                                        com.amazon.aps.iva.ut.b bVar2 = com.amazon.aps.iva.ut.c.f;
                                        if (bVar2 != null) {
                                            com.amazon.aps.iva.pm.b a2 = bVar2.b().a();
                                            com.amazon.aps.iva.yb0.j.f(b, "userProfileProvider");
                                            com.amazon.aps.iva.yb0.j.f(a2, "userAssetsProvider");
                                            this.c = new h(this, b, a2);
                                            b1();
                                            inputUnderlineView.a(attributeSet);
                                            return;
                                        }
                                        com.amazon.aps.iva.yb0.j.m("dependencies");
                                        throw null;
                                    }
                                    com.amazon.aps.iva.yb0.j.m("dependencies");
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
