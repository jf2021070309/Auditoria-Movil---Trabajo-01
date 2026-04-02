package com.ellation.crunchyroll.api.drm;

import android.util.Base64;
import com.amazon.aps.iva.oe0.a;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: DrmAuthParamsEncoderImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/api/drm/DrmAuthParamsEncoderImpl;", "Lcom/ellation/crunchyroll/api/drm/DrmAuthParamsEncoder;", "()V", "encode", "", "data", "cr-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DrmAuthParamsEncoderImpl implements DrmAuthParamsEncoder {
    public static final int $stable = 0;

    @Override // com.ellation.crunchyroll.api.drm.DrmAuthParamsEncoder
    public String encode(String str) {
        j.f(str, "data");
        byte[] bytes = str.getBytes(a.b);
        j.e(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        j.e(encodeToString, "encodeToString(data.enco…eArray(), Base64.DEFAULT)");
        return encodeToString;
    }
}
