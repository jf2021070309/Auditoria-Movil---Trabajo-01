package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import e.d.d.f;
import e.d.d.g;
import e.d.d.k.a.a;
import e.d.d.k.a.b;
import e.d.d.l.n;
import e.d.d.l.o;
import e.d.d.l.q;
import e.d.d.l.r;
import e.d.d.l.w;
import e.d.d.q.d;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements r {
    public static a lambda$getComponents$0(o oVar) {
        g gVar = (g) oVar.a(g.class);
        Context context = (Context) oVar.a(Context.class);
        d dVar = (d) oVar.a(d.class);
        Preconditions.checkNotNull(gVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (b.a == null) {
            synchronized (b.class) {
                if (b.a == null) {
                    Bundle bundle = new Bundle(1);
                    if (gVar.j()) {
                        dVar.b(f.class, new Executor() { // from class: e.d.d.k.a.e
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new e.d.d.q.b() { // from class: e.d.d.k.a.d
                            @Override // e.d.d.q.b
                            public final void a(e.d.d.q.a aVar) {
                                Objects.requireNonNull(aVar);
                                Objects.requireNonNull(null);
                                throw null;
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", gVar.i());
                    }
                    b.a = new b(zzee.zzg(context, null, null, null, bundle).zzd());
                }
            }
        }
        return b.a;
    }

    @Override // e.d.d.l.r
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<n<?>> getComponents() {
        n.b a = n.a(a.class);
        a.a(new w(g.class, 1, 0));
        a.a(new w(Context.class, 1, 0));
        a.a(new w(d.class, 1, 0));
        a.c(new q() { // from class: e.d.d.k.a.c.a
            @Override // e.d.d.l.q
            public final Object a(o oVar) {
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(oVar);
            }
        });
        a.d(2);
        return Arrays.asList(a.b(), e.d.b.d.a.t("fire-analytics", "20.0.0"));
    }
}
