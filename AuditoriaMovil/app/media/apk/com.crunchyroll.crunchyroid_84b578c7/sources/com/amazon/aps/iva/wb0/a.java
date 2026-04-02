package com.amazon.aps.iva.wb0;

import com.amazon.aps.iva.yb0.j;
/* compiled from: KotlinReflectionNotSupportedError.kt */
/* loaded from: classes4.dex */
public final class a extends Error {
    public a() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(str);
        j.f(str, "message");
    }
}
