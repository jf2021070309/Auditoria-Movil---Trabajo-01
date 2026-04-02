package c.i.k;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import c.i.k.d0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class j {
    public static boolean a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f2161b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f2162c;

    /* renamed from: d  reason: collision with root package name */
    public static Field f2163d;

    /* loaded from: classes.dex */
    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        int indexOfKey;
        AtomicInteger atomicInteger = d0.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = d0.q.a;
            d0.q qVar = (d0.q) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (qVar == null) {
                qVar = new d0.q();
                view.setTag(R.id.tag_unhandled_key_event_manager, qVar);
            }
            WeakReference<KeyEvent> weakReference = qVar.f2147d;
            if (weakReference == null || weakReference.get() != keyEvent) {
                qVar.f2147d = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                if (qVar.f2146c == null) {
                    qVar.f2146c = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = qVar.f2146c;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view2 = weakReference2.get();
                    if (view2 == null || !d0.f.b(view2)) {
                        return true;
                    }
                    qVar.b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(c.i.k.j.a r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.superDispatchKeyEvent(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L80
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L63
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L63
            if (r8 == 0) goto L63
            boolean r1 = c.i.k.j.a
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            c.i.k.j.f2161b = r1     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            c.i.k.j.a = r3
        L4c:
            java.lang.reflect.Method r1 = c.i.k.j.f2161b
            if (r1 == 0) goto L60
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L5f
            r4[r0] = r10     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L5f
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L5f
            goto L60
        L5f:
        L60:
            if (r0 == 0) goto L63
            goto L7f
        L63:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6a
            goto L7f
        L6a:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = c.i.k.d0.f(r7, r10)
            if (r8 == 0) goto L75
            goto L7f
        L75:
            if (r7 == 0) goto L7b
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7b:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L7f:
            return r3
        L80:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld3
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = c.i.k.j.f2162c
            if (r7 != 0) goto L99
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L97
            c.i.k.j.f2163d = r7     // Catch: java.lang.NoSuchFieldException -> L97
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L97
        L97:
            c.i.k.j.f2162c = r3
        L99:
            java.lang.reflect.Field r7 = c.i.k.j.f2163d
            if (r7 == 0) goto La4
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La4
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La4
            goto La5
        La4:
            r7 = r2
        La5:
            if (r7 == 0) goto Lb2
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb2
            goto Ld2
        Lb2:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbd
            goto Ld2
        Lbd:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = c.i.k.d0.f(r7, r10)
            if (r8 == 0) goto Lc8
            goto Ld2
        Lc8:
            if (r7 == 0) goto Lce
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Lce:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld2:
            return r3
        Ld3:
            if (r8 == 0) goto Ldb
            boolean r8 = c.i.k.d0.f(r8, r10)
            if (r8 != 0) goto Le1
        Ldb:
            boolean r7 = r7.superDispatchKeyEvent(r10)
            if (r7 == 0) goto Le2
        Le1:
            r0 = 1
        Le2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.i.k.j.b(c.i.k.j$a, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
