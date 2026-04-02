package e.g.a.c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import c.i.i.b;
import e.g.a.e.a;
import e.h.g.v0;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes2.dex */
public abstract class c<VH extends e.g.a.e.a> implements f<VH> {
    public static ExecutorService a = Executors.newFixedThreadPool(3);

    public static void h(TextView textView, final CharSequence charSequence) {
        if (textView == null || charSequence == null) {
            return;
        }
        if (!(textView instanceof AppCompatTextView)) {
            if (!v0.h()) {
                textView.setText(charSequence);
                return;
            }
            final b.a I = c.i.a.I(textView);
            final WeakReference weakReference = new WeakReference(textView);
            a.submit(new Runnable() { // from class: e.g.a.c.a
                @Override // java.lang.Runnable
                public final void run() {
                    final WeakReference weakReference2 = weakReference;
                    CharSequence charSequence2 = charSequence;
                    b.a aVar = I;
                    TextView textView2 = (TextView) weakReference2.get();
                    if (textView2 == null) {
                        return;
                    }
                    final c.i.i.b a2 = c.i.i.b.a(charSequence2, aVar);
                    textView2.post(new Runnable() { // from class: e.g.a.c.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            WeakReference weakReference3 = weakReference2;
                            c.i.i.b bVar = a2;
                            TextView textView3 = (TextView) weakReference3.get();
                            if (textView3 == null) {
                                return;
                            }
                            textView3.setText(bVar);
                        }
                    });
                }
            });
            return;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) textView;
        b.a I2 = c.i.a.I(textView);
        Executor executor = a;
        Object obj = c.i.i.b.a;
        b.C0038b c0038b = new b.C0038b(I2, charSequence);
        if (executor == null) {
            synchronized (c.i.i.b.a) {
                if (c.i.i.b.f2113b == null) {
                    c.i.i.b.f2113b = Executors.newFixedThreadPool(1);
                }
                executor = c.i.i.b.f2113b;
            }
        }
        executor.execute(c0038b);
        appCompatTextView.setTextFuture(c0038b);
    }

    @Override // e.g.a.c.f
    public int a() {
        return g();
    }

    @Override // e.g.a.c.f
    public void b(RecyclerView.a0 a0Var) {
        ((e.g.a.e.a) a0Var).y(this);
    }

    @Override // e.g.a.c.f
    public void d(RecyclerView.a0 a0Var, int i2, List list) {
        ((e.g.a.e.a) a0Var).y(this);
    }

    public View f(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(g(), viewGroup, false);
    }

    public abstract int g();
}
