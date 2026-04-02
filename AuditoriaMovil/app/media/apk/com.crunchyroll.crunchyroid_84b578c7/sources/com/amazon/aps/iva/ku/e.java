package com.amazon.aps.iva.ku;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.u70.h;
import com.crunchyroll.connectivity.ConnectionErrorBottomMessageLayout;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.commenting.comments.inputview.CommentsInputLayout;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: PostCommentDialog.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/aps/iva/ku/e;", "Lcom/amazon/aps/iva/wy/d;", "Lcom/amazon/aps/iva/ku/w;", "Lcom/amazon/aps/iva/hf/a;", "<init>", "()V", "a", "commenting_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.d implements w, com.amazon.aps.iva.hf.a {
    public final FragmentViewBindingDelegate b;
    public final com.amazon.aps.iva.xw.s c;
    public final com.amazon.aps.iva.xw.s d;
    public final com.amazon.aps.iva.xw.s e;
    public final com.amazon.aps.iva.xw.u f;
    public final com.amazon.aps.iva.kb0.m g;
    public final com.amazon.aps.iva.kb0.m h;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] j = {com.amazon.aps.iva.k.q.a(e.class, "binding", "getBinding()Lcom/ellation/crunchyroll/commenting/databinding/DialogPostCommentBinding;", 0), defpackage.e.b(e.class, "assetId", "getAssetId()Ljava/lang/String;", 0), defpackage.e.b(e.class, "parentFragmentTag", "getParentFragmentTag()Ljava/lang/String;", 0), defpackage.e.b(e.class, "commentsInputUiModel", "getCommentsInputUiModel()Lcom/ellation/crunchyroll/commenting/comments/inputview/BaseCommentsInputUiModel;", 0), defpackage.e.b(e.class, "parentCommentId", "getParentCommentId()Ljava/lang/String;", 0)};
    public static final a i = new a();

    /* compiled from: PostCommentDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static e a(String str, String str2, com.amazon.aps.iva.yt.a aVar, String str3) {
            com.amazon.aps.iva.yb0.j.f(str, "assetId");
            e eVar = new e();
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = e.j;
            eVar.c.b(eVar, lVarArr[1], str);
            eVar.d.b(eVar, lVarArr[2], str2);
            eVar.e.b(eVar, lVarArr[3], aVar);
            eVar.f.b(eVar, lVarArr[4], str3);
            return eVar;
        }
    }

    /* compiled from: PostCommentDialog.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.pu.a> {
        public static final b b = new b();

        public b() {
            super(1, com.amazon.aps.iva.pu.a.class, "bind", "bind(Landroid/view/View;)Lcom/ellation/crunchyroll/commenting/databinding/DialogPostCommentBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.pu.a invoke(View view) {
            View view2 = view;
            com.amazon.aps.iva.yb0.j.f(view2, "p0");
            int i = R.id.cast_mini_controller_container;
            if (((FrameLayout) z.u(R.id.cast_mini_controller_container, view2)) != null) {
                i = R.id.comment_input_connection_error_layout;
                if (((ConnectionErrorBottomMessageLayout) z.u(R.id.comment_input_connection_error_layout, view2)) != null) {
                    i = R.id.comment_input_view;
                    CommentsInputLayout commentsInputLayout = (CommentsInputLayout) z.u(R.id.comment_input_view, view2);
                    if (commentsInputLayout != null) {
                        i = R.id.message_layout_container;
                        FrameLayout frameLayout = (FrameLayout) z.u(R.id.message_layout_container, view2);
                        if (frameLayout != null) {
                            return new com.amazon.aps.iva.pu.a((LinearLayout) view2, commentsInputLayout, frameLayout);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        }
    }

    /* compiled from: PostCommentDialog.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ty.b> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ty.b invoke() {
            int i = com.amazon.aps.iva.ty.b.a;
            androidx.fragment.app.h requireActivity = e.this.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
            return new com.amazon.aps.iva.ty.d(requireActivity);
        }
    }

    /* compiled from: PostCommentDialog.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<j> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final j invoke() {
            a aVar = e.i;
            e eVar = e.this;
            eVar.getClass();
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = e.j;
            String str = (String) eVar.d.getValue(eVar, lVarArr[2]);
            String str2 = (String) eVar.c.getValue(eVar, lVarArr[1]);
            String str3 = (String) eVar.f.getValue(eVar, lVarArr[4]);
            com.amazon.aps.iva.ut.b bVar = com.amazon.aps.iva.ut.c.f;
            if (bVar != null) {
                com.amazon.aps.iva.pm.b a = bVar.b().a();
                com.amazon.aps.iva.ut.b bVar2 = com.amazon.aps.iva.ut.c.f;
                if (bVar2 != null) {
                    TalkboxService talkboxService = bVar2.getTalkboxService();
                    com.amazon.aps.iva.ut.b bVar3 = com.amazon.aps.iva.ut.c.f;
                    if (bVar3 != null) {
                        return new q(eVar, a, str2, str3, str, talkboxService, bVar3.getGetLocale());
                    }
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    public e() {
        super(Integer.valueOf((int) R.layout.dialog_post_comment));
        this.b = com.amazon.aps.iva.a60.b.z(this, b.b);
        this.c = new com.amazon.aps.iva.xw.s("asset_id");
        this.d = new com.amazon.aps.iva.xw.s("parent_fragment_tag");
        this.e = new com.amazon.aps.iva.xw.s("comment_input_ui_model");
        this.f = new com.amazon.aps.iva.xw.u("parent_comment_id");
        this.g = com.amazon.aps.iva.kb0.f.b(new c());
        this.h = com.amazon.aps.iva.kb0.f.b(new d());
    }

    @Override // com.amazon.aps.iva.ku.w
    public final boolean Jb() {
        return !ci().b.p7();
    }

    @Override // com.amazon.aps.iva.hf.a
    public final void Oa(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        di().getPresenter().r6(aVar);
    }

    @Override // com.amazon.aps.iva.ku.w
    public final void Qe() {
        Window window;
        Window window2;
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setDimAmount(0.5f);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.clearFlags(32);
        }
    }

    @Override // com.amazon.aps.iva.ku.w
    public final void Ve(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        di().a().setButton(-2, getText(R.string.commenting_discard), new com.amazon.aps.iva.yd.a(aVar, 1));
        di().a().show();
    }

    @Override // com.amazon.aps.iva.ku.w
    public final void Yg() {
        ViewTreeObserver viewTreeObserver;
        Window window;
        Window window2;
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -2);
            window2.setGravity(80);
        }
        TextInputEditText textInputEditText = ci().b.getBinding().g;
        com.amazon.aps.iva.yb0.j.e(textInputEditText, "binding.commentInputView.binding.commentInputText");
        textInputEditText.requestFocus();
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window = dialog3.getWindow()) != null) {
            window.setCallback(new g(this, window.getCallback()));
        }
        Dialog dialog4 = getDialog();
        if (dialog4 != null) {
            dialog4.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.amazon.aps.iva.ku.d
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
                    if (r3 == 1) goto L5;
                 */
                @Override // android.content.DialogInterface.OnKeyListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onKey(android.content.DialogInterface r2, int r3, android.view.KeyEvent r4) {
                    /*
                        r1 = this;
                        com.amazon.aps.iva.ku.e$a r2 = com.amazon.aps.iva.ku.e.i
                        com.amazon.aps.iva.ku.e r2 = com.amazon.aps.iva.ku.e.this
                        java.lang.String r0 = "this$0"
                        com.amazon.aps.iva.yb0.j.f(r2, r0)
                        com.amazon.aps.iva.ku.j r2 = r2.di()
                        com.amazon.aps.iva.ku.v r2 = r2.getPresenter()
                        r0 = 4
                        if (r3 != r0) goto L1c
                        int r3 = r4.getAction()
                        r4 = 1
                        if (r3 != r4) goto L1c
                        goto L1d
                    L1c:
                        r4 = 0
                    L1d:
                        boolean r2 = r2.s6(r4)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ku.d.onKey(android.content.DialogInterface, int, android.view.KeyEvent):boolean");
                }
            });
        }
        View view = getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(di().b());
        }
    }

    public final com.amazon.aps.iva.pu.a ci() {
        return (com.amazon.aps.iva.pu.a) this.b.getValue(this, j[0]);
    }

    @Override // com.amazon.aps.iva.ku.w
    public final void d() {
        TextInputEditText textInputEditText = ci().b.getBinding().g;
        com.amazon.aps.iva.yb0.j.e(textInputEditText, "binding.commentInputView.binding.commentInputText");
        ((com.amazon.aps.iva.ty.b) this.g.getValue()).b(textInputEditText);
    }

    public final j di() {
        return (j) this.h.getValue();
    }

    public final boolean ei() {
        if (getParentFragmentManager().C((String) this.d.getValue(this, j[2])) != null) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ku.w
    public final void hc() {
        Window window;
        Window window2;
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setDimAmount(0.0f);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setFlags(32, 32);
        }
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.DialogTheme);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View view;
        ViewTreeObserver viewTreeObserver;
        if (ei() && (view = getView()) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(di().b());
        }
        super.onDestroyView();
        di().a().dismiss();
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        if (ei()) {
            ci().b.setPostListener(new f(di().getPresenter()));
            ci().b.G((com.amazon.aps.iva.yt.a) this.e.getValue(this, j[3]));
        }
        if (bundle == null) {
            TextInputEditText textInputEditText = ci().b.getBinding().g;
            com.amazon.aps.iva.yb0.j.e(textInputEditText, "binding.commentInputView.binding.commentInputText");
            ((com.amazon.aps.iva.ty.b) this.g.getValue()).a(textInputEditText);
        }
    }

    @Override // com.amazon.aps.iva.ku.w
    public final boolean p0() {
        return ((com.amazon.aps.iva.ty.b) this.g.getValue()).p0();
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        if (ei()) {
            return l1.H(di().getPresenter());
        }
        b0 b0Var = b0.b;
        dismiss();
        return b0Var;
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i2 = com.amazon.aps.iva.u70.h.a;
        FrameLayout frameLayout = ci().c;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.messageLayoutContainer");
        h.a.a(frameLayout, iVar);
    }

    @Override // com.amazon.aps.iva.ku.w
    public final void vc(com.amazon.aps.iva.ez.g<?> gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "state");
        CommentsInputLayout commentsInputLayout = ci().b;
        commentsInputLayout.getClass();
        com.amazon.aps.iva.yt.h hVar = commentsInputLayout.c;
        hVar.getClass();
        gVar.c(new com.amazon.aps.iva.yt.e(hVar));
        gVar.b(new com.amazon.aps.iva.yt.f(hVar));
        gVar.e(new com.amazon.aps.iva.yt.g(hVar));
    }
}
