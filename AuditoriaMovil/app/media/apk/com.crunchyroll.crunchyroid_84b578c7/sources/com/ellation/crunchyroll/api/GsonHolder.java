package com.ellation.crunchyroll.api;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.Metadata;
/* compiled from: GsonHolder.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/api/GsonHolder;", "", "()V", "instance", "Lcom/google/gson/Gson;", "getInstance", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GsonHolder {
    public static final int $stable;
    public static final GsonHolder INSTANCE = new GsonHolder();
    private static final Gson instance;

    static {
        Gson create = new GsonBuilder().setDateFormat(DateFormatKt.DATE_FORMAT).create();
        j.e(create, "GsonBuilder().setDateFormat(DATE_FORMAT).create()");
        instance = create;
        $stable = 8;
    }

    private GsonHolder() {
    }

    public static final Gson getInstance() {
        return instance;
    }
}
