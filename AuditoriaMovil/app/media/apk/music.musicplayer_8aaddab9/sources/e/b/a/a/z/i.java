package e.b.a.a.z;

import e.b.a.a.z.k.k;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public enum i {
    CALLBACK(e.b.a.a.z.k.b.class, 0),
    CANCEL_RESULT_CALLBACK(e.b.a.a.z.k.d.class, 0),
    RUN_JOB(e.b.a.a.z.k.i.class, 0),
    COMMAND(e.b.a.a.z.k.e.class, 0),
    PUBLIC_QUERY(e.b.a.a.z.k.h.class, 0),
    JOB_CONSUMER_IDLE(e.b.a.a.z.k.g.class, 0),
    ADD_JOB(e.b.a.a.z.k.a.class, 1),
    CANCEL(e.b.a.a.z.k.c.class, 1),
    CONSTRAINT_CHANGE(e.b.a.a.z.k.f.class, 2),
    RUN_JOB_RESULT(e.b.a.a.z.k.j.class, 3),
    SCHEDULER(k.class, 4);
    
    public static final int MAX_PRIORITY;
    public static final Map<Class<? extends b>, i> mapping = new HashMap();
    public final Class<? extends b> klass;
    public final int priority;

    static {
        i[] values = values();
        int i2 = 0;
        for (int i3 = 0; i3 < 11; i3++) {
            i iVar = values[i3];
            mapping.put(iVar.klass, iVar);
            int i4 = iVar.priority;
            if (i4 > i2) {
                i2 = i4;
            }
        }
        MAX_PRIORITY = i2;
    }

    i(Class cls, int i2) {
        this.klass = cls;
        this.priority = i2;
    }
}
