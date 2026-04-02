package com.android.music;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;
import com.android.music.DeleteItems;
import e.a.c.h0;
import e.a.c.z6;
import e.h.b.o;
import e.h.g.j0;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class DeleteItems extends Activity {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long[] f2949b;

    /* renamed from: c  reason: collision with root package name */
    public final View.OnClickListener f2950c = new a();

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DeleteItems deleteItems = DeleteItems.this;
            j0.g(new h0(deleteItems, deleteItems.f2949b, new o.a() { // from class: e.a.c.c0
                @Override // e.h.b.o.a
                public final void a(final boolean z) {
                    final DeleteItems.a aVar = DeleteItems.a.this;
                    Objects.requireNonNull(aVar);
                    if (!z) {
                        e.h.g.j1.p(z6.E(R.string.sdcard_error_title_nosdcard), 1);
                    }
                    e.h.g.j0.i(new j0.c() { // from class: e.a.c.d0
                        @Override // e.h.g.j0.c
                        public final void a() {
                            DeleteItems.a aVar2 = DeleteItems.a.this;
                            if (z) {
                                DeleteItems.this.setResult(-1);
                            } else {
                                DeleteItems.this.setResult(0);
                            }
                            DeleteItems.this.finish();
                        }
                    });
                }
            }));
        }
    }

    public static void a(final Activity activity, final long[] jArr, final String str, final int i2) {
        j0.i(new j0.c() { // from class: e.a.c.e0
            @Override // e.h.g.j0.c
            public final void a() {
                Activity activity2 = activity;
                long[] jArr2 = jArr;
                String str2 = str;
                int i3 = i2;
                int i4 = DeleteItems.a;
                if (e.h.g.v0.e()) {
                    e.h.g.j0.g(new h0(activity2, jArr2, new o.a() { // from class: e.a.c.g0
                        @Override // e.h.b.o.a
                        public final void a(boolean z) {
                            int i5 = DeleteItems.a;
                        }
                    }));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("description", str2);
                bundle.putLongArray("items", jArr2);
                Intent intent = new Intent();
                intent.setClass(e.h.g.x0.f8405d, DeleteItems.class);
                intent.putExtras(bundle);
                activity2.startActivityForResult(intent, i3);
            }
        });
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (o.j(this, i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setVolumeControlStream(3);
        requestWindowFeature(1);
        setContentView(R.layout.confirm_delete);
        getWindow().setLayout(-1, -2);
        TextView textView = (TextView) findViewById(R.id.delete);
        textView.setOnClickListener(this.f2950c);
        textView.setText(z6.E(R.string.delete_item));
        TextView textView2 = (TextView) findViewById(R.id.cancel);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: e.a.c.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteItems.this.finish();
            }
        });
        textView2.setText(z6.E(R.string.cancel));
        Bundle extras = getIntent().getExtras();
        String string = extras.getString("description");
        this.f2949b = extras.getLongArray("items");
        ((TextView) findViewById(R.id.prompt)).setText(string);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            Display defaultDisplay = getWindow().getWindowManager().getDefaultDisplay();
            double[] dArr = new double[2];
            float f2 = 0.6f;
            if (defaultDisplay.getWidth() >= 400 && defaultDisplay.getHeight() >= 400) {
                if (defaultDisplay.getWidth() < defaultDisplay.getHeight()) {
                    f2 = 0.82f;
                }
                dArr[0] = f2 * defaultDisplay.getWidth();
                dArr[1] = -2.0d;
                getWindow().setLayout((int) dArr[0], (int) dArr[1]);
            }
            f2 = 0.9f;
            dArr[0] = f2 * defaultDisplay.getWidth();
            dArr[1] = -2.0d;
            getWindow().setLayout((int) dArr[0], (int) dArr[1]);
        } catch (NullPointerException unused) {
        }
    }
}
