package com.kwad.framework.filedownloader;

import android.content.Context;
import com.kwad.framework.filedownloader.services.e;
import com.kwad.sdk.api.proxy.app.FileDownloadService;
/* loaded from: classes.dex */
public final class n implements u {
    private final u abz;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        private static final n abA = new n((byte) 0);
    }

    private n() {
        this.abz = com.kwad.framework.filedownloader.f.e.vR().aeY ? new o() : new p(FileDownloadService.SeparateProcessService.class);
    }

    /* synthetic */ n(byte b) {
        this();
    }

    public static n tR() {
        return a.abA;
    }

    public static e.a tS() {
        if (tR().abz instanceof o) {
            return (e.a) tR().abz;
        }
        return null;
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, com.kwad.framework.filedownloader.d.b bVar, boolean z3) {
        return this.abz.a(str, str2, z, i, i2, i3, z2, bVar, z3);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean aY(int i) {
        return this.abz.aY(i);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final byte aZ(int i) {
        return this.abz.aZ(i);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final void am(Context context) {
        this.abz.am(context);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean ba(int i) {
        return this.abz.ba(i);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean isConnected() {
        return this.abz.isConnected();
    }
}
