package com.crunchyroll.profiles.presentation.profileactivation;

import android.os.Bundle;
import androidx.fragment.app.h;
import androidx.lifecycle.p;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: ProfileActivationActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/crunchyroll/profiles/presentation/profileactivation/ProfileActivationActivity;", "Lcom/amazon/aps/iva/k/c;", "<init>", "()V", "profiles_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ProfileActivationActivity extends com.amazon.aps.iva.k.c {
    public static final /* synthetic */ l<Object>[] c = {q.a(ProfileActivationActivity.class, "navigator", "getNavigator()Lcom/crunchyroll/mvvm/navigation/ViewModelNavigator;", 0)};
    public final com.amazon.aps.iva.ez.a b = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.ui.c.class, new c(this), a.h);

    /* compiled from: ProfileActivationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.ui.c<com.amazon.aps.iva.nm.c>> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.ui.c<com.amazon.aps.iva.nm.c> invoke(p pVar) {
            p pVar2 = pVar;
            j.f(pVar2, "it");
            return new com.amazon.aps.iva.ui.c<>(pVar2, new com.amazon.aps.iva.mm.a("User 2", "sudachi-2.png", "0403-the-rising-of-the-shield-hero-01.png", "FoolhardyMarten"));
        }
    }

    /* compiled from: ProfileActivationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<i, Integer, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, 33517917, new com.crunchyroll.profiles.presentation.profileactivation.b(ProfileActivationActivity.this)), iVar2, 6);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h> {
        public final /* synthetic */ h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            return this.h;
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.amazon.aps.iva.xw.b.c(this, com.amazon.aps.iva.v0.b.c(914710634, new b(), true));
    }
}
