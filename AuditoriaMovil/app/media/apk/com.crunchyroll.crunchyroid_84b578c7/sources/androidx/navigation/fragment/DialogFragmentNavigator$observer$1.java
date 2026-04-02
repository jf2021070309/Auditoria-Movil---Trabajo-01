package androidx.navigation.fragment;

import androidx.lifecycle.g;
import androidx.lifecycle.j;
import com.amazon.aps.iva.i5.o;
import kotlin.Metadata;
/* compiled from: DialogFragmentNavigator.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/navigation/fragment/DialogFragmentNavigator$observer$1", "Landroidx/lifecycle/j;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DialogFragmentNavigator$observer$1 implements j {

    /* compiled from: DialogFragmentNavigator.kt */
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
                iArr[g.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.a.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.a.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @Override // androidx.lifecycle.j
    public final void U2(o oVar, g.a aVar) {
        int i = a.a[aVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        androidx.fragment.app.g gVar = (androidx.fragment.app.g) oVar;
                        throw null;
                    }
                    return;
                } else if (((androidx.fragment.app.g) oVar).requireDialog().isShowing()) {
                    return;
                } else {
                    throw null;
                }
            }
            androidx.fragment.app.g gVar2 = (androidx.fragment.app.g) oVar;
            throw null;
        }
        androidx.fragment.app.g gVar3 = (androidx.fragment.app.g) oVar;
        throw null;
    }
}
