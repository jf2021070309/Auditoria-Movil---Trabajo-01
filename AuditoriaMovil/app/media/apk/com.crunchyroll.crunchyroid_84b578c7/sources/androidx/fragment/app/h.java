package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.g;
import androidx.savedstate.a;
import com.amazon.aps.iva.c3.a;
import com.amazon.aps.iva.c3.a0;
import com.amazon.aps.iva.c3.c0;
import com.amazon.aps.iva.c3.f0;
import com.amazon.aps.iva.c3.z;
import com.amazon.aps.iva.e.v;
import com.amazon.aps.iva.i5.g0;
import com.amazon.aps.iva.i5.h0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: FragmentActivity.java */
/* loaded from: classes.dex */
public class h extends ComponentActivity implements a.f {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.k mFragmentLifecycleRegistry;
    final com.amazon.aps.iva.n4.m mFragments;
    boolean mResumed;
    boolean mStopped;

    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    public class a extends com.amazon.aps.iva.n4.n<h> implements com.amazon.aps.iva.d3.b, com.amazon.aps.iva.d3.c, z, a0, h0, v, com.amazon.aps.iva.h.f, com.amazon.aps.iva.s8.c, com.amazon.aps.iva.n4.u, com.amazon.aps.iva.p3.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(r1);
            h.this = r1;
        }

        @Override // com.amazon.aps.iva.n4.n
        public final void B(PrintWriter printWriter, String[] strArr) {
            h.this.dump("  ", null, printWriter, strArr);
        }

        @Override // com.amazon.aps.iva.n4.n
        public final h G() {
            return h.this;
        }

        @Override // com.amazon.aps.iva.n4.n
        public final LayoutInflater Z() {
            h hVar = h.this;
            return hVar.getLayoutInflater().cloneInContext(hVar);
        }

        @Override // com.amazon.aps.iva.p3.i
        public final void addMenuProvider(com.amazon.aps.iva.p3.n nVar) {
            h.this.addMenuProvider(nVar);
        }

        @Override // com.amazon.aps.iva.d3.b
        public final void addOnConfigurationChangedListener(com.amazon.aps.iva.o3.a<Configuration> aVar) {
            h.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // com.amazon.aps.iva.c3.z
        public final void addOnMultiWindowModeChangedListener(com.amazon.aps.iva.o3.a<com.amazon.aps.iva.c3.k> aVar) {
            h.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // com.amazon.aps.iva.c3.a0
        public final void addOnPictureInPictureModeChangedListener(com.amazon.aps.iva.o3.a<c0> aVar) {
            h.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // com.amazon.aps.iva.d3.c
        public final void addOnTrimMemoryListener(com.amazon.aps.iva.o3.a<Integer> aVar) {
            h.this.addOnTrimMemoryListener(aVar);
        }

        @Override // com.amazon.aps.iva.n4.u
        public final void g(Fragment fragment) {
            h.this.onAttachFragment(fragment);
        }

        @Override // com.amazon.aps.iva.h.f
        public final androidx.activity.result.a getActivityResultRegistry() {
            return h.this.getActivityResultRegistry();
        }

        @Override // com.amazon.aps.iva.i5.o
        public final androidx.lifecycle.g getLifecycle() {
            return h.this.mFragmentLifecycleRegistry;
        }

        @Override // com.amazon.aps.iva.e.v
        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return h.this.getOnBackPressedDispatcher();
        }

        @Override // com.amazon.aps.iva.s8.c
        public final androidx.savedstate.a getSavedStateRegistry() {
            return h.this.getSavedStateRegistry();
        }

        @Override // com.amazon.aps.iva.i5.h0
        public final g0 getViewModelStore() {
            return h.this.getViewModelStore();
        }

        @Override // com.amazon.aps.iva.n4.n
        public final boolean h0(String str) {
            return com.amazon.aps.iva.c3.a.a(h.this, str);
        }

        @Override // com.amazon.aps.iva.n4.n
        public final void m0() {
            h.this.invalidateMenu();
        }

        @Override // com.amazon.aps.iva.n4.l
        public final View r(int i) {
            return h.this.findViewById(i);
        }

        @Override // com.amazon.aps.iva.p3.i
        public final void removeMenuProvider(com.amazon.aps.iva.p3.n nVar) {
            h.this.removeMenuProvider(nVar);
        }

        @Override // com.amazon.aps.iva.d3.b
        public final void removeOnConfigurationChangedListener(com.amazon.aps.iva.o3.a<Configuration> aVar) {
            h.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // com.amazon.aps.iva.c3.z
        public final void removeOnMultiWindowModeChangedListener(com.amazon.aps.iva.o3.a<com.amazon.aps.iva.c3.k> aVar) {
            h.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // com.amazon.aps.iva.c3.a0
        public final void removeOnPictureInPictureModeChangedListener(com.amazon.aps.iva.o3.a<c0> aVar) {
            h.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // com.amazon.aps.iva.d3.c
        public final void removeOnTrimMemoryListener(com.amazon.aps.iva.o3.a<Integer> aVar) {
            h.this.removeOnTrimMemoryListener(aVar);
        }

        @Override // com.amazon.aps.iva.n4.l
        public final boolean y() {
            Window window = h.this.getWindow();
            if (window != null && window.peekDecorView() != null) {
                return true;
            }
            return false;
        }
    }

    public h() {
        this.mFragments = new com.amazon.aps.iva.n4.m(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.k(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new a.b() { // from class: com.amazon.aps.iva.n4.i
            @Override // androidx.savedstate.a.b
            public final Bundle a() {
                Bundle lambda$init$0;
                lambda$init$0 = androidx.fragment.app.h.this.lambda$init$0();
                return lambda$init$0;
            }
        });
        addOnConfigurationChangedListener(new com.amazon.aps.iva.o3.a() { // from class: com.amazon.aps.iva.n4.j
            @Override // com.amazon.aps.iva.o3.a
            public final void a(Object obj) {
                androidx.fragment.app.h.this.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new com.amazon.aps.iva.o3.a() { // from class: com.amazon.aps.iva.n4.k
            @Override // com.amazon.aps.iva.o3.a
            public final void a(Object obj) {
                androidx.fragment.app.h.this.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new com.amazon.aps.iva.e.g(this, 1));
    }

    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.c(g.a.ON_STOP);
        return new Bundle();
    }

    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    public void lambda$init$3(Context context) {
        com.amazon.aps.iva.n4.n<?> nVar = this.mFragments.a;
        nVar.e.b(nVar, nVar, null);
    }

    private static boolean markState(FragmentManager fragmentManager, g.b bVar) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), bVar);
                }
                s sVar = fragment.mViewLifecycleOwner;
                if (sVar != null) {
                    sVar.r();
                    if (sVar.f.c.isAtLeast(g.b.STARTED)) {
                        fragment.mViewLifecycleOwner.f.e(bVar);
                        z = true;
                    }
                }
                if (fragment.mLifecycleRegistry.c.isAtLeast(g.b.STARTED)) {
                    fragment.mLifecycleRegistry.e(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.e.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
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
            com.amazon.aps.iva.m5.a.a(this).b(str2, printWriter);
        }
        this.mFragments.a.e.u(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.a.e;
    }

    @Deprecated
    public com.amazon.aps.iva.m5.a getSupportLoaderManager() {
        return com.amazon.aps.iva.m5.a.a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), g.b.CREATED));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.c(g.a.ON_CREATE);
        com.amazon.aps.iva.n4.t tVar = this.mFragments.a.e;
        tVar.G = false;
        tVar.H = false;
        tVar.N.g = false;
        tVar.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.e.k();
        this.mFragmentLifecycleRegistry.c(g.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.a.e.i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.e.t(5);
        this.mFragmentLifecycleRegistry.c(g.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.e.x(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.c(g.a.ON_RESUME);
        com.amazon.aps.iva.n4.t tVar = this.mFragments.a.e;
        tVar.G = false;
        tVar.H = false;
        tVar.N.g = false;
        tVar.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            com.amazon.aps.iva.n4.t tVar = this.mFragments.a.e;
            tVar.G = false;
            tVar.H = false;
            tVar.N.g = false;
            tVar.t(4);
        }
        this.mFragments.a.e.x(true);
        this.mFragmentLifecycleRegistry.c(g.a.ON_START);
        com.amazon.aps.iva.n4.t tVar2 = this.mFragments.a.e;
        tVar2.G = false;
        tVar2.H = false;
        tVar2.N.g = false;
        tVar2.t(5);
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
        com.amazon.aps.iva.n4.t tVar = this.mFragments.a.e;
        tVar.H = true;
        tVar.N.g = true;
        tVar.t(4);
        this.mFragmentLifecycleRegistry.c(g.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(f0 f0Var) {
        a.g gVar;
        int i = com.amazon.aps.iva.c3.a.a;
        if (f0Var != null) {
            gVar = new a.g(f0Var);
        } else {
            gVar = null;
        }
        a.b.c(this, gVar);
    }

    public void setExitSharedElementCallback(f0 f0Var) {
        a.g gVar;
        int i = com.amazon.aps.iva.c3.a.a;
        if (f0Var != null) {
            gVar = new a.g(f0Var);
        } else {
            gVar = null;
        }
        a.b.d(this, gVar);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            int i5 = com.amazon.aps.iva.c3.a.a;
            a.C0160a.c(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void supportFinishAfterTransition() {
        int i = com.amazon.aps.iva.c3.a.a;
        a.b.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        int i = com.amazon.aps.iva.c3.a.a;
        a.b.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i = com.amazon.aps.iva.c3.a.a;
        a.b.e(this);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            int i2 = com.amazon.aps.iva.c3.a.a;
            a.C0160a.b(this, intent, -1, bundle);
            return;
        }
        fragment.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public h(int i) {
        super(i);
        this.mFragments = new com.amazon.aps.iva.n4.m(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.k(this);
        this.mStopped = true;
        init();
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // com.amazon.aps.iva.c3.a.f
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
