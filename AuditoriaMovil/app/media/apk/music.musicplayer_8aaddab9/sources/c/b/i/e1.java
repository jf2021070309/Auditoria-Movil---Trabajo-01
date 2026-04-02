package c.b.i;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class e1 {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1133b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f1134c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f1135d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f1136e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1137f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1138g;

    public e1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1135d = layoutParams;
        this.f1136e = new Rect();
        this.f1137f = new int[2];
        this.f1138g = new int[2];
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1133b = inflate;
        this.f1134c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(e1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131886087;
        layoutParams.flags = 24;
    }

    public void a() {
        if (this.f1133b.getParent() != null) {
            ((WindowManager) this.a.getSystemService("window")).removeView(this.f1133b);
        }
    }
}
