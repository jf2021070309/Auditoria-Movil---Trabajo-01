package com.amazon.aps.iva.e8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.aps.iva.c8.s;
import com.amazon.aps.iva.f8.e0;
import com.amazon.aps.iva.f8.f0;
import com.amazon.aps.iva.k.o;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: MediaRouteChooserDialog.java */
/* loaded from: classes.dex */
public class c extends o {
    private static final int FINDING_DEVICES = 0;
    private static final int MSG_SHOW_NO_ROUTES = 3;
    private static final int MSG_SHOW_WIFI_HINT = 2;
    private static final int MSG_UPDATE_ROUTES = 1;
    private static final int NO_DEVICES_NO_WIFI_HINT = 2;
    private static final int NO_ROUTES = 3;
    private static final int SHOWING_ROUTES = 1;
    private static final int SHOW_NO_ROUTES_DELAY_MS = 15000;
    private static final int SHOW_WIFI_HINT_DELAY_MS = 5000;
    static final String TAG = "MediaRouteChooserDialog";
    private static final long UPDATE_ROUTES_DELAY_MS = 300;
    private C0217c mAdapter;
    private boolean mAttachedToWindow;
    private final b mCallback;
    private final Handler mHandler;
    private long mLastUpdateTime;
    private TextView mLearnMoreTextView;
    private ListView mListView;
    private Button mOkButton;
    private LinearLayout mOkButtonContainer;
    private final f0 mRouter;
    private ArrayList<f0.h> mRoutes;
    private ProgressBar mSearchingProgressBar;
    private TextView mSearchingRoutesTextView;
    private e0 mSelector;
    private TextView mTitleView;
    private RelativeLayout mWifiWarningContainer;
    private TextView mWifiWarningTextView;

    /* compiled from: MediaRouteChooserDialog.java */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            c cVar = c.this;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        cVar.handleShowNoRoutes();
                        return;
                    }
                    return;
                }
                cVar.handleShowNoWifiWarning();
                return;
            }
            cVar.handleUpdateRoutes((List) message.obj);
        }
    }

    /* compiled from: MediaRouteChooserDialog.java */
    /* loaded from: classes.dex */
    public final class b extends f0.a {
        public b() {
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteAdded(f0 f0Var, f0.h hVar) {
            c.this.refreshRoutes();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteChanged(f0 f0Var, f0.h hVar) {
            c.this.refreshRoutes();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteRemoved(f0 f0Var, f0.h hVar) {
            c.this.refreshRoutes();
        }

        @Override // com.amazon.aps.iva.f8.f0.a
        public final void onRouteSelected(f0 f0Var, f0.h hVar) {
            c.this.dismiss();
        }
    }

    /* compiled from: MediaRouteChooserDialog.java */
    /* renamed from: com.amazon.aps.iva.e8.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0217c extends ArrayAdapter<f0.h> implements AdapterView.OnItemClickListener {
        public final LayoutInflater b;
        public final Drawable c;
        public final Drawable d;
        public final Drawable e;
        public final Drawable f;

        public C0217c(Context context, ArrayList arrayList) {
            super(context, 0, arrayList);
            this.b = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
            this.c = com.amazon.aps.iva.l.a.a(context, obtainStyledAttributes.getResourceId(0, 0));
            this.d = com.amazon.aps.iva.l.a.a(context, obtainStyledAttributes.getResourceId(1, 0));
            this.e = com.amazon.aps.iva.l.a.a(context, obtainStyledAttributes.getResourceId(2, 0));
            this.f = com.amazon.aps.iva.l.a.a(context, obtainStyledAttributes.getResourceId(3, 0));
            obtainStyledAttributes.recycle();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
            if (r0 != null) goto L23;
         */
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
            /*
                r6 = this;
                r0 = 0
                if (r8 != 0) goto Lc
                android.view.LayoutInflater r8 = r6.b
                r1 = 2131624941(0x7f0e03ed, float:1.8877076E38)
                android.view.View r8 = r8.inflate(r1, r9, r0)
            Lc:
                java.lang.Object r7 = r6.getItem(r7)
                com.amazon.aps.iva.f8.f0$h r7 = (com.amazon.aps.iva.f8.f0.h) r7
                r9 = 2131428663(0x7f0b0537, float:1.8478977E38)
                android.view.View r9 = r8.findViewById(r9)
                android.widget.TextView r9 = (android.widget.TextView) r9
                r1 = 2131428661(0x7f0b0535, float:1.8478973E38)
                android.view.View r1 = r8.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.String r2 = r7.d
                r9.setText(r2)
                java.lang.String r2 = r7.e
                int r3 = r7.h
                r4 = 2
                r5 = 1
                if (r3 == r4) goto L36
                if (r3 != r5) goto L34
                goto L36
            L34:
                r3 = r0
                goto L37
            L36:
                r3 = r5
            L37:
                if (r3 == 0) goto L4b
                boolean r3 = android.text.TextUtils.isEmpty(r2)
                if (r3 != 0) goto L4b
                r3 = 80
                r9.setGravity(r3)
                r1.setVisibility(r0)
                r1.setText(r2)
                goto L5a
            L4b:
                r0 = 16
                r9.setGravity(r0)
                r9 = 8
                r1.setVisibility(r9)
                java.lang.String r9 = ""
                r1.setText(r9)
            L5a:
                boolean r9 = r7.g
                r8.setEnabled(r9)
                r9 = 2131428662(0x7f0b0536, float:1.8478975E38)
                android.view.View r9 = r8.findViewById(r9)
                android.widget.ImageView r9 = (android.widget.ImageView) r9
                if (r9 == 0) goto La0
                android.net.Uri r0 = r7.f
                if (r0 == 0) goto L85
                android.content.Context r1 = r6.getContext()     // Catch: java.io.IOException -> L82
                android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L82
                java.io.InputStream r1 = r1.openInputStream(r0)     // Catch: java.io.IOException -> L82
                r2 = 0
                android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2)     // Catch: java.io.IOException -> L82
                if (r0 == 0) goto L85
                goto L9d
            L82:
                r0.toString()
            L85:
                int r0 = r7.m
                if (r0 == r5) goto L9a
                if (r0 == r4) goto L97
                boolean r7 = r7.g()
                if (r7 == 0) goto L94
                android.graphics.drawable.Drawable r7 = r6.f
                goto L9c
            L94:
                android.graphics.drawable.Drawable r7 = r6.c
                goto L9c
            L97:
                android.graphics.drawable.Drawable r7 = r6.e
                goto L9c
            L9a:
                android.graphics.drawable.Drawable r7 = r6.d
            L9c:
                r0 = r7
            L9d:
                r9.setImageDrawable(r0)
            La0:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e8.c.C0217c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            return getItem(i).g;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            f0.h item = getItem(i);
            if (item.g) {
                ImageView imageView = (ImageView) view.findViewById(R.id.mr_chooser_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_chooser_route_progress_bar);
                if (imageView != null && progressBar != null) {
                    imageView.setVisibility(8);
                    progressBar.setVisibility(0);
                }
                item.n();
            }
        }
    }

    /* compiled from: MediaRouteChooserDialog.java */
    /* loaded from: classes.dex */
    public static final class d implements Comparator<f0.h> {
        public static final d b = new d();

        @Override // java.util.Comparator
        public final int compare(f0.h hVar, f0.h hVar2) {
            return hVar.d.compareToIgnoreCase(hVar2.d);
        }
    }

    public c(Context context) {
        this(context, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        dismiss();
    }

    private void updateViewForFindingDevices() {
        setTitle(R.string.mr_chooser_title);
        this.mListView.setVisibility(8);
        this.mSearchingRoutesTextView.setVisibility(0);
        this.mSearchingProgressBar.setVisibility(0);
        this.mOkButtonContainer.setVisibility(8);
        this.mOkButton.setVisibility(8);
        this.mLearnMoreTextView.setVisibility(8);
        this.mWifiWarningContainer.setVisibility(8);
    }

    private void updateViewForNoDevicesNoWifiHint() {
        setTitle(R.string.mr_chooser_title);
        this.mListView.setVisibility(8);
        this.mSearchingRoutesTextView.setVisibility(8);
        this.mSearchingProgressBar.setVisibility(0);
        this.mOkButtonContainer.setVisibility(8);
        this.mOkButton.setVisibility(8);
        this.mLearnMoreTextView.setVisibility(4);
        this.mWifiWarningContainer.setVisibility(0);
    }

    private void updateViewForNoRoutes() {
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.mListView.setVisibility(8);
        this.mSearchingRoutesTextView.setVisibility(8);
        this.mSearchingProgressBar.setVisibility(8);
        this.mOkButtonContainer.setVisibility(0);
        this.mOkButton.setVisibility(0);
        this.mLearnMoreTextView.setVisibility(0);
        this.mWifiWarningContainer.setVisibility(0);
    }

    private void updateViewForShowingRoutes() {
        setTitle(R.string.mr_chooser_title);
        this.mListView.setVisibility(0);
        this.mSearchingRoutesTextView.setVisibility(8);
        this.mSearchingProgressBar.setVisibility(8);
        this.mOkButtonContainer.setVisibility(8);
        this.mOkButton.setVisibility(8);
        this.mLearnMoreTextView.setVisibility(8);
        this.mWifiWarningContainer.setVisibility(8);
    }

    public e0 getRouteSelector() {
        return this.mSelector;
    }

    public void handleShowNoRoutes() {
        if (this.mRoutes.isEmpty()) {
            updateViewForState(3);
            this.mHandler.removeMessages(2);
            this.mHandler.removeMessages(3);
            this.mHandler.removeMessages(1);
            this.mRouter.i(this.mCallback);
        }
    }

    public void handleShowNoWifiWarning() {
        if (this.mRoutes.isEmpty()) {
            updateViewForState(2);
            this.mHandler.removeMessages(2);
            this.mHandler.removeMessages(3);
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(3), 15000L);
        }
    }

    public void handleUpdateRoutes(List<f0.h> list) {
        this.mLastUpdateTime = SystemClock.uptimeMillis();
        this.mRoutes.clear();
        this.mRoutes.addAll(list);
        this.mAdapter.notifyDataSetChanged();
        this.mHandler.removeMessages(3);
        this.mHandler.removeMessages(2);
        if (list.isEmpty()) {
            updateViewForState(0);
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(2), 5000L);
            return;
        }
        updateViewForState(1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.a(this.mSelector, this.mCallback, 1);
        refreshRoutes();
        this.mHandler.removeMessages(2);
        this.mHandler.removeMessages(3);
        this.mHandler.removeMessages(1);
        Handler handler = this.mHandler;
        handler.sendMessageDelayed(handler.obtainMessage(2), 5000L);
    }

    @Override // com.amazon.aps.iva.k.o, com.amazon.aps.iva.e.j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        String string;
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.mRoutes = new ArrayList<>();
        this.mAdapter = new C0217c(getContext(), this.mRoutes);
        this.mTitleView = (TextView) findViewById(R.id.mr_chooser_title);
        this.mSearchingRoutesTextView = (TextView) findViewById(R.id.mr_chooser_searching);
        this.mWifiWarningContainer = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.mWifiWarningTextView = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.mLearnMoreTextView = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.mOkButtonContainer = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.mOkButton = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.mSearchingProgressBar = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        boolean z2 = false;
        if (com.amazon.aps.iva.e8.a.a == null) {
            if (!com.amazon.aps.iva.e8.a.b(context)) {
                PackageManager packageManager = context.getPackageManager();
                if (com.amazon.aps.iva.e8.a.e == null) {
                    com.amazon.aps.iva.e8.a.e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (!com.amazon.aps.iva.e8.a.e.booleanValue()) {
                    PackageManager packageManager2 = context.getPackageManager();
                    if (com.amazon.aps.iva.e8.a.f == null) {
                        com.amazon.aps.iva.e8.a.f = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.automotive"));
                    }
                    if (!com.amazon.aps.iva.e8.a.f.booleanValue() && !com.amazon.aps.iva.e8.a.c(context)) {
                        z = true;
                        com.amazon.aps.iva.e8.a.a = Boolean.valueOf(z);
                    }
                }
            }
            z = false;
            com.amazon.aps.iva.e8.a.a = Boolean.valueOf(z);
        }
        if (!com.amazon.aps.iva.e8.a.a.booleanValue()) {
            if (com.amazon.aps.iva.e8.a.c == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z2 = true;
                }
                com.amazon.aps.iva.e8.a.c = Boolean.valueOf(z2);
            }
            if (!com.amazon.aps.iva.e8.a.c.booleanValue()) {
                if (!com.amazon.aps.iva.e8.a.b(context) && !com.amazon.aps.iva.e8.a.a(context.getResources())) {
                    if (com.amazon.aps.iva.e8.a.c(context)) {
                        string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                    } else {
                        PackageManager packageManager3 = context.getPackageManager();
                        if (com.amazon.aps.iva.e8.a.e == null) {
                            com.amazon.aps.iva.e8.a.e = Boolean.valueOf(packageManager3.hasSystemFeature("android.hardware.type.watch"));
                        }
                        if (com.amazon.aps.iva.e8.a.e.booleanValue()) {
                            string = context.getString(R.string.mr_chooser_wifi_warning_description_watch);
                        } else {
                            PackageManager packageManager4 = context.getPackageManager();
                            if (com.amazon.aps.iva.e8.a.f == null) {
                                com.amazon.aps.iva.e8.a.f = Boolean.valueOf(packageManager4.hasSystemFeature("android.hardware.type.automotive"));
                            }
                            if (com.amazon.aps.iva.e8.a.f.booleanValue()) {
                                string = context.getString(R.string.mr_chooser_wifi_warning_description_car);
                            } else {
                                string = context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                            }
                        }
                    }
                } else {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                }
                this.mWifiWarningTextView.setText(string);
                this.mLearnMoreTextView.setMovementMethod(LinkMovementMethod.getInstance());
                this.mOkButton.setOnClickListener(new s(this, 1));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.mListView = listView;
                listView.setAdapter((ListAdapter) this.mAdapter);
                this.mListView.setOnItemClickListener(this.mAdapter);
                this.mListView.setEmptyView(findViewById(16908292));
                updateLayout();
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.mWifiWarningTextView.setText(string);
        this.mLearnMoreTextView.setMovementMethod(LinkMovementMethod.getInstance());
        this.mOkButton.setOnClickListener(new s(this, 1));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.mListView = listView2;
        listView2.setAdapter((ListAdapter) this.mAdapter);
        this.mListView.setOnItemClickListener(this.mAdapter);
        this.mListView.setEmptyView(findViewById(16908292));
        updateLayout();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.mAttachedToWindow = false;
        this.mRouter.i(this.mCallback);
        this.mHandler.removeMessages(1);
        this.mHandler.removeMessages(2);
        this.mHandler.removeMessages(3);
        super.onDetachedFromWindow();
    }

    public boolean onFilterRoute(f0.h hVar) {
        if (!hVar.f() && hVar.g && hVar.j(this.mSelector)) {
            return true;
        }
        return false;
    }

    public void onFilterRoutes(List<f0.h> list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size > 0) {
                if (!onFilterRoute(list.get(i))) {
                    list.remove(i);
                }
                size = i;
            } else {
                return;
            }
        }
    }

    public void refreshRoutes() {
        if (this.mAttachedToWindow) {
            this.mRouter.getClass();
            ArrayList arrayList = new ArrayList(f0.f());
            onFilterRoutes(arrayList);
            Collections.sort(arrayList, d.b);
            if (SystemClock.uptimeMillis() - this.mLastUpdateTime >= UPDATE_ROUTES_DELAY_MS) {
                handleUpdateRoutes(arrayList);
                return;
            }
            this.mHandler.removeMessages(1);
            Handler handler = this.mHandler;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.mLastUpdateTime + UPDATE_ROUTES_DELAY_MS);
        }
    }

    public void setRouteSelector(e0 e0Var) {
        if (e0Var != null) {
            if (!this.mSelector.equals(e0Var)) {
                this.mSelector = e0Var;
                if (this.mAttachedToWindow) {
                    this.mRouter.i(this.mCallback);
                    this.mRouter.a(e0Var, this.mCallback, 1);
                }
                refreshRoutes();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    @Override // com.amazon.aps.iva.k.o, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.mTitleView.setText(charSequence);
    }

    public void updateLayout() {
        getWindow().setLayout(g.a(getContext()), -2);
    }

    public void updateViewForState(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        updateViewForNoRoutes();
                        return;
                    }
                    return;
                }
                updateViewForNoDevicesNoWifiHint();
                return;
            }
            updateViewForShowingRoutes();
            return;
        }
        updateViewForFindingDevices();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.view.ContextThemeWrapper r2 = androidx.mediarouter.app.d.a(r2, r3, r0)
            int r3 = androidx.mediarouter.app.d.b(r2)
            r1.<init>(r2, r3)
            com.amazon.aps.iva.f8.e0 r2 = com.amazon.aps.iva.f8.e0.c
            r1.mSelector = r2
            com.amazon.aps.iva.e8.c$a r2 = new com.amazon.aps.iva.e8.c$a
            r2.<init>()
            r1.mHandler = r2
            android.content.Context r2 = r1.getContext()
            com.amazon.aps.iva.f8.f0 r2 = com.amazon.aps.iva.f8.f0.d(r2)
            r1.mRouter = r2
            com.amazon.aps.iva.e8.c$b r2 = new com.amazon.aps.iva.e8.c$b
            r2.<init>()
            r1.mCallback = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e8.c.<init>(android.content.Context, int):void");
    }

    @Override // com.amazon.aps.iva.k.o, android.app.Dialog
    public void setTitle(int i) {
        this.mTitleView.setText(i);
    }
}
