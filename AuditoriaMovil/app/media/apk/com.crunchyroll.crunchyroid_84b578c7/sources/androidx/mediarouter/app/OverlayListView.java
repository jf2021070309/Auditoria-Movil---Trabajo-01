package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import androidx.mediarouter.app.a;
import com.amazon.aps.iva.e4.t0;
import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    public final ArrayList b;

    /* loaded from: classes.dex */
    public static class a {
        public final BitmapDrawable a;
        public final Rect c;
        public Interpolator d;
        public long e;
        public final Rect f;
        public int g;
        public long j;
        public boolean k;
        public boolean l;
        public InterfaceC0039a m;
        public float b = 1.0f;
        public float h = 1.0f;
        public float i = 1.0f;

        /* renamed from: androidx.mediarouter.app.OverlayListView$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0039a {
        }

        public a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.a = bitmapDrawable;
            this.f = rect;
            Rect rect2 = new Rect(rect);
            this.c = rect2;
            if (bitmapDrawable != null) {
                bitmapDrawable.setAlpha((int) (this.b * 255.0f));
                bitmapDrawable.setBounds(rect2);
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float interpolation;
        boolean z;
        super.onDraw(canvas);
        ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                BitmapDrawable bitmapDrawable = aVar.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (aVar.l) {
                    z = false;
                } else {
                    float f = 0.0f;
                    float max = Math.max(0.0f, Math.min(1.0f, ((float) (drawingTime - aVar.j)) / ((float) aVar.e)));
                    if (aVar.k) {
                        f = max;
                    }
                    Interpolator interpolator = aVar.d;
                    if (interpolator == null) {
                        interpolation = f;
                    } else {
                        interpolation = interpolator.getInterpolation(f);
                    }
                    int i = (int) (aVar.g * interpolation);
                    Rect rect = aVar.f;
                    Rect rect2 = aVar.c;
                    rect2.top = rect.top + i;
                    rect2.bottom = rect.bottom + i;
                    float f2 = aVar.h;
                    float a2 = t0.a(aVar.i, f2, interpolation, f2);
                    aVar.b = a2;
                    BitmapDrawable bitmapDrawable2 = aVar.a;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (a2 * 255.0f));
                        bitmapDrawable2.setBounds(rect2);
                    }
                    if (aVar.k && f >= 1.0f) {
                        aVar.l = true;
                        a.InterfaceC0039a interfaceC0039a = aVar.m;
                        if (interfaceC0039a != null) {
                            a.C0040a c0040a = (a.C0040a) interfaceC0039a;
                            androidx.mediarouter.app.a aVar2 = androidx.mediarouter.app.a.this;
                            aVar2.mGroupMemberRoutesAnimatingWithBitmap.remove(c0040a.a);
                            aVar2.mVolumeGroupAdapter.notifyDataSetChanged();
                        }
                    }
                    z = !aVar.l;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
    }
}
