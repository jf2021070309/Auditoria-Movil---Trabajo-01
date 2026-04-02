package com.vungle.warren.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.vungle.warren.model.AdAsset;
import com.vungle.warren.model.AdAssetDBAdapter;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.AdvertisementDBAdapter;
import com.vungle.warren.model.AnalyticUrl;
import com.vungle.warren.model.AnalyticUrlDBAdapter;
import com.vungle.warren.model.CacheBust;
import com.vungle.warren.model.CacheBustDBAdapter;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.CookieDBAdapter;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.PlacementDBAdapter;
import com.vungle.warren.model.Report;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.model.VisionData;
import com.vungle.warren.model.VisionDataDBAdapter;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.utility.FileUtility;
import com.vungle.warren.vision.VisionAggregationData;
import com.vungle.warren.vision.VisionAggregationInfo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* loaded from: classes2.dex */
public class Repository {
    private static final String TAG = Repository.class.getSimpleName();
    protected static final int VERSION = 9;
    private Map<Class, DBAdapter> adapters;
    private final Context appCtx;
    protected DatabaseHelper dbHelper;
    private final Designer designer;
    private final ExecutorService ioExecutor;
    private final ExecutorService uiExecutor;

    /* loaded from: classes2.dex */
    public interface LoadCallback<T> {
        void onLoaded(T t);
    }

    /* loaded from: classes2.dex */
    public interface SaveCallback {
        void onError(Exception exc);

        void onSaved();
    }

    public Repository(Context context, Designer designer, ExecutorService executorService, ExecutorService executorService2) {
        this(context, designer, executorService, executorService2, 9);
    }

    public Repository(Context context, Designer designer, ExecutorService executorService, ExecutorService executorService2, int i) {
        this.adapters = new HashMap();
        this.appCtx = context.getApplicationContext();
        this.ioExecutor = executorService;
        this.uiExecutor = executorService2;
        this.dbHelper = new DatabaseHelper(context, i, new VungleDatabaseCreator(this.appCtx));
        this.designer = designer;
        this.adapters.put(Placement.class, new PlacementDBAdapter());
        this.adapters.put(Cookie.class, new CookieDBAdapter());
        this.adapters.put(Report.class, new ReportDBAdapter());
        this.adapters.put(Advertisement.class, new AdvertisementDBAdapter());
        this.adapters.put(AdAsset.class, new AdAssetDBAdapter());
        this.adapters.put(VisionData.class, new VisionDataDBAdapter());
        this.adapters.put(AnalyticUrl.class, new AnalyticUrlDBAdapter());
        this.adapters.put(CacheBust.class, new CacheBustDBAdapter());
    }

    public void init() throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.1
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Repository.this.dbHelper.init();
                ContentValues contentValues = new ContentValues();
                contentValues.put("state", (Integer) 3);
                Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
                query.selection = "state=?";
                query.args = new String[]{String.valueOf(2)};
                Repository.this.dbHelper.update(query, contentValues);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> List<T> loadAllModels(Class<T> cls) {
        DBAdapter dBAdapter = this.adapters.get(cls);
        if (dBAdapter == null) {
            return Collections.EMPTY_LIST;
        }
        return extractModels(cls, this.dbHelper.query(new Query(dBAdapter.tableName())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> List<T> extractModels(Class<T> cls, Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            DBAdapter dBAdapter = this.adapters.get(cls);
            while (cursor.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                arrayList.add(dBAdapter.fromContentValues(contentValues));
            }
            return arrayList;
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T loadModel(String str, Class<T> cls) {
        DBAdapter dBAdapter = this.adapters.get(cls);
        Query query = new Query(dBAdapter.tableName());
        query.selection = "item_id = ? ";
        query.args = new String[]{str};
        Cursor query2 = this.dbHelper.query(query);
        if (query2 != null) {
            try {
                if (query2.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(query2, contentValues);
                    return (T) dBAdapter.fromContentValues(contentValues);
                }
                return null;
            } finally {
                query2.close();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void saveModel(T t) throws DatabaseHelper.DBException {
        DBAdapter dBAdapter = this.adapters.get(t.getClass());
        this.dbHelper.insertWithConflict(dBAdapter.tableName(), dBAdapter.toContentValues(t), 5);
    }

    public <T> FutureResult<T> load(final String str, final Class<T> cls) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<T>() { // from class: com.vungle.warren.persistence.Repository.2
            @Override // java.util.concurrent.Callable
            public T call() {
                return (T) Repository.this.loadModel(str, cls);
            }
        }));
    }

    public <T> void load(final String str, final Class<T> cls, final LoadCallback<T> loadCallback) {
        this.ioExecutor.execute(new Runnable() { // from class: com.vungle.warren.persistence.Repository.3
            @Override // java.lang.Runnable
            public void run() {
                final Object loadModel = Repository.this.loadModel(str, cls);
                Repository.this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.persistence.Repository.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        loadCallback.onLoaded(loadModel);
                    }
                });
            }
        });
    }

    public <T> void save(final T t) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.4
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Repository.this.saveModel(t);
                return null;
            }
        });
    }

    public <T> void save(final T t, final SaveCallback saveCallback, boolean z) {
        Future<?> submit = this.ioExecutor.submit(new Runnable() { // from class: com.vungle.warren.persistence.Repository.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Repository.this.saveModel(t);
                    if (saveCallback != null) {
                        Repository.this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.persistence.Repository.5.2
                            @Override // java.lang.Runnable
                            public void run() {
                                saveCallback.onSaved();
                            }
                        });
                    }
                } catch (DatabaseHelper.DBException e) {
                    if (saveCallback != null) {
                        Repository.this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.persistence.Repository.5.1
                            @Override // java.lang.Runnable
                            public void run() {
                                saveCallback.onError(e);
                            }
                        });
                    }
                }
            }
        });
        if (z) {
            try {
                submit.get();
            } catch (InterruptedException e) {
                Log.e(TAG, "InterruptedException ", e);
                Thread.currentThread().interrupt();
            } catch (ExecutionException e2) {
                Log.e(TAG, "Error on execution during saving", e2);
            }
        }
    }

    public <T> void save(T t, SaveCallback saveCallback) {
        save(t, saveCallback, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c3, code lost:
        r11.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.vungle.warren.model.Advertisement> findValidAdvertisementsForPlacementFromDB(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = com.vungle.warren.persistence.Repository.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " Searching for valid advertisement for placement with "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = "event ID "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r0, r1)
            com.vungle.warren.persistence.Query r0 = new com.vungle.warren.persistence.Query
            java.lang.String r1 = "advertisement"
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "placement_id = ? AND "
            r1.append(r2)
            java.lang.String r2 = "(state = ? OR "
            r1.append(r2)
            java.lang.String r2 = "state = ?) AND "
            r1.append(r2)
            java.lang.String r2 = "expire_time > ?"
            r1.append(r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 3
            r5 = 2
            r6 = 4
            r7 = 1
            r8 = 0
            if (r12 == 0) goto L6b
            java.lang.String r9 = " AND item_id = ?"
            r1.append(r9)
            r9 = 5
            java.lang.String[] r9 = new java.lang.String[r9]
            r9[r8] = r11
            java.lang.String r11 = java.lang.String.valueOf(r7)
            r9[r7] = r11
            java.lang.String r11 = java.lang.String.valueOf(r8)
            r9[r5] = r11
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 / r2
            java.lang.String r11 = java.lang.String.valueOf(r7)
            r9[r4] = r11
            r9[r6] = r12
            goto L86
        L6b:
            java.lang.String[] r9 = new java.lang.String[r6]
            r9[r8] = r11
            java.lang.String r11 = java.lang.String.valueOf(r7)
            r9[r7] = r11
            java.lang.String r11 = java.lang.String.valueOf(r8)
            r9[r5] = r11
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 / r2
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r9[r4] = r11
        L86:
            java.lang.String r11 = r1.toString()
            r0.selection = r11
            r0.args = r9
            java.lang.String r11 = "state DESC"
            r0.orderBy = r11
            com.vungle.warren.persistence.DatabaseHelper r11 = r10.dbHelper
            android.database.Cursor r11 = r11.query(r0)
            java.util.Map<java.lang.Class, com.vungle.warren.persistence.DBAdapter> r12 = r10.adapters
            java.lang.Class<com.vungle.warren.model.Advertisement> r0 = com.vungle.warren.model.Advertisement.class
            java.lang.Object r12 = r12.get(r0)
            com.vungle.warren.model.AdvertisementDBAdapter r12 = (com.vungle.warren.model.AdvertisementDBAdapter) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        La7:
            if (r11 == 0) goto Lc1
            if (r12 == 0) goto Lc1
            boolean r1 = r11.moveToNext()
            if (r1 == 0) goto Lc1
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            android.database.DatabaseUtils.cursorRowToContentValues(r11, r1)
            com.vungle.warren.model.Advertisement r1 = r12.fromContentValues(r1)
            r0.add(r1)
            goto La7
        Lc1:
            if (r11 == 0) goto Lc6
            r11.close()
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.persistence.Repository.findValidAdvertisementsForPlacementFromDB(java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Advertisement findValidAdvertisementForPlacementFromDB(String str, String str2) {
        String[] strArr;
        String str3 = TAG;
        Log.i(str3, " Searching for valid advertisement for placement with " + str + "event ID " + str2);
        Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
        StringBuilder sb = new StringBuilder();
        sb.append("placement_id = ? AND ");
        sb.append("(state = ? OR ");
        sb.append("state = ?) AND ");
        sb.append("expire_time > ?");
        if (str2 != null) {
            sb.append(" AND item_id = ?");
            strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000), str2};
        } else {
            strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000)};
        }
        query.selection = sb.toString();
        query.args = strArr;
        query.limit = "1";
        Cursor query2 = this.dbHelper.query(query);
        Advertisement advertisement = null;
        AdvertisementDBAdapter advertisementDBAdapter = (AdvertisementDBAdapter) this.adapters.get(Advertisement.class);
        if (query2 != null && advertisementDBAdapter != null && query2.moveToNext()) {
            ContentValues contentValues = new ContentValues();
            DatabaseUtils.cursorRowToContentValues(query2, contentValues);
            advertisement = advertisementDBAdapter.fromContentValues(contentValues);
        }
        if (query2 != null) {
            query2.close();
        }
        return advertisement;
    }

    public FutureResult<Advertisement> findValidAdvertisementForPlacement(final String str, final String str2) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<Advertisement>() { // from class: com.vungle.warren.persistence.Repository.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Advertisement call() {
                return Repository.this.findValidAdvertisementForPlacementFromDB(str, str2);
            }
        }));
    }

    public FutureResult<Advertisement> findPotentiallyExpiredAd(final String str, final String str2) {
        String str3 = TAG;
        Log.i(str3, " Searching for valid advertisement for placement with " + str + "event ID " + str2);
        return new FutureResult<>(this.ioExecutor.submit(new Callable<Advertisement>() { // from class: com.vungle.warren.persistence.Repository.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Advertisement call() {
                String[] strArr;
                Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
                StringBuilder sb = new StringBuilder();
                sb.append("placement_id = ? AND ");
                sb.append("(state = ? OR ");
                sb.append("state = ?)");
                if (str2 != null) {
                    sb.append(" AND item_id = ?");
                    strArr = new String[]{str, String.valueOf(1), String.valueOf(0), str2};
                } else {
                    strArr = new String[]{str, String.valueOf(1), String.valueOf(0)};
                }
                query.selection = sb.toString();
                query.args = strArr;
                Cursor query2 = Repository.this.dbHelper.query(query);
                AdvertisementDBAdapter advertisementDBAdapter = (AdvertisementDBAdapter) Repository.this.adapters.get(Advertisement.class);
                Advertisement advertisement = null;
                if (query2 != null && advertisementDBAdapter != null && query2.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(query2, contentValues);
                    advertisement = advertisementDBAdapter.fromContentValues(contentValues);
                }
                if (query2 != null) {
                    query2.close();
                }
                return advertisement;
            }
        }));
    }

    public FutureResult<List<Advertisement>> findValidAdvertisementsForPlacement(final String str, final String str2) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<Advertisement>>() { // from class: com.vungle.warren.persistence.Repository.8
            @Override // java.util.concurrent.Callable
            public List<Advertisement> call() {
                return Repository.this.findValidAdvertisementsForPlacementFromDB(str, str2);
            }
        }));
    }

    public <T> FutureResult<List<T>> loadAll(final Class<T> cls) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<T>>() { // from class: com.vungle.warren.persistence.Repository.9
            @Override // java.util.concurrent.Callable
            public List<T> call() {
                return Repository.this.loadAllModels(cls);
            }
        }));
    }

    public FutureResult<List<Report>> loadAllReportToSend() {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<Report>>() { // from class: com.vungle.warren.persistence.Repository.10
            @Override // java.util.concurrent.Callable
            public List<Report> call() {
                List<Report> loadAllModels = Repository.this.loadAllModels(Report.class);
                for (Report report : loadAllModels) {
                    report.setStatus(2);
                    try {
                        Repository.this.saveModel(report);
                    } catch (DatabaseHelper.DBException unused) {
                        return null;
                    }
                }
                return loadAllModels;
            }
        }));
    }

    public FutureResult<List<Report>> loadReadyOrFailedReportToSend() {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<Report>>() { // from class: com.vungle.warren.persistence.Repository.11
            @Override // java.util.concurrent.Callable
            public List<Report> call() {
                Query query = new Query(ReportDBAdapter.ReportColumns.TABLE_NAME);
                query.selection = "status = ?  OR status = ? ";
                query.args = new String[]{String.valueOf(1), String.valueOf(3)};
                List<Report> extractModels = Repository.this.extractModels(Report.class, Repository.this.dbHelper.query(query));
                for (Report report : extractModels) {
                    report.setStatus(2);
                    try {
                        Repository.this.saveModel(report);
                    } catch (DatabaseHelper.DBException unused) {
                        return null;
                    }
                }
                return extractModels;
            }
        }));
    }

    public void updateAndSaveReportState(final String str, final String str2, final int i, final int i2) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.12
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                ContentValues contentValues = new ContentValues();
                contentValues.put("status", Integer.valueOf(i2));
                Query query = new Query(ReportDBAdapter.ReportColumns.TABLE_NAME);
                query.selection = "placementId = ?  AND status = ?  AND appId = ? ";
                query.args = new String[]{str, String.valueOf(i), str2};
                Repository.this.dbHelper.update(query, contentValues);
                return null;
            }
        });
    }

    public FutureResult<List<AdAsset>> loadAllAdAssets(final String str) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<AdAsset>>() { // from class: com.vungle.warren.persistence.Repository.13
            @Override // java.util.concurrent.Callable
            public List<AdAsset> call() {
                return Repository.this.loadAllAdAssetModels(str);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<AdAsset> loadAllAdAssetModels(String str) {
        Query query = new Query(AdAssetDBAdapter.AdAssetColumns.TABLE_NAME);
        query.selection = "ad_identifier = ? ";
        query.args = new String[]{str};
        return extractModels(AdAsset.class, this.dbHelper.query(query));
    }

    public <T> void delete(final T t) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.14
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Repository.this.deleteModel(t);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void deleteModel(Class<T> cls, String str) throws DatabaseHelper.DBException {
        Query query = new Query(this.adapters.get(cls).tableName());
        query.selection = "item_id=?";
        query.args = new String[]{str};
        this.dbHelper.delete(query);
    }

    private void deleteAssetForAdId(String str) throws DatabaseHelper.DBException {
        Query query = new Query(this.adapters.get(AdAsset.class).tableName());
        query.selection = "ad_identifier=?";
        query.args = new String[]{str};
        this.dbHelper.delete(query);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void deleteModel(T t) throws DatabaseHelper.DBException {
        deleteModel(t.getClass(), this.adapters.get(t.getClass()).toContentValues(t).getAsString("item_id"));
    }

    public void deleteAdvertisement(final String str) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.15
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Repository.this.deleteAdInternal(str);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteAdInternal(String str) throws DatabaseHelper.DBException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        deleteAssetForAdId(str);
        deleteModel(Advertisement.class, str);
        try {
            this.designer.deleteAssets(str);
        } catch (IOException e) {
            Log.e(TAG, "IOException ", e);
        }
    }

    public FutureResult<Collection<Placement>> loadValidPlacements() {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<Collection<Placement>>() { // from class: com.vungle.warren.persistence.Repository.16
            @Override // java.util.concurrent.Callable
            public Collection<Placement> call() {
                List extractModels;
                synchronized (Repository.this) {
                    Query query = new Query("placement");
                    query.selection = "is_valid = ?";
                    query.args = new String[]{"1"};
                    extractModels = Repository.this.extractModels(Placement.class, Repository.this.dbHelper.query(query));
                }
                return extractModels;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> loadValidPlacementIds() {
        Query query = new Query("placement");
        query.selection = "is_valid = ?";
        query.args = new String[]{"1"};
        query.columns = new String[]{"item_id"};
        Cursor query2 = this.dbHelper.query(query);
        ArrayList arrayList = new ArrayList();
        if (query2 != null) {
            while (query2 != null) {
                try {
                    if (!query2.moveToNext()) {
                        break;
                    }
                    arrayList.add(query2.getString(query2.getColumnIndex("item_id")));
                } finally {
                    query2.close();
                }
            }
        }
        return arrayList;
    }

    public FutureResult<File> getAdvertisementAssetDirectory(final String str) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<File>() { // from class: com.vungle.warren.persistence.Repository.17
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public File call() throws Exception {
                return Repository.this.designer.getAssetDirectory(str);
            }
        }));
    }

    public FutureResult<Collection<String>> getValidPlacementIds() {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<Collection<String>>() { // from class: com.vungle.warren.persistence.Repository.18
            @Override // java.util.concurrent.Callable
            public Collection<String> call() throws Exception {
                List loadValidPlacementIds;
                synchronized (Repository.this) {
                    loadValidPlacementIds = Repository.this.loadValidPlacementIds();
                }
                return loadValidPlacementIds;
            }
        }));
    }

    public FutureResult<List<String>> getAvailableBidTokens(final int i, final int i2) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<String>>() { // from class: com.vungle.warren.persistence.Repository.19
            @Override // java.util.concurrent.Callable
            public List<String> call() throws Exception {
                ArrayList arrayList;
                synchronized (Repository.this) {
                    Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
                    query.selection = "bid_token != '' AND ( state = ? OR state = ? ) AND expire_time > ?";
                    query.columns = new String[]{AdvertisementDBAdapter.AdvertisementColumns.COLUMN_BID_TOKEN};
                    int i3 = 0;
                    query.args = new String[]{String.valueOf(0), String.valueOf(1), String.valueOf(System.currentTimeMillis() / 1000)};
                    Cursor query2 = Repository.this.dbHelper.query(query);
                    arrayList = new ArrayList();
                    if (query2 != null) {
                        while (query2.moveToNext() && i3 < i) {
                            String string = query2.getString(query2.getColumnIndex(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_BID_TOKEN));
                            if (string.getBytes().length + i3 <= i) {
                                i3 += string.getBytes().length + i2;
                                arrayList.add(string);
                            }
                        }
                        query2.close();
                    }
                }
                return arrayList;
            }
        }));
    }

    public void setValidPlacements(final List<Placement> list) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.20
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                synchronized (Repository.class) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(PlacementDBAdapter.PlacementColumns.COLUMN_IS_VALID, (Boolean) false);
                    Repository.this.dbHelper.update(new Query("placement"), contentValues);
                    for (Placement placement : list) {
                        Placement placement2 = (Placement) Repository.this.loadModel(placement.getId(), Placement.class);
                        if (placement2 != null && (placement2.isIncentivized() != placement.isIncentivized() || placement2.isHeaderBidding() != placement.isHeaderBidding())) {
                            String str = Repository.TAG;
                            Log.w(str, "Placements data for " + placement.getId() + " is different from disc, deleting old");
                            for (String str2 : Repository.this.getAdsForPlacement(placement.getId())) {
                                Repository.this.deleteAdInternal(str2);
                            }
                            Repository.this.deleteModel(Placement.class, placement2.getId());
                        }
                        if (placement2 != null) {
                            placement.setWakeupTime(placement2.getWakeupTime());
                            placement.setAdSize(placement2.getAdSize());
                        }
                        placement.setValid(placement.getPlacementAdType() != 2);
                        if (placement.getMaxHbCache() == Integer.MIN_VALUE) {
                            placement.setValid(false);
                        }
                        Repository.this.saveModel(placement);
                    }
                }
                return null;
            }
        });
    }

    public FutureResult<List<String>> findAdsForPlacement(final String str) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<String>>() { // from class: com.vungle.warren.persistence.Repository.21
            @Override // java.util.concurrent.Callable
            public List<String> call() {
                return Repository.this.getAdsForPlacement(str);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> getAdsForPlacement(String str) {
        Query query = new Query(AdvertisementDBAdapter.AdvertisementColumns.TABLE_NAME);
        query.columns = new String[]{"item_id"};
        query.selection = "placement_id=?";
        query.args = new String[]{str};
        Cursor query2 = this.dbHelper.query(query);
        ArrayList arrayList = new ArrayList();
        while (query2 != null && query2.moveToNext()) {
            arrayList.add(query2.getString(query2.getColumnIndex("item_id")));
        }
        if (query2 != null) {
            query2.close();
        }
        return arrayList;
    }

    public List<Advertisement> getAdsByCreative(Collection<String> collection) {
        HashSet hashSet = new HashSet(collection);
        HashSet hashSet2 = new HashSet();
        for (Advertisement advertisement : loadAllModels(Advertisement.class)) {
            if (hashSet.contains(advertisement.getCreativeId())) {
                hashSet2.add(advertisement);
            }
        }
        return new ArrayList(hashSet2);
    }

    public List<Advertisement> getAdsByCreative(String str) {
        return getAdsByCreative(Collections.singletonList(str));
    }

    public List<Advertisement> getAdsByCampaign(Collection<String> collection) {
        HashSet hashSet = new HashSet(collection);
        HashSet hashSet2 = new HashSet();
        for (Advertisement advertisement : loadAllModels(Advertisement.class)) {
            if (hashSet.contains(advertisement.getCampaignId())) {
                hashSet2.add(advertisement);
            }
        }
        return new ArrayList(hashSet2);
    }

    public List<Advertisement> getAdsByCampaign(String str) {
        return getAdsByCampaign(Collections.singletonList(str));
    }

    public String getPlacementIdByAd(Advertisement advertisement) {
        return advertisement.getPlacementId();
    }

    public List<CacheBust> getUnProcessedBusts() {
        List<CacheBust> loadAllModels = loadAllModels(CacheBust.class);
        ArrayList arrayList = new ArrayList();
        for (CacheBust cacheBust : loadAllModels) {
            if (cacheBust.getTimestampProcessed() == 0) {
                arrayList.add(cacheBust);
            }
        }
        return arrayList;
    }

    public void clearAllData() {
        this.dbHelper.dropDb();
        this.designer.clearCache();
    }

    public void close() {
        this.dbHelper.close();
    }

    public void saveAndApplyState(final Advertisement advertisement, final String str, final int i) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.22
            /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
                if (r0 != 5) goto L13;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Void call() throws java.lang.Exception {
                /*
                    r3 = this;
                    java.lang.String r0 = com.vungle.warren.persistence.Repository.access$1300()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Setting "
                    r1.append(r2)
                    int r2 = r2
                    r1.append(r2)
                    java.lang.String r2 = " for adv "
                    r1.append(r2)
                    com.vungle.warren.model.Advertisement r2 = r3
                    java.lang.String r2 = r2.getId()
                    r1.append(r2)
                    java.lang.String r2 = " and pl "
                    r1.append(r2)
                    java.lang.String r2 = r4
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    android.util.Log.i(r0, r1)
                    com.vungle.warren.model.Advertisement r0 = r3
                    int r1 = r2
                    r0.setState(r1)
                    int r0 = r2
                    r1 = 0
                    if (r0 == 0) goto L67
                    r2 = 1
                    if (r0 == r2) goto L67
                    r2 = 2
                    if (r0 == r2) goto L5a
                    r2 = 3
                    if (r0 == r2) goto L4e
                    r2 = 4
                    if (r0 == r2) goto L4e
                    r2 = 5
                    if (r0 == r2) goto L67
                    goto L75
                L4e:
                    com.vungle.warren.persistence.Repository r0 = com.vungle.warren.persistence.Repository.this
                    com.vungle.warren.model.Advertisement r2 = r3
                    java.lang.String r2 = r2.getId()
                    com.vungle.warren.persistence.Repository.access$1000(r0, r2)
                    goto L75
                L5a:
                    com.vungle.warren.model.Advertisement r0 = r3
                    r0.setPlacementId(r1)
                    com.vungle.warren.persistence.Repository r0 = com.vungle.warren.persistence.Repository.this
                    com.vungle.warren.model.Advertisement r2 = r3
                    com.vungle.warren.persistence.Repository.access$200(r0, r2)
                    goto L75
                L67:
                    com.vungle.warren.model.Advertisement r0 = r3
                    java.lang.String r2 = r4
                    r0.setPlacementId(r2)
                    com.vungle.warren.persistence.Repository r0 = com.vungle.warren.persistence.Repository.this
                    com.vungle.warren.model.Advertisement r2 = r3
                    com.vungle.warren.persistence.Repository.access$200(r0, r2)
                L75:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.persistence.Repository.AnonymousClass22.call():java.lang.Void");
            }
        });
    }

    public void trimVisionData(final int i) throws DatabaseHelper.DBException {
        runAndWait(new Callable<Void>() { // from class: com.vungle.warren.persistence.Repository.23
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Query query = new Query(VisionDataDBAdapter.VisionDataColumns.TABLE_NAME);
                query.selection = "_id <= ( SELECT MAX( _id ) FROM vision_data ) - ?";
                query.args = new String[]{Integer.toString(i)};
                Repository.this.dbHelper.delete(query);
                return null;
            }
        });
    }

    public FutureResult<VisionAggregationInfo> getVisionAggregationInfo(final long j) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<VisionAggregationInfo>() { // from class: com.vungle.warren.persistence.Repository.24
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public VisionAggregationInfo call() {
                Query query = new Query(VisionDataDBAdapter.VisionDataColumns.TABLE_NAME);
                query.selection = "timestamp >= ?";
                query.orderBy = "_id DESC";
                query.args = new String[]{Long.toString(j)};
                Cursor query2 = Repository.this.dbHelper.query(query);
                VisionDataDBAdapter visionDataDBAdapter = (VisionDataDBAdapter) Repository.this.adapters.get(VisionData.class);
                if (query2 == null || visionDataDBAdapter == null) {
                    return null;
                }
                try {
                    if (query2.moveToFirst()) {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(query2, contentValues);
                        return new VisionAggregationInfo(query2.getCount(), visionDataDBAdapter.fromContentValues(contentValues).creative);
                    }
                    return null;
                } finally {
                    query2.close();
                }
            }
        }));
    }

    public FutureResult<List<VisionAggregationData>> getVisionAggregationData(final long j, final int i, final String str) {
        return new FutureResult<>(this.ioExecutor.submit(new Callable<List<VisionAggregationData>>() { // from class: com.vungle.warren.persistence.Repository.25
            @Override // java.util.concurrent.Callable
            public List<VisionAggregationData> call() {
                ArrayList arrayList = new ArrayList();
                if (VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER.equals(str) || "campaign".equals(str) || VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE.equals(str)) {
                    Query query = new Query(VisionDataDBAdapter.VisionDataColumns.TABLE_NAME);
                    query.columns = new String[]{"COUNT ( * ) as viewCount", "MAX ( timestamp ) as lastTimeStamp", str};
                    query.selection = "timestamp >= ?";
                    query.groupBy = str;
                    query.orderBy = "_id DESC";
                    query.limit = Integer.toString(i);
                    query.args = new String[]{Long.toString(j)};
                    Cursor query2 = Repository.this.dbHelper.query(query);
                    if (query2 != null) {
                        while (query2.moveToNext()) {
                            try {
                                ContentValues contentValues = new ContentValues();
                                DatabaseUtils.cursorRowToContentValues(query2, contentValues);
                                arrayList.add(new VisionAggregationData(contentValues.getAsString(str), contentValues.getAsInteger("viewCount").intValue(), contentValues.getAsLong("lastTimeStamp").longValue()));
                            } finally {
                                query2.close();
                            }
                        }
                    }
                    return arrayList;
                }
                return arrayList;
            }
        }));
    }

    /* loaded from: classes2.dex */
    private static class VungleDatabaseCreator implements DatabaseHelper.DatabaseFactory {
        private final Context context;

        public VungleDatabaseCreator(Context context) {
            this.context = context;
        }

        @Override // com.vungle.warren.persistence.DatabaseHelper.DatabaseFactory
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i < 2) {
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN status INTEGER DEFAULT 1");
            }
            if (i < 3) {
                sQLiteDatabase.execSQL(VisionDataDBAdapter.CREATE_VISION_TABLE_QUERY);
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN ad_size TEXT ");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN tt_download NUMERIC DEFAULT -1");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN ad_size TEXT ");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN refresh_duration NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN supported_template_types NUMERIC DEFAULT 0");
            }
            if (i < 4) {
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN header_bidding SHORT ");
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN header_bidding SHORT ");
            }
            if (i < 5) {
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN autocache_priority NUMERIC DEFAULT 2147483647");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN asset_download_timestamp NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN asset_download_duration NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN ad_request_start_time NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN init_timestamp NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN asset_download_duration NUMERIC DEFAULT 0");
            }
            if (i < 6) {
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_enable_om_sdk NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_om_sdk_extra_vast TEXT ");
            }
            if (i < 7) {
                sQLiteDatabase.execSQL(AnalyticUrlDBAdapter.CREATE_ANALYTICS_URL_TABLE_QUERY);
            }
            if (i < 8) {
                sQLiteDatabase.execSQL(CacheBustDBAdapter.CREATE_CACHE_BUST_TABLE_QUERY);
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_request_timestamp NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN max_hb_cache NUMERIC DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN recommended_ad_size TEXT ");
            }
            if (i < 9) {
                sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN play_remote_url SHORT DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_assets_fully_downloaded SHORT DEFAULT 0");
            }
        }

        @Override // com.vungle.warren.persistence.DatabaseHelper.DatabaseFactory
        public void create(SQLiteDatabase sQLiteDatabase) {
            dropOldFilesData();
            sQLiteDatabase.execSQL(AdvertisementDBAdapter.CREATE_ADVERTISEMENT_TABLE_QUERY);
            sQLiteDatabase.execSQL(PlacementDBAdapter.CREATE_PLACEMENT_TABLE_QUERY);
            sQLiteDatabase.execSQL(CookieDBAdapter.CREATE_COOKIE_TABLE_QUERY);
            sQLiteDatabase.execSQL(ReportDBAdapter.CREATE_REPORT_TABLE_QUERY);
            sQLiteDatabase.execSQL(AdAssetDBAdapter.CREATE_ASSET_TABLE_QUERY);
            sQLiteDatabase.execSQL(VisionDataDBAdapter.CREATE_VISION_TABLE_QUERY);
            sQLiteDatabase.execSQL(AnalyticUrlDBAdapter.CREATE_ANALYTICS_URL_TABLE_QUERY);
            sQLiteDatabase.execSQL(CacheBustDBAdapter.CREATE_CACHE_BUST_TABLE_QUERY);
        }

        @Override // com.vungle.warren.persistence.DatabaseHelper.DatabaseFactory
        public void deleteData(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS advertisement");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cookie");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS placement");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS report");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS adAsset");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS vision_data");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS analytic_url");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cache_bust");
        }

        @Override // com.vungle.warren.persistence.DatabaseHelper.DatabaseFactory
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM sqlite_master WHERE type='table'", null);
            while (rawQuery != null && rawQuery.moveToNext()) {
                String string = rawQuery.getString(1);
                if (!string.equals("android_metadata") && !string.startsWith("sqlite_")) {
                    arrayList.add(string);
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) it.next()));
            }
            create(sQLiteDatabase);
        }

        private void deleteDatabase(String str) {
            this.context.deleteDatabase(str);
        }

        private void dropOldFilesData() {
            deleteDatabase("vungle");
            File externalFilesDir = this.context.getExternalFilesDir(null);
            if ((Environment.getExternalStorageState().equals("mounted") && externalFilesDir != null) && externalFilesDir.exists()) {
                try {
                    FileUtility.delete(new File(externalFilesDir, ".vungle"));
                } catch (IOException e) {
                    Log.e(Repository.TAG, "IOException ", e);
                }
            }
            File filesDir = this.context.getFilesDir();
            if (filesDir.exists()) {
                try {
                    FileUtility.delete(new File(filesDir, "vungle"));
                } catch (IOException e2) {
                    Log.e(Repository.TAG, "IOException ", e2);
                }
            }
            try {
                FileUtility.delete(new File(this.context.getCacheDir() + File.separator + "downloads_vungle"));
            } catch (IOException e3) {
                Log.e(Repository.TAG, "IOException ", e3);
            }
        }
    }

    private void runAndWait(Callable<Void> callable) throws DatabaseHelper.DBException {
        try {
            this.ioExecutor.submit(callable).get();
        } catch (InterruptedException e) {
            Log.e(TAG, "InterruptedException ", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof DatabaseHelper.DBException) {
                throw ((DatabaseHelper.DBException) e2.getCause());
            }
            Log.e(TAG, "Exception during runAndWait", e2);
        }
    }

    public void setMockDBHelper(DatabaseHelper databaseHelper) {
        this.dbHelper = databaseHelper;
    }
}
