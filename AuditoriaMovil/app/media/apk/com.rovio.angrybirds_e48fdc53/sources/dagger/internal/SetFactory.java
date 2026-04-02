package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class SetFactory<T> implements Factory<Set<T>> {
    private static final Factory<Set<Object>> a = new Factory<Set<Object>>() { // from class: dagger.internal.SetFactory.1
        @Override // javax.inject.Provider
        /* renamed from: a */
        public Set<Object> get() {
            return Collections.emptySet();
        }
    };
    private final List<Provider<T>> b;
    private final List<Provider<Collection<T>>> c;

    public static <T> Factory<Set<T>> empty() {
        return (Factory<Set<T>>) a;
    }

    public static <T> Builder<T> builder(int i, int i2) {
        return new Builder<>(i, i2);
    }

    /* loaded from: classes4.dex */
    public static final class Builder<T> {
        static final /* synthetic */ boolean a;
        private final List<Provider<T>> b;
        private final List<Provider<Collection<T>>> c;

        static {
            a = !SetFactory.class.desiredAssertionStatus();
        }

        private Builder(int i, int i2) {
            this.b = DaggerCollections.presizedList(i);
            this.c = DaggerCollections.presizedList(i2);
        }

        public Builder<T> addProvider(Provider<? extends T> provider) {
            if (a || provider != null) {
                this.b.add(provider);
                return this;
            }
            throw new AssertionError("Codegen error? Null provider");
        }

        public Builder<T> addCollectionProvider(Provider<? extends Collection<? extends T>> provider) {
            if (a || provider != null) {
                this.c.add(provider);
                return this;
            }
            throw new AssertionError("Codegen error? Null provider");
        }

        public SetFactory<T> build() {
            if (a || !DaggerCollections.hasDuplicates(this.b)) {
                if (a || !DaggerCollections.hasDuplicates(this.c)) {
                    return new SetFactory<>(this.b, this.c);
                }
                throw new AssertionError("Codegen error?  Duplicates in the provider list");
            }
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
    }

    private SetFactory(List<Provider<T>> list, List<Provider<Collection<T>>> list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // javax.inject.Provider
    public Set<T> get() {
        int size = this.b.size();
        ArrayList arrayList = new ArrayList(this.c.size());
        int size2 = this.c.size();
        int i = size;
        for (int i2 = 0; i2 < size2; i2++) {
            Collection<T> collection = this.c.get(i2).get();
            i += collection.size();
            arrayList.add(collection);
        }
        HashSet a2 = DaggerCollections.a(i);
        int size3 = this.b.size();
        for (int i3 = 0; i3 < size3; i3++) {
            a2.add(Preconditions.checkNotNull(this.b.get(i3).get()));
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object obj : (Collection) arrayList.get(i4)) {
                a2.add(Preconditions.checkNotNull(obj));
            }
        }
        return Collections.unmodifiableSet(a2);
    }
}
