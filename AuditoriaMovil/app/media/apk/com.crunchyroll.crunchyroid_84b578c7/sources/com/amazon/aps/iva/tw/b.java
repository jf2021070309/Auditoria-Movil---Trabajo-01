package com.amazon.aps.iva.tw;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
/* compiled from: UserDownloadsStore.kt */
/* loaded from: classes2.dex */
public final class b {
    @SerializedName("a")
    private final String a;

    public b(String str) {
        j.f(str, "downloadId");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && j.a(this.a, ((b) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return defpackage.e.e("UserDownloadItem(downloadId=", this.a, ")");
    }
}
