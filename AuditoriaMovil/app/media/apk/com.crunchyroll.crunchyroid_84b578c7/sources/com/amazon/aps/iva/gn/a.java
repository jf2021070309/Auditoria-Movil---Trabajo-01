package com.amazon.aps.iva.gn;

import android.app.assist.AssistContent;
import android.net.Uri;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ImagesContract;
/* compiled from: ShareContentPresenter.kt */
/* loaded from: classes2.dex */
public final class a {
    public final /* synthetic */ AssistContent a;

    public a(AssistContent assistContent) {
        this.a = assistContent;
    }

    public final void a(String str) {
        j.f(str, ImagesContract.URL);
        Uri parse = Uri.parse(str);
        j.e(parse, "parse(this)");
        this.a.setWebUri(parse);
    }
}
