package com.amazon.aps.iva.e8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.f8.e0;
import com.amazon.aps.iva.f8.f0;
import com.amazon.aps.iva.k.o;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* compiled from: MediaRouteDynamicChooserDialog.java */
/* loaded from: classes.dex */
public final class h extends o {
    public final f0 b;
    public final c c;
    public final Context d;
    public e0 e;
    public ArrayList f;
    public d g;
    public RecyclerView h;
    public boolean i;
    public f0.h j;
    public final long k;
    public long l;
    public final a m;

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                h hVar = h.this;
                hVar.getClass();
                hVar.l = SystemClock.uptimeMillis();
                hVar.f.clear();
                hVar.f.addAll((List) message.obj);
                hVar.g.d();
            }
        }
    }

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h.this.dismiss();
        }
    }

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    /* loaded from: classes.dex */
    public final class c extends f0.a {
        public c() {
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteAdded(f0 f0Var, f0.h hVar) {
            h.this.refreshRoutes();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteChanged(f0 f0Var, f0.h hVar) {
            h.this.refreshRoutes();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteRemoved(f0 f0Var, f0.h hVar) {
            h.this.refreshRoutes();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteSelected(f0 f0Var, f0.h hVar) {
            h.this.dismiss();
        }
    }

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    /* loaded from: classes.dex */
    public final class d extends RecyclerView.h<RecyclerView.f0> {
        public final ArrayList<b> a = new ArrayList<>();
        public final LayoutInflater b;
        public final Drawable c;
        public final Drawable d;
        public final Drawable e;
        public final Drawable f;

        /* compiled from: MediaRouteDynamicChooserDialog.java */
        /* loaded from: classes.dex */
        public class a extends RecyclerView.f0 {
            public final TextView b;

            public a(View view) {
                super(view);
                this.b = (TextView) view.findViewById(R.id.mr_picker_header_name);
            }
        }

        /* compiled from: MediaRouteDynamicChooserDialog.java */
        /* loaded from: classes.dex */
        public class b {
            public final Object a;
            public final int b;

            public b(Object obj) {
                this.a = obj;
                if (obj instanceof String) {
                    this.b = 1;
                } else if (obj instanceof f0.h) {
                    this.b = 2;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }

        /* compiled from: MediaRouteDynamicChooserDialog.java */
        /* loaded from: classes.dex */
        public class c extends RecyclerView.f0 {
            public final View b;
            public final ImageView c;
            public final ProgressBar d;
            public final TextView e;

            public c(View view) {
                super(view);
                this.b = view;
                this.c = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
                this.d = progressBar;
                this.e = (TextView) view.findViewById(R.id.mr_picker_route_name);
                androidx.mediarouter.app.d.k(h.this.d, progressBar);
            }
        }

        public d() {
            this.b = LayoutInflater.from(h.this.d);
            Context context = h.this.d;
            this.c = androidx.mediarouter.app.d.e(R.attr.mediaRouteDefaultIconDrawable, context);
            this.d = androidx.mediarouter.app.d.e(R.attr.mediaRouteTvIconDrawable, context);
            this.e = androidx.mediarouter.app.d.e(R.attr.mediaRouteSpeakerIconDrawable, context);
            this.f = androidx.mediarouter.app.d.e(R.attr.mediaRouteSpeakerGroupIconDrawable, context);
            d();
        }

        public final void d() {
            ArrayList<b> arrayList = this.a;
            arrayList.clear();
            h hVar = h.this;
            arrayList.add(new b(hVar.d.getString(R.string.mr_chooser_title)));
            Iterator it = hVar.f.iterator();
            while (it.hasNext()) {
                arrayList.add(new b((f0.h) it.next()));
            }
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemViewType(int i) {
            return this.a.get(i).b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
            if (r3 != null) goto L14;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.f0 r7, int r8) {
            /*
                r6 = this;
                int r0 = r6.getItemViewType(r8)
                java.util.ArrayList<com.amazon.aps.iva.e8.h$d$b> r1 = r6.a
                java.lang.Object r8 = r1.get(r8)
                com.amazon.aps.iva.e8.h$d$b r8 = (com.amazon.aps.iva.e8.h.d.b) r8
                r1 = 1
                if (r0 == r1) goto L76
                r2 = 2
                if (r0 == r2) goto L14
                goto L86
            L14:
                com.amazon.aps.iva.e8.h$d$c r7 = (com.amazon.aps.iva.e8.h.d.c) r7
                r7.getClass()
                java.lang.Object r8 = r8.a
                com.amazon.aps.iva.f8.f0$h r8 = (com.amazon.aps.iva.f8.f0.h) r8
                android.view.View r0 = r7.b
                r3 = 0
                r0.setVisibility(r3)
                android.widget.ProgressBar r3 = r7.d
                r4 = 4
                r3.setVisibility(r4)
                com.amazon.aps.iva.e8.i r3 = new com.amazon.aps.iva.e8.i
                r3.<init>(r7, r8)
                r0.setOnClickListener(r3)
                java.lang.String r0 = r8.d
                android.widget.TextView r3 = r7.e
                r3.setText(r0)
                com.amazon.aps.iva.e8.h$d r0 = com.amazon.aps.iva.e8.h.d.this
                r0.getClass()
                android.net.Uri r3 = r8.f
                if (r3 == 0) goto L58
                com.amazon.aps.iva.e8.h r4 = com.amazon.aps.iva.e8.h.this     // Catch: java.io.IOException -> L55
                android.content.Context r4 = r4.d     // Catch: java.io.IOException -> L55
                android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.io.IOException -> L55
                java.io.InputStream r4 = r4.openInputStream(r3)     // Catch: java.io.IOException -> L55
                r5 = 0
                android.graphics.drawable.Drawable r3 = android.graphics.drawable.Drawable.createFromStream(r4, r5)     // Catch: java.io.IOException -> L55
                if (r3 == 0) goto L58
                goto L70
            L55:
                r3.toString()
            L58:
                int r3 = r8.m
                if (r3 == r1) goto L6d
                if (r3 == r2) goto L6a
                boolean r8 = r8.g()
                if (r8 == 0) goto L67
                android.graphics.drawable.Drawable r8 = r0.f
                goto L6f
            L67:
                android.graphics.drawable.Drawable r8 = r0.c
                goto L6f
            L6a:
                android.graphics.drawable.Drawable r8 = r0.e
                goto L6f
            L6d:
                android.graphics.drawable.Drawable r8 = r0.d
            L6f:
                r3 = r8
            L70:
                android.widget.ImageView r7 = r7.c
                r7.setImageDrawable(r3)
                goto L86
            L76:
                com.amazon.aps.iva.e8.h$d$a r7 = (com.amazon.aps.iva.e8.h.d.a) r7
                r7.getClass()
                java.lang.Object r8 = r8.a
                java.lang.String r8 = r8.toString()
                android.widget.TextView r7 = r7.b
                r7.setText(r8)
            L86:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e8.h.d.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$f0, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = this.b;
            if (i != 1) {
                if (i == 2) {
                    return new c(layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
                }
                throw new IllegalStateException();
            }
            return new a(layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false));
        }
    }

    /* compiled from: MediaRouteDynamicChooserDialog.java */
    /* loaded from: classes.dex */
    public static final class e implements Comparator<f0.h> {
        public static final e b = new e();

        @Override // java.util.Comparator
        public final int compare(f0.h hVar, f0.h hVar2) {
            return hVar.d.compareToIgnoreCase(hVar2.d);
        }
    }

    public h() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            android.view.ContextThemeWrapper r3 = androidx.mediarouter.app.d.a(r3, r0, r0)
            int r0 = androidx.mediarouter.app.d.b(r3)
            r2.<init>(r3, r0)
            com.amazon.aps.iva.f8.e0 r3 = com.amazon.aps.iva.f8.e0.c
            r2.e = r3
            com.amazon.aps.iva.e8.h$a r3 = new com.amazon.aps.iva.e8.h$a
            r3.<init>()
            r2.m = r3
            android.content.Context r3 = r2.getContext()
            com.amazon.aps.iva.f8.f0 r0 = com.amazon.aps.iva.f8.f0.d(r3)
            r2.b = r0
            com.amazon.aps.iva.e8.h$c r0 = new com.amazon.aps.iva.e8.h$c
            r0.<init>()
            r2.c = r0
            r2.d = r3
            android.content.res.Resources r3 = r3.getResources()
            r0 = 2131492972(0x7f0c006c, float:1.860941E38)
            int r3 = r3.getInteger(r0)
            long r0 = (long) r3
            r2.k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e8.h.<init>(android.content.Context):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = true;
        this.b.a(this.e, this.c, 1);
        refreshRoutes();
    }

    @Override // com.amazon.aps.iva.k.o, com.amazon.aps.iva.e.j, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int a2;
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        Context context = this.d;
        androidx.mediarouter.app.d.j(context, this);
        this.f = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new b());
        this.g = new d();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.h = recyclerView;
        recyclerView.setAdapter(this.g);
        this.h.setLayoutManager(new LinearLayoutManager(context));
        int i = -1;
        if (!context.getResources().getBoolean(R.bool.is_tablet)) {
            a2 = -1;
        } else {
            a2 = g.a(context);
        }
        if (context.getResources().getBoolean(R.bool.is_tablet)) {
            i = -2;
        }
        getWindow().setLayout(a2, i);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i = false;
        this.b.i(this.c);
        this.m.removeMessages(1);
    }

    public final void refreshRoutes() {
        if (this.j == null && this.i) {
            this.b.getClass();
            ArrayList arrayList = new ArrayList(f0.f());
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                boolean z = true;
                if (size <= 0) {
                    break;
                }
                f0.h hVar = (f0.h) arrayList.get(i);
                if (!((!hVar.f() && hVar.g && hVar.j(this.e)) ? false : false)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, e.b);
            long uptimeMillis = SystemClock.uptimeMillis() - this.l;
            long j = this.k;
            if (uptimeMillis >= j) {
                this.l = SystemClock.uptimeMillis();
                this.f.clear();
                this.f.addAll(arrayList);
                this.g.d();
                return;
            }
            a aVar = this.m;
            aVar.removeMessages(1);
            aVar.sendMessageAtTime(aVar.obtainMessage(1, arrayList), this.l + j);
        }
    }

    public final void setRouteSelector(e0 e0Var) {
        if (e0Var != null) {
            if (!this.e.equals(e0Var)) {
                this.e = e0Var;
                if (this.i) {
                    f0 f0Var = this.b;
                    c cVar = this.c;
                    f0Var.i(cVar);
                    f0Var.a(e0Var, cVar, 1);
                }
                refreshRoutes();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
}
