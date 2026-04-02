package com.amazon.aps.iva.a9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
/* compiled from: Transition.java */
/* loaded from: classes.dex */
public abstract class n implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<u> mEndValuesList;
    private f mEpicenterCallback;
    private com.amazon.aps.iva.x.a<String, String> mNameOverrides;
    q mPropagation;
    private ArrayList<u> mStartValuesList;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final j STRAIGHT_PATH_MOTION = new a();
    private static ThreadLocal<com.amazon.aps.iva.x.a<Animator, d>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private v mStartValues = new v();
    private v mEndValues = new v();
    r mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<g> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private j mPathMotion = STRAIGHT_PATH_MOTION;

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public class a extends j {
        @Override // com.amazon.aps.iva.a9.j
        public final Path getPath(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ com.amazon.aps.iva.x.a a;

        public b(com.amazon.aps.iva.x.a aVar) {
            this.a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            n.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            n.this.mCurrentAnimators.add(animator);
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            n.this.end();
            animator.removeListener(this);
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class d {
        public final View a;
        public final String b;
        public final u c;
        public final n0 d;
        public final n e;

        public d(View view, String str, n nVar, m0 m0Var, u uVar) {
            this.a = view;
            this.b = str;
            this.c = uVar;
            this.d = m0Var;
            this.e = nVar;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class e {
        public static ArrayList a(Object obj, ArrayList arrayList) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        public static ArrayList b(Object obj, ArrayList arrayList) {
            if (arrayList != null) {
                arrayList.remove(obj);
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            }
            return arrayList;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static abstract class f {
        public abstract Rect a();
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public interface g {
        void onTransitionCancel(n nVar);

        void onTransitionEnd(n nVar);

        void onTransitionPause(n nVar);

        void onTransitionResume(n nVar);

        void onTransitionStart(n nVar);
    }

    public n() {
    }

    private void addUnmatched(com.amazon.aps.iva.x.a<View, u> aVar, com.amazon.aps.iva.x.a<View, u> aVar2) {
        for (int i = 0; i < aVar.d; i++) {
            u n = aVar.n(i);
            if (isValidTarget(n.b)) {
                this.mStartValuesList.add(n);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.d; i2++) {
            u n2 = aVar2.n(i2);
            if (isValidTarget(n2.b)) {
                this.mEndValuesList.add(n2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(v vVar, View view, u uVar) {
        vVar.a.put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray<View> sparseArray = vVar.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
        String k = g0.i.k(view);
        if (k != null) {
            com.amazon.aps.iva.x.a<String, View> aVar = vVar.d;
            if (aVar.containsKey(k)) {
                aVar.put(k, null);
            } else {
                aVar.put(k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                com.amazon.aps.iva.x.f<View> fVar = vVar.c;
                if (fVar.b) {
                    fVar.c();
                }
                if (k0.f(fVar.c, fVar.e, itemIdAtPosition) >= 0) {
                    View view2 = (View) fVar.d(itemIdAtPosition, null);
                    if (view2 != null) {
                        g0.d.r(view2, false);
                        fVar.f(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                g0.d.r(view, true);
                fVar.f(itemIdAtPosition, view);
            }
        }
    }

    private static boolean alreadyContains(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private void captureHierarchy(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return;
        }
        ArrayList<View> arrayList2 = this.mTargetExcludes;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            u uVar = new u(view);
            if (z) {
                captureStartValues(uVar);
            } else {
                captureEndValues(uVar);
            }
            uVar.c.add(this);
            capturePropagationValues(uVar);
            if (z) {
                addViewValues(this.mStartValues, view, uVar);
            } else {
                addViewValues(this.mEndValues, view, uVar);
            }
        }
        if (view instanceof ViewGroup) {
            ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
            if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id))) {
                return;
            }
            ArrayList<View> arrayList5 = this.mTargetChildExcludes;
            if (arrayList5 != null && arrayList5.contains(view)) {
                return;
            }
            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
            if (arrayList6 != null) {
                int size2 = arrayList6.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (this.mTargetTypeChildExcludes.get(i2).isInstance(view)) {
                        return;
                    }
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                captureHierarchy(viewGroup.getChildAt(i3), z);
            }
        }
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i, boolean z) {
        if (i > 0) {
            if (z) {
                return e.a(Integer.valueOf(i), arrayList);
            }
            return e.b(Integer.valueOf(i), arrayList);
        }
        return arrayList;
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t, boolean z) {
        if (t != null) {
            if (z) {
                return e.a(t, arrayList);
            }
            return e.b(t, arrayList);
        }
        return arrayList;
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        if (cls != null) {
            if (z) {
                return e.a(cls, arrayList);
            }
            return e.b(cls, arrayList);
        }
        return arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z) {
        if (view != null) {
            if (z) {
                return e.a(view, arrayList);
            }
            return e.b(view, arrayList);
        }
        return arrayList;
    }

    private static com.amazon.aps.iva.x.a<Animator, d> getRunningAnimators() {
        com.amazon.aps.iva.x.a<Animator, d> aVar = sRunningAnimators.get();
        if (aVar == null) {
            com.amazon.aps.iva.x.a<Animator, d> aVar2 = new com.amazon.aps.iva.x.a<>();
            sRunningAnimators.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    private static boolean isValidMatch(int i) {
        if (i >= 1 && i <= 4) {
            return true;
        }
        return false;
    }

    private static boolean isValueChanged(u uVar, u uVar2, String str) {
        Object obj = uVar.a.get(str);
        Object obj2 = uVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void matchIds(com.amazon.aps.iva.x.a<View, u> aVar, com.amazon.aps.iva.x.a<View, u> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && isValidTarget(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                u orDefault = aVar.getOrDefault(valueAt, null);
                u orDefault2 = aVar2.getOrDefault(view, null);
                if (orDefault != null && orDefault2 != null) {
                    this.mStartValuesList.add(orDefault);
                    this.mEndValuesList.add(orDefault2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void matchInstances(com.amazon.aps.iva.x.a<View, u> aVar, com.amazon.aps.iva.x.a<View, u> aVar2) {
        u remove;
        for (int i = aVar.d - 1; i >= 0; i--) {
            View j = aVar.j(i);
            if (j != null && isValidTarget(j) && (remove = aVar2.remove(j)) != null && isValidTarget(remove.b)) {
                this.mStartValuesList.add(aVar.l(i));
                this.mEndValuesList.add(remove);
            }
        }
    }

    private void matchItemIds(com.amazon.aps.iva.x.a<View, u> aVar, com.amazon.aps.iva.x.a<View, u> aVar2, com.amazon.aps.iva.x.f<View> fVar, com.amazon.aps.iva.x.f<View> fVar2) {
        View view;
        int h = fVar.h();
        for (int i = 0; i < h; i++) {
            View i2 = fVar.i(i);
            if (i2 != null && isValidTarget(i2) && (view = (View) fVar2.d(fVar.e(i), null)) != null && isValidTarget(view)) {
                u orDefault = aVar.getOrDefault(i2, null);
                u orDefault2 = aVar2.getOrDefault(view, null);
                if (orDefault != null && orDefault2 != null) {
                    this.mStartValuesList.add(orDefault);
                    this.mEndValuesList.add(orDefault2);
                    aVar.remove(i2);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void matchNames(com.amazon.aps.iva.x.a<View, u> aVar, com.amazon.aps.iva.x.a<View, u> aVar2, com.amazon.aps.iva.x.a<String, View> aVar3, com.amazon.aps.iva.x.a<String, View> aVar4) {
        View orDefault;
        int i = aVar3.d;
        for (int i2 = 0; i2 < i; i2++) {
            View n = aVar3.n(i2);
            if (n != null && isValidTarget(n) && (orDefault = aVar4.getOrDefault(aVar3.j(i2), null)) != null && isValidTarget(orDefault)) {
                u orDefault2 = aVar.getOrDefault(n, null);
                u orDefault3 = aVar2.getOrDefault(orDefault, null);
                if (orDefault2 != null && orDefault3 != null) {
                    this.mStartValuesList.add(orDefault2);
                    this.mEndValuesList.add(orDefault3);
                    aVar.remove(n);
                    aVar2.remove(orDefault);
                }
            }
        }
    }

    private void matchStartAndEnd(v vVar, v vVar2) {
        com.amazon.aps.iva.x.a<View, u> aVar = new com.amazon.aps.iva.x.a<>(vVar.a);
        com.amazon.aps.iva.x.a<View, u> aVar2 = new com.amazon.aps.iva.x.a<>(vVar2.a);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                matchItemIds(aVar, aVar2, vVar.c, vVar2.c);
                            }
                        } else {
                            matchIds(aVar, aVar2, vVar.b, vVar2.b);
                        }
                    } else {
                        matchNames(aVar, aVar2, vVar.d, vVar2.d);
                    }
                } else {
                    matchInstances(aVar, aVar2);
                }
                i++;
            } else {
                addUnmatched(aVar, aVar2);
                return;
            }
        }
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if (MATCH_ID_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new InflateException(defpackage.e.e("Unknown match type in matchOrder: '", trim, "'"));
            }
            i++;
        }
        return iArr;
    }

    private void runAnimator(Animator animator, com.amazon.aps.iva.x.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            animate(animator);
        }
    }

    public n addListener(g gVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(gVar);
        return this;
    }

    public n addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<g> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((g) arrayList2.get(i)).onTransitionCancel(this);
            }
        }
    }

    public abstract void captureEndValues(u uVar);

    public abstract void captureStartValues(u uVar);

    public void captureValues(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        com.amazon.aps.iva.x.a<String, String> aVar;
        clearValues(z);
        if ((this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) || (((arrayList = this.mTargetNames) != null && !arrayList.isEmpty()) || ((arrayList2 = this.mTargetTypes) != null && !arrayList2.isEmpty()))) {
            captureHierarchy(viewGroup, z);
        } else {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (findViewById != null) {
                    u uVar = new u(findViewById);
                    if (z) {
                        captureStartValues(uVar);
                    } else {
                        captureEndValues(uVar);
                    }
                    uVar.c.add(this);
                    capturePropagationValues(uVar);
                    if (z) {
                        addViewValues(this.mStartValues, findViewById, uVar);
                    } else {
                        addViewValues(this.mEndValues, findViewById, uVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = this.mTargets.get(i2);
                u uVar2 = new u(view);
                if (z) {
                    captureStartValues(uVar2);
                } else {
                    captureEndValues(uVar2);
                }
                uVar2.c.add(this);
                capturePropagationValues(uVar2);
                if (z) {
                    addViewValues(this.mStartValues, view, uVar2);
                } else {
                    addViewValues(this.mEndValues, view, uVar2);
                }
            }
        }
        if (!z && (aVar = this.mNameOverrides) != null) {
            int i3 = aVar.d;
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(this.mStartValues.d.remove(this.mNameOverrides.j(i4)));
            }
            for (int i5 = 0; i5 < i3; i5++) {
                View view2 = (View) arrayList3.get(i5);
                if (view2 != null) {
                    this.mStartValues.d.put(this.mNameOverrides.n(i5), view2);
                }
            }
        }
    }

    public void clearValues(boolean z) {
        if (z) {
            this.mStartValues.a.clear();
            this.mStartValues.b.clear();
            this.mStartValues.c.a();
            return;
        }
        this.mEndValues.a.clear();
        this.mEndValues.b.clear();
        this.mEndValues.c.a();
    }

    public Animator createAnimator(ViewGroup viewGroup, u uVar, u uVar2) {
        return null;
    }

    public void createAnimators(ViewGroup viewGroup, v vVar, v vVar2, ArrayList<u> arrayList, ArrayList<u> arrayList2) {
        boolean z;
        Animator createAnimator;
        View view;
        Animator animator;
        u uVar;
        Animator animator2;
        u uVar2;
        ViewGroup viewGroup2 = viewGroup;
        com.amazon.aps.iva.x.a<Animator, d> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            u uVar3 = arrayList.get(i);
            u uVar4 = arrayList2.get(i);
            if (uVar3 != null && !uVar3.c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.c.contains(this)) {
                uVar4 = null;
            }
            if (uVar3 != null || uVar4 != null) {
                if (uVar3 != null && uVar4 != null && !isTransitionRequired(uVar3, uVar4)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && (createAnimator = createAnimator(viewGroup2, uVar3, uVar4)) != null) {
                    if (uVar4 != null) {
                        View view2 = uVar4.b;
                        String[] transitionProperties = getTransitionProperties();
                        if (transitionProperties != null && transitionProperties.length > 0) {
                            uVar2 = new u(view2);
                            u orDefault = vVar2.a.getOrDefault(view2, null);
                            if (orDefault != null) {
                                int i2 = 0;
                                while (i2 < transitionProperties.length) {
                                    HashMap hashMap = uVar2.a;
                                    Animator animator3 = createAnimator;
                                    String str = transitionProperties[i2];
                                    hashMap.put(str, orDefault.a.get(str));
                                    i2++;
                                    createAnimator = animator3;
                                    transitionProperties = transitionProperties;
                                }
                            }
                            Animator animator4 = createAnimator;
                            int i3 = runningAnimators.d;
                            int i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    d orDefault2 = runningAnimators.getOrDefault(runningAnimators.j(i4), null);
                                    if (orDefault2.c != null && orDefault2.a == view2 && orDefault2.b.equals(getName()) && orDefault2.c.equals(uVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    animator2 = animator4;
                                    break;
                                }
                            }
                        } else {
                            animator2 = createAnimator;
                            uVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        uVar = uVar2;
                    } else {
                        view = uVar3.b;
                        animator = createAnimator;
                        uVar = null;
                    }
                    if (animator != null) {
                        String name = getName();
                        i0 i0Var = z.a;
                        runningAnimators.put(animator, new d(view, name, this, new m0(viewGroup2), uVar));
                        this.mAnimators.add(animator);
                    }
                    i++;
                    viewGroup2 = viewGroup;
                }
            }
            i++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator5 = this.mAnimators.get(sparseIntArray.keyAt(i5));
                animator5.setStartDelay(animator5.getStartDelay() + (sparseIntArray.valueAt(i5) - Long.MAX_VALUE));
            }
        }
    }

    public void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            ArrayList<g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((g) arrayList2.get(i2)).onTransitionEnd(this);
                }
            }
            for (int i3 = 0; i3 < this.mStartValues.c.h(); i3++) {
                View i4 = this.mStartValues.c.i(i3);
                if (i4 != null) {
                    WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                    g0.d.r(i4, false);
                }
            }
            for (int i5 = 0; i5 < this.mEndValues.c.h(); i5++) {
                View i6 = this.mEndValues.c.i(i5);
                if (i6 != null) {
                    WeakHashMap<View, r0> weakHashMap2 = com.amazon.aps.iva.p3.g0.a;
                    g0.d.r(i6, false);
                }
            }
            this.mEnded = true;
        }
    }

    public n excludeChildren(View view, boolean z) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z);
        return this;
    }

    public n excludeTarget(View view, boolean z) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z);
        return this;
    }

    public void forceToEnd(ViewGroup viewGroup) {
        boolean z;
        com.amazon.aps.iva.x.a<Animator, d> runningAnimators = getRunningAnimators();
        int i = runningAnimators.d;
        if (viewGroup != null && i != 0) {
            i0 i0Var = z.a;
            WindowId windowId = viewGroup.getWindowId();
            com.amazon.aps.iva.x.a aVar = new com.amazon.aps.iva.x.a(runningAnimators);
            runningAnimators.clear();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                d dVar = (d) aVar.n(i2);
                if (dVar.a != null) {
                    n0 n0Var = dVar.d;
                    if ((n0Var instanceof m0) && ((m0) n0Var).a.equals(windowId)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        ((Animator) aVar.j(i2)).end();
                    }
                }
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Rect getEpicenter() {
        f fVar = this.mEpicenterCallback;
        if (fVar == null) {
            return null;
        }
        return fVar.a();
    }

    public f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public u getMatchedTransitionValues(View view, boolean z) {
        ArrayList<u> arrayList;
        ArrayList<u> arrayList2;
        r rVar = this.mParent;
        if (rVar != null) {
            return rVar.getMatchedTransitionValues(view, z);
        }
        if (z) {
            arrayList = this.mStartValuesList;
        } else {
            arrayList = this.mEndValuesList;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                u uVar = arrayList.get(i);
                if (uVar == null) {
                    return null;
                }
                if (uVar.b == view) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.mEndValuesList;
        } else {
            arrayList2 = this.mStartValuesList;
        }
        return arrayList2.get(i);
    }

    public String getName() {
        return this.mName;
    }

    public j getPathMotion() {
        return this.mPathMotion;
    }

    public q getPropagation() {
        return null;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    public List<View> getTargets() {
        return this.mTargets;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public u getTransitionValues(View view, boolean z) {
        v vVar;
        r rVar = this.mParent;
        if (rVar != null) {
            return rVar.getTransitionValues(view, z);
        }
        if (z) {
            vVar = this.mStartValues;
        } else {
            vVar = this.mEndValues;
        }
        return vVar.a.getOrDefault(view, null);
    }

    public boolean isTransitionRequired(u uVar, u uVar2) {
        if (uVar == null || uVar2 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties != null) {
            for (String str : transitionProperties) {
                if (!isValueChanged(uVar, uVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : uVar.a.keySet()) {
            if (isValueChanged(uVar, uVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null) {
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            if (g0.i.k(view) != null && this.mTargetNameExcludes.contains(g0.i.k(view))) {
                return false;
            }
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null) {
            WeakHashMap<View, r0> weakHashMap2 = com.amazon.aps.iva.p3.g0.a;
            if (arrayList6.contains(g0.i.k(view))) {
                return true;
            }
        }
        if (this.mTargetTypes != null) {
            for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                if (this.mTargetTypes.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void pause(View view) {
        if (!this.mEnded) {
            for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
                this.mCurrentAnimators.get(size).pause();
            }
            ArrayList<g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size2 = arrayList2.size();
                for (int i = 0; i < size2; i++) {
                    ((g) arrayList2.get(i)).onTransitionPause(this);
                }
            }
            this.mPaused = true;
        }
    }

    public void playTransition(ViewGroup viewGroup) {
        d orDefault;
        View view;
        boolean z;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        com.amazon.aps.iva.x.a<Animator, d> runningAnimators = getRunningAnimators();
        int i = runningAnimators.d;
        i0 i0Var = z.a;
        WindowId windowId = viewGroup.getWindowId();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            Animator j = runningAnimators.j(i2);
            if (j != null && (orDefault = runningAnimators.getOrDefault(j, null)) != null && (view = orDefault.a) != null) {
                n0 n0Var = orDefault.d;
                boolean z2 = false;
                if ((n0Var instanceof m0) && ((m0) n0Var).a.equals(windowId)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    u transitionValues = getTransitionValues(view, true);
                    u matchedTransitionValues = getMatchedTransitionValues(view, true);
                    if (transitionValues == null && matchedTransitionValues == null) {
                        matchedTransitionValues = this.mEndValues.a.getOrDefault(view, null);
                    }
                    if ((transitionValues != null || matchedTransitionValues != null) && orDefault.e.isTransitionRequired(orDefault.c, matchedTransitionValues)) {
                        z2 = true;
                    }
                    if (z2) {
                        if (!j.isRunning() && !j.isStarted()) {
                            runningAnimators.remove(j);
                        } else {
                            j.cancel();
                        }
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    public n removeListener(g gVar) {
        ArrayList<g> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(gVar);
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    public n removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
                    this.mCurrentAnimators.get(size).resume();
                }
                ArrayList<g> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((g) arrayList2.get(i)).onTransitionResume(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    public void runAnimators() {
        start();
        com.amazon.aps.iva.x.a<Animator, d> runningAnimators = getRunningAnimators();
        Iterator<Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (runningAnimators.containsKey(next)) {
                start();
                runAnimator(next, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    public n setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public void setEpicenterCallback(f fVar) {
        this.mEpicenterCallback = fVar;
    }

    public n setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            for (int i = 0; i < iArr.length; i++) {
                if (isValidMatch(iArr[i])) {
                    if (alreadyContains(iArr, i)) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                } else {
                    throw new IllegalArgumentException("matches contains invalid value");
                }
            }
            this.mMatchOrder = (int[]) iArr.clone();
            return;
        }
        this.mMatchOrder = DEFAULT_MATCH_ORDER;
    }

    public void setPathMotion(j jVar) {
        if (jVar == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = jVar;
        }
    }

    public n setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    public void start() {
        if (this.mNumInstances == 0) {
            ArrayList<g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((g) arrayList2.get(i)).onTransitionStart(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString(String str) {
        StringBuilder b2 = defpackage.c.b(str);
        b2.append(getClass().getSimpleName());
        b2.append("@");
        b2.append(Integer.toHexString(hashCode()));
        b2.append(": ");
        String sb = b2.toString();
        if (this.mDuration != -1) {
            sb = com.amazon.aps.iva.c.b.b(com.amazon.aps.iva.b6.x.b(sb, "dur("), this.mDuration, ") ");
        }
        if (this.mStartDelay != -1) {
            sb = com.amazon.aps.iva.c.b.b(com.amazon.aps.iva.b6.x.b(sb, "dly("), this.mStartDelay, ") ");
        }
        if (this.mInterpolator != null) {
            StringBuilder b3 = com.amazon.aps.iva.b6.x.b(sb, "interp(");
            b3.append(this.mInterpolator);
            b3.append(") ");
            sb = b3.toString();
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            String f2 = com.amazon.aps.iva.c80.a.f(sb, "tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i = 0; i < this.mTargetIds.size(); i++) {
                    if (i > 0) {
                        f2 = com.amazon.aps.iva.c80.a.f(f2, ", ");
                    }
                    StringBuilder b4 = defpackage.c.b(f2);
                    b4.append(this.mTargetIds.get(i));
                    f2 = b4.toString();
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                    if (i2 > 0) {
                        f2 = com.amazon.aps.iva.c80.a.f(f2, ", ");
                    }
                    StringBuilder b5 = defpackage.c.b(f2);
                    b5.append(this.mTargets.get(i2));
                    f2 = b5.toString();
                }
            }
            return com.amazon.aps.iva.c80.a.f(f2, ")");
        }
        return sb;
    }

    public n addTarget(int i) {
        if (i != 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    @Override // 
    /* renamed from: clone */
    public n mo4clone() {
        try {
            n nVar = (n) super.clone();
            nVar.mAnimators = new ArrayList<>();
            nVar.mStartValues = new v();
            nVar.mEndValues = new v();
            nVar.mStartValuesList = null;
            nVar.mEndValuesList = null;
            return nVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public n excludeChildren(int i, boolean z) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    public n excludeTarget(int i, boolean z) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i, z);
        return this;
    }

    public n removeTarget(int i) {
        if (i != 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    public n addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public n excludeChildren(Class<?> cls, boolean z) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    public n excludeTarget(String str, boolean z) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z);
        return this;
    }

    public n removeTarget(String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public n excludeTarget(Class<?> cls, boolean z) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    public n removeTarget(Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public n addTarget(Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public void capturePropagationValues(u uVar) {
    }

    public void setPropagation(q qVar) {
    }

    @SuppressLint({"RestrictedApi"})
    public n(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long e2 = com.amazon.aps.iva.f3.j.e(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (e2 >= 0) {
            setDuration(e2);
        }
        long e3 = com.amazon.aps.iva.f3.j.e(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (e3 > 0) {
            setStartDelay(e3);
        }
        int resourceId = com.amazon.aps.iva.f3.j.h(xmlResourceParser, "interpolator") ? obtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String f2 = com.amazon.aps.iva.f3.j.f(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (f2 != null) {
            setMatchOrder(parseMatchOrder(f2));
        }
        obtainStyledAttributes.recycle();
    }

    public String toString() {
        return toString("");
    }
}
