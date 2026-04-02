package c.m.b;

import android.annotation.SuppressLint;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c.i.c.c;
import c.p.j;
import c.p.n0;
import c.w.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class o extends ComponentActivity implements c.a, c.b {
    public static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public boolean mCreated;
    public final c.p.r mFragmentLifecycleRegistry;
    public final t mFragments;
    public boolean mResumed;
    public boolean mStopped;

    /* loaded from: classes.dex */
    public class a extends v<o> implements n0, c.a.f, c.a.h.c, c.w.c, a0 {
        public a() {
            super(o.this);
        }

        @Override // c.m.b.a0
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            o.this.onAttachFragment(fragment);
        }

        @Override // c.m.b.r
        public View b(int i2) {
            return o.this.findViewById(i2);
        }

        @Override // c.m.b.r
        public boolean c() {
            Window window = o.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // c.m.b.v
        public o d() {
            return o.this;
        }

        @Override // c.m.b.v
        public LayoutInflater e() {
            return o.this.getLayoutInflater().cloneInContext(o.this);
        }

        @Override // c.m.b.v
        public boolean f(String str) {
            return c.i.c.c.d(o.this, str);
        }

        @Override // c.m.b.v
        public void g() {
            o.this.supportInvalidateOptionsMenu();
        }

        @Override // c.a.h.c
        public ActivityResultRegistry getActivityResultRegistry() {
            return o.this.getActivityResultRegistry();
        }

        @Override // c.p.p
        public c.p.j getLifecycle() {
            return o.this.mFragmentLifecycleRegistry;
        }

        @Override // c.a.f
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return o.this.getOnBackPressedDispatcher();
        }

        @Override // c.w.c
        public c.w.a getSavedStateRegistry() {
            return o.this.getSavedStateRegistry();
        }

        @Override // c.p.n0
        public c.p.m0 getViewModelStore() {
            return o.this.getViewModelStore();
        }
    }

    public o() {
        a aVar = new a();
        c.i.a.i(aVar, "callbacks == null");
        this.mFragments = new t(aVar);
        this.mFragmentLifecycleRegistry = new c.p.r(this);
        this.mStopped = true;
        init();
    }

    public o(int i2) {
        super(i2);
        a aVar = new a();
        c.i.a.i(aVar, "callbacks == null");
        this.mFragments = new t(aVar);
        this.mFragmentLifecycleRegistry = new c.p.r(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().b(LIFECYCLE_TAG, new a.b() { // from class: c.m.b.b
            @Override // c.w.a.b
            public final Bundle a() {
                o oVar = o.this;
                oVar.markFragmentsCreated();
                oVar.mFragmentLifecycleRegistry.e(j.a.ON_STOP);
                return new Bundle();
            }
        });
        addOnContextAvailableListener(new c.a.g.b() { // from class: c.m.b.a
            @Override // c.a.g.b
            public final void a(Context context) {
                v<?> vVar = o.this.mFragments.a;
                vVar.f2410d.b(vVar, vVar, null);
            }
        });
    }

    private static boolean markState(FragmentManager fragmentManager, j.b bVar) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.I()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), bVar);
                }
                i0 i0Var = fragment.mViewLifecycleOwner;
                if (i0Var != null) {
                    i0Var.b();
                    if (i0Var.f2368b.f2467c.isAtLeast(j.b.STARTED)) {
                        c.p.r rVar = fragment.mViewLifecycleOwner.f2368b;
                        rVar.d("setCurrentState");
                        rVar.g(bVar);
                        z = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f2467c.isAtLeast(j.b.STARTED)) {
                    c.p.r rVar2 = fragment.mLifecycleRegistry;
                    rVar2.d("setCurrentState");
                    rVar2.g(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.f2410d.f405f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            c.q.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.a.f2410d.w(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.a.f2410d;
    }

    @Deprecated
    public c.q.a.a getSupportLoaderManager() {
        return c.q.a.a.b(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), j.b.CREATED));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i2, i3, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.a();
        super.onConfigurationChanged(configuration);
        this.mFragments.a.f2410d.h(configuration);
    }

    @Override // androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(j.a.ON_CREATE);
        this.mFragments.a.f2410d.j();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
            t tVar = this.mFragments;
            return onCreatePanelMenu | tVar.a.f2410d.k(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i2, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.f2410d.l();
        this.mFragmentLifecycleRegistry.e(j.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.a.f2410d.m();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 != 0) {
            if (i2 != 6) {
                return false;
            }
            return this.mFragments.a.f2410d.i(menuItem);
        }
        return this.mFragments.a.f2410d.p(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.a.f2410d.n(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.mFragments.a();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.mFragments.a.f2410d.q(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.f2410d.u(5);
        this.mFragmentLifecycleRegistry.e(j.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.a.f2410d.s(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return i2 == 0 ? onPrepareOptionsPanel(view, menu) | this.mFragments.a.f2410d.t(menu) : super.onPreparePanel(i2, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.f2410d.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(j.a.ON_RESUME);
        FragmentManager fragmentManager = this.mFragments.a.f2410d;
        fragmentManager.A = false;
        fragmentManager.B = false;
        fragmentManager.H.f2420i = false;
        fragmentManager.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            FragmentManager fragmentManager = this.mFragments.a.f2410d;
            fragmentManager.A = false;
            fragmentManager.B = false;
            fragmentManager.H.f2420i = false;
            fragmentManager.u(4);
        }
        this.mFragments.a.f2410d.A(true);
        this.mFragmentLifecycleRegistry.e(j.a.ON_START);
        FragmentManager fragmentManager2 = this.mFragments.a.f2410d;
        fragmentManager2.A = false;
        fragmentManager2.B = false;
        fragmentManager2.H.f2420i = false;
        fragmentManager2.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        FragmentManager fragmentManager = this.mFragments.a.f2410d;
        fragmentManager.B = true;
        fragmentManager.H.f2420i = true;
        fragmentManager.u(4);
        this.mFragmentLifecycleRegistry.e(j.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(c.i.c.t tVar) {
        int i2 = c.i.c.c.f1944c;
        if (Build.VERSION.SDK_INT >= 21) {
            setEnterSharedElementCallback((SharedElementCallback) null);
        }
    }

    public void setExitSharedElementCallback(c.i.c.t tVar) {
        int i2 = c.i.c.c.f1944c;
        if (Build.VERSION.SDK_INT >= 21) {
            setExitSharedElementCallback((SharedElementCallback) null);
        }
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        startActivityFromFragment(fragment, intent, i2, (Bundle) null);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 != -1) {
            fragment.startActivityForResult(intent, i2, bundle);
            return;
        }
        int i3 = c.i.c.c.f1944c;
        startActivityForResult(intent, -1, bundle);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (i2 != -1) {
            fragment.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        int i6 = c.i.c.c.f1944c;
        startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public void supportFinishAfterTransition() {
        int i2 = c.i.c.c.f1944c;
        if (Build.VERSION.SDK_INT >= 21) {
            finishAfterTransition();
        } else {
            finish();
        }
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        int i2 = c.i.c.c.f1944c;
        if (Build.VERSION.SDK_INT >= 21) {
            postponeEnterTransition();
        }
    }

    public void supportStartPostponedEnterTransition() {
        int i2 = c.i.c.c.f1944c;
        if (Build.VERSION.SDK_INT >= 21) {
            startPostponedEnterTransition();
        }
    }

    @Override // c.i.c.c.b
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i2) {
    }
}
