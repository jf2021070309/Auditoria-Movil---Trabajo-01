package com.google.firebase.components;

import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes2.dex */
public final class Dependency {
    private final Class<?> a;
    private final int b;
    private final int c;

    private Dependency(Class<?> cls, int i, int i2) {
        this.a = (Class) Preconditions.checkNotNull(cls, "Null dependency anInterface.");
        this.b = i;
        this.c = i2;
    }

    public static Dependency optional(Class<?> cls) {
        return new Dependency(cls, 0, 0);
    }

    public static Dependency required(Class<?> cls) {
        return new Dependency(cls, 1, 0);
    }

    public static Dependency optionalProvider(Class<?> cls) {
        return new Dependency(cls, 0, 1);
    }

    public static Dependency requiredProvider(Class<?> cls) {
        return new Dependency(cls, 1, 1);
    }

    public final Class<?> zza() {
        return this.a;
    }

    public final boolean zzb() {
        return this.b == 1;
    }

    public final boolean zzc() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Dependency) {
            Dependency dependency = (Dependency) obj;
            return this.a == dependency.a && this.b == dependency.b && this.c == dependency.c;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "Dependency{anInterface=" + this.a + ", required=" + (this.b == 1) + ", direct=" + (this.c == 0) + "}";
    }
}
