package com.amazon.aps.iva.v20;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.fragment.app.h;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xw.t;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: MembershipCardDialog.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/iva/v20/a;", "Landroidx/fragment/app/g;", "<init>", "()V", "a", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a extends g {
    public final com.amazon.aps.iva.ez.a b = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.w20.g.class, new d(this), e.h);
    public static final /* synthetic */ l<Object>[] d = {q.a(a.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/presentation/multitiersubscription/membershipcard/ui/MembershipCardViewModelImpl;", 0)};
    public static final C0781a c = new C0781a();

    /* compiled from: MembershipCardDialog.kt */
    /* renamed from: com.amazon.aps.iva.v20.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0781a {
    }

    /* compiled from: MembershipCardDialog.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements p<i, Integer, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, -859925357, new com.amazon.aps.iva.v20.c(a.this)), iVar2, 6);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: MembershipCardDialog.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, false, true, false, com.amazon.aps.iva.v20.d.h, 251);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<h> {
        public d(Object obj) {
            super(0, obj, Fragment.class, "requireActivity", "requireActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            return ((Fragment) this.receiver).requireActivity();
        }
    }

    /* compiled from: MembershipCardDialog.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.w20.g> {
        public static final e h = new e();

        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.w20.g invoke(androidx.lifecycle.p pVar) {
            j.f(pVar, "it");
            com.amazon.aps.iva.f20.i iVar = i.a.a;
            if (iVar != null) {
                return new com.amazon.aps.iva.w20.g(com.amazon.aps.iva.v20.e.h, iVar.g());
            }
            j.m("dependencies");
            throw null;
        }
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(requireContext(), R.style.MembershipCardDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        return t.a(this, com.amazon.aps.iva.v0.b.c(-1661009690, new b(), true));
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(getResources().getDimensionPixelOffset(R.dimen.membership_card_dialog_width), getResources().getDimensionPixelOffset(R.dimen.membership_card_dialog_height));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setFlags(8192, 8192);
        }
        f1.i(view, c.h);
    }
}
