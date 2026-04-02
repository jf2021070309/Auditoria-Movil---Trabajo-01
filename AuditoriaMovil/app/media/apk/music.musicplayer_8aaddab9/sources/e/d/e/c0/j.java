package e.d.e.c0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public class j<T> implements t<T> {
    public final /* synthetic */ Type a;

    public j(g gVar, Type type) {
        this.a = type;
    }

    @Override // e.d.e.c0.t
    public T a() {
        Type type = this.a;
        if (!(type instanceof ParameterizedType)) {
            StringBuilder y = e.a.d.a.a.y("Invalid EnumSet type: ");
            y.append(this.a.toString());
            throw new e.d.e.p(y.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return (T) EnumSet.noneOf((Class) type2);
        }
        StringBuilder y2 = e.a.d.a.a.y("Invalid EnumSet type: ");
        y2.append(this.a.toString());
        throw new e.d.e.p(y2.toString());
    }
}
