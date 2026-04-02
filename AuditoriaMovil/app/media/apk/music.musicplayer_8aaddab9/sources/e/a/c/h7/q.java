package e.a.c.h7;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import e.a.c.e7;
import e.a.c.h7.q;
import e.g.a.e.b;
import e.h.g.k1;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class q extends e.g.a.c.d<a> implements e.g.a.c.e {

    /* renamed from: d  reason: collision with root package name */
    public final e.a.c.w6.d f5093d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5094e;

    /* renamed from: f  reason: collision with root package name */
    public final WeakReference<e7> f5095f;

    /* loaded from: classes.dex */
    public static class a extends e.g.a.e.b<q> {
        public AppCompatTextView A;
        public ImageView B;
        public AppCompatTextView x;
        public ImageView y;
        public AppCompatTextView z;

        public a(View view, e.g.a.a.m mVar, b.a<q> aVar) {
            super(view, mVar, aVar);
            this.z = (AppCompatTextView) view.findViewById(R.id.line1);
            this.A = (AppCompatTextView) view.findViewById(R.id.line2);
            this.B = (ImageView) view.findViewById(R.id.play_indicator);
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            this.y = imageView;
            imageView.setVisibility(8);
            this.x = (AppCompatTextView) view.findViewById(R.id.duration);
            View findViewById = view.findViewById(R.id.dragger);
            if (findViewById != null) {
                findViewById.setOnTouchListener(new View.OnTouchListener() { // from class: e.a.c.h7.k
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        b.a aVar2;
                        q.a aVar3 = q.a.this;
                        Objects.requireNonNull(aVar3);
                        if (motionEvent.getActionMasked() != 0 || (aVar2 = aVar3.v.get()) == null) {
                            return false;
                        }
                        aVar2.d(aVar3);
                        return false;
                    }
                });
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: e.a.c.h7.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    q.a.this.B(view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: e.a.c.h7.j
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return q.a.this.C(view2);
                }
            });
        }

        @Override // e.g.a.e.b
        public void z() {
            e.g.a.c.c.h(this.x, ((q) this.u).f5093d.a);
            VM vm = this.u;
            CharSequence charSequence = ((q) vm).f5093d.f5212d;
            String str = ((q) vm).f5093d.f5211c;
            e7 e7Var = ((q) vm).f5095f.get();
            if (e7Var != null) {
                if (e7Var.n(((q) this.u).f5093d)) {
                    this.B.setImageResource(R.drawable.indicator_ic_mp_playing_list);
                    this.B.setVisibility(0);
                } else {
                    this.B.setVisibility(8);
                }
                k1 p = e7Var.p();
                char[] o = e7Var.o();
                if (p != null && o != null && o.length > 0) {
                    charSequence = p.a(charSequence, o);
                }
            }
            e.g.a.c.c.h(this.z, charSequence);
            e.g.a.c.c.h(this.A, str);
        }
    }

    public q(e7 e7Var, e.a.c.w6.d dVar, boolean z, e.g.a.a.m mVar, b.a<q> aVar) {
        super(mVar, aVar);
        this.f5093d = dVar;
        this.f5094e = z;
        this.f5095f = new WeakReference<>(e7Var);
    }

    @Override // e.g.a.c.f
    public RecyclerView.a0 c(ViewGroup viewGroup) {
        return new a(f(viewGroup), this.f7998b.get(), this.f7999c.get());
    }

    @Override // e.g.a.c.e
    public String e() {
        String str = this.f5093d.f5212d;
        if (str.length() > 5) {
            str = str.substring(0, 5);
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("the ")) {
                str = str.substring(4);
            } else if (lowerCase.startsWith("a ")) {
                str = str.substring(2);
            } else if (lowerCase.startsWith("el ")) {
                str = str.substring(3);
            } else if (lowerCase.startsWith("la ")) {
                str = str.substring(3);
            }
        }
        Character valueOf = Character.valueOf(str.charAt(0));
        return Character.isDigit(valueOf.charValue()) ? "#" : Character.toString(valueOf.charValue());
    }

    @Override // e.g.a.c.f
    public boolean equals(Object obj) {
        if (obj instanceof q) {
            e.a.c.w6.d dVar = ((q) obj).f5093d;
            long j2 = dVar.f5210b;
            e.a.c.w6.d dVar2 = this.f5093d;
            return j2 == dVar2.f5210b && dVar2.f5212d.equals(dVar.f5212d);
        }
        return false;
    }

    @Override // e.g.a.c.c
    public int g() {
        return this.f5094e ? R.layout.edit_track_list_item : R.layout.track_list_item;
    }
}
