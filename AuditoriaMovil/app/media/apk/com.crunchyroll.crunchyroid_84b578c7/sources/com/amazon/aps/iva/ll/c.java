package com.amazon.aps.iva.ll;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ll.c;
import com.amazon.aps.iva.sl.m;
import com.amazon.aps.iva.tl.f;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.xw.v;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.settings.SelectableTitlePreference;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: PlayerSettingsFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/aps/iva/ll/c;", "Lcom/amazon/aps/iva/wy/f;", "Lcom/amazon/aps/iva/ll/m;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "<init>", "()V", "a", "player_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.f implements m, SharedPreferences.OnSharedPreferenceChangeListener {
    public final v k = com.amazon.aps.iva.xw.g.f(this, R.id.toolbar);
    public final v l = com.amazon.aps.iva.xw.g.f(this, R.id.player_settings_navigation_button);
    public final v m = com.amazon.aps.iva.xw.g.f(this, R.id.player_settings_title);
    public final v n = com.amazon.aps.iva.xw.g.f(this, 16908351);
    public final com.amazon.aps.iva.kb0.m o = com.amazon.aps.iva.kb0.f.b(new C0489c());
    public final com.amazon.aps.iva.kb0.m p = com.amazon.aps.iva.kb0.f.b(new b());
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] r = {com.amazon.aps.iva.k.q.a(c.class, "toolbar", "getToolbar()Landroid/view/View;", 0), com.amazon.aps.iva.k.q.a(c.class, "navigationButton", "getNavigationButton()Landroid/view/View;", 0), com.amazon.aps.iva.k.q.a(c.class, "title", "getTitle()Landroid/widget/TextView;", 0), com.amazon.aps.iva.k.q.a(c.class, "settingsList", "getSettingsList()Landroid/view/View;", 0)};
    public static final a q = new a();

    /* compiled from: PlayerSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: PlayerSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            c cVar = c.this;
            Context requireContext = cVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            boolean c = com.amazon.aps.iva.aq.k.n(requireContext).c();
            androidx.fragment.app.h requireActivity = cVar.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "fragment.requireActivity()");
            e eVar = (e) com.amazon.aps.iva.ez.l.a(requireActivity, f.class, d.h);
            androidx.fragment.app.h requireActivity2 = cVar.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity2, "fragment.requireActivity()");
            o oVar = (o) com.amazon.aps.iva.ez.l.a(requireActivity2, q.class, new n(cVar, requireActivity2));
            Context requireContext2 = cVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext2, "requireContext()");
            return new i(cVar, c, eVar, oVar, new com.amazon.aps.iva.jh.h(requireContext2));
        }
    }

    /* compiled from: PlayerSettingsFragment.kt */
    /* renamed from: com.amazon.aps.iva.ll.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0489c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.sl.m> {
        public C0489c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.sl.m invoke() {
            Context requireContext = c.this.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            return m.a.a(requireContext);
        }
    }

    public static l ii(Resources resources, String str) {
        l[] values;
        for (l lVar : l.values()) {
            if (com.amazon.aps.iva.yb0.j.a(resources.getString(lVar.getKeyId()), str)) {
                return lVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void Cf(int i) {
        ((TextView) this.m.getValue(this, r[2])).setText(i);
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void Da() {
        ((View) this.n.getValue(this, r[3])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void M2() {
        f.a aVar = com.amazon.aps.iva.tl.f.d;
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "requireActivity().supportFragmentManager");
        aVar.getClass();
        new com.amazon.aps.iva.tl.f().show(supportFragmentManager, "player_settings");
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void Oe() {
        ((TextView) this.m.getValue(this, r[2])).setText(R.string.playback_settings);
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void Q(boolean z) {
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) G4(getString(R.string.key_auto_play));
        if (switchPreferenceCompat != null) {
            switchPreferenceCompat.B(z);
        }
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void Q2() {
        Fragment parentFragment = getParentFragment();
        com.amazon.aps.iva.yb0.j.d(parentFragment, "null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
        ((androidx.fragment.app.g) parentFragment).dismiss();
    }

    @Override // com.amazon.aps.iva.ll.m
    public final int S6() {
        return getChildFragmentManager().D();
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void T() {
        ((View) this.k.getValue(this, r[0])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void U() {
        ((View) this.k.getValue(this, r[0])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void c0() {
        androidx.preference.e.a(requireContext()).unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // androidx.preference.b
    public final void ci(String str) {
        gi(R.xml.player_settings, str);
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void d0() {
        androidx.preference.e.a(requireContext()).registerOnSharedPreferenceChangeListener(this);
    }

    @Override // androidx.preference.b
    public final RecyclerView di(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        RecyclerView di = super.di(layoutInflater, viewGroup, bundle);
        di.setItemAnimator(null);
        di.setLayoutAnimation(null);
        return di;
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void h8(l lVar) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        com.amazon.aps.iva.yb0.j.e(childFragmentManager, "childFragmentManager");
        Fragment fragment = lVar.getFragment();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
        aVar.e(R.id.secondary_content, fragment, null);
        aVar.c(null);
        aVar.h();
    }

    public final h hi() {
        return (h) this.p.getValue();
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void n8() {
        ((View) this.n.getValue(this, r[3])).setVisibility(8);
    }

    @Override // androidx.preference.b, androidx.preference.e.c
    public final boolean nf(Preference preference) {
        com.amazon.aps.iva.yb0.j.f(preference, "preference");
        h hi = hi();
        Resources resources = getResources();
        com.amazon.aps.iva.yb0.j.e(resources, "resources");
        String str = preference.m;
        com.amazon.aps.iva.yb0.j.e(str, "preference.key");
        hi.u4(ii(resources, str));
        return super.nf(preference);
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void oc(com.amazon.aps.iva.sl.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "videoQuality");
        SelectableTitlePreference selectableTitlePreference = (SelectableTitlePreference) G4(getString(R.string.key_quality));
        if (selectableTitlePreference != null) {
            CharSequence a2 = ((com.amazon.aps.iva.sl.m) this.o.getValue()).a(gVar);
            selectableTitlePreference.R = a2;
            TextView textView = selectableTitlePreference.P;
            if (textView != null) {
                textView.setText(a2);
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Preference G4;
        if (str != null && (G4 = G4(str)) != null) {
            h hi = hi();
            Resources resources = getResources();
            com.amazon.aps.iva.yb0.j.e(resources, "resources");
            hi.l3(G4, ii(resources, str));
        }
    }

    @Override // com.amazon.aps.iva.wy.f, androidx.preference.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        ((View) this.l.getValue(this, r[1])).setOnClickListener(new com.amazon.aps.iva.c8.h(this, 6));
        final FragmentManager childFragmentManager = getChildFragmentManager();
        com.amazon.aps.iva.yb0.j.e(childFragmentManager, "childFragmentManager");
        FragmentManager.o oVar = new FragmentManager.o() { // from class: com.amazon.aps.iva.ll.b
            @Override // androidx.fragment.app.FragmentManager.o
            public final void a() {
                c.a aVar = c.q;
                c cVar = c.this;
                com.amazon.aps.iva.yb0.j.f(cVar, "this$0");
                FragmentManager fragmentManager = childFragmentManager;
                com.amazon.aps.iva.yb0.j.f(fragmentManager, "$fragmentManager");
                cVar.hi().Z2(fragmentManager.D());
            }
        };
        if (childFragmentManager.m == null) {
            childFragmentManager.m = new ArrayList<>();
        }
        childFragmentManager.m.add(oVar);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.player_settings_list_padding_vertical);
        RecyclerView recyclerView = this.d;
        com.amazon.aps.iva.yb0.j.e(recyclerView, "listView");
        t0.j(recyclerView, null, Integer.valueOf(dimensionPixelSize), null, Integer.valueOf(dimensionPixelSize), 5);
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void pe(boolean z) {
        Preference G4 = G4(getString(R.string.key_quality));
        if (G4 != null) {
            G4.y(z);
        }
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void rd(CharSequence charSequence) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "title");
        SelectableTitlePreference selectableTitlePreference = (SelectableTitlePreference) G4(getString(R.string.key_subtitles));
        if (selectableTitlePreference != null) {
            selectableTitlePreference.R = charSequence;
            TextView textView = selectableTitlePreference.P;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    @Override // com.amazon.aps.iva.ll.m
    public final boolean sd() {
        com.amazon.aps.iva.ll.a aVar;
        Fragment B = getChildFragmentManager().B(16908351);
        if (B instanceof com.amazon.aps.iva.ll.a) {
            aVar = (com.amazon.aps.iva.ll.a) B;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar.getCanGoBack();
        }
        return true;
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<h> setupPresenters() {
        return l1.H(hi());
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void t7(boolean z) {
        Preference G4 = G4(getString(R.string.key_audio));
        if (G4 != null) {
            G4.y(z);
        }
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void u2(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "audioLanguage");
        SelectableTitlePreference selectableTitlePreference = (SelectableTitlePreference) G4(getString(R.string.key_audio));
        if (selectableTitlePreference != null) {
            selectableTitlePreference.R = str;
            TextView textView = selectableTitlePreference.P;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    @Override // com.amazon.aps.iva.ll.m
    public final void x() {
        getChildFragmentManager().O();
    }
}
