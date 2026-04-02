package com.crunchyroll.profiles.presentation.profileactivation;

import com.amazon.aps.iva.e1.d;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.g8.r0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nm.j;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.ui.c;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ProfileActivationActivity.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<i, Integer, q> {
    public final /* synthetic */ ProfileActivationActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ProfileActivationActivity profileActivationActivity) {
        super(2);
        this.h = profileActivationActivity;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            m0 k = d.k(new r0[0], iVar2);
            q qVar = q.a;
            ProfileActivationActivity profileActivationActivity = this.h;
            x0.c(qVar, new a(k, profileActivationActivity, null), iVar2);
            com.amazon.aps.iva.fc0.l<Object>[] lVarArr = ProfileActivationActivity.c;
            profileActivationActivity.getClass();
            com.amazon.aps.iva.nm.a.a(k, (c) profileActivationActivity.b.getValue(profileActivationActivity, ProfileActivationActivity.c[0]), j.a.b, iVar2, 392);
        }
        return q.a;
    }
}
