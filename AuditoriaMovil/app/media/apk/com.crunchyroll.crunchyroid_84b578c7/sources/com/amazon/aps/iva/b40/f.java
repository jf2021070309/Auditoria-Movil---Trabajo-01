package com.amazon.aps.iva.b40;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.lifecycle.p;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.crunchyroll.crunchyroid.R;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SettingsDoNotSellFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/b40/f;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/b40/i;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qy.a implements i {
    public com.amazon.aps.iva.b40.b c;
    public final com.amazon.aps.iva.ez.f d = new com.amazon.aps.iva.ez.f(this, k.class, new b());
    public final m e = com.amazon.aps.iva.kb0.f.b(new d());
    public static final /* synthetic */ l<Object>[] g = {q.a(f.class, "doNotSellMyInfoViewModel", "getDoNotSellMyInfoViewModel()Lcom/ellation/crunchyroll/presentation/settings/donotsell/SettingsDoNotSellViewModelImpl;", 0)};
    public static final a f = new a();

    /* compiled from: SettingsDoNotSellFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: SettingsDoNotSellFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, k> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final k invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            Context requireContext = f.this.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            return new k(new com.amazon.aps.iva.w50.b(requireContext));
        }
    }

    /* compiled from: SettingsDoNotSellFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public c(g gVar) {
            super(1, gVar, g.class, "onDoNotSellClick", "onDoNotSellClick(Z)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            ((g) this.receiver).K5(bool.booleanValue());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SettingsDoNotSellFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<g> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final g invoke() {
            a aVar = f.f;
            f fVar = f.this;
            fVar.getClass();
            return new h(fVar, (k) fVar.d.getValue(fVar, f.g[0]));
        }
    }

    @Override // com.amazon.aps.iva.b40.i
    public final void b0() {
        new MaterialAlertDialogBuilder(requireContext()).setTitle(R.string.do_not_sell_confirmation_dialog_header).setMessage(R.string.do_not_sell_confirmation_dialog_supporting_text).setPositiveButton(R.string.do_not_sell_confirmation_dialog_confirm, (DialogInterface.OnClickListener) new com.amazon.aps.iva.c10.a(this, 1)).setNegativeButton(R.string.do_not_sell_confirmation_dialog_cancel, (DialogInterface.OnClickListener) new e(0)).show();
    }

    @Override // com.amazon.aps.iva.b40.i
    public final void k6(boolean z) {
        com.amazon.aps.iva.b40.b bVar = this.c;
        if (bVar != null) {
            bVar.setChecked(z);
        } else {
            com.amazon.aps.iva.yb0.j.m("doNotSellSwitch");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_do_not_sell, viewGroup, false);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        CompoundButton compoundButton = (CompoundButton) view.findViewById(R.id.settings_do_not_sell_switch);
        com.amazon.aps.iva.yb0.j.e(compoundButton, "switch");
        com.amazon.aps.iva.b40.b bVar = new com.amazon.aps.iva.b40.b(compoundButton);
        this.c = bVar;
        compoundButton.setOnTouchListener(new com.amazon.aps.iva.b40.a(new c((g) this.e.getValue()), bVar));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((g) this.e.getValue());
    }
}
