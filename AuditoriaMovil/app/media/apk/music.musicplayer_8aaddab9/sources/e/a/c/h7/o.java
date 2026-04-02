package e.a.c.h7;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import e.a.c.e7;
import e.a.c.h7.o;
import e.a.c.s6;
import e.a.c.z6;
import e.g.a.e.b;
import e.h.g.j0;
import e.h.g.k1;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class o extends e.g.a.c.d<a> implements e.g.a.c.e {

    /* renamed from: d  reason: collision with root package name */
    public static final ExecutorService f5089d = Executors.newSingleThreadExecutor();

    /* renamed from: e  reason: collision with root package name */
    public final e.a.c.w6.b f5090e;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference<e7> f5091f;

    /* loaded from: classes.dex */
    public static class a extends e.g.a.e.b<o> {
        public ImageView A;
        public ImageView x;
        public AppCompatTextView y;
        public AppCompatTextView z;

        public a(View view, e.g.a.a.m mVar, b.a<o> aVar) {
            super(view, mVar, aVar);
            this.y = (AppCompatTextView) view.findViewById(R.id.line1);
            this.z = (AppCompatTextView) view.findViewById(R.id.line2);
            this.A = (ImageView) view.findViewById(R.id.play_indicator);
            this.x = (ImageView) view.findViewById(R.id.group_indicator);
            ((ImageView) view.findViewById(R.id.icon)).setVisibility(8);
            view.setOnClickListener(new View.OnClickListener() { // from class: e.a.c.h7.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    o.a.this.B(view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: e.a.c.h7.c
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return o.a.this.C(view2);
                }
            });
        }

        @Override // e.g.a.e.b
        public void z() {
            int l2;
            e7 e7Var = ((o) this.u).f5091f.get();
            if (e7Var != null && (l2 = e7Var.l()) != -1) {
                this.x.setColorFilter(l2, PorterDuff.Mode.MULTIPLY);
            }
            e.g.a.c.c.h(this.z, ((o) this.u).f5090e.f5205b);
            VM vm = this.u;
            CharSequence charSequence = ((o) vm).f5090e.f5208e;
            if (e7Var != null) {
                if (e7Var.h(((o) vm).f5090e)) {
                    this.x.setImageResource(R.drawable.ic_arrow_up);
                } else {
                    this.x.setImageResource(R.drawable.ic_arrow_down);
                }
                k1 p = e7Var.p();
                char[] o = e7Var.o();
                if (p != null && o != null && o.length > 0) {
                    charSequence = p.a(charSequence, o);
                }
            }
            e.g.a.c.c.h(this.y, charSequence);
            j0.b(new j0.b() { // from class: e.a.c.h7.f
                @Override // e.h.g.j0.b
                public final void a() {
                    final long p2;
                    final o.a aVar = o.a.this;
                    Objects.requireNonNull(aVar);
                    s6 y = z6.y();
                    if (y != null) {
                        try {
                            z6.i();
                            p2 = y.f5177b.p();
                        } catch (Exception unused) {
                        }
                        j0.h(new j0.c() { // from class: e.a.c.h7.d
                            @Override // e.h.g.j0.c
                            public final void a() {
                                o.a aVar2 = o.a.this;
                                if (p2 == ((o) aVar2.u).f5090e.a) {
                                    aVar2.A.setImageResource(R.drawable.indicator_ic_mp_playing_list);
                                } else {
                                    aVar2.A.setImageDrawable(null);
                                }
                            }
                        });
                    }
                    p2 = -1;
                    j0.h(new j0.c() { // from class: e.a.c.h7.d
                        @Override // e.h.g.j0.c
                        public final void a() {
                            o.a aVar2 = o.a.this;
                            if (p2 == ((o) aVar2.u).f5090e.a) {
                                aVar2.A.setImageResource(R.drawable.indicator_ic_mp_playing_list);
                            } else {
                                aVar2.A.setImageDrawable(null);
                            }
                        }
                    });
                }
            }, o.f5089d);
        }
    }

    public o(e7 e7Var, e.a.c.w6.b bVar, e.g.a.a.m mVar, b.a<o> aVar) {
        super(mVar, aVar);
        this.f5090e = bVar;
        this.f5091f = new WeakReference<>(e7Var);
    }

    @Override // e.g.a.c.f
    public RecyclerView.a0 c(ViewGroup viewGroup) {
        return new a(f(viewGroup), this.f7998b.get(), this.f7999c.get());
    }

    @Override // e.g.a.c.e
    public String e() {
        String str = this.f5090e.f5208e;
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
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f5090e.f5208e.equals(oVar.f5090e.f5208e) && this.f5090e.f5205b.equals(oVar.f5090e.f5205b);
        }
        return false;
    }

    @Override // e.g.a.c.c
    public int g() {
        return R.layout.track_list_item_group;
    }
}
