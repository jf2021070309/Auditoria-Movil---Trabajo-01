package e.a.c.h7;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import e.a.c.e7;
import e.a.c.h7.n;
import e.g.a.e.b;
import e.h.g.x0;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class n extends e.g.a.c.d<a> implements e.g.a.c.e {

    /* renamed from: d  reason: collision with root package name */
    public static final ExecutorService f5083d = Executors.newSingleThreadExecutor();

    /* renamed from: e  reason: collision with root package name */
    public static BitmapDrawable f5084e;

    /* renamed from: f  reason: collision with root package name */
    public final e.a.c.w6.a f5085f;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<e.c.a.i> f5086g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5087h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference<e7> f5088i;

    /* loaded from: classes.dex */
    public static class a extends e.g.a.e.b<n> {
        public ImageView A;
        public e.c.a.q.e B;
        public ImageView x;
        public AppCompatTextView y;
        public AppCompatTextView z;

        public a(View view, e.g.a.a.m mVar, b.a<n> aVar) {
            super(view, mVar, aVar);
            this.y = (AppCompatTextView) view.findViewById(R.id.line1);
            this.z = (AppCompatTextView) view.findViewById(R.id.line2);
            this.A = (ImageView) view.findViewById(R.id.play_indicator);
            this.x = (ImageView) view.findViewById(R.id.icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: e.a.c.h7.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    n.a.this.B(view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: e.a.c.h7.l
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return n.a.this.C(view2);
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
        @Override // e.g.a.e.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void z() {
            /*
                Method dump skipped, instructions count: 382
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.c.h7.n.a.z():void");
        }
    }

    public n(e7 e7Var, e.a.c.w6.a aVar, boolean z, e.c.a.i iVar, e.g.a.a.m mVar, b.a<n> aVar2) {
        super(mVar, aVar2);
        this.f5085f = aVar;
        this.f5086g = new WeakReference<>(iVar);
        this.f5088i = new WeakReference<>(e7Var);
        this.f5087h = z;
    }

    public static Drawable i() {
        if (f5084e == null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(x0.f8405d.getResources(), BitmapFactory.decodeResource(x0.f8405d.getResources(), R.drawable.albumart_mp_unknown_list));
            f5084e = bitmapDrawable;
            bitmapDrawable.setFilterBitmap(false);
            f5084e.setDither(false);
        }
        return f5084e;
    }

    @Override // e.g.a.c.c, e.g.a.c.f
    public int a() {
        return R.layout.track_list_item_common;
    }

    @Override // e.g.a.c.f
    public RecyclerView.a0 c(ViewGroup viewGroup) {
        return new a(f(viewGroup), this.f7998b.get(), this.f7999c.get());
    }

    @Override // e.g.a.c.e
    public String e() {
        String str = this.f5085f.f5204g;
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
        return (obj instanceof n) && ((n) obj).f5085f.f5200c == this.f5085f.f5200c;
    }

    @Override // e.g.a.c.c
    public int g() {
        return R.layout.track_list_item;
    }
}
