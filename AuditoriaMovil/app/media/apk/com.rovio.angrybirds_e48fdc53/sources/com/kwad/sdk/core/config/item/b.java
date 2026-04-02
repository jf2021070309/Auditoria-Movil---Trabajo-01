package com.kwad.sdk.core.config.item;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class b<T> {
    private T amH;
    private T amI;
    private String mKey;

    public b(String str, T t) {
        this(str, t, t);
    }

    private b(String str, T t, T t2) {
        this.mKey = str;
        this.amI = t;
        this.amH = t2;
        com.kwad.sdk.core.config.b.a(this);
    }

    public static String cv(String str) {
        return !TextUtils.isEmpty(str) ? com.kwad.sdk.core.a.c.cR(str) : str;
    }

    public static String cw(String str) {
        return (TextUtils.isEmpty(str) || !com.kwad.sdk.core.a.c.cT(str)) ? str : com.kwad.sdk.core.a.c.cS(str);
    }

    public abstract void a(SharedPreferences sharedPreferences);

    public abstract void b(SharedPreferences.Editor editor);

    public final String getKey() {
        return this.mKey;
    }

    public T getValue() {
        return this.amI;
    }

    public abstract void h(JSONObject jSONObject);

    public final void setValue(T t) {
        this.amI = t;
    }

    public final T zY() {
        return this.amH;
    }
}
