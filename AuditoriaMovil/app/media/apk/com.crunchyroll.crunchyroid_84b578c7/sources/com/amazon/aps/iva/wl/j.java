package com.amazon.aps.iva.wl;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.xw.v;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.player.settings.PlayerSettingsRadioGroup;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SubtitlesSettingsFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/wl/j;", "Lcom/amazon/aps/iva/ll/a;", "Lcom/amazon/aps/iva/wl/m;", "<init>", "()V", "a", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class j extends com.amazon.aps.iva.ll.a implements m {
    public final v e = com.amazon.aps.iva.xw.g.f(this, R.id.radio_group);
    public final com.amazon.aps.iva.kb0.m f = com.amazon.aps.iva.kb0.f.b(new e());
    public final com.amazon.aps.iva.kb0.m g = com.amazon.aps.iva.kb0.f.b(new c());
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] i = {com.amazon.aps.iva.k.q.a(j.class, "radioGroup", "getRadioGroup()Lcom/crunchyroll/player/settings/PlayerSettingsRadioGroup;", 0)};
    public static final a h = new a();

    /* compiled from: SubtitlesSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: SubtitlesSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.jh.f, com.amazon.aps.iva.kb0.q> {
        public b(k kVar) {
            super(1, kVar, k.class, "onSubtitlesOptionSelected", "onSubtitlesOptionSelected(Lcom/crunchyroll/languageoptions/LanguageOption;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.jh.f fVar) {
            com.amazon.aps.iva.jh.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "p0");
            ((k) this.receiver).U5(fVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SubtitlesSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<k> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final k invoke() {
            j jVar = j.this;
            o oVar = (o) jVar.f.getValue();
            Context requireContext = jVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            com.amazon.aps.iva.jh.h hVar = new com.amazon.aps.iva.jh.h(requireContext);
            com.amazon.aps.iva.yb0.j.f(oVar, "subtitlesSettingsViewModel");
            return new l(jVar, oVar, hVar);
        }
    }

    /* compiled from: SubtitlesSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.jh.f, CharSequence> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(com.amazon.aps.iva.jh.f fVar) {
            com.amazon.aps.iva.jh.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$showOptions");
            a aVar = j.h;
            return ((k) j.this.g.getValue()).L5(fVar2);
        }
    }

    /* compiled from: SubtitlesSettingsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<o> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final o invoke() {
            int i = o.r0;
            j jVar = j.this;
            com.amazon.aps.iva.yb0.j.f(jVar, "fragment");
            androidx.fragment.app.h requireActivity = jVar.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "fragment.requireActivity()");
            return (o) com.amazon.aps.iva.ez.l.a(requireActivity, q.class, new n(jVar));
        }
    }

    @Override // com.amazon.aps.iva.wl.m
    public final void O() {
        Fragment parentFragment = getParentFragment();
        com.amazon.aps.iva.yb0.j.d(parentFragment, "null cannot be cast to non-null type com.crunchyroll.player.settings.PlayerSettingsFragment");
        ((com.amazon.aps.iva.ll.c) parentFragment).hi().s2();
    }

    @Override // com.amazon.aps.iva.wl.m
    public final void e4(com.amazon.aps.iva.jh.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "subtitles");
        ((PlayerSettingsRadioGroup) this.e.getValue(this, i[0])).a(fVar);
    }

    @Override // com.amazon.aps.iva.wl.m
    public final void e7(List<? extends com.amazon.aps.iva.jh.f> list) {
        com.amazon.aps.iva.yb0.j.f(list, "subtitles");
        ((PlayerSettingsRadioGroup) this.e.getValue(this, i[0])).b(list, new d());
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        ((PlayerSettingsRadioGroup) this.e.getValue(this, i[0])).setOnCheckedChangeListener(new b((k) this.g.getValue()));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((k) this.g.getValue());
    }
}
