package com.crunchyroll.profiles.presentation.profileactivation;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ui.c;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ProfileActivationActivity.kt */
@e(c = "com.crunchyroll.profiles.presentation.profileactivation.ProfileActivationActivity$onCreate$1$1$1", f = "ProfileActivationActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<g0, d<? super q>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ m0 i;
    public final /* synthetic */ ProfileActivationActivity j;

    /* compiled from: ProfileActivationActivity.kt */
    /* renamed from: com.crunchyroll.profiles.presentation.profileactivation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0956a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ ProfileActivationActivity h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0956a(ProfileActivationActivity profileActivationActivity) {
            super(0);
            this.h = profileActivationActivity;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.finish();
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m0 m0Var, ProfileActivationActivity profileActivationActivity, d<? super a> dVar) {
        super(2, dVar);
        this.i = m0Var;
        this.j = profileActivationActivity;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        a aVar = new a(this.i, this.j, dVar);
        aVar.h = obj;
        return aVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        com.amazon.aps.iva.fc0.l<Object>[] lVarArr = ProfileActivationActivity.c;
        ProfileActivationActivity profileActivationActivity = this.j;
        profileActivationActivity.getClass();
        com.amazon.aps.iva.fc0.l<?> lVar = ProfileActivationActivity.c[0];
        C0956a c0956a = new C0956a(profileActivationActivity);
        new com.amazon.aps.iva.nm.i(this.i, (c) profileActivationActivity.b.getValue(profileActivationActivity, lVar), c0956a).a((g0) this.h);
        return q.a;
    }
}
