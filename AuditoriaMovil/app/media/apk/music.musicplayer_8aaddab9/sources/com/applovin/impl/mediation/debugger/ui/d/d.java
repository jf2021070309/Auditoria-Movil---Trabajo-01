package com.applovin.impl.mediation.debugger.ui.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class d extends BaseAdapter implements View.OnClickListener {
    private final LayoutInflater a;

    /* renamed from: c  reason: collision with root package name */
    public final Context f3645c;

    /* renamed from: e  reason: collision with root package name */
    private a f3647e;

    /* renamed from: b  reason: collision with root package name */
    private List<c> f3644b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private Map<Integer, Integer> f3646d = new HashMap();

    /* loaded from: classes.dex */
    public interface a {
        void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar);
    }

    public d(Context context) {
        this.f3645c = context;
        this.a = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    private com.applovin.impl.mediation.debugger.ui.d.a e(int i2) {
        for (int i3 = 0; i3 < b(); i3++) {
            Integer num = this.f3646d.get(Integer.valueOf(i3));
            if (num != null) {
                if (i2 <= num.intValue() + a(i3)) {
                    return new com.applovin.impl.mediation.debugger.ui.d.a(i3, i2 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    public abstract int a(int i2);

    public Bitmap a(ListView listView) {
        int count = getCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 1073741824);
        int i2 = 0;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ArrayList arrayList = new ArrayList(count);
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            View view = getView(i4, null, listView);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            arrayList.add(createBitmap);
            i3 += view.getMeasuredHeight();
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(listView.getMeasuredWidth(), i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Bitmap bitmap = (Bitmap) it.next();
            canvas.drawBitmap(bitmap, 0.0f, i2, paint);
            i2 += bitmap.getHeight();
            bitmap.recycle();
        }
        return createBitmap2;
    }

    public void a(a aVar) {
        this.f3647e = aVar;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public abstract int b();

    public abstract c b(int i2);

    public abstract List<c> c(int i2);

    @Override // android.widget.Adapter
    /* renamed from: d */
    public c getItem(int i2) {
        return this.f3644b.get(i2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f3644b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i2) {
        return getItem(i2).i();
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        b bVar;
        c item = getItem(i2);
        if (view == null) {
            view = this.a.inflate(item.j(), viewGroup, false);
            bVar = new b();
            bVar.a = (TextView) view.findViewById(16908308);
            bVar.f3607b = (TextView) view.findViewById(16908309);
            bVar.f3608c = (ImageView) view.findViewById(R.id.imageView);
            bVar.f3609d = (ImageView) view.findViewById(R.id.detailImageView);
            view.setTag(bVar);
            view.setOnClickListener(this);
        } else {
            bVar = (b) view.getTag();
        }
        bVar.a(i2);
        bVar.a(item);
        view.setEnabled(item.b());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return c.h();
    }

    public void i() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.d.d.1
            @Override // java.lang.Runnable
            public void run() {
                d.this.notifyDataSetChanged();
            }
        });
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i2) {
        return getItem(i2).b();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f3644b = new ArrayList();
        Integer valueOf = Integer.valueOf(b());
        this.f3646d = new HashMap(valueOf.intValue());
        Integer num = 0;
        for (int i2 = 0; i2 < valueOf.intValue(); i2++) {
            Integer valueOf2 = Integer.valueOf(a(i2));
            if (valueOf2.intValue() != 0) {
                this.f3644b.add(b(i2));
                this.f3644b.addAll(c(i2));
                this.f3646d.put(Integer.valueOf(i2), num);
                num = Integer.valueOf(valueOf2.intValue() + 1 + num.intValue());
            }
        }
        this.f3644b.add(new e(""));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b bVar = (b) view.getTag();
        c b2 = bVar.b();
        com.applovin.impl.mediation.debugger.ui.d.a e2 = e(bVar.a());
        a aVar = this.f3647e;
        if (aVar == null || e2 == null) {
            return;
        }
        aVar.a(e2, b2);
    }
}
