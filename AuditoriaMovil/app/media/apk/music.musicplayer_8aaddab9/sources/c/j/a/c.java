package c.j.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: i  reason: collision with root package name */
    public int f2252i;

    /* renamed from: j  reason: collision with root package name */
    public int f2253j;

    /* renamed from: k  reason: collision with root package name */
    public LayoutInflater f2254k;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z) {
        super(context, null, z);
        this.f2253j = i2;
        this.f2252i = i2;
        this.f2254k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // c.j.a.a
    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2254k.inflate(this.f2252i, viewGroup, false);
    }
}
