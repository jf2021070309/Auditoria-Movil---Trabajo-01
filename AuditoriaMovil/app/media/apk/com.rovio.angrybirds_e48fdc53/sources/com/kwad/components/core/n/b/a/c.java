package com.kwad.components.core.n.b.a;

import com.kwad.components.offline.api.core.api.IEncrypt;
import com.kwad.sdk.utils.ad;
import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
final class c implements IEncrypt {
    @Override // com.kwad.components.offline.api.core.api.IEncrypt
    public final String getFileMD5(File file) {
        return com.kwad.sdk.utils.a.getFileMD5(file);
    }

    @Override // com.kwad.components.offline.api.core.api.IEncrypt
    public final byte[] getFileMD5Digest(File file) {
        try {
            return com.kwad.sdk.utils.a.getFileMD5Digest(file);
        } catch (IOException e) {
            return null;
        }
    }

    @Override // com.kwad.components.offline.api.core.api.IEncrypt
    public final String getMD5(String str) {
        return ad.bq(str);
    }

    @Override // com.kwad.components.offline.api.core.api.IEncrypt
    public final String getResponseData(String str) {
        return com.kwad.sdk.core.a.d.getResponseData(str);
    }
}
