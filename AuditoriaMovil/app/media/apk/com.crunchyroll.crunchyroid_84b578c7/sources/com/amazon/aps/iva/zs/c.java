package com.amazon.aps.iva.zs;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.m;
import com.amazon.aps.iva.en.a;
import com.amazon.aps.iva.en.g;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.x50.e;
import com.amazon.aps.iva.x50.p;
import com.amazon.aps.iva.xw.b0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.onboarding.OnboardingV2Activity;
import com.crunchyroll.restrictedstate.UserRestrictedStateActivity;
import com.ellation.crunchyroll.api.etp.auth.TokenState;
import com.ellation.crunchyroll.api.etp.error.ForcedToContactCustomerSupportException;
import com.ellation.crunchyroll.api.etp.error.NoNewSessionsAllowedException;
import com.ellation.crunchyroll.api.etp.error.UserRestrictionException;
/* compiled from: SignOutFlowView.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.zs.b {
    public final e b;

    /* compiled from: SignOutFlowView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<Activity, Boolean> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(Activity activity) {
            boolean z;
            if (activity != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: SignOutFlowView.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<Activity, q> {
        public final /* synthetic */ boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(1);
            this.h = z;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Activity activity) {
            Activity activity2 = activity;
            int i = OnboardingV2Activity.o;
            j.c(activity2);
            Intent intent = new Intent(activity2, OnboardingV2Activity.class);
            intent.addFlags(268468224);
            intent.putExtra("is_token_expired", this.h);
            activity2.startActivity(intent);
            return q.a;
        }
    }

    /* compiled from: SignOutFlowView.kt */
    /* renamed from: com.amazon.aps.iva.zs.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0930c extends l implements com.amazon.aps.iva.xb0.l<Activity, Boolean> {
        public static final C0930c h = new C0930c();

        public C0930c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(Activity activity) {
            boolean z;
            if (activity != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: SignOutFlowView.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<Activity, q> {
        public final /* synthetic */ TokenState.TokenRestrictedState h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TokenState.TokenRestrictedState tokenRestrictedState) {
            super(1);
            this.h = tokenRestrictedState;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Activity activity) {
            g gVar;
            Activity activity2 = activity;
            int i = UserRestrictedStateActivity.m;
            j.c(activity2);
            TokenState.TokenRestrictedState tokenRestrictedState = this.h;
            UserRestrictionException exception = tokenRestrictedState.getException();
            String email = tokenRestrictedState.getEmail();
            if (email == null) {
                email = "";
            }
            j.f(exception, "<this>");
            if (exception instanceof NoNewSessionsAllowedException) {
                gVar = new g(a.b.d, email);
            } else if (exception instanceof ForcedToContactCustomerSupportException) {
                gVar = new g(a.C0227a.d, email);
            } else {
                throw new h();
            }
            Intent putExtra = new Intent(activity2, UserRestrictedStateActivity.class).putExtra("user_restriction_input", gVar);
            j.e(putExtra, "this.putExtra(USER_RESTRICTION_INPUT, input)");
            activity2.startActivity(putExtra);
            return q.a;
        }
    }

    public c(p pVar) {
        this.b = pVar;
    }

    @Override // com.amazon.aps.iva.zs.b
    public final void Wb(TokenState.TokenRestrictedState tokenRestrictedState) {
        j.f(tokenRestrictedState, "state");
        b0.b(this.b.c(), this, C0930c.h, new d(tokenRestrictedState));
    }

    @Override // com.amazon.aps.iva.zs.b
    public final void bf(boolean z) {
        b0.b(this.b.c(), this, a.h, new b(z));
    }

    @Override // com.amazon.aps.iva.i5.o
    public final androidx.lifecycle.g getLifecycle() {
        m mVar = m.j;
        return m.j.g;
    }
}
