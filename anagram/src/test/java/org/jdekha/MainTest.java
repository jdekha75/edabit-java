package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test01() {
        assertArrayEquals(new int[] {0, 6}, Main.findAnagrams("cbaebabacd", "abc"));
    }

    @Test
    public void test02() {
        assertArrayEquals(new int[] {0, 1, 2}, Main.findAnagrams("abab", "ab"));
    }

    @Test
    public void test03() {
        assertArrayEquals(new int[] {1, 12, 22, 31, 41}, Main.findAnagrams("ddkkevvklcyhkvkekvdxdykkvdkevqmkevdkvkfdlvdvkkekjzx", "kdkkvev"));
    }

    @Test
    public void test04() {
        assertArrayEquals(new int[] {1, 14, 27, 39, 51, 62, 73}, Main.findAnagrams("hqqnfwrrfwneacrnnfwwfqqrfggrrwnqnfwfqpownnwqfqfrrufnwqnrffrqwwfrnwqnwqfrcnwrwfrqqfnqaq", "fnqfrwqnwr"));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[] {2, 9, 18, 25, 33, 40, 47, 55, 64, 73, 82, 89, 97, 106, 115, 123}, Main.findAnagrams("kaayvaymcyvaamyrrjvayyamryayvamajvyaamywyaamvywyayavmaxvymayalwfayvmyapusyaavmyfxiayyamvhyavmayblaamyvydblayvyamkbpyavaympqaavymyfmy", "vayamy"));
    }

    @Test
    public void test06() {
        assertArrayEquals(new int[] {2, 23, 43, 58, 78, 94, 109, 110, 125, 145, 160, 176, 196}, Main.findAnagrams("nvelaevqtjtlajtcvuzmdkejvjeqeatltlatbmtmnjutqlaelattjvjebxtaalttvqjljeepcpllomvjeltelaatqtjckwtatlvajtleqjelwjevlqttaejaltjqraqjtjvaltteleltozktoetatjalvejltqmoqlvetaajjttlelnoattetvleajlqjgtjzvxptvlqjtataleejvxsoylu", "lvtjaltqaeejt"));
    }

    @Test
    public void test07() {
        assertArrayEquals(new int[] {2, 28, 50, 72, 100, 126, 151, 176, 203, 228, 255, 256, 280, 306, 330, 353, 378, 405, 431, 432, 433, 451, 453, 478, 506, 530, 531, 555, 582, 606, 634, 660, 688, 710, 711, 739, 766, 767, 795}, Main.findAnagrams("htycttyynhjnuyyhzypgcbuqldjfpynttcyybuhcjghyynyzuybutgtyuzhypccjyynnyyhvyyujpchgnctuyytzhybynvxudxkfyuzhtycycnytpgybjuynhrhexgnytutyycznyyupcbghhjypulmytucyhnpztnycgyyujbyhaohpjphyztncythyuyuygybcnqftpwxtnubguhpyycycyhzjyytnxxxpyhctupuyynybchyngtyjzauvcsfhtyyhypzucnytybycgunjhjrvyucyygytzpnuchbtyjyhnskaznugubyttnyznycjyyhpyhcafrcypttznycubyyunhjgyyhqlhypnnuyctzuhyyjytygbcbzexhbjcnupnyyzyytcyhgytuqcgngqhjbyuygcynpyyzhnttucypsauahbtytjyynhupucycgyznyhbyzcnytnugpuhycyytjhyrmvmhthyuyyzjyuyygpnccbntrmbduxgbygnhyyyntpzycytuhjucwbryuhycbyyzhctyujptngynyqguchhypuyuybzntyjytycgnzdyxsqtyczhypunujgbhtyyycnyyhqzytucyphncybtugyjhynyaaloycoucybynyuyjntyhypcgzhtllpcoyutcbnjyyyhyunzphtygcpqcbdmpnuczbyjythcngputyhyyyyyynhhbccygtutnzyupyyjyzsmvcdmnngyyyytyuhpccjuyhzbttximpvybtyuzyjnctcnyyhpguyhymkbqssgjhucynutytgpybnyyzcyhadfucja", "hbyntpyycutucgnhyjyyz"));
    }

    @Test
    public void test08() {
        assertArrayEquals(new int[] {10, 38, 76, 107, 141, 178, 212, 248, 283, 311, 339, 369, 402, 434, 471, 504, 536, 537, 574, 603, 604, 635, 664, 695, 726, 756, 790, 826, 862, 900, 930, 958, 990, 1028, 1062, 1098, 1131, 1162, 1192, 1224, 1225, 1253, 1255, 1292, 1323, 1354, 1382, 1418, 1455, 1485, 1517, 1555, 1588, 1623, 1624, 1656, 1692, 1693, 1723, 1759, 1760, 1797, 1826, 1856, 1887, 1918, 1950, 1978, 2014, 2043, 2074, 2102}, Main.findAnagrams("zoagxzcczouuejbncyyvflpzgapqcayuflrbrpfjuzualrguacvqnpypeyrfblybcblnidzfjxbrrpjlfubyypcbavflqnrecugyzaufrjvurugryepljubqzfcvfaalybpcnywlijdvmcbcfgyljuzrunlbfaqpveyuyparzenkwvzuzifcylbyyucrabfurzqpvgaeljupnnjupixlgbfuecbrylpyqujvalpcaurfnzyrvpiqtbqmlcfarjvbyerpuynyqlazpugbcfuyfqwugldgbvyzunyclrapjpbrueyluffcqafqcyfbllbpzuuyvruapfgrnyjacemurvpfbburcglalqyjayucznfeypaqxpyjrpncufqzuyagaubebrvclylfjwjvosqbypanyccbrvrpuylgzelfufuajssqhpecpjyulgvpylabqzrabfuynufrcxfrhnmesemflbargrpqlabnypzujufccyeuyvqzfcxdvfyaplrqgubpfzebjyrlcauyuncweeooqfnfbparcpblyvgeuurzjuyayclqaivyljndadpqjcbzrnuapceyauyrfgbuylvlfwapjbrvyanucuuelqylzpgcyaffbrpmeospylujcuyaenuzbqlfgrfprvacybtluzueycafppbvyfqgbnljrulayrckkrvaqcrfgyylynvfcuurjbapblepzubbgmefyqbnjcpuvyalbylrgurpuzcafibiveqyrbugubnjrfpapzyufclaclyruipiyoubrzquelncfyfjayagpbpylvcuribewdnolhqufcaaugrjulynpypzcreblvybffnifoxqmopyyarrubfcvllqgfpyubaeuzcjnvxaztpdfzaxncqbcberllyuypgufzajravfupyplqygrcryynlfaauuejubfbpqcplvznlrpzcyaugpfevjcfubnrbuylaqyphcobypbayzvuprarglebfyufcjcuqnlgqcxabwvelsyugyefpnrbupycuarvclzfjqlbahecnlkxyjcbgleuafzavppyuqlcfrrnbuyfqieqadcnyrjquyacyfglnafvbcpzrupulebpjjnetrubynrlappeygajcqfyvfcbluuzmpoxlzrgubaprabyjfynueyfpvuqlccpsxrypbfqyjzupvclabuulenyrfgacnlknhravlybuqujppcylafycbzgunrferecugpbnfabqcrzuruyflvaejpyyluchuycahkorycbfapgunarbjfyzceurvpuyllyqjyxdaeurylzgcqjbcaypyvurnlfufpbxsrbnfpjburugaybacyycqfpulvrzelpjlbbfeyyrpuczauarqlfpnyguvcmladenijhguffrabrzbyyncjqluyaclvupepxkwwhbitutcnruaubvyjlyrqacpfuygbefpzlmemvgeupafcbnupylczqyuabrfyrljifiudrlyuljauyzpcarbyefvnqgpfubcnhxhqxsymjylzcgepafrbnyvuyuajbuqcfyrlpfgcayfzacujrqlpvpfbuyylnyegrabfcukpnhrntavbabcyuqfypuacrzrylgjnlfupevkbhydylpguzlenvuycbayujfqfacrbpruokvgplzdpgyefzarlbyunypucruqcjavflbpmbmjuebulaurzvbfaryycnqylgcppflshcdjarcfpylejnlgpvzquabuyycafrrucbfdymjvwaxzlrcjlczyuyabapbneuvrfgqpyulffblvqjygbcpepnfuyfaucbyzrrluaaihbcjgcuyupafzlrbpynfqylveaurxkpbccbupzljyvryurfglabfnaquepyzhyoyglnqzuelbayfrbcpujyrcupvfawtzqevygulnfzcfcrubplrqajebuyaypkrfrlcjyafupzbacpubnuelgyvqywjxavirgdafauppcubgvyryjlryenuclbfzqmlbycvqubayjuaruclpffnzgplreywvgnuacrqepvblrapcfuunyzgjfyyblsjfevnfulapyyqbypburcrczluagps", "uuaqrvcrybybpfapnelgyljzfuc"));
    }

    @Test
    public void test09() {
        assertArrayEquals(new int[] {1, 67, 126, 186, 245, 307, 367, 438, 499, 567, 626, 687, 748, 809, 869, 936, 1004, 1070, 1142, 1203, 1271, 1340, 1412, 1478, 1538, 1539, 1609, 1670, 1733, 1791, 1854, 1914, 1977, 2043, 2109, 2180, 2242, 2304, 2373, 2433, 2495, 2558, 2618, 2679, 2742, 2809, 2878, 2937, 3008, 3070, 3136, 3137, 3206, 3270, 3271, 3331, 3393, 3456, 3528, 3586, 3587, 3649, 3710, 3773, 3833, 3898, 3968, 4029, 4093, 4164, 4235, 4297, 4356, 4426, 4490, 4550, 4618, 4681, 4745, 4746, 4803, 4875, 4945, 4946, 4947, 5012, 5013, 5014, 5082, 5144, 5213, 5278, 5331, 5332, 5333, 5334, 5336, 5399, 5465, 5537, 5605, 5670, 5733, 5799, 5857, 5920, 5992, 6057, 6119, 6178, 6246, 6247, 6319, 6384, 6442, 6512, 6583, 6645, 6716, 6717, 6784, 6785, 6849, 6919, 6977, 7047, 7109, 7180, 7240, 7312, 7374, 7434, 7504, 7570, 7631, 7690, 7752, 7822, 7886, 7956, 8019, 8089, 8160, 8219}, Main.findAnagrams("sfduqyxfexdtfxdlxxkvfvdjjoqvwxkhlzyxxjchsxcbzfzxvvxszzblzzrenoafehlxvzckzlbdxxwexdodhfxtvxvzxjksdzqubflzzxlsjfxxfxcfvzvjhyqyoycvkqojhfbyxvzvxzsljdlzxxxjvzfksdxhdxxyuxvfzcdwbfzqxztfxlexrkbluzedhjoxlyxxddswxffxkqfxvfzxzzsvbvjtzyklczcdfzjxhxxxvqvnmkfjvvhxyzflxcfvvqvuwxxldxfdxdyexzjkxzzzqhofjcsbtsxbzxdzxlwirlwddxyjqvlxvoxvqlczdjzssxekldfbwzxxufcxfjzhzxbfxvzvkhzxtfyxqqjhfzyjxfxvxdlxxsvksvdlczxxdfzxyzhxzkbjlfdtjqqzubcoezvxvfxwrelaietfmgurhjxfdzwqfbjzdxvcxxslxvzjxvuoxhzclyzexzkqvltdhbvjxzsfxfdxyfkvikkjxjxjveydlbuvfvxzdkfxlxdxzfsvozwzkxzcvqzxlycxfxhthqzfsdxbhzybkoydlvjjzqxoxxzbckhufstbzjqvjxwfxddxzlvxkfzxxsfcxlfvhyvyvdzexdlzfxxlhzsxyzqzljuecwovfddzqxzhvxffsxcjvvxfxxzxbtdlvzfjbykxxdkffyylqzdhxxxvzcjtzxzzffbdsxxyzwkvkyxlvvjxuojhexzcvdfbxfqfsdlxeemtxcbxlkzzfzsjvofxxxdejwvkfzxdcyytxqbzzzhdxxlxdvvvlsqfjxufhkllpjjvexdzxzlvjzfyvfbkwzqxclbhyfqxxxftukxsxfoszxvzdlczvxddxhxmbkfvzxddqhbfxsxyjjjzlldxqdclfxxuxcywfzzvozxxxsbefkhvzxtvvzacsxlucbjzszzdvkzfxtcyylqzzxqhbfxjbxdfkxdvxzjcxjvzvfxeldwvxlfuoxxhsarugtgaomvzcuzseqhtflxxdxzjxfkhxcfskqdvvbfdxzzdowzybvxxxzzvxlvlyjxfjkjassboosxjzkfbxyxvjozddzzexvxhcwvkcudfxxqzzfslvyxllzhtxffjvbxsxqdmlffqlpvmsgokjtozldqexxhsbcjxxxzuxxfyzvxkdjkzvfszqdvxflhvfzftbzwdlxxjvycnnzofhyxbcxuzdxsvlxxzzjodxslqkvzcyzhvdkfdzfjetjvxlwxqxzxbfxfvrbyhsyhwgcidfbjezfszujvlkxolcfsfxhxdzxjlzxzvxzkxdxvxqyyhvfczxqwdtbvxkiwgwpfhyoxlvqvzxhvflzxsxkcsxfzjvwzxezxovyxyfzfxtdcjfbxudkxqdzbhxljldifycsiqxnxamkofzbxddqfljyvkfxuxcxbzlcxehxxsxxvsvfzdhvzkfzqfwxjzzoldvxjtytqkejlapbvkyxjxkzjxdbvtszxqfqlxylhzxxxfcvswuvzfxvdbddcfhzjzzfxexlopcfvohjqxsxvzkyvfllzfqjcuywbzzfxfxtxdbxxzvfsxxhjcekvldxddxzzvutfdnuzyabqkdlxkfstzhwxfdxdxfyzfeuzvzvzxjzdxxlvqjcqzxfdxshlcjybvxxkovbmmruxvvwxxdfqxxvsffezocbjvxyzqxkzxyzlzvlhfxsdxcfdbjzdltkuhxzjebdfjcxxqdqclxbfteuxvhlwvsfzyxvjfyxxfzclxhzjzbzxkdjvxfdoxvzkdzsqoduxkvqxxzxezdlyjhlvzxffbdqzbclhdyvsfvjxjfsvxzxwxkfxtzxzcggijovdbtbzdcxfvxlxxfkvxzvjfkhxjuzcsfqlyzsxqdehvlxzxfyxxvjowdzzmmpjlfblfvlzqsxxzhtdwuzjvzdhjfxvxffvxkxzzyyxkcqxexzxcdodsxvbpbfqivzdjkvfvqhlcvywvlyfzcfxxvedzfxxlxxqbxuodxksthxzzdzfjjxzbsxksydwqnjixddvvwejhxfjlsfkfzyfblxdxxzcxzczxuxvkdvbqxzhqlzfxxysovjztsbniipfykxxzfdvxfxxjfjsdlkdqxzvxfzzzvwckocyxfhdblsxhxlxbtzjeuzvyqvlrfpbjbisxpgeksxdxfjkcxzdxcedvjdfxfzhqbllxzzyfuolxbvvtxjvwkfzxhszxyzvxqqcyvrkexvzdxxvcloftffvxyzszzjzxxfdlhjxjvbvwzfxsybdzqcdxukxhlxqhjucdzdsxxdhxvbxxbfzoyztdfcfxldxzhevzkvqxlxywxjkfvlzqcjzjxsfvuygyzrnpwyauhzdvzvvcovcsdqjxfxxvykyxzzxbxzlzqwbdfdljetujfxhhxlxxkszxfffsnczzzjdwdxlkbtqzldjxjfxofkxxyzxvxzzvefscdyflsxhxqvbxfvxhuvuvbpdlbjffzuhxwxxvzjvdflyjecztxdvyxfddkxsvokxzcfzqzxzxslqxbhvxaznrotvzfzkstxdjfdxxybblhxfzszdcxzkqvxfhweuxdxjzjlvxcxxofvvqlyzhigxxbvcvxjyzlzbzxvxkwqxujsezfzlvxxdxlfsqtohfyzkzfdjxcxvfdhdwvemzkhlxdvxuzhlxvdbvzjyxtvbzxyxfckqjfjfxdxdxqwffxzexvzosszclanqpgkcxllxvyqzdxufxzjkxhwzkvfflsdyqczfozesxvxtbxxhjvdzdfbjvxxzfnskfnyjbtvjflxdczxecxwxfzdkzxjfqdxlulzhbztyxfqhvjykzxovvsxzxfvxsbdfrtptyogrlwvxfbyzdxzfxuvoxbddvtckhxxjxlzxlsjdfvxzyfqcxxewzqvvzszkljhfthhhftljzxdxvkfelsdxxxzuofqvxbxbxzkvfsfwljdqvyzxvzdxzycxjzcmyxenrllpdjjljefzxcvvlyhczffxbxkfzzzldlbkxzxojyxjqwfqxdxvvdhtuxxsdvsjxzzojuxdfxcxzqvkzbxfzolqdxxyxtyexvzfudvxshvzchdbwxffxjljzjxvlzksjpzlijegyvckvlljtxxzxufzzxvxxlsxcvzqzyhsbkjzwhbdzfdfydxxfxxdejvqofvdbhsknrcmyfksudfxevvzxhhbzxkwzflxkyjzxdlxoxjycvqsqxzcdxfvdzfxjbvxtfzlgxbmlgzzsjfzvxbczufqxfhxzzxqvfvldxtvydljdwbxdxkxjxyxhsvofzzkxcelztdjjxxvxzfdxcskjxtzzqqhbklyxlvldzzvsfxxyzffchxuzbdejxwdxvvfogcxpkzfxkzqfjuslvzwxfxfjdvxxvzdlxxedztzvvxxdzofxhcbsyklyxhbjqcsvfhhevlezozxyxbtkzcfhxlwjbqvxdkfxfzuvjylqxvsddvxfczxszxjdxzfhxswhhatowuxxlwakxzvxkqslxkjfxfsxbxzvofdbzxhyzvqlefxjddjxzzcxwxtcvhudflvyzjlbsxyvzloxhfdjzxfxlkyxzjvbjqxcvftfhvxxudxzzxvfzdkcdezxqwslekpqtwlyqzezlzvhhvzjjbcbyfftxdqxkoczxxxxsxdlfudvxxfvsxzxzdkfvjqegmsxcwxyehbxklhzvvqfvfxxdzzojxqvdykufjlxzvxzflbxdxcxztfszjdjzlzlmyzvdvhvwjxqxbjzfxsxofdxdvxvfzhzlflzxxfkebycktjluzqcdxzxsxdcwcvfdxxfdxlvvsbvskqlozlfwxydzxezyxxdxucqvxjkjfhzfxhztzjxbzkyxyogkjxddkvxszzzxejxfwlyxvxdfxzyxlbtkvzhozcdlcqhvxqzbfujxsvfjfxjmzvsbckxxubxxxxhxlfjvxkzvwzhxlxbqyjxvfzzxxzzdveclfdxbdfujksofsztdycqvyjqvxzywvsxffjqdcxezllvxdvlxkzuzczjoxxykzqvjsxffdbxvfhxxdbzthnzvtoyyhfvzvxxefffxxbydvuzsqoxfxvjtwxcjkjkxdzzlylzzdlqzchxvbsxdxssunpkxhkqitkgzjdllbfzxdfkqxjxtbfzxyfxwvsxzxxcylzvzuzvxsdxhqvckoevfhjdxyjfxejsxzfsxztzlvxczsbdxxuvdzqkxxfzfxzxlkfxdxsefvczwxhoyvzhftldjqjyjbvxjkosmxzzlftsjzvkfsuvblxzvdxjxjxhkydzvdfqbxzchcowvxdxfexxyxzqlffgxxzjqvlvleufkyzxzhsxydfbjqfxddxzkxxxjczfvxthcszzdvoflxbwvjgplvrpfupssvhxdkfbjykylxlxxxdfdxjvxsvfvdhqszvxebqftoxjcxzzzfwzcvzuzlxwncjscovcxxdxysxcldkhvdtoqxzkbzbjxjlxyhxuwfjxxzfzfvfvfzzvsdxeqlzpjkxhxlswxkzddhzqbxkdflqxfduojfyjvxvcxzbjfflcxxsxezzzvyvzxvtlrbuqmwnlzadhvzkffcfxbdvzzsujldkyxljzsfxxzxqjloxqtfxzvvxvcwxxxbhzdeypmrbeksqxbjvsfkxlvfxjxxczclyxxxddzzxlvvfbeodxzkztfqhwuzfyhjvdxzwnefcchhdxxqzfyefklvxqfzzxuzzxvhxzlxvyvfzjkxxtdsbjoxlfjwdvbdxscchvxxfxjxfzxxsxxtxfldzczbfxlhfekcvvwdjzzyokyvjhslqvzduqxzbdfdacswysuaiszwrjoxyjdqexkbfczlzvxfqhxlfzkvhvtusxwydfdzzvfvxxsxcxzjldzxxbwepszsijkltroxxzddvjvfsdcjzxzzhvevkjfofbzqyxlfzbslhfxzxxxwqvxtlxxyucdkxxqwhpredpsbdzzxfjzxddtxwkxseoluxkvzxfzxcqyxvqvhlfhflyjzxfvbdxcvjxzsbgqgzadnqaqmqfhdxzbzvvdzjvxdlkxxvxzjxzbyzkysexfcxfxhlfvcdlsxxztfuqjwovzazivyzvqlvtusxksxdchzqzxxbzdxzexfhofzddwflxkxyxfbcjxzxjfvjlvlaldgntwbjspxdyzdhevxjxlzxsffqzzxkxjvxvftxwhcljfvuqzzcbxlxxzdyfvdobksgqqjxomybxxjwzdvxzzfvvvhtxdcoyflefyxdvskqczdkxqzsfxulbhlxxjjfxzzxhvwzbdxxjhqbljtxelfkdzcsxsdyvzvfzuoxfljcfvqxzxxfvykdxxzzhxcpntfrxdzzhylcxdfbfvxzxkbqxfezxjxlhdvjqfvyzxdvzzcvouftxlwskxjsxthufmvwdqqxzxzefhzxxuswzxscjjvbfkxzfzdxvdyblvxzfxqjylxxvkodtfcdvhlcustooyhsnxxvygxxjjyvfkxxsqxzvoklyzeufcbdxvxfchslhfvbxvqzjxfdltzxzxdzwdzwqzclxeuutclfxbzvkxhdlvovjldkxsshxxzcexyxuqzxxxbvfzzfxtwcjjzyddfzfqvwkokniafxhxvvzfexybdzdtxjxvfkzlqxbzcfzsxhjfojxlxxkzvzscwldxdyuqfvfxbxndjqhvxvzuxcffzfoxsxxweddtbxyldsvlxbvzcfdlzjfjzxkxqkvzyxxzhoytvyqjngkfxdxwbtzjxjyxxxxquqvzkjffyxzzvdfzvvzchxedlszxdosxlchblfvqvcddqvjohzxvxbflwyzdqdzzkyxzxkxxxzfjszecxhjflxvxfvlxstbufhpuzioqyzxscbxvlxxffdzfzvjbkxxxdqfzhxotzeuxwzzdkldljxfvcjvsyhxvyjsmbnzeqgqrbbcxxlbczxfvfxzexqsxqdhzodlsuzydjzxzlfxyzvfcfvxxtwkvhbkxdjvjogpwepigvjczzljzffyfxkwbzdhuvxsoxdxqdxftlzbyhvxjflvkxezdxcxvzxsqxxtiloxczjjxvdkdjzfcvfzzdkvwxxxsdsbxuyfzxeohqxfxlvfzyqvxtzhlblxwlddkzosvfvxxlchbxzvdxqhuzsxqvyffxltfxjxdlbxfezvzjxywzxkczjcfgcymeqbchjzwysqyhkqhxjvfuvdxlzvxcxldzxsxxvxzxzbtxfcdzexvlzfofkjdfbjwjigotrfoweznibvzveufxodhhwkxjzjvzczfzydxlyxbdfbfxzxxqklxqvvxzfdtjxlxsschfrvkjrjbjfelwhvdvfxoqsxzzfdbcjzhzxfzdvyjvxszzxtcvlkfxxxqxxyxlkduoxxbflyohvscvdvxjykzjxxzxkzclxzvtbfxjqslvzzwxuhqxfefddzdfxaykbuywwyhvnpzjfljjkxzyduvdxxtcsdlxxvzfvfxbowdyzezhfzzfxhxcqqkbxsxlvxvqszwgbaoudjlvbxyyxsvxhzzzszdwzxzfxqkfxlvfkblchvfqdebxxlvzujvtjoxfxxddjcwmsqmlkzvxfxwzcxjjezohdqqdxxxzvfxxzulyxfhkfvvxlfdbzsxsvbjytdzcgygzfqxdtgnqoqjxbjxvlflqbzjzzczxwkfzxxfvkfsetzhvxzxyhyddvldoxxvudqxfxcsjfpdagszmnmtfzqzqsxzxhxjxyxxkxxzvxklfzldyewdfdjlcvofjdsxfcbzvzvbxhvutbzurqcnykzdzzdvqfvzxhxlvfxzcfjdxxjfxblxoexzusxvfldybwzxvxstjqhcksprgrlkgibdzqjvwxxvffxdbzscxzyqhsyqxbjvxvfuockztlzfxzhxljkvzzxddxdlfxeozxdzhfbbsxhtjqzzxfvoxdcevwkydqfkxclzsfxvxjjlxxlxvdxvzyufzenqvwwbfhvrchyfdecxjvzvctoyzdzkxzlxzvqszjbbkvzfvxjffxwxxxddfhlusxqhxlxqjljexbxsvhxzzvyxvxdkzfbcchkxlxvzoyfxdfjxflsjxzltexzwvqjdudzfqoseegmdguovpqlxbfvhclkfzzhjztzvfdxoxqvdcxlxzxxqdyexslvybdwxxfskzfvjzxujhtafvkfxxscvzbqffxhjxtydxxxzhyezlvdczwlxdjjlzqfbvxsxzdxuozvkhbnehticiokbnzdzqsfkjbxfxzjxlxxfclzwffvvzxzvkhxzodyjlxuvvbeshdxytxdzqxdcwbrfqzzytdxvbuxhjyvexzvxkdlldzxbjvxxszcfhofxdzxffwskczxqjvfqxlyyzyqvbzxhfksxxxlvfvbcxzljchdfvzkyfjdxfwzzuxslexqxjozvtzxdxddjwdvvoqlccegkuqllfzxoexxzsfdvxfvyxvzbdfvxzkfthjhlcjdxxdzxyqvxwzzjbscxmqsadkprxlzczxvydxzlzthevfxcxzfxxjyjbsvkqwxkbxsjfxzdxzfqvdfolvxhuddketyczxvxhxxxdecksvhflqyzjfzfxxukxdlzxqvdtjxdfbfzvzzsvxobwjlnpxvckfkzdezxxvzlybszjxxjvvldxxqsxfclhbyfdowdzxxxjvhqfzfzutmohwofsxzfbzcbkxhvlhxckzudzjlxdvxwvzzsoytfvjfxjdxdqyexvzxxlxqfejjreitrnbdhvywydzvhfxzvcqljxkqxeuxxxvhzxlzdjzslxoftcdfbdfkfjvvxzzsxbxtkpccycbzxvsyzxdxsufxlvlekfyjqjzhxcfbjfztvwfzdxzzxxhlxvvddxkxcqonxdblnrhhtzspzzqxvyxzvoxzjdzlzfxxhcswjzbuxfxfddqffkkbvxlhlxyevdxvctsxjibrkodxxfhkjlwtylzzxvxfdjzxbvqyfxcvufzxvbszzvxdxsdxekdfxzohjqlcjbuogwhrbppwejczqxvxvdlhqshwbdxdzzzxkjkxbcxfffvxlfxzvjzzvloextdfxxuyyscumpcvwvidoyhkkzdsxdvvqxjlftxxlouyfzxyvsdzfxlzcjqxckwzdzbfhfxxjvhevbzxxvfqvxxozzdzvdxqjkxlxbzzdlvfhfxcxxwskzvhxsfyzxuvfelxbcftdjjymkqixu", "hqffxczexvzbdxlzxoxuvxkjylvxvfktflhcxfvxqzzwxjbdszdzjyxsd"));
    }

    @Test
    public void test10() {
        assertArrayEquals(new int[] {9, 61, 99, 138, 188, 234, 281, 335, 388, 425, 426, 481, 530, 579, 617, 672, 720, 773, 825, 879, 921, 972, 973, 1026, 1027, 1075, 1115, 1155, 1203, 1248, 1291, 1330, 1368, 1424, 1463, 1507, 1560, 1612, 1657, 1704, 1749, 1796, 1840, 1888, 1938, 1977, 2030, 2084, 2136, 2187, 2232, 2274, 2328, 2367, 2415, 2453, 2496, 2546, 2592, 2646, 2686, 2726, 2781, 2830, 2885, 2941, 2942, 2996, 3048, 3093, 3140, 3141, 3192, 3231, 3270, 3308, 3362, 3410, 3459, 3460, 3507, 3551, 3607, 3660, 3700, 3739, 3788, 3838, 3890, 3945, 3991, 4037, 4080, 4128, 4177, 4223, 4264, 4305, 4348, 4391, 4444, 4487, 4527, 4579, 4626, 4672, 4728, 4781, 4831, 4884, 4924, 4961, 5010, 5056, 5095, 5139, 5181, 5226, 5268, 5312, 5353, 5404, 5444, 5489, 5530, 5577, 5630, 5685, 5733, 5783, 5839, 5880, 5919, 5957, 5998, 6045, 6092, 6135, 6177, 6228, 6283, 6323, 6378, 6425, 6466, 6522, 6573, 6618, 6667, 6711, 6761, 6798, 6846, 6899, 6953, 6995, 6996, 7050, 7092, 7093, 7144, 7200, 7255, 7303, 7358, 7407, 7458, 7503, 7551, 7594, 7644, 7687, 7740, 7779, 7829, 7870, 7925, 7978, 7979, 8021, 8074, 8126, 8180, 8226, 8279, 8323, 8363, 8404, 8445, 8501, 8551, 8588, 8638, 8683, 8736, 8790, 8791, 8832, 8887, 8935, 8974, 9024, 9065, 9114, 9155, 9209, 9251, 9305, 9306, 9357, 9411, 9449, 9488, 9530, 9570, 9619, 9673, 9723, 9775, 9824, 9864, 9912, 9960, 10001, 10039, 10088, 10089, 10138, 10190, 10246, 10294, 10346, 10392, 10433, 10434, 10485, 10539, 10590, 10632, 10671, 10715, 10716, 10769, 10825, 10880, 10881, 10922, 10978, 10979, 11032, 11086, 11129, 11185, 11231, 11283, 11325, 11380, 11426, 11479, 11520, 11565, 11619, 11664, 11714, 11770, 11814, 11852, 11895, 11947, 11998, 12054, 12100}, Main.findAnagrams("qcptfcwrngieviuryuvyystyfaqeumalmsaufrmqraufinzkbfjvvnspeqvhvuuygmivaaqqamtafiyfesevyyfrruusrilumndyumvyyyvsasarluimmrgtueeffuuaifiqrqackrariruqgeyielatvmvsfmmiaryayfuuyfuqusmbyxcuyrwtdaobutymamfrqrrayyeauevgsiuifusqivamyfuleeaverpswluymraleyrqfyuurfiumvsvateiyqsamiagfuydfgfuzuohummgeyafuqsrlmerfuyvyfivtaqaurausyiuigkngdkygmzhglwjugbeuavaifriayuayuemrifsrumymlqvqygusftvreoomvshpuvqvegeleivtygafsufryufmaaqmiqyermuiyruavsupuevqfuyragurufuqietmsayaislirmfmayvyuvymxtqcmtlyvtrunoqeifmtearasvmarvmruelyygfquuiiyfuyusqalcyjthpoaenfqytauyalmfueuveaiigmrisqffuruyqrvsamyltdrcrmgvugqqyurqtyaqsfiraiuuammmvyvirsylgueffuaemcuimgayevfyarleqrqfrsyvauumtufmayuiisqpxmbgfbeeuuenqkfkjrimuylavmraqasufyqusuyefuemrgfyvaitidmdxzhjzgwvyeiauavsauiyquifyvtsfqyerulymuramgrmfprxzpbwuyvqwpzvbluygyuflafaeumqqysiusfturramyiemvavirtuuehrgwykamdycgasruavutayreyfuuiqmrmuyqiismevygffaluhzfghlwyysepthiutyauiqaauruiqgtvuyermafulmmeyyiffssrvfvhnxtulvmtasmrerafmiyeasyyuqyuavigfufirquzaspuofvlwiieszuisqyaqaeuesalurymytrgfuvrvuamfyiifmumdesbtgkkxzezkmrcyeurrmylgfsmyraayqiivtumvufaqiufseuayynbibalrojaxsmqsmifvefarlgiruyyyayitrumuaauqfuvebixwruumyysramfftvaiyueiqlusviqeraufymganuisirfgraifvtuuamysefmmquiyuaulveyysqrapehddfwpoqkyfrsermuaiuuysurqvafgimulaateifymyvyqliyfdmvvfmvfqfriemauuaflerriyutgaaivyqmsysuyuxkprpkatyuumqgruayiufflqvfmsuarisyeeraiavymezugruuifyeaiiauvqmesrvauyfylytmrfumqasomrrymiiugmquuaifqtuyauerfaysvyvmaeslflqukvvpfvycarydkwbujyumteymryifqsvugiuruaemasyfuiarafvqltyuuimyvgumqlsavuafrqmretiyyifauyreufsayugcwjulagsuvsutmyfvyfeareuiyfraimamyrqluiquyptfbwlickuewioocrgmamqmfyaaiyraifurvueuissyluyqvfutewuvdhuzvxrdydiidafyaiammueraesygrfistmuvuvyqfiuuyqrlyutanratiuugrymquevuaaarfiufysymsvfrmiytilaeqpcevsqipdjryummstayfifilafruequesyyqgruivuvaramvddsqriyisrquretyufuaflemfismrmauiavuqayygyivzidmvcfgbqdquislrfamsaivreuaaufyqyiurfyymemvutgpyexsznrregqaiyauuavyymvqmruurfasmliusfifetyqcrosbscwaimymqrruyaiieirafmmfsfuueulusqtvaaygyvgrszuucknhzrrnmuqviarauuuiqfymsyyfvgrrfieaamtulesyeziuaiiqsftrsyvvagyeuyreuyuifmlarqufmamxkpyrvcdxassstwyumuffmquyyyaaaitmeuyrrgqrviisfseuvluacplmbeprsxnlhkzfwcrfyseiqmumfamvraguuiuityealfayrqsyvuweszxezklbhjxdbiyurageafuryyqyifuuitvemvifaussammlqrvzxrlfabzdyirxzuyrumrueffmyealvqquaauivmirsyfitsagycadsdlunntlvruueyiqyqauviyurismymafsffgemaurajavgpputayiqmlysusfrrafvamqryeeuuyiiuvfamgaaxcifcfxtpyyfimqcymurvveuuffiaeiasuayqfquyatyrmgrislmejbieauyuaftsyfegruqrymismuiflvmuvqyraaoynwxsvkbktvmaqarfemsuaytiuqvfrvsygyreiyafumluiurvemlyryqrfraiuiutuuvymvasgsueafymqiafcehbhsouvuytuagmqiyfqrvaysemyrailisrfefuaumayyvfjwledozvnmvuumqafmiyfruslaveifurireqytyygsaauroobcnchtnmmifrarfsvauyaylsauqvtferuuyeuiyiqmghipuevnhwckdgvazjliuaislaqyfuqmtimguuvmeesyafryvarufrycykzsgluqrmuuevyamfefariavyyurmusaiifytqtspjufrmertayuaqmumryvevaiaqusyifluyisfgvpybnnmhifqqnrlkyfuemmvsiqtgyuiyvyqayfeffrsluuarimaruuaqmzmnllneidksuyersilyurvamufiqaaufmtvyieaqmsrufgyorblefmtwhwqsarwebtvslfyymauiryfefuquaiayqmemutgruriasvqnqpqbgryizymfwlxaxjvfgfqruaalyqsriumifymvmtusueiauaryeyvnbmetsacnflbrkfvaeygsfaeqtymfyruarafmsvvayuumrliqeuuiioruncwcycuhwilriiufvqrmmqfragsuvayyiuiaufemaysulteyroxsovoymjueffayquygaimsvrayauquvlfimmiusrerytpbomqwszstluutrriamyurqmsameaifvsqylfageyvuuiyfuonzinetdrktfsdeauqaufmgfuirlaumyvsyfemeriyvsaitrquyjbgismuqiayueymluyrgafiuvrruqeftmsavyaflynuiqumyiemuvaqaveiyyuutrsmygrffsrfalajirlissmaruumuytfeaemqrfyvuiavfgiyuqyaqceasgptnvqegtdbxuvymtfyfrayryaseuaumsuluviqgeiquiafmryxdkyxgeqgtiftvayyaysylievqufqimarimruefrgmuauusoppyjeapqlazzfyvgmsruuuyayuviqsamfmtelariuqiyrafefbepsbwqatqeqaivyaffriuuquaulmsyvaumfysmrgerteyiaauargjresasivammeguquqtlyuufryffiyrymriaavulvhvcqfzrilwhexytztdursyaeaygifarreuvyuquilvtafumqsifmymakbnyollxlxuyflcuruuiyigiaavsaurqqfmuyueyltvyafmmrefsxvkwfquimuervaufsfevuaqlriyaumityramgyyszoomseiqfmravuirquyguiyyurleyamavsatffueywapdadxzdosevmyayisutuuflqsrimrqyafuafmagruyivetlxougzeumtppxaurfqsyeiresvfaamatfyimvygqyuulumirurieobqwpwgrralkotyfyirrrsiaavimmfvuyuyaqusueuqlafgemndjltqsyxueipevsjwiyuimrmretrlufeymqaaaiauuvsgyyivfqufskeiuhktujqeirirvvafasituuurqysaayuqlmmfmeyufygjsjovwawhkagurvimiaqyumayiuurlyqufyrftefmsvesamcpsybtfuafiuvyumruyeamsyiefisuaqyrmtqvraglklsnuntihymzaifuvygsfumueaastulyvmiyqeiurmrfqrayqdqxqnuwhjwlqmmvryeevyiurfsgayaufmrafsquqiayiltuuninkwremcbirsfisuatuuyrmaeyffulymrquvvmqiayeagkwlyurqasymytuimlmvesuiafurfvurayiyqafuegqqopgguquliviiysmaayqfaetmsyufureyvfrmaurlgibpueytfsmmyafareigusraaveuqqufvlmiruyuiystctbppmemyaasrievfiufqlsufayyrgqyuvatuuirmroormpvgjxipxrdhdiqfyugmmuasraelfmvqysvriaitueuyyaufrsksmcgrlqvearsfsyyivmutaaruiryuaqmeumugfiyfzfhggfyasmvuyraqqsrimeiuuyaltfriuyvfeaumjeeitijsuyrnwjudmayyruviragyufmqvmafflyusuatsqreuiieiyvjmritbrjrafmuaiyvyavlmsieyyqtgffaiuesrrmuquuunmjjysxrigyvauqsmuvuqatflmeafemfiyyrrasriuiyujdscxmnbsmeyuooszjlbqrausifvvlauytegfmqrairmuusaufyyimyembhlwpyjnwcgupbplmiaisfiurlrvfyuqrustumeavyfyqmeagayujusikrqygpccmzyyrigsfuuqleammsuiervuutyiraafaqmvfyjzdfrmpeemfxjlwtcmufauuugariuirvtyysvraesqfyamfleyqmixpgqafsufaalvuuqmyrefetuarriqsuyyivmiymgpruegiyluuffqramyseaumivtuyvsfymqaiardleussvsyfxxiqyuvaegfruyiamimrytqyusfuvamfuaielsrbienhajabtuiqvmrfmrafuiqaaygyluayrussifvytmeeuqcfuauaqruiriralffvmmgiyfasetqmvuyuyyesngizfgmdsgeuryriffqyvmsafquauauliyevimautymrkjjarmuutsyvimqlyqeurufimesavmiaaruygffrayrbsupnqtzimistalfyvvmafqyuuguiruureaeyymqasrfzkwqdeyfmlimyiatveagrusuyumaraqsefuuryifvqoqvuvizterfiyuauiguaemivsyrrfayqumqvytsmfaultpmbntuvlrueameyuraymffuymiasyfgviirqqsauanpveemqhzwpmyzyrqrugufsqyyilraemasatfuymuiuifmavevzkbnysyvmaueuylqmufiumgartfraefivyqaisurpxztqbvlptmguqravsqreyefilyiayumfuisyaamurfvumvugkygeusaiqlaemymarusiuavurfymviquyfrtfjfdgzlmthjvayvsuisffrluyvqaeritgmqeurfiuyummayasdiwjxjmlmolhlwneufmruyrtsafuvaemyriuaulsqmiifevyyqgaqxpyfkcwhvjbfuurwxxufyqsafsrrveayeyaifumymuguriiuvqltambioouoyglxavyiufqryfialqavrmuvermtseysayufuguiamevjibrgpgzsnnesiryuiqeaumfuymirmaqflytvuyausfvgerawhhjsdkgjwnkcaocbyfrqyielsfyuugqusrfavvmaeyyuirfmrutaamijjgcfsrmuvfrvqtfguumryaaeuiyfasieaqiyumylrcrivvuisuaytyumsmmgeuyruaflqqerfiyafraqbuvyfaqaytyslmiiufgieayurrvequsmmurafkpqyuayeumysafmiaeuqrvyuimufgtfaruyiqrlsvtximmghwnenmlgfiyvraayeaiuyqtiuvursumafemfqsuyrppmznnwdxzogrrqylyfimevfeuiyiaayvuauusrfmmtsqauedfiphflmquiqtgyrvvfrruafsayamieamuiuyyfseusidaztfqfyyqiyautrryasurvsvmgfuemamaluiieuecwftxraxnwoxkgftvmmuvyiumquaauuylryrsiayrfsefagiqeynvhoidarveneidznihlfavtqiemriquiayfgmuyafsymuurvyaurseyguouvysuqyimmtyueauarffuifrysimaavqrglelqqrcamegtnyyhioaleuvafmgiuafiyylyrqumarrveuaumsyqfsteibphsbpdwszkyutilyevqmymargausuififrymuqeasfvruawzfowtyruugryiaqivefyuiarmvqssmuaffyumealnncopswbevravorrpekufiftmgruriaiqqysuusafuvmauyavyeeylrmcwvhcqfszvhcxbhuvsaryuqslmugayyaqfirfaifiyvmetuemursfwzkceicyisyqyayrmuefqurafumauulvifetimgravsojsxymjalkywniauytyayruauarqmuyviiureffqsmefvmslgxkslvwpcmsyreyuuyruiaiyfvsrtqulimaafuemaqgfvwihvqlihublddlmuayqtyvyailyfremufiurufqmasusgearivxfreyyaqiruaugumutemsvalsiiuamyryffvqmwbvzrucshskayfsftervaamrrquiayygsuuyqmmvliuiueftehzoriqgapnaomlqugraeyaqieuyyifsummfamuyuvrrasqlviftnkzvkrbxrdmigrkmzziaufmavyeqmfuisarlryfysrqiayuevgtmuuffzqydrqreuimiuufvaymmayugssiyefutarqvflyaromgnfkdnvuoirxrdjlyqruifsuveuiftmarlsmmuavqyigaerfyuayafxlspryifueayimuymvsaermvfuglqfqisayratuureurlcujgsjssrltryyaisfimetuvumrufeasvrgqqiyfuuyaalmpwluonvoptrpipawxhveefriifyamuvarysusmufmugyuqlitaeyarqvodezgzzkvtxfdifvnrqasufialymiqerifqvmrsguuymeyfuuvytaarrhhciklgvukjmqmmsuqiffaasyrglrvyuuatyiuaeuveyfridbjiirifopzjhprogxmaegiyvuiurfrfyyaastaymuvrsmuifelqqmuxubmmhazymstcqsruryeitmvqyauuyfymfmaiasluieavfrguowsfyqrkrvnqogliaemqyuauivyffauilvgfrmurryqssyaetumdxasmjcyevqafemyriuurvqymaturfuuaigiylfmysseafuxwaubqlymourvfeyurfasyifursuiqyealmmiaagqtymuvzioizswsamfruiuvlyemyugiqvyrastiuqmrfeaauyfqvyqkymoxlnihxyvruyyreteluirvsgyfmqasmaafuimiuafquzlwnujjyrrfuqtyevylvrseiuaaqfauigmuyuiasmmfferotgkrocxuvpqseuviumfarivussaeyuaqrriyfygymafqemultizltiyrrayyvyqfimruvulfsmaiuamuqauegefsdmpudpefnmwrzhqigfveauiaueyatlfmmsuvqmrysufuyiaryrbknxtufuyuraftymairmurlyiqfvuamqasgyseviemkixfzslzpjofklmtfyisaiufmivulmysueyuavfartmfqyqyraerguvscjttkpdwsrhaiuvaeaqagusiufymetruumfluvavyqimrrfysiyazufzlxesqryvivfaulrfaemqsyauimrtuuiygymafuhqsyrmnsmxfzrfpuofeyyimqavflfiiuaygmusauuamvqsruerrytuhlhxgxuxnztqccuyuafiaumutuglqymfrasairsrqyiueyvmfveroprsqxhkzsjijibdjqefaatffaiuugryveslvaqrmyummyuiusirynggoptmdcnayvrryufiessitluyagvmyafumurfquemiqacxeeptcbdwtcwiraguvtyayusfeuyvrqslmmiarqueigrayamffuiivlkcobfmyystiuquilrfyesuamimagvfavqufruayregyrhlrsfifyeiqumieuauaqsayavyrrmutvufmgykbjqumlyaeifmsruiyquaytfvruarmiyauugevqfspwdivyrymtuifalrmvruigamveafyusuaeqqsfiuywebcfzptcalenwphmonvyrlfsaimsuuyuiaimuqevuaagtyqrrefvyfmrsogbuzlcavojjsaeuqmuaryvslfiyarumertgmuaiivfyqfyumqirmiyutfvivamyseqafeyufumargluuryasbtqxmmhwcqoprbsesruamfafyuvyvarqeumairiyimufqytglurpzmgyslwaufvuyramgyvrrfqmtiueimyyseiulauasfqrqzwzolwquujjztftvruuffaaiyqrgaalmtyuvyeiusrmuysimfeqosxwsvhpwqmtgnqqqlfiyuuvaiqvmygqmesuyauftiraeyfalmsurrfojcenvurayfslvyuaerfqyqmyameigsuiufuatirmwinbfyxcupnecukxaoosqafuayfaymyvgrrlfumiiueqratuuysmievpmqmscffhyasuuvrismqaqeutmyiyvifuaaesgaylyrruffmyezaqfmraaifysuretfileryqsaguuyuvmvmuiypshnlfughkfskiyaruuevysetisgryuymraiufvfmialfqmuqagazkjfrrrayugvysmyalimsquyfmiivuaqeuafuetywazcwbhgyputveriuufeuafaymaguufyrvlymqasimrtsiqyhrompiuvyyutymufuasieqmyaavfqgrfsuialmrernnconyhsbfwbmyjhiwyravafuuyayiqituumgmsifurslevrfmyeqaqhsqhomyaftiaifaervuvmquurayqremfguyuilssygfikfqxtrudsnvbstgifaeyuyrgfstvuaaqimuiyeulafrummqvrysithfkcrkiosjoctxqeuraaviafiuyfqysulfsriuetymrgmmvayuvlrcjxcnzmhupibdzcrisiymaseufyeayurmgtmuaquriafvluvyqfukseasaiuurruavutifyfurmvyqiglmfmayeyqbpvviursyeaatquaafsyymmfluqgiuryruvmiefqjvgnyyfuasglrmsamrtfiyiqevuarfaquuyeivuymfszcrymsguilruafuaefvuisuvyryqqmifyamaetincqhpyktflarueymemmvfyuuyafrfryluiqqrsiuviatgasaebrcytrklzmmadxbdtuivrqlyiasamufyfemmayiuguyreqrauvtfsyfyelqkthdpebjyafvsqruufmyayuuflqyeamvmsriieiruagtnydqqqgbpxrbcigrmuurumsvmaaqgiryfvtyrlusfiyqfeaaeyuibhxdunaohqtrpluuqiuyuiamratemfysrasyfyvumravigeqfxskdqiylmvmsuvataufirumqgeruuaiyyyresffavloqkebeyxsqriqsyeuaemuvsqyfffumirrlaaaguiymtvyucibyichdctsqqvvyauuiyfqufyatraeufsisayelirmrmgumnseyoueeriamugyarflsvsvmuyfutiuryfaiyamqqjzveauyuysitquaimarsrugyrlayifqvmufemfgreqcothpfmlhrreivyuriuuymffvlyifgqqyumssaaaaeutmrwhnylbcgsymnkaymuegreruiaausuyistavmvyfylufqifmqrifwaeshbdhsaxxsymaumqurviyvueyfgyuutasyafqarsmriifelxrlevppepqffqoweemjxltavyqquumiammufigasiusyfrafyyueverreraempgunjmumfsgyrtiuiuuiayymavsvuluarfyfermqqaeacwioghweqnaultpmaueyqiristvavrusiqarmeffyuuaylygfumhbvpbjpwkhessaauvyqrryiimfemymltuafyuqfvruaguiivalsfevyureusiuyisfgayuymivaurlqatqfmmrafxtnvnboghqfexsfirlmyiumeusfafayvqsymfuuugiqrterayvamafqbvugafjvvhtqhuuvsimivyuruefuaylyiftryaaqersfgqmmuahriecphrlkepjygmfyraqqatsarvgyiuueuiuyvesummyfilrafdhfhcesyuymvmgquuafaetrrfqfuyseymiialurivafgoturiyaaamuirfgyvsfuefsmvqayieqruluymwvxzxfzfatqyriqviuayyaeffrmyuvslmusmeugfruiaaxnkzcegxwroovbzcaeamfvsqmyryrfiuutieyuamuaasfilygrvuqaiugbqzimjulaiuuorksgufrqatmyaiiiaflsfummyuvyeeyuuavrqsrllruarvxcsrusvwoikmmivurutmylgaaauseiquyffymyaeusqfvrirmemiursmuuuyulgeaifvysarrqqyaemivrufytfamijtyqhorodqblcbwzidhqrvugueyeuayftaqisqyuiirrfmslvaumfmyarnmjlissovipsomrnjtuiieavaflafvrremafisguyursuqqummyyyrhoasoozofjwcstcauyifvatyiuessyfluqqmervmuuigfamarauyrvzkobrpffuqesuiaauuysrmuviaeyqmrvtylyfamgirlzgmyyscelkwbtqzhkvjsuaqefmfyvatuugeuimyirfiurlyymasaqrvjkiezwybmliyularuitufyrufmmeyquavqgmsisvyfaaerxlqygccnlxjvtwuerrequamvauiqmfsegimryyuilyysvaffuuatsbkrfwruyiqlvauyufayvyffmmmsusatiqgreiearufcrsfspyqcijsuqludyruvmqvsyiqtrafmifagufrauylmyuiaysueennpvpoqhtyygyqsyftmrefumrsyuvvairuiuaauaeqmfilirpagmjvulpbcngnfimtseyammviearyuylufsuayffigvqrquuareuguiseuyvimfayiyamyqumqalgrurtfsuareiufvnrhvdmvfiiirqtfmryesuumymvivysygurufulaaaeaqfaixvalaoksujftyicptrmslqgmiiauefaayyuysmaurfyerquivufvggbeoqejuuiyrugaueyleffiqaymrtvmuyiraavumsqsfsnabatwhyerilqmysurfvuifriarfeygsyqytalauevuuamiqmrjxyaatucodqhvardqrmleqmafafvuuvmqfartysgsmuarriyeiyiuyufwmjnwkbyevmsguyurrivsmeffaialituumfqyuqaryarfmaayqymmfqyyuraufruvfrstiviaelesguiukzgdsreyaueryvlimisveaufgmfyquqauritursaymfxfkkcyvzctxrzbvylfsuqamayrmyuyysriiaeqmuavigeufutvrfqzollsvgusuezuhraiqefmisvmaymtyegrufuqrayuflysiavuukqnquugzlnozwzonlsaaesmeqfugruliataivumfyyuqyavrfauyirsmkewxpulmlevyymiiluuaasrrfmyvrfaygmuteqqiesfuuamwovashfqzndfdww", "grmvsuteqvyfquuuaiirmeayfaymulsifrya"));
    }

}