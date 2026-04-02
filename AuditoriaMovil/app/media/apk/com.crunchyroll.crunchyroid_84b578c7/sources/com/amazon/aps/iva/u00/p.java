package com.amazon.aps.iva.u00;

import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
/* compiled from: BulkDownloadUiModel.kt */
/* loaded from: classes2.dex */
public final class p {
    public final o a;
    public final DownloadButtonState b;
    public final boolean c;

    public p(o oVar, DownloadButtonState downloadButtonState, boolean z) {
        com.amazon.aps.iva.yb0.j.f(oVar, "textState");
        com.amazon.aps.iva.yb0.j.f(downloadButtonState, "buttonState");
        this.a = oVar;
        this.b = downloadButtonState;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, pVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, pVar.b) && this.c == pVar.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BulkDownloadUiModel(textState=");
        sb.append(this.a);
        sb.append(", buttonState=");
        sb.append(this.b);
        sb.append(", isButtonEnabled=");
        return com.amazon.aps.iva.e4.e.c(sb, this.c, ")");
    }
}
