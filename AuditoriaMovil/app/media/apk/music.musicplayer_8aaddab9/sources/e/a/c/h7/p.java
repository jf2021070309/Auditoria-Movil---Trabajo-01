package e.a.c.h7;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import e.a.c.h7.p;
import e.g.a.e.b;
import java.util.Locale;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class p extends e.g.a.c.d<a> implements e.g.a.c.e {

    /* renamed from: d  reason: collision with root package name */
    public final e.a.c.w6.c f5092d;

    /* loaded from: classes.dex */
    public static class a extends e.g.a.e.b<p> {
        public ImageView x;
        public AppCompatTextView y;
        public AppCompatTextView z;

        public a(View view, e.g.a.a.m mVar, b.a<p> aVar) {
            super(view, mVar, aVar);
            this.y = (AppCompatTextView) view.findViewById(R.id.line1);
            this.z = (AppCompatTextView) view.findViewById(R.id.line2);
            ImageView imageView = (ImageView) view.findViewById(R.id.play_indicator);
            this.x = (ImageView) view.findViewById(R.id.icon);
            this.z.setVisibility(8);
            view.setOnClickListener(new View.OnClickListener() { // from class: e.a.c.h7.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    p.a.this.B(view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: e.a.c.h7.g
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return p.a.this.C(view2);
                }
            });
        }

        @Override // e.g.a.e.b
        public void z() {
            e.g.a.c.c.h(this.y, ((p) this.u).f5092d.f5209b);
            if (((p) this.u).f5092d.a == -5) {
                this.x.setImageResource(R.drawable.ic_mp_playlist_recently_added_list);
            } else {
                this.x.setImageResource(R.drawable.ic_mp_playlist_list);
            }
        }
    }

    public p(e.a.c.w6.c cVar, e.g.a.a.m mVar, b.a<p> aVar) {
        super(mVar, aVar);
        this.f5092d = cVar;
    }

    @Override // e.g.a.c.f
    public RecyclerView.a0 c(ViewGroup viewGroup) {
        return new a(f(viewGroup), this.f7998b.get(), this.f7999c.get());
    }

    @Override // e.g.a.c.e
    public String e() {
        String str = this.f5092d.f5209b;
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
        if (obj instanceof p) {
            e.a.c.w6.c cVar = ((p) obj).f5092d;
            long j2 = cVar.a;
            e.a.c.w6.c cVar2 = this.f5092d;
            return j2 == cVar2.a && cVar2.f5209b.equals(cVar.f5209b);
        }
        return false;
    }

    @Override // e.g.a.c.c
    public int g() {
        return R.layout.track_list_item;
    }
}
