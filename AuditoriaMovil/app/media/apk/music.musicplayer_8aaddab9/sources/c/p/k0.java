package c.p;
/* loaded from: classes.dex */
public class k0 implements i0 {
    public static k0 a;

    @Override // c.p.i0
    public <T extends g0> T a(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }
}
