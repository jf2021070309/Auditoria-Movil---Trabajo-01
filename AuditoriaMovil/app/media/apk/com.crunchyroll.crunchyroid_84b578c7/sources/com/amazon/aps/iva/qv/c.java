package com.amazon.aps.iva.qv;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.qv.c;
import com.amazon.aps.iva.xw.r0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.crunchylists.crunchylist.CrunchylistActivity;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import com.ellation.widgets.characterlimit.CharacterLimitTextView;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ModifyCrunchylistFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/qv/c;", "Lcom/amazon/aps/iva/wy/e;", "Lcom/amazon/aps/iva/qv/x;", "<init>", "()V", "a", "crunchylists_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.e implements x {
    public final com.amazon.aps.iva.xw.s c;
    public final FragmentViewBindingDelegate d;
    public final com.amazon.aps.iva.kb0.m e;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] g = {defpackage.e.b(c.class, "modifyCrunchylistAction", "getModifyCrunchylistAction()Lcom/ellation/crunchyroll/crunchylists/crunchylistsdialog/ModifyCrunchylistAction;", 0), com.amazon.aps.iva.k.q.a(c.class, "binding", "getBinding()Lcom/ellation/crunchyroll/crunchylists/databinding/FragmentModifyCrunchylistBinding;", 0)};
    public static final a f = new a();

    /* compiled from: ModifyCrunchylistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: ModifyCrunchylistFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.ov.e> {
        public static final b b = new b();

        public b() {
            super(1, com.amazon.aps.iva.ov.e.class, "bind", "bind(Landroid/view/View;)Lcom/ellation/crunchyroll/crunchylists/databinding/FragmentModifyCrunchylistBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.ov.e invoke(View view) {
            View view2 = view;
            com.amazon.aps.iva.yb0.j.f(view2, "p0");
            int i = R.id.crunchylist_input_container;
            ScrollView scrollView = (ScrollView) com.amazon.aps.iva.e.z.u(R.id.crunchylist_input_container, view2);
            if (scrollView != null) {
                i = R.id.crunchylist_input_counter;
                CharacterLimitTextView characterLimitTextView = (CharacterLimitTextView) com.amazon.aps.iva.e.z.u(R.id.crunchylist_input_counter, view2);
                if (characterLimitTextView != null) {
                    i = R.id.crunchylist_list_name_input;
                    EditText editText = (EditText) com.amazon.aps.iva.e.z.u(R.id.crunchylist_list_name_input, view2);
                    if (editText != null) {
                        i = R.id.crunchylists_cta_button;
                        TextView textView = (TextView) com.amazon.aps.iva.e.z.u(R.id.crunchylists_cta_button, view2);
                        if (textView != null) {
                            i = R.id.crunchylists_progress;
                            View u = com.amazon.aps.iva.e.z.u(R.id.crunchylists_progress, view2);
                            if (u != null) {
                                com.amazon.aps.iva.pu.f a = com.amazon.aps.iva.pu.f.a(u);
                                i = R.id.toolbar;
                                View u2 = com.amazon.aps.iva.e.z.u(R.id.toolbar, view2);
                                if (u2 != null) {
                                    return new com.amazon.aps.iva.ov.e((ConstraintLayout) view2, scrollView, characterLimitTextView, editText, textView, a, com.amazon.aps.iva.uu.a.a(u2));
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        }
    }

    /* compiled from: ModifyCrunchylistFragment.kt */
    /* renamed from: com.amazon.aps.iva.qv.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0657c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public C0657c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            a aVar = c.f;
            c cVar = c.this;
            cVar.ei().getPresenter().g0(cVar.di().d.getText().toString());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ModifyCrunchylistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<i> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final i invoke() {
            int i = i.a;
            a aVar = c.f;
            c cVar = c.this;
            cVar.getClass();
            return new j(cVar, (com.amazon.aps.iva.gv.i) cVar.c.getValue(cVar, c.g[0]));
        }
    }

    /* compiled from: ModifyCrunchylistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Boolean, com.amazon.aps.iva.d70.d, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool, com.amazon.aps.iva.d70.d dVar) {
            boolean booleanValue = bool.booleanValue();
            com.amazon.aps.iva.yb0.j.f(dVar, "<anonymous parameter 1>");
            a aVar = c.f;
            c.this.ei().getPresenter().l5(booleanValue);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ModifyCrunchylistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final f h = new f();

        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, true, false, false, false, com.amazon.aps.iva.qv.d.h, 254);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public c() {
        super(R.layout.fragment_modify_crunchylist);
        this.c = new com.amazon.aps.iva.xw.s("modify_list_action");
        this.d = com.amazon.aps.iva.a60.b.A(this, b.b);
        this.e = com.amazon.aps.iva.kb0.f.b(new d());
    }

    @Override // com.amazon.aps.iva.qv.x
    public final void B1() {
        TextView textView = di().e;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.crunchylistsCtaButton");
        textView.setEnabled(true);
        EditText editText = di().d;
        com.amazon.aps.iva.yb0.j.e(editText, "binding.crunchylistListNameInput");
        r0.d(editText, 6, new C0657c());
    }

    @Override // com.amazon.aps.iva.qv.x
    public final void F(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        androidx.fragment.app.h activity = getActivity();
        com.amazon.aps.iva.yb0.j.d(activity, "null cannot be cast to non-null type com.ellation.crunchyroll.crunchylists.CrunchylistsMessagingView");
        ((com.amazon.aps.iva.xu.g) activity).showSnackbar(iVar);
    }

    @Override // com.amazon.aps.iva.qv.x
    public final void J() {
        TextView textView = di().e;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.crunchylistsCtaButton");
        textView.setEnabled(false);
        EditText editText = di().d;
        com.amazon.aps.iva.yb0.j.e(editText, "binding.crunchylistListNameInput");
        r0.a(editText);
    }

    @Override // com.amazon.aps.iva.qv.x
    public final void Kd(com.amazon.aps.iva.nv.e eVar, com.amazon.aps.iva.qv.a aVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "crunchylistItemUiModel");
        int i = CrunchylistActivity.m;
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        CrunchylistActivity.a.a(requireActivity, new com.amazon.aps.iva.cv.c(eVar, aVar));
    }

    @Override // com.amazon.aps.iva.qv.x
    public final void Z7() {
        di().g.c.setText(getString(R.string.crunchylists_create_crunchylist));
        di().e.setText(getString(R.string.crunchylists_create_crunchylist_create_list));
    }

    public final com.amazon.aps.iva.ov.e di() {
        return (com.amazon.aps.iva.ov.e) this.d.getValue(this, g[1]);
    }

    public final i ei() {
        return (i) this.e.getValue();
    }

    @Override // com.amazon.aps.iva.qv.x
    public final void j() {
        ProgressBar progressBar = (ProgressBar) di().f.b;
        com.amazon.aps.iva.yb0.j.e(progressBar, "binding.crunchylistsProgress.root");
        progressBar.setVisibility(0);
        TextView textView = di().e;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.crunchylistsCtaButton");
        textView.setVisibility(4);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        di().g.b.setOnClickListener(new com.amazon.aps.iva.c8.k(this, 11));
        LinearLayout linearLayout = di().g.a;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.toolbar.root");
        f1.i(linearLayout, com.amazon.aps.iva.qv.f.h);
        di().e.setOnClickListener(new com.amazon.aps.iva.fe.a(this, 8));
        CharacterLimitTextView characterLimitTextView = di().c;
        EditText editText = di().d;
        com.amazon.aps.iva.yb0.j.e(editText, "binding.crunchylistListNameInput");
        e eVar = new e();
        com.amazon.aps.iva.d70.a aVar = characterLimitTextView.b;
        aVar.getClass();
        aVar.d = eVar;
        editText.addTextChangedListener(new com.amazon.aps.iva.d70.b(characterLimitTextView, editText));
        di().d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.amazon.aps.iva.qv.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                c.a aVar2 = c.f;
                c cVar = c.this;
                com.amazon.aps.iva.yb0.j.f(cVar, "this$0");
                cVar.di().c.U2(cVar.di().d.getText().toString().length(), true);
            }
        });
        ScrollView scrollView = di().b;
        com.amazon.aps.iva.yb0.j.e(scrollView, "binding.crunchylistInputContainer");
        f1.i(scrollView, f.h);
        if (bundle == null) {
            com.amazon.aps.iva.ty.d a2 = ei().a();
            EditText editText2 = di().d;
            com.amazon.aps.iva.yb0.j.e(editText2, "binding.crunchylistListNameInput");
            a2.a(editText2);
        }
    }

    @Override // com.amazon.aps.iva.qv.x
    public final void r0() {
        com.amazon.aps.iva.ty.d a2 = ei().a();
        EditText editText = di().d;
        com.amazon.aps.iva.yb0.j.e(editText, "binding.crunchylistListNameInput");
        a2.b(editText);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(ei().getPresenter());
    }

    @Override // com.amazon.aps.iva.qv.x
    public final void x7(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        di().g.c.setText(getString(R.string.crunchylists_rename_crunchylist));
        di().e.setText(getString(R.string.crunchylists_rename_list));
        di().d.setText(str);
    }
}
