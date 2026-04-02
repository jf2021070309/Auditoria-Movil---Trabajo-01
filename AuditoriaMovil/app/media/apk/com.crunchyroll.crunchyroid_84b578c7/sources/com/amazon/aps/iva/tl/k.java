package com.amazon.aps.iva.tl;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.b50.w;
import com.amazon.aps.iva.cj.p;
import com.amazon.aps.iva.dj.f;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.tl.k;
import com.amazon.aps.iva.xw.h0;
import com.amazon.aps.iva.xw.v;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.player.settings.PlayerSettingsRadioGroup;
import com.crunchyroll.player.settings.reportproblem.button.ReportProblemButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ReportProblemSettingsFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/tl/k;", "Lcom/amazon/aps/iva/ll/a;", "Lcom/amazon/aps/iva/tl/o;", "<init>", "()V", "a", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.ll.a implements o {
    public final v e = com.amazon.aps.iva.xw.g.f(this, R.id.radio_group);
    public final v f = com.amazon.aps.iva.xw.g.f(this, R.id.report_problem_button);
    public final v g = com.amazon.aps.iva.xw.g.f(this, R.id.report_problem_scroll_container);
    public final com.amazon.aps.iva.kb0.m h = com.amazon.aps.iva.kb0.f.b(new c());
    public final com.amazon.aps.iva.kb0.m i = com.amazon.aps.iva.kb0.f.b(new e());
    public final i j = new View.OnLayoutChangeListener() { // from class: com.amazon.aps.iva.tl.i
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            k.a aVar = k.k;
            k kVar = k.this;
            com.amazon.aps.iva.yb0.j.f(kVar, "this$0");
            View checkedOptionView = kVar.ei().getCheckedOptionView();
            if (checkedOptionView != null) {
                ScrollView scrollView = (ScrollView) kVar.g.getValue(kVar, k.l[2]);
                com.amazon.aps.iva.yb0.j.f(scrollView, "<this>");
                ObjectAnimator ofInt = ObjectAnimator.ofInt(scrollView, "scrollY", (int) checkedOptionView.getY());
                ofInt.setDuration(300L);
                ofInt.addListener(new h0(null));
                ofInt.start();
            }
        }
    };
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] l = {q.a(k.class, "radioGroup", "getRadioGroup()Lcom/crunchyroll/player/settings/PlayerSettingsRadioGroup;", 0), q.a(k.class, "reportProblemButton", "getReportProblemButton()Lcom/crunchyroll/player/settings/reportproblem/button/ReportProblemButton;", 0), q.a(k.class, "scrollContainer", "getScrollContainer()Landroid/widget/ScrollView;", 0)};
    public static final a k = new a();

    /* compiled from: ReportProblemSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: ReportProblemSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.vl.a, CharSequence> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(com.amazon.aps.iva.vl.a aVar) {
            com.amazon.aps.iva.vl.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "$this$showOptions");
            String string = k.this.getString(aVar2.getTitleResId());
            com.amazon.aps.iva.yb0.j.e(string, "getString(this.titleResId)");
            return string;
        }
    }

    /* compiled from: ReportProblemSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ty.b> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ty.b invoke() {
            int i = com.amazon.aps.iva.ty.b.a;
            Activity a = com.amazon.aps.iva.xw.q.a(k.this.getContext());
            com.amazon.aps.iva.yb0.j.c(a);
            return new com.amazon.aps.iva.ty.d(a);
        }
    }

    /* compiled from: ReportProblemSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public d(l lVar) {
            super(0, lVar, l.class, "onOptionSelected", "onOptionSelected()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((l) this.receiver).M2();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ReportProblemSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<l> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final l invoke() {
            k kVar = k.this;
            Context requireContext = kVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            boolean c = com.amazon.aps.iva.aq.k.n(requireContext).c();
            com.amazon.aps.iva.dj.f.a.getClass();
            com.amazon.aps.iva.tl.e eVar = f.a.b.d;
            p pVar = com.amazon.aps.iva.cj.n.f;
            if (pVar != null) {
                com.amazon.aps.iva.tl.b b = pVar.b();
                com.amazon.aps.iva.cj.k kVar2 = com.amazon.aps.iva.cj.n.d;
                if (kVar2 != null) {
                    com.amazon.aps.iva.dh.c d = kVar2.d();
                    w wVar = new w();
                    com.amazon.aps.iva.yb0.j.f(eVar, "analytics");
                    com.amazon.aps.iva.yb0.j.f(b, "playerSettingsMonitor");
                    com.amazon.aps.iva.yb0.j.f(d, "inAppReviewEligibilityEventHandler");
                    return new m(d, b, eVar, kVar, wVar, c);
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("feature");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.tl.o
    public final void O() {
        EditText editText = fi().getBinding().b;
        com.amazon.aps.iva.yb0.j.e(editText, "reportProblemButton.binding.problemDescription");
        ((com.amazon.aps.iva.ty.b) this.h.getValue()).b(editText);
        Fragment parentFragment = getParentFragment();
        com.amazon.aps.iva.yb0.j.d(parentFragment, "null cannot be cast to non-null type com.crunchyroll.player.settings.PlayerSettingsFragment");
        ((com.amazon.aps.iva.ll.c) parentFragment).hi().s2();
    }

    @Override // com.amazon.aps.iva.tl.o
    public final void Tf() {
        EditText editText = fi().getBinding().b;
        com.amazon.aps.iva.yb0.j.e(editText, "reportProblemButton.binding.problemDescription");
        ((com.amazon.aps.iva.ty.b) this.h.getValue()).b(editText);
        Fragment parentFragment = getParentFragment();
        com.amazon.aps.iva.yb0.j.d(parentFragment, "null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
        ((androidx.fragment.app.g) parentFragment).dismiss();
    }

    @Override // com.amazon.aps.iva.tl.o
    public final void We() {
        fi().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.tl.o
    public final void cb(List<? extends com.amazon.aps.iva.vl.a> list) {
        com.amazon.aps.iva.yb0.j.f(list, "options");
        ei().b(list, new b());
    }

    public final l di() {
        return (l) this.i.getValue();
    }

    @Override // com.amazon.aps.iva.tl.o
    public final String eh() {
        String string = requireContext().getString(ua().getTitleResId());
        com.amazon.aps.iva.yb0.j.e(string, "requireContext().getStri…electedOption.titleResId)");
        return string;
    }

    public final PlayerSettingsRadioGroup<com.amazon.aps.iva.vl.a> ei() {
        return (PlayerSettingsRadioGroup) this.e.getValue(this, l[0]);
    }

    public final ReportProblemButton fi() {
        return (ReportProblemButton) this.f.getValue(this, l[1]);
    }

    @Override // com.amazon.aps.iva.ll.a
    public final boolean getCanGoBack() {
        return di().a();
    }

    @Override // com.amazon.aps.iva.tl.o
    public final String getProblemDescription() {
        return fi().getProblemDescription();
    }

    @Override // com.amazon.aps.iva.ll.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_report_a_problem_player_settings, viewGroup, false);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View view = getView();
        if (view != null) {
            view.removeOnLayoutChangeListener(this.j);
        }
        super.onDestroyView();
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        ei().setOnCheckedChangeListener(new d(di()));
        ReportProblemButton fi = fi();
        l di = di();
        fi.getClass();
        com.amazon.aps.iva.yb0.j.f(di, "reportProblemButtonListener");
        fi.d = di;
        com.amazon.aps.iva.mj.e eVar = fi.b;
        eVar.c.setOnClickListener(new com.amazon.aps.iva.c8.j(fi, 5));
        EditText editText = eVar.b;
        com.amazon.aps.iva.yb0.j.e(editText, "binding.problemDescription");
        editText.addTextChangedListener(new com.amazon.aps.iva.ul.a(fi));
        view.addOnLayoutChangeListener(this.j);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<l> setupPresenters() {
        return l1.H(di());
    }

    @Override // com.amazon.aps.iva.tl.o
    public final com.amazon.aps.iva.vl.a ua() {
        return ei().getCheckedOption();
    }

    @Override // com.amazon.aps.iva.tl.o
    public final void x() {
        EditText editText = fi().getBinding().b;
        com.amazon.aps.iva.yb0.j.e(editText, "reportProblemButton.binding.problemDescription");
        ((com.amazon.aps.iva.ty.b) this.h.getValue()).b(editText);
        Fragment parentFragment = getParentFragment();
        com.amazon.aps.iva.yb0.j.d(parentFragment, "null cannot be cast to non-null type com.crunchyroll.player.settings.PlayerSettingsFragment");
        ((com.amazon.aps.iva.ll.c) parentFragment).x();
    }

    @Override // com.amazon.aps.iva.tl.o
    public final void xd(boolean z) {
        fi().U2(z);
    }

    @Override // com.amazon.aps.iva.tl.o
    public final void ya() {
        new MaterialAlertDialogBuilder(requireContext()).setMessage(R.string.discard_report).setNegativeButton(R.string.discard, (DialogInterface.OnClickListener) new j(this, 0)).setPositiveButton(R.string.keep_writing, (DialogInterface.OnClickListener) null).show();
    }
}
