package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import e.d.d.g;
import e.d.d.l.n;
import e.d.d.l.o;
import e.d.d.l.q;
import e.d.d.l.r;
import e.d.d.l.w;
import e.d.d.q.d;
import e.d.d.r.f;
import e.d.d.s.a.a;
import e.d.d.x.h;
import java.util.Arrays;
import java.util.List;
@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements r {
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(o oVar) {
        return new FirebaseMessaging((g) oVar.a(g.class), (a) oVar.a(a.class), oVar.b(h.class), oVar.b(f.class), (e.d.d.u.h) oVar.a(e.d.d.u.h.class), (e.d.b.b.g) oVar.a(e.d.b.b.g.class), (d) oVar.a(d.class));
    }

    @Override // e.d.d.l.r
    @Keep
    public List<n<?>> getComponents() {
        n.b a = n.a(FirebaseMessaging.class);
        a.a(new w(g.class, 1, 0));
        a.a(new w(a.class, 0, 0));
        a.a(new w(h.class, 0, 1));
        a.a(new w(f.class, 0, 1));
        a.a(new w(e.d.b.b.g.class, 0, 0));
        a.a(new w(e.d.d.u.h.class, 1, 0));
        a.a(new w(d.class, 1, 0));
        a.c(new q() { // from class: e.d.d.w.w
            @Override // e.d.d.l.q
            public final Object a(e.d.d.l.o oVar) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(oVar);
            }
        });
        a.d(1);
        return Arrays.asList(a.b(), e.d.b.d.a.t("fire-fcm", "23.0.0"));
    }
}
