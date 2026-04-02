package com.amazon.aps.iva.nl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.e4.l1;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: AudioSettingsFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/iva/nl/e;", "Lcom/amazon/aps/iva/ll/a;", "Lcom/amazon/aps/iva/nl/o;", "<init>", "()V", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.ll.a implements o {
    public final com.amazon.aps.iva.kb0.m e = com.amazon.aps.iva.kb0.f.b(new b());
    public final com.amazon.aps.iva.kb0.m f = com.amazon.aps.iva.kb0.f.b(new a());

    /* compiled from: AudioSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<l> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final l invoke() {
            e eVar = e.this;
            q qVar = (q) eVar.e.getValue();
            com.amazon.aps.iva.yb0.j.f(qVar, "viewModel");
            return new m(qVar, eVar);
        }
    }

    /* compiled from: AudioSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            int i = q.e0;
            androidx.fragment.app.h requireActivity = e.this.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
            return (q) com.amazon.aps.iva.ez.l.a(requireActivity, u.class, new p(requireActivity));
        }
    }

    @Override // com.amazon.aps.iva.nl.o
    public final void closeScreen() {
        Fragment parentFragment = getParentFragment();
        com.amazon.aps.iva.yb0.j.d(parentFragment, "null cannot be cast to non-null type com.crunchyroll.player.settings.PlayerSettingsFragment");
        ((com.amazon.aps.iva.ll.c) parentFragment).hi().s2();
    }

    @Override // com.amazon.aps.iva.ll.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return com.amazon.aps.iva.xw.t.a(this, com.amazon.aps.iva.v0.b.c(1378235934, new d(this), true));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((l) this.f.getValue());
    }
}
