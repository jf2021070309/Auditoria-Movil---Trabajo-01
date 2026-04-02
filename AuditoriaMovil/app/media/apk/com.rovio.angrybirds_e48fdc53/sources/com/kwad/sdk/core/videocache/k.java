package com.kwad.sdk.core.videocache;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.facebook.ads.AudienceNetworkActivity;
import com.kwad.sdk.utils.ao;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
/* loaded from: classes.dex */
public final class k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(byte[] bArr, long j, int i) {
        ao.h(bArr, "Buffer must be not null!");
        boolean z = true;
        ao.checkArgument(j >= 0, "Data offset must be positive!");
        if (i < 0 || i > bArr.length) {
            z = false;
        }
        ao.checkArgument(z, "Length must be in range [0..buffer.length]");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String dU(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decode(String str) {
        try {
            return URLDecoder.decode(str, AudienceNetworkActivity.WEBVIEW_ENCODING);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error decoding url", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String encode(String str) {
        try {
            return URLEncoder.encode(str, AudienceNetworkActivity.WEBVIEW_ENCODING);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error encoding url", e);
        }
    }
}
