package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import kotlin.Metadata;
/* compiled from: TypeAdapter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/TypeAdapter;", "", "Lcom/google/gson/GsonBuilder;", "builder", "Lcom/amazon/aps/iva/kb0/q;", "registerAdapter", "Ljava/lang/reflect/Type;", "type", "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "adapter", "Ljava/lang/Object;", "getAdapter", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TypeAdapter {
    public static final int $stable = 8;
    private final Object adapter;
    private final Type type;

    public TypeAdapter(Type type, Object obj) {
        j.f(type, "type");
        j.f(obj, "adapter");
        this.type = type;
        this.adapter = obj;
    }

    public final Object getAdapter() {
        return this.adapter;
    }

    public final Type getType() {
        return this.type;
    }

    public final void registerAdapter(GsonBuilder gsonBuilder) {
        j.f(gsonBuilder, "builder");
        gsonBuilder.registerTypeAdapter(this.type, this.adapter);
    }
}
