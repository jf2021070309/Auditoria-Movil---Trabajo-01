package com.amazon.aps.iva.fc0;

import java.util.List;
import java.util.Map;
/* compiled from: KCallable.kt */
/* loaded from: classes4.dex */
public interface c<R> extends b {
    R call(Object... objArr);

    R callBy(Map<k, ? extends Object> map);

    String getName();

    List<k> getParameters();

    p getReturnType();

    List<q> getTypeParameters();

    t getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
