package com.amazon.aps.iva.k3;

import android.os.LocaleList;
import java.util.Locale;
/* compiled from: LocaleListPlatformWrapper.java */
/* loaded from: classes.dex */
public final class l implements k {
    public final LocaleList a;

    public l(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // com.amazon.aps.iva.k3.k
    public final String a() {
        return this.a.toLanguageTags();
    }

    @Override // com.amazon.aps.iva.k3.k
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((k) obj).b());
    }

    @Override // com.amazon.aps.iva.k3.k
    public final Locale get(int i) {
        return this.a.get(i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.amazon.aps.iva.k3.k
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // com.amazon.aps.iva.k3.k
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }
}
