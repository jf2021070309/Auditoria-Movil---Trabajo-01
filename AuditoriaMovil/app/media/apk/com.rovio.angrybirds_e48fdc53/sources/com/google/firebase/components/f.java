package com.google.firebase.components;

import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2.dex */
final class f {
    private final Component<?> a;
    private final Set<f> b = new HashSet();
    private final Set<f> c = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Component<?> component) {
        this.a = component;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(f fVar) {
        this.b.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(f fVar) {
        this.c.add(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<f> a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(f fVar) {
        this.c.remove(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Component<?> b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.c.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return this.b.isEmpty();
    }
}
