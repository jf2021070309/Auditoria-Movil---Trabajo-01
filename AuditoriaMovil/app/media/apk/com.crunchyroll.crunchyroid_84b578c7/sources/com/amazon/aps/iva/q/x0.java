package com.amazon.aps.iva.q;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.crunchyroll.crunchyroid.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: SuggestionsAdapter.java */
/* loaded from: classes.dex */
public final class x0 extends com.amazon.aps.iva.u3.c implements View.OnClickListener {
    public static final /* synthetic */ int y = 0;
    public final SearchView l;
    public final SearchableInfo m;
    public final Context n;
    public final WeakHashMap<String, Drawable.ConstantState> o;
    public final int p;
    public int q;
    public ColorStateList r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;

    /* compiled from: SuggestionsAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public x0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.q = 1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.l = searchView;
        this.m = searchableInfo;
        this.p = searchView.getSuggestionCommitIconResId();
        this.n = context;
        this.o = weakHashMap;
    }

    public static String i(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    @Override // com.amazon.aps.iva.u3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q.x0.b(android.view.View, android.database.Cursor):void");
    }

    @Override // com.amazon.aps.iva.u3.a
    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.s = cursor.getColumnIndex("suggest_text_1");
                this.t = cursor.getColumnIndex("suggest_text_2");
                this.u = cursor.getColumnIndex("suggest_text_2_url");
                this.v = cursor.getColumnIndex("suggest_icon_1");
                this.w = cursor.getColumnIndex("suggest_icon_2");
                this.x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.amazon.aps.iva.u3.a
    public final String d(Cursor cursor) {
        String i;
        String i2;
        if (cursor == null) {
            return null;
        }
        String i3 = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (i3 != null) {
            return i3;
        }
        SearchableInfo searchableInfo = this.m;
        if (searchableInfo.shouldRewriteQueryFromData() && (i2 = i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return i2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (i = i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return i;
    }

    @Override // com.amazon.aps.iva.u3.a
    public final View e(ViewGroup viewGroup) {
        View inflate = this.k.inflate(this.i, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.p);
        return inflate;
    }

    public final Drawable f(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.n.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(java.lang.String r9) {
        /*
            r8 = this;
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r8.o
            android.content.Context r1 = r8.n
            java.lang.String r2 = "android.resource://"
            r3 = 0
            if (r9 == 0) goto Ld4
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto Ld4
            java.lang.String r4 = "0"
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L19
            goto Ld4
        L19:
            int r4 = java.lang.Integer.parseInt(r9)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r5.<init>(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.String r2 = r1.getPackageName()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r5.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.String r2 = "/"
            r5.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r5.append(r4)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.String r2 = r5.toString()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.Object r5 = r0.get(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            if (r5 != 0) goto L3f
            r5 = r3
            goto L43
        L3f:
            android.graphics.drawable.Drawable r5 = r5.newDrawable()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
        L43:
            if (r5 == 0) goto L46
            return r5
        L46:
            android.graphics.drawable.Drawable r4 = com.amazon.aps.iva.d3.a.getDrawable(r1, r4)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            if (r4 == 0) goto L53
            android.graphics.drawable.Drawable$ConstantState r5 = r4.getConstantState()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r0.put(r2, r5)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
        L53:
            return r4
        L54:
            return r3
        L55:
            java.lang.Object r2 = r0.get(r9)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L5f
            r2 = r3
            goto L63
        L5f:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L63:
            if (r2 == 0) goto L66
            return r2
        L66:
            android.net.Uri r2 = android.net.Uri.parse(r9)
            java.lang.String r4 = "Failed to open "
            java.lang.String r5 = "Resource does not exist: "
            java.lang.String r6 = r2.getScheme()     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.String r7 = "android.resource"
            boolean r6 = r7.equals(r6)     // Catch: java.io.FileNotFoundException -> Lc4
            if (r6 == 0) goto L92
            android.graphics.drawable.Drawable r1 = r8.f(r2)     // Catch: android.content.res.Resources.NotFoundException -> L80 java.io.FileNotFoundException -> Lc4
            r3 = r1
            goto Lcb
        L80:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Lc4
            r4.<init>(r5)     // Catch: java.io.FileNotFoundException -> Lc4
            r4.append(r2)     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.String r4 = r4.toString()     // Catch: java.io.FileNotFoundException -> Lc4
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> Lc4
            throw r1     // Catch: java.io.FileNotFoundException -> Lc4
        L92:
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.FileNotFoundException -> Lc4
            java.io.InputStream r1 = r1.openInputStream(r2)     // Catch: java.io.FileNotFoundException -> Lc4
            if (r1 == 0) goto Lb2
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r1, r3)     // Catch: java.lang.Throwable -> La9
            r1.close()     // Catch: java.io.IOException -> La4
            goto La7
        La4:
            r2.toString()     // Catch: java.io.FileNotFoundException -> Lc4
        La7:
            r3 = r4
            goto Lcb
        La9:
            r4 = move-exception
            r1.close()     // Catch: java.io.IOException -> Lae
            goto Lb1
        Lae:
            r2.toString()     // Catch: java.io.FileNotFoundException -> Lc4
        Lb1:
            throw r4     // Catch: java.io.FileNotFoundException -> Lc4
        Lb2:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Lc4
            r5.<init>(r4)     // Catch: java.io.FileNotFoundException -> Lc4
            r5.append(r2)     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.String r4 = r5.toString()     // Catch: java.io.FileNotFoundException -> Lc4
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> Lc4
            throw r1     // Catch: java.io.FileNotFoundException -> Lc4
        Lc4:
            r1 = move-exception
            java.util.Objects.toString(r2)
            r1.getMessage()
        Lcb:
            if (r3 == 0) goto Ld4
            android.graphics.drawable.Drawable$ConstantState r1 = r3.getConstantState()
            r0.put(r9, r1)
        Ld4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q.x0.g(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // com.amazon.aps.iva.u3.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View inflate = this.k.inflate(this.j, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // com.amazon.aps.iva.u3.a, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View e2 = e(viewGroup);
            ((a) e2.getTag()).a.setText(e.toString());
            return e2;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.d;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.d;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.l.j((CharSequence) tag);
        }
    }
}
