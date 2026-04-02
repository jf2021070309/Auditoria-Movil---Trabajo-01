package e.d.b.d.f;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
/* loaded from: classes2.dex */
public class b extends FloatingActionButton.a {
    public final /* synthetic */ int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f6365b;

    /* loaded from: classes2.dex */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public void b(FloatingActionButton floatingActionButton) {
            BottomAppBar.w(b.this.f6365b);
        }
    }

    public b(BottomAppBar bottomAppBar, int i2) {
        this.f6365b = bottomAppBar;
        this.a = i2;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f6365b.A(this.a));
        floatingActionButton.m(new a(), true);
    }
}
