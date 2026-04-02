package e.d.b.d.m;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
/* loaded from: classes2.dex */
public final class d<S> extends t<S> {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f6418b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f6419c;

    /* renamed from: d  reason: collision with root package name */
    public DateSelector<S> f6420d;

    /* renamed from: e  reason: collision with root package name */
    public CalendarConstraints f6421e;

    /* renamed from: f  reason: collision with root package name */
    public Month f6422f;

    /* renamed from: g  reason: collision with root package name */
    public e f6423g;

    /* renamed from: h  reason: collision with root package name */
    public e.d.b.d.m.b f6424h;

    /* renamed from: i  reason: collision with root package name */
    public RecyclerView f6425i;

    /* renamed from: j  reason: collision with root package name */
    public RecyclerView f6426j;

    /* renamed from: k  reason: collision with root package name */
    public View f6427k;

    /* renamed from: l  reason: collision with root package name */
    public View f6428l;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public final /* synthetic */ int a;

        public a(int i2) {
            this.a = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = d.this.f6426j;
            int i2 = this.a;
            if (recyclerView.F) {
                return;
            }
            RecyclerView.m mVar = recyclerView.t;
            if (mVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                mVar.Y0(recyclerView, recyclerView.t0, i2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends c.i.k.e {
        public b(d dVar) {
        }

        @Override // c.i.k.e
        public void d(View view, c.i.k.k0.b bVar) {
            this.f2148b.onInitializeAccessibilityNodeInfo(view, bVar.f2193b);
            bVar.i(null);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends u {
        public final /* synthetic */ int G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i2, boolean z, int i3) {
            super(context, i2, z);
            this.G = i3;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void b1(RecyclerView.x xVar, int[] iArr) {
            if (this.G == 0) {
                iArr[0] = d.this.f6426j.getWidth();
                iArr[1] = d.this.f6426j.getWidth();
                return;
            }
            iArr[0] = d.this.f6426j.getHeight();
            iArr[1] = d.this.f6426j.getHeight();
        }
    }

    /* renamed from: e.d.b.d.m.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0141d implements f {
        public C0141d() {
        }
    }

    /* loaded from: classes2.dex */
    public enum e {
        DAY,
        YEAR
    }

    /* loaded from: classes2.dex */
    public interface f {
    }

    @Override // e.d.b.d.m.t
    public boolean b(s<S> sVar) {
        return this.a.add(sVar);
    }

    public LinearLayoutManager c() {
        return (LinearLayoutManager) this.f6426j.getLayoutManager();
    }

    public final void d(int i2) {
        this.f6426j.post(new a(i2));
    }

    public void e(Month month) {
        r rVar = (r) this.f6426j.getAdapter();
        int i2 = rVar.f6460e.a.i(month);
        int k2 = i2 - rVar.k(this.f6422f);
        boolean z = Math.abs(k2) > 3;
        boolean z2 = k2 > 0;
        this.f6422f = month;
        if (z && z2) {
            this.f6426j.n0(i2 - 3);
            d(i2);
        } else if (!z) {
            d(i2);
        } else {
            this.f6426j.n0(i2 + 3);
            d(i2);
        }
    }

    public void f(e eVar) {
        this.f6423g = eVar;
        if (eVar == e.YEAR) {
            this.f6425i.getLayoutManager().O0(((y) this.f6425i.getAdapter()).j(this.f6422f.f4639c));
            this.f6427k.setVisibility(0);
            this.f6428l.setVisibility(8);
        } else if (eVar == e.DAY) {
            this.f6427k.setVisibility(8);
            this.f6428l.setVisibility(0);
            e(this.f6422f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f6419c = bundle.getInt("THEME_RES_ID_KEY");
        this.f6420d = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f6421e = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f6422f = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x018d, code lost:
        r13 = new c.u.b.z();
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.b.d.m.d.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f6419c);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f6420d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6421e);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f6422f);
    }
}
