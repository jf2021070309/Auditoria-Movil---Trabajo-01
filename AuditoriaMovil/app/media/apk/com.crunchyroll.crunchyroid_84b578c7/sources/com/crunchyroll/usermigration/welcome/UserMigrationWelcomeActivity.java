package com.crunchyroll.usermigration.welcome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.p;
import com.amazon.aps.iva.c8.r;
import com.amazon.aps.iva.co.c;
import com.amazon.aps.iva.co.f;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.g70.f;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.k50.j;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.ko.k;
import com.amazon.aps.iva.ko.o;
import com.amazon.aps.iva.ko.s;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.u70.i;
import com.amazon.aps.iva.us.v;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.usermigration.welcome.UserMigrationWelcomeActivity;
import com.ellation.crunchyroll.api.etp.funmigration.FunMigrationService;
import com.ellation.crunchyroll.ui.databinding.LayoutErrorsBinding;
import com.ellation.toolbar.ToolbarDivider;
import com.ellation.widgets.SettingsRadioGroup;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: UserMigrationWelcomeActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/crunchyroll/usermigration/welcome/UserMigrationWelcomeActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/ko/s;", "<init>", "()V", "a", "user-migration_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UserMigrationWelcomeActivity extends com.amazon.aps.iva.i60.b implements s {
    public final com.amazon.aps.iva.kb0.e k = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.NONE, new f(this));
    public final com.amazon.aps.iva.ez.a l = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.ko.b.class, new g(this), h.h);
    public final m m = com.amazon.aps.iva.kb0.f.b(new b());
    public static final /* synthetic */ l<Object>[] o = {q.a(UserMigrationWelcomeActivity.class, "userMigrationViewModel", "getUserMigrationViewModel()Lcom/crunchyroll/usermigration/welcome/UserMigrationViewModelImpl;", 0)};
    public static final a n = new a();

    /* compiled from: UserMigrationWelcomeActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: UserMigrationWelcomeActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<k> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final k invoke() {
            a aVar = UserMigrationWelcomeActivity.n;
            UserMigrationWelcomeActivity userMigrationWelcomeActivity = UserMigrationWelcomeActivity.this;
            userMigrationWelcomeActivity.getClass();
            com.amazon.aps.iva.ko.b bVar = (com.amazon.aps.iva.ko.b) userMigrationWelcomeActivity.l.getValue(userMigrationWelcomeActivity, UserMigrationWelcomeActivity.o[0]);
            com.amazon.aps.iva.co.e eVar = f.a.a;
            if (eVar != null) {
                j e = eVar.e(userMigrationWelcomeActivity);
                boolean booleanExtra = userMigrationWelcomeActivity.getIntent().getBooleanExtra("show_steps_title", false);
                com.amazon.aps.iva.fo.g gVar = f.a.c;
                if (gVar != null) {
                    com.amazon.aps.iva.co.e eVar2 = f.a.a;
                    if (eVar2 != null) {
                        com.amazon.aps.iva.cx.h k = eVar2.k();
                        com.amazon.aps.iva.ls.a aVar2 = com.amazon.aps.iva.ls.a.MIGRATION_WELCOME;
                        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                        com.amazon.aps.iva.co.e eVar3 = f.a.a;
                        if (eVar3 != null) {
                            com.amazon.aps.iva.rx.a hasPremiumBenefit = eVar3.getHasPremiumBenefit();
                            com.amazon.aps.iva.yb0.j.f(aVar2, "screen");
                            com.amazon.aps.iva.yb0.j.f(hasPremiumBenefit, "hasPremiumBenefit");
                            v vVar = new v(cVar, aVar2, hasPremiumBenefit);
                            com.crunchyroll.usermigration.welcome.a aVar3 = new com.crunchyroll.usermigration.welcome.a(userMigrationWelcomeActivity);
                            com.amazon.aps.iva.ko.f fVar = com.amazon.aps.iva.ko.f.h;
                            com.amazon.aps.iva.yb0.j.f(fVar, "createTimer");
                            com.amazon.aps.iva.ko.h hVar = new com.amazon.aps.iva.ko.h(cVar, fVar);
                            com.amazon.aps.iva.yb0.j.f(e, "subscriptionFlowRouter");
                            com.amazon.aps.iva.yb0.j.f(k, "disableUsernameLoginConfig");
                            return new o(userMigrationWelcomeActivity, bVar, aVar3, e, booleanExtra, gVar, vVar, k, hVar);
                        }
                        com.amazon.aps.iva.yb0.j.m("dependencies");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("watchDataNotificationMonitor");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: UserMigrationWelcomeActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.g70.j, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.g70.j jVar) {
            com.amazon.aps.iva.g70.j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "it");
            a aVar = UserMigrationWelcomeActivity.n;
            UserMigrationWelcomeActivity userMigrationWelcomeActivity = UserMigrationWelcomeActivity.this;
            k pi = userMigrationWelcomeActivity.pi();
            Object checkedOption = userMigrationWelcomeActivity.oi().d.h.getCheckedOption();
            com.amazon.aps.iva.yb0.j.d(checkedOption, "null cannot be cast to non-null type com.crunchyroll.usermigration.MigrationOption");
            com.amazon.aps.iva.fs.b bVar = jVar2.b;
            com.amazon.aps.iva.yb0.j.c(bVar);
            pi.s1((com.amazon.aps.iva.co.c) checkedOption, bVar);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UserMigrationWelcomeActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.g70.j, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.g70.j jVar) {
            com.amazon.aps.iva.g70.j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "it");
            a aVar = UserMigrationWelcomeActivity.n;
            k pi = UserMigrationWelcomeActivity.this.pi();
            com.amazon.aps.iva.fs.b bVar = jVar2.b;
            com.amazon.aps.iva.yb0.j.c(bVar);
            pi.n5(bVar);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UserMigrationWelcomeActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, Object> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(Object obj) {
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type com.crunchyroll.usermigration.MigrationOption");
            return UserMigrationWelcomeActivity.this.getString(((com.amazon.aps.iva.co.c) obj).a);
        }
    }

    /* compiled from: ActivityViewBindingDelegate.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.p000do.c> {
        public final /* synthetic */ com.amazon.aps.iva.k.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.k.c cVar) {
            super(0);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.p000do.c invoke() {
            View view;
            int i;
            LayoutInflater layoutInflater = this.h.getLayoutInflater();
            com.amazon.aps.iva.yb0.j.e(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.activity_user_migration_welcome, (ViewGroup) null, false);
            View u = z.u(R.id.error_snackbar, inflate);
            if (u != null) {
                LayoutErrorsBinding.bind(u);
            }
            int i2 = R.id.layout_fn_free_no_cr_user_container;
            View u2 = z.u(R.id.layout_fn_free_no_cr_user_container, inflate);
            if (u2 != null) {
                int i3 = R.id.crunchyroll_account_created_text;
                TextView textView = (TextView) z.u(R.id.crunchyroll_account_created_text, u2);
                if (textView != null) {
                    int i4 = R.id.cta_button;
                    TextView textView2 = (TextView) z.u(R.id.cta_button, u2);
                    if (textView2 != null) {
                        i4 = R.id.membership_type_text;
                        TextView textView3 = (TextView) z.u(R.id.membership_type_text, u2);
                        if (textView3 != null) {
                            TextView textView4 = (TextView) z.u(R.id.migration_welcome_text, u2);
                            if (textView4 != null) {
                                View u3 = z.u(R.id.upsell_banner_container, u2);
                                if (u3 != null) {
                                    int i5 = R.id.cr_plus_subscription_button_text_view;
                                    TextView textView5 = (TextView) z.u(R.id.cr_plus_subscription_button_text_view, u3);
                                    if (textView5 != null) {
                                        i5 = R.id.upsell_banner_description;
                                        if (((TextView) z.u(R.id.upsell_banner_description, u3)) != null) {
                                            i5 = R.id.upsell_banner_subscription_button;
                                            FrameLayout frameLayout = (FrameLayout) z.u(R.id.upsell_banner_subscription_button, u3);
                                            if (frameLayout != null) {
                                                TextView textView6 = (TextView) z.u(R.id.upsell_banner_title, u3);
                                                if (textView6 != null) {
                                                    com.amazon.aps.iva.p000do.e eVar = new com.amazon.aps.iva.p000do.e(u3, textView5, frameLayout, textView6);
                                                    TextView textView7 = (TextView) z.u(R.id.use_fun_credentials_text, u2);
                                                    if (textView7 != null) {
                                                        TextView textView8 = (TextView) z.u(R.id.watch_data_description, u2);
                                                        if (textView8 != null) {
                                                            TextView textView9 = (TextView) z.u(R.id.watch_data_title, u2);
                                                            if (textView9 != null) {
                                                                int i6 = R.id.migration_welcome_text;
                                                                com.amazon.aps.iva.mj.h hVar = new com.amazon.aps.iva.mj.h((LinearLayout) u2, textView, textView2, textView3, textView4, eVar, textView7, textView8, textView9);
                                                                View u4 = z.u(R.id.layout_fn_premium_no_cr_user_container, inflate);
                                                                if (u4 != null) {
                                                                    if (((TextView) z.u(R.id.crunchyroll_account_created_text, u4)) != null) {
                                                                        if (((AppCompatTextView) z.u(R.id.membership_type_text, u4)) != null) {
                                                                            i3 = R.id.migration_benefits_container;
                                                                            LinearLayout linearLayout = (LinearLayout) z.u(R.id.migration_benefits_container, u4);
                                                                            if (linearLayout != null) {
                                                                                if (((TextView) z.u(R.id.migration_welcome_text, u4)) != null) {
                                                                                    TextView textView10 = (TextView) z.u(R.id.use_fun_credentials_text, u4);
                                                                                    if (textView10 != null) {
                                                                                        i6 = R.id.watch_data_description;
                                                                                        if (((TextView) z.u(R.id.watch_data_description, u4)) != null) {
                                                                                            if (((TextView) z.u(R.id.watch_data_title, u4)) != null) {
                                                                                                com.amazon.aps.iva.p000do.d dVar = new com.amazon.aps.iva.p000do.d((LinearLayout) u4, linearLayout, textView10);
                                                                                                i2 = R.id.layout_welcome_with_migration_options;
                                                                                                View u5 = z.u(R.id.layout_welcome_with_migration_options, inflate);
                                                                                                if (u5 != null) {
                                                                                                    int i7 = R.id.free_membership_title;
                                                                                                    TextView textView11 = (TextView) z.u(R.id.free_membership_title, u5);
                                                                                                    if (textView11 != null) {
                                                                                                        i7 = R.id.membership_text_first;
                                                                                                        TextView textView12 = (TextView) z.u(R.id.membership_text_first, u5);
                                                                                                        if (textView12 != null) {
                                                                                                            i7 = R.id.membership_text_second;
                                                                                                            TextView textView13 = (TextView) z.u(R.id.membership_text_second, u5);
                                                                                                            if (textView13 != null) {
                                                                                                                i7 = R.id.membership_text_third;
                                                                                                                TextView textView14 = (TextView) z.u(R.id.membership_text_third, u5);
                                                                                                                if (textView14 != null) {
                                                                                                                    i7 = R.id.migration_title;
                                                                                                                    TextView textView15 = (TextView) z.u(R.id.migration_title, u5);
                                                                                                                    if (textView15 != null) {
                                                                                                                        i7 = R.id.premium_membership_title;
                                                                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) z.u(R.id.premium_membership_title, u5);
                                                                                                                        if (appCompatTextView != null) {
                                                                                                                            i7 = R.id.watch_data_text;
                                                                                                                            if (((TextView) z.u(R.id.watch_data_text, u5)) != null) {
                                                                                                                                if (((TextView) z.u(R.id.watch_data_title, u5)) != null) {
                                                                                                                                    i = R.id.welcome_migration_radio_group;
                                                                                                                                    SettingsRadioGroup settingsRadioGroup = (SettingsRadioGroup) z.u(R.id.welcome_migration_radio_group, u5);
                                                                                                                                    if (settingsRadioGroup != null) {
                                                                                                                                        com.amazon.aps.iva.p000do.g gVar = new com.amazon.aps.iva.p000do.g((LinearLayout) u5, textView11, textView12, textView13, textView14, textView15, appCompatTextView, settingsRadioGroup);
                                                                                                                                        i2 = R.id.migration_bottom_cta_button;
                                                                                                                                        TextView textView16 = (TextView) z.u(R.id.migration_bottom_cta_button, inflate);
                                                                                                                                        if (textView16 != null) {
                                                                                                                                            i2 = R.id.migration_scroll_view;
                                                                                                                                            ScrollView scrollView = (ScrollView) z.u(R.id.migration_scroll_view, inflate);
                                                                                                                                            if (scrollView != null) {
                                                                                                                                                i2 = R.id.migration_step_text;
                                                                                                                                                TextView textView17 = (TextView) z.u(R.id.migration_step_text, inflate);
                                                                                                                                                if (textView17 != null) {
                                                                                                                                                    i2 = R.id.migration_toolbar_divider;
                                                                                                                                                    ToolbarDivider toolbarDivider = (ToolbarDivider) z.u(R.id.migration_toolbar_divider, inflate);
                                                                                                                                                    if (toolbarDivider != null) {
                                                                                                                                                        i2 = R.id.migration_welcome_error_fullscreen;
                                                                                                                                                        View u6 = z.u(R.id.migration_welcome_error_fullscreen, inflate);
                                                                                                                                                        if (u6 != null) {
                                                                                                                                                            i2 = R.id.progress_overlay;
                                                                                                                                                            View u7 = z.u(R.id.progress_overlay, inflate);
                                                                                                                                                            if (u7 != null) {
                                                                                                                                                                RelativeLayout relativeLayout = (RelativeLayout) u7;
                                                                                                                                                                return new com.amazon.aps.iva.p000do.c((ConstraintLayout) inflate, hVar, dVar, gVar, textView16, scrollView, textView17, toolbarDivider, u6, new com.amazon.aps.iva.p000do.f(relativeLayout, relativeLayout, 0));
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.watch_data_title;
                                                                                                                                }
                                                                                                                                throw new NullPointerException("Missing required view with ID: ".concat(u5.getResources().getResourceName(i)));
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    i = i7;
                                                                                                    throw new NullPointerException("Missing required view with ID: ".concat(u5.getResources().getResourceName(i)));
                                                                                                }
                                                                                            } else {
                                                                                                i4 = R.id.watch_data_title;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        i3 = R.id.use_fun_credentials_text;
                                                                                    }
                                                                                }
                                                                                i3 = i6;
                                                                            }
                                                                        }
                                                                        i3 = i4;
                                                                    }
                                                                    throw new NullPointerException("Missing required view with ID: ".concat(u4.getResources().getResourceName(i3)));
                                                                }
                                                                i2 = R.id.layout_fn_premium_no_cr_user_container;
                                                            } else {
                                                                view = u2;
                                                                i4 = R.id.watch_data_title;
                                                                i3 = i4;
                                                            }
                                                        } else {
                                                            view = u2;
                                                            i3 = R.id.watch_data_description;
                                                        }
                                                    } else {
                                                        view = u2;
                                                        i3 = R.id.use_fun_credentials_text;
                                                    }
                                                } else {
                                                    i5 = R.id.upsell_banner_title;
                                                }
                                            }
                                        }
                                    }
                                    throw new NullPointerException("Missing required view with ID: ".concat(u3.getResources().getResourceName(i5)));
                                }
                                view = u2;
                                i3 = R.id.upsell_banner_container;
                            } else {
                                view = u2;
                                i3 = R.id.migration_welcome_text;
                            }
                        }
                    }
                    view = u2;
                    i3 = i4;
                } else {
                    view = u2;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: UserMigrationWelcomeActivity.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.ko.b> {
        public static final h h = new h();

        public h() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.ko.b invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            com.amazon.aps.iva.co.e eVar = f.a.a;
            if (eVar != null) {
                com.amazon.aps.iva.ct.l userBenefitsSynchronizer = eVar.getUserBenefitsSynchronizer();
                com.amazon.aps.iva.eo.b bVar = f.a.b;
                if (bVar != null) {
                    com.amazon.aps.iva.co.e eVar2 = f.a.a;
                    if (eVar2 != null) {
                        LinkedHashMap d = eVar2.d();
                        com.amazon.aps.iva.co.e eVar3 = f.a.a;
                        if (eVar3 != null) {
                            com.amazon.aps.iva.ts.a h2 = eVar3.h();
                            com.amazon.aps.iva.yb0.j.f(d, "allBenefitsMap");
                            com.amazon.aps.iva.yb0.j.f(h2, "accountMigrationConfiguration");
                            com.amazon.aps.iva.co.l lVar = new com.amazon.aps.iva.co.l(bVar, d, h2);
                            com.amazon.aps.iva.co.e eVar4 = f.a.a;
                            if (eVar4 != null) {
                                FunMigrationService funMigrationService = eVar4.getFunMigrationService();
                                com.amazon.aps.iva.yb0.j.f(funMigrationService, "funMigrationService");
                                return new com.amazon.aps.iva.ko.b(userBenefitsSynchronizer, lVar, new com.amazon.aps.iva.ko.j(funMigrationService));
                            }
                            com.amazon.aps.iva.yb0.j.m("dependencies");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("dependencies");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("funUserStore");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.ko.s
    public final void J3() {
        TextView textView = oi().g;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.migrationStepText");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.ko.s
    public final void N5(boolean z) {
        int i;
        qi();
        ni();
        com.amazon.aps.iva.p000do.g gVar = oi().d;
        AppCompatTextView appCompatTextView = gVar.g;
        com.amazon.aps.iva.yb0.j.e(appCompatTextView, "premiumMembershipTitle");
        appCompatTextView.setVisibility(0);
        gVar.c.setText(R.string.migration_cr_subscription);
        TextView textView = gVar.d;
        com.amazon.aps.iva.yb0.j.e(textView, "membershipTextSecond");
        textView.setVisibility(0);
        if (z) {
            i = R.string.migration_from_now_use_credentials_v2;
        } else {
            i = R.string.migration_from_now_use_credentials;
        }
        textView.setText(i);
    }

    @Override // com.amazon.aps.iva.ko.s
    public final void N8() {
        TextView textView = oi().e;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.migrationBottomCtaButton");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.ko.s
    public final void Nb(boolean z) {
        int i;
        qi();
        ni();
        com.amazon.aps.iva.p000do.g gVar = oi().d;
        TextView textView = gVar.b;
        com.amazon.aps.iva.yb0.j.e(textView, "freeMembershipTitle");
        textView.setVisibility(0);
        if (z) {
            i = R.string.migration_from_now_use_credentials_v2;
        } else {
            i = R.string.migration_from_now_use_credentials;
        }
        gVar.c.setText(i);
        TextView textView2 = gVar.d;
        com.amazon.aps.iva.yb0.j.e(textView2, "membershipTextSecond");
        textView2.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.ko.s
    public final void Sa(boolean z) {
        int i;
        LinearLayout linearLayout = (LinearLayout) oi().b.b;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.layoutFnFreeNoCrUserContainer.root");
        linearLayout.setVisibility(0);
        TextView textView = (TextView) oi().b.g;
        if (z) {
            i = R.string.migration_use_fun_credentials_v2;
        } else {
            i = R.string.migration_use_fun_credentials;
        }
        textView.setText(i);
    }

    @Override // com.amazon.aps.iva.ko.s
    public final void X3(boolean z) {
        int i;
        qi();
        ni();
        com.amazon.aps.iva.p000do.g gVar = oi().d;
        gVar.f.setText(R.string.migration_get_your_anime_style);
        AppCompatTextView appCompatTextView = gVar.g;
        com.amazon.aps.iva.yb0.j.e(appCompatTextView, "premiumMembershipTitle");
        appCompatTextView.setVisibility(0);
        gVar.c.setText(R.string.migration_get_ready_to_enjoy);
        TextView textView = gVar.d;
        com.amazon.aps.iva.yb0.j.e(textView, "membershipTextSecond");
        textView.setVisibility(0);
        if (z) {
            i = R.string.migration_use_fun_credentials_v2;
        } else {
            i = R.string.migration_use_fun_credentials;
        }
        textView.setText(i);
    }

    @Override // com.amazon.aps.iva.ko.s
    public final void X6(List<String> list, boolean z) {
        int i;
        com.amazon.aps.iva.yb0.j.f(list, "benefits");
        LinearLayout linearLayout = oi().c.a;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.layoutFnPremiumNoCrUserContainer.root");
        linearLayout.setVisibility(0);
        TextView textView = oi().c.c;
        if (z) {
            i = R.string.migration_use_fun_credentials_v2;
        } else {
            i = R.string.migration_use_fun_credentials;
        }
        textView.setText(i);
        oi().c.b.removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.migration_benefit_margin_bottom);
        int B = f1.B(list);
        for (int i2 = 0; i2 < B; i2++) {
            mi(list.get(i2), layoutParams);
        }
        mi((String) x.D0(list), new LinearLayout.LayoutParams(-2, -2));
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void a() {
        RelativeLayout relativeLayout = (RelativeLayout) oi().j.b;
        com.amazon.aps.iva.yb0.j.e(relativeLayout, "binding.progressOverlay.root");
        relativeLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void b() {
        RelativeLayout relativeLayout = (RelativeLayout) oi().j.b;
        com.amazon.aps.iva.yb0.j.e(relativeLayout, "binding.progressOverlay.root");
        relativeLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.ko.s
    public final void b0() {
        com.amazon.aps.iva.g70.g gVar = new com.amazon.aps.iva.g70.g(0, getText(R.string.migration_confirmation_title), getText(R.string.migration_confirmation_text), getText(R.string.migration_confirmation_positive_button), "positive_button_result", getText(R.string.migration_confirmation_negavite_button), 1);
        com.amazon.aps.iva.g70.f.e.getClass();
        f.a.a(gVar).show(getSupportFragmentManager(), "verify_email_dialog");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "supportFragmentManager");
        com.amazon.aps.iva.bo.e.h(supportFragmentManager, "verify_email_dialog", this, new c(), new d());
    }

    @Override // com.amazon.aps.iva.ko.s
    public final void mg() {
        TextView textView = oi().g;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.migrationStepText");
        textView.setVisibility(4);
    }

    public final void mi(String str, LinearLayout.LayoutParams layoutParams) {
        LinearLayout linearLayout = oi().c.b;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.layoutFnPremiumN…igrationBenefitsContainer");
        View inflate = LayoutInflater.from(this).inflate(R.layout.layout_user_migration_benefit, (ViewGroup) linearLayout, false);
        com.amazon.aps.iva.yb0.j.d(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setText(str);
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        oi().c.a.invalidate();
    }

    @Override // com.amazon.aps.iva.ko.s
    public final void ng(boolean z) {
        int i;
        qi();
        ni();
        com.amazon.aps.iva.p000do.g gVar = oi().d;
        AppCompatTextView appCompatTextView = gVar.g;
        com.amazon.aps.iva.yb0.j.e(appCompatTextView, "premiumMembershipTitle");
        appCompatTextView.setVisibility(0);
        gVar.c.setText(R.string.migration_with_current_subscription);
        TextView textView = gVar.d;
        com.amazon.aps.iva.yb0.j.e(textView, "membershipTextSecond");
        textView.setVisibility(0);
        if (z) {
            i = R.string.migration_from_now_use_credentials_v2;
        } else {
            i = R.string.migration_from_now_use_credentials;
        }
        textView.setText(i);
        TextView textView2 = gVar.e;
        com.amazon.aps.iva.yb0.j.e(textView2, "membershipTextThird");
        textView2.setVisibility(8);
    }

    public final void ni() {
        oi().e.setText(R.string.migration_watch_data_cta);
        oi().e.setOnClickListener(new com.amazon.aps.iva.c8.k(this, 5));
    }

    public final com.amazon.aps.iva.p000do.c oi() {
        return (com.amazon.aps.iva.p000do.c) this.k.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = oi().a;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        ((TextView) oi().b.d).setOnClickListener(new r(this, 6));
        ((FrameLayout) ((com.amazon.aps.iva.p000do.e) oi().b.f).e).setOnClickListener(new com.amazon.aps.iva.c8.s(this, 8));
        oi().e.setOnClickListener(new com.amazon.aps.iva.c8.e(this, 7));
        ((TextView) oi().i.findViewById(R.id.retry_text)).setOnClickListener(new com.amazon.aps.iva.c8.f(this, 5));
        oi().f.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.amazon.aps.iva.ko.e
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                UserMigrationWelcomeActivity.a aVar = UserMigrationWelcomeActivity.n;
                UserMigrationWelcomeActivity userMigrationWelcomeActivity = UserMigrationWelcomeActivity.this;
                com.amazon.aps.iva.yb0.j.f(userMigrationWelcomeActivity, "this$0");
                userMigrationWelcomeActivity.oi().h.G(i2);
            }
        });
    }

    public final k pi() {
        return (k) this.m.getValue();
    }

    public final void qi() {
        com.amazon.aps.iva.p000do.g gVar = oi().d;
        LinearLayout linearLayout = gVar.a;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "root");
        linearLayout.setVisibility(0);
        c.a aVar = c.a.b;
        List K = f1.K(aVar, c.b.b, c.C0182c.b);
        e eVar = new e();
        SettingsRadioGroup settingsRadioGroup = gVar.h;
        settingsRadioGroup.a(K, eVar);
        settingsRadioGroup.d = false;
        if (settingsRadioGroup.b.contains(aVar)) {
            settingsRadioGroup.clearCheck();
            settingsRadioGroup.check(settingsRadioGroup.b.indexOf(aVar));
        }
        settingsRadioGroup.d = true;
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(pi());
    }

    @Override // com.amazon.aps.iva.ko.s
    public final void showSnackbar(i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "errorMessage");
        int i = com.amazon.aps.iva.u70.h.a;
        View findViewById = findViewById(16908290);
        com.amazon.aps.iva.yb0.j.e(findViewById, "findViewById(android.R.id.content)");
        h.a.a((ViewGroup) findViewById, iVar);
    }

    @Override // com.amazon.aps.iva.ko.s
    public final void vf() {
        View view = oi().i;
        com.amazon.aps.iva.yb0.j.e(view, "binding.migrationWelcomeErrorFullscreen");
        view.setVisibility(0);
    }
}
