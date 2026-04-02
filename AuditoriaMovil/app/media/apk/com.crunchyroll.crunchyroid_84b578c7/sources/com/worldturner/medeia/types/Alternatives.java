package com.worldturner.medeia.types;

import com.amazon.aps.iva.kb0.c;
import com.amazon.aps.iva.yb0.e;
import kotlin.Metadata;
/* compiled from: Alternatives.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/worldturner/medeia/types/Alternatives;", "A", "B", "", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getA", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getB", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public class Alternatives<A, B> {
    private final A a;
    private final B b;

    public Alternatives() {
        this(null, null, 3, null);
    }

    public final A getA() {
        return this.a;
    }

    public final B getB() {
        return this.b;
    }

    public Alternatives(A a, B b) {
        this.a = a;
        this.b = b;
        if (!((a == null) ^ (b == null))) {
            throw new c("Either a or b has to be non-null, not both or neither");
        }
    }

    public /* synthetic */ Alternatives(Object obj, Object obj2, int i, e eVar) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2);
    }
}
