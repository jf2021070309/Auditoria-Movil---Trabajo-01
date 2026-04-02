package com.google.android.play.core.review;

import android.app.PendingIntent;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class a extends ReviewInfo {
    public final PendingIntent a;

    public a(PendingIntent pendingIntent) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.a = pendingIntent;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.a.equals(((ReviewInfo) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return e.a.d.a.a.s(new StringBuilder(valueOf.length() + 26), "ReviewInfo{pendingIntent=", valueOf, "}");
    }
}
