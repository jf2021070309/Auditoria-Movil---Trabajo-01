package com.google.common.escape;

import com.amazon.aps.iva.f90.a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.errorprone.annotations.DoNotMock;
@DoNotMock("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public abstract class Escaper {
    private final Function<String, String> asFunction = new a(this, 0);

    public final Function<String, String> asFunction() {
        return this.asFunction;
    }

    public abstract String escape(String str);
}
