package com.amazon.aps.iva.cq;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.compose.ui.node.e;
import androidx.compose.ui.platform.d;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.d4.d;
import com.amazon.aps.iva.dr.e;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.f1.m;
import com.amazon.aps.iva.f1.u0;
import com.amazon.aps.iva.g8.o0;
import com.amazon.aps.iva.g8.p0;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.me0.a;
import com.amazon.aps.iva.o0.c2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.g0;
import com.amazon.aps.iva.o0.g2;
import com.amazon.aps.iva.o0.h3;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.i3;
import com.amazon.aps.iva.o0.j;
import com.amazon.aps.iva.o0.j3;
import com.amazon.aps.iva.o0.l3;
import com.amazon.aps.iva.o0.m3;
import com.amazon.aps.iva.o0.n3;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q0;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.s0;
import com.amazon.aps.iva.o0.s3;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.o0.x2;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.ob0.h;
import com.amazon.aps.iva.p1.y;
import com.amazon.aps.iva.r4.a2;
import com.amazon.aps.iva.r4.c1;
import com.amazon.aps.iva.r4.n0;
import com.amazon.aps.iva.r4.y0;
import com.amazon.aps.iva.se0.b0;
import com.amazon.aps.iva.se0.d0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.se0.l2;
import com.amazon.aps.iva.se0.w;
import com.amazon.aps.iva.se0.x;
import com.amazon.aps.iva.t3.j;
import com.amazon.aps.iva.u1.e;
import com.amazon.aps.iva.v1.d1;
import com.amazon.aps.iva.ve0.j0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xe0.s;
import com.amazon.aps.iva.xe0.u;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.z.l1;
import com.amazon.aps.iva.z.p;
import com.ellation.crunchyroll.model.FormattableSeason;
import com.ellation.crunchyroll.model.simulcast.SimulcastSeason;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: NoOpTimeProvider.kt */
/* loaded from: classes2.dex */
public final class b implements c, e, com.amazon.aps.iva.m00.c, com.amazon.aps.iva.mq.e, a.c {
    public static final String[] b = {"ItemID", "ContentURL", "ItemState", "TimeAdded", "ItemEstimatedSize", "ItemDownloadedSize", "ItemPlaybackPath", "ItemDataDir", "ItemDuration"};
    public static final float[] c = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] d = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final b e = new b();
    public static final s f = new s("UNDEFINED");
    public static final s g = new s("REUSABLE_CLAIMED");

    public static void A(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void B(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void C(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void D(Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void E(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static final f F(f fVar, u0 u0Var) {
        j.f(fVar, "<this>");
        j.f(u0Var, "shape");
        return androidx.compose.ui.graphics.a.b(fVar, 0.0f, 0.0f, 0.0f, u0Var, true, 124927);
    }

    public static final f G(f fVar) {
        j.f(fVar, "<this>");
        return androidx.compose.ui.graphics.a.b(fVar, 0.0f, 0.0f, 0.0f, null, true, 126975);
    }

    public static final q1 H(com.amazon.aps.iva.ve0.f fVar, Object obj, g gVar, i iVar, int i) {
        j.f(fVar, "<this>");
        iVar.s(-606625098);
        if ((i & 2) != 0) {
            gVar = h.b;
        }
        e0.b bVar = e0.a;
        l3 l3Var = new l3(gVar, fVar, null);
        iVar.s(-1703169085);
        iVar.s(-492369756);
        Object t = iVar.t();
        if (t == i.a.a) {
            t = c0(obj);
            iVar.n(t);
        }
        iVar.G();
        q1 q1Var = (q1) t;
        x0.d(fVar, gVar, new j3(l3Var, q1Var, null), iVar);
        iVar.G();
        iVar.G();
        return q1Var;
    }

    public static final q1 I(com.amazon.aps.iva.ve0.u0 u0Var, i iVar) {
        j.f(u0Var, "<this>");
        iVar.s(-1439883919);
        h hVar = h.b;
        e0.b bVar = e0.a;
        q1 H = H(u0Var, u0Var.getValue(), hVar, iVar, 0);
        iVar.G();
        return H;
    }

    public static final p J(l1 l1Var, Object obj) {
        j.f(l1Var, "<this>");
        return z.J((p) l1Var.a().invoke(obj));
    }

    public static final com.amazon.aps.iva.p0.f K() {
        n3 n3Var = i3.b;
        com.amazon.aps.iva.p0.f fVar = (com.amazon.aps.iva.p0.f) n3Var.a();
        if (fVar == null) {
            com.amazon.aps.iva.p0.f fVar2 = new com.amazon.aps.iva.p0.f(new s0[0]);
            n3Var.e(fVar2);
            return fVar2;
        }
        return fVar;
    }

    public static final q0 L(h3 h3Var, com.amazon.aps.iva.xb0.a aVar) {
        n3 n3Var = i3.a;
        return new q0(h3Var, aVar);
    }

    public static final q0 M(com.amazon.aps.iva.xb0.a aVar) {
        n3 n3Var = i3.a;
        j.f(aVar, "calculation");
        return new q0(null, aVar);
    }

    public static final float N(int i, i iVar) {
        e0.b bVar = e0.a;
        return ((Context) iVar.i(d.b)).getResources().getDimension(i) / ((com.amazon.aps.iva.o2.c) iVar.i(d1.e)).getDensity();
    }

    public static final float O(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f2 = 0.0f;
        for (int i = 0; i < length; i++) {
            f2 += fArr[i] * fArr2[i];
        }
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:13:0x002d, B:26:0x0063, B:28:0x0067, B:30:0x006b, B:33:0x0071, B:43:0x0081, B:44:0x0082, B:46:0x0086, B:49:0x0095, B:51:0x0099, B:53:0x00a0, B:54:0x00a1, B:55:0x00b8, B:18:0x0042), top: B:65:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:13:0x002d, B:26:0x0063, B:28:0x0067, B:30:0x006b, B:33:0x0071, B:43:0x0081, B:44:0x0082, B:46:0x0086, B:49:0x0095, B:51:0x0099, B:53:0x00a0, B:54:0x00a1, B:55:0x00b8, B:18:0x0042), top: B:65:0x0021 }] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.amazon.aps.iva.ue0.s] */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.amazon.aps.iva.ue0.s] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0092 -> B:14:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(com.amazon.aps.iva.ve0.g r7, com.amazon.aps.iva.ue0.p r8, boolean r9, com.amazon.aps.iva.ob0.d r10) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.cq.b.P(com.amazon.aps.iva.ve0.g, com.amazon.aps.iva.ue0.p, boolean, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static final int Q(com.amazon.aps.iva.f0.p pVar, Object obj, int i) {
        if (obj != null && pVar.b() != 0) {
            if (i < pVar.b() && j.a(obj, pVar.getKey(i))) {
                return i;
            }
            int a = pVar.a(obj);
            if (a != -1) {
                return a;
            }
        }
        return i;
    }

    public static int R(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static final int S(i iVar) {
        e0.b bVar = e0.a;
        return iVar.D();
    }

    public static final int T(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:5|(2:6|7)|(7:9|10|11|12|(1:14)|16|17)|20|10|11|12|(0)|16|17) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: NumberFormatException -> 0x0031, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0031, blocks: (B:13:0x0025, B:15:0x002d), top: B:20:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair U(com.amazon.aps.iva.g6.d r6) {
        /*
            java.util.Map r6 = r6.h()
            if (r6 != 0) goto L8
            r6 = 0
            return r6
        L8:
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r1 = "LicenseDurationRemaining"
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r1 = r6.get(r1)     // Catch: java.lang.NumberFormatException -> L1e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L1e
            if (r1 == 0) goto L1e
            long r4 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L1e
            goto L1f
        L1e:
            r4 = r2
        L1f:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "PlaybackDurationRemaining"
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.NumberFormatException -> L31
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.NumberFormatException -> L31
            if (r6 == 0) goto L31
            long r2 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L31
        L31:
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            r0.<init>(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.cq.b.U(com.amazon.aps.iva.g6.d):android.util.Pair");
    }

    public static long V(byte b2, byte b3) {
        int i;
        int i2;
        int i3 = b2 & UnsignedBytes.MAX_VALUE;
        int i4 = i3 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b3 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i6 & 1);
        } else if (i6 == 3) {
            i2 = 60000;
        } else {
            i2 = 10000 << i6;
        }
        return i * i2;
    }

    public static final void W() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static boolean X(Uri uri) {
        if (uri != null && FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    public static final float Y(float f2, float f3, float f4) {
        return (f4 * f3) + ((1 - f4) * f2);
    }

    public static final int Z(int i, int i2, float f2) {
        int round;
        double d2 = (i2 - i) * f2;
        if (!Double.isNaN(d2)) {
            if (d2 > 2.147483647E9d) {
                round = Integer.MAX_VALUE;
            } else if (d2 < -2.147483648E9d) {
                round = Integer.MIN_VALUE;
            } else {
                round = (int) Math.round(d2);
            }
            return i + round;
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final com.amazon.aps.iva.t1.i a0(com.amazon.aps.iva.xb0.a aVar) {
        j.f(aVar, "defaultFactory");
        return new com.amazon.aps.iva.t1.i(aVar);
    }

    public static final y1 b0(Object obj, h3 h3Var) {
        j.f(h3Var, "policy");
        int i = com.amazon.aps.iva.o0.b.a;
        return new y1(obj, h3Var);
    }

    public static /* synthetic */ y1 c0(Object obj) {
        return b0(obj, s3.a);
    }

    public static final o0 d0(l lVar) {
        j.f(lVar, "optionsBuilder");
        p0 p0Var = new p0();
        lVar.invoke(p0Var);
        boolean z = p0Var.b;
        o0.a aVar = p0Var.a;
        aVar.getClass();
        boolean z2 = p0Var.c;
        aVar.getClass();
        int i = p0Var.d;
        boolean z3 = p0Var.e;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        return new o0(z, z2, i, false, z3, aVar.a, aVar.b, aVar.c, aVar.d);
    }

    public static final void e0(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        float O;
        j.f(fArr, "x");
        j.f(fArr2, "y");
        j.f(fArr3, "coefficients");
        if (i != 0) {
            int i2 = (2 >= i ? i - 1 : 2) + 1;
            float[][] fArr4 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr4[i3] = new float[i];
            }
            for (int i4 = 0; i4 < i; i4++) {
                fArr4[0][i4] = 1.0f;
                for (int i5 = 1; i5 < i2; i5++) {
                    fArr4[i5][i4] = fArr4[i5 - 1][i4] * fArr[i4];
                }
            }
            float[][] fArr5 = new float[i2];
            for (int i6 = 0; i6 < i2; i6++) {
                fArr5[i6] = new float[i];
            }
            float[][] fArr6 = new float[i2];
            for (int i7 = 0; i7 < i2; i7++) {
                fArr6[i7] = new float[i2];
            }
            for (int i8 = 0; i8 < i2; i8++) {
                float[] fArr7 = fArr5[i8];
                float[] fArr8 = fArr4[i8];
                for (int i9 = 0; i9 < i; i9++) {
                    fArr7[i9] = fArr8[i9];
                }
                for (int i10 = 0; i10 < i8; i10++) {
                    float[] fArr9 = fArr5[i10];
                    float O2 = O(fArr7, fArr9);
                    for (int i11 = 0; i11 < i; i11++) {
                        fArr7[i11] = fArr7[i11] - (fArr9[i11] * O2);
                    }
                }
                float sqrt = (float) Math.sqrt(O(fArr7, fArr7));
                if (sqrt >= 1.0E-6f) {
                    float f2 = 1.0f / sqrt;
                    for (int i12 = 0; i12 < i; i12++) {
                        fArr7[i12] = fArr7[i12] * f2;
                    }
                    float[] fArr10 = fArr6[i8];
                    for (int i13 = 0; i13 < i2; i13++) {
                        if (i13 < i8) {
                            O = 0.0f;
                        } else {
                            O = O(fArr7, fArr4[i13]);
                        }
                        fArr10[i13] = O;
                    }
                } else {
                    throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                }
            }
            int i14 = i2 - 1;
            for (int i15 = i14; -1 < i15; i15--) {
                fArr3[i15] = O(fArr5[i15], fArr2);
                int i16 = i15 + 1;
                if (i16 <= i14) {
                    int i17 = i14;
                    while (true) {
                        fArr3[i15] = fArr3[i15] - (fArr6[i15][i17] * fArr3[i17]);
                        if (i17 != i16) {
                            i17--;
                        }
                    }
                }
                fArr3[i15] = fArr3[i15] / fArr6[i15][i15];
            }
            return;
        }
        throw new IllegalArgumentException("At least one point must be provided");
    }

    public static final Object f0(c2 c2Var, g2 g2Var) {
        j.f(c2Var, "<this>");
        j.f(g2Var, "key");
        if (c2Var.containsKey(g2Var)) {
            p3 p3Var = (p3) c2Var.get(g2Var);
            if (p3Var != null) {
                return p3Var.getValue();
            }
            return null;
        }
        return g2Var.a.getValue();
    }

    public static final g0 g0(i iVar) {
        iVar.s(-1165786124);
        e0.b bVar = e0.a;
        j.b E = iVar.E();
        iVar.G();
        return E;
    }

    public static final q1 h0(Object obj, i iVar) {
        iVar.s(-1058319986);
        e0.b bVar = e0.a;
        iVar.s(-492369756);
        Object t = iVar.t();
        if (t == i.a.a) {
            t = c0(obj);
            iVar.n(t);
        }
        iVar.G();
        q1 q1Var = (q1) t;
        q1Var.setValue(obj);
        iVar.G();
        return q1Var;
    }

    public static com.amazon.aps.iva.w7.f i0(com.amazon.aps.iva.w7.f fVar, String[] strArr, Map map) {
        int i = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (com.amazon.aps.iva.w7.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                com.amazon.aps.iva.w7.f fVar2 = new com.amazon.aps.iva.w7.f();
                int length = strArr.length;
                while (i < length) {
                    fVar2.a((com.amazon.aps.iva.w7.f) map.get(strArr[i]));
                    i++;
                }
                return fVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            fVar.a((com.amazon.aps.iva.w7.f) map.get(strArr[0]));
            return fVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i < length2) {
                fVar.a((com.amazon.aps.iva.w7.f) map.get(strArr[i]));
                i++;
            }
        }
        return fVar;
    }

    public static final m j() {
        return new m(0);
    }

    public static final void j0(Object obj, com.amazon.aps.iva.ob0.d dVar, l lVar) {
        Object wVar;
        l2<?> l2Var;
        if (dVar instanceof com.amazon.aps.iva.xe0.e) {
            com.amazon.aps.iva.xe0.e eVar = (com.amazon.aps.iva.xe0.e) dVar;
            Throwable a = k.a(obj);
            boolean z = false;
            if (a == null) {
                if (lVar != null) {
                    wVar = new x(obj, lVar);
                } else {
                    wVar = obj;
                }
            } else {
                wVar = new w(a, false);
            }
            com.amazon.aps.iva.ob0.d<T> dVar2 = eVar.f;
            eVar.getContext();
            d0 d0Var = eVar.e;
            if (d0Var.B()) {
                eVar.g = wVar;
                eVar.d = 1;
                d0Var.x(eVar.getContext(), eVar);
                return;
            }
            com.amazon.aps.iva.se0.x0 a2 = com.amazon.aps.iva.se0.g2.a();
            if (a2.V()) {
                eVar.g = wVar;
                eVar.d = 1;
                a2.L(eVar);
                return;
            }
            a2.M(true);
            try {
                j1 j1Var = (j1) eVar.getContext().get(j1.b.b);
                if (j1Var != null && !j1Var.isActive()) {
                    CancellationException p = j1Var.p();
                    eVar.a(wVar, p);
                    eVar.resumeWith(com.amazon.aps.iva.ab.x.H(p));
                    z = true;
                }
                if (!z) {
                    Object obj2 = eVar.h;
                    g context = dVar2.getContext();
                    Object c2 = u.c(context, obj2);
                    if (c2 != u.a) {
                        l2Var = b0.c(dVar2, context, c2);
                    } else {
                        l2Var = null;
                    }
                    dVar2.resumeWith(obj);
                    q qVar = q.a;
                    if (l2Var == null || l2Var.y0()) {
                        u.a(context, c2);
                    }
                }
                do {
                } while (a2.a0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.resumeWith(obj);
    }

    public static final void k(f fVar, i iVar, int i) {
        com.amazon.aps.iva.yb0.j.f(fVar, "modifier");
        iVar.s(-72882467);
        e0.b bVar = e0.a;
        com.amazon.aps.iva.d0.c2 c2Var = com.amazon.aps.iva.d0.c2.a;
        iVar.s(-1323940314);
        int S = S(iVar);
        c2 l = iVar.l();
        com.amazon.aps.iva.u1.e.o0.getClass();
        e.a aVar = e.a.b;
        com.amazon.aps.iva.v0.a a = com.amazon.aps.iva.s1.u.a(fVar);
        int i2 = (((((i << 3) & 112) | 384) << 9) & 7168) | 6;
        if (iVar.j() instanceof com.amazon.aps.iva.o0.d) {
            iVar.z();
            if (iVar.e()) {
                iVar.w(aVar);
            } else {
                iVar.m();
            }
            k0(iVar, c2Var, e.a.e);
            k0(iVar, l, e.a.d);
            e.a.C0752a c0752a = e.a.f;
            if (iVar.e() || !com.amazon.aps.iva.yb0.j.a(iVar.t(), Integer.valueOf(S))) {
                b2.c(S, iVar, S, c0752a);
            }
            a.invoke(new x2(iVar), iVar, Integer.valueOf((i2 >> 3) & 112));
            iVar.s(2058660585);
            iVar.G();
            iVar.o();
            iVar.G();
            iVar.G();
            return;
        }
        W();
        throw null;
    }

    public static final void k0(i iVar, Object obj, com.amazon.aps.iva.xb0.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "block");
        if (iVar.e() || !com.amazon.aps.iva.yb0.j.a(iVar.t(), obj)) {
            iVar.n(obj);
            iVar.B(obj, pVar);
        }
    }

    public static final String l(com.amazon.aps.iva.qj.u uVar, String str) {
        String str2;
        if (uVar != null) {
            str2 = ", Session created at: " + uVar.h + ", Network Timeout Sec: " + uVar.c + ", Session Expiration Sec: " + uVar.e;
        } else {
            str2 = null;
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(' ');
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static final void l0(RemoteViews remoteViews, a2 a2Var, int i, String str, com.amazon.aps.iva.a5.e eVar, int i2, int i3) {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Layout.Alignment alignment;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i4;
        boolean z13;
        com.amazon.aps.iva.yb0.j.f(remoteViews, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "text");
        if (i2 != Integer.MAX_VALUE) {
            remoteViews.setInt(i, "setMaxLines", i2);
        }
        if (eVar == null) {
            remoteViews.setTextViewText(i, str);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        int length = spannableString.length();
        boolean z14 = true;
        com.amazon.aps.iva.o2.m mVar = eVar.b;
        if (mVar != null) {
            long j2 = mVar.a;
            if ((j2 & 1095216660480L) == 4294967296L) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                remoteViews.setTextViewTextSize(i, 2, com.amazon.aps.iva.o2.m.c(j2));
            } else {
                throw new IllegalArgumentException("Only Sp is currently supported for font sizes");
            }
        }
        ArrayList arrayList = new ArrayList();
        Context context = a2Var.a;
        com.amazon.aps.iva.a5.b bVar = eVar.c;
        if (bVar != null) {
            int i5 = bVar.a;
            if (i5 == 700) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i4 = 2132083575;
            } else {
                if (i5 == 500) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i4 = 2132083689;
                } else {
                    i4 = 2132083690;
                }
            }
            arrayList.add(new TextAppearanceSpan(context, i4));
        }
        com.amazon.aps.iva.a5.c cVar = eVar.d;
        if (cVar != null) {
            int i6 = Build.VERSION.SDK_INT;
            int i7 = 5;
            int i8 = cVar.a;
            if (i6 >= 31) {
                com.amazon.aps.iva.w4.d dVar = com.amazon.aps.iva.w4.d.a;
                if (i8 == 3) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    i7 = 1;
                } else {
                    if (i8 == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        i7 = 3;
                    } else {
                        if (i8 == 2) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (!z8) {
                            if (i8 == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (!z9) {
                                if (i8 == 5) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    i7 = 8388613;
                                }
                            }
                            i7 = 8388611;
                        }
                    }
                }
                dVar.a(remoteViews, i, i7 | i3);
            } else {
                if (i8 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else {
                    if (i8 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z15 = a2Var.c;
                    if (z2) {
                        if (z15) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else {
                        if (i8 == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (z15) {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            }
                        } else {
                            if (i8 == 4) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else {
                                if (i8 == 5) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                } else {
                                    alignment = Layout.Alignment.ALIGN_NORMAL;
                                }
                            }
                        }
                    }
                }
                arrayList.add(new AlignmentSpan.Standard(alignment));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            spannableString.setSpan((ParcelableSpan) it.next(), 0, length, 17);
        }
        remoteViews.setTextViewText(i, spannableString);
        com.amazon.aps.iva.b5.a aVar = eVar.a;
        if (aVar instanceof com.amazon.aps.iva.b5.d) {
            remoteViews.setTextColor(i, i.G(((com.amazon.aps.iva.b5.d) aVar).a));
        } else if (aVar instanceof com.amazon.aps.iva.b5.e) {
            if (Build.VERSION.SDK_INT >= 31) {
                j.a.g(remoteViews, i, "setTextColor", ((com.amazon.aps.iva.b5.e) aVar).a);
                return;
            }
            com.amazon.aps.iva.b5.e eVar2 = (com.amazon.aps.iva.b5.e) aVar;
            eVar2.getClass();
            com.amazon.aps.iva.yb0.j.f(context, "context");
            remoteViews.setTextColor(i, i.G(i.d(com.amazon.aps.iva.b5.b.a.a(context, eVar2.a))));
        } else if (aVar instanceof com.amazon.aps.iva.x4.c) {
            if (Build.VERSION.SDK_INT >= 31) {
                com.amazon.aps.iva.x4.c cVar2 = (com.amazon.aps.iva.x4.c) aVar;
                j.a.f(remoteViews, i, "setTextColor", i.G(cVar2.a), i.G(cVar2.b));
                return;
            }
            com.amazon.aps.iva.x4.c cVar3 = (com.amazon.aps.iva.x4.c) aVar;
            cVar3.getClass();
            com.amazon.aps.iva.yb0.j.f(context, "context");
            if ((context.getResources().getConfiguration().uiMode & 48) != 32) {
                z14 = false;
            }
            if (z14) {
                j = cVar3.b;
            } else {
                j = cVar3.a;
            }
            remoteViews.setTextColor(i, i.G(j));
        } else if (aVar != null) {
            aVar.toString();
        }
    }

    public static final int m(com.amazon.aps.iva.u1.e0 e0Var, com.amazon.aps.iva.s1.a aVar) {
        boolean z;
        int i;
        com.amazon.aps.iva.u1.e0 C0 = e0Var.C0();
        if (C0 != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (e0Var.M0().c().containsKey(aVar)) {
                Integer num = e0Var.M0().c().get(aVar);
                if (num == null) {
                    return Integer.MIN_VALUE;
                }
                return num.intValue();
            }
            int e2 = C0.e(aVar);
            if (e2 == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            C0.g = true;
            e0Var.h = true;
            e0Var.a1();
            C0.g = false;
            e0Var.h = false;
            if (aVar instanceof com.amazon.aps.iva.s1.j) {
                i = com.amazon.aps.iva.o2.h.b(C0.W0());
            } else {
                long W0 = C0.W0();
                int i2 = com.amazon.aps.iva.o2.h.c;
                i = (int) (W0 >> 32);
            }
            return i + e2;
        }
        throw new IllegalStateException(("Child of " + e0Var + " cannot be null when calculating alignment line").toString());
    }

    public static final j0 m0(com.amazon.aps.iva.xb0.a aVar) {
        return new j0(new m3(aVar, null));
    }

    public static final int n(long j) {
        int i;
        if ((4294967295L & j) == 0) {
            i = 32;
            j >>= 32;
        } else {
            i = 0;
        }
        if ((WebSocketProtocol.PAYLOAD_SHORT_MAX & j) == 0) {
            i += 16;
            j >>= 16;
        }
        if ((255 & j) == 0) {
            i += 8;
            j >>= 8;
        }
        if ((15 & j) == 0) {
            i += 4;
            j >>= 4;
        }
        if ((1 & j) == 0) {
            if ((2 & j) != 0) {
                return i + 1;
            }
            if ((4 & j) != 0) {
                return i + 2;
            }
            if ((j & 8) != 0) {
                return i + 3;
            }
            return -1;
        }
        return i;
    }

    public static final d.a n0(String str) {
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new d.a(str);
    }

    public static final void o(com.amazon.aps.iva.q1.c cVar, y yVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(yVar, "event");
        boolean o = f1.o(yVar);
        int i = 0;
        com.amazon.aps.iva.q1.b bVar = cVar.b;
        com.amazon.aps.iva.q1.b bVar2 = cVar.a;
        long j = yVar.c;
        if (o) {
            cVar.c = j;
            com.amazon.aps.iva.lb0.m.K(bVar2.d, null);
            bVar2.e = 0;
            com.amazon.aps.iva.lb0.m.K(bVar.d, null);
            bVar.e = 0;
        }
        List list = yVar.k;
        if (list == null) {
            list = com.amazon.aps.iva.lb0.z.b;
        }
        int size = list.size();
        long j2 = yVar.g;
        while (i < size) {
            com.amazon.aps.iva.p1.f fVar = (com.amazon.aps.iva.p1.f) list.get(i);
            long f2 = com.amazon.aps.iva.e1.c.f(cVar.c, com.amazon.aps.iva.e1.c.e(fVar.b, j2));
            cVar.c = f2;
            float c2 = com.amazon.aps.iva.e1.c.c(f2);
            int i2 = (bVar2.e + 1) % 20;
            bVar2.e = i2;
            com.amazon.aps.iva.q1.a[] aVarArr = bVar2.d;
            com.amazon.aps.iva.q1.a aVar = aVarArr[i2];
            List list2 = list;
            long j3 = fVar.a;
            if (aVar == null) {
                aVarArr[i2] = new com.amazon.aps.iva.q1.a(j3, c2);
            } else {
                aVar.a = j3;
                aVar.b = c2;
            }
            float d2 = com.amazon.aps.iva.e1.c.d(f2);
            int i3 = (bVar.e + 1) % 20;
            bVar.e = i3;
            com.amazon.aps.iva.q1.a[] aVarArr2 = bVar.d;
            com.amazon.aps.iva.q1.a aVar2 = aVarArr2[i3];
            if (aVar2 == null) {
                aVarArr2[i3] = new com.amazon.aps.iva.q1.a(j3, d2);
            } else {
                aVar2.a = j3;
                aVar2.b = d2;
            }
            i++;
            j2 = fVar.b;
            list = list2;
        }
        long f3 = com.amazon.aps.iva.e1.c.f(cVar.c, com.amazon.aps.iva.e1.c.e(j, j2));
        cVar.c = f3;
        float c3 = com.amazon.aps.iva.e1.c.c(f3);
        int i4 = (bVar2.e + 1) % 20;
        bVar2.e = i4;
        com.amazon.aps.iva.q1.a[] aVarArr3 = bVar2.d;
        com.amazon.aps.iva.q1.a aVar3 = aVarArr3[i4];
        long j4 = yVar.b;
        if (aVar3 == null) {
            aVarArr3[i4] = new com.amazon.aps.iva.q1.a(j4, c3);
        } else {
            aVar3.a = j4;
            aVar3.b = c3;
        }
        float d3 = com.amazon.aps.iva.e1.c.d(f3);
        int i5 = (bVar.e + 1) % 20;
        bVar.e = i5;
        com.amazon.aps.iva.q1.a[] aVarArr4 = bVar.d;
        com.amazon.aps.iva.q1.a aVar4 = aVarArr4[i5];
        if (aVar4 == null) {
            aVarArr4[i5] = new com.amazon.aps.iva.q1.a(j4, d3);
            return;
        }
        aVar4.a = j4;
        aVar4.b = d3;
    }

    public static final com.amazon.aps.iva.ga0.g o0(com.amazon.aps.iva.mk.c cVar) {
        com.amazon.aps.iva.ga0.g gVar = new com.amazon.aps.iva.ga0.g();
        String str = cVar.a;
        if (str != null) {
            gVar.b("vid", str);
        }
        String str2 = cVar.b;
        if (str2 != null) {
            gVar.b("vtt", str2);
        }
        String str3 = cVar.c;
        if (str3 != null) {
            gVar.b("vsr", str3);
        }
        String str4 = cVar.d;
        if (str4 != null) {
            gVar.b("vsour", str4);
        }
        Long valueOf = Long.valueOf(cVar.e);
        if (valueOf != null) {
            gVar.b("vdu", valueOf.toString());
        }
        String str5 = cVar.f;
        if (str5 != null) {
            gVar.b("vctty", str5);
        }
        String str6 = cVar.g;
        if (str6 != null) {
            gVar.b("vsmty", str6);
        }
        String str7 = cVar.h;
        if (str7 != null) {
            gVar.b("vlacd", str7);
        }
        return gVar;
    }

    public static final int p(int i, int[] iArr) {
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else if (i < i4) {
                length = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final com.amazon.aps.iva.mk.c p0(com.amazon.aps.iva.nk.j jVar) {
        String str;
        com.amazon.aps.iva.yb0.j.f(jVar, "<this>");
        com.amazon.aps.iva.kk.c cVar = jVar.h;
        String str2 = cVar.a;
        String str3 = cVar.d;
        String str4 = cVar.f;
        String str5 = cVar.p;
        long j = cVar.s;
        String str6 = cVar.i;
        com.amazon.aps.iva.qj.k kVar = cVar.r;
        if (kVar != null) {
            str = kVar.name();
        } else {
            str = null;
        }
        return new com.amazon.aps.iva.mk.c(str2, str3, str4, str5, j, str6, str, cVar.w);
    }

    public static ArrayList q(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[10] & UnsignedBytes.MAX_VALUE)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static final com.amazon.aps.iva.i1.c q0(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            com.amazon.aps.iva.yb0.j.e(bitmap, "bitmap");
            return new com.amazon.aps.iva.i1.a(new com.amazon.aps.iva.f1.i(bitmap));
        } else if (drawable instanceof ColorDrawable) {
            return new com.amazon.aps.iva.i1.b(i.d(((ColorDrawable) drawable).getColor()));
        } else {
            if (drawable == null) {
                return new com.amazon.aps.iva.i1.b(com.amazon.aps.iva.f1.x.f);
            }
            Drawable mutate = drawable.mutate();
            com.amazon.aps.iva.yb0.j.e(mutate, "mutate()");
            return new DrawablePainter(mutate);
        }
    }

    public static void r(StringBuilder sb, o oVar) {
        int lastIndexOf;
        if (oVar == null) {
            sb.append("null");
            return;
        }
        String simpleName = oVar.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = oVar.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(oVar)));
    }

    public static final String r0(float f2) {
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f3 = f2 * pow;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        float f4 = i / pow;
        if (max > 0) {
            return String.valueOf(f4);
        }
        return String.valueOf((int) f4);
    }

    public static final float s(long j, float f2, long j2, long j3) {
        long o = i.o(com.amazon.aps.iva.f1.x.b(j, f2), j3);
        float y = i.y(i.o(j2, o)) + 0.05f;
        float y2 = i.y(o) + 0.05f;
        return Math.max(y, y2) / Math.min(y, y2);
    }

    public static final void s0(RemoteViews remoteViews, a2 a2Var, com.amazon.aps.iva.a5.a aVar) {
        com.amazon.aps.iva.yb0.j.f(remoteViews, "<this>");
        com.amazon.aps.iva.yb0.j.f(aVar, "element");
        n0 b2 = y0.b(remoteViews, a2Var, c1.Text, aVar.a);
        l0(remoteViews, a2Var, b2.a, aVar.b, aVar.c, aVar.d, 48);
        com.amazon.aps.iva.r4.d.a(a2Var, remoteViews, aVar.a, b2);
    }

    public static void t(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void u(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void v(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void w(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void x(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void y(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public static void z(Object obj) {
        obj.getClass();
    }

    @Override // com.amazon.aps.iva.gr.o
    public void a(Context context) {
    }

    @Override // com.amazon.aps.iva.m00.c
    public String b(FormattableSeason formattableSeason) {
        com.amazon.aps.iva.yb0.j.f((SimulcastSeason) formattableSeason, "season");
        return "";
    }

    @Override // com.amazon.aps.iva.cq.c
    public long c() {
        return 0L;
    }

    @Override // com.amazon.aps.iva.gr.o
    public void d(Context context) {
    }

    @Override // com.amazon.aps.iva.mq.e
    public void e(int i, String str, Throwable th, LinkedHashMap linkedHashMap, CopyOnWriteArraySet copyOnWriteArraySet, Long l) {
        com.amazon.aps.iva.yb0.j.f(str, "message");
        com.amazon.aps.iva.yb0.j.f(copyOnWriteArraySet, "tags");
    }

    @Override // com.amazon.aps.iva.m00.c
    public String f(FormattableSeason formattableSeason) {
        SimulcastSeason simulcastSeason = (SimulcastSeason) formattableSeason;
        com.amazon.aps.iva.yb0.j.f(simulcastSeason, "season");
        return simulcastSeason.getTitle();
    }

    @Override // com.amazon.aps.iva.dr.e
    public com.amazon.aps.iva.zq.c g() {
        return new com.amazon.aps.iva.p4.f();
    }

    @Override // com.amazon.aps.iva.me0.a.c
    public Iterable h(Object obj) {
        com.amazon.aps.iva.fc0.l<Object>[] lVarArr = com.amazon.aps.iva.nc0.k.h;
        return ((com.amazon.aps.iva.oc0.b) obj).a().k();
    }

    @Override // com.amazon.aps.iva.cq.c
    public long i() {
        return 0L;
    }
}
