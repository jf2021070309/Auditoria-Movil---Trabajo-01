package com.amazon.aps.iva.kr;

import okhttp3.Request;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c {
    public final /* synthetic */ Request.Builder a;

    public final void a(String str, String str2) {
        Request.Builder builder = this.a;
        builder.removeHeader(str);
        builder.addHeader(str, str2);
    }
}
