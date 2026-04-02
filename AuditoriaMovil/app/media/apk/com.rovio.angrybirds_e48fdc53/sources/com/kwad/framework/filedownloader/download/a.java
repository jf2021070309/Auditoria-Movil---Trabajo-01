package com.kwad.framework.filedownloader.download;
/* loaded from: classes.dex */
public final class a {
    final long acw;
    final long acx;
    final long acy;
    final long contentLength;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(long j, long j2, long j3, long j4) {
        this.acw = j;
        this.acx = j2;
        this.acy = j3;
        this.contentLength = j4;
    }

    public final String toString() {
        return com.kwad.framework.filedownloader.f.f.b("range[%d, %d) current offset[%d]", Long.valueOf(this.acw), Long.valueOf(this.acy), Long.valueOf(this.acx));
    }
}
