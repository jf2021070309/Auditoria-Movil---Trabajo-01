package kotlin.time;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
/* compiled from: Duration.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087@\u0018\u0000 ¥\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002¥\u0001B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010OJ\u001b\u0010P\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u001e\u0010T\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010WJ\u001e\u0010T\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\tH\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010XJ\u001b\u0010T\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ\u001a\u0010[\u001a\u00020\\2\b\u0010Q\u001a\u0004\u0018\u00010]HÖ\u0003¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\tHÖ\u0001¢\u0006\u0004\ba\u0010\rJ\r\u0010b\u001a\u00020\\¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\\H\u0002¢\u0006\u0004\bf\u0010dJ\u000f\u0010g\u001a\u00020\\H\u0002¢\u0006\u0004\bh\u0010dJ\r\u0010i\u001a\u00020\\¢\u0006\u0004\bj\u0010dJ\r\u0010k\u001a\u00020\\¢\u0006\u0004\bl\u0010dJ\r\u0010m\u001a\u00020\\¢\u0006\u0004\bn\u0010dJ\u001b\u0010o\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bp\u0010qJ\u001b\u0010r\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bs\u0010qJ\u0017\u0010t\u001a\u00020\t2\u0006\u0010I\u001a\u00020\u000fH\u0002¢\u0006\u0004\bu\u0010vJ\u001e\u0010w\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bx\u0010WJ\u001e\u0010w\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\tH\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bx\u0010XJ£\u0001\u0010y\u001a\u0002Hz\"\u0004\b\u0000\u0010z2y\u0010{\u001au\u0012\u0013\u0012\u00110\t¢\u0006\f\b}\u0012\b\b~\u0012\u0004\b\b(\u007f\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0080\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0081\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0082\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u0002Hz0|H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u008f\u0001\u0010y\u001a\u0002Hz\"\u0004\b\u0000\u0010z2e\u0010{\u001aa\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0080\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0081\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0082\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u0002Hz0\u0086\u0001H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0087\u0001Jy\u0010y\u001a\u0002Hz\"\u0004\b\u0000\u0010z2O\u0010{\u001aK\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0081\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0082\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u0002Hz0\u0088\u0001H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0089\u0001Jc\u0010y\u001a\u0002Hz\"\u0004\b\u0000\u0010z29\u0010{\u001a5\u0012\u0014\u0012\u00120\u0003¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0082\u0001\u0012\u0014\u0012\u00120\t¢\u0006\r\b}\u0012\t\b~\u0012\u0005\b\b(\u0083\u0001\u0012\u0004\u0012\u0002Hz0\u008a\u0001H\u0086\bø\u0001\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0006\b\u0084\u0001\u0010\u008b\u0001J\u001e\u0010\u008c\u0001\u001a\u00020\u000f2\f\u0010\u008d\u0001\u001a\u00070Dj\u0003`\u008e\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001e\u0010\u0091\u0001\u001a\u00020\t2\f\u0010\u008d\u0001\u001a\u00070Dj\u0003`\u008e\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0011\u0010\u0094\u0001\u001a\u00030\u0095\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001e\u0010\u0098\u0001\u001a\u00020\u00032\f\u0010\u008d\u0001\u001a\u00070Dj\u0003`\u008e\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0011\u0010\u009b\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u009c\u0001\u0010\u0005J\u0011\u0010\u009d\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u009e\u0001\u0010\u0005J\u0013\u0010\u009f\u0001\u001a\u00030\u0095\u0001H\u0016¢\u0006\u0006\b \u0001\u0010\u0097\u0001J*\u0010\u009f\u0001\u001a\u00030\u0095\u00012\f\u0010\u008d\u0001\u001a\u00070Dj\u0003`\u008e\u00012\t\b\u0002\u0010¡\u0001\u001a\u00020\t¢\u0006\u0006\b \u0001\u0010¢\u0001J\u0018\u0010£\u0001\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b¤\u0001\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\u0005R\u001a\u0010(\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\u000b\u001a\u0004\b*\u0010\u0005R\u001a\u0010+\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\u0005R\u001a\u0010.\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u000b\u001a\u0004\b0\u0010\u0005R\u001a\u00101\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010\u000b\u001a\u0004\b3\u0010\u0005R\u001a\u00104\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010\u000b\u001a\u0004\b6\u0010\u0005R\u001a\u00107\u001a\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010\u000b\u001a\u0004\b9\u0010\u0005R\u001a\u0010:\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b;\u0010\u000b\u001a\u0004\b<\u0010\rR\u001a\u0010=\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b>\u0010\u000b\u001a\u0004\b?\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010@\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bA\u0010\u000b\u001a\u0004\bB\u0010\rR\u0014\u0010C\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0015\u0010G\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\rR\u0014\u0010I\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006¦\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", "", "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays$annotations", "getInWholeDays-impl", "inWholeHours", "getInWholeHours$annotations", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds$annotations", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds$annotations", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes$annotations", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds$annotations", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds$annotations", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Ljava/util/concurrent/TimeUnit;", "getStorageUnit-impl", "(J)Ljava/util/concurrent/TimeUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", "value", "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", "other", "compareTo-LRDsOJo", "(JJ)I", "div", "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "precision", "precision-impl", "(JD)I", "times", "times-UwyO8pc", "toComponents", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "Lkotlin/time/DurationUnit;", "toDouble-impl", "(JLjava/util/concurrent/TimeUnit;)D", "toInt", "toInt-impl", "(JLjava/util/concurrent/TimeUnit;)I", "toIsoString", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLjava/util/concurrent/TimeUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLjava/util/concurrent/TimeUnit;I)Ljava/lang/String;", "unaryMinus", "unaryMinus-UwyO8pc", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
@JvmInline
/* loaded from: classes.dex */
public final class Duration implements Comparable<Duration> {
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m1309constructorimpl(0);
    private static final long INFINITE = DurationKt.access$durationOfMillis(DurationKt.MAX_MILLIS);
    private static final long NEG_INFINITE = DurationKt.access$durationOfMillis(-4611686018427387903L);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Duration m1307boximpl(long j) {
        return new Duration(j);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1313equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m1364unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1314equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    @Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    public static /* synthetic */ void getInDays$annotations() {
    }

    @Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    public static /* synthetic */ void getInHours$annotations() {
    }

    @Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    public static /* synthetic */ void getInMinutes$annotations() {
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    public static /* synthetic */ void getInSeconds$annotations() {
    }

    public static /* synthetic */ void getInWholeDays$annotations() {
    }

    public static /* synthetic */ void getInWholeHours$annotations() {
    }

    public static /* synthetic */ void getInWholeMicroseconds$annotations() {
    }

    public static /* synthetic */ void getInWholeMilliseconds$annotations() {
    }

    public static /* synthetic */ void getInWholeMinutes$annotations() {
    }

    public static /* synthetic */ void getInWholeNanoseconds$annotations() {
    }

    public static /* synthetic */ void getInWholeSeconds$annotations() {
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getUnitDiscriminator-impl  reason: not valid java name */
    private static final int m1335getUnitDiscriminatorimpl(long j) {
        return ((int) j) & 1;
    }

    /* renamed from: getValue-impl  reason: not valid java name */
    private static final long m1336getValueimpl(long j) {
        return j >> 1;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1337hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: isInMillis-impl  reason: not valid java name */
    private static final boolean m1339isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    /* renamed from: isInNanos-impl  reason: not valid java name */
    private static final boolean m1340isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    /* renamed from: isNegative-impl  reason: not valid java name */
    public static final boolean m1342isNegativeimpl(long j) {
        return j < 0;
    }

    /* renamed from: isPositive-impl  reason: not valid java name */
    public static final boolean m1343isPositiveimpl(long j) {
        return j > 0;
    }

    /* renamed from: precision-impl  reason: not valid java name */
    private static final int m1346precisionimpl(long j, double d) {
        if (d < 1) {
            return 3;
        }
        if (d < 10) {
            return 2;
        }
        return d < ((double) 100) ? 1 : 0;
    }

    /* renamed from: compareTo-LRDsOJo  reason: not valid java name */
    public int m1363compareToLRDsOJo(long j) {
        return m1308compareToLRDsOJo(this.rawValue, j);
    }

    public boolean equals(Object obj) {
        return m1313equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m1337hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m1359toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m1364unboximpl() {
        return this.rawValue;
    }

    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m1363compareToLRDsOJo(duration.m1364unboximpl());
    }

    /* renamed from: getStorageUnit-impl  reason: not valid java name */
    private static final TimeUnit m1334getStorageUnitimpl(long j) {
        return m1340isInNanosimpl(j) ? TimeUnit.NANOSECONDS : TimeUnit.MILLISECONDS;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m1309constructorimpl(long j) {
        if (m1340isInNanosimpl(j)) {
            long m1336getValueimpl = m1336getValueimpl(j);
            if (-4611686018426999999L > m1336getValueimpl || DurationKt.MAX_NANOS < m1336getValueimpl) {
                throw new AssertionError(m1336getValueimpl(j) + " ns is out of nanoseconds range");
            }
        } else {
            long m1336getValueimpl2 = m1336getValueimpl(j);
            if (-4611686018427387903L > m1336getValueimpl2 || DurationKt.MAX_MILLIS < m1336getValueimpl2) {
                throw new AssertionError(m1336getValueimpl(j) + " ms is out of milliseconds range");
            }
            long m1336getValueimpl3 = m1336getValueimpl(j);
            if (-4611686018426L <= m1336getValueimpl3 && 4611686018426L >= m1336getValueimpl3) {
                throw new AssertionError(m1336getValueimpl(j) + " ms is denormalized");
            }
        }
        return j;
    }

    /* compiled from: Duration.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011J\u001d\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0017J\u001d\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u001d\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0015J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u001d\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0015J\u001d\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0017J\u001d\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0019J\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0015J\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0017J\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0019J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0015J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0017J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0019R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006&"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "convert", "", "value", "sourceUnit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "targetUnit", "days", "days-UwyO8pc", "(D)J", "", "(I)J", "", "(J)J", "hours", "hours-UwyO8pc", "microseconds", "microseconds-UwyO8pc", "milliseconds", "milliseconds-UwyO8pc", "minutes", "minutes-UwyO8pc", "nanoseconds", "nanoseconds-UwyO8pc", "seconds", "seconds-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZERO-UwyO8pc  reason: not valid java name */
        public final long m1370getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* renamed from: getINFINITE-UwyO8pc  reason: not valid java name */
        public final long m1368getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib  reason: not valid java name */
        public final long m1369getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        public final double convert(double d, TimeUnit sourceUnit, TimeUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt.convertDurationUnit(d, sourceUnit, targetUnit);
        }

        /* renamed from: nanoseconds-UwyO8pc  reason: not valid java name */
        public final long m1384nanosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, TimeUnit.NANOSECONDS);
        }

        /* renamed from: nanoseconds-UwyO8pc  reason: not valid java name */
        public final long m1385nanosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, TimeUnit.NANOSECONDS);
        }

        /* renamed from: nanoseconds-UwyO8pc  reason: not valid java name */
        public final long m1383nanosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, TimeUnit.NANOSECONDS);
        }

        /* renamed from: microseconds-UwyO8pc  reason: not valid java name */
        public final long m1375microsecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, TimeUnit.MICROSECONDS);
        }

        /* renamed from: microseconds-UwyO8pc  reason: not valid java name */
        public final long m1376microsecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, TimeUnit.MICROSECONDS);
        }

        /* renamed from: microseconds-UwyO8pc  reason: not valid java name */
        public final long m1374microsecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, TimeUnit.MICROSECONDS);
        }

        /* renamed from: milliseconds-UwyO8pc  reason: not valid java name */
        public final long m1378millisecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, TimeUnit.MILLISECONDS);
        }

        /* renamed from: milliseconds-UwyO8pc  reason: not valid java name */
        public final long m1379millisecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, TimeUnit.MILLISECONDS);
        }

        /* renamed from: milliseconds-UwyO8pc  reason: not valid java name */
        public final long m1377millisecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, TimeUnit.MILLISECONDS);
        }

        /* renamed from: seconds-UwyO8pc  reason: not valid java name */
        public final long m1387secondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, TimeUnit.SECONDS);
        }

        /* renamed from: seconds-UwyO8pc  reason: not valid java name */
        public final long m1388secondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, TimeUnit.SECONDS);
        }

        /* renamed from: seconds-UwyO8pc  reason: not valid java name */
        public final long m1386secondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, TimeUnit.SECONDS);
        }

        /* renamed from: minutes-UwyO8pc  reason: not valid java name */
        public final long m1381minutesUwyO8pc(int i) {
            return DurationKt.toDuration(i, TimeUnit.MINUTES);
        }

        /* renamed from: minutes-UwyO8pc  reason: not valid java name */
        public final long m1382minutesUwyO8pc(long j) {
            return DurationKt.toDuration(j, TimeUnit.MINUTES);
        }

        /* renamed from: minutes-UwyO8pc  reason: not valid java name */
        public final long m1380minutesUwyO8pc(double d) {
            return DurationKt.toDuration(d, TimeUnit.MINUTES);
        }

        /* renamed from: hours-UwyO8pc  reason: not valid java name */
        public final long m1372hoursUwyO8pc(int i) {
            return DurationKt.toDuration(i, TimeUnit.HOURS);
        }

        /* renamed from: hours-UwyO8pc  reason: not valid java name */
        public final long m1373hoursUwyO8pc(long j) {
            return DurationKt.toDuration(j, TimeUnit.HOURS);
        }

        /* renamed from: hours-UwyO8pc  reason: not valid java name */
        public final long m1371hoursUwyO8pc(double d) {
            return DurationKt.toDuration(d, TimeUnit.HOURS);
        }

        /* renamed from: days-UwyO8pc  reason: not valid java name */
        public final long m1366daysUwyO8pc(int i) {
            return DurationKt.toDuration(i, TimeUnit.DAYS);
        }

        /* renamed from: days-UwyO8pc  reason: not valid java name */
        public final long m1367daysUwyO8pc(long j) {
            return DurationKt.toDuration(j, TimeUnit.DAYS);
        }

        /* renamed from: days-UwyO8pc  reason: not valid java name */
        public final long m1365daysUwyO8pc(double d) {
            return DurationKt.toDuration(d, TimeUnit.DAYS);
        }
    }

    /* renamed from: unaryMinus-UwyO8pc  reason: not valid java name */
    public static final long m1362unaryMinusUwyO8pc(long j) {
        return DurationKt.access$durationOf(-m1336getValueimpl(j), ((int) j) & 1);
    }

    /* renamed from: plus-LRDsOJo  reason: not valid java name */
    public static final long m1345plusLRDsOJo(long j, long j2) {
        if (m1341isInfiniteimpl(j)) {
            if (m1338isFiniteimpl(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (m1341isInfiniteimpl(j2)) {
            return j2;
        } else {
            if ((((int) j) & 1) == (((int) j2) & 1)) {
                long m1336getValueimpl = m1336getValueimpl(j) + m1336getValueimpl(j2);
                if (m1340isInNanosimpl(j)) {
                    return DurationKt.access$durationOfNanosNormalized(m1336getValueimpl);
                }
                return DurationKt.access$durationOfMillisNormalized(m1336getValueimpl);
            } else if (m1339isInMillisimpl(j)) {
                return m1306addValuesMixedRangesUwyO8pc(j, m1336getValueimpl(j), m1336getValueimpl(j2));
            } else {
                return m1306addValuesMixedRangesUwyO8pc(j, m1336getValueimpl(j2), m1336getValueimpl(j));
            }
        }
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc  reason: not valid java name */
    private static final long m1306addValuesMixedRangesUwyO8pc(long j, long j2, long j3) {
        long access$nanosToMillis = DurationKt.access$nanosToMillis(j3);
        long j4 = j2 + access$nanosToMillis;
        if (-4611686018426L <= j4 && 4611686018426L >= j4) {
            return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(j4) + (j3 - DurationKt.access$millisToNanos(access$nanosToMillis)));
        }
        return DurationKt.access$durationOfMillis(RangesKt.coerceIn(j4, -4611686018427387903L, (long) DurationKt.MAX_MILLIS));
    }

    /* renamed from: minus-LRDsOJo  reason: not valid java name */
    public static final long m1344minusLRDsOJo(long j, long j2) {
        return m1345plusLRDsOJo(j, m1362unaryMinusUwyO8pc(j2));
    }

    /* renamed from: times-UwyO8pc  reason: not valid java name */
    public static final long m1348timesUwyO8pc(long j, int i) {
        if (m1341isInfiniteimpl(j)) {
            if (i != 0) {
                return i > 0 ? j : m1362unaryMinusUwyO8pc(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        } else if (i == 0) {
            return ZERO;
        } else {
            long m1336getValueimpl = m1336getValueimpl(j);
            long j2 = i;
            long j3 = m1336getValueimpl * j2;
            if (!m1340isInNanosimpl(j)) {
                if (j3 / j2 == m1336getValueimpl) {
                    return DurationKt.access$durationOfMillis(RangesKt.coerceIn(j3, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
                }
                return MathKt.getSign(m1336getValueimpl) * MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
            } else if (-2147483647L <= m1336getValueimpl && 2147483647L >= m1336getValueimpl) {
                return DurationKt.access$durationOfNanos(j3);
            } else {
                if (j3 / j2 == m1336getValueimpl) {
                    return DurationKt.access$durationOfNanosNormalized(j3);
                }
                long access$nanosToMillis = DurationKt.access$nanosToMillis(m1336getValueimpl);
                long j4 = access$nanosToMillis * j2;
                long access$nanosToMillis2 = DurationKt.access$nanosToMillis((m1336getValueimpl - DurationKt.access$millisToNanos(access$nanosToMillis)) * j2) + j4;
                if (j4 / j2 != access$nanosToMillis || (access$nanosToMillis2 ^ j4) < 0) {
                    return MathKt.getSign(m1336getValueimpl) * MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
                }
                return DurationKt.access$durationOfMillis(RangesKt.coerceIn(access$nanosToMillis2, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
            }
        }
    }

    /* renamed from: times-UwyO8pc  reason: not valid java name */
    public static final long m1347timesUwyO8pc(long j, double d) {
        int roundToInt = MathKt.roundToInt(d);
        if (roundToInt == d) {
            return m1348timesUwyO8pc(j, roundToInt);
        }
        TimeUnit m1334getStorageUnitimpl = m1334getStorageUnitimpl(j);
        return DurationKt.toDuration(m1353toDoubleimpl(j, m1334getStorageUnitimpl) * d, m1334getStorageUnitimpl);
    }

    /* renamed from: div-UwyO8pc  reason: not valid java name */
    public static final long m1312divUwyO8pc(long j, int i) {
        if (i == 0) {
            if (m1343isPositiveimpl(j)) {
                return INFINITE;
            }
            if (m1342isNegativeimpl(j)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        } else if (m1340isInNanosimpl(j)) {
            return DurationKt.access$durationOfNanos(m1336getValueimpl(j) / i);
        } else {
            if (m1341isInfiniteimpl(j)) {
                return m1348timesUwyO8pc(j, MathKt.getSign(i));
            }
            long j2 = i;
            long m1336getValueimpl = m1336getValueimpl(j) / j2;
            if (-4611686018426L <= m1336getValueimpl && 4611686018426L >= m1336getValueimpl) {
                return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(m1336getValueimpl) + (DurationKt.access$millisToNanos(m1336getValueimpl(j) - (m1336getValueimpl * j2)) / j2));
            }
            return DurationKt.access$durationOfMillis(m1336getValueimpl);
        }
    }

    /* renamed from: div-UwyO8pc  reason: not valid java name */
    public static final long m1311divUwyO8pc(long j, double d) {
        int roundToInt = MathKt.roundToInt(d);
        if (roundToInt == d && roundToInt != 0) {
            return m1312divUwyO8pc(j, roundToInt);
        }
        TimeUnit m1334getStorageUnitimpl = m1334getStorageUnitimpl(j);
        return DurationKt.toDuration(m1353toDoubleimpl(j, m1334getStorageUnitimpl) / d, m1334getStorageUnitimpl);
    }

    /* renamed from: div-LRDsOJo  reason: not valid java name */
    public static final double m1310divLRDsOJo(long j, long j2) {
        TimeUnit timeUnit = (TimeUnit) ComparisonsKt.maxOf(m1334getStorageUnitimpl(j), m1334getStorageUnitimpl(j2));
        return m1353toDoubleimpl(j, timeUnit) / m1353toDoubleimpl(j2, timeUnit);
    }

    /* renamed from: isInfinite-impl  reason: not valid java name */
    public static final boolean m1341isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* renamed from: isFinite-impl  reason: not valid java name */
    public static final boolean m1338isFiniteimpl(long j) {
        return !m1341isInfiniteimpl(j);
    }

    /* renamed from: getAbsoluteValue-UwyO8pc  reason: not valid java name */
    public static final long m1315getAbsoluteValueUwyO8pc(long j) {
        return m1342isNegativeimpl(j) ? m1362unaryMinusUwyO8pc(j) : j;
    }

    /* renamed from: compareTo-LRDsOJo  reason: not valid java name */
    public static int m1308compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return (j > j2 ? 1 : (j == j2 ? 0 : -1));
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m1342isNegativeimpl(j) ? -i : i;
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m1352toComponentsimpl(long j, Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Integer.valueOf(m1354toIntimpl(j, TimeUnit.DAYS)), Integer.valueOf(m1316getHoursComponentimpl(j)), Integer.valueOf(m1331getMinutesComponentimpl(j)), Integer.valueOf(m1333getSecondsComponentimpl(j)), Integer.valueOf(m1332getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m1351toComponentsimpl(long j, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Integer.valueOf(m1354toIntimpl(j, TimeUnit.HOURS)), Integer.valueOf(m1331getMinutesComponentimpl(j)), Integer.valueOf(m1333getSecondsComponentimpl(j)), Integer.valueOf(m1332getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m1350toComponentsimpl(long j, Function3<? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Integer.valueOf(m1354toIntimpl(j, TimeUnit.MINUTES)), Integer.valueOf(m1333getSecondsComponentimpl(j)), Integer.valueOf(m1332getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl  reason: not valid java name */
    public static final <T> T m1349toComponentsimpl(long j, Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1330getInWholeSecondsimpl(j)), Integer.valueOf(m1332getNanosecondsComponentimpl(j)));
    }

    /* renamed from: getHoursComponent-impl  reason: not valid java name */
    public static final int m1316getHoursComponentimpl(long j) {
        if (m1341isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m1325getInWholeHoursimpl(j) % 24);
    }

    /* renamed from: getMinutesComponent-impl  reason: not valid java name */
    public static final int m1331getMinutesComponentimpl(long j) {
        if (m1341isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m1328getInWholeMinutesimpl(j) % 60);
    }

    /* renamed from: getSecondsComponent-impl  reason: not valid java name */
    public static final int m1333getSecondsComponentimpl(long j) {
        if (m1341isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m1330getInWholeSecondsimpl(j) % 60);
    }

    /* renamed from: getNanosecondsComponent-impl  reason: not valid java name */
    public static final int m1332getNanosecondsComponentimpl(long j) {
        if (m1341isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m1339isInMillisimpl(j) ? DurationKt.access$millisToNanos(m1336getValueimpl(j) % 1000) : m1336getValueimpl(j) % 1000000000);
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    public static final double m1353toDoubleimpl(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt.convertDurationUnit(m1336getValueimpl(j), m1334getStorageUnitimpl(j), unit);
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    public static final long m1356toLongimpl(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt.convertDurationUnit(m1336getValueimpl(j), m1334getStorageUnitimpl(j), unit);
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    public static final int m1354toIntimpl(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m1356toLongimpl(j, unit), Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: getInDays-impl  reason: not valid java name */
    public static final double m1317getInDaysimpl(long j) {
        return m1353toDoubleimpl(j, TimeUnit.DAYS);
    }

    /* renamed from: getInHours-impl  reason: not valid java name */
    public static final double m1318getInHoursimpl(long j) {
        return m1353toDoubleimpl(j, TimeUnit.HOURS);
    }

    /* renamed from: getInMinutes-impl  reason: not valid java name */
    public static final double m1321getInMinutesimpl(long j) {
        return m1353toDoubleimpl(j, TimeUnit.MINUTES);
    }

    /* renamed from: getInSeconds-impl  reason: not valid java name */
    public static final double m1323getInSecondsimpl(long j) {
        return m1353toDoubleimpl(j, TimeUnit.SECONDS);
    }

    /* renamed from: getInMilliseconds-impl  reason: not valid java name */
    public static final double m1320getInMillisecondsimpl(long j) {
        return m1353toDoubleimpl(j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: getInMicroseconds-impl  reason: not valid java name */
    public static final double m1319getInMicrosecondsimpl(long j) {
        return m1353toDoubleimpl(j, TimeUnit.MICROSECONDS);
    }

    /* renamed from: getInNanoseconds-impl  reason: not valid java name */
    public static final double m1322getInNanosecondsimpl(long j) {
        return m1353toDoubleimpl(j, TimeUnit.NANOSECONDS);
    }

    /* renamed from: getInWholeDays-impl  reason: not valid java name */
    public static final long m1324getInWholeDaysimpl(long j) {
        return m1356toLongimpl(j, TimeUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl  reason: not valid java name */
    public static final long m1325getInWholeHoursimpl(long j) {
        return m1356toLongimpl(j, TimeUnit.HOURS);
    }

    /* renamed from: getInWholeMinutes-impl  reason: not valid java name */
    public static final long m1328getInWholeMinutesimpl(long j) {
        return m1356toLongimpl(j, TimeUnit.MINUTES);
    }

    /* renamed from: getInWholeSeconds-impl  reason: not valid java name */
    public static final long m1330getInWholeSecondsimpl(long j) {
        return m1356toLongimpl(j, TimeUnit.SECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl  reason: not valid java name */
    public static final long m1327getInWholeMillisecondsimpl(long j) {
        return (m1339isInMillisimpl(j) && m1338isFiniteimpl(j)) ? m1336getValueimpl(j) : m1356toLongimpl(j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMicroseconds-impl  reason: not valid java name */
    public static final long m1326getInWholeMicrosecondsimpl(long j) {
        return m1356toLongimpl(j, TimeUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeNanoseconds-impl  reason: not valid java name */
    public static final long m1329getInWholeNanosecondsimpl(long j) {
        long m1336getValueimpl = m1336getValueimpl(j);
        if (m1340isInNanosimpl(j)) {
            return m1336getValueimpl;
        }
        if (m1336getValueimpl > 9223372036854L) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (m1336getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.access$millisToNanos(m1336getValueimpl);
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeNanoseconds", imports = {}))
    /* renamed from: toLongNanoseconds-impl  reason: not valid java name */
    public static final long m1358toLongNanosecondsimpl(long j) {
        return m1329getInWholeNanosecondsimpl(j);
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead.", replaceWith = @ReplaceWith(expression = "this.inWholeMilliseconds", imports = {}))
    /* renamed from: toLongMilliseconds-impl  reason: not valid java name */
    public static final long m1357toLongMillisecondsimpl(long j) {
        return m1327getInWholeMillisecondsimpl(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* renamed from: toString-impl  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m1359toStringimpl(long r8) {
        /*
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto La
            java.lang.String r8 = "0s"
            goto Lcb
        La:
            long r0 = kotlin.time.Duration.INFINITE
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L14
            java.lang.String r8 = "Infinity"
            goto Lcb
        L14:
            long r0 = kotlin.time.Duration.NEG_INFINITE
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L1e
            java.lang.String r8 = "-Infinity"
            goto Lcb
        L1e:
            long r0 = m1315getAbsoluteValueUwyO8pc(r8)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            double r0 = m1353toDoubleimpl(r0, r2)
            r2 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L39
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
        L35:
            r1 = r3
            r3 = r4
            goto L9a
        L39:
            double r5 = (double) r4
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L42
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            r1 = 7
            goto L9a
        L42:
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L4f
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
        L4d:
            r1 = r3
            goto L9a
        L4f:
            r5 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L5b
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            goto L4d
        L5b:
            r5 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L67
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            goto L4d
        L67:
            r5 = 4786511204640096256(0x426d1a94a2000000, double:1.0E12)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L73
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            goto L4d
        L73:
            r5 = 4813020802404319232(0x42cb48eb57e00000, double:6.0E13)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L7f
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            goto L4d
        L7f:
            r5 = 4839562400168542208(0x4329945ca2620000, double:3.6E15)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L8b
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            goto L4d
        L8b:
            r5 = 4920018990336211136(0x44476b344f2a78c0, double:8.64E20)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L97
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            goto L4d
        L97:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            goto L35
        L9a:
            double r4 = m1353toDoubleimpl(r8, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r3 == 0) goto Laa
            java.lang.String r8 = kotlin.time.FormatToDecimalsKt.formatScientific(r4)
            goto Lbd
        Laa:
            if (r1 <= 0) goto Lb1
            java.lang.String r8 = kotlin.time.FormatToDecimalsKt.formatUpToDecimals(r4, r1)
            goto Lbd
        Lb1:
            double r6 = java.lang.Math.abs(r4)
            int r8 = m1346precisionimpl(r8, r6)
            java.lang.String r8 = kotlin.time.FormatToDecimalsKt.formatToExactDecimals(r4, r8)
        Lbd:
            r2.append(r8)
            java.lang.String r8 = kotlin.time.DurationUnitKt.shortName(r0)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
        Lcb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.Duration.m1359toStringimpl(long):java.lang.String");
    }

    /* renamed from: toString-impl$default  reason: not valid java name */
    public static /* synthetic */ String m1361toStringimpl$default(long j, TimeUnit timeUnit, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m1360toStringimpl(j, timeUnit, i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static final String m1360toStringimpl(long j, TimeUnit unit, int i) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + i).toString());
        }
        double m1353toDoubleimpl = m1353toDoubleimpl(j, unit);
        if (Double.isInfinite(m1353toDoubleimpl)) {
            return String.valueOf(m1353toDoubleimpl);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Math.abs(m1353toDoubleimpl) < 1.0E14d ? FormatToDecimalsKt.formatToExactDecimals(m1353toDoubleimpl, RangesKt.coerceAtMost(i, 12)) : FormatToDecimalsKt.formatScientific(m1353toDoubleimpl));
        sb.append(DurationUnitKt.shortName(unit));
        return sb.toString();
    }

    /* renamed from: toIsoString-impl  reason: not valid java name */
    public static final String m1355toIsoStringimpl(long j) {
        StringBuilder sb = new StringBuilder();
        if (m1342isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long m1315getAbsoluteValueUwyO8pc = m1315getAbsoluteValueUwyO8pc(j);
        int m1354toIntimpl = m1354toIntimpl(m1315getAbsoluteValueUwyO8pc, TimeUnit.HOURS);
        int m1331getMinutesComponentimpl = m1331getMinutesComponentimpl(m1315getAbsoluteValueUwyO8pc);
        int m1333getSecondsComponentimpl = m1333getSecondsComponentimpl(m1315getAbsoluteValueUwyO8pc);
        int m1332getNanosecondsComponentimpl = m1332getNanosecondsComponentimpl(m1315getAbsoluteValueUwyO8pc);
        boolean z = true;
        boolean z2 = m1354toIntimpl != 0;
        boolean z3 = (m1333getSecondsComponentimpl == 0 && m1332getNanosecondsComponentimpl == 0) ? false : true;
        if (m1331getMinutesComponentimpl == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(m1354toIntimpl);
            sb.append('H');
        }
        if (z) {
            sb.append(m1331getMinutesComponentimpl);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            sb.append(m1333getSecondsComponentimpl);
            if (m1332getNanosecondsComponentimpl != 0) {
                sb.append('.');
                String padStart = StringsKt.padStart(String.valueOf(m1332getNanosecondsComponentimpl), 9, '0');
                if (m1332getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS == 0) {
                    sb.append((CharSequence) padStart, 0, 3);
                    Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
                } else if (m1332getNanosecondsComponentimpl % 1000 == 0) {
                    sb.append((CharSequence) padStart, 0, 6);
                    Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
                } else {
                    sb.append(padStart);
                }
            }
            sb.append('S');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
