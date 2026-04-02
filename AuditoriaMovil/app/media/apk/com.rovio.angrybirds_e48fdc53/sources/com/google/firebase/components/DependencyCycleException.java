package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class DependencyCycleException extends DependencyException {
    private final List<Component<?>> a;

    public DependencyCycleException(List<Component<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.a = list;
    }

    public List<Component<?>> getComponentsInCycle() {
        return this.a;
    }
}
