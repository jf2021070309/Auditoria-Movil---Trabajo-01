package c.b.i;

import android.graphics.Typeface;
import android.widget.TextView;
/* loaded from: classes.dex */
public class z implements Runnable {
    public final /* synthetic */ TextView a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f1284b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1285c;

    public z(y yVar, TextView textView, Typeface typeface, int i2) {
        this.a = textView;
        this.f1284b = typeface;
        this.f1285c = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.setTypeface(this.f1284b, this.f1285c);
    }
}
