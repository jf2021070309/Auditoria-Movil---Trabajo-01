package com.amazon.aps.iva.qg;

import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
/* compiled from: AssetDownloadingState.kt */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final DownloadButtonState b;

    public b(String str, DownloadButtonState downloadButtonState) {
        j.f(str, "downloadId");
        j.f(downloadButtonState, "downloadButtonState");
        this.a = str;
        this.b = downloadButtonState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.a, bVar.a) && j.a(this.b, bVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AssetDownloadingState(downloadId=" + this.a + ", downloadButtonState=" + this.b + ")";
    }
}
