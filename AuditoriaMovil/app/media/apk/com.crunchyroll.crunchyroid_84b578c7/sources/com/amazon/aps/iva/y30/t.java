package com.amazon.aps.iva.y30;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fm.a;
import com.amazon.aps.iva.g70.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.p60.f;
import com.amazon.aps.iva.sv.h;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.y30.e0;
import com.amazon.aps.iva.y30.h;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
import com.ellation.crunchyroll.api.etp.assets.model.AssetType;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenProvider;
import com.ellation.crunchyroll.api.etp.subscription.model.Benefit;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.presentation.main.settings.SettingsBottomBarActivity;
import com.ellation.crunchyroll.presentation.settings.membership.preference.MembershipPlanPreference;
import com.ellation.crunchyroll.settings.SelectableTitlePreference;
import com.ellation.localization.preference.TranslatablePreferenceCategory;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SettingsListFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/y30/t;", "Lcom/amazon/aps/iva/sy/a;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Lcom/amazon/aps/iva/y30/d0;", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.sy.a implements d0 {
    public static final /* synthetic */ int l = 0;
    public final com.amazon.aps.iva.kb0.m k = com.amazon.aps.iva.kb0.f.b(new a());

    /* compiled from: SettingsListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<v> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final v invoke() {
            t tVar = t.this;
            Resources resources = tVar.getResources();
            com.amazon.aps.iva.yb0.j.e(resources, "this.resources");
            CrunchyrollApplication crunchyrollApplication = CrunchyrollApplication.m;
            RefreshTokenProvider refreshTokenProvider = CrunchyrollApplication.a.a().e().getRefreshTokenProvider();
            com.amazon.aps.iva.ys.p f = CrunchyrollApplication.a.a().f();
            com.amazon.aps.iva.yb0.j.f(refreshTokenProvider, "refreshTokenProvider");
            l lVar = new l(refreshTokenProvider, f);
            com.amazon.aps.iva.sv.h hVar = h.a.a;
            if (hVar != null) {
                com.amazon.aps.iva.sv.k c = hVar.c();
                com.amazon.aps.iva.bo.f d = com.ellation.crunchyroll.application.e.d();
                com.amazon.aps.iva.x50.a c2 = CrunchyrollApplication.a.a().c();
                i a = h.a.a(null, 7);
                androidx.fragment.app.h requireActivity = tVar.requireActivity();
                com.amazon.aps.iva.yb0.j.d(requireActivity, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.settings.SettingsModule.Provider");
                com.amazon.aps.iva.k40.d a2 = ((e0.a) requireActivity).mh().a();
                androidx.fragment.app.h requireActivity2 = tVar.requireActivity();
                com.amazon.aps.iva.yb0.j.d(requireActivity2, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.settings.SettingsModule.Provider");
                n0 c3 = ((e0.a) requireActivity2).mh().c();
                com.amazon.aps.iva.sv.h hVar2 = h.a.a;
                if (hVar2 != null) {
                    com.amazon.aps.iva.wg.a d2 = hVar2.d();
                    Context requireContext = tVar.requireContext();
                    com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
                    com.amazon.aps.iva.j40.b bVar = new com.amazon.aps.iva.j40.b(requireContext);
                    Context requireContext2 = tVar.requireContext();
                    com.amazon.aps.iva.yb0.j.e(requireContext2, "requireContext()");
                    com.amazon.aps.iva.lh.c cVar = com.amazon.aps.iva.lh.f.a;
                    if (cVar != null) {
                        com.amazon.aps.iva.lh.b bVar2 = new com.amazon.aps.iva.lh.b(cVar, new com.amazon.aps.iva.jh.h(com.amazon.aps.iva.o60.e.a(requireContext2)), f.a.a(requireContext2, GsonHolder.getInstance()));
                        com.amazon.aps.iva.kh.d dVar = com.amazon.aps.iva.gy.t.a;
                        if (dVar != null) {
                            Context requireContext3 = tVar.requireContext();
                            com.amazon.aps.iva.yb0.j.e(requireContext3, "requireContext()");
                            com.amazon.aps.iva.kh.f a3 = dVar.a(requireContext3);
                            p pVar = new p(tVar);
                            boolean m = ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).x.m();
                            Context requireContext4 = tVar.requireContext();
                            com.amazon.aps.iva.yb0.j.e(requireContext4, "requireContext()");
                            e eVar = new e(requireContext4);
                            q qVar = new q(com.amazon.aps.iva.cx.k.b);
                            r rVar = new r(com.amazon.aps.iva.cx.m.b);
                            com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
                            if (aVar != null) {
                                Object c4 = aVar.c().c(com.amazon.aps.iva.cx.a.class, "account_deletion");
                                if (c4 != null) {
                                    boolean b = ((com.amazon.aps.iva.cx.a) c4).b();
                                    androidx.fragment.app.h requireActivity3 = tVar.requireActivity();
                                    com.amazon.aps.iva.yb0.j.d(requireActivity3, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.settings.SettingsModule.Provider");
                                    com.amazon.aps.iva.d40.g b2 = ((e0.a) requireActivity3).mh().b();
                                    Context requireContext5 = tVar.requireContext();
                                    com.amazon.aps.iva.yb0.j.e(requireContext5, "requireContext()");
                                    com.ellation.crunchyroll.application.a aVar2 = a.C0959a.a;
                                    if (aVar2 != null) {
                                        Object c5 = aVar2.c().c(com.amazon.aps.iva.cx.t.class, "whatsapp_support");
                                        if (c5 != null) {
                                            com.amazon.aps.iva.qd.c cVar2 = new com.amazon.aps.iva.qd.c(requireContext5, (com.amazon.aps.iva.cx.t) c5);
                                            com.ellation.crunchyroll.application.a aVar3 = a.C0959a.a;
                                            if (aVar3 != null) {
                                                Object c6 = aVar3.c().c(com.amazon.aps.iva.ox.a.class, "lupin");
                                                if (c6 != null) {
                                                    boolean isEnabled = ((com.amazon.aps.iva.ox.a) c6).isEnabled();
                                                    List<Benefit> q = com.ellation.crunchyroll.application.f.a(null, 3).q();
                                                    com.ellation.crunchyroll.application.a aVar4 = a.C0959a.a;
                                                    if (aVar4 != null) {
                                                        Object c7 = aVar4.c().c(com.amazon.aps.iva.cx.d.class, "billing_notifications");
                                                        if (c7 != null) {
                                                            com.amazon.aps.iva.yb0.j.f(c, "downloadsAgent");
                                                            com.amazon.aps.iva.yb0.j.f(a2, "selectedHeaderViewModel");
                                                            com.amazon.aps.iva.yb0.j.f(c3, "settingsViewModel");
                                                            com.amazon.aps.iva.yb0.j.f(d2, "syncQualityInteractor");
                                                            o oVar = o.h;
                                                            com.amazon.aps.iva.yb0.j.f(oVar, "getHelpUrl");
                                                            u uVar = u.h;
                                                            com.amazon.aps.iva.yb0.j.f(uVar, "hasOfflineViewingBenefit");
                                                            com.amazon.aps.iva.yb0.j.f(q, "userBenefits");
                                                            s sVar = s.h;
                                                            com.amazon.aps.iva.yb0.j.f(sVar, "showParentalControls");
                                                            com.amazon.aps.iva.yb0.j.f(b2, "maturityRestrictionsViewModel");
                                                            return new w(tVar, resources, lVar, c, d, c2, a, a2, c3, d2, bVar, bVar2, a3, oVar, pVar, uVar, isEnabled, q, (com.amazon.aps.iva.cx.d) c7, m, eVar, qVar, rVar, sVar, b, b2, cVar2);
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.BillingNotificationsConfigImpl");
                                                    }
                                                    com.amazon.aps.iva.yb0.j.m("instance");
                                                    throw null;
                                                }
                                                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.profiles.LupinConfigImpl");
                                            }
                                            com.amazon.aps.iva.yb0.j.m("instance");
                                            throw null;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.WhatsAppHelpConfigImpl");
                                    }
                                    com.amazon.aps.iva.yb0.j.m("instance");
                                    throw null;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.AccountDeletionConfigImpl");
                            }
                            com.amazon.aps.iva.yb0.j.m("instance");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("instance");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("store");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("instance");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    /* compiled from: SettingsListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ ProfileApiModel h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ProfileApiModel profileApiModel) {
            super(2);
            this.h = profileApiModel;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = com.amazon.aps.iva.o0.e0.a;
                com.amazon.aps.iva.fm.a.a.getClass();
                com.amazon.aps.iva.fm.a a = a.C0253a.a();
                ProfileApiModel profileApiModel = this.h;
                String username = profileApiModel.getUsername();
                com.amazon.aps.iva.m30.a aVar = com.amazon.aps.iva.m30.a.c;
                String m = aVar.m(profileApiModel.getAvatar());
                String background = profileApiModel.getBackground();
                com.amazon.aps.iva.yb0.j.f(background, "assetId");
                AssetType assetType = AssetType.WALLPAPER;
                com.amazon.aps.iva.dn.c.a(new com.amazon.aps.iva.dn.e(username, m, aVar.b + "/" + assetType + "/1920x400/" + background, com.amazon.aps.iva.dn.d.AVATAR_CONTROL_ENABLED), a, null, null, null, iVar2, 64, 28);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static c ji(Resources resources, String str) {
        c[] values;
        for (c cVar : c.values()) {
            if (com.amazon.aps.iva.yb0.j.a(resources.getString(cVar.getKeyId()), str)) {
                return cVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void C2() {
        Preference G4 = G4(getString(R.string.key_category_offline_viewing));
        if (G4 != null) {
            G4.y(false);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void D4() {
        com.amazon.aps.iva.g70.g gVar = new com.amazon.aps.iva.g70.g(0, null, getString(R.string.dialog_action_is_unavailable), getString(R.string.dialog_customer_support), null, getString(R.string.cancel), 19);
        com.amazon.aps.iva.g70.f.e.getClass();
        f.a.a(gVar).show(getChildFragmentManager(), "action_dialog_tag");
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void E5(ProfileApiModel profileApiModel) {
        ComposeView composeView;
        com.amazon.aps.iva.yb0.j.f(profileApiModel, Scopes.PROFILE);
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.ox.a.class, "lupin");
            if (c != null) {
                if (((com.amazon.aps.iva.ox.a) c).isEnabled()) {
                    View view = getView();
                    if (view != null && (composeView = (ComposeView) view.findViewById(R.id.user_info)) != null) {
                        composeView.setContent(com.amazon.aps.iva.v0.b.c(752186729, new b(profileApiModel), true));
                        return;
                    }
                    return;
                }
                FragmentManager childFragmentManager = getChildFragmentManager();
                androidx.fragment.app.a a2 = defpackage.b.a(childFragmentManager, childFragmentManager);
                a2.d(R.id.user_info_legacy, new com.amazon.aps.iva.n30.a(), null, 1);
                a2.h();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.profiles.LupinConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void F3() {
        Preference G4 = G4(getString(R.string.key_account_deletion));
        if (G4 != null) {
            G4.y(false);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void Gd() {
        Preference G4 = G4(getString(R.string.key_whatsapp_help));
        if (G4 != null) {
            G4.y(true);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void Ha(c cVar, String str) {
        com.amazon.aps.iva.yb0.j.f(cVar, "preference");
        com.amazon.aps.iva.yb0.j.f(str, "summary");
        String string = getString(cVar.getKeyId());
        com.amazon.aps.iva.yb0.j.e(string, "getString(keyId)");
        Preference G4 = G4(string);
        if (G4 != null) {
            G4.x(str);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void I2() {
        Preference G4 = G4(getString(R.string.key_account_deletion));
        if (G4 != null) {
            G4.y(true);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void Kf() {
        Preference G4 = G4(getString(R.string.key_maturity_restrictions));
        if (G4 != null) {
            G4.y(false);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void L2() {
        Preference G4 = G4(getString(R.string.key_show_mature_content));
        if (G4 != null) {
            G4.y(true);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void La() {
        Preference G4 = G4(getString(R.string.key_change_password));
        if (G4 != null) {
            G4.y(false);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void N2() {
        ii().y(true);
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void Nd() {
        Preference G4 = G4(getString(R.string.key_show_mature_content));
        if (G4 != null) {
            G4.y(false);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void Ne() {
        ii().y(false);
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void O2(boolean z) {
        hi(R.string.key_switch_stream_over_cellular, z);
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void Q9() {
        Preference G4 = G4(getString(R.string.key_category_offline_viewing));
        if (G4 != null) {
            G4.y(true);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void R5() {
        Preference G4 = G4(getString(R.string.key_change_phone));
        if (G4 != null) {
            G4.y(true);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void Vd() {
        Preference G4 = G4(getString(R.string.key_maturity_restrictions));
        if (G4 != null) {
            G4.y(true);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void Vg() {
        Preference G4 = G4(getString(R.string.key_membership_card));
        com.amazon.aps.iva.yb0.j.d(G4, "null cannot be cast to non-null type com.ellation.crunchyroll.settings.SelectableTitlePreference");
        ((SelectableTitlePreference) G4).y(false);
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void X2() {
        Preference G4 = G4(getString(R.string.key_membership_card));
        com.amazon.aps.iva.yb0.j.d(G4, "null cannot be cast to non-null type com.ellation.crunchyroll.settings.SelectableTitlePreference");
        ((SelectableTitlePreference) G4).y(true);
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void Y4(boolean z) {
        hi(R.string.key_show_mature_content, z);
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void Z2() {
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) G4(getString(R.string.key_show_mature_content));
        if (switchPreferenceCompat != null && switchPreferenceCompat.q) {
            switchPreferenceCompat.q = false;
            switchPreferenceCompat.k(switchPreferenceCompat.z());
            switchPreferenceCompat.j();
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void Z3(boolean z) {
        hi(R.string.key_switch_sync_over_cellular, z);
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void ae(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "helpPageUrl");
        Context requireContext = requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
        com.amazon.aps.iva.k50.c cVar = new com.amazon.aps.iva.k50.c(requireContext, "");
        String string = getString(R.string.help_page_open_fallback_dialog_message);
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.help_…_fallback_dialog_message)");
        String string2 = getString(R.string.need_help);
        com.amazon.aps.iva.yb0.j.e(string2, "getString(R.string.need_help)");
        cVar.s1(str, string, string2);
    }

    @Override // androidx.preference.b
    public final void ci(String str) {
        ki().a1(str);
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void d9() {
        Context requireContext = requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
        com.amazon.aps.iva.k50.c cVar = new com.amazon.aps.iva.k50.c(requireContext, "");
        String string = getString(R.string.redeem_promo_code);
        String string2 = getString(R.string.redeem_promo_code_fallback_dialog_message, "https://play.google.com/redeem?code");
        com.amazon.aps.iva.yb0.j.e(string2, "getString(R.string.redee…back_dialog_message, url)");
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.redeem_promo_code)");
        cVar.s1("https://play.google.com/redeem?code", string2, string);
    }

    @Override // androidx.preference.b
    public final RecyclerView di(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        RecyclerView di = super.di(layoutInflater, viewGroup, bundle);
        di.setItemAnimator(null);
        di.setLayoutAnimation(null);
        return di;
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void gb(boolean z) {
        hi(R.string.key_show_closed_captions, z);
    }

    public final SelectableTitlePreference ii() {
        Preference G4 = G4(getString(R.string.key_persistent_message_center));
        com.amazon.aps.iva.yb0.j.d(G4, "null cannot be cast to non-null type com.ellation.crunchyroll.settings.SelectableTitlePreference");
        return (SelectableTitlePreference) G4;
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void j6() {
        Preference G4 = G4(getString(R.string.key_membership_plan));
        com.amazon.aps.iva.yb0.j.d(G4, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.settings.membership.preference.MembershipPlanPreference");
        MembershipPlanPreference membershipPlanPreference = (MembershipPlanPreference) G4;
        membershipPlanPreference.S = false;
        View view = membershipPlanPreference.T;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void kh() {
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) G4(getString(R.string.key_show_mature_content));
        if (switchPreferenceCompat != null && !switchPreferenceCompat.q) {
            switchPreferenceCompat.q = true;
            switchPreferenceCompat.k(switchPreferenceCompat.z());
            switchPreferenceCompat.j();
        }
    }

    public final v ki() {
        return (v) this.k.getValue();
    }

    public final void li(Preference preference) {
        c[] values;
        String str = preference.m;
        com.amazon.aps.iva.yb0.j.e(str, "preference.key");
        for (c cVar : c.values()) {
            if (com.amazon.aps.iva.yb0.j.a(getString(cVar.getKeyId()), preference.m)) {
                int resId = cVar.getResId();
                Preference G4 = G4(str);
                if (G4 != null) {
                    G4.h = resId;
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void m9(String str) {
        SpannableString spannableString = null;
        Float f = null;
        if (str != null) {
            SpannableString spannableString2 = new SpannableString(str);
            int color = com.amazon.aps.iva.d3.a.getColor(requireContext(), R.color.cr_red_orange);
            int color2 = com.amazon.aps.iva.d3.a.getColor(requireContext(), R.color.color_white);
            Context requireContext = requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            float b2 = com.amazon.aps.iva.xw.q.b(requireContext, 6.0f);
            Context requireContext2 = requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext2, "requireContext()");
            float b3 = com.amazon.aps.iva.xw.q.b(requireContext2, 2.0f);
            if (str.length() != 1) {
                Context requireContext3 = requireContext();
                com.amazon.aps.iva.yb0.j.e(requireContext3, "requireContext()");
                f = Float.valueOf(com.amazon.aps.iva.xw.q.b(requireContext3, 10.0f));
            }
            spannableString2.setSpan(new com.amazon.aps.iva.xw.g0(color, color2, b2, b3, f), 0, str.length(), 18);
            spannableString = spannableString2;
        }
        ii().x(spannableString);
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void me() {
        Preference G4 = G4(getString(R.string.key_change_phone));
        if (G4 != null) {
            G4.y(false);
        }
    }

    @Override // androidx.preference.b, androidx.preference.e.c
    public final boolean nf(Preference preference) {
        com.amazon.aps.iva.yb0.j.f(preference, "preference");
        v ki = ki();
        Resources resources = getResources();
        com.amazon.aps.iva.yb0.j.e(resources, "resources");
        String str = preference.m;
        com.amazon.aps.iva.yb0.j.e(str, "preference.key");
        ki.m5(ji(resources, str));
        return super.nf(preference);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Preference G4;
        if (str != null && (G4 = G4(str)) != null) {
            v ki = ki();
            Resources resources = getResources();
            com.amazon.aps.iva.yb0.j.e(resources, "resources");
            ki.I2(G4, ji(resources, str));
        }
    }

    @Override // com.amazon.aps.iva.wy.f, androidx.preference.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        float f;
        NestedScrollView nestedScrollView;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        PreferenceScreen preferenceScreen = this.c.g;
        com.amazon.aps.iva.yb0.j.e(preferenceScreen, "preferenceScreen");
        boolean z2 = false;
        com.amazon.aps.iva.ec0.j T = com.amazon.aps.iva.aq.j.T(0, preferenceScreen.D());
        ArrayList arrayList = new ArrayList();
        com.amazon.aps.iva.ec0.i it = T.iterator();
        while (it.d) {
            Preference C = preferenceScreen.C(it.b());
            if (C != null) {
                arrayList.add(C);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            CharSequence charSequence = ((Preference) next).i;
            if (charSequence != null && charSequence.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (true ^ z) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Preference preference = (Preference) it3.next();
            if (preference instanceof PreferenceCategory) {
                PreferenceCategory preferenceCategory = (PreferenceCategory) preference;
                com.amazon.aps.iva.ec0.i it4 = com.amazon.aps.iva.aq.j.T(0, preferenceCategory.D()).iterator();
                while (it4.d) {
                    Preference C2 = preferenceCategory.C(it4.b());
                    com.amazon.aps.iva.yb0.j.e(C2, "category.getPreference(it)");
                    li(C2);
                }
            } else {
                li(preference);
            }
        }
        getChildFragmentManager().b0("action_dialog_tag", this, new com.amazon.aps.iva.n4.v() { // from class: com.amazon.aps.iva.y30.m
            @Override // com.amazon.aps.iva.n4.v
            public final void i6(Bundle bundle2, String str) {
                int i = t.l;
                t tVar = t.this;
                com.amazon.aps.iva.yb0.j.f(tVar, "this$0");
                com.amazon.aps.iva.yb0.j.f(str, "<anonymous parameter 0>");
                if (bundle2.containsKey("positive_button_result")) {
                    tVar.ki().t();
                }
            }
        });
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        SettingsBottomBarActivity settingsBottomBarActivity = null;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.ox.a.class, "lupin");
            if (c != null) {
                if (((com.amazon.aps.iva.ox.a) c).isEnabled()) {
                    Context context = getContext();
                    if (context != null && com.amazon.aps.iva.aq.k.n(context).c()) {
                        z2 = true;
                    }
                    if (z2) {
                        f = 284.0f;
                    } else {
                        f = 211.0f;
                    }
                    final float applyDimension = TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
                    View view2 = getView();
                    if (view2 != null) {
                        nestedScrollView = (NestedScrollView) view2.findViewById(R.id.settings_scroll_view);
                    } else {
                        nestedScrollView = null;
                    }
                    if (nestedScrollView != null) {
                        nestedScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.amazon.aps.iva.y30.n
                            @Override // android.view.View.OnScrollChangeListener
                            public final void onScrollChange(View view3, int i, int i2, int i3, int i4) {
                                int i5 = t.l;
                                t tVar = this;
                                com.amazon.aps.iva.yb0.j.f(tVar, "this$0");
                                int i6 = (i2 > applyDimension ? 1 : (i2 == applyDimension ? 0 : -1));
                                SettingsBottomBarActivity settingsBottomBarActivity2 = null;
                                if (i6 > 0) {
                                    androidx.fragment.app.h activity = tVar.getActivity();
                                    if (activity instanceof SettingsBottomBarActivity) {
                                        settingsBottomBarActivity2 = (SettingsBottomBarActivity) activity;
                                    }
                                    if (settingsBottomBarActivity2 != null) {
                                        settingsBottomBarActivity2.ti().setVisibility(0);
                                        return;
                                    }
                                    return;
                                }
                                androidx.fragment.app.h activity2 = tVar.getActivity();
                                if (activity2 instanceof SettingsBottomBarActivity) {
                                    settingsBottomBarActivity2 = (SettingsBottomBarActivity) activity2;
                                }
                                if (settingsBottomBarActivity2 != null) {
                                    settingsBottomBarActivity2.ti().setVisibility(8);
                                }
                            }
                        });
                    }
                    androidx.fragment.app.h activity = getActivity();
                    if (activity instanceof SettingsBottomBarActivity) {
                        settingsBottomBarActivity = (SettingsBottomBarActivity) activity;
                    }
                    if (settingsBottomBarActivity != null) {
                        settingsBottomBarActivity.ti().setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.profiles.LupinConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void rb() {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        com.amazon.aps.iva.yb0.j.e(parentFragmentManager, "parentFragmentManager");
        ((com.amazon.aps.iva.yw.d0) com.ellation.crunchyroll.application.e.a()).c.c(parentFragmentManager);
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void s3() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.a a2 = defpackage.b.a(childFragmentManager, childFragmentManager);
        com.amazon.aps.iva.v20.a.c.getClass();
        a2.d(0, new com.amazon.aps.iva.v20.a(), "membership_card_dialog_tag", 1);
        a2.h();
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<v> setupPresenters() {
        return l1.H(ki());
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i = com.amazon.aps.iva.u70.h.a;
        View findViewById = requireActivity().findViewById(R.id.errors_layout);
        com.amazon.aps.iva.yb0.j.e(findViewById, "requireActivity().findViewById(R.id.errors_layout)");
        h.a.a((ViewGroup) findViewById, iVar);
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void v3(c cVar, int i) {
        com.amazon.aps.iva.yb0.j.f(cVar, "preference");
        String string = getString(cVar.getKeyId());
        com.amazon.aps.iva.yb0.j.e(string, "getString(keyId)");
        Preference G4 = G4(string);
        if (G4 != null) {
            G4.x(G4.b.getString(i));
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void v7() {
        Preference G4 = G4(getString(R.string.key_whatsapp_help));
        if (G4 != null) {
            G4.y(false);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void wf(String str) {
        int i;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.ox.a.class, "lupin");
            if (c != null) {
                if (((com.amazon.aps.iva.ox.a) c).isEnabled()) {
                    i = R.xml.settings;
                } else {
                    i = R.xml.settings_legacy;
                }
                gi(i, str);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.profiles.LupinConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void y9() {
        Preference G4 = G4(getString(R.string.key_membership_plan));
        com.amazon.aps.iva.yb0.j.d(G4, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.settings.membership.preference.MembershipPlanPreference");
        MembershipPlanPreference membershipPlanPreference = (MembershipPlanPreference) G4;
        membershipPlanPreference.S = true;
        View view = membershipPlanPreference.T;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.amazon.aps.iva.y30.d0
    public final void yf(ProfileApiModel profileApiModel) {
        com.amazon.aps.iva.yb0.j.f(profileApiModel, Scopes.PROFILE);
        TranslatablePreferenceCategory translatablePreferenceCategory = (TranslatablePreferenceCategory) G4("preferences_category_header");
        if (translatablePreferenceCategory != null) {
            String string = getString(R.string.category_preferences_username, profileApiModel.getUsername());
            if (!TextUtils.equals(string, translatablePreferenceCategory.i)) {
                translatablePreferenceCategory.i = string;
                translatablePreferenceCategory.j();
            }
        }
    }
}
