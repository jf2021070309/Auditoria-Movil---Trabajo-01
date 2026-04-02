package com.kwad.components.core.n.b.a;

import com.kwad.components.offline.api.core.api.IZipper;
import com.kwad.sdk.utils.br;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
final class l implements IZipper {
    @Override // com.kwad.components.offline.api.core.api.IZipper
    public final boolean unZip(InputStream inputStream, String str) {
        return br.unZip(inputStream, str);
    }

    @Override // com.kwad.components.offline.api.core.api.IZipper
    public final boolean zip(File file, File file2) {
        return br.zip(file, file2);
    }

    @Override // com.kwad.components.offline.api.core.api.IZipper
    public final void zipFile(File file) {
        br.zipFile(file);
    }
}
