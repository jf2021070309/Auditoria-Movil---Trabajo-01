package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.GlideExperiments;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public class RequestManagerRetriever implements Handler.Callback {
    private static final RequestManagerFactory DEFAULT_FACTORY = new RequestManagerFactory() { // from class: com.bumptech.glide.manager.RequestManagerRetriever.1
        @Override // com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
        public RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
            return new RequestManager(glide, lifecycle, requestManagerTreeNode, context);
        }
    };
    private static final String FRAGMENT_INDEX_KEY = "key";
    static final String FRAGMENT_TAG = "com.bumptech.glide.manager";
    private static final int HAS_ATTEMPTED_TO_ADD_FRAGMENT_TWICE = 1;
    private static final int ID_REMOVE_FRAGMENT_MANAGER = 1;
    private static final String TAG = "RMRetriever";
    private volatile RequestManager applicationManager;
    private final RequestManagerFactory factory;
    private final FrameWaiter frameWaiter;
    private final Handler handler;
    final Map<FragmentManager, RequestManagerFragment> pendingRequestManagerFragments = new HashMap();
    private final ArrayMap<View, Fragment> tempViewToFragment = new ArrayMap<>();
    private final Bundle tempBundle = new Bundle();

    /* loaded from: classes6.dex */
    public interface RequestManagerFactory {
        RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context);
    }

    public RequestManagerRetriever(RequestManagerFactory factory, GlideExperiments experiments) {
        this.factory = factory != null ? factory : DEFAULT_FACTORY;
        this.handler = new Handler(Looper.getMainLooper(), this);
        this.frameWaiter = buildFrameWaiter(experiments);
    }

    private static FrameWaiter buildFrameWaiter(GlideExperiments experiments) {
        if (!HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED || !HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED) {
            return new DoNothingFirstFrameWaiter();
        }
        if (experiments.isEnabled(GlideBuilder.WaitForFramesAfterTrimMemory.class)) {
            return new FirstFrameAndAfterTrimMemoryWaiter();
        }
        return new FirstFrameWaiter();
    }

    private RequestManager getApplicationManager(Context context) {
        if (this.applicationManager == null) {
            synchronized (this) {
                if (this.applicationManager == null) {
                    Glide glide = Glide.get(context.getApplicationContext());
                    this.applicationManager = this.factory.build(glide, new ApplicationLifecycle(), new EmptyRequestManagerTreeNode(), context.getApplicationContext());
                }
            }
        }
        return this.applicationManager;
    }

    public RequestManager get(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (Util.isOnMainThread() && !(context instanceof Application)) {
            if (context instanceof Activity) {
                return get((Activity) context);
            }
            if ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext().getApplicationContext() != null) {
                return get(((ContextWrapper) context).getBaseContext());
            }
        }
        return getApplicationManager(context);
    }

    public RequestManager get(Activity activity) {
        if (Util.isOnBackgroundThread()) {
            return get(activity.getApplicationContext());
        }
        assertNotDestroyed(activity);
        this.frameWaiter.registerSelf(activity);
        FragmentManager fm = activity.getFragmentManager();
        return fragmentGet(activity, fm, null, isActivityVisible(activity));
    }

    public RequestManager get(View view) {
        if (Util.isOnBackgroundThread()) {
            return get(view.getContext().getApplicationContext());
        }
        Preconditions.checkNotNull(view);
        Preconditions.checkNotNull(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activity = findActivity(view.getContext());
        if (activity == null) {
            return get(view.getContext().getApplicationContext());
        }
        Fragment fragment = findFragment(view, activity);
        if (fragment == null) {
            return get(activity);
        }
        return get(fragment);
    }

    @Deprecated
    private Fragment findFragment(View target, Activity activity) {
        this.tempViewToFragment.clear();
        findAllFragmentsWithViews(activity.getFragmentManager(), this.tempViewToFragment);
        Fragment result = null;
        View activityRoot = activity.findViewById(16908290);
        for (View current = target; !current.equals(activityRoot); current = (View) current.getParent()) {
            Fragment result2 = this.tempViewToFragment.get(current);
            result = result2;
            if (result != null || !(current.getParent() instanceof View)) {
                break;
            }
        }
        this.tempViewToFragment.clear();
        return result;
    }

    @Deprecated
    private void findAllFragmentsWithViews(FragmentManager fragmentManager, ArrayMap<View, Fragment> result) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    result.put(fragment.getView(), fragment);
                    findAllFragmentsWithViews(fragment.getChildFragmentManager(), result);
                }
            }
            return;
        }
        findAllFragmentsWithViewsPreO(fragmentManager, result);
    }

    @Deprecated
    private void findAllFragmentsWithViewsPreO(FragmentManager fragmentManager, ArrayMap<View, Fragment> result) {
        int index = 0;
        while (true) {
            int index2 = index + 1;
            this.tempBundle.putInt(FRAGMENT_INDEX_KEY, index);
            Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.tempBundle, FRAGMENT_INDEX_KEY);
            } catch (Exception e) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    result.put(fragment.getView(), fragment);
                    if (Build.VERSION.SDK_INT >= 17) {
                        findAllFragmentsWithViews(fragment.getChildFragmentManager(), result);
                    }
                }
                index = index2;
            } else {
                return;
            }
        }
    }

    private static Activity findActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void assertNotDestroyed(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    @Deprecated
    public RequestManager get(Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (Util.isOnBackgroundThread() || Build.VERSION.SDK_INT < 17) {
            return get(fragment.getActivity().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.frameWaiter.registerSelf(fragment.getActivity());
        }
        FragmentManager fm = fragment.getChildFragmentManager();
        return fragmentGet(fragment.getActivity(), fm, fragment, fragment.isVisible());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public RequestManagerFragment getRequestManagerFragment(Activity activity) {
        return getRequestManagerFragment(activity.getFragmentManager(), null);
    }

    private RequestManagerFragment getRequestManagerFragment(FragmentManager fm, Fragment parentHint) {
        RequestManagerFragment current = this.pendingRequestManagerFragments.get(fm);
        if (current == null) {
            RequestManagerFragment current2 = (RequestManagerFragment) fm.findFragmentByTag(FRAGMENT_TAG);
            if (current2 == null) {
                RequestManagerFragment current3 = new RequestManagerFragment();
                current3.setParentFragmentHint(parentHint);
                this.pendingRequestManagerFragments.put(fm, current3);
                fm.beginTransaction().add(current3, FRAGMENT_TAG).commitAllowingStateLoss();
                this.handler.obtainMessage(1, fm).sendToTarget();
                return current3;
            }
            return current2;
        }
        return current;
    }

    @Deprecated
    private RequestManager fragmentGet(Context context, FragmentManager fm, Fragment parentHint, boolean isParentVisible) {
        RequestManagerFragment current = getRequestManagerFragment(fm, parentHint);
        RequestManager requestManager = current.getRequestManager();
        if (requestManager == null) {
            Glide glide = Glide.get(context);
            requestManager = this.factory.build(glide, current.getGlideLifecycle(), current.getRequestManagerTreeNode(), context);
            if (isParentVisible) {
                requestManager.onStart();
            }
            current.setRequestManager(requestManager);
        }
        return requestManager;
    }

    private static boolean isActivityVisible(Context context) {
        Activity activity = findActivity(context);
        return activity == null || !activity.isFinishing();
    }

    private boolean verifyOurFragmentWasAddedOrCantBeAdded(FragmentManager fm, boolean hasAttemptedToAddFragmentTwice) {
        RequestManagerFragment newlyAddedRequestManagerFragment = this.pendingRequestManagerFragments.get(fm);
        RequestManagerFragment actualFragment = (RequestManagerFragment) fm.findFragmentByTag(FRAGMENT_TAG);
        if (actualFragment == newlyAddedRequestManagerFragment) {
            return true;
        }
        if (actualFragment != null && actualFragment.getRequestManager() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + actualFragment + " New: " + newlyAddedRequestManagerFragment);
        } else if (!hasAttemptedToAddFragmentTwice && !fm.isDestroyed()) {
            FragmentTransaction transaction = fm.beginTransaction().add(newlyAddedRequestManagerFragment, FRAGMENT_TAG);
            if (actualFragment != null) {
                transaction.remove(actualFragment);
            }
            transaction.commitAllowingStateLoss();
            this.handler.obtainMessage(1, 1, 0, fm).sendToTarget();
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "We failed to add our Fragment the first time around, trying again...");
            }
            return false;
        } else {
            if (Log.isLoggable(TAG, 5)) {
                if (fm.isDestroyed()) {
                    Log.w(TAG, "Parent was destroyed before our Fragment could be added");
                } else {
                    Log.w(TAG, "Tried adding Fragment twice and failed twice, giving up!");
                }
            }
            newlyAddedRequestManagerFragment.getGlideLifecycle().onDestroy();
            return true;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        boolean handled = true;
        boolean attemptedRemoval = false;
        Object removed = null;
        Object key = null;
        boolean hasAttemptedBefore = message.arg1 == 1;
        if (message.what == 1) {
            FragmentManager fm = (FragmentManager) message.obj;
            if (verifyOurFragmentWasAddedOrCantBeAdded(fm, hasAttemptedBefore)) {
                attemptedRemoval = true;
                key = fm;
                removed = this.pendingRequestManagerFragments.remove(fm);
            }
        } else {
            handled = false;
        }
        if (Log.isLoggable(TAG, 5) && attemptedRemoval && removed == null) {
            Log.w(TAG, "Failed to remove expected request manager fragment, manager: " + key);
        }
        return handled;
    }
}
