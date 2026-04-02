package com.google.firebase.components;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.components.Component;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class zzf extends a {
    private final List<Component<?>> a;
    private final Map<Class<?>, i<?>> b = new HashMap();
    private final g c;

    @Override // com.google.firebase.components.a, com.google.firebase.components.ComponentContainer
    public final /* bridge */ /* synthetic */ Object get(Class cls) {
        return super.get(cls);
    }

    public zzf(Executor executor, Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
        this.c = new g(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Component.of(this.c, g.class, Subscriber.class, Publisher.class));
        for (ComponentRegistrar componentRegistrar : iterable) {
            arrayList.addAll(componentRegistrar.getComponents());
        }
        Collections.addAll(arrayList, componentArr);
        this.a = Collections.unmodifiableList(Component.AnonymousClass1.a(arrayList));
        for (Component<?> component : this.a) {
            a(component);
        }
        a();
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final <T> Provider<T> getProvider(Class<T> cls) {
        Preconditions.checkNotNull(cls, "Null interface requested.");
        return this.b.get(cls);
    }

    public final void zza(boolean z) {
        for (Component<?> component : this.a) {
            if (component.zze() || (component.zzf() && z)) {
                get(component.zza().iterator().next());
            }
        }
        this.c.a();
    }

    private <T> void a(Component<T> component) {
        i<?> iVar = new i<>(component.zzc(), new k(component, this));
        for (Class<? super T> cls : component.zza()) {
            this.b.put(cls, iVar);
        }
    }

    private void a() {
        for (Component<?> component : this.a) {
            for (Dependency dependency : component.zzb()) {
                if (dependency.zzb() && !this.b.containsKey(dependency.zza())) {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component, dependency.zza()));
                }
            }
        }
    }
}
