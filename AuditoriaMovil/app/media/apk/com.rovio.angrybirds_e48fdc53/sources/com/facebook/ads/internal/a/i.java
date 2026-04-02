package com.facebook.ads.internal.a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.j.a;
/* loaded from: classes2.dex */
public class i extends a {
    private static final String d = i.class.getSimpleName();
    private final Uri e;

    public i(Context context, com.facebook.ads.internal.m.c cVar, String str, Uri uri) {
        super(context, cVar, str);
        this.e = uri;
    }

    @Override // com.facebook.ads.internal.a.a
    public a.EnumC0112a a() {
        return a.EnumC0112a.OPEN_LINK;
    }

    @Override // com.facebook.ads.internal.a.a
    public void b() {
        try {
            Log.w("REDIRECTACTION: ", this.e.toString());
            com.facebook.ads.internal.q.c.g.a(new com.facebook.ads.internal.q.c.g(), this.a, this.e, this.c);
        } catch (Exception e) {
            Log.d(d, "Failed to open link url: " + this.e.toString(), e);
        }
    }
}
