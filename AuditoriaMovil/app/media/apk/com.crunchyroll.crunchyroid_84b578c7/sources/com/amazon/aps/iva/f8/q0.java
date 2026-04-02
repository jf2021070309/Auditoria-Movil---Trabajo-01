package com.amazon.aps.iva.f8;

import android.os.Build;
import android.os.Bundle;
/* compiled from: MediaRouterParams.java */
/* loaded from: classes.dex */
public final class q0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Bundle e;

    public q0(a aVar) {
        Bundle bundle;
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        Bundle bundle2 = aVar.e;
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        } else {
            bundle = new Bundle(bundle2);
        }
        this.e = bundle;
    }

    /* compiled from: MediaRouterParams.java */
    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
        public final Bundle e;

        public a() {
            this.a = 1;
            this.b = Build.VERSION.SDK_INT >= 30;
        }

        public a(q0 q0Var) {
            this.a = 1;
            this.a = q0Var.a;
            this.c = q0Var.c;
            this.d = q0Var.d;
            this.b = q0Var.b;
            Bundle bundle = q0Var.e;
            this.e = bundle == null ? null : new Bundle(bundle);
        }
    }
}
