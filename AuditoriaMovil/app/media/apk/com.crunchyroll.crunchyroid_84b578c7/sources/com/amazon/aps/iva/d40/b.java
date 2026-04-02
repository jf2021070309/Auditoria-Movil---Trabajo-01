package com.amazon.aps.iva.d40;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.y30.e0;
import com.amazon.aps.iva.y30.h;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: MaturityRestrictionsSettingsFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/iva/d40/b;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/d40/e;", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.qy.a implements e {
    public com.amazon.aps.iva.p70.b<com.amazon.aps.iva.d40.a> c;
    public final m d = com.amazon.aps.iva.kb0.f.b(new C0192b());

    /* compiled from: MaturityRestrictionsSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends i implements l<com.amazon.aps.iva.d40.a, q> {
        public a(c cVar) {
            super(1, cVar, c.class, "onMaturityRestrictionSelected", "onMaturityRestrictionSelected(Lcom/ellation/crunchyroll/presentation/settings/maturityrestrictions/MaturityRestrictionOption;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.d40.a aVar) {
            com.amazon.aps.iva.d40.a aVar2 = aVar;
            j.f(aVar2, "p0");
            ((c) this.receiver).O5(aVar2);
            return q.a;
        }
    }

    /* compiled from: MaturityRestrictionsSettingsFragment.kt */
    /* renamed from: com.amazon.aps.iva.d40.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0192b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<c> {
        public C0192b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final c invoke() {
            b bVar = b.this;
            Context context = bVar.getContext();
            j.d(context, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.settings.SettingsModule.Provider");
            g b = ((e0.a) context).mh().b();
            com.amazon.aps.iva.y30.i a = h.a.a(null, 7);
            j.f(b, "viewModel");
            return new d(bVar, b, a);
        }
    }

    @Override // com.amazon.aps.iva.d40.e
    public final void a3(List<? extends com.amazon.aps.iva.d40.a> list) {
        j.f(list, "options");
        com.amazon.aps.iva.p70.b<com.amazon.aps.iva.d40.a> bVar = this.c;
        if (bVar != null) {
            int i = com.amazon.aps.iva.p70.b.d;
            bVar.a(list, null);
            return;
        }
        j.m("maturityRestrictionRadioGroup");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_settings_maturity_restrictions, viewGroup, false);
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        com.amazon.aps.iva.p70.b<com.amazon.aps.iva.d40.a> bVar = new com.amazon.aps.iva.p70.b<>(requireContext);
        bVar.setOnCheckedChangeListener(new a((c) this.d.getValue()));
        this.c = bVar;
        ((LinearLayout) inflate.findViewById(R.id.maturity_restrictions_container)).addView(bVar);
        return inflate;
    }

    @Override // com.amazon.aps.iva.d40.e
    public final void s8(com.amazon.aps.iva.d40.a aVar) {
        j.f(aVar, "option");
        com.amazon.aps.iva.p70.b<com.amazon.aps.iva.d40.a> bVar = this.c;
        if (bVar != null) {
            bVar.b(aVar);
        } else {
            j.m("maturityRestrictionRadioGroup");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<c> setupPresenters() {
        return l1.H((c) this.d.getValue());
    }
}
