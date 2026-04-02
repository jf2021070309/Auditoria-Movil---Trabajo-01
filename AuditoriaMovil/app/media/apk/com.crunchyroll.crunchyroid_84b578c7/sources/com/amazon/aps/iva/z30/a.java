package com.amazon.aps.iva.z30;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.h;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.gy.t;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.y30.e0;
import com.amazon.aps.iva.y30.n0;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.player.settings.PlayerSettingsRadioGroup;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: AudioLanguageSettingsFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/z30/a;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/z30/d;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.qy.a implements com.amazon.aps.iva.z30.d {
    public final v c = g.f(this, R.id.radio_group);
    public final m d = f.b(new e());
    public final m e = f.b(new c());
    public static final /* synthetic */ l<Object>[] g = {q.a(a.class, "radioGroup", "getRadioGroup()Lcom/crunchyroll/player/settings/PlayerSettingsRadioGroup;", 0)};
    public static final C0910a f = new C0910a();

    /* compiled from: AudioLanguageSettingsFragment.kt */
    /* renamed from: com.amazon.aps.iva.z30.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0910a {
    }

    /* compiled from: AudioLanguageSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.jh.f, com.amazon.aps.iva.kb0.q> {
        public b(com.amazon.aps.iva.z30.b bVar) {
            super(1, bVar, com.amazon.aps.iva.z30.b.class, "onOptionSelected", "onOptionSelected(Lcom/crunchyroll/languageoptions/LanguageOption;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.jh.f fVar) {
            com.amazon.aps.iva.jh.f fVar2 = fVar;
            j.f(fVar2, "p0");
            ((com.amazon.aps.iva.z30.b) this.receiver).s(fVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AudioLanguageSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.z30.b> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.z30.b invoke() {
            com.amazon.aps.iva.kh.d dVar = t.a;
            if (dVar != null) {
                a aVar = a.this;
                Context requireContext = aVar.requireContext();
                j.e(requireContext, "requireContext()");
                com.amazon.aps.iva.kh.f a = dVar.a(requireContext);
                h requireActivity = aVar.requireActivity();
                j.d(requireActivity, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.settings.SettingsModule.Provider");
                n0 c = ((e0.a) requireActivity).mh().c();
                j.f(c, "settingsViewModel");
                return new com.amazon.aps.iva.z30.c(aVar, a, c);
            }
            j.m("instance");
            throw null;
        }
    }

    /* compiled from: AudioLanguageSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.jh.f, CharSequence> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(com.amazon.aps.iva.jh.f fVar) {
            com.amazon.aps.iva.jh.f fVar2 = fVar;
            j.f(fVar2, "$this$showOptions");
            return ((com.amazon.aps.iva.jh.g) a.this.d.getValue()).b(fVar2);
        }
    }

    /* compiled from: AudioLanguageSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.jh.g> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.jh.g invoke() {
            int i = com.amazon.aps.iva.jh.g.a;
            Context requireContext = a.this.requireContext();
            j.e(requireContext, "requireContext()");
            return new com.amazon.aps.iva.jh.h(requireContext);
        }
    }

    @Override // com.amazon.aps.iva.z30.d
    public final void i0(com.amazon.aps.iva.jh.f fVar) {
        ((PlayerSettingsRadioGroup) this.c.getValue(this, g[0])).a(fVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_language_options, viewGroup, false);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        ((PlayerSettingsRadioGroup) this.c.getValue(this, g[0])).setOnCheckedChangeListener(new b((com.amazon.aps.iva.z30.b) this.e.getValue()));
    }

    @Override // com.amazon.aps.iva.z30.d
    public final void s2(List<? extends com.amazon.aps.iva.jh.f> list) {
        j.f(list, "subtitles");
        ((PlayerSettingsRadioGroup) this.c.getValue(this, g[0])).b(list, new d());
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H((com.amazon.aps.iva.z30.b) this.e.getValue());
    }
}
