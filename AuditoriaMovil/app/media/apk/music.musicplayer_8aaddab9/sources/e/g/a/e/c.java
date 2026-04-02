package e.g.a.e;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c.i.k.d0;
import c.u.b.o;
import e.g.a.a.m;
import e.g.a.c.f;
import java.lang.ref.WeakReference;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class c extends o.d {

    /* renamed from: f  reason: collision with root package name */
    public f f8032f;

    /* renamed from: i  reason: collision with root package name */
    public WeakReference<m> f8035i;

    /* renamed from: j  reason: collision with root package name */
    public InterfaceC0173c f8036j;

    /* renamed from: l  reason: collision with root package name */
    public b f8038l;

    /* renamed from: m  reason: collision with root package name */
    public f f8039m;

    /* renamed from: d  reason: collision with root package name */
    public int f8030d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f8031e = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f8033g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f8034h = -1;

    /* renamed from: k  reason: collision with root package name */
    public a f8037k = null;

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(f fVar, int i2, f fVar2, int i3);
    }

    /* renamed from: e.g.a.e.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0173c {
        void a(int i2, int i3);
    }

    public c(m mVar, InterfaceC0173c interfaceC0173c, b bVar, a aVar) {
        this.f8035i = new WeakReference<>(mVar);
        this.f8036j = interfaceC0173c;
        this.f8038l = bVar;
    }

    @Override // c.u.b.o.d
    public void a(RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i2;
        View view = a0Var.f527b;
        if (Build.VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                d0.B(view, ((Float) tag).floatValue());
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        int i3 = this.f8034h;
        if (i3 != -1 && (i2 = this.f8033g) != -1) {
            this.f8038l.a(this.f8039m, i3, this.f8032f, i2);
        }
        this.f8039m = null;
        this.f8032f = null;
        this.f8034h = -1;
        this.f8033g = -1;
        this.f8030d = -1;
        this.f8031e = -1;
        a aVar = this.f8037k;
        if (aVar != null) {
            aVar.a();
        }
    }
}
