package androidx.lifecycle;

import androidx.lifecycle.g;
import kotlin.Metadata;
/* compiled from: DefaultLifecycleObserverAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/j;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements j {
    public final com.amazon.aps.iva.i5.g b;
    public final j c;

    /* compiled from: DefaultLifecycleObserverAdapter.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.a.values().length];
            try {
                iArr[g.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[g.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[g.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(com.amazon.aps.iva.i5.g gVar, j jVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "defaultLifecycleObserver");
        this.b = gVar;
        this.c = jVar;
    }

    @Override // androidx.lifecycle.j
    public final void U2(com.amazon.aps.iva.i5.o oVar, g.a aVar) {
        int i = a.a[aVar.ordinal()];
        com.amazon.aps.iva.i5.g gVar = this.b;
        switch (i) {
            case 1:
                gVar.onCreate(oVar);
                break;
            case 2:
                gVar.onStart(oVar);
                break;
            case 3:
                gVar.onResume(oVar);
                break;
            case 4:
                gVar.onPause(oVar);
                break;
            case 5:
                gVar.onStop(oVar);
                break;
            case 6:
                gVar.onDestroy(oVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        j jVar = this.c;
        if (jVar != null) {
            jVar.U2(oVar, aVar);
        }
    }
}
