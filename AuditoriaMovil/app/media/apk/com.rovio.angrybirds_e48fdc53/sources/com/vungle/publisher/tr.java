package com.vungle.publisher;

import android.os.Bundle;
import java.util.regex.Pattern;
/* loaded from: classes4.dex */
public abstract class tr {
    private static final Pattern a = Pattern.compile("^https://");
    private String b;
    private Bundle c;
    private String d;

    /* loaded from: classes4.dex */
    public enum b {
        GET,
        HEAD,
        POST
    }

    /* loaded from: classes4.dex */
    public enum c {
        download,
        reportAd,
        requestConfig,
        requestLocalAd,
        requestWillPlayAd,
        trackEvent,
        trackInstall,
        unfilledAd,
        reportExceptions,
        appFingerprint
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract b a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract c b();

    public final String c() {
        return this.b;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final void a(Bundle bundle) {
        this.c = bundle;
    }

    public final Bundle d() {
        return this.c;
    }

    public final String b(String str) {
        if (this.c == null) {
            return null;
        }
        return this.c.getString(str);
    }

    public final String e() {
        return b("Content-Encoding");
    }

    public final String f() {
        return this.d;
    }

    public String toString() {
        return "{" + b() + "}";
    }

    /* loaded from: classes4.dex */
    public static abstract class a<T extends tr> {
        protected abstract T b();

        /* JADX INFO: Access modifiers changed from: protected */
        public T c() {
            T b = b();
            b.a(new Bundle());
            return b;
        }
    }
}
