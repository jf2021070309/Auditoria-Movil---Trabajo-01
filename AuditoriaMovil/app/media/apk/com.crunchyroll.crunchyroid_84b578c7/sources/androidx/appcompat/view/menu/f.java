package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.amazon.aps.iva.p3.j0;
import com.google.android.gms.cast.CredentialsData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.http2.Settings;
/* compiled from: MenuBuilder.java */
/* loaded from: classes.dex */
public class f implements com.amazon.aps.iva.i3.a {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private a mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private h mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<h> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<j>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<h> mItems = new ArrayList<>();
    private ArrayList<h> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<h> mActionItems = new ArrayList<>();
    private ArrayList<h> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean onMenuItemSelected(f fVar, MenuItem menuItem);

        void onMenuModeChange(f fVar);
    }

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean b(h hVar);
    }

    public f(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        setShortcutsVisibleInner(true);
    }

    private h createNewMenuItem(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new h(this, i, i2, i3, i4, charSequence, i5);
    }

    private void dispatchPresenterUpdate(boolean z) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<j>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.mPresenters.remove(next);
            } else {
                jVar.updateMenuView(z);
            }
        }
        startDispatchingItemsChanged();
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray != null && !this.mPresenters.isEmpty()) {
            Iterator<WeakReference<j>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.mPresenters.remove(next);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        jVar.onRestoreInstanceState(parcelable);
                    }
                }
            }
        }
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
        Parcelable onSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<j>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.mPresenters.remove(next);
            } else {
                int id = jVar.getId();
                if (id > 0 && (onSaveInstanceState = jVar.onSaveInstanceState()) != null) {
                    sparseArray.put(id, onSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    private boolean dispatchSubMenuSelected(m mVar, j jVar) {
        boolean z = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        if (jVar != null) {
            z = jVar.onSubMenuSelected(mVar);
        }
        Iterator<WeakReference<j>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null) {
                this.mPresenters.remove(next);
            } else if (!z) {
                z = jVar2.onSubMenuSelected(mVar);
            }
        }
        return z;
    }

    private static int findInsertIndex(ArrayList<h> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).d <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    private static int getOrdering(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i2 < iArr.length) {
                return (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void removeItemAtInt(int i, boolean z) {
        if (i >= 0 && i < this.mItems.size()) {
            this.mItems.remove(i);
            if (z) {
                onItemsChanged(true);
            }
        }
    }

    private void setHeaderInternal(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i > 0) {
                this.mHeaderTitle = resources.getText(i);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i2 > 0) {
                this.mHeaderIcon = com.amazon.aps.iva.d3.a.getDrawable(getContext(), i2);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    private void setShortcutsVisibleInner(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (z && this.mResources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this.mContext);
            Context context = this.mContext;
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = j0.b(viewConfiguration);
            } else {
                Resources resources = context.getResources();
                int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", CredentialsData.CREDENTIALS_TYPE_ANDROID);
                if (identifier != 0 && resources.getBoolean(identifier)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                z3 = true;
            }
        }
        this.mShortcutsVisible = z3;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent4;
            }
        }
        return i5;
    }

    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        int ordering = getOrdering(i3);
        h createNewMenuItem = createNewMenuItem(i, i2, i3, ordering, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            createNewMenuItem.D = contextMenuInfo;
        }
        ArrayList<h> arrayList = this.mItems;
        arrayList.add(findInsertIndex(arrayList, ordering), createNewMenuItem);
        onItemsChanged(true);
        return createNewMenuItem;
    }

    public void addMenuPresenter(j jVar) {
        addMenuPresenter(jVar, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void changeMenuMode() {
        a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        h hVar = this.mExpandedItem;
        if (hVar != null) {
            collapseItemActionView(hVar);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public final void close(boolean z) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        Iterator<WeakReference<j>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.mPresenters.remove(next);
            } else {
                jVar.onCloseMenu(this, z);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(h hVar) {
        boolean z = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == hVar) {
            stopDispatchingItemsChanged();
            Iterator<WeakReference<j>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.mPresenters.remove(next);
                } else {
                    z = jVar.collapseItemActionView(this, hVar);
                    if (z) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (z) {
                this.mExpandedItem = null;
            }
        }
        return z;
    }

    public boolean dispatchMenuItemSelected(f fVar, MenuItem menuItem) {
        a aVar = this.mCallback;
        if (aVar != null && aVar.onMenuItemSelected(fVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean expandItemActionView(h hVar) {
        boolean z = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<j>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.mPresenters.remove(next);
            } else {
                z = jVar.expandItemActionView(this, hVar);
                if (z) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (z) {
            this.mExpandedItem = hVar;
        }
        return z;
    }

    public int findGroupIndex(int i) {
        return findGroupIndex(i, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.mItems.get(i2);
            if (hVar.a == i) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.mItems.get(i2).a == i) {
                return i2;
            }
        }
        return -1;
    }

    public h findItemWithShortcutForKey(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<h> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean isQwertyMode = isQwertyMode();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = arrayList.get(i2);
            if (isQwertyMode) {
                c = hVar.j;
            } else {
                c = hVar.h;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (isQwertyMode && c == '\b' && i == 67))) {
                return hVar;
            }
        }
        return null;
    }

    public void findItemsWithShortcutForKey(List<h> list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean z;
        boolean isQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i != 67) {
            return;
        }
        int size = this.mItems.size();
        for (int i3 = 0; i3 < size; i3++) {
            h hVar = this.mItems.get(i3);
            if (hVar.hasSubMenu()) {
                hVar.o.findItemsWithShortcutForKey(list, i, keyEvent);
            }
            if (isQwertyMode) {
                c = hVar.j;
            } else {
                c = hVar.h;
            }
            if (isQwertyMode) {
                i2 = hVar.k;
            } else {
                i2 = hVar.i;
            }
            if ((modifiers & 69647) == (i2 & 69647)) {
                z = true;
            } else {
                z = false;
            }
            if (z && c != 0) {
                char[] cArr = keyData.meta;
                if ((c == cArr[0] || c == cArr[2] || (isQwertyMode && c == '\b' && i == 67)) && hVar.isEnabled()) {
                    list.add(hVar);
                }
            }
        }
    }

    public void flagActionItems() {
        boolean z;
        ArrayList<h> visibleItems = getVisibleItems();
        if (!this.mIsActionItemsStale) {
            return;
        }
        Iterator<WeakReference<j>> it = this.mPresenters.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.mPresenters.remove(next);
            } else {
                z2 |= jVar.flagActionItems();
            }
        }
        if (z2) {
            this.mActionItems.clear();
            this.mNonActionItems.clear();
            int size = visibleItems.size();
            for (int i = 0; i < size; i++) {
                h hVar = visibleItems.get(i);
                if ((hVar.x & 32) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.mActionItems.add(hVar);
                } else {
                    this.mNonActionItems.add(hVar);
                }
            }
        } else {
            this.mActionItems.clear();
            this.mNonActionItems.clear();
            this.mNonActionItems.addAll(getVisibleItems());
        }
        this.mIsActionItemsStale = false;
    }

    public ArrayList<h> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public h getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.mItems.get(i);
    }

    public ArrayList<h> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public ArrayList<h> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i = 0; i < size; i++) {
            h hVar = this.mItems.get(i);
            if (hVar.isVisible()) {
                this.mVisibleItems.add(hVar);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.mItems.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (findItemWithShortcutForKey(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public void onItemActionRequestChanged(h hVar) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemVisibleChanged(h hVar) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z) {
        if (!this.mPreventDispatchingItemsChanged) {
            if (z) {
                this.mIsVisibleItemsStale = true;
                this.mIsActionItemsStale = true;
            }
            dispatchPresenterUpdate(z);
            return;
        }
        this.mItemsChangedWhileDispatchPrevented = true;
        if (z) {
            this.mStructureChangedWhileDispatchPrevented = true;
        }
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return performItemAction(findItem(i), i2);
    }

    public boolean performItemAction(MenuItem menuItem, int i) {
        return performItemAction(menuItem, null, i);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        h findItemWithShortcutForKey = findItemWithShortcutForKey(i, keyEvent);
        if (findItemWithShortcutForKey != null) {
            z = performItemAction(findItemWithShortcutForKey, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            close(true);
        }
        return z;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int findGroupIndex = findGroupIndex(i);
        if (findGroupIndex >= 0) {
            int size = this.mItems.size() - findGroupIndex;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.mItems.get(findGroupIndex).b != i) {
                    break;
                }
                removeItemAtInt(findGroupIndex, false);
                i2 = i3;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        removeItemAtInt(findItemIndex(i), true);
    }

    public void removeItemAt(int i) {
        removeItemAtInt(i, true);
    }

    public void removeMenuPresenter(j jVar) {
        Iterator<WeakReference<j>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.mPresenters.remove(next);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i2 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    public void restorePresenterStates(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCallback(a aVar) {
        this.mCallback = aVar;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public f setDefaultShowAsAction(int i) {
        this.mDefaultShowAsAction = i;
        return this;
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        boolean z;
        int i;
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.mItems.get(i2);
            if (hVar.b == groupId) {
                boolean z2 = true;
                if ((hVar.x & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && hVar.isCheckable()) {
                    if (hVar != menuItem) {
                        z2 = false;
                    }
                    int i3 = hVar.x;
                    int i4 = i3 & (-3);
                    if (z2) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    int i5 = i | i4;
                    hVar.x = i5;
                    if (i3 != i5) {
                        hVar.n.onItemsChanged(false);
                    }
                }
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.mItems.get(i2);
            if (hVar.b == i) {
                hVar.f(z2);
                hVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mGroupDividerEnabled = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.mItems.get(i2);
            if (hVar.b == i) {
                hVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int i2;
        boolean z2;
        int size = this.mItems.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            h hVar = this.mItems.get(i3);
            if (hVar.b == i) {
                int i4 = hVar.x;
                int i5 = i4 & (-9);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                int i6 = i5 | i2;
                hVar.x = i6;
                if (i4 != i6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            onItemsChanged(true);
        }
    }

    public f setHeaderIconInt(Drawable drawable) {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    public f setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    public f setHeaderViewInt(View view) {
        setHeaderInternal(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean z) {
        this.mOptionalIconsVisible = z;
    }

    public void setOverrideVisibleItems(boolean z) {
        this.mOverrideVisibleItems = z;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mQwertyMode = z;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z) {
        if (this.mShortcutsVisible == z) {
            return;
        }
        setShortcutsVisibleInner(z);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (!this.mPreventDispatchingItemsChanged) {
            this.mPreventDispatchingItemsChanged = true;
            this.mItemsChangedWhileDispatchPrevented = false;
            this.mStructureChangedWhileDispatchPrevented = false;
        }
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return addInternal(0, 0, 0, this.mResources.getString(i));
    }

    public void addMenuPresenter(j jVar, Context context) {
        this.mPresenters.add(new WeakReference<>(jVar));
        jVar.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i));
    }

    public int findGroupIndex(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.mItems.get(i2).b == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean performItemAction(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.h) r7
            r0 = 0
            if (r7 == 0) goto L9b
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto L9b
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L3a
        L19:
            androidx.appcompat.view.menu.f r1 = r7.n
            boolean r3 = r1.dispatchMenuItemSelected(r1, r7)
            if (r3 == 0) goto L22
            goto L3a
        L22:
            android.content.Intent r3 = r7.g
            if (r3 == 0) goto L30
            android.content.Context r1 = r1.getContext()     // Catch: android.content.ActivityNotFoundException -> L30
            android.content.Intent r3 = r7.g     // Catch: android.content.ActivityNotFoundException -> L30
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L30
            goto L3a
        L30:
            com.amazon.aps.iva.p3.b r1 = r7.A
            if (r1 == 0) goto L3c
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L3c
        L3a:
            r1 = r2
            goto L3d
        L3c:
            r1 = r0
        L3d:
            com.amazon.aps.iva.p3.b r3 = r7.A
            if (r3 == 0) goto L49
            boolean r4 = r3.hasSubMenu()
            if (r4 == 0) goto L49
            r4 = r2
            goto L4a
        L49:
            r4 = r0
        L4a:
            boolean r5 = r7.e()
            if (r5 == 0) goto L5b
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L9a
            r6.close(r2)
            goto L9a
        L5b:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6c
            if (r4 == 0) goto L64
            goto L6c
        L64:
            r7 = r9 & 1
            if (r7 != 0) goto L9a
            r6.close(r2)
            goto L9a
        L6c:
            r9 = r9 & 4
            if (r9 != 0) goto L73
            r6.close(r0)
        L73:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L89
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r0 = r6.getContext()
            r9.<init>(r0, r6, r7)
            r7.o = r9
            java.lang.CharSequence r0 = r7.e
            r9.setHeaderTitle(r0)
        L89:
            androidx.appcompat.view.menu.m r7 = r7.o
            if (r4 == 0) goto L90
            r3.onPrepareSubMenu(r7)
        L90:
            boolean r7 = r6.dispatchSubMenuSelected(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L9a
            r6.close(r2)
        L9a:
            return r1
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.performItemAction(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public f setHeaderIconInt(int i) {
        setHeaderInternal(0, null, i, null, null);
        return this;
    }

    public f setHeaderTitleInt(int i) {
        setHeaderInternal(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return addInternal(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        h hVar = (h) addInternal(i, i2, i3, charSequence);
        m mVar = new m(this.mContext, this, hVar);
        hVar.o = mVar;
        mVar.setHeaderTitle(hVar.e);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return addInternal(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.mResources.getString(i4));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public f getRootMenu() {
        return this;
    }
}
