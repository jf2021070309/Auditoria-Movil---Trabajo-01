package com.amazon.aps.iva.kj;

import com.amazon.aps.iva.yb0.j;
/* compiled from: AppPlayerEvent.kt */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: AppPlayerEvent.kt */
    /* renamed from: com.amazon.aps.iva.kj.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0445a extends a {
        public static final C0445a a = new C0445a();
    }

    /* compiled from: AppPlayerEvent.kt */
    /* loaded from: classes.dex */
    public static final class b extends a {
        public static final b a = new b();
    }

    /* compiled from: AppPlayerEvent.kt */
    /* loaded from: classes.dex */
    public static final class c extends a {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && j.a(this.a, ((c) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("SwitchedToNextItemFromPlaylist(assetId="), this.a, ")");
        }
    }
}
