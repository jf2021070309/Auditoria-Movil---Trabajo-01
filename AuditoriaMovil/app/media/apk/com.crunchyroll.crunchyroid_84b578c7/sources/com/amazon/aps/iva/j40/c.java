package com.amazon.aps.iva.j40;

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
import com.amazon.aps.iva.y30.n0;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SyncQualitySettingsFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/iva/j40/c;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/j40/f;", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.qy.a implements f {
    public com.amazon.aps.iva.p70.b<com.amazon.aps.iva.wg.b> c;
    public final m d = com.amazon.aps.iva.kb0.f.b(new b());

    /* compiled from: SyncQualitySettingsFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends i implements l<com.amazon.aps.iva.wg.b, q> {
        public a(d dVar) {
            super(1, dVar, d.class, "onSyncQualitySelected", "onSyncQualitySelected(Lcom/crunchyroll/downloading/syncquality/SyncQualityOption;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.wg.b bVar) {
            com.amazon.aps.iva.wg.b bVar2 = bVar;
            j.f(bVar2, "p0");
            ((d) this.receiver).P4(bVar2);
            return q.a;
        }
    }

    /* compiled from: SyncQualitySettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<d> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final d invoke() {
            c cVar = c.this;
            Context context = cVar.getContext();
            j.d(context, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.settings.SettingsModule.Provider");
            n0 c = ((e0.a) context).mh().c();
            com.amazon.aps.iva.y30.i a = h.a.a(null, 7);
            Context requireContext = cVar.requireContext();
            j.e(requireContext, "requireContext()");
            com.amazon.aps.iva.j40.b bVar = new com.amazon.aps.iva.j40.b(requireContext);
            j.f(c, "settingsViewModel");
            return new e(cVar, c, a, bVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_settings_sync_quality, viewGroup, false);
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        com.amazon.aps.iva.p70.b<com.amazon.aps.iva.wg.b> bVar = new com.amazon.aps.iva.p70.b<>(requireContext);
        bVar.setOnCheckedChangeListener(new a((d) this.d.getValue()));
        this.c = bVar;
        ((LinearLayout) inflate.findViewById(R.id.sync_quality_container)).addView(bVar);
        return inflate;
    }

    @Override // com.amazon.aps.iva.j40.f
    public final void p9(com.amazon.aps.iva.wg.b bVar) {
        j.f(bVar, "option");
        com.amazon.aps.iva.p70.b<com.amazon.aps.iva.wg.b> bVar2 = this.c;
        if (bVar2 != null) {
            bVar2.b(bVar);
        } else {
            j.m("syncQualityOptions");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.j40.f
    public final void pg(List<? extends com.amazon.aps.iva.wg.b> list) {
        j.f(list, "options");
        com.amazon.aps.iva.p70.b<com.amazon.aps.iva.wg.b> bVar = this.c;
        if (bVar != null) {
            int i = com.amazon.aps.iva.p70.b.d;
            bVar.a(list, null);
            return;
        }
        j.m("syncQualityOptions");
        throw null;
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<d> setupPresenters() {
        return l1.H((d) this.d.getValue());
    }
}
