package com.amazon.aps.iva.o0;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class x2<T> {
    public final i a;

    public /* synthetic */ x2(i iVar) {
        this.a = iVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x2)) {
            return false;
        }
        if (!com.amazon.aps.iva.yb0.j.a(this.a, ((x2) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.a + ')';
    }
}
