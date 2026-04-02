package com.amazon.aps.iva.sl;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.ll.o;
import com.amazon.aps.iva.sl.m;
import com.amazon.aps.iva.xw.v;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.player.settings.PlayerSettingsRadioGroup;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: QualitySettingsFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/sl/h;", "Lcom/amazon/aps/iva/ll/a;", "Lcom/amazon/aps/iva/sl/k;", "<init>", "()V", "a", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.ll.a implements k {
    public final v e = com.amazon.aps.iva.xw.g.f(this, R.id.radio_group);
    public final com.amazon.aps.iva.kb0.m f = com.amazon.aps.iva.kb0.f.b(new b());
    public final com.amazon.aps.iva.kb0.m g = com.amazon.aps.iva.kb0.f.b(new d());
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] i = {q.a(h.class, "radioGroup", "getRadioGroup()Lcom/crunchyroll/player/settings/PlayerSettingsRadioGroup;", 0)};
    public static final a h = new a();

    /* compiled from: QualitySettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: QualitySettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<m> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final m invoke() {
            Context requireContext = h.this.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            return m.a.a(requireContext);
        }
    }

    /* compiled from: QualitySettingsFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<g, com.amazon.aps.iva.kb0.q> {
        public c(i iVar) {
            super(1, iVar, i.class, "onQualityOptionSelected", "onQualityOptionSelected(Lcom/crunchyroll/player/settings/quality/QualitySetting;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(g gVar) {
            g gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "p0");
            ((i) this.receiver).c6(gVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: QualitySettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<i> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final i invoke() {
            h hVar = h.this;
            com.amazon.aps.iva.yb0.j.f(hVar, "fragment");
            androidx.fragment.app.h requireActivity = hVar.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "fragment.requireActivity()");
            return new j(hVar, (o) com.amazon.aps.iva.ez.l.a(requireActivity, com.amazon.aps.iva.ll.q.class, new com.amazon.aps.iva.ll.n(hVar, requireActivity)));
        }
    }

    /* compiled from: QualitySettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g, CharSequence> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(g gVar) {
            g gVar2 = gVar;
            com.amazon.aps.iva.yb0.j.f(gVar2, "$this$showOptions");
            return ((m) h.this.f.getValue()).a(gVar2);
        }
    }

    @Override // com.amazon.aps.iva.sl.k
    public final void O() {
        Fragment parentFragment = getParentFragment();
        com.amazon.aps.iva.yb0.j.d(parentFragment, "null cannot be cast to non-null type com.crunchyroll.player.settings.PlayerSettingsFragment");
        ((com.amazon.aps.iva.ll.c) parentFragment).hi().s2();
    }

    @Override // com.amazon.aps.iva.sl.k
    public final void Yh(g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "quality");
        ((PlayerSettingsRadioGroup) this.e.getValue(this, i[0])).a(gVar);
    }

    @Override // com.amazon.aps.iva.sl.k
    public final void gf(List<g> list) {
        com.amazon.aps.iva.yb0.j.f(list, "qualities");
        ((PlayerSettingsRadioGroup) this.e.getValue(this, i[0])).b(list, new e());
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        ((PlayerSettingsRadioGroup) this.e.getValue(this, i[0])).setOnCheckedChangeListener(new c((i) this.g.getValue()));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((i) this.g.getValue());
    }
}
