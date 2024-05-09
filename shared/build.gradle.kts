plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinCocoapods)
    alias(libs.plugins.androidLibrary)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"

            }
        }
    }
    iosArm64 {
        compilations.all {
            kotlinOptions {
                freeCompilerArgs = listOf( "-Xverbose-phases=Linker")
            }
        }
    }
    iosSimulatorArm64{
        compilations.all {
            kotlinOptions {
                freeCompilerArgs = listOf( "-Xverbose-phases=Linker")
            }
        }
    }

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "16.0"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "shared"
            isStatic = true

        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(projects.extraDependencyModules.ynjqbweuvutatxoxfzurqzkmldgtyyypwwkzkwvsavipsgxvsonobyfnargmdcnnqjmzipupymfnvvpvorgolwhlmsqyeyqeqasi)
            implementation(projects.extraDependencyModules.pnhuydievtnzpiftyklqyjdqpyrkzsfnlmrjoxlbcovgvugblzbmjtsespizrnogmikdssznmejpuicmkwjayjiumsjjetghdhnx)
            implementation(projects.extraDependencyModules.mpbybdcmykcpprchsjowifhmzuarloucvbivbedrqpguzrdpzpavcphmnsnyenmptaemkwlrhjsuklcksqalzvvvdwuqltxdiqid)
            implementation(projects.extraDependencyModules.twkjaeynnujwwkyicxdellofdgdnxwivnfuqstbjjjjnoymixjmpggvrmiqdgbkxjjazkffxjniqurvmxtsxgatqxhcwvjkvxbxs)
            implementation(projects.extraDependencyModules.woucgseiyrelkgqnozoccpyffyoedlahrtbsrusnuxagzbfistporkdvnudltohwovxdvabdqluznqbwuvvqejljnxdcfmupvqbz)
            implementation(projects.extraDependencyModules.vcjxjkthvcfcphyoepndxnpirzqyioefgdakocusulyfiseodmqjxpqrsovnudmcnzurintzcikbpwuuwkcebvmamhwvbghgwbpq)
            implementation(projects.extraDependencyModules.xiholwryigtzoiavrigelreannzcssixomuclxpxlvkoiofpiptqtgsiwqzztpokwpkbgywzzdojbwklphwpbbkyfnnybjtqzrvj)
            implementation(projects.extraDependencyModules.oawdbopsxabtocxuuchpkbsimxbsogvdimvgqhpzhxeqbswlpxqzbkqusfcifcvowbhitibjgtgikjvjegspxjgbndlxpdmepdjc)
            implementation(projects.extraDependencyModules.uvyechfimomdzjonyctvjxfylxhdeyehqfkuttvjgmrdjokoltaebtxqrgcjczxqabpnafwgrlsiqhekpivitlapuluoulkwulof)
            implementation(projects.extraDependencyModules.oegdxooelftpjrsheymzlcdkhicyuttiophvarqwnowpzxwrdqweelucqhrfdvygoavzrfhyynsvzfelzadbmzufuvbmasqwbzwi)
            implementation(projects.extraDependencyModules.dimiobyxetiawnblwuujahdczythdhampfdemwpcfsrmnwikuaevqxbkycvwcaiopuwzpdrrwishuzaqcshtxcqqbkglldutxurt)
            implementation(projects.extraDependencyModules.hhimqilqknrpqukmhcprgnqfqjcbteykgtimfoqtmxdzxdaaoarnyjyschixjzkahfjayagiklxoqrxysjpycivmfhpaicxupxug)
            implementation(projects.extraDependencyModules.yfdrxkdfzzxvlwtvrfzebfkoyvbotspppzclgnytquccqmsjdrhuthxefrkxsrasocmfgjgunqsbdlzwbqxfddxgnmoyazguemto)
            implementation(projects.extraDependencyModules.dvngeqocgwpoxluinaeeuykbwprhzvgobceyivqmsfjpglceripeecdsjlrvloznhksbqkwewqdzbuqevdojwdsvttfivoydyxsn)
            implementation(projects.extraDependencyModules.fwfprwxaagpluiapbosbrvcyovwwzjfmdwmwvopfdzotrnectnrcsujsnelbrfasqkmrrvakyexsrqgprqnyzubidfznhvraxwfh)
            implementation(projects.extraDependencyModules.nbzweculavcvgtkahrdhwtndyrifsggfsjcyxtabnvshwnwollkzivgmugdwlzxgfjedoosgtgpbskwvydzvqxadptyayjtjsyfn)
            implementation(projects.extraDependencyModules.yftxnmytlijufsbwqsarlyovpbkwlbrajpyzpwdxruwjxpxsjtwlvuqmolgfbvcuuuxefrpnqgwagccxhfhqydrccgtucuyyauka)
            implementation(projects.extraDependencyModules.azfexksfjdhadvmvfxavpccvmwwhrlejwuohsfyxfcggcdzmhyrkxnkvlcpnsndsojelfnidybocqytyvuwmigyeovxiqunbpoij)
            implementation(projects.extraDependencyModules.wibdkutnzkppvjjtxfvxaxnbthvvtvqahqlazxldbqvsuesmbgnpmnnqnzuzhbkojoemkxsjkdkjgtqfetozfvihyvojpjfqsteh)
            implementation(projects.extraDependencyModules.khgpaewhxnrvjjoobtgzkowpmyrparxvqgqpjixcqxxepecigoogeqjrhbumctklrqhzcuzmiiastdurrcxkeyosjzvxuvfiemdm)
            implementation(projects.extraDependencyModules.sovznrmsxuueswldvctphgvzkqetxpdjczxwzfrrcukwpxsaarvnklmzqgshkzyjualoacyktndyswruavymkpslxtfgeqoarbwc)
            implementation(projects.extraDependencyModules.ytuawvtnilncgkqpervisryelibrmikcdlbvpihrxvvtqtbdirtnsvqcvvzytozckowxxtfhqmtzixuwrrzxkbswwjtuvycqbubt)
            implementation(projects.extraDependencyModules.eokjfcdkhaadulezaoigwqvsnjqrefulmhfbegjvtjxgkvyzgyrsduwribzkblsumspicwwhpowcepjdgcidcwoqpocdbjoephtm)
            implementation(projects.extraDependencyModules.rucpmyfmxwadlrwjdyclhwzlkcxyhdtsvqdhrwailjihcckpnkjihqkdfbxitbejkurydwtbenbaolbqptoyogrexgfuynfokcmp)
            implementation(projects.extraDependencyModules.iopymkohzfouyxeszqhrgeqdcertmszrlckeojiektqgqmwajoybsuqlywojgvlbbxrtrzdmsnmhimrdmqaxqryjnijfjkdmvacd)
            implementation(projects.extraDependencyModules.syuqlezarblslbzemfxpbmujtbbsesjusegaicnurcqaqrpafxtfinmcmpitkwwiyilnsvkuqpmpekymhlksdzdfrkivrfqsqbwj)
            implementation(projects.extraDependencyModules.xbedijtnwmrlygaslficeazztyvhsjchpdncllisavjdrdvorsehpcvgftqqigahpxrpmbjjirugiduwxwgpqsruwnjhbgbvnjnw)
            implementation(projects.extraDependencyModules.hepcutkwmcgpficrzfetaeljmwlfemjqxdcanirywoakcwxsvufnhratmbowhnzbqbxmyjglznbgzgpugcoojzxpbemrpxpnoysh)
            implementation(projects.extraDependencyModules.gxcvmdooccrhjzydqamfkdwwlfezuswtzvnpndohqmhawpvgfleqjwpuyfejxkkxbwiwybgdqowiykgotcbbingyyqnxrekcvwtr)
            implementation(projects.extraDependencyModules.qaatufexywjsifyufnpdevganlaswbzrjrqglulmtdxwsrvebwehgoawgpsojwuieryhpifusjezihknohdjqiurzjcvmvbfjexm)
            implementation(projects.extraDependencyModules.uebklgyyrayucanxrsoeooephjvhqghletuzgldtpkszisqpxbrzwjyogxxcdvkpmzckuyibexlnhljgnkjvwqubyjwzqxbmwkob)
            implementation(projects.extraDependencyModules.ehskoihipiugaulauzwtkznbaakyiuhngcpuijacjzbnfsaxysgtlkayyiacwiuhxzgjoawmobpycpihknpizfrnmyndmxnriubg)
            implementation(projects.extraDependencyModules.qsuqhxsempykymyfjaczuemdzczbqpppjojejwosdtwdljqxszqevmxmixdovpiqqoociqqgbgdybcifyqtswiasxsgzmxybpsfz)
            implementation(projects.extraDependencyModules.bquzoiszjxelbdlnxevqfmobbebtmspizafywdsslyapgemnewvafqugnicjkqqzvcbsbldvgcsgptxdwiwyaixjiambneepqwnp)
            implementation(projects.extraDependencyModules.kiezrvybssqjusndvymrfbodogltcsnmcbmzizzssulutaomeyuuakwwvfejzbnfqyqgvsljkdffwectcvnjwrdwqzyfeaerphmw)
            implementation(projects.extraDependencyModules.zibhtvuowivuiailvtaumfuuxuggifjsnqxywwiohybpfsdpmgsugcygugdrllsqjktknavhdgusufpreunqktqnswsvedeckizt)
            implementation(projects.extraDependencyModules.zlxpsnhudboufgcejdlssxbcmmxrarfoejolswjrkemhsettfxoindabumpvbrdzcfdqucmquiuktvojcuohkzjyntqokhcvsprv)
            implementation(projects.extraDependencyModules.iyvkdfxmmfptctjjejmdymldxxnrpzoecomfulmzvjblgwuhwaqfzayjqicybblylonwtnnukwqjcibgyqlnqkpafompvdpvhdkz)
            implementation(projects.extraDependencyModules.vpoawjvdpsreysfabvzfurohomwkmkdllkrpakaqwrnbrgaiilbymrvavojtvbhxnikrdhhmpbacdghpblymlryrcoxoacprnyea)
            implementation(projects.extraDependencyModules.ndgnzzqylppjrmzcrbjayebkddtpgorinsrlotnrzvousgusiggbqvknkrqtfqfftzzsyiymdpyglzjutnffpsogzrfolazttufl)
            implementation(projects.extraDependencyModules.jonxzmsemzdbwhrdzivnsbhcypqqwzxkurnyarmydzaqsgggnavfndjzjalfnhphvcquwfytycgnvvywjmqcloemoswghdolrdcx)
            implementation(projects.extraDependencyModules.gaxdutnepavawbarofcxnysjbjmuelaoqbjvkbaadmwcfqzpgkrccfavjzaexgrfnkhizknxvlkdmpmawfvoevqicptalyehtuxr)
            implementation(projects.extraDependencyModules.vcskknqrevxvngifhdakhhydbttdkmhhiukrbiqaipwnaeaamaipmbhakzngwxdqenhlsqqvbfnuckngaekchhjvfssbnkxwaoiw)
            implementation(projects.extraDependencyModules.oxosiidxrcepneqrjqmxrvdzvffdytvwreozeyhkpfumkijacpttclwgodgdthjqdayexsfffngsavxkkmiblyfxizhdgmoxkwnq)
            implementation(projects.extraDependencyModules.rnaltjtvngfsprmedyhvfdplgnkujueftogjztxujchcgsduxxrkaurilsfxzbccxfmgdbxjjmanqfxpfuduifnqnzaogtscaysw)
            implementation(projects.extraDependencyModules.rvzrqkffcxadtdjcxadeawyetwgxwwxvyqycycweuargcflinuqnjmylxlrgooabjfykrafpulthphcvldolsativxdrkhrqniqf)
            implementation(projects.extraDependencyModules.wmnvlvscokhwblhquiuczlrbdwybgsflnpbvmjhvoalswompfdfhhuhzyhshzyvlpfqyncdzdbglxsmyckqrpxefijsijgcagizt)
            implementation(projects.extraDependencyModules.aelsljueeudlnfmqciifshtthwssafwlhqhhzmqrdnrawiporbhjehupplcrhcqolhmzlnuodxspszhcjdafxlewsdwftznfuzzh)
            implementation(projects.extraDependencyModules.zvyhbcqgiecciorgaepzfpfsmknfdztjfgmrfmhparusjwpnwufvramfxsfpoqzuaszbbnewaelippktzlwwsdeghlfoxbqfumpj)
            implementation(projects.extraDependencyModules.tvfispqrmghaxzsnzewjrcqyzpuczoxbcriazlchasxhflxhdcmmbddluaqlrcwqlnmfcmikzvjptawxfzpdijetvjnfnraeotjt)
            implementation(projects.extraDependencyModules.muugxneauivbctcdwnildstmsxxhgwcvurioxakpaaatdzkxoqjyxvdkxxwabfbslriarosobkhqtjfxrhunibyzyguxipmhyjri)
            implementation(projects.extraDependencyModules.sswrdkvqmmncttpodwoegeecpwsdvwmtbylocyfwasraeawucftalmuvqfxuldxxhilqlczdjqmmecfauuypqlcvbefkwpnyrqws)
            implementation(projects.extraDependencyModules.nijsbhilrbsckzxzcvtsqwjzhjlvoteetbzuhfzyhbtvtifdgfczhhbszueuzbnbzaviynejylrthftxyhaqxusbqimhryxsxsoz)
            implementation(projects.extraDependencyModules.vydonyrejhznvqkvjjkaswybnvajaahgvmxnpuoikazwzlmgpxypsvmqovkjnewqqhyiisprepjsqpvkzdrlprfvpokngjapthso)
            implementation(projects.extraDependencyModules.pwnyqonfmgytdsheempjwrjmsvfpdlwbfkskypovipiivxdmwzmxmcruhzlbnwndhovdgdvfhvbxsfiztdwtqpjkkfbgltsoouom)
            implementation(projects.extraDependencyModules.vjhairvjmgastgtmyrqtjsvwajjnkxmqewdqggmpntmyliudkgbmdxszwzesqttvtzmngaljwwvqqiaqibvxemfkvskjqzuukfks)
            implementation(projects.extraDependencyModules.zsixhpkblduhxfwuyqvkldimumfpqjpdqmzqaxakxpcsyjpeebyfgkfqmwvvanxgpicafdkzicogmzhlvnmwrjuxmipzmhdfvgkg)
            implementation(projects.extraDependencyModules.vessmpwvztcplpvdignceaxcslxdhvzvxijnhiaedfdgtvqmzscgvnrdhfdvzjkabqsidrjsgeoqdnvaslckzpcmqscsppzbkpfc)
            implementation(projects.extraDependencyModules.gomhspsdmcozxtlawzbbinkpulengnjeecvedhrwhkkygghbxsnojoqkudheaqtzjrvyqqkwbbiwlngvmzpltysmqlaixkpypgsa)
            implementation(projects.extraDependencyModules.mahfkhkgroesrcbauxfogncivcvavmajhkbehdmfifopzvdqgndkkzsxssnubzxkfjgzwbquvxpglatzbdjihiomrdfzccjwaolh)
            implementation(projects.extraDependencyModules.jkyzvzrlatdowymfujulgjzmfntuljeqwztgarjuaydinlkgxlqdyligsuwifeqrophovwaoxhxudensnyryxfyqrhmsybeogltf)
            implementation(projects.extraDependencyModules.ievfkzchubunmbooptezabgigjsglansaxkcncjcwjzugfzkdrbwofjvzytzjpplajjeclzlavotutxaxinuiazmdzxzypvvqdfz)
            implementation(projects.extraDependencyModules.tediylqcscmkjeiviyqwdtzgooykvwfcyrbdisimkexvdpywtguumgftthtrhwflubnlbymzqfgzvfmtsyinquegagvlhzblhiuv)
            implementation(projects.extraDependencyModules.pxawayececwidjrnqvoymhdppemxzuoeasmwafwtguogwzmiejnhlvkpksnfmbttwdmdnhhstxlcjkjpijdoubpqjdkixxhuciuy)
            implementation(projects.extraDependencyModules.abeojzcvwanresrsxkkoddxsgaabjgqcqgyxzrtydifayyxyfvogbldocikohegebejovwhftyqfacogylongpinhvbcjepoaxwr)
            implementation(projects.extraDependencyModules.rfgktygeeflkxpzaxffcowboynrsuwkdapeerlwqytvqpddpmfyctcxczovfxnwepmwphcowpwrlsoqasbxaegilthxggqtsqrrn)
            implementation(projects.extraDependencyModules.ftuxaghfvvhsmhpzphyjmvzvtdnfsagrahigtxjdcnsnkxdrllujnoaxsyueslfzfhlrdfpyhuglfwzqivziomgvhfhipzophkti)
            implementation(projects.extraDependencyModules.xbldxwatpibckfdcgelnajmeqtvqpksjjryynjycpsvnvjriglyfivnsyviqecvnopxyksfcvqelukkulrbwoqvzsvhdkjzvzhnl)
            implementation(projects.extraDependencyModules.fzfphmxxdwjwvdkstadehdyayhiceqonntolhgedjksuhjpgjyonrymukonxtpzdunarjwruhlieeatdvzdviuyouvacosnkrjpa)
            implementation(projects.extraDependencyModules.huewyeorirbuovnpjpmytuezmzuxweczpzhydqblkhwbrnefhgbxemtqyrjwkccazmdmcatuorbzkkyhtpjaowyiohixzgcxzabz)
            implementation(projects.extraDependencyModules.ybknhpplurhtmucgfkanofjgnlfbtdtbyowqtiloxzsweviptahpjwnuwgxgoltpwhlfuylsweuehhqfhsavgvvhdfoyetlihxcx)
            implementation(projects.extraDependencyModules.tjbduotthivaqotzbandhvkscfvynvqvidzrdrhqrbbijuihtjykeqpmdnmcmnnvhkjdrfheiipsyqadhuajwqtntdjlgvllxcsc)
            implementation(projects.extraDependencyModules.ckqpuzbhlejnrzoqonndqntyangpcestxceitqaoqmcdxwwmsaijmqsdfyntilkphakfoiahmlrdxzlzxcnnonknwwmbbdeuufzx)
            implementation(projects.extraDependencyModules.bpvdukjtombrywejakwnhyokdtlibikfoyfmtexapfwpzpjckmcnltnyqlbuqwhvjrwpjvqpfiwylxzdzvlthebqzmdvywkptala)
            implementation(projects.extraDependencyModules.jotzgqzkycwfgfmvrdlnyofswjxaiavdozglfbbkjcofpokehdqjfngkgaonrjzaneqquvvajircuaavswofaflahcjzurxvysvh)
            implementation(projects.extraDependencyModules.jzpecbsmpmcpsbsrsskgttphyxkuvzxmkgrczmeffviqmxykopemhyaxdqyghaglkwzpdslbnvqfhtotpdbswjbtpkdljzwcvilv)
            implementation(projects.extraDependencyModules.vlljpbsdjqkgzjbtiyiibrekctqkwvxxpjpdhmwpgqadlsnqgpvtsjcoueqmevrndwbcjsescdvehxjjssrlsqffagjgfznpgmbw)
            implementation(projects.extraDependencyModules.krbwdjrjyqpdkqfokptnsctpgozodfczptwoqiqfeboxozdljkzkjbgsjmxpvdsyafkynkulatoopdasstcriumenumngsghckhs)
            implementation(projects.extraDependencyModules.eghorffxnfzveocchqabuowqddgjdegbjyanqmfjlcumoxwqxxjboaavlsdlrhigxmlzbnlgflgouxuqphbquammruapqvevfeho)
            implementation(projects.extraDependencyModules.xyrvuodfpywzrgxahhweitkjakakofkpbdxvqstbtbrsymyahaymwwgpzcvoexioxbmnepyuufhglltovplaorgbvjmfmyjzdeyx)
            implementation(projects.extraDependencyModules.kqkluzrbzvqruicmoiaqiinsyphtjqlvjzxprwzomzjcxbfgluoohqosmozwaybpxfffxlawqmmypjrgtggyxlqdkjzouhtuuzwk)
            implementation(projects.extraDependencyModules.gqqwxfhtrfepnjoohsnpmrjgycfvkzexodoezioykovzjpnmqtvwpwtvxbsxcscdvkyqokypfwkmgfngaozngvslrvzyknmfmssn)
            implementation(projects.extraDependencyModules.whsrllpfdnvbqvwvjxtqmxbaugxinfmlaagmzpcjkuawqbfukvjjhiwmsxcbbwtfsvzcfmeopldpzcjpouzptrjhvztdurjsncbq)
            implementation(projects.extraDependencyModules.gelmqvgoxltfdmkioglzjrrqfmhfjezknfoacxxwqhpqnchllksgxzqcxutxiwxgwsxdkaqwilujtdjxosnlpgsbuuilyhdxhpag)
            implementation(projects.extraDependencyModules.amcdhsooeeuweobcgvqeqealemuafumozpkcgvlfafwtjtdjnxkqzwiosqtwepngbggimwgchhkzhghzwghuejtjmocxywdsekrn)
            implementation(projects.extraDependencyModules.frtleiulbdmglhmvgphxrftromtugbhfjsqgannwyginbgdgsjlzkxxuhdtpciyverdccckosheqcwjatbvixtarwobmkzjoxamn)
            implementation(projects.extraDependencyModules.ejbvumnpirfwwabfrpaoahvwgqyynzfqciqrsxodslkfopczjawumvejmqnseiirweiwgrvjxmlptqufcoarjfkmwumjrqbetysp)
            implementation(projects.extraDependencyModules.eahkgbndsvtgpxgeqybfewxalqzkdjrogyfmzmzwfqywbbfxvvivheyasukufgnkdkjghjzhlvgopwmxfobifxobtkbyekhaqhtm)
            implementation(projects.extraDependencyModules.zcrvptmxwcebybjidxevlhqsbernfctahxxbinbjccsokmmhbxgvhrnqxotjlbrhibflpjgytofqfhkczjxyhjktmuyqpbjybgpp)
            implementation(projects.extraDependencyModules.sarszdjggafymqipdaparkqlygdogotngxqaxsqmorfdghqprzgistbgxhwjkddhflennfxxqjxamqafmnvujigpcaspittzkjps)
            implementation(projects.extraDependencyModules.oyjqztzingxgirdefrvhtplthudvataffnocsndhvcqylchqhnvkjcdbtubramgkhcaqucxautozyhdosvxomzgacdeokxgglzjg)
            implementation(projects.extraDependencyModules.vuuuskluurggczxdsdvtprsvjwpjjkhxuwhadbkyhynpmuyncehjpexoqrtgxowqxivoyacnychnrvvcuuekytzuludgnqkiuwgv)
            implementation(projects.extraDependencyModules.sfjqubpeksgzctisvxzspiciyruckjflfnsedjcachhruuqagwplyrvfqpbravdpgbfcaxvmvsbumimnaiwqcakdlrdoahqbfhfz)
            implementation(projects.extraDependencyModules.twyigyjdbcbeojluoonbdlgobdidwygnbwfdliumfwruoqngdrhjmzbxjjctxcejfmvrhsmgkuwmfqfrkzzqtvehvyuviqessvwc)
            implementation(projects.extraDependencyModules.soxoylbjdpysmyoojmktcevoehppafstihebztoiefmiybabovgemvgioslwlvhubhtfmphowygoatrpktxkjjhajjgtanlajlcs)
            implementation(projects.extraDependencyModules.oewabllwbdvdqqpuohdefygzgyadsygmzelgskzsshrchloefwoadnpusovbzybodertujvzxrqeoygosbitpshfkukyjhddndzs)
            implementation(projects.extraDependencyModules.hmuaagygpvoefjlofwsmortstmajdnqtbedvmzsrkgqkzyqywlxvfgvfxddwkoutnudssrfivgldfcrxgcjexirulivrryolkdhr)
            implementation(projects.extraDependencyModules.nbsquuguasunqiuagzhofjugjsybfdqvghjkdpesnprzfrlgpujayudvohfjijekhauzinsxahscxhallxzhbjilyumqsjkagouz)
            implementation(projects.extraDependencyModules.zqsmwlfvxfupaphipdkqzznyfcrzsbrqkooktwjxlggbvvgsjbkwhfiupyxjrhezwpegjfjddjzfeeinpwlkpghyvtikcxszdesi)
            implementation(projects.extraDependencyModules.ffvcvtfkvqploobibcuwtfyntpmnqnnqgjfwuhkzumkuyamfnzlbkjddnondzlsbxtrzuoulwhicjgneyozkcvkzmmmipreexblk)
        }

    }
}

android {
    namespace = "com.example.argumentstoolong"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}