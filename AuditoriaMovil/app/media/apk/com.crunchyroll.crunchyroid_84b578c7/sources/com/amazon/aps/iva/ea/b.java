package com.amazon.aps.iva.ea;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.amazon.aps.iva.z9.e0;
import java.util.Map;
/* compiled from: ImageAssetManager.java */
/* loaded from: classes.dex */
public final class b {
    public static final Object d = new Object();
    public final Context a;
    public final String b;
    public final Map<String, e0> c;

    public b(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.b = str.concat("/");
        } else {
            this.b = str;
        }
        this.c = map;
        if (!(callback instanceof View)) {
            this.a = null;
        } else {
            this.a = ((View) callback).getContext().getApplicationContext();
        }
    }
}
