package com.google.net.cronet.okhttptransport;

import java.io.IOException;
import okhttp3.RequestBody;
import org.chromium.net.UploadDataProvider;
/* loaded from: classes4.dex */
interface RequestBodyConverter {
    UploadDataProvider convertRequestBody(RequestBody requestBody, int i) throws IOException;
}
