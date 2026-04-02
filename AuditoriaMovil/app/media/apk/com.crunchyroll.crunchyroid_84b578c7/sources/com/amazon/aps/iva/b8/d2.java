package com.amazon.aps.iva.b8;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.amazon.aps.iva.b8.b2;
import com.google.common.base.Objects;
/* compiled from: SessionTokenImplLegacy.java */
/* loaded from: classes.dex */
public final class d2 implements b2.a {
    public static final String h = com.amazon.aps.iva.t5.g0.L(0);
    public static final String i = com.amazon.aps.iva.t5.g0.L(1);
    public static final String j = com.amazon.aps.iva.t5.g0.L(2);
    public static final String k = com.amazon.aps.iva.t5.g0.L(3);
    public static final String l = com.amazon.aps.iva.t5.g0.L(4);
    public static final String m = com.amazon.aps.iva.t5.g0.L(5);
    public static final com.amazon.aps.iva.q5.p n = new com.amazon.aps.iva.q5.p(10);
    public final MediaSessionCompat.Token b;
    public final int c;
    public final int d;
    public final ComponentName e;
    public final String f;
    public final Bundle g;

    public d2(MediaSessionCompat.Token token, int i2, int i3, ComponentName componentName, String str, Bundle bundle) {
        this.b = token;
        this.c = i2;
        this.d = i3;
        this.e = componentName;
        this.f = str;
        this.g = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        int i2 = d2Var.d;
        int i3 = this.d;
        if (i3 != i2) {
            return false;
        }
        if (i3 != 100) {
            if (i3 != 101) {
                return false;
            }
            return com.amazon.aps.iva.t5.g0.a(this.e, d2Var.e);
        }
        return com.amazon.aps.iva.t5.g0.a(this.b, d2Var.b);
    }

    @Override // com.amazon.aps.iva.b8.b2.a
    public final Bundle getExtras() {
        return new Bundle(this.g);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.d), this.e, this.b);
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        String str = h;
        MediaSessionCompat.Token token = this.b;
        if (token == null) {
            bundle = null;
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("android.support.v4.media.session.TOKEN", token);
            synchronized (token.b) {
                try {
                    android.support.v4.media.session.b bVar = token.d;
                    if (bVar != null) {
                        com.amazon.aps.iva.k3.d.b(bundle3, "android.support.v4.media.session.EXTRA_BINDER", bVar.asBinder());
                    }
                    com.amazon.aps.iva.c9.d dVar = token.e;
                    if (dVar != null) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putParcelable("a", new ParcelImpl(dVar));
                        bundle3.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle4);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bundle = bundle3;
        }
        bundle2.putBundle(str, bundle);
        bundle2.putInt(i, this.c);
        bundle2.putInt(j, this.d);
        bundle2.putParcelable(k, this.e);
        bundle2.putString(l, this.f);
        bundle2.putBundle(m, this.g);
        return bundle2;
    }

    public final String toString() {
        return "SessionToken {legacyToken=" + this.b + "}";
    }
}
