package e.d.e.c0.z;

import e.d.e.a0;
import e.d.e.v;
import e.d.e.y;
import e.d.e.z;
/* loaded from: classes2.dex */
public final class d implements a0 {
    public final e.d.e.c0.g a;

    public d(e.d.e.c0.g gVar) {
        this.a = gVar;
    }

    @Override // e.d.e.a0
    public <T> z<T> a(e.d.e.j jVar, e.d.e.d0.a<T> aVar) {
        e.d.e.b0.a aVar2 = (e.d.e.b0.a) aVar.a.getAnnotation(e.d.e.b0.a.class);
        if (aVar2 == null) {
            return null;
        }
        return (z<T>) b(this.a, jVar, aVar, aVar2);
    }

    public z<?> b(e.d.e.c0.g gVar, e.d.e.j jVar, e.d.e.d0.a<?> aVar, e.d.e.b0.a aVar2) {
        z<?> mVar;
        Object a = gVar.a(new e.d.e.d0.a(aVar2.value())).a();
        if (a instanceof z) {
            mVar = (z) a;
        } else if (a instanceof a0) {
            mVar = ((a0) a).a(jVar, aVar);
        } else {
            boolean z = a instanceof v;
            if (!z && !(a instanceof e.d.e.n)) {
                StringBuilder y = e.a.d.a.a.y("Invalid attempt to bind an instance of ");
                y.append(a.getClass().getName());
                y.append(" as a @JsonAdapter for ");
                y.append(aVar.toString());
                y.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(y.toString());
            }
            mVar = new m<>(z ? (v) a : null, a instanceof e.d.e.n ? (e.d.e.n) a : null, jVar, aVar, null);
        }
        return (mVar == null || !aVar2.nullSafe()) ? mVar : new y(mVar);
    }
}
