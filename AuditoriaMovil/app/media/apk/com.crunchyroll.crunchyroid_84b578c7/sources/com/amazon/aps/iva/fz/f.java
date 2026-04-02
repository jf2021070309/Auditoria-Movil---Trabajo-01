package com.amazon.aps.iva.fz;

import android.app.Application;
import com.amazon.aps.iva.kb0.q;
import com.braze.Braze;
import com.braze.BrazeUser;
/* compiled from: BrazeProxy.kt */
/* loaded from: classes2.dex */
public final class f implements d {
    public static final f b = new f();
    public static Application c;
    public static com.amazon.aps.iva.xb0.l<? super Integer, q> d;

    @Override // com.amazon.aps.iva.fz.d
    public final void setPhoneNumber(String str) {
        Braze.Companion companion = Braze.Companion;
        Application application = c;
        if (application != null) {
            BrazeUser currentUser = companion.getInstance(application).getCurrentUser();
            if (currentUser != null) {
                currentUser.setPhoneNumber(str);
                return;
            }
            return;
        }
        com.amazon.aps.iva.yb0.j.m("appContext");
        throw null;
    }
}
