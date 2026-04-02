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
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class d extends BaseAdapter implements View.OnClickListener {
    private final LayoutInflater a;
    protected final Context c;
    private a e;
    private List<c> b = new ArrayList();
    private Map<Integer, Integer> d = new HashMap();

    /* loaded from: classes.dex */
    public interface a {
        void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Context context) {
        this.c = context;
        this.a = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    private com.applovin.impl.mediation.debugger.ui.d.a e(int i) {
        for (int i2 = 0; i2 < b(); i2++) {
            Integer num = this.d.get(Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + a(i2)) {
                    return new com.applovin.impl.mediation.debugger.ui.d.a(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    protected abstract int a(int i);

    public Bitmap a(ListView listView) {
        int count = getCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 1073741824);
        int i = 0;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ArrayList<Bitmap> arrayList = new ArrayList(count);
        int i2 = 0;
        for (int i3 = 0; i3 < count; i3++) {
            View view = getView(i3, null, listView);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            arrayList.add(createBitmap);
            i2 += view.getMeasuredHeight();
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(listView.getMeasuredWidth(), i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        for (Bitmap bitmap : arrayList) {
            canvas.drawBitmap(bitmap, 0.0f, i, paint);
            i += bitmap.getHeight();
            bitmap.recycle();
        }
        return createBitmap2;
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    protected abstract int b();

    protected abstract c b(int i);

    protected abstract List<c> c(int i);

    @Override // android.widget.Adapter
    /* renamed from: d */
    public c getItem(int i) {
        return this.b.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i).i();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        c item = getItem(i);
        if (view == null) {
            view = this.a.inflate(item.j(), viewGroup, false);
            bVar = new b();
            bVar.a = (TextView) view.findViewById(16908308);
            bVar.b = (TextView) view.findViewById(16908309);
            bVar.c = (ImageView) view.findViewById(R.id.imageView);
            bVar.d = (ImageView) view.findViewById(R.id.detailImageView);
            view.setTag(bVar);
            view.setOnClickListener(this);
        } else {
            bVar = (b) view.getTag();
        }
        bVar.a(i);
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
    public boolean isEnabled(int i) {
        return getItem(i).b();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.b = new ArrayList();
        Integer valueOf = Integer.valueOf(b());
        this.d = new HashMap(valueOf.intValue());
        Integer num = 0;
        for (int i = 0; i < valueOf.intValue(); i++) {
            Integer valueOf2 = Integer.valueOf(a(i));
            if (valueOf2.intValue() != 0) {
                this.b.add(b(i));
                this.b.addAll(c(i));
                this.d.put(Integer.valueOf(i), num);
                num = Integer.valueOf(num.intValue() + valueOf2.intValue() + 1);
            }
        }
        this.b.add(new e(""));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b bVar = (b) view.getTag();
        c b = bVar.b();
        com.applovin.impl.mediation.debugger.ui.d.a e = e(bVar.a());
        a aVar = this.e;
        if (aVar == null || e == null) {
            return;
        }
        aVar.a(e, b);
    }
}
