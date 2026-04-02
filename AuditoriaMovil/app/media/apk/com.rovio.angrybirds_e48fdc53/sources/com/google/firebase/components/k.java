package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2.dex */
final class k extends com.google.firebase.components.a {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;
    private final ComponentContainer d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Component<?> component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (Dependency dependency : component.zzb()) {
            if (dependency.zzc()) {
                hashSet.add(dependency.zza());
            } else {
                hashSet2.add(dependency.zza());
            }
        }
        if (!component.zzd().isEmpty()) {
            hashSet.add(Publisher.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = component.zzd();
        this.d = componentContainer;
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.ComponentContainer
    public final <T> T get(Class<T> cls) {
        if (!this.a.contains(cls)) {
            throw new IllegalArgumentException(String.format("Requesting %s is not allowed.", cls));
        }
        T t = (T) this.d.get(cls);
        if (cls.equals(Publisher.class)) {
            return (T) new a(this.c, (Publisher) t);
        }
        return t;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final <T> Provider<T> getProvider(Class<T> cls) {
        if (!this.b.contains(cls)) {
            throw new IllegalArgumentException(String.format("Requesting Provider<%s> is not allowed.", cls));
        }
        return this.d.getProvider(cls);
    }

    /* loaded from: classes2.dex */
    static class a implements Publisher {
        private final Set<Class<?>> a;
        private final Publisher b;

        public a(Set<Class<?>> set, Publisher publisher) {
            this.a = set;
            this.b = publisher;
        }

        @Override // com.google.firebase.events.Publisher
        public final void publish(Event<?> event) {
            if (!this.a.contains(event.getType())) {
                throw new IllegalArgumentException(String.format("Attempting to publish an undeclared event %s.", event));
            }
            this.b.publish(event);
        }
    }
}
